// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace.mainlooper;

import com.facebook.systrace.Systrace;

// Referenced classes of package com.facebook.systrace.mainlooper:
//            MainLooperTracerFactory

public abstract class MainLooperTracer
{

    private static final int a = 21;
    private boolean b;
    private volatile boolean c;

    public MainLooperTracer()
    {
    }

    public static void a(MainLooperTracerFactory mainloopertracerfactory)
    {
        Systrace.a(new _cls1(mainloopertracerfactory));
    }

    protected abstract void a();

    protected final void a(String s)
    {
        if (c)
        {
            Systrace.a(4096L);
        }
        if (s.startsWith(">>>>> Dispatching to "))
        {
            Systrace.a(4096L, s.substring(a));
        }
        c = s.startsWith(">>>>> Dispatching to ");
    }

    protected abstract void b();

    final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (b) goto _L2; else goto _L1
_L1:
        boolean flag = Systrace.b(4096L);
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        c = false;
        a();
        b = true;
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    final void d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (c)
        {
            Systrace.a(4096L);
        }
        b();
        b = false;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }


    private class _cls1
        implements TraceListener
    {

        final MainLooperTracerFactory a;
        private MainLooperTracer b;

        public final void a()
        {
            this;
            JVM INSTR monitorenter ;
            if (Systrace.b(4096L))
            {
                b();
                b = a.a();
                b.c();
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final void b()
        {
            this;
            JVM INSTR monitorenter ;
            if (b != null)
            {
                b.d();
                b = null;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        _cls1(MainLooperTracerFactory mainloopertracerfactory)
        {
            a = mainloopertracerfactory;
            super();
        }
    }

}
