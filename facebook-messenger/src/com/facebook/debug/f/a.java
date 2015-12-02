// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.f;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.a.e;
import com.facebook.base.c;
import com.facebook.debug.log.b;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;

// Referenced classes of package com.facebook.debug.f:
//            b, c, d, e, 
//            f, g

public class a
    implements c
{

    private static final Class a = com/facebook/debug/f/a;
    private final com.facebook.common.time.a b;
    private final com.facebook.common.v.a c;
    private final e d;
    private final d e;
    private final f f = new com.facebook.debug.f.c(this);
    private final Handler g = new Handler(Looper.getMainLooper());
    private HandlerThread h;
    private Handler i;
    private long j;
    private boolean k;
    private boolean l;
    private boolean m;

    public a(com.facebook.common.v.a a1, e e1, d d1, com.facebook.common.time.a a2)
    {
        c = a1;
        d = e1;
        e = d1;
        b = a2;
        d.a(new com.facebook.debug.f.b(this), new IntentFilter(com.facebook.common.v.a.a));
        k = c.a();
        e.a(f);
    }

    static void a(a a1)
    {
        a1.b();
    }

    static void a(a a1, boolean flag)
    {
        a1.a(flag);
    }

    private void a(StringBuilder stringbuilder, String s, StackTraceElement astacktraceelement[])
    {
        for (int i1 = 0; i1 < astacktraceelement.length; i1++)
        {
            stringbuilder.append(s);
            stringbuilder.append("\tat ");
            stringbuilder.append(astacktraceelement[i1].toString());
            stringbuilder.append("\n");
        }

    }

    private void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        m = flag;
        g.post(new com.facebook.debug.f.d(this));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static d b(a a1)
    {
        return a1.e;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        k = c.a();
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        flag = i();
        flag1 = l;
        if (flag != flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        com.facebook.debug.log.b.b(a, "Starting watchdog");
        h = new HandlerThread("UiThreadWatchdog");
        h.start();
        i = new Handler(h.getLooper());
        l = true;
        e();
        d();
        Looper.myQueue().addIdleHandler(new com.facebook.debug.f.e(this));
          goto _L1
        Exception exception;
        exception;
        throw exception;
        com.facebook.debug.log.b.b(a, "Stopping watchdog");
        h.quit();
        h = null;
        i = null;
        l = false;
          goto _L1
    }

    static void c(a a1)
    {
        a1.c();
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i.postDelayed(new com.facebook.debug.f.f(this), 200L);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static void d(a a1)
    {
        a1.f();
    }

    private void e()
    {
        if (!l)
        {
            return;
        } else
        {
            g.postDelayed(new g(this), 200L);
            return;
        }
    }

    static boolean e(a a1)
    {
        return a1.l;
    }

    private void f()
    {
        g();
    }

    static void f(a a1)
    {
        a1.h();
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        k = c.a();
        if (!k)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        c();
          goto _L1
        Exception exception;
        exception;
        throw exception;
        j = b.a();
          goto _L1
    }

    static void g(a a1)
    {
        a1.d();
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        k = c.a();
        if (!k)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        c();
          goto _L1
        Exception exception;
        exception;
        throw exception;
        long l1 = b.a() - j;
        if (l1 < 600L) goto _L1; else goto _L3
_L3:
        StackTraceElement astacktraceelement[] = Looper.getMainLooper().getThread().getStackTrace();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("UI Thread has been stuck for more than ").append(l1).append(" ms.");
        stringbuilder.append("Current UI thread stack\n");
        a(stringbuilder, "  ", astacktraceelement);
        com.facebook.debug.log.b.d(a, stringbuilder.toString());
          goto _L1
    }

    static void h(a a1)
    {
        a1.g();
    }

    static void i(a a1)
    {
        a1.e();
    }

    private boolean i()
    {
        return m && !k;
    }

    public void a()
    {
        a(e.a(aj.s, false));
    }

}
