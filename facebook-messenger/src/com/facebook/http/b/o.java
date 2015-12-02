// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.analytics.e.i;
import com.facebook.debug.log.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.http.b:
//            m, p, q, au, 
//            av, l, s

final class o
    implements m
{

    private static final Class a = com/facebook/http/b/o;
    private static final HttpRequestInterceptor b = new p();
    private final HttpClient c;
    private final l d;
    private final Set e;
    private RuntimeException f;
    private volatile s g;

    o(ClientConnectionManager clientconnectionmanager, HttpParams httpparams, l l, HttpRequestRetryHandler httprequestretryhandler, Set set, Set set1, i i)
    {
        f = new IllegalStateException("AndroidHttpClient created and never closed");
        d = l;
        e = set1;
        clientconnectionmanager = new q(this, clientconnectionmanager, httpparams, set);
        clientconnectionmanager.setHttpRequestRetryHandler(httprequestretryhandler);
        c = clientconnectionmanager;
    }

    static l a(o o1)
    {
        return o1.d;
    }

    static String a(HttpUriRequest httpurirequest, boolean flag)
    {
        return b(httpurirequest, flag);
    }

    private HttpHost a(HttpUriRequest httpurirequest)
    {
        Object obj = null;
        URI uri = httpurirequest.getURI();
        httpurirequest = obj;
        if (uri.isAbsolute())
        {
            httpurirequest = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
        }
        return httpurirequest;
    }

    private void a(IOException ioexception, HttpRequest httprequest, HttpContext httpcontext)
    {
        if (ioexception == null && httpcontext.getAttribute("fb_http_retried_exceptions") == null)
        {
            return;
        }
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((au)iterator.next()).a(av.HTTP_CLIENT_EXECUTE, ioexception, httprequest, httpcontext)) { }
        httpcontext.removeAttribute("fb_http_retried_exceptions");
    }

    static s b(o o1)
    {
        return o1.g;
    }

    private static String b(HttpUriRequest httpurirequest, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("curl ");
        Header aheader[] = httpurirequest.getAllHeaders();
        int j = aheader.length;
        int i = 0;
        while (i < j) 
        {
            Header header = aheader[i];
            if (flag || !header.getName().equals("Authorization") && !header.getName().equals("Cookie"))
            {
                stringbuilder.append("--header \"");
                stringbuilder.append(header.toString().trim());
                stringbuilder.append("\" ");
            }
            i++;
        }
        URI uri = httpurirequest.getURI();
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

    static HttpRequestInterceptor b()
    {
        return b;
    }

    public CookieStore a()
    {
        return d;
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
    {
        return execute(httphost, httprequest, responsehandler, null);
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        Object obj;
        com.facebook.debug.log.b.d(a, "This code path should not be called, an exception occurring on Reading the response will result in reporting the failure multiple times. Use FbHttpRequestProcessor");
        obj = httpcontext;
        if (httpcontext == null)
        {
            obj = new BasicHttpContext();
        }
        httpcontext = null;
        httphost = ((HttpHost) (c.execute(httphost, httprequest, responsehandler, ((HttpContext) (obj)))));
        a(null, httprequest, ((HttpContext) (obj)));
        return httphost;
        httphost;
        throw httphost;
        responsehandler;
_L2:
        a(httphost, httprequest, ((HttpContext) (obj)));
        throw responsehandler;
        responsehandler;
        httphost = httpcontext;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        return execute(a(httpurirequest), ((HttpRequest) (httpurirequest)), responsehandler, null);
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        return execute(a(httpurirequest), ((HttpRequest) (httpurirequest)), responsehandler, httpcontext);
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
    {
        return execute(httphost, httprequest, (HttpContext)null);
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
    {
        Object obj;
        Object obj1;
        obj = httpcontext;
        if (httpcontext == null)
        {
            obj = new BasicHttpContext();
        }
        obj1 = null;
        httphost = c.execute(httphost, httprequest, ((HttpContext) (obj)));
        a(null, httprequest, ((HttpContext) (obj)));
        return httphost;
        httphost;
        throw httphost;
        httpcontext;
_L2:
        a(httphost, httprequest, ((HttpContext) (obj)));
        throw httpcontext;
        httpcontext;
        httphost = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
    {
        return execute(a(httpurirequest), ((HttpRequest) (httpurirequest)), (HttpContext)null);
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        return execute(a(httpurirequest), ((HttpRequest) (httpurirequest)), httpcontext);
    }

    protected void finalize()
    {
        super.finalize();
        if (f != null)
        {
            com.facebook.debug.log.b.e(a, "Leak found", f);
            f = null;
        }
    }

    public ClientConnectionManager getConnectionManager()
    {
        return c.getConnectionManager();
    }

    public HttpParams getParams()
    {
        return c.getParams();
    }

}
