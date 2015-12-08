// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.TunnelRequest;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.CacheResponse;
import java.net.SecureCacheResponse;
import java.net.URL;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpEngine, RequestHeaders, Policy, RawHeaders, 
//            RetryableOutputStream

public final class HttpsEngine extends HttpEngine
{

    private SSLSocket sslSocket;

    public HttpsEngine(OkHttpClient okhttpclient, Policy policy, String s, RawHeaders rawheaders, Connection connection, RetryableOutputStream retryableoutputstream)
        throws IOException
    {
        super(okhttpclient, policy, s, rawheaders, connection, retryableoutputstream);
        if (connection != null)
        {
            okhttpclient = (SSLSocket)connection.getSocket();
        } else
        {
            okhttpclient = null;
        }
        sslSocket = okhttpclient;
    }

    protected boolean acceptCacheResponseType(CacheResponse cacheresponse)
    {
        return cacheresponse instanceof SecureCacheResponse;
    }

    protected void connected(Connection connection)
    {
        sslSocket = (SSLSocket)connection.getSocket();
    }

    public SSLSocket getSslSocket()
    {
        return sslSocket;
    }

    protected TunnelRequest getTunnelConfig()
    {
        Object obj = requestHeaders.getUserAgent();
        String s = ((String) (obj));
        if (obj == null)
        {
            s = getDefaultUserAgent();
        }
        obj = policy.getURL();
        return new TunnelRequest(((URL) (obj)).getHost(), Util.getEffectivePort(((URL) (obj))), s, requestHeaders.getProxyAuthorization());
    }

    protected boolean includeAuthorityInRequestLine()
    {
        return false;
    }
}
