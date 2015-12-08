// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            VolleyError, Request, j, f, 
//            NetworkResponse, l, i, a

public final class g extends Thread
{

    volatile boolean a;
    private final BlockingQueue b;
    private final f c;
    private final a d;
    private final j e;

    public g(BlockingQueue blockingqueue, f f1, a a1, j j1)
    {
        a = false;
        b = blockingqueue;
        c = f1;
        d = a1;
        e = j1;
    }

    public final void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        long l1;
        l1 = SystemClock.elapsedRealtime();
        VolleyError volleyerror;
        VolleyError volleyerror1;
        try
        {
            obj = (Request)b.take();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (a)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        ((Request) (obj)).a("network-queue-take");
        if (((Request) (obj)).h)
        {
            ((Request) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((Request) (obj)).d);
        }
        Object obj1 = c.a(((Request) (obj)));
        ((Request) (obj)).a("network-http-complete");
        if (((NetworkResponse) (obj1)).d && ((Request) (obj)).i)
        {
            ((Request) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((Request) (obj)).a(((NetworkResponse) (obj1)));
            ((Request) (obj)).a("network-parse-complete");
            if (((Request) (obj)).g && ((i) (obj1)).b != null)
            {
                d.a(((Request) (obj)).c(), ((i) (obj1)).b);
                ((Request) (obj)).a("network-cache-written");
            }
            obj.i = true;
            e.a(((Request) (obj)), ((i) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            volleyerror.b = SystemClock.elapsedRealtime() - l1;
            volleyerror1 = Request.a(volleyerror);
            e.a(((Request) (obj)), volleyerror1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            l.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new VolleyError(((Throwable) (obj1)));
            obj1.b = SystemClock.elapsedRealtime() - l1;
            e.a(((Request) (obj)), ((VolleyError) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
