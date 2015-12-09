// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher.volley;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher.volley:
//            ImageLoader

public class ImageRequest extends com.android.volley.toolbox.ImageRequest
{

    private static final float IMAGE_BACKOFF_MULT = 2F;
    private static final int IMAGE_MAX_RETRIES = 2;
    private static final boolean LOG_VERBOSE = false;
    private static final String TAG = "nf_ImageRequest";
    private final long mMinimumCacheTtl;
    private final com.android.volley.Request.Priority mPriority;

    public ImageRequest(String s, com.android.volley.Response.Listener listener, int i, int j, android.graphics.Bitmap.Config config, com.android.volley.Response.ErrorListener errorlistener, com.android.volley.Request.Priority priority, 
            int k, long l)
    {
        super(s, listener, i, j, config, errorlistener);
        if (priority != null)
        {
            mPriority = priority;
        } else
        {
            mPriority = com.android.volley.Request.Priority.LOW;
        }
        if (k > 0)
        {
            setRetryPolicy(new DefaultRetryPolicy(k, 2, 2.0F));
        }
        mMinimumCacheTtl = l;
    }

    public String getCacheKey()
    {
        return ImageLoader.getCacheKey(getUrl());
    }

    public com.android.volley.Request.Priority getPriority()
    {
        return mPriority;
    }

    protected Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        networkresponse = super.parseNetworkResponse(networkresponse);
        long l;
        if (networkresponse != null && ((Response) (networkresponse)).error == null && ((Response) (networkresponse)).cacheEntry != null && mMinimumCacheTtl > 0L)
        {
            if ((l = System.currentTimeMillis() + mMinimumCacheTtl) > ((Response) (networkresponse)).cacheEntry.ttl)
            {
                ((Response) (networkresponse)).cacheEntry.ttl = l;
                ((Response) (networkresponse)).cacheEntry.softTtl = l;
                return networkresponse;
            }
        }
        return networkresponse;
    }
}
