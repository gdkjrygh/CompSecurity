// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher.volley;

import android.graphics.Bitmap;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher.volley:
//            ImageLoader

class val.cacheKey
    implements com.android.volley.ner
{

    final ImageLoader this$0;
    final String val$cacheKey;
    final String val$requestUrl;

    public void onResponse(Bitmap bitmap)
    {
        LogUtils.reportAssetRequestResult(val$requestUrl, 0, ImageLoader.access$300(ImageLoader.this));
        ImageLoader.access$400(ImageLoader.this, val$cacheKey, bitmap);
    }

    public volatile void onResponse(Object obj)
    {
        onResponse((Bitmap)obj);
    }

    ()
    {
        this$0 = final_imageloader;
        val$requestUrl = s;
        val$cacheKey = String.this;
        super();
    }
}
