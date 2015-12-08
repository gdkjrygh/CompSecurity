// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            xm, tj, wp, ka, 
//            pl, xv, vo, bd

public final class mb extends Thread
{

    private final BlockingQueue a;
    private final ka b;
    private final bd c;
    private final wp d;
    private volatile boolean e;

    public mb(BlockingQueue blockingqueue, ka ka1, bd bd1, wp wp1)
    {
        e = false;
        a = blockingqueue;
        b = ka1;
        c = bd1;
        d = wp1;
    }

    public final void a()
    {
        e = true;
        interrupt();
    }

    public final void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        long l;
        l = SystemClock.elapsedRealtime();
        xm xm1;
        xm xm2;
        try
        {
            obj = (tj)a.take();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (e)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        ((tj) (obj)).a("network-queue-take");
        if (((tj) (obj)).g())
        {
            ((tj) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((tj) (obj)).c());
        }
        Object obj1 = b.a(((tj) (obj)));
        ((tj) (obj)).a("network-http-complete");
        if (((pl) (obj1)).d && ((tj) (obj)).m())
        {
            ((tj) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((tj) (obj)).a(((pl) (obj1)));
            ((tj) (obj)).a("network-parse-complete");
            if (((tj) (obj)).i() && ((vo) (obj1)).b != null)
            {
                c.a(((tj) (obj)).e(), ((vo) (obj1)).b);
                ((tj) (obj)).a("network-cache-written");
            }
            ((tj) (obj)).l();
            d.a(((tj) (obj)), ((vo) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (xm xm1)
        {
            xm1.a(SystemClock.elapsedRealtime() - l);
            xm2 = tj.a(xm1);
            d.a(((tj) (obj)), xm2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            xv.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new xm(((Throwable) (obj1)));
            ((xm) (obj1)).a(SystemClock.elapsedRealtime() - l);
            d.a(((tj) (obj)), ((xm) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
