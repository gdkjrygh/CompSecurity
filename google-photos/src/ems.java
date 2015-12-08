// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class ems
{

    public final double a;
    public final double b;

    private ems(double d, double d1)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (Math.abs(d) <= 90D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, Double.valueOf(d));
        if (Math.abs(d1) <= 180D)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, Double.valueOf(d1));
        a = d;
        b = d1;
    }

    public static ems a(double d, double d1)
    {
        return new ems(d, d1);
    }

    public static ems a(int i, int j)
    {
        return new ems((double)i / 10000000D, (double)j / 10000000D);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ems)
        {
            if (Math.abs(a - ((ems) (obj = (ems)obj)).a) <= 9.9999999999999995E-07D && Math.abs(b - ((ems) (obj)).b) <= 9.9999999999999995E-07D)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return toString().hashCode();
    }

    public final String toString()
    {
        return String.format(Locale.US, "%.6f, %.6f", new Object[] {
            Double.valueOf(a), Double.valueOf(b)
        });
    }
}
