// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            NumericNode

public final class BigIntegerNode extends NumericNode
{

    private static final BigInteger MAX_INTEGER = BigInteger.valueOf(0x7fffffffL);
    private static final BigInteger MAX_LONG = BigInteger.valueOf(0x7fffffffffffffffL);
    private static final BigInteger MIN_INTEGER = BigInteger.valueOf(0xffffffff80000000L);
    private static final BigInteger MIN_LONG = BigInteger.valueOf(0x8000000000000000L);
    protected final BigInteger _value;

    public BigIntegerNode(BigInteger biginteger)
    {
        _value = biginteger;
    }

    public static BigIntegerNode valueOf(BigInteger biginteger)
    {
        return new BigIntegerNode(biginteger);
    }

    public boolean asBoolean(boolean flag)
    {
        return !BigInteger.ZERO.equals(_value);
    }

    public String asText()
    {
        return _value.toString();
    }

    public JsonToken asToken()
    {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public BigInteger bigIntegerValue()
    {
        return _value;
    }

    public boolean canConvertToInt()
    {
        return _value.compareTo(MIN_INTEGER) >= 0 && _value.compareTo(MAX_INTEGER) <= 0;
    }

    public boolean canConvertToLong()
    {
        return _value.compareTo(MIN_LONG) >= 0 && _value.compareTo(MAX_LONG) <= 0;
    }

    public BigDecimal decimalValue()
    {
        return new BigDecimal(_value);
    }

    public double doubleValue()
    {
        return _value.doubleValue();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj.getClass() == getClass())
                {
                    return ((BigIntegerNode)obj)._value.equals(_value);
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return _value.hashCode();
    }

    public int intValue()
    {
        return _value.intValue();
    }

    public boolean isBigInteger()
    {
        return true;
    }

    public boolean isIntegralNumber()
    {
        return true;
    }

    public long longValue()
    {
        return _value.longValue();
    }

    public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
    {
        return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
    }

    public Number numberValue()
    {
        return _value;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeNumber(_value);
    }

}
