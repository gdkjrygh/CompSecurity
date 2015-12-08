// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.OkHttpClient;
import java.net.HttpURLConnection;
import java.net.SecureCacheResponse;
import java.net.URL;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpURLConnectionImpl, HttpsURLConnectionImpl, HttpsEngine, HttpEngine

private final class <init> extends HttpURLConnectionImpl
{

    final HttpsURLConnectionImpl this$0;

    public HttpURLConnection getHttpConnectionToCache()
    {
        return HttpsURLConnectionImpl.this;
    }

    public SecureCacheResponse getSecureCacheResponse()
    {
        if (httpEngine instanceof HttpsEngine)
        {
            return (SecureCacheResponse)httpEngine.getCacheResponse();
        } else
        {
            return null;
        }
    }

    private (URL url, OkHttpClient okhttpclient)
    {
        this$0 = HttpsURLConnectionImpl.this;
        super(url, okhttpclient);
    }

    this._cls0(URL url, OkHttpClient okhttpclient, this._cls0 _pcls0)
    {
        this(url, okhttpclient);
    }
}
