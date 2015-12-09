// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonRequest;
import java.util.HashMap;
import java.util.Map;

public final class NoResponseRequest extends JsonRequest
{

    private int mAppUid;
    private final HashMap mHeaders;
    private int mNetworkClientTag;
    private final String mOAuthToken;

    public NoResponseRequest(int i, String s, Object obj, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, String s1, HashMap hashmap, 
            int j, int k)
    {
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = obj.toString();
        }
        super(i, s, ((String) (obj)), listener, errorlistener);
        mOAuthToken = s1;
        mHeaders = hashmap;
        if (mOAuthToken != null)
        {
            mHeaders.put("Authorization", (new StringBuilder("OAuth ")).append(mOAuthToken).toString());
        }
        mHeaders.put("Accept-Encoding", "gzip");
        setRetryPolicy(new DefaultRetryPolicy(10000, 1, 1.0F));
        mNetworkClientTag = j;
        mAppUid = k;
    }

    public final Map getHeaders()
        throws AuthFailureError
    {
        return mHeaders;
    }

    protected final Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        return Response.success(null, null);
    }
}
