// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.lwperf;


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

    public static long b()
    {
        return c;
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            b = true;
        }
    }

}
