// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import rx.internal.c.b;
import rx.internal.util.j;

final class f
{

    private static final j a = new j("RxScheduledExecutorPool-");
    private static final f b = new f();
    private final ScheduledExecutorService c;

    private f()
    {
        byte byte0 = 8;
        super();
        int k = Runtime.getRuntime().availableProcessors();
        int i = k;
        if (k > 4)
        {
            i = k / 2;
        }
        if (i > 8)
        {
            i = byte0;
        }
        ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(i, a);
        if (!rx.internal.c.b.a(scheduledexecutorservice) && (scheduledexecutorservice instanceof ScheduledThreadPoolExecutor))
        {
            rx.internal.c.b.a((ScheduledThreadPoolExecutor)scheduledexecutorservice);
        }
        c = scheduledexecutorservice;
    }

    public static ScheduledExecutorService a()
    {
        return b.c;
    }

}
