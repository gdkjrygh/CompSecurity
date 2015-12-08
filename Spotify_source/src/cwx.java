// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

public final class cwx
{

    final Object a = new Object();
    Handler b;
    cyc c;
    final cwv d;
    private long e;
    private long f;
    private long g;

    public cwx(cwv cwv1)
    {
        d = cwv1;
        super();
        e = 0L;
        f = 0L;
        g = -1L;
        cwv1 = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 1);
        cwv1.start();
        b = new cwy(this, cwv1.getLooper());
    }

    static void a(cwx cwx1)
    {
        long l = System.currentTimeMillis();
        long l1 = cwx1.e + 1L;
        if (cwx1.g > 0L)
        {
            cwx1.f = ((l - cwx1.g) + cwx1.f * cwx1.e) / l1;
            long l2 = cwx1.f / 1000L;
            cwv.a((new StringBuilder("Average send frequency approximately ")).append(l2).append(" seconds.").toString());
        }
        cwx1.g = l;
        cwx1.e = l1;
    }

    public final void a(Message message)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        cwv.a((new StringBuilder("Dead mixpanel worker dropping a message: ")).append(message.what).toString());
_L2:
        return;
        b.sendMessage(message);
        if (true) goto _L2; else goto _L1
_L1:
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
    }
}
