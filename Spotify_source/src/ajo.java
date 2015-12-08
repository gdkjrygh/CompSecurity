// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;

public final class ajo
    implements Runnable
{

    private aif a;
    private Handler b;
    private boolean c;
    private long d;

    public ajo(aif aif1)
    {
        d = -1L;
        a = aif1;
    }

    private void a(long l)
    {
        d = l;
        a.b.a("plannedFlushTime", Long.toString(l, 10));
    }

    private void d()
    {
        if (d < 0L)
        {
            a(SystemClock.uptimeMillis() + a.G * 1000L);
        }
        b.postAtTime(this, d);
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        if (a.G <= 0L)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        l = SystemClock.uptimeMillis() + a.G * 1000L;
_L1:
        a(l);
        if (b != null)
        {
            b.removeCallbacks(this);
            d();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        l = -1L;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private void f()
    {
        if (b != null)
        {
            b.getLooper().quit();
            b = null;
        }
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        ajn.a(this, "start()");
        c = true;
        if (b != null || a.G <= 0L || a.n() == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        HandlerThread handlerthread = new HandlerThread("CacheFlusher");
        handlerthread.start();
        b = new Handler(handlerthread.getLooper());
        flag = a.b.a("plannedFlushTime").booleanValue();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        Exception exception;
        try
        {
            d = Long.parseLong(a.b.b("plannedFlushTime"), 10);
        }
        catch (Exception exception1) { }
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (a.G <= 0L || a.n() == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (b != null || !c) goto _L2; else goto _L1
_L1:
        a(-1L);
        a();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b == null) goto _L4; else goto _L3
_L3:
        e();
          goto _L4
        Exception exception;
        exception;
        throw exception;
        a(-1L);
        f();
          goto _L4
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        ajn.a(this, "stop()");
        c = false;
        f();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void run()
    {
        this;
        JVM INSTR monitorenter ;
        ajn.a(this, "run(): Flushing the cache");
        a.o();
        a(-1L);
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
