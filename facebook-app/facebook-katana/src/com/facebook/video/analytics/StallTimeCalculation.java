// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.common.time.MonotonicClock;

public class StallTimeCalculation
{

    private final MonotonicClock a;
    private int b;
    private long c;
    private long d;

    public StallTimeCalculation(MonotonicClock monotonicclock)
    {
        a = monotonicclock;
        a();
    }

    private long f()
    {
        if (d > 0L)
        {
            long l = a.now() - d;
            if (l > 20L)
            {
                return l;
            }
        }
        return 0L;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        b = 0;
        c = 0L;
        d = -1L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        long l = d;
        if (l < 0L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d = a.now();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        long l = f();
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        b = b + 1;
        c = l + c;
        d = -1L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final int d()
    {
        this;
        JVM INSTR monitorenter ;
        if (f() <= 0L) goto _L2; else goto _L1
_L1:
        int i = b;
        i++;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = b;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final long e()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = c;
        l1 = f();
        this;
        JVM INSTR monitorexit ;
        return l + l1;
        Exception exception;
        exception;
        throw exception;
    }
}
