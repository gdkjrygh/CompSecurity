// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.async;

import java.util.LinkedList;
import java.util.List;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j.internal.async:
//            Dispatcher, ExecuteThread

final class DispatcherImpl
    implements Dispatcher
{

    private boolean active;
    private final List q = new LinkedList();
    private ExecuteThread threads[];
    final Object ticket = new Object();

    public DispatcherImpl(Configuration configuration)
    {
        active = true;
        threads = new ExecuteThread[configuration.getAsyncNumThreads()];
        for (int i = 0; i < threads.length; i++)
        {
            threads[i] = new ExecuteThread("Twitter4J Async Dispatcher", this, i);
            threads[i].setDaemon(true);
            threads[i].start();
        }

        Runtime.getRuntime().addShutdownHook(new _cls1());
    }

    public final void invokeLater(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        synchronized (q)
        {
            q.add(runnable);
        }
        synchronized (ticket)
        {
            ticket.notify();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        list;
        JVM INSTR monitorexit ;
        throw runnable;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
        exception;
        runnable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Runnable poll()
    {
_L2:
        if (!active)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = q;
        obj;
        JVM INSTR monitorenter ;
        Runnable runnable;
        if (q.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        runnable = (Runnable)q.remove(0);
        if (runnable == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj;
        JVM INSTR monitorexit ;
        return runnable;
        obj;
        JVM INSTR monitorexit ;
        synchronized (ticket)
        {
            try
            {
                ticket.wait();
            }
            catch (InterruptedException interruptedexception) { }
        }
        if (true) goto _L2; else goto _L1
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
_L1:
        return null;
    }

    public final void shutdown()
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        ExecuteThread aexecutethread[];
        int j;
        if (!active)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        active = false;
        aexecutethread = threads;
        j = aexecutethread.length;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        aexecutethread[i].shutdown();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        synchronized (ticket)
        {
            ticket.notify();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }


    private class _cls1 extends Thread
    {

        final DispatcherImpl this$0;

        public void run()
        {
            if (active)
            {
                shutdown();
            }
        }

        _cls1()
        {
            this$0 = DispatcherImpl.this;
            super();
        }
    }

}
