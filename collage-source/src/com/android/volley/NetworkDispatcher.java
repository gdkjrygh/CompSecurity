// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            k, n, r, e, 
//            g, s, m, b

public class NetworkDispatcher extends Thread
{

    private final BlockingQueue a;
    private final e b;
    private final b c;
    private final n d;
    private volatile boolean e;

    public NetworkDispatcher(BlockingQueue blockingqueue, e e1, b b1, n n1)
    {
        e = false;
        a = blockingqueue;
        b = e1;
        c = b1;
        d = n1;
    }

    private void a(k k1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(k1.c());
        }
    }

    private void a(k k1, r r1)
    {
        r1 = k1.a(r1);
        d.a(k1, r1);
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
        long l;
        l = SystemClock.elapsedRealtime();
        r r1;
        try
        {
            obj = (k)a.take();
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
        ((k) (obj)).a("network-queue-take");
        if (((k) (obj)).j())
        {
            ((k) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        a(((k) (obj)));
        Object obj1 = b.a(((k) (obj)));
        ((k) (obj)).a("network-http-complete");
        if (((g) (obj1)).d && ((k) (obj)).y())
        {
            ((k) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((k) (obj)).a(((g) (obj1)));
            ((k) (obj)).a("network-parse-complete");
            if (((k) (obj)).t() && ((m) (obj1)).b != null)
            {
                c.a(((k) (obj)).g(), ((m) (obj1)).b);
                ((k) (obj)).a("network-cache-written");
            }
            ((k) (obj)).x();
            d.a(((k) (obj)), ((m) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (r r1)
        {
            r1.a(SystemClock.elapsedRealtime() - l);
            a(((k) (obj)), r1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            s.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new r(((Throwable) (obj1)));
            ((r) (obj1)).a(SystemClock.elapsedRealtime() - l);
            d.a(((k) (obj)), ((r) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
