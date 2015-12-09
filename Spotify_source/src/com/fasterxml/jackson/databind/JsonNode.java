// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.EmptyIterator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

public abstract class JsonNode
    implements TreeNode, Iterable
{

    public JsonNode()
    {
    }

    public int asInt()
    {
        return asInt(0);
    }

    public int asInt(int i)
    {
        return i;
    }

    public long asLong()
    {
        return asLong(0L);
    }

    public long asLong(long l)
    {
        return l;
    }

    public abstract String asText();

    public BigInteger bigIntegerValue()
    {
        return BigInteger.ZERO;
    }

    public byte[] binaryValue()
    {
        return null;
    }

    public BigDecimal decimalValue()
    {
        return BigDecimal.ZERO;
    }

    public double doubleValue()
    {
        return 0.0D;
    }

    public Iterator elements()
    {
        return EmptyIterator.instance();
    }

    public Iterator fields()
    {
        return EmptyIterator.instance();
    }

    public abstract JsonNode get(int i);

    public JsonNode get(String s)
    {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public boolean has(String s)
    {
        return get(s) != null;
    }

    public int intValue()
    {
        return 0;
    }

    public final boolean isArray()
    {
        return getNodeType() == JsonNodeType.ARRAY;
    }

    public final boolean isBinary()
    {
        return getNodeType() == JsonNodeType.BINARY;
    }

    public final boolean isMissingNode()
    {
        return getNodeType() == JsonNodeType.MISSING;
    }

    public final boolean isNull()
    {
        return getNodeType() == JsonNodeType.NULL;
    }

    public final boolean isNumber()
    {
        return getNodeType() == JsonNodeType.NUMBER;
    }

    public final boolean isObject()
    {
        return getNodeType() == JsonNodeType.OBJECT;
    }

    public final boolean isPojo()
    {
        return getNodeType() == JsonNodeType.POJO;
    }

    public final boolean isTextual()
    {
        return getNodeType() == JsonNodeType.STRING;
    }

    public final Iterator iterator()
    {
        return elements();
    }

    public long longValue()
    {
        return 0L;
    }

    public Number numberValue()
    {
        return null;
    }

    public int size()
    {
        return 0;
    }

    public String textValue()
    {
        return null;
    }

    public abstract String toString();
}
