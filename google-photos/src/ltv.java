// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ltv extends Number
    implements Comparable
{

    boolean a;
    private double b;
    private long c;

    private ltv(double d)
    {
        b = d;
        a = false;
    }

    private ltv(long l)
    {
        c = l;
        a = true;
    }

    public static ltv a(long l)
    {
        return new ltv(l);
    }

    public static ltv a(Double double1)
    {
        return new ltv(double1.doubleValue());
    }

    public static ltv a(String s)
    {
        ltv ltv1;
        try
        {
            ltv1 = new ltv(Long.parseLong(s));
        }
        catch (NumberFormatException numberformatexception)
        {
            ltv ltv2;
            try
            {
                ltv2 = new ltv(Double.parseDouble(s));
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw new NumberFormatException((new StringBuilder()).append(s).append(" is not a valid TypedNumber").toString());
            }
            return ltv2;
        }
        return ltv1;
    }

    public final int a(ltv ltv1)
    {
        if (a && ltv1.a)
        {
            return (new Long(c)).compareTo(Long.valueOf(ltv1.c));
        } else
        {
            return Double.compare(doubleValue(), ltv1.doubleValue());
        }
    }

    public final byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public final int compareTo(Object obj)
    {
        return a((ltv)obj);
    }

    public final double doubleValue()
    {
        if (a)
        {
            return (double)c;
        } else
        {
            return b;
        }
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof ltv) && a((ltv)obj) == 0;
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
        if (a)
        {
            return c;
        } else
        {
            return (long)b;
        }
    }

    public final short shortValue()
    {
        return (short)(int)longValue();
    }

    public final String toString()
    {
        if (a)
        {
            return Long.toString(c);
        } else
        {
            return Double.toString(b);
        }
    }
}
