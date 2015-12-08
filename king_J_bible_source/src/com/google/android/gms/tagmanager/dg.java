// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class dg extends Number
    implements Comparable
{

    private double aaC;
    private long aaD;
    private boolean aaE;

    private dg(double d)
    {
        aaC = d;
        aaE = false;
    }

    private dg(long l)
    {
        aaD = l;
        aaE = true;
    }

    public static dg a(Double double1)
    {
        return new dg(double1.doubleValue());
    }

    public static dg bW(String s)
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

    public static dg w(long l)
    {
        return new dg(l);
    }

    public int a(dg dg1)
    {
        if (lJ() && dg1.lJ())
        {
            return (new Long(aaD)).compareTo(Long.valueOf(dg1.aaD));
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
        if (lJ())
        {
            return (double)aaD;
        } else
        {
            return aaC;
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
        return lL();
    }

    public boolean lI()
    {
        return !lJ();
    }

    public boolean lJ()
    {
        return aaE;
    }

    public long lK()
    {
        if (lJ())
        {
            return aaD;
        } else
        {
            return (long)aaC;
        }
    }

    public int lL()
    {
        return (int)longValue();
    }

    public short lM()
    {
        return (short)(int)longValue();
    }

    public long longValue()
    {
        return lK();
    }

    public short shortValue()
    {
        return lM();
    }

    public String toString()
    {
        if (lJ())
        {
            return Long.toString(aaD);
        } else
        {
            return Double.toString(aaC);
        }
    }
}
