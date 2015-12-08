// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.c;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.samsung.multiscreen.c:
//            a

public final class e
{

    private static e a = null;
    private ExecutorService b;
    private a c;

    protected e()
    {
        b = Executors.newCachedThreadPool();
        c = new a();
    }

    public static e a()
    {
        com/samsung/multiscreen/c/e;
        JVM INSTR monitorenter ;
        e e1;
        if (a == null)
        {
            a = new e();
        }
        e1 = a;
        com/samsung/multiscreen/c/e;
        JVM INSTR monitorexit ;
        return e1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ExecutorService b()
    {
        return b;
    }

    public final a c()
    {
        return c;
    }

}
