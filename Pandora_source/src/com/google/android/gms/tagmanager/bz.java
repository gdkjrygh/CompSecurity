// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class bz extends Number
    implements Comparable
{

    private double a;
    private long b;
    private boolean c;

    private bz(double d1)
    {
        a = d1;
        c = false;
    }

    private bz(long l)
    {
        b = l;
        c = true;
    }

    public static bz a(long l)
    {
        return new bz(l);
    }

    public static bz a(Double double1)
    {
        return new bz(double1.doubleValue());
    }

    public static bz a(String s)
        throws NumberFormatException
    {
        bz bz1;
        try
        {
            bz1 = new bz(Long.parseLong(s));
        }
        catch (NumberFormatException numberformatexception)
        {
            bz bz2;
            try
            {
                bz2 = new bz(Double.parseDouble(s));
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw new NumberFormatException((new StringBuilder()).append(s).append(" is not a valid TypedNumber").toString());
            }
            return bz2;
        }
        return bz1;
    }

    public int a(bz bz1)
    {
        if (b() && bz1.b())
        {
            return (new Long(b)).compareTo(Long.valueOf(bz1.b));
        } else
        {
            return Double.compare(doubleValue(), bz1.doubleValue());
        }
    }

    public boolean a()
    {
        return !b();
    }

    public boolean b()
    {
        return c;
    }

    public byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public long c()
    {
        if (b())
        {
            return b;
        } else
        {
            return (long)a;
        }
    }

    public int compareTo(Object obj)
    {
        return a((bz)obj);
    }

    public int d()
    {
        return (int)longValue();
    }

    public double doubleValue()
    {
        if (b())
        {
            return (double)b;
        } else
        {
            return a;
        }
    }

    public short e()
    {
        return (short)(int)longValue();
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof bz) && a((bz)obj) == 0;
    }

    public float floatValue()
    {
        return (float)doubleValue();
    }

    public int hashCode()
    {
        return (new Long(longValue())).hashCode();
    }

    public int intValue()
    {
        return d();
    }

    public long longValue()
    {
        return c();
    }

    public short shortValue()
    {
        return e();
    }

    public String toString()
    {
        if (b())
        {
            return Long.toString(b);
        } else
        {
            return Double.toString(a);
        }
    }
}
