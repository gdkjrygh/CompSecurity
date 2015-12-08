// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.m4b.maps.cz.a;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            j

public final class af
    implements j
{
    public final class a extends Thread
    {

        volatile boolean a;
        public volatile int b;
        public volatile boolean c;
        private boolean d;
        private long e;
        private af f;

        static boolean a(a a1)
        {
            return a1.d;
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

        public final void a(long l1)
        {
            this;
            JVM INSTR monitorenter ;
            e = l1;
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
            long l1 = e;
            this;
            JVM INSTR monitorexit ;
            return l1;
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

        public a()
        {
            f = af.this;
            super("RenderDrive");
            a = true;
            b = f.a;
            c = false;
            d = false;
            e = 0x7fffffffffffffffL;
        }
    }

    public static interface b
    {

        public abstract void s();

        public abstract void t();
    }


    public final int a;
    public int b;
    public long c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    final b k;
    public a l;
    private boolean m;

    public af(Context context, b b1)
    {
        boolean flag1 = false;
        super();
        m = false;
        boolean flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (com.google.android.m4b.maps.cz.a.a(context))
            {
                flag = true;
            }
        }
        byte byte0;
        if (flag)
        {
            byte0 = 30;
        } else
        if (com.google.android.m4b.maps.ao.a.a())
        {
            byte0 = 60;
        } else
        {
            byte0 = 50;
        }
        a = 1000 / byte0;
        a(a);
        k = b1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        g = true;
        if (l != null)
        {
            l.b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i1)
    {
        d = Math.max(a, i1);
    }

    public final void a(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        d();
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        l.b();
        l.c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        l = new a();
        l.start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (l != null)
        {
            a a1 = l;
            a1.a = false;
            a1.interrupt();
            l = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        m = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = m;
        m = false;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        a a1 = l;
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        return a1 == null || com.google.android.m4b.maps.bx.a.a(a1);
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
