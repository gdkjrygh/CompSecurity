// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.bo.g;

public final class i
{

    public final double a;
    public final double b;

    public i(double d1, double d2)
    {
        a = d1;
        b = d2;
    }

    public static double a(double d1, double d2)
    {
        double d3 = d2 - d1;
        if (d3 >= 0.0D)
        {
            return d3;
        } else
        {
            return (d2 + 3.1415926535897931D) - (d1 - 3.1415926535897931D);
        }
    }

    public static double a(int j)
    {
        return ((double)g.a(j) / 536870912D) * 3.1415926535897931D;
    }

    public static i a()
    {
        return new i(-3.1415926535897931D, 3.1415926535897931D);
    }

    public final boolean a(double d1)
    {
        if (!d()) goto _L2; else goto _L1
_L1:
        if (d1 < a && d1 > b || c()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (d1 < a || d1 > b)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final boolean b()
    {
        return b - a == 6.2831853071795862D;
    }

    public final boolean c()
    {
        return a - b == 6.2831853071795862D;
    }

    public final boolean d()
    {
        return a > b;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof i)
        {
            obj = (i)obj;
            flag = flag1;
            if (a == ((i) (obj)).a)
            {
                flag = flag1;
                if (b == ((i) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        long l = (629L + Double.doubleToLongBits(a)) * 37L + Double.doubleToLongBits(b);
        return (int)(l ^ l >>> 32);
    }

    public final String toString()
    {
        double d1 = a;
        double d2 = b;
        return (new StringBuilder(52)).append("[").append(d1).append(", ").append(d2).append("]").toString();
    }
}
