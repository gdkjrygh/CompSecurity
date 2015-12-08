// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.Context;
import com.aetn.history.android.historyhere.utils.LruBitmapCache;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

public class HttpRequestManager
{

    private static HttpRequestManager mInstance;
    private Context mContext;
    private ImageLoader mImageLoader;
    private RequestQueue mRequestQueue;

    public HttpRequestManager(Context context)
    {
        mContext = context;
    }

    public static HttpRequestManager getInstance(Context context)
    {
        com/aetn/history/android/historyhere/model/HttpRequestManager;
        JVM INSTR monitorenter ;
        if (mInstance == null)
        {
            mInstance = new HttpRequestManager(context);
        }
        context = mInstance;
        com/aetn/history/android/historyhere/model/HttpRequestManager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public ImageLoader getImageLoader()
    {
        if (mImageLoader == null)
        {
            mImageLoader = new ImageLoader(mRequestQueue, new LruBitmapCache(LruBitmapCache.getCacheSize(mContext)));
        }
        return mImageLoader;
    }

    public RequestQueue getRequestQueue()
    {
        if (mRequestQueue == null)
        {
            mRequestQueue = Volley.newRequestQueue(mContext);
        }
        return mRequestQueue;
    }
}
