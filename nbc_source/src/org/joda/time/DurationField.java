// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            DurationFieldType

public abstract class DurationField
    implements Comparable
{

    public DurationField()
    {
    }

    public abstract long add(long l, int i);

    public abstract long add(long l, long l1);

    public abstract int getDifference(long l, long l1);

    public abstract long getDifferenceAsLong(long l, long l1);

    public abstract long getMillis(int i);

    public abstract long getMillis(int i, long l);

    public abstract long getMillis(long l);

    public abstract long getMillis(long l, long l1);

    public abstract String getName();

    public abstract DurationFieldType getType();

    public abstract long getUnitMillis();

    public abstract int getValue(long l);

    public abstract int getValue(long l, long l1);

    public abstract long getValueAsLong(long l);

    public abstract long getValueAsLong(long l, long l1);

    public abstract boolean isPrecise();

    public abstract boolean isSupported();

    public long subtract(long l, int i)
    {
        if (i == 0x80000000)
        {
            return subtract(l, i);
        } else
        {
            return add(l, -i);
        }
    }

    public long subtract(long l, long l1)
    {
        if (l1 == 0x8000000000000000L)
        {
            throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
        } else
        {
            return add(l, -l1);
        }
    }

    public abstract String toString();
}
