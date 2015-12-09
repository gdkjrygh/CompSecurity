// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.flurry.sdk:
//            gc, ga

public final class fn extends gc
{

    private static fn a = null;

    protected fn()
    {
        super(com/flurry/sdk/fn.getName(), 0, 5, 5000L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new ga()));
    }

    public static fn a()
    {
        com/flurry/sdk/fn;
        JVM INSTR monitorenter ;
        fn fn1;
        if (a == null)
        {
            a = new fn();
        }
        fn1 = a;
        com/flurry/sdk/fn;
        JVM INSTR monitorexit ;
        return fn1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        com/flurry/sdk/fn;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.c();
        }
        a = null;
        com/flurry/sdk/fn;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
