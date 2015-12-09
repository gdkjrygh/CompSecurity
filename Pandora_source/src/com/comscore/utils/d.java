// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import p.aq.b;

// Referenced classes of package com.comscore.utils:
//            c, n

public class d
    implements Runnable
{

    protected b a;
    protected Handler b;
    protected boolean c;
    protected long d;

    public d(b b1)
    {
        d = -1L;
        a = b1;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        com.comscore.utils.c.a(this, "start()");
        c = true;
        if (b == null && a.ah() > 0L && a.ac() != null)
        {
            f();
            c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(long l)
    {
        d = l;
        a.r().a("plannedFlushTime", Long.toString(l, 10));
    }

    protected void b()
    {
        if (!a.r().a("plannedFlushTime").booleanValue())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        d = Long.parseLong(a.r().b("plannedFlushTime"), 10);
        return;
        Exception exception;
        exception;
    }

    protected void c()
    {
        if (d < 0L)
        {
            a(SystemClock.uptimeMillis() + a.ah() * 1000L);
        }
        b.postAtTime(this, d);
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (a.ah() <= 0L || a.ac() == null)
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
        g();
          goto _L4
    }

    protected void e()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        if (a.ah() <= 0L)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        l = SystemClock.uptimeMillis() + a.ah() * 1000L;
_L1:
        a(l);
        if (b != null)
        {
            b.removeCallbacks(this);
            c();
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

    protected void f()
    {
        HandlerThread handlerthread = new HandlerThread("CacheFlusher");
        handlerthread.start();
        b = new Handler(handlerthread.getLooper());
        b();
    }

    protected void g()
    {
        if (b != null)
        {
            b.getLooper().quit();
            b = null;
        }
    }

    public void h()
    {
        this;
        JVM INSTR monitorenter ;
        com.comscore.utils.c.a(this, "stop()");
        c = false;
        g();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        com.comscore.utils.c.a(this, "run(): Flushing the cache");
        a.r(false);
        a(-1L);
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
