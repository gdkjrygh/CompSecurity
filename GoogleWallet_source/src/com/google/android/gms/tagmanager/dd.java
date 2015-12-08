// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


final class dd extends Number
    implements Comparable
{

    private double aQo;
    private long aQp;
    private boolean aQq;

    private dd(long l)
    {
        aQp = l;
        aQq = true;
    }

    public static dd D(long l)
    {
        return new dd(l);
    }

    private int a(dd dd1)
    {
        if (ub() && dd1.ub())
        {
            return (new Long(aQp)).compareTo(Long.valueOf(dd1.aQp));
        } else
        {
            return Double.compare(doubleValue(), dd1.doubleValue());
        }
    }

    private long uc()
    {
        if (ub())
        {
            return aQp;
        } else
        {
            return (long)aQo;
        }
    }

    private int ud()
    {
        return (int)longValue();
    }

    private short ue()
    {
        return (short)(int)longValue();
    }

    public final byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public final int compareTo(Object obj)
    {
        return a((dd)obj);
    }

    public final double doubleValue()
    {
        if (ub())
        {
            return (double)aQp;
        } else
        {
            return aQo;
        }
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof dd) && a((dd)obj) == 0;
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
        return ud();
    }

    public final long longValue()
    {
        return uc();
    }

    public final short shortValue()
    {
        return ue();
    }

    public final String toString()
    {
        if (ub())
        {
            return Long.toString(aQp);
        } else
        {
            return Double.toString(aQo);
        }
    }

    public final boolean ua()
    {
        return !ub();
    }

    public final boolean ub()
    {
        return aQq;
    }
}
