// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class dg extends Number
    implements Comparable
{

    private double aik;
    private long ail;
    private boolean aim;

    private dg(double d)
    {
        aik = d;
        aim = false;
    }

    private dg(long l)
    {
        ail = l;
        aim = true;
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
        if (mT() && dg1.mT())
        {
            return (new Long(ail)).compareTo(Long.valueOf(dg1.ail));
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
        if (mT())
        {
            return (double)ail;
        } else
        {
            return aik;
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
        return mV();
    }

    public long longValue()
    {
        return mU();
    }

    public boolean mS()
    {
        return !mT();
    }

    public boolean mT()
    {
        return aim;
    }

    public long mU()
    {
        if (mT())
        {
            return ail;
        } else
        {
            return (long)aik;
        }
    }

    public int mV()
    {
        return (int)longValue();
    }

    public short mW()
    {
        return (short)(int)longValue();
    }

    public short shortValue()
    {
        return mW();
    }

    public String toString()
    {
        if (mT())
        {
            return Long.toString(ail);
        } else
        {
            return Double.toString(aik);
        }
    }
}
