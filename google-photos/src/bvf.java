// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

public final class bvf
    implements Runnable
{

    final bvk a;
    final bvd b;

    public bvf(bvd bvd1, bvk bvk1)
    {
        b = bvd1;
        super();
        a = (bvk)b.a(bvk1, "params", null);
    }

    public final void run()
    {
        Object obj = bvd.c(b);
        obj;
        JVM INSTR monitorenter ;
        bvd.a(b, false);
        bvd.b(b, false);
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
          goto _L1
        Object obj1;
        obj1;
        Log.e(bvd.a(), "render context not initialized", ((Throwable) (obj1)));
        synchronized (bvd.a(b))
        {
            if (bvd.b(b) == Thread.currentThread())
            {
                bvd.a(b, null);
            }
            bvd.f(b).execute(bvd.g(b));
        }
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (a.e != null)
        {
            bvd.a(b, a);
        }
        long l = SystemClock.elapsedRealtime();
        obj2 = new AtomicLong();
        bvd.d(b).a(new bvg(this, ((AtomicLong) (obj2))));
        long l1 = SystemClock.elapsedRealtime();
        bvd.a(b, (1000L * (a.a.h - ((AtomicLong) (obj2)).get())) / (l1 - l));
        synchronized (bvd.a(b))
        {
            if (bvd.b(b) == Thread.currentThread())
            {
                bvd.a(b, null);
            }
            bvd.f(b).execute(bvd.e(b));
        }
        continue; /* Loop/switch isn't completed */
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        exception1;
        obj2;
        JVM INSTR monitorexit ;
        throw exception1;
        obj2;
        Thread.currentThread().interrupt();
        synchronized (bvd.a(b))
        {
            if (bvd.b(b) == Thread.currentThread())
            {
                bvd.a(b, null);
            }
            bvd.f(b).execute(bvd.g(b));
        }
        if (true) goto _L3; else goto _L2
_L2:
        exception2;
        obj3;
        JVM INSTR monitorexit ;
        throw exception2;
        obj3;
        throw c.a("unexpected exception running writeMovie in context", ((Throwable) (obj3)));
        Exception exception3;
        exception3;
        synchronized (bvd.a(b))
        {
            if (bvd.b(b) == Thread.currentThread())
            {
                bvd.a(b, null);
            }
            bvd.f(b).execute(bvd.g(b));
        }
        throw exception3;
        exception4;
        obj4;
        JVM INSTR monitorexit ;
        throw exception4;
    }
}
