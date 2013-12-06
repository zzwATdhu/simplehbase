package com.alipay.simplehbase.hql.node.unary;

import org.junit.Test;

import com.alipay.simplehbase.hql.HQLNode;
import com.alipay.simplehbase.hql.node.TestHQL;

public class Test_IsNull extends TestHQL {

    @Test
    public void test_0() {
        HQLNode hqlNode = findStatementHQLNode("test_isNull");
        hqlNode.applyParaMap(para, sb, context);
        assertEqualHQL("allen", sb.toString());
    }

    @Test
    public void test_1() {
        HQLNode hqlNode = findStatementHQLNode("test_isNull");
        para.put("c", null);
        hqlNode.applyParaMap(para, sb, context);
        assertEqualHQL("allen  love dandan", sb.toString());
    }

    @Test
    public void test_2() {
        HQLNode hqlNode = findStatementHQLNode("test_isNull");
        para.put("c", "d");
        hqlNode.applyParaMap(para, sb, context);
        assertEqualHQL("allen", sb.toString());
    }

}