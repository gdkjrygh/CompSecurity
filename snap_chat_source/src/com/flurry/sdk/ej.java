// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.flurry.sdk:
//            eg, ee

public final class ej extends eg
{

    private static ej a = null;

    protected ej()
    {
        super(com/flurry/sdk/ej.getName(), 0, 5, 5000L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new ee()));
    }

    public static ej a()
    {
        com/flurry/sdk/ej;
        JVM INSTR monitorenter ;
        ej ej1;
        if (a == null)
        {
            a = new ej();
        }
        ej1 = a;
        com/flurry/sdk/ej;
        JVM INSTR monitorexit ;
        return ej1;
        Exception exception;
        exception;
        throw exception;
    }

}
