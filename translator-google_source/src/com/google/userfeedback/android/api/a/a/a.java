// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.a.a;

import java.io.ByteArrayOutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.google.userfeedback.android.api.a.a:
//            b, c, e

public final class a
    implements HttpClient
{

    private static final ThreadLocal b = new ThreadLocal();
    private static final HttpRequestInterceptor c = new b();
    RuntimeException a;
    private final HttpClient d;
    private volatile e e;

    private a(ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
    {
        a = new IllegalStateException("AndroidHttpClient_v09 created and never closed");
        d = new c(this, clientconnectionmanager, httpparams);
    }

    public static a a(String s)
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, false);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 20000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 20000);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        HttpClientParams.setRedirecting(basichttpparams, false);
        HttpProtocolParams.setUserAgent(basichttpparams, s);
        s = new SchemeRegistry();
        s.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        s.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        return new a(new ThreadSafeClientConnManager(basichttpparams, s), basichttpparams);
    }

    static e a(a a1)
    {
        return a1.e;
    }

    static String a(HttpUriRequest httpurirequest)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("curl ");
        org.apache.http.Header aheader[] = httpurirequest.getAllHeaders();
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            org.apache.http.Header header = aheader[i];
            stringbuilder.append("--header \"");
            stringbuilder.append(header.toString().trim());
            stringbuilder.append("\" ");
        }

        java.net.URI uri = httpurirequest.getURI();
        if (httpurirequest instanceof RequestWrapper)
        {
            HttpRequest httprequest = ((RequestWrapper)httpurirequest).getOriginal();
            if (httprequest instanceof HttpUriRequest)
            {
                uri = ((HttpUriRequest)httprequest).getURI();
            }
        }
        stringbuilder.append("\"");
        stringbuilder.append(uri);
        stringbuilder.append("\"");
        if (httpurirequest instanceof HttpEntityEnclosingRequest)
        {
            httpurirequest = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
            if (httpurirequest != null && httpurirequest.isRepeatable())
            {
                if (httpurirequest.getContentLength() < 1024L)
                {
                    ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                    httpurirequest.writeTo(bytearrayoutputstream);
                    httpurirequest = bytearrayoutputstream.toString();
                    stringbuilder.append(" --data-ascii \"").append(httpurirequest).append("\"");
                } else
                {
                    stringbuilder.append(" [TOO MUCH DATA TO INCLUDE]");
                }
            }
        }
        return stringbuilder.toString();
    }

    static ThreadLocal a()
    {
        return b;
    }

    static HttpRequestInterceptor b()
    {
        return c;
    }

    public final Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
    {
        return d.execute(httphost, httprequest, responsehandler);
    }

    public final Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        return d.execute(httphost, httprequest, responsehandler, httpcontext);
    }

    public final Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        return d.execute(httpurirequest, responsehandler);
    }

    public final Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        return d.execute(httpurirequest, responsehandler, httpcontext);
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
    {
        return d.execute(httphost, httprequest);
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
    {
        return d.execute(httphost, httprequest, httpcontext);
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest)
    {
        return d.execute(httpurirequest);
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        return d.execute(httpurirequest, httpcontext);
    }

    protected final void finalize()
    {
        super.finalize();
        if (a != null)
        {
            a = null;
        }
    }

    public final ClientConnectionManager getConnectionManager()
    {
        return d.getConnectionManager();
    }

    public final HttpParams getParams()
    {
        return d.getParams();
    }

}
