// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.internal;


public class HttpResponse
{

    private String mData;
    private String mResponseBody;
    private int mResponseCode;
    private String mUrl;

    public HttpResponse(int i, String s)
    {
        mResponseCode = i;
        mResponseBody = s;
    }

    protected String getData()
    {
        return mData;
    }

    public String getResponseBody()
    {
        return mResponseBody;
    }

    public int getResponseCode()
    {
        return mResponseCode;
    }

    protected String getUrl()
    {
        return mUrl;
    }

    protected void setData(String s)
    {
        mData = s;
    }

    protected void setUrl(String s)
    {
        mUrl = s;
    }
}
