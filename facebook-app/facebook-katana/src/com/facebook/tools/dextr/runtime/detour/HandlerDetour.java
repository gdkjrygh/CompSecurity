// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import android.os.Handler;
import com.facebook.loom.core.TraceEvents;
import com.facebook.loom.logger.Logger;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.tools.dextr.runtime.detour:
//            ChainedWeakReference, RunnableWrapper

public class HandlerDetour
{

    private static final ChainedWeakReference a = ChainedWeakReference.a();
    private static final ReferenceQueue b = new ReferenceQueue();
    private static final ReferenceQueue c = new ReferenceQueue();
    private static final AtomicInteger d = new AtomicInteger(0);

    public HandlerDetour()
    {
    }

    private static Runnable a(Runnable runnable, int i)
    {
        if (!TraceEvents.a(1))
        {
            return runnable;
        } else
        {
            RunnableWrapper runnablewrapper = new RunnableWrapper(runnable, Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.ASYNC_CALL, i), i);
            a(runnable, runnablewrapper);
            return runnablewrapper;
        }
    }

    private static void a()
    {
        while (!TraceEvents.a(1) || d.incrementAndGet() < 50 || Thread.currentThread().getId() == 1L) 
        {
            return;
        }
        synchronized (a)
        {
            if (d.get() >= 50)
            {
                break MISSING_BLOCK_LABEL_55;
            }
        }
        return;
        exception;
        chainedweakreference;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        java.lang.ref.Reference reference = b.poll();
        if (reference == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        ((ChainedWeakReference)reference).b();
          goto _L1
_L2:
        reference = c.poll();
        if (reference == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        ((ChainedWeakReference)reference).b();
          goto _L2
        d.set(0);
        chainedweakreference;
        JVM INSTR monitorexit ;
    }

    public static void a(Handler handler, Runnable runnable)
    {
        handler.removeCallbacks(runnable);
        ChainedWeakReference chainedweakreference = a;
        chainedweakreference;
        JVM INSTR monitorenter ;
        ChainedWeakReference chainedweakreference1;
        chainedweakreference1 = ChainedWeakReference.a(a, runnable);
        if (chainedweakreference1 == a)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        runnable = chainedweakreference1.b;
_L1:
        if (runnable == chainedweakreference1)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        Runnable runnable1 = (Runnable)runnable.get();
        if (runnable1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        handler.removeCallbacks(runnable1);
        runnable = ((ChainedWeakReference) (runnable)).b;
          goto _L1
        chainedweakreference;
        JVM INSTR monitorexit ;
        a();
        return;
        handler;
        chainedweakreference;
        JVM INSTR monitorexit ;
        throw handler;
    }

    private static void a(Runnable runnable, RunnableWrapper runnablewrapper)
    {
        ChainedWeakReference chainedweakreference2 = a;
        chainedweakreference2;
        JVM INSTR monitorenter ;
        ChainedWeakReference chainedweakreference1 = ChainedWeakReference.a(a, runnable);
        ChainedWeakReference chainedweakreference = chainedweakreference1;
        if (chainedweakreference1 == a)
        {
            chainedweakreference = new ChainedWeakReference(runnable, b);
            a.b(chainedweakreference);
        }
        chainedweakreference.a(new ChainedWeakReference(runnablewrapper, c));
        chainedweakreference2;
        JVM INSTR monitorexit ;
        a();
        return;
        runnable;
        chainedweakreference2;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public static boolean a(Handler handler, Runnable runnable, int i)
    {
        return handler.post(a(runnable, i));
    }

    public static boolean a(Handler handler, Runnable runnable, long l, int i)
    {
        return handler.postAtTime(a(runnable, i), l);
    }

    public static boolean a(Handler handler, Runnable runnable, Object obj, long l, int i)
    {
        return handler.postAtTime(a(runnable, i), obj, l);
    }

    public static boolean b(Handler handler, Runnable runnable, int i)
    {
        return handler.postAtFrontOfQueue(a(runnable, i));
    }

    public static boolean b(Handler handler, Runnable runnable, long l, int i)
    {
        return handler.postDelayed(a(runnable, i), l);
    }

}
