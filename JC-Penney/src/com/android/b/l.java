// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.b:
//            q, y, ac, k, 
//            n, ad, v, b

public class l extends Thread
{

    private final BlockingQueue a;
    private final k b;
    private final b c;
    private final y d;
    private volatile boolean e;

    public l(BlockingQueue blockingqueue, k k1, b b1, y y1)
    {
        e = false;
        a = blockingqueue;
        b = k1;
        c = b1;
        d = y1;
    }

    private void a(q q1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(q1.b());
        }
    }

    private void a(q q1, ac ac1)
    {
        ac1 = q1.a(ac1);
        d.a(q1, ac1);
    }

    public void a()
    {
        e = true;
        interrupt();
    }

    public void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        long l1;
        l1 = SystemClock.elapsedRealtime();
        ac ac1;
        try
        {
            obj = (q)a.take();
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
        ((q) (obj)).a("network-queue-take");
        if (((q) (obj)).g())
        {
            ((q) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        a(((q) (obj)));
        Object obj1 = b.a(((q) (obj)));
        ((q) (obj)).a("network-http-complete");
        if (((n) (obj1)).d && ((q) (obj)).v())
        {
            ((q) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((q) (obj)).a(((n) (obj1)));
            ((q) (obj)).a("network-parse-complete");
            if (((q) (obj)).q() && ((v) (obj1)).b != null)
            {
                c.a(((q) (obj)).e(), ((v) (obj1)).b);
                ((q) (obj)).a("network-cache-written");
            }
            ((q) (obj)).u();
            d.a(((q) (obj)), ((v) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            ac1.a(SystemClock.elapsedRealtime() - l1);
            a(((q) (obj)), ac1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ad.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new ac(((Throwable) (obj1)));
            ((ac) (obj1)).a(SystemClock.elapsedRealtime() - l1);
            d.a(((q) (obj)), ((ac) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
