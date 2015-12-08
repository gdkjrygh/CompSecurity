// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.os.SystemClock;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            af

public final class e extends Thread
{

    volatile boolean a;
    public volatile int b;
    public volatile boolean c;
    private boolean d;
    private long e;
    private af f;

    static boolean a(e e1)
    {
        return e1.d;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        f.k.s();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        e = l;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        c();
        interrupt();
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (f.k != null)
        {
            f.k.t();
        }
        d = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long d()
    {
        this;
        JVM INSTR monitorenter ;
        long l = e;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final void run()
    {
_L2:
        if (!a)
        {
            break; /* Loop/switch isn't completed */
        }
        Exception exception;
        do
        {
            try
            {
                c = false;
                sleep(b);
            }
            catch (InterruptedException interruptedexception) { }
        } while (c);
        this;
        JVM INSTR monitorenter ;
        if (d || e <= SystemClock.uptimeMillis())
        {
            d = false;
            e = 0x7fffffffffffffffL;
            f.k.s();
        }
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
    }

    public (af af1)
    {
        f = af1;
        super("RenderDrive");
        a = true;
        b = f.a;
        c = false;
        d = false;
        e = 0x7fffffffffffffffL;
    }
}
