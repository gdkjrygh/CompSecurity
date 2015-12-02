// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode

public abstract class NumericNode extends ValueNode
{

    protected NumericNode()
    {
    }

    public double asDouble()
    {
        return doubleValue();
    }

    public double asDouble(double d)
    {
        return doubleValue();
    }

    public int asInt()
    {
        return intValue();
    }

    public int asInt(int i)
    {
        return intValue();
    }

    public long asLong()
    {
        return longValue();
    }

    public long asLong(long l)
    {
        return longValue();
    }

    public abstract String asText();

    public abstract BigInteger bigIntegerValue();

    public abstract boolean canConvertToInt();

    public abstract boolean canConvertToLong();

    public abstract BigDecimal decimalValue();

    public abstract double doubleValue();

    public abstract int intValue();

    public final boolean isNumber()
    {
        return true;
    }

    public abstract long longValue();

    public abstract com.fasterxml.jackson.core.JsonParser.NumberType numberType();

    public abstract Number numberValue();
}
