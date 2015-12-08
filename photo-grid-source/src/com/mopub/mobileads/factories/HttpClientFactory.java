// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.factories;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

public class HttpClientFactory
{

    public static final int SOCKET_SIZE = 8192;
    private static HttpClientFactory a = new HttpClientFactory();

    public HttpClientFactory()
    {
    }

    private static DefaultHttpClient a(int i)
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        if (i > 0)
        {
            HttpConnectionParams.setConnectionTimeout(basichttpparams, i);
            HttpConnectionParams.setSoTimeout(basichttpparams, i);
        }
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        return new DefaultHttpClient(basichttpparams);
    }

    public static DefaultHttpClient create()
    {
        return a(0);
    }

    public static DefaultHttpClient create(int i)
    {
        return a(i);
    }

    public static void setInstance(HttpClientFactory httpclientfactory)
    {
        a = httpclientfactory;
    }

}
