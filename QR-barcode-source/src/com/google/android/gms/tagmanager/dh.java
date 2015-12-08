// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class dh extends Number
    implements Comparable
{

    private double arR;
    private long arS;
    private boolean arT;

    private dh(double d)
    {
        arR = d;
        arT = false;
    }

    private dh(long l)
    {
        arS = l;
        arT = true;
    }

    public static dh a(Double double1)
    {
        return new dh(double1.doubleValue());
    }

    public static dh cW(String s)
        throws NumberFormatException
    {
        dh dh1;
        try
        {
            dh1 = new dh(Long.parseLong(s));
        }
        catch (NumberFormatException numberformatexception)
        {
            dh dh2;
            try
            {
                dh2 = new dh(Double.parseDouble(s));
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw new NumberFormatException((new StringBuilder()).append(s).append(" is not a valid TypedNumber").toString());
            }
            return dh2;
        }
        return dh1;
    }

    public static dh z(long l)
    {
        return new dh(l);
    }

    public int a(dh dh1)
    {
        if (pA() && dh1.pA())
        {
            return (new Long(arS)).compareTo(Long.valueOf(dh1.arS));
        } else
        {
            return Double.compare(doubleValue(), dh1.doubleValue());
        }
    }

    public byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public int compareTo(Object obj)
    {
        return a((dh)obj);
    }

    public double doubleValue()
    {
        if (pA())
        {
            return (double)arS;
        } else
        {
            return arR;
        }
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof dh) && a((dh)obj) == 0;
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
        return pC();
    }

    public long longValue()
    {
        return pB();
    }

    public boolean pA()
    {
        return arT;
    }

    public long pB()
    {
        if (pA())
        {
            return arS;
        } else
        {
            return (long)arR;
        }
    }

    public int pC()
    {
        return (int)longValue();
    }

    public short pD()
    {
        return (short)(int)longValue();
    }

    public boolean pz()
    {
        return !pA();
    }

    public short shortValue()
    {
        return pD();
    }

    public String toString()
    {
        if (pA())
        {
            return Long.toString(arS);
        } else
        {
            return Double.toString(arR);
        }
    }
}
