// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            d, a, bk

class c
{

    final a a;
    private final Object b = new Object();
    private Handler c;
    private long d;
    private long e;
    private long f;
    private bk g;

    public c(a a1)
    {
        a = a1;
        super();
        d = 0L;
        e = 0L;
        f = -1L;
        c = a();
    }

    private Handler a()
    {
        HandlerThread handlerthread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 1);
        handlerthread.start();
        return new d(this, handlerthread.getLooper());
    }

    static Handler a(c c1, Handler handler)
    {
        c1.c = handler;
        return handler;
    }

    static bk a(c c1, bk bk)
    {
        c1.g = bk;
        return bk;
    }

    static void a(c c1)
    {
        c1.b();
    }

    static Object b(c c1)
    {
        return c1.b;
    }

    private void b()
    {
        long l = System.currentTimeMillis();
        long l1 = d + 1L;
        if (f > 0L)
        {
            e = ((l - f) + e * d) / l1;
            long l2 = e / 1000L;
            com.android.slyce.report.mpmetrics.a.a(a, (new StringBuilder()).append("Average send frequency approximately ").append(l2).append(" seconds.").toString());
        }
        f = l;
        d = l1;
    }

    static bk c(c c1)
    {
        return c1.g;
    }

    public void a(Message message)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        com.android.slyce.report.mpmetrics.a.a(a, (new StringBuilder()).append("Dead mixpanel worker dropping a message: ").append(message.what).toString());
_L2:
        return;
        c.sendMessage(message);
        if (true) goto _L2; else goto _L1
_L1:
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
    }
}
