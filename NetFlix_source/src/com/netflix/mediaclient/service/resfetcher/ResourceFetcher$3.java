// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher;

import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher:
//            ResourceFetcher, ResourceFetcherCallback

class val.resourceUrl
    implements com.android.volley.ener
{

    final ResourceFetcher this$0;
    final ResourceFetcherCallback val$realCallback;
    final String val$resourceUrl;

    public void onErrorResponse(VolleyError volleyerror)
    {
        Log.e("nf_service_resourcefetcher", "PrefetchRequest failed: ", volleyerror);
        if (val$realCallback != null)
        {
            val$realCallback.onResourcePrefetched(val$resourceUrl, 0, -3);
        }
    }

    lback()
    {
        this$0 = final_resourcefetcher;
        val$realCallback = resourcefetchercallback;
        val$resourceUrl = String.this;
        super();
    }
}
