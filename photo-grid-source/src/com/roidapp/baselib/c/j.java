// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

// Referenced classes of package com.roidapp.baselib.c:
//            c, k

final class j
    implements Executor
{

    final ArrayDeque a;
    Runnable b;

    private j()
    {
        a = new ArrayDeque();
    }

    j(byte byte0)
    {
        this();
    }

    protected final void a()
    {
        this;
        JVM INSTR monitorenter ;
        Runnable runnable;
        runnable = (Runnable)a.poll();
        b = runnable;
        if (runnable == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c.THREAD_POOL_EXECUTOR.execute(b);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void execute(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        a.offer(new k(this, runnable));
        if (b == null)
        {
            a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }
}
