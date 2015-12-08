// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.mutable;


// Referenced classes of package org.apache.commons.lang3.mutable:
//            Mutable

public class MutableDouble extends Number
    implements Comparable, Mutable
{

    private static final long serialVersionUID = 0x5e9a330cL;
    private double value;

    public MutableDouble()
    {
    }

    public MutableDouble(double d)
    {
        value = d;
    }

    public MutableDouble(Number number)
    {
        value = number.doubleValue();
    }

    public MutableDouble(String s)
        throws NumberFormatException
    {
        value = Double.parseDouble(s);
    }

    public void add(double d)
    {
        value = value + d;
    }

    public void add(Number number)
    {
        value = value + number.doubleValue();
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((MutableDouble)obj);
    }

    public int compareTo(MutableDouble mutabledouble)
    {
        double d = mutabledouble.value;
        return Double.compare(value, d);
    }

    public void decrement()
    {
        value = value - 1.0D;
    }

    public double doubleValue()
    {
        return value;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof MutableDouble) && Double.doubleToLongBits(((MutableDouble)obj).value) == Double.doubleToLongBits(value);
    }

    public float floatValue()
    {
        return (float)value;
    }

    public Double getValue()
    {
        return Double.valueOf(value);
    }

    public volatile Object getValue()
    {
        return getValue();
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(value);
        return (int)(l >>> 32 ^ l);
    }

    public void increment()
    {
        value = value + 1.0D;
    }

    public int intValue()
    {
        return (int)value;
    }

    public boolean isInfinite()
    {
        return Double.isInfinite(value);
    }

    public boolean isNaN()
    {
        return Double.isNaN(value);
    }

    public long longValue()
    {
        return (long)value;
    }

    public void setValue(double d)
    {
        value = d;
    }

    public void setValue(Number number)
    {
        value = number.doubleValue();
    }

    public volatile void setValue(Object obj)
    {
        setValue((Number)obj);
    }

    public void subtract(double d)
    {
        value = value - d;
    }

    public void subtract(Number number)
    {
        value = value - number.doubleValue();
    }

    public Double toDouble()
    {
        return Double.valueOf(doubleValue());
    }

    public String toString()
    {
        return String.valueOf(value);
    }
}
