// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


final class ck extends Number
    implements Comparable
{

    private double a;
    private long b;
    private boolean c;

    private ck(double d)
    {
        a = d;
        c = false;
    }

    private ck(long l)
    {
        b = l;
        c = true;
    }

    public static ck a(long l)
    {
        return new ck(l);
    }

    public static ck a(Double double1)
    {
        return new ck(double1.doubleValue());
    }

    public static ck a(String s)
        throws NumberFormatException
    {
        ck ck1;
        try
        {
            ck1 = new ck(Long.parseLong(s));
        }
        catch (NumberFormatException numberformatexception)
        {
            ck ck2;
            try
            {
                ck2 = new ck(Double.parseDouble(s));
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw new NumberFormatException((new StringBuilder()).append(s).append(" is not a valid TypedNumber").toString());
            }
            return ck2;
        }
        return ck1;
    }

    public final int a(ck ck1)
    {
        if (c && ck1.c)
        {
            return (new Long(b)).compareTo(Long.valueOf(ck1.b));
        } else
        {
            return Double.compare(doubleValue(), ck1.doubleValue());
        }
    }

    public final boolean a()
    {
        return !c;
    }

    public final boolean b()
    {
        return c;
    }

    public final byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public final int compareTo(Object obj)
    {
        return a((ck)obj);
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
        return (obj instanceof ck) && a((ck)obj) == 0;
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
