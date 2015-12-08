// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpAuthenticator;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpsEngine;
import com.squareup.okhttp.internal.http.Policy;
import com.squareup.okhttp.internal.http.RequestHeaders;
import com.squareup.okhttp.internal.http.ResponseHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;

// Referenced classes of package com.squareup.okhttp:
//            Request, MediaType, Response, Connection, 
//            Route, OkHttpClient, Dispatcher

final class Job
    implements Runnable, Policy
{

    private final OkHttpClient client;
    private final Dispatcher dispatcher;
    private Request request;
    private final Response.Receiver responseReceiver;

    public Job(Dispatcher dispatcher1, OkHttpClient okhttpclient, Request request1, Response.Receiver receiver)
    {
        dispatcher = dispatcher1;
        client = okhttpclient;
        request = request1;
        responseReceiver = receiver;
    }

    private Response execute()
        throws IOException
    {
        Object obj2 = null;
        Object obj = null;
        do
        {
            obj2 = newEngine(((Connection) (obj2)));
            Object obj1 = request.body();
            if (obj1 != null)
            {
                MediaType mediatype = ((Request.Body) (obj1)).contentType();
                if (mediatype == null)
                {
                    throw new IllegalStateException("contentType == null");
                }
                if (((HttpEngine) (obj2)).getRequestHeaders().getContentType() == null)
                {
                    ((HttpEngine) (obj2)).getRequestHeaders().setContentType(mediatype.toString());
                }
            }
            ((HttpEngine) (obj2)).sendRequest();
            if (obj1 != null)
            {
                ((Request.Body) (obj1)).writeTo(((HttpEngine) (obj2)).getRequestBody());
            }
            ((HttpEngine) (obj2)).readResponse();
            int i = ((HttpEngine) (obj2)).getResponseCode();
            obj1 = new Dispatcher.RealResponseBody(((HttpEngine) (obj2)).getResponseHeaders(), ((HttpEngine) (obj2)).getResponseBody());
            obj1 = (new Response.Builder(request, i)).rawHeaders(((HttpEngine) (obj2)).getResponseHeaders().getHeaders()).body(((Response.Body) (obj1))).redirectedBy(((Response) (obj))).build();
            Request request1 = processResponse(((HttpEngine) (obj2)), ((Response) (obj1)));
            if (request1 == null)
            {
                ((HttpEngine) (obj2)).automaticallyReleaseConnectionToPool();
                return ((Response) (obj1));
            }
            if (sameConnection(request, request1))
            {
                obj = ((HttpEngine) (obj2)).getConnection();
            } else
            {
                obj = null;
            }
            request = request1;
            obj2 = obj;
            obj = obj1;
        } while (true);
    }

    private Request processResponse(HttpEngine httpengine, Response response)
        throws IOException
    {
        Request request1;
        int i;
        request1 = response.request();
        if (httpengine.getConnection() != null)
        {
            httpengine = httpengine.getConnection().getRoute().getProxy();
        } else
        {
            httpengine = client.getProxy();
        }
        i = response.code();
        i;
        JVM INSTR lookupswitch 7: default 96
    //                   300: 186
    //                   301: 186
    //                   302: 186
    //                   303: 186
    //                   307: 186
    //                   401: 129
    //                   407: 109;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L3 _L4
_L1:
        return null;
_L4:
        if (httpengine.type() != java.net.Proxy.Type.HTTP)
        {
            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
        }
_L3:
        com.squareup.okhttp.internal.http.RawHeaders rawheaders = request1.rawHeaders();
        if (HttpAuthenticator.processAuthHeader(client.getAuthenticator(), response.code(), response.rawHeaders(), rawheaders, httpengine, request.url()))
        {
            httpengine = request1.newBuilder().rawHeaders(rawheaders).build();
        } else
        {
            httpengine = null;
        }
        return httpengine;
_L2:
        httpengine = request1.method();
        if (i != 307 || httpengine.equals("GET") || httpengine.equals("HEAD"))
        {
            httpengine = response.header("Location");
            if (httpengine != null)
            {
                httpengine = new URL(request1.url(), httpengine);
                if (httpengine.getProtocol().equals("https") || httpengine.getProtocol().equals("http"))
                {
                    return request.newBuilder().url(httpengine).build();
                }
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private boolean sameConnection(Request request1, Request request2)
    {
        return request1.url().getHost().equals(request2.url().getHost()) && Util.getEffectivePort(request1.url()) == Util.getEffectivePort(request2.url()) && request1.url().getProtocol().equals(request2.url().getProtocol());
    }

    public int getChunkLength()
    {
        return request.body().contentLength() != -1L ? -1 : 1024;
    }

    public long getFixedContentLength()
    {
        return request.body().contentLength();
    }

    public HttpURLConnection getHttpConnectionToCache()
    {
        return null;
    }

    public long getIfModifiedSince()
    {
        return 0L;
    }

    public URL getURL()
    {
        return request.url();
    }

    public boolean getUseCaches()
    {
        return false;
    }

    HttpEngine newEngine(Connection connection)
        throws IOException
    {
        String s = request.url().getProtocol();
        com.squareup.okhttp.internal.http.RawHeaders rawheaders = request.rawHeaders();
        if (s.equals("http"))
        {
            return new HttpEngine(client, this, request.method(), rawheaders, connection, null);
        }
        if (s.equals("https"))
        {
            return new HttpsEngine(client, this, request.method(), rawheaders, connection, null);
        } else
        {
            throw new AssertionError();
        }
    }

    public void run()
    {
        Response response = execute();
        responseReceiver.onResponse(response);
        dispatcher.finished(this);
        return;
        Object obj;
        obj;
        responseReceiver.onFailure((new Failure.Builder()).request(request).exception(((Throwable) (obj))).build());
        dispatcher.finished(this);
        return;
        obj;
        dispatcher.finished(this);
        throw obj;
    }

    public void setSelectedProxy(Proxy proxy)
    {
    }

    Object tag()
    {
        return request.tag();
    }

    public boolean usingProxy()
    {
        return false;
    }
}
