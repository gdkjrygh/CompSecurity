// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class dg extends Number
    implements Comparable
{

    private double aih;
    private long aii;
    private boolean aij;

    private dg(double d)
    {
        aih = d;
        aij = false;
    }

    private dg(long l)
    {
        aii = l;
        aij = true;
    }

    public static dg a(Double double1)
    {
        return new dg(double1.doubleValue());
    }

    public static dg co(String s)
        throws NumberFormatException
    {
        dg dg1;
        try
        {
            dg1 = new dg(Long.parseLong(s));
        }
        catch (NumberFormatException numberformatexception)
        {
            dg dg2;
            try
            {
                dg2 = new dg(Double.parseDouble(s));
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw new NumberFormatException((new StringBuilder()).append(s).append(" is not a valid TypedNumber").toString());
            }
            return dg2;
        }
        return dg1;
    }

    public static dg z(long l)
    {
        return new dg(l);
    }

    public int a(dg dg1)
    {
        if (mO() && dg1.mO())
        {
            return (new Long(aii)).compareTo(Long.valueOf(dg1.aii));
        } else
        {
            return Double.compare(doubleValue(), dg1.doubleValue());
        }
    }

    public byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public int compareTo(Object obj)
    {
        return a((dg)obj);
    }

    public double doubleValue()
    {
        if (mO())
        {
            return (double)aii;
        } else
        {
            return aih;
        }
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof dg) && a((dg)obj) == 0;
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
        return mQ();
    }

    public long longValue()
    {
        return mP();
    }

    public boolean mN()
    {
        return !mO();
    }

    public boolean mO()
    {
        return aij;
    }

    public long mP()
    {
        if (mO())
        {
            return aii;
        } else
        {
            return (long)aih;
        }
    }

    public int mQ()
    {
        return (int)longValue();
    }

    public short mR()
    {
        return (short)(int)longValue();
    }

    public short shortValue()
    {
        return mR();
    }

    public String toString()
    {
        if (mO())
        {
            return Long.toString(aii);
        } else
        {
            return Double.toString(aih);
        }
    }
}
