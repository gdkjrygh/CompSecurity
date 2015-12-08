// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.SystemClock;

final class n
{

    private long a;
    private int b;

    public n()
    {
        a = -1L;
        b = 1000;
    }

    public final void a()
    {
        if (a < 0L)
        {
            a = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b()
    {
        while (a < 0L || SystemClock.elapsedRealtime() <= a + (long)b) 
        {
            return false;
        }
        return true;
    }
}
