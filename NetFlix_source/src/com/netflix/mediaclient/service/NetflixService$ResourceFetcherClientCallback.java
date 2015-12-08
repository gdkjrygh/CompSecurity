// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.resfetcher.LoggingResourceFetcherCallback;
import com.netflix.mediaclient.servicemgr.INetflixServiceCallback;

// Referenced classes of package com.netflix.mediaclient.service:
//            NetflixService

private class requestId extends LoggingResourceFetcherCallback
{

    private final int clientId;
    private final int requestId;
    final NetflixService this$0;

    public void onResourceFetched(String s, String s1, int i)
    {
        super.onResourceFetched(s, s1, i);
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onResourceFetched");
            return;
        } else
        {
            inetflixservicecallback.onResourceFetched(requestId, s, s1, i);
            return;
        }
    }

    (int i, int j)
    {
        this$0 = NetflixService.this;
        super();
        clientId = i;
        requestId = j;
    }
}
