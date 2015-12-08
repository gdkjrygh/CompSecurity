// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.os.Handler;
import com.mopub.common.Preconditions;
import com.mopub.volley.Cache;
import com.mopub.volley.Network;
import com.mopub.volley.Request;
import com.mopub.volley.RequestQueue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mopub.network:
//            c, b, a

public class MoPubRequestQueue extends RequestQueue
{

    private final Map a = new HashMap(10);

    MoPubRequestQueue(Cache cache, Network network)
    {
        super(cache, network);
    }

    static Map a(MoPubRequestQueue mopubrequestqueue)
    {
        return mopubrequestqueue.a;
    }

    public void addDelayedRequest(Request request, int i)
    {
        Preconditions.checkNotNull(request);
        c c1 = new c(this, request, i);
        Preconditions.checkNotNull(c1);
        if (a.containsKey(request))
        {
            cancel(request);
        }
        c1.b.postDelayed(c1.c, c1.a);
        a.put(request, c1);
    }

    public void cancel(Request request)
    {
        Preconditions.checkNotNull(request);
        cancelAll(new b(this, request));
    }

    public void cancelAll(com.mopub.volley.RequestQueue.RequestFilter requestfilter)
    {
        Preconditions.checkNotNull(requestfilter);
        super.cancelAll(requestfilter);
        Iterator iterator = a.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            if (requestfilter.apply((Request)((java.util.Map.Entry) (obj)).getKey()))
            {
                ((Request)((java.util.Map.Entry) (obj)).getKey()).cancel();
                obj = (c)((java.util.Map.Entry) (obj)).getValue();
                ((c) (obj)).b.removeCallbacks(((c) (obj)).c);
                iterator.remove();
            }
        } while (true);
    }

    public void cancelAll(Object obj)
    {
        Preconditions.checkNotNull(obj);
        super.cancelAll(obj);
        cancelAll(((com.mopub.volley.RequestQueue.RequestFilter) (new a(this, obj))));
    }
}
