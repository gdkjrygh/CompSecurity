// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;

import java.util.LinkedList;
import java.util.concurrent.Executor;

// Referenced classes of package b.a.a.a.a.c:
//            a, e

private static final class <init>
    implements Executor
{

    final LinkedList a;
    Runnable b;

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
        a.offer(new e(this, runnable));
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

    private le()
    {
        a = new LinkedList();
    }

    List(byte byte0)
    {
        this();
    }
}
