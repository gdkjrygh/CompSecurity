// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher;


// Referenced classes of package com.netflix.mediaclient.service.resfetcher:
//            ResourceFetcher, ResourceFetcherCallback

class val.resourceUrl
    implements Runnable
{

    final ResourceFetcher this$0;
    final ResourceFetcherCallback val$callback;
    final String val$resourceUrl;

    public void run()
    {
        val$callback.onResourcePrefetched(val$resourceUrl, 0, -2);
    }

    lback()
    {
        this$0 = final_resourcefetcher;
        val$callback = resourcefetchercallback;
        val$resourceUrl = String.this;
        super();
    }
}
