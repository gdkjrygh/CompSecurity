// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.c;

import java.util.LinkedList;
import java.util.concurrent.Executor;

// Referenced classes of package a.a.a.a.a.c:
//            a, i

final class h
    implements Executor
{

    final LinkedList a;
    Runnable b;

    private h()
    {
        a = new LinkedList();
    }

    h(byte byte0)
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
        a.b.execute(b);
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
        a.offer(new i(this, runnable));
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
