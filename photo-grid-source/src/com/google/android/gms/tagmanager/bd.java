// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


final class bd extends Number
    implements Comparable
{

    private double a;
    private long b;
    private boolean c;

    private bd()
    {
        b = 0L;
        c = true;
    }

    private int a(bd bd1)
    {
        if (c && bd1.c)
        {
            return (new Long(b)).compareTo(Long.valueOf(bd1.b));
        } else
        {
            return Double.compare(doubleValue(), bd1.doubleValue());
        }
    }

    public static bd a()
    {
        return new bd();
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
        return a((bd)obj);
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
        return (obj instanceof bd) && a((bd)obj) == 0;
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
