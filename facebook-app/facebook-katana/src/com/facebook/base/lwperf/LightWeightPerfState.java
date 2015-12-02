// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.lwperf;

import android.os.SystemClock;
import android.util.Log;

public final class LightWeightPerfState
{

    private static final LightWeightPerfState a = new LightWeightPerfState();
    private static volatile long c = -1L;
    private static volatile long d = -1L;
    private volatile boolean b;

    private LightWeightPerfState()
    {
        b = false;
    }

    public static LightWeightPerfState a()
    {
        return a;
    }

    public static void a(long l)
    {
        d = l;
    }

    public static long c()
    {
        return c;
    }

    public static long d()
    {
        long l = f();
        c = l;
        return l;
    }

    public static long e()
    {
        long l1 = c;
        long l2 = d;
        long l;
        if (l1 == -1L && l2 == -1L)
        {
            Log.e(com/facebook/base/lwperf/LightWeightPerfState.getSimpleName(), "No known set start time. Return now as default.");
            l = f();
        } else
        {
            l = l1;
            if (l2 != -1L)
            {
                if (l1 == -1L)
                {
                    return l2;
                } else
                {
                    return Math.min(l1, l2);
                }
            }
        }
        return l;
    }

    private static long f()
    {
        return SystemClock.elapsedRealtime();
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            b = true;
        }
    }

    public final boolean b()
    {
        return b;
    }

}
