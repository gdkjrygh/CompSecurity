// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class dh extends Number
    implements Comparable
{

    private double atZ;
    private long aua;
    private boolean aub;

    private dh(double d)
    {
        atZ = d;
        aub = false;
    }

    private dh(long l)
    {
        aua = l;
        aub = true;
    }

    public static dh a(Double double1)
    {
        return new dh(double1.doubleValue());
    }

    public static dh cY(String s)
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
        if (qR() && dh1.qR())
        {
            return (new Long(aua)).compareTo(Long.valueOf(dh1.aua));
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
        if (qR())
        {
            return (double)aua;
        } else
        {
            return atZ;
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
        return qT();
    }

    public long longValue()
    {
        return qS();
    }

    public boolean qQ()
    {
        return !qR();
    }

    public boolean qR()
    {
        return aub;
    }

    public long qS()
    {
        if (qR())
        {
            return aua;
        } else
        {
            return (long)atZ;
        }
    }

    public int qT()
    {
        return (int)longValue();
    }

    public short qU()
    {
        return (short)(int)longValue();
    }

    public short shortValue()
    {
        return qU();
    }

    public String toString()
    {
        if (qR())
        {
            return Long.toString(aua);
        } else
        {
            return Double.toString(atZ);
        }
    }
}
