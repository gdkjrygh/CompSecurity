// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;

public final class ImageRequest extends Request
{

    private int mAppUid;
    private final boolean mCacheEnabled;
    private final Context mContext;
    private final Uri mImageUri;
    private final com.android.volley.Response.Listener mListener;
    private int mNetworkClientTag;

    public ImageRequest(Context context, Uri uri, String s, boolean flag, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, int i, 
            int j)
    {
        super(s, errorlistener);
        mContext = context;
        mImageUri = uri;
        mListener = listener;
        mCacheEnabled = flag;
        mNetworkClientTag = i;
        mAppUid = j;
    }

    protected final volatile void deliverResponse(Object obj)
    {
        obj = (byte[])obj;
        mListener.onResponse(obj);
    }

    public final com.android.volley.Request.Priority getPriority()
    {
        return com.android.volley.Request.Priority.LOW;
    }

    protected final Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        Object obj = null;
        if (mImageUri != null)
        {
            obj = mContext.getContentResolver();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("url", getUrl());
            contentvalues.put("image_data", networkresponse.data);
            ((ContentResolver) (obj)).insert(mImageUri, contentvalues);
            return Response.success(networkresponse.data, null);
        }
        byte abyte0[] = networkresponse.data;
        if (mCacheEnabled)
        {
            obj = HttpHeaderParser.parseCacheHeaders(networkresponse);
        }
        return Response.success(abyte0, ((com.android.volley.Cache.Entry) (obj)));
    }
}
