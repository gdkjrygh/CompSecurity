// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.cq.s;
import java.util.Formatter;
import java.util.regex.Pattern;

public final class y
{

    private static final Pattern d = Pattern.compile(",");
    private final double a;
    private final double b;
    private final int c;

    public y(double d1, double d2)
    {
        a = d1;
        b = d2;
        long l = (17L + Double.doubleToRawLongBits(d1)) * 37L + Double.doubleToRawLongBits(d2);
        c = (int)(l ^ l >>> 32);
    }

    public final a a()
    {
        a a1 = new a(s.a);
        a1.a(1, (int)Math.round(a * 1000000D));
        a1.a(2, (int)Math.round(b * 1000000D));
        return a1;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (y)obj;
            if (Double.doubleToRawLongBits(a) != Double.doubleToRawLongBits(((y) (obj)).a) || Double.doubleToRawLongBits(b) != Double.doubleToRawLongBits(((y) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return c;
    }

    public final String toString()
    {
        return (new Formatter(null)).format("%f,%f", new Object[] {
            Double.valueOf(a), Double.valueOf(b)
        }).toString();
    }

}
