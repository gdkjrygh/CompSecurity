// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher.volley;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcherCallback;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher.volley:
//            ImageLoader

public class PrefetchResourceRequest extends Request
{

    private static final float IMAGE_BACKOFF_MULT = 2F;
    private static final int IMAGE_MAX_RETRIES = 2;
    private final ResourceFetcherCallback mCallback;

    public PrefetchResourceRequest(String s, ResourceFetcherCallback resourcefetchercallback, com.android.volley.Response.ErrorListener errorlistener, int i)
    {
        super(0, s, errorlistener);
        mCallback = resourcefetchercallback;
        setShouldCache(true);
        setRetryPolicy(new DefaultRetryPolicy(i, 2, 2.0F));
    }

    protected void deliverResponse(Integer integer)
    {
        if (mCallback != null)
        {
            mCallback.onResourcePrefetched(getUrl(), integer.intValue(), 0);
        }
    }

    protected volatile void deliverResponse(Object obj)
    {
        deliverResponse((Integer)obj);
    }

    public String getCacheKey()
    {
        return ImageLoader.getCacheKey(getUrl());
    }

    public com.android.volley.Request.Priority getPriority()
    {
        return com.android.volley.Request.Priority.LOW;
    }

    protected Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        return Response.success(Integer.valueOf(networkresponse.data.length), HttpHeaderParser.parseCacheHeaders(networkresponse));
    }
}
