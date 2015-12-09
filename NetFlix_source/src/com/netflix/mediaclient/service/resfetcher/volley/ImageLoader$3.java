// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher.volley;

import com.android.volley.VolleyError;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher.volley:
//            ImageLoader

class val.cacheKey
    implements com.android.volley.Listener
{

    final ImageLoader this$0;
    final String val$cacheKey;
    final String val$requestUrl;

    public void onErrorResponse(VolleyError volleyerror)
    {
        LogUtils.reportAssetRequestFailure(val$requestUrl, volleyerror, ImageLoader.access$300(ImageLoader.this));
        ImageLoader.access$500(ImageLoader.this, val$cacheKey, volleyerror);
    }

    ()
    {
        this$0 = final_imageloader;
        val$requestUrl = s;
        val$cacheKey = String.this;
        super();
    }
}
