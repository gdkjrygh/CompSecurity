// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ArrayNode, BinaryNode, BooleanNode, NullNode, 
//            DoubleNode, IntNode, LongNode, DecimalNode, 
//            BigIntegerNode, ObjectNode, POJONode, TextNode, 
//            NumericNode, ValueNode

public class JsonNodeFactory
    implements Serializable
{

    private static final JsonNodeFactory decimalsAsIs = new JsonNodeFactory(true);
    private static final JsonNodeFactory decimalsNormalized;
    public static final JsonNodeFactory instance;
    private final boolean _cfgBigDecimalExact;

    protected JsonNodeFactory()
    {
        this(false);
    }

    public JsonNodeFactory(boolean flag)
    {
        _cfgBigDecimalExact = flag;
    }

    protected boolean _inIntRange(long l)
    {
        return (long)(int)l == l;
    }

    public ArrayNode arrayNode()
    {
        return new ArrayNode(this);
    }

    public BinaryNode binaryNode(byte abyte0[])
    {
        return BinaryNode.valueOf(abyte0);
    }

    public BooleanNode booleanNode(boolean flag)
    {
        if (flag)
        {
            return BooleanNode.getTrue();
        } else
        {
            return BooleanNode.getFalse();
        }
    }

    public NullNode nullNode()
    {
        return NullNode.getInstance();
    }

    public NumericNode numberNode(double d)
    {
        return DoubleNode.valueOf(d);
    }

    public NumericNode numberNode(int i)
    {
        return IntNode.valueOf(i);
    }

    public NumericNode numberNode(long l)
    {
        if (_inIntRange(l))
        {
            return IntNode.valueOf((int)l);
        } else
        {
            return LongNode.valueOf(l);
        }
    }

    public NumericNode numberNode(BigDecimal bigdecimal)
    {
        if (_cfgBigDecimalExact)
        {
            return DecimalNode.valueOf(bigdecimal);
        }
        if (bigdecimal.compareTo(BigDecimal.ZERO) == 0)
        {
            return DecimalNode.ZERO;
        } else
        {
            return DecimalNode.valueOf(bigdecimal.stripTrailingZeros());
        }
    }

    public NumericNode numberNode(BigInteger biginteger)
    {
        return BigIntegerNode.valueOf(biginteger);
    }

    public ObjectNode objectNode()
    {
        return new ObjectNode(this);
    }

    public ValueNode pojoNode(Object obj)
    {
        return new POJONode(obj);
    }

    public TextNode textNode(String s)
    {
        return TextNode.valueOf(s);
    }

    static 
    {
        decimalsNormalized = new JsonNodeFactory(false);
        instance = decimalsNormalized;
    }
}
