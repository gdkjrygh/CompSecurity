// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.mopub.volley:
//            VolleyError, Request, ResponseDelivery, Network, 
//            NetworkResponse, VolleyLog, Response, Cache

public class NetworkDispatcher extends Thread
{

    private final BlockingQueue a;
    private final Network b;
    private final Cache c;
    private final ResponseDelivery d;
    private volatile boolean e;

    public NetworkDispatcher(BlockingQueue blockingqueue, Network network, Cache cache, ResponseDelivery responsedelivery)
    {
        e = false;
        a = blockingqueue;
        b = network;
        c = cache;
        d = responsedelivery;
    }

    public void quit()
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
        VolleyError volleyerror;
        VolleyError volleyerror1;
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
        ((Request) (obj)).addMarker("network-queue-take");
        if (((Request) (obj)).isCanceled())
        {
            ((Request) (obj)).a("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((Request) (obj)).getTrafficStatsTag());
        }
        Object obj1 = b.performRequest(((Request) (obj)));
        ((Request) (obj)).addMarker("network-http-complete");
        if (((NetworkResponse) (obj1)).notModified && ((Request) (obj)).hasHadResponseDelivered())
        {
            ((Request) (obj)).a("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((Request) (obj)).a(((NetworkResponse) (obj1)));
            ((Request) (obj)).addMarker("network-parse-complete");
            if (((Request) (obj)).shouldCache() && ((Response) (obj1)).cacheEntry != null)
            {
                c.put(((Request) (obj)).getCacheKey(), ((Response) (obj1)).cacheEntry);
                ((Request) (obj)).addMarker("network-cache-written");
            }
            ((Request) (obj)).markDelivered();
            d.postResponse(((Request) (obj)), ((Response) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            volleyerror.a(SystemClock.elapsedRealtime() - l);
            volleyerror1 = Request.a(volleyerror);
            d.postError(((Request) (obj)), volleyerror1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            VolleyLog.e(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new VolleyError(((Throwable) (obj1)));
            ((VolleyError) (obj1)).a(SystemClock.elapsedRealtime() - l);
            d.postError(((Request) (obj)), ((VolleyError) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
