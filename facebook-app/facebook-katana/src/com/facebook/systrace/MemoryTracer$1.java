// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;


// Referenced classes of package com.facebook.systrace:
//            TraceListener, Systrace, MemoryTracer

final class 
    implements TraceListener
{

    MemoryTracer a;

    public final void a()
    {
        if (!Systrace.b(1024L))
        {
            return;
        } else
        {
            a = new MemoryTracer();
            (new Thread(a, "MemoryTracer")).start();
            return;
        }
    }

    public final void b()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.b();
            a = null;
            return;
        }
    }

    ()
    {
    }
}
