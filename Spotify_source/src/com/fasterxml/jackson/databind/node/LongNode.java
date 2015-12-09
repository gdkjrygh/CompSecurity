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

public class LongNode extends NumericNode
{

    protected final long _value;

    public LongNode(long l)
    {
        _value = l;
    }

    public static LongNode valueOf(long l)
    {
        return new LongNode(l);
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
            if (obj instanceof LongNode)
            {
                if (((LongNode)obj)._value != _value)
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
        return (int)_value ^ (int)(_value >> 32);
    }

    public int intValue()
    {
        return (int)_value;
    }

    public long longValue()
    {
        return _value;
    }

    public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
    {
        return com.fasterxml.jackson.core.JsonParser.NumberType.LONG;
    }

    public Number numberValue()
    {
        return Long.valueOf(_value);
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeNumber(_value);
    }
}
