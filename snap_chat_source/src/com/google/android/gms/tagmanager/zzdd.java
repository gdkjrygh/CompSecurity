// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class zzdd extends Number
    implements Comparable
{

    private double zzaBi;
    private long zzaBj;
    private boolean zzaBk;

    private zzdd(double d)
    {
        zzaBi = d;
        zzaBk = false;
    }

    private zzdd(long l)
    {
        zzaBj = l;
        zzaBk = true;
    }

    public static zzdd zzI(long l)
    {
        return new zzdd(l);
    }

    public static zzdd zza(Double double1)
    {
        return new zzdd(double1.doubleValue());
    }

    public static zzdd zzdn(String s)
    {
        zzdd zzdd1;
        try
        {
            zzdd1 = new zzdd(Long.parseLong(s));
        }
        catch (NumberFormatException numberformatexception)
        {
            zzdd zzdd2;
            try
            {
                zzdd2 = new zzdd(Double.parseDouble(s));
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw new NumberFormatException((new StringBuilder()).append(s).append(" is not a valid TypedNumber").toString());
            }
            return zzdd2;
        }
        return zzdd1;
    }

    public byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public int compareTo(Object obj)
    {
        return zza((zzdd)obj);
    }

    public double doubleValue()
    {
        if (zztV())
        {
            return (double)zzaBj;
        } else
        {
            return zzaBi;
        }
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof zzdd) && zza((zzdd)obj) == 0;
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
        return zztX();
    }

    public long longValue()
    {
        return zztW();
    }

    public short shortValue()
    {
        return zztY();
    }

    public String toString()
    {
        if (zztV())
        {
            return Long.toString(zzaBj);
        } else
        {
            return Double.toString(zzaBi);
        }
    }

    public int zza(zzdd zzdd1)
    {
        if (zztV() && zzdd1.zztV())
        {
            return (new Long(zzaBj)).compareTo(Long.valueOf(zzdd1.zzaBj));
        } else
        {
            return Double.compare(doubleValue(), zzdd1.doubleValue());
        }
    }

    public boolean zztU()
    {
        return !zztV();
    }

    public boolean zztV()
    {
        return zzaBk;
    }

    public long zztW()
    {
        if (zztV())
        {
            return zzaBj;
        } else
        {
            return (long)zzaBi;
        }
    }

    public int zztX()
    {
        return (int)longValue();
    }

    public short zztY()
    {
        return (short)(int)longValue();
    }
}
