// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.http;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HttpUrlConnectionFactory
{

    private final OkHttpClient okHttpClient;

    HttpUrlConnectionFactory(OkHttpClient okhttpclient)
    {
        okHttpClient = okhttpclient;
        okHttpClient.setConnectTimeout(20L, TimeUnit.SECONDS);
        okHttpClient.setReadTimeout(60L, TimeUnit.SECONDS);
    }

    public final HttpURLConnection get(URL url)
    {
        return (new OkUrlFactory(okHttpClient)).open(url);
    }
}
