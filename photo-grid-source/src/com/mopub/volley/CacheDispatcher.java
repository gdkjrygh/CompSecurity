// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.mopub.volley:
//            VolleyLog, Cache, Request, NetworkResponse, 
//            ResponseDelivery, Response, a

public class CacheDispatcher extends Thread
{

    private static final boolean a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private final Cache d;
    private final ResponseDelivery e;
    private volatile boolean f;

    public CacheDispatcher(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, Cache cache, ResponseDelivery responsedelivery)
    {
        f = false;
        b = blockingqueue;
        c = blockingqueue1;
        d = cache;
        e = responsedelivery;
    }

    static BlockingQueue a(CacheDispatcher cachedispatcher)
    {
        return cachedispatcher.c;
    }

    public void quit()
    {
        f = true;
        interrupt();
    }

    public void run()
    {
        if (a)
        {
            VolleyLog.v("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        d.initialize();
_L1:
        Object obj;
label0:
        {
            do
            {
                try
                {
                    do
                    {
                        obj = (Request)b.take();
                        ((Request) (obj)).addMarker("cache-queue-take");
                        if (!((Request) (obj)).isCanceled())
                        {
                            break label0;
                        }
                        ((Request) (obj)).a("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!f);
            return;
        }
        Cache.Entry entry = d.get(((Request) (obj)).getCacheKey());
        if (entry != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((Request) (obj)).addMarker("cache-miss");
        c.put(obj);
          goto _L1
label1:
        {
            if (!entry.isExpired())
            {
                break label1;
            }
            ((Request) (obj)).addMarker("cache-hit-expired");
            ((Request) (obj)).setCacheEntry(entry);
            c.put(obj);
        }
          goto _L1
        Response response;
label2:
        {
            ((Request) (obj)).addMarker("cache-hit");
            response = ((Request) (obj)).a(new NetworkResponse(entry.data, entry.responseHeaders));
            ((Request) (obj)).addMarker("cache-hit-parsed");
            if (entry.refreshNeeded())
            {
                break label2;
            }
            e.postResponse(((Request) (obj)), response);
        }
          goto _L1
        ((Request) (obj)).addMarker("cache-hit-refresh-needed");
        ((Request) (obj)).setCacheEntry(entry);
        response.intermediate = true;
        e.postResponse(((Request) (obj)), response, new a(this, ((Request) (obj))));
          goto _L1
    }

    static 
    {
        a = VolleyLog.DEBUG;
    }
}
