// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;

import com.facebook.androidinternals.android.os.SystemPropertiesInternal;
import com.facebook.androidinternals.android.os.TraceInternal;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.systrace:
//            TraceListener, TraceDirect, TraceConfigJB

final class TraceConfig
{

    private static final Object a = new Object[0];
    private static final List b = new ArrayList();
    private static volatile long c = 0L;

    private TraceConfig()
    {
    }

    static long a()
    {
        return SystemPropertiesInternal.a("debug.atrace.tags.enableflags", 0L);
    }

    public static void a(TraceListener tracelistener)
    {
        synchronized (a)
        {
            b.add(tracelistener);
            if (c != 0L)
            {
                tracelistener.a();
            }
        }
        return;
        tracelistener;
        obj;
        JVM INSTR monitorexit ;
        throw tracelistener;
    }

    public static void a(boolean flag)
    {
        TraceInternal.a(flag);
        e();
    }

    public static boolean a(long l)
    {
        return (c & l) != 0L;
    }

    static long b()
    {
        return c;
    }

    public static void b(TraceListener tracelistener)
    {
        synchronized (a)
        {
            b.remove(tracelistener);
            if (c != 0L)
            {
                tracelistener.b();
            }
        }
        return;
        tracelistener;
        obj;
        JVM INSTR monitorexit ;
        throw tracelistener;
    }

    static void c()
    {
        e();
    }

    private static void d()
    {
        e();
        SystemPropertiesInternal.a(new _cls1());
    }

    private static void e()
    {
        boolean flag1 = h();
        long l = f();
        boolean flag;
        if (!flag1 || l == 0L)
        {
            l = 0L;
        } else
        {
            l = 1L | l;
        }
        if (c == 0L && l != 0L || l == 0L && c != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = l;
        if (flag)
        {
            TraceDirect.a(c);
            g();
        }
    }

    private static long f()
    {
        return SystemPropertiesInternal.a("debug.fbsystrace.tags", 0L);
    }

    private static void g()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        TraceListener tracelistener;
        if (i >= b.size())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        tracelistener = (TraceListener)b.get(i);
        if (c != 0L)
        {
            tracelistener.a();
            break MISSING_BLOCK_LABEL_67;
        }
        tracelistener.b();
        break MISSING_BLOCK_LABEL_67;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean h()
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return TraceInternal.a(TraceInternal.b);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return TraceConfigJB.a();
        } else
        {
            return false;
        }
    }

    static 
    {
        d();
    }

    private class _cls1
        implements Runnable
    {

        public final void run()
        {
            TraceConfig.c();
        }

        _cls1()
        {
        }
    }

}
