// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            Request, l, VolleyError, g, 
//            i, n, k, a

public class h extends Thread
{

    protected final BlockingQueue a;
    protected final g b;
    protected final a c;
    protected final l d;
    protected volatile boolean e;

    public h(BlockingQueue blockingqueue, g g1, a a1, l l1)
    {
        e = false;
        a = blockingqueue;
        b = g1;
        c = a1;
        d = l1;
    }

    private void a(Request request)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(request.c());
        }
    }

    private void a(Request request, VolleyError volleyerror)
    {
        volleyerror = request.a(volleyerror);
        d.a(request, volleyerror);
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
        VolleyError volleyerror;
        try
        {
            obj = (Request)a.take();
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
        ((Request) (obj)).a("network-queue-take");
        if (((Request) (obj)).h())
        {
            ((Request) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        a(((Request) (obj)));
        Object obj1 = b.a(((Request) (obj)));
        ((Request) (obj)).a("network-http-complete");
        if (((i) (obj1)).d && ((Request) (obj)).w())
        {
            ((Request) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((Request) (obj)).a(((i) (obj1)));
            ((Request) (obj)).a("network-parse-complete");
            if (((Request) (obj)).r() && ((k) (obj1)).b != null)
            {
                c.a(((Request) (obj)).e(), ((k) (obj1)).b);
                ((Request) (obj)).a("network-cache-written");
            }
            ((Request) (obj)).v();
            d.a(((Request) (obj)), ((k) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            a(((Request) (obj)), volleyerror);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            n.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            d.a(((Request) (obj)), new VolleyError(((Throwable) (obj1))));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
