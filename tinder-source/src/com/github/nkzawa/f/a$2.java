// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.f;

import java.util.concurrent.ExecutorService;

// Referenced classes of package com.github.nkzawa.f:
//            a

static final class a
    implements Runnable
{

    final Runnable a;

    public final void run()
    {
        a.run();
        com/github/nkzawa/f/a;
        JVM INSTR monitorenter ;
        com.github.nkzawa.f.a.b();
        if (com.github.nkzawa.f.a.c() == 0)
        {
            com.github.nkzawa.f.a.d().shutdown();
            com.github.nkzawa.f.a.e();
            com.github.nkzawa.f.a.a(null);
        }
        com/github/nkzawa/f/a;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/github/nkzawa/f/a;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        com/github/nkzawa/f/a;
        JVM INSTR monitorenter ;
        com.github.nkzawa.f.a.b();
        if (com.github.nkzawa.f.a.c() == 0)
        {
            com.github.nkzawa.f.a.d().shutdown();
            com.github.nkzawa.f.a.e();
            com.github.nkzawa.f.a.a(null);
        }
        com/github/nkzawa/f/a;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        com/github/nkzawa/f/a;
        JVM INSTR monitorexit ;
        throw exception;
    }

    cutorService(Runnable runnable)
    {
        a = runnable;
        super();
    }
}
