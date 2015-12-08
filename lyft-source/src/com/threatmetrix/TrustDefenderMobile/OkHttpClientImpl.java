// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.util.Log;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            TDHttpClient, StringUtils, OkHttpURLConnectionImpl, ProxyWrapper, 
//            CancelState, TDURLConnection

class OkHttpClientImpl
    implements TDHttpClient
{

    private static final GzipRequestInterceptor c = new GzipRequestInterceptor();
    private static final String d = StringUtils.a(com/threatmetrix/TrustDefenderMobile/OkHttpClientImpl);
    OkHttpClient a;
    String b;

    OkHttpClientImpl()
    {
    }

    public OkHttpClient a()
    {
        return a;
    }

    public TDURLConnection a(CancelState cancelstate)
    {
        return new OkHttpURLConnectionImpl(this, cancelstate);
    }

    public void a(Context context, int i, String s, boolean flag)
    {
        Log.d(d, "Creating OkHttpClient instance");
        a = new OkHttpClient();
        a.setConnectTimeout(i, TimeUnit.MILLISECONDS);
        a.setWriteTimeout(i, TimeUnit.MILLISECONDS);
        a.setReadTimeout(i, TimeUnit.MILLISECONDS);
        a.setFollowRedirects(true);
        a.setFollowSslRedirects(true);
        a.setConnectionPool(new ConnectionPool(3, 30000L));
        b = s;
        context = new ProxyWrapper();
        if (context.a() != null)
        {
            a.setProxy(new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(context.a(), context.b())));
        }
        if (flag)
        {
            a.interceptors().add(c);
        }
        context = new ArrayList();
        context.add(Protocol.HTTP_1_1);
        a.setProtocols(context);
        a.setRetryOnConnectionFailure(true);
    }

    public void a(Executor executor)
    {
        if (a != null)
        {
            executor = a.getConnectionPool();
            if (executor != null)
            {
                Log.d(d, (new StringBuilder()).append("Evicting ").append(executor.getConnectionCount()).append(" connections").toString());
                executor.evictAll();
            }
        }
    }

    public String b()
    {
        return b;
    }


    private class GzipRequestInterceptor
        implements Interceptor
    {

        private RequestBody a(RequestBody requestbody)
        {
            return new RequestBody(requestbody) {

                final RequestBody a;
                final GzipRequestInterceptor b;

                public long contentLength()
                {
                    return -1L;
                }

                public MediaType contentType()
                {
                    return a.contentType();
                }

                public void writeTo(BufferedSink bufferedsink)
                {
                    bufferedsink = Okio.buffer(new GzipSink(bufferedsink));
                    a.writeTo(bufferedsink);
                    bufferedsink.close();
                }

                
                {
                    b = GzipRequestInterceptor.this;
                    a = requestbody;
                    super();
                }
            };
        }

        public Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
        {
            Request request = chain.request();
            if (request.body() == null || request.header("Content-Encoding") != null)
            {
                return chain.proceed(request);
            } else
            {
                return chain.proceed(request.newBuilder().header("Content-Encoding", "gzip").method(request.method(), a(request.body())).build());
            }
        }

        GzipRequestInterceptor()
        {
        }
    }

}
