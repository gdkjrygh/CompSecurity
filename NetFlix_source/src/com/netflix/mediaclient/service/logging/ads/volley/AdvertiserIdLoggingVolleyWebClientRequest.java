// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads.volley;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.ads.AdvertiserIdLoggingCallback;
import com.netflix.mediaclient.service.logging.client.volley.ClientLoggingVolleyWebClientRequest;
import java.util.Map;

public final class AdvertiserIdLoggingVolleyWebClientRequest extends ClientLoggingVolleyWebClientRequest
{

    private static final String TAG = "nf_volleyrequest";
    private AdvertiserIdLoggingCallback mCallback;
    private String mPayload;

    protected AdvertiserIdLoggingVolleyWebClientRequest(String s, AdvertiserIdLoggingCallback advertiseridloggingcallback)
    {
        mPayload = s;
        mCallback = advertiseridloggingcallback;
    }

    public Map getHeaders()
        throws AuthFailureError
    {
        Map map = super.getHeaders();
        map.put("X-Netflix.ichnaea.request.type", "IchnaeaRequest");
        return map;
    }

    protected String getPayload()
    {
        return mPayload;
    }

    protected void onFailure(int i)
    {
        if (Log.isLoggable("nf_volleyrequest", 3))
        {
            Log.d("nf_volleyrequest", (new StringBuilder()).append("Advertiser ID and opt in startus failed to be delivered. Status code returned").append(i).toString());
        }
        if (mCallback != null)
        {
            mCallback.onFailure();
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    protected void onSuccess(String s)
    {
        if (Log.isLoggable("nf_volleyrequest", 3))
        {
            Log.d("nf_volleyrequest", (new StringBuilder()).append("Advertiser ID and opt in startus delivered ").append(s).toString());
        }
        if (mCallback != null)
        {
            mCallback.onSuccess();
        }
    }

    protected volatile Object parseResponse(String s)
        throws VolleyError
    {
        return parseResponse(s);
    }

    protected String parseResponse(String s)
        throws VolleyError
    {
        if (Log.isLoggable("nf_volleyrequest", 2))
        {
            Log.v("nf_volleyrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        return "OK";
    }
}
