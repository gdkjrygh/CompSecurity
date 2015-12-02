// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace.mainlooper;

import com.facebook.systrace.Systrace;
import com.facebook.systrace.TraceListener;

// Referenced classes of package com.facebook.systrace.mainlooper:
//            MainLooperTracerFactory, MainLooperTracer

final class a
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

    tory(MainLooperTracerFactory mainloopertracerfactory)
    {
        a = mainloopertracerfactory;
        super();
    }
}
