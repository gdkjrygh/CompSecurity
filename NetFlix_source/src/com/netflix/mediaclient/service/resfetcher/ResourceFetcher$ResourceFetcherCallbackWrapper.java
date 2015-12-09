// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher;

import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher:
//            ResourceFetcherCallback, ResourceFetcher

private class <init>
    implements ResourceFetcherCallback
{

    private ResourceFetcherCallback mCallback;
    final ResourceFetcher this$0;

    public void onResourceFetched(String s, String s1, int i)
    {
        LogUtils.reportAssetRequestResult(s, i, ResourceFetcher.access$100(ResourceFetcher.this).getClientLogging().getApplicationPerformanceMetricsLogging());
        mCallback.onResourceFetched(s, s1, i);
    }

    public void onResourcePrefetched(String s, int i, int j)
    {
        LogUtils.reportAssetRequestResult(s, j, ResourceFetcher.access$200(ResourceFetcher.this).getClientLogging().getApplicationPerformanceMetricsLogging());
        mCallback.onResourcePrefetched(s, i, j);
    }

    private (ResourceFetcherCallback resourcefetchercallback)
    {
        this$0 = ResourceFetcher.this;
        super();
        if (resourcefetchercallback == null)
        {
            throw new IllegalArgumentException("Callback can not be null");
        } else
        {
            mCallback = resourcefetchercallback;
            return;
        }
    }

    mCallback(ResourceFetcherCallback resourcefetchercallback, mCallback mcallback)
    {
        this(resourcefetchercallback);
    }
}
