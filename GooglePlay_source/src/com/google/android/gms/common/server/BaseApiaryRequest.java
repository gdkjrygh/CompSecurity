// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonRequest;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseApiaryRequest extends JsonRequest
{

    private final String TAG = "BaseApiaryRequest";
    public int mAppUid;
    private final HashMap mHeaders;
    private int mNetworkClientTag;
    private final String mOAuthToken;

    protected BaseApiaryRequest(int i, String s, String s1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, String s2, String s3, 
            boolean flag, HashMap hashmap, int j, int k)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = s1.toString();
        }
        super(i, s, s1, listener, errorlistener);
        mOAuthToken = s2;
        mHeaders = hashmap;
        s = mHeaders;
        if (s2 != null)
        {
            s.put("Authorization", (new StringBuilder("OAuth ")).append(s2).toString());
        }
        if (s3 != null)
        {
            s.put("X-Goog-Spatula", s3);
        }
        mHeaders.put("Accept-Encoding", "gzip");
        setShouldCache(flag);
        mNetworkClientTag = j;
        mAppUid = k;
    }

    public void deliverResponse(Object obj)
    {
        super.deliverResponse(obj);
    }

    public Map getHeaders()
    {
        return mHeaders;
    }

    public abstract Response parseNetworkResponse(NetworkResponse networkresponse);
}
