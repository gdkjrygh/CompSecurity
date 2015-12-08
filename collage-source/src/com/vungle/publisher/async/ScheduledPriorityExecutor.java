// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.async;

import android.os.HandlerThread;
import android.os.Message;
import com.vungle.log.Logger;
import dagger.Lazy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class ScheduledPriorityExecutor
{

    Lazy a;
    private final a b;
    private final c c = new c(new LinkedBlockingQueue(), "VungleAsyncClientEventThread-");
    private final c d = new c(new LinkedBlockingQueue(), "VungleAsyncExternalNetworkRequestThread-");
    private final c e;
    private final BlockingQueue f = new PriorityBlockingQueue();

    ScheduledPriorityExecutor()
    {
        HandlerThread handlerthread = new HandlerThread("VungleAsyncMasterThread");
        handlerthread.start();
    /* block-local class not found */
    class c {}

        c.allowCoreThreadTimeOut(true);
        d.allowCoreThreadTimeOut(true);
    /* block-local class not found */
    class a {}

        b = new a(handlerthread.getLooper());
        e = new c(f, "VungleAsyncMainThread-");
        e.allowCoreThreadTimeOut(true);
    }

    static c a(ScheduledPriorityExecutor scheduledpriorityexecutor)
    {
        return scheduledpriorityexecutor.e;
    }

    private Message b(Runnable runnable, b b1)
    {
        a a1 = b;
    /* block-local class not found */
    class b {}

        int i = b1.ordinal();
        a1.getClass();
    /* block-local class not found */
    class a.a {}

        return a1.obtainMessage(i, new a.a(a1, runnable, b1));
    }

    static c b(ScheduledPriorityExecutor scheduledpriorityexecutor)
    {
        return scheduledpriorityexecutor.c;
    }

    public final void a(b b1)
    {
        b.removeMessages(b1.ordinal());
    }

    public final void a(Runnable runnable, long l)
    {
        a(runnable, b.p, l);
    }

    public final void a(Runnable runnable, b b1)
    {
        b.sendMessage(b(runnable, b1));
    }

    public final void a(Runnable runnable, b b1, long l)
    {
        Logger.d("VungleAsync", (new StringBuilder("scheduling ")).append(b1).append(" delayed ").append(l).append(" ms").toString());
        b.sendMessageDelayed(b(runnable, b1), l);
    }
}
