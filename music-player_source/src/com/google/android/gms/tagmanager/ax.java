// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


final class ax extends Number
    implements Comparable
{

    private double a;
    private long b;
    private boolean c;

    private ax()
    {
        b = 0L;
        c = true;
    }

    private int a(ax ax1)
    {
        if (c && ax1.c)
        {
            return (new Long(b)).compareTo(Long.valueOf(ax1.b));
        } else
        {
            return Double.compare(doubleValue(), ax1.doubleValue());
        }
    }

    public static ax a()
    {
        return new ax();
    }

    public final boolean b()
    {
        return !c;
    }

    public final byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public final boolean c()
    {
        return c;
    }

    public final int compareTo(Object obj)
    {
        return a((ax)obj);
    }

    public final double doubleValue()
    {
        if (c)
        {
            return (double)b;
        } else
        {
            return a;
        }
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof ax) && a((ax)obj) == 0;
    }

    public final float floatValue()
    {
        return (float)doubleValue();
    }

    public final int hashCode()
    {
        return (new Long(longValue())).hashCode();
    }

    public final int intValue()
    {
        return (int)longValue();
    }

    public final long longValue()
    {
        if (c)
        {
            return b;
        } else
        {
            return (long)a;
        }
    }

    public final short shortValue()
    {
        return (short)(int)longValue();
    }

    public final String toString()
    {
        if (c)
        {
            return Long.toString(b);
        } else
        {
            return Double.toString(a);
        }
    }
}
