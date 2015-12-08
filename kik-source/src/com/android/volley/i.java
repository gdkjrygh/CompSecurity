// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            w, n, s, h, 
//            k, x, r, b

public final class i extends Thread
{

    private final BlockingQueue a;
    private final h b;
    private final b c;
    private final s d;
    private volatile boolean e;

    public i(BlockingQueue blockingqueue, h h1, b b1, s s1)
    {
        e = false;
        a = blockingqueue;
        b = h1;
        c = b1;
        d = s1;
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
        w w1;
        w w2;
        try
        {
            obj = (n)a.take();
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
        ((n) (obj)).a("network-queue-take");
        if (((n) (obj)).h())
        {
            ((n) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((n) (obj)).c());
        }
        Object obj1 = b.a(((n) (obj)));
        ((n) (obj)).a("network-http-complete");
        if (((k) (obj1)).d && ((n) (obj)).s())
        {
            ((n) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((n) (obj)).a(((k) (obj1)));
            ((n) (obj)).a("network-parse-complete");
            if (((n) (obj)).n() && ((r) (obj1)).b != null)
            {
                c.a(((n) (obj)).e(), ((r) (obj1)).b);
                ((n) (obj)).a("network-cache-written");
            }
            ((n) (obj)).r();
            d.a(((n) (obj)), ((r) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (w w1)
        {
            w2 = n.a(w1);
            d.a(((n) (obj)), w2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            x.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            d.a(((n) (obj)), new w(((Throwable) (obj1))));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
