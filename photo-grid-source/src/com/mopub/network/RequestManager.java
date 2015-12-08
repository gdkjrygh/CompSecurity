// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.os.Handler;
import android.os.Looper;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.volley.Request;

// Referenced classes of package com.mopub.network:
//            Networking, BackoffPolicy, MoPubRequestQueue

public abstract class RequestManager
{

    protected Request a;
    protected RequestFactory b;
    protected BackoffPolicy c;
    protected Handler d;

    public RequestManager(Looper looper)
    {
        d = new Handler(looper);
    }

    abstract Request a();

    final void b()
    {
        a = a();
        MoPubRequestQueue mopubrequestqueue = Networking.getRequestQueue();
        if (mopubrequestqueue == null)
        {
            MoPubLog.d("MoPubRequest queue is null. Clearing request.");
            c();
            return;
        }
        if (c.getRetryCount() == 0)
        {
            mopubrequestqueue.add(a);
            return;
        } else
        {
            mopubrequestqueue.addDelayedRequest(a, c.getBackoffMs());
            return;
        }
    }

    final void c()
    {
        a = null;
        b = null;
        c = null;
    }

    public void cancelRequest()
    {
        MoPubRequestQueue mopubrequestqueue = Networking.getRequestQueue();
        if (mopubrequestqueue != null && a != null)
        {
            mopubrequestqueue.cancel(a);
        }
        c();
    }

    public boolean isAtCapacity()
    {
        return a != null;
    }

    public void makeRequest(RequestFactory requestfactory, BackoffPolicy backoffpolicy)
    {
        Preconditions.checkNotNull(requestfactory);
        Preconditions.checkNotNull(backoffpolicy);
        cancelRequest();
        b = requestfactory;
        c = backoffpolicy;
        b();
    }
}
