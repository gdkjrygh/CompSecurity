// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.volley;

import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.ClientLoggingWebCallback;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.volley:
//            ClientLoggingVolleyWebClientRequest

public class LoggingEventsRequest extends ClientLoggingVolleyWebClientRequest
{

    private static final String TAG = "nf_log";
    private ClientLoggingWebCallback mCallback;
    private String mDeliveryRequestId;
    private String mLoggingRequest;

    public LoggingEventsRequest(String s, String s1, ClientLoggingWebCallback clientloggingwebcallback)
    {
        mCallback = clientloggingwebcallback;
        mDeliveryRequestId = s;
        mLoggingRequest = s1;
    }

    protected String getPayload()
    {
        return mLoggingRequest;
    }

    protected void onFailure(int i)
    {
        mCallback.onEventsDeliveryFailed(mDeliveryRequestId);
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    protected void onSuccess(String s)
    {
        mCallback.onEventsDelivered(mDeliveryRequestId);
    }

    protected volatile Object parseResponse(String s)
        throws VolleyError
    {
        return parseResponse(s);
    }

    protected String parseResponse(String s)
        throws VolleyError
    {
        if (Log.isLoggable("nf_log", 2))
        {
            Log.v("nf_log", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        return "OK";
    }
}
