// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.os.SystemClock;

public final class k
{

    private static k a = null;

    public k()
    {
    }

    public static k a()
    {
        if (a == null)
        {
            a = new k();
        }
        return a;
    }

    public static long b()
    {
        return System.currentTimeMillis();
    }

    public static long c()
    {
        return SystemClock.elapsedRealtime();
    }

}
