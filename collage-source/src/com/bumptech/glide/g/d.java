// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g;

import android.os.SystemClock;

public final class d
{

    private static final double a;

    private d()
    {
    }

    public static double a(long l)
    {
        return (double)(a() - l) * a;
    }

    public static long a()
    {
        if (17 <= android.os.Build.VERSION.SDK_INT)
        {
            return SystemClock.elapsedRealtimeNanos();
        } else
        {
            return System.currentTimeMillis();
        }
    }

    static 
    {
        double d1 = 1.0D;
        if (17 <= android.os.Build.VERSION.SDK_INT)
        {
            d1 = 1.0D / Math.pow(10D, 6D);
        }
        a = d1;
    }
}
