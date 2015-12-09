// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            NumericNode

public class IntNode extends NumericNode
{

    private static final IntNode CANONICALS[];
    protected final int _value;

    public IntNode(int i)
    {
        _value = i;
    }

    public static IntNode valueOf(int i)
    {
        if (i > 10 || i < -1)
        {
            return new IntNode(i);
        } else
        {
            return CANONICALS[i + 1];
        }
    }

    public String asText()
    {
        return NumberOutput.toString(_value);
    }

    public JsonToken asToken()
    {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public BigInteger bigIntegerValue()
    {
        return BigInteger.valueOf(_value);
    }

    public BigDecimal decimalValue()
    {
        return BigDecimal.valueOf(_value);
    }

    public double doubleValue()
    {
        return (double)_value;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj instanceof IntNode)
            {
                if (((IntNode)obj)._value != _value)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return _value;
    }

    public int intValue()
    {
        return _value;
    }

    public long longValue()
    {
        return (long)_value;
    }

    public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
    {
        return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
    }

    public Number numberValue()
    {
        return Integer.valueOf(_value);
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeNumber(_value);
    }

    static 
    {
        CANONICALS = new IntNode[12];
        for (int i = 0; i < 12; i++)
        {
            CANONICALS[i] = new IntNode(i - 1);
        }

    }
}
