// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.android.volley.VolleyError;

public class ByteApiResponseHandler
    implements com.android.volley.Response.ErrorListener, com.android.volley.Response.Listener
{

    protected String _baseUrl;
    protected String _method;

    public ByteApiResponseHandler()
    {
        _method = "GET";
    }

    public String getBaseUrl()
    {
        return _baseUrl;
    }

    public String getMethod()
    {
        return _method;
    }

    public void onErrorResponse(VolleyError volleyerror)
    {
    }

    public volatile void onResponse(Object obj)
    {
        onResponse((byte[])obj);
    }

    public void onResponse(byte abyte0[])
    {
    }

    public void onStart()
    {
    }

    public void setBaseUrl(String s)
    {
        _baseUrl = s;
    }

    public void setMethod(String s)
    {
        _method = s;
    }
}
