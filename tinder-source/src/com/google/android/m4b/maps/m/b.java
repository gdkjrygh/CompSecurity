// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.m;

import com.google.android.m4b.maps.y.j;

final class b
{

    private static final long a = Double.doubleToRawLongBits(1.0D);

    static int a(double d)
    {
        return (int)((Double.doubleToRawLongBits(d) & 0x7ff0000000000000L) >>> 52) - 1023;
    }

    static long b(double d)
    {
        j.a(c(d), "not a normal value");
        int i = a(d);
        long l = Double.doubleToRawLongBits(d) & 0xfffffffffffffL;
        if (i == -1023)
        {
            return l << 1;
        } else
        {
            return 0x10000000000000L | l;
        }
    }

    static boolean c(double d)
    {
        return a(d) <= 1023;
    }

}
