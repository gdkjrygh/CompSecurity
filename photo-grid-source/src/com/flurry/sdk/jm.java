// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.flurry.sdk:
//            kb, jz

public final class jm extends kb
{

    private static jm a = null;

    protected jm()
    {
        super(com/flurry/sdk/jm.getName(), 0, 5, 5000L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new jz()));
    }

    public static jm a()
    {
        com/flurry/sdk/jm;
        JVM INSTR monitorenter ;
        jm jm1;
        if (a == null)
        {
            a = new jm();
        }
        jm1 = a;
        com/flurry/sdk/jm;
        JVM INSTR monitorexit ;
        return jm1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        com/flurry/sdk/jm;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.c();
        }
        a = null;
        com/flurry/sdk/jm;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
