// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.mutable;


// Referenced classes of package org.apache.commons.lang3.mutable:
//            Mutable

public class MutableShort extends Number
    implements Comparable, Mutable
{

    private static final long serialVersionUID = 0xffffffff80b267c1L;
    private short value;

    public MutableShort()
    {
    }

    public MutableShort(Number number)
    {
        value = number.shortValue();
    }

    public MutableShort(String s)
        throws NumberFormatException
    {
        value = Short.parseShort(s);
    }

    public MutableShort(short word0)
    {
        value = word0;
    }

    public void add(Number number)
    {
        value = (short)(value + number.shortValue());
    }

    public void add(short word0)
    {
        value = (short)(value + word0);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((MutableShort)obj);
    }

    public int compareTo(MutableShort mutableshort)
    {
        short word0 = mutableshort.value;
        if (value < word0)
        {
            return -1;
        }
        return value != word0 ? 1 : 0;
    }

    public void decrement()
    {
        value = (short)(value - 1);
    }

    public double doubleValue()
    {
        return (double)value;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof MutableShort)
        {
            flag = flag1;
            if (value == ((MutableShort)obj).shortValue())
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

    public volatile Object getValue()
    {
        return getValue();
    }

    public Short getValue()
    {
        return Short.valueOf(value);
    }

    public int hashCode()
    {
        return value;
    }

    public void increment()
    {
        value = (short)(value + 1);
    }

    public int intValue()
    {
        return value;
    }

    public long longValue()
    {
        return (long)value;
    }

    public void setValue(Number number)
    {
        value = number.shortValue();
    }

    public volatile void setValue(Object obj)
    {
        setValue((Number)obj);
    }

    public void setValue(short word0)
    {
        value = word0;
    }

    public short shortValue()
    {
        return value;
    }

    public void subtract(Number number)
    {
        value = (short)(value - number.shortValue());
    }

    public void subtract(short word0)
    {
        value = (short)(value - word0);
    }

    public Short toShort()
    {
        return Short.valueOf(shortValue());
    }

    public String toString()
    {
        return String.valueOf(value);
    }
}
