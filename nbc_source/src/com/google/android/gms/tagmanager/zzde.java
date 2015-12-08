// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class zzde extends Number
    implements Comparable
{

    private double zzaOq;
    private long zzaOr;
    private boolean zzaOs;

    private zzde(double d)
    {
        zzaOq = d;
        zzaOs = false;
    }

    private zzde(long l)
    {
        zzaOr = l;
        zzaOs = true;
    }

    public static zzde zzT(long l)
    {
        return new zzde(l);
    }

    public static zzde zza(Double double1)
    {
        return new zzde(double1.doubleValue());
    }

    public static zzde zzeI(String s)
        throws NumberFormatException
    {
        zzde zzde1;
        try
        {
            zzde1 = new zzde(Long.parseLong(s));
        }
        catch (NumberFormatException numberformatexception)
        {
            zzde zzde2;
            try
            {
                zzde2 = new zzde(Double.parseDouble(s));
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw new NumberFormatException((new StringBuilder()).append(s).append(" is not a valid TypedNumber").toString());
            }
            return zzde2;
        }
        return zzde1;
    }

    public byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public int compareTo(Object obj)
    {
        return zza((zzde)obj);
    }

    public double doubleValue()
    {
        if (zzzG())
        {
            return (double)zzaOr;
        } else
        {
            return zzaOq;
        }
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof zzde) && zza((zzde)obj) == 0;
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
        return zzzI();
    }

    public long longValue()
    {
        return zzzH();
    }

    public short shortValue()
    {
        return zzzJ();
    }

    public String toString()
    {
        if (zzzG())
        {
            return Long.toString(zzaOr);
        } else
        {
            return Double.toString(zzaOq);
        }
    }

    public int zza(zzde zzde1)
    {
        if (zzzG() && zzde1.zzzG())
        {
            return (new Long(zzaOr)).compareTo(Long.valueOf(zzde1.zzaOr));
        } else
        {
            return Double.compare(doubleValue(), zzde1.doubleValue());
        }
    }

    public boolean zzzF()
    {
        return !zzzG();
    }

    public boolean zzzG()
    {
        return zzaOs;
    }

    public long zzzH()
    {
        if (zzzG())
        {
            return zzaOr;
        } else
        {
            return (long)zzaOq;
        }
    }

    public int zzzI()
    {
        return (int)longValue();
    }

    public short zzzJ()
    {
        return (short)(int)longValue();
    }
}
