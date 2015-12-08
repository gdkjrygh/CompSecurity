// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.flurry.sdk:
//            eg, ee

public final class em extends eg
{

    private static em a = null;

    protected em()
    {
        super(com/flurry/sdk/em.getName(), 0, 5, 5000L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new ee()));
    }

    public static em a()
    {
        com/flurry/sdk/em;
        JVM INSTR monitorenter ;
        em em1;
        if (a == null)
        {
            a = new em();
        }
        em1 = a;
        com/flurry/sdk/em;
        JVM INSTR monitorexit ;
        return em1;
        Exception exception;
        exception;
        throw exception;
    }

}
