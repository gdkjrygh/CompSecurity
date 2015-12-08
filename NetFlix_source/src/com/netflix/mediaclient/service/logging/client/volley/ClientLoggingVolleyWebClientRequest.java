// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.volley;

import com.android.volley.AuthFailureError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.volley.VolleyWebClientRequest;
import java.util.Map;

public abstract class ClientLoggingVolleyWebClientRequest extends VolleyWebClientRequest
{

    private static final String TAG = "nf_volleyrequest";

    protected ClientLoggingVolleyWebClientRequest()
    {
        super(1);
    }

    public byte[] getBody()
    {
        byte abyte0[];
        try
        {
            abyte0 = getPayload().getBytes("UTF-8");
        }
        catch (Exception exception)
        {
            Log.e("nf_volleyrequest", "Failed to create body of client logging request", exception);
            return null;
        }
        return abyte0;
    }

    public String getBodyContentType()
    {
        return "application/json";
    }

    public Map getHeaders()
        throws AuthFailureError
    {
        Map map = super.getHeaders();
        map.put("X-Netflix.ichnaea.request.type", "UiRequest");
        return map;
    }

    protected String getMethodType()
    {
        return "post";
    }

    protected abstract String getPayload();

    public byte[] getPostBody()
    {
        return getBody();
    }

    public String getPostBodyContentType()
    {
        return getBodyContentType();
    }

    protected String getUrl(String s)
    {
        storeReqNetflixId(getCurrentNetflixId());
        if (Log.isLoggable("nf_volleyrequest", 2))
        {
            Log.v("nf_volleyrequest", (new StringBuilder()).append("ClientLoggingVolleyWebClientReques URL = ").append(s).toString());
        }
        return s;
    }
}
