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

    public static void a()
    {
        TraceInternal.a(true);
        f();
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

    public static boolean a(long l)
    {
        return (c & l) != 0L;
    }

    static long b()
    {
        return SystemPropertiesInternal.b("debug.atrace.tags.enableflags");
    }

    static long c()
    {
        return c;
    }

    static void d()
    {
        f();
    }

    private static void e()
    {
        f();
        SystemPropertiesInternal.a(new _cls1());
    }

    private static void f()
    {
        boolean flag1 = i();
        long l = g();
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
            h();
        }
    }

    private static long g()
    {
        return SystemPropertiesInternal.b("debug.fbsystrace.tags");
    }

    private static void h()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        int j = 0;
_L2:
        TraceListener tracelistener;
        if (j >= b.size())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        tracelistener = (TraceListener)b.get(j);
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
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean i()
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
        e();
    }

    private class _cls1
        implements Runnable
    {

        public final void run()
        {
            TraceConfig.d();
        }

        _cls1()
        {
        }
    }

}
