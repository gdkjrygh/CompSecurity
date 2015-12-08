// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.mutable;


// Referenced classes of package org.apache.commons.lang3.mutable:
//            Mutable

public class MutableLong extends Number
    implements Comparable, Mutable
{

    private static final long serialVersionUID = 0xeaa4a2677L;
    private long value;

    public MutableLong()
    {
    }

    public MutableLong(long l)
    {
        value = l;
    }

    public MutableLong(Number number)
    {
        value = number.longValue();
    }

    public MutableLong(String s)
        throws NumberFormatException
    {
        value = Long.parseLong(s);
    }

    public void add(long l)
    {
        value = value + l;
    }

    public void add(Number number)
    {
        value = value + number.longValue();
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((MutableLong)obj);
    }

    public int compareTo(MutableLong mutablelong)
    {
        long l = mutablelong.value;
        if (value < l)
        {
            return -1;
        }
        return value != l ? 1 : 0;
    }

    public void decrement()
    {
        value = value - 1L;
    }

    public double doubleValue()
    {
        return (double)value;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof MutableLong)
        {
            flag = flag1;
            if (value == ((MutableLong)obj).longValue())
            {
                flag = true;
            }
        }
        return flag;
    }

    public float floatValue()
    {
        return (float)value;
    }

    public Long getValue()
    {
        return Long.valueOf(value);
    }

    public volatile Object getValue()
    {
        return getValue();
    }

    public int hashCode()
    {
        return (int)(value ^ value >>> 32);
    }

    public void increment()
    {
        value = value + 1L;
    }

    public int intValue()
    {
        return (int)value;
    }

    public long longValue()
    {
        return value;
    }

    public void setValue(long l)
    {
        value = l;
    }

    public void setValue(Number number)
    {
        value = number.longValue();
    }

    public volatile void setValue(Object obj)
    {
        setValue((Number)obj);
    }

    public void subtract(long l)
    {
        value = value - l;
    }

    public void subtract(Number number)
    {
        value = value - number.longValue();
    }

    public Long toLong()
    {
        return Long.valueOf(longValue());
    }

    public String toString()
    {
        return String.valueOf(value);
    }
}
