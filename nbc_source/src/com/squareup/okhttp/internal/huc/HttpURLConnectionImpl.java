// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.huc;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpDate;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RetryableSink;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.StatusLine;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okio.BufferedSink;

public class HttpURLConnectionImpl extends HttpURLConnection
{

    private static final RequestBody EMPTY_REQUEST_BODY = RequestBody.create(null, new byte[0]);
    private static final Set METHODS = new LinkedHashSet(Arrays.asList(new String[] {
        "OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"
    }));
    final OkHttpClient client;
    private long fixedContentLength;
    private int followUpCount;
    Handshake handshake;
    protected HttpEngine httpEngine;
    protected IOException httpEngineFailure;
    private com.squareup.okhttp.Headers.Builder requestHeaders;
    private Headers responseHeaders;
    private Route route;

    public HttpURLConnectionImpl(URL url, OkHttpClient okhttpclient)
    {
        super(url);
        requestHeaders = new com.squareup.okhttp.Headers.Builder();
        fixedContentLength = -1L;
        client = okhttpclient;
    }

    private String defaultUserAgent()
    {
        String s = System.getProperty("http.agent");
        if (s != null)
        {
            return s;
        } else
        {
            return (new StringBuilder()).append("Java").append(System.getProperty("java.version")).toString();
        }
    }

    private boolean execute(boolean flag)
        throws IOException
    {
        Handshake handshake1;
        httpEngine.sendRequest();
        route = httpEngine.getRoute();
        if (httpEngine.getConnection() == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        handshake1 = httpEngine.getConnection().getHandshake();
_L1:
        handshake = handshake1;
        if (flag)
        {
            try
            {
                httpEngine.readResponse();
            }
            catch (RequestException requestexception)
            {
                IOException ioexception = requestexception.getCause();
                httpEngineFailure = ioexception;
                throw ioexception;
            }
            catch (RouteException routeexception)
            {
                HttpEngine httpengine = httpEngine.recover(routeexception);
                if (httpengine != null)
                {
                    httpEngine = httpengine;
                    return false;
                } else
                {
                    IOException ioexception1 = routeexception.getLastConnectException();
                    httpEngineFailure = ioexception1;
                    throw ioexception1;
                }
            }
            catch (IOException ioexception2)
            {
                HttpEngine httpengine1 = httpEngine.recover(ioexception2);
                if (httpengine1 != null)
                {
                    httpEngine = httpengine1;
                    return false;
                } else
                {
                    httpEngineFailure = ioexception2;
                    throw ioexception2;
                }
            }
        }
        return true;
        handshake1 = null;
          goto _L1
    }

    private Headers getHeaders()
        throws IOException
    {
        if (responseHeaders == null)
        {
            Response response = getResponse().getResponse();
            responseHeaders = response.headers().newBuilder().add((new StringBuilder()).append(Platform.get().getPrefix()).append("-Response-Source").toString(), responseSourceHeader(response)).build();
        }
        return responseHeaders;
    }

    private HttpEngine getResponse()
        throws IOException
    {
        initHttpEngine();
        if (httpEngine.hasResponse())
        {
            return httpEngine;
        }
        do
        {
            while (!execute(true)) ;
            Response response = httpEngine.getResponse();
            Request request = httpEngine.followUpRequest();
            if (request == null)
            {
                httpEngine.releaseConnection();
                return httpEngine;
            }
            int i = followUpCount + 1;
            followUpCount = i;
            if (i > 20)
            {
                throw new ProtocolException((new StringBuilder()).append("Too many follow-up requests: ").append(followUpCount).toString());
            }
            url = request.url();
            requestHeaders = request.headers().newBuilder();
            okio.Sink sink = httpEngine.getRequestBody();
            if (!request.method().equals(method))
            {
                sink = null;
            }
            if (sink != null && !(sink instanceof RetryableSink))
            {
                throw new HttpRetryException("Cannot retry streamed HTTP body", responseCode);
            }
            if (!httpEngine.sameConnection(request.url()))
            {
                httpEngine.releaseConnection();
            }
            Connection connection = httpEngine.close();
            httpEngine = newHttpEngine(request.method(), connection, (RetryableSink)sink, response);
        } while (true);
    }

    private void initHttpEngine()
        throws IOException
    {
        if (httpEngineFailure != null)
        {
            throw httpEngineFailure;
        }
        if (httpEngine != null)
        {
            return;
        }
        connected = true;
        if (!doOutput) goto _L2; else goto _L1
_L1:
        if (!method.equals("GET")) goto _L4; else goto _L3
_L3:
        method = "POST";
_L2:
        httpEngine = newHttpEngine(method, null, null, null);
        return;
        IOException ioexception;
        ioexception;
        httpEngineFailure = ioexception;
        throw ioexception;
_L4:
        if (HttpMethod.permitsRequestBody(method)) goto _L2; else goto _L5
_L5:
        throw new ProtocolException((new StringBuilder()).append(method).append(" does not support writing").toString());
    }

    private HttpEngine newHttpEngine(String s, Connection connection, RetryableSink retryablesink, Response response)
    {
        Object obj;
        Object obj1;
        int i;
        if (HttpMethod.requiresRequestBody(s))
        {
            obj = EMPTY_REQUEST_BODY;
        } else
        {
            obj = null;
        }
        obj = (new com.squareup.okhttp.Request.Builder()).url(getURL()).method(s, ((RequestBody) (obj)));
        obj1 = requestHeaders.build();
        i = 0;
        for (int j = ((Headers) (obj1)).size(); i < j; i++)
        {
            ((com.squareup.okhttp.Request.Builder) (obj)).addHeader(((Headers) (obj1)).name(i), ((Headers) (obj1)).value(i));
        }

        boolean flag1 = false;
        boolean flag = false;
        if (HttpMethod.permitsRequestBody(s))
        {
            if (fixedContentLength != -1L)
            {
                ((com.squareup.okhttp.Request.Builder) (obj)).header("Content-Length", Long.toString(fixedContentLength));
            } else
            if (chunkLength > 0)
            {
                ((com.squareup.okhttp.Request.Builder) (obj)).header("Transfer-Encoding", "chunked");
            } else
            {
                flag = true;
            }
            flag1 = flag;
            if (((Headers) (obj1)).get("Content-Type") == null)
            {
                ((com.squareup.okhttp.Request.Builder) (obj)).header("Content-Type", "application/x-www-form-urlencoded");
                flag1 = flag;
            }
        }
        if (((Headers) (obj1)).get("User-Agent") == null)
        {
            ((com.squareup.okhttp.Request.Builder) (obj)).header("User-Agent", defaultUserAgent());
        }
        obj1 = ((com.squareup.okhttp.Request.Builder) (obj)).build();
        obj = client;
        s = ((String) (obj));
        if (Internal.instance.internalCache(((OkHttpClient) (obj))) != null)
        {
            s = ((String) (obj));
            if (!getUseCaches())
            {
                s = client.clone().setCache(null);
            }
        }
        return new HttpEngine(s, ((Request) (obj1)), flag1, true, false, connection, null, retryablesink, response);
    }

    private static String responseSourceHeader(Response response)
    {
        if (response.networkResponse() == null)
        {
            if (response.cacheResponse() == null)
            {
                return "NONE";
            } else
            {
                return (new StringBuilder()).append("CACHE ").append(response.code()).toString();
            }
        }
        if (response.cacheResponse() == null)
        {
            return (new StringBuilder()).append("NETWORK ").append(response.code()).toString();
        } else
        {
            return (new StringBuilder()).append("CONDITIONAL_CACHE ").append(response.networkResponse().code()).toString();
        }
    }

    private void setProtocols(String s, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            arraylist.addAll(client.getProtocols());
        }
        s = s.split(",", -1);
        int j = s.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = s[i];
            try
            {
                arraylist.add(Protocol.get(s1));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalStateException(s);
            }
            i++;
        }
        client.setProtocols(arraylist);
    }

    public final void addRequestProperty(String s, String s1)
    {
        if (connected)
        {
            throw new IllegalStateException("Cannot add request property after connection is made");
        }
        if (s == null)
        {
            throw new NullPointerException("field == null");
        }
        if (s1 == null)
        {
            Platform.get().logW((new StringBuilder()).append("Ignoring header ").append(s).append(" because its value was null.").toString());
            return;
        }
        if ("X-Android-Transports".equals(s) || "X-Android-Protocols".equals(s))
        {
            setProtocols(s1, true);
            return;
        } else
        {
            requestHeaders.add(s, s1);
            return;
        }
    }

    public final void connect()
        throws IOException
    {
        initHttpEngine();
        while (!execute(false)) ;
    }

    public final void disconnect()
    {
        if (httpEngine == null)
        {
            return;
        } else
        {
            httpEngine.disconnect();
            return;
        }
    }

    public int getConnectTimeout()
    {
        return client.getConnectTimeout();
    }

    public final InputStream getErrorStream()
    {
        Object obj = null;
        InputStream inputstream;
        HttpEngine httpengine;
        try
        {
            httpengine = getResponse();
        }
        catch (IOException ioexception)
        {
            return null;
        }
        inputstream = obj;
        if (!HttpEngine.hasBody(httpengine.getResponse()))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        inputstream = obj;
        if (httpengine.getResponse().code() >= 400)
        {
            inputstream = httpengine.getResponse().body().byteStream();
        }
        return inputstream;
    }

    public final String getHeaderField(int i)
    {
        String s;
        try
        {
            s = getHeaders().value(i);
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return s;
    }

    public final String getHeaderField(String s)
    {
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        return StatusLine.get(getResponse().getResponse()).toString();
        s = getHeaders().get(s);
        return s;
        s;
        return null;
    }

    public final String getHeaderFieldKey(int i)
    {
        String s;
        try
        {
            s = getHeaders().name(i);
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return s;
    }

    public final Map getHeaderFields()
    {
        Map map;
        try
        {
            map = OkHeaders.toMultimap(getHeaders(), StatusLine.get(getResponse().getResponse()).toString());
        }
        catch (IOException ioexception)
        {
            return Collections.emptyMap();
        }
        return map;
    }

    public final InputStream getInputStream()
        throws IOException
    {
        if (!doInput)
        {
            throw new ProtocolException("This protocol does not support input");
        }
        HttpEngine httpengine = getResponse();
        if (getResponseCode() >= 400)
        {
            throw new FileNotFoundException(url.toString());
        } else
        {
            return httpengine.getResponse().body().byteStream();
        }
    }

    public final OutputStream getOutputStream()
        throws IOException
    {
        connect();
        BufferedSink bufferedsink = httpEngine.getBufferedRequestBody();
        if (bufferedsink == null)
        {
            throw new ProtocolException((new StringBuilder()).append("method does not support a request body: ").append(method).toString());
        }
        if (httpEngine.hasResponse())
        {
            throw new ProtocolException("cannot write request body after response has been read");
        } else
        {
            return bufferedsink.outputStream();
        }
    }

    public final Permission getPermission()
        throws IOException
    {
        String s = getURL().getHost();
        int i = Util.getEffectivePort(getURL());
        if (usingProxy())
        {
            InetSocketAddress inetsocketaddress = (InetSocketAddress)client.getProxy().address();
            s = inetsocketaddress.getHostName();
            i = inetsocketaddress.getPort();
        }
        return new SocketPermission((new StringBuilder()).append(s).append(":").append(i).toString(), "connect, resolve");
    }

    public int getReadTimeout()
    {
        return client.getReadTimeout();
    }

    public final Map getRequestProperties()
    {
        if (connected)
        {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        } else
        {
            return OkHeaders.toMultimap(requestHeaders.build(), null);
        }
    }

    public final String getRequestProperty(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return requestHeaders.get(s);
        }
    }

    public final int getResponseCode()
        throws IOException
    {
        return getResponse().getResponse().code();
    }

    public String getResponseMessage()
        throws IOException
    {
        return getResponse().getResponse().message();
    }

    public void setConnectTimeout(int i)
    {
        client.setConnectTimeout(i, TimeUnit.MILLISECONDS);
    }

    public void setFixedLengthStreamingMode(int i)
    {
        setFixedLengthStreamingMode(i);
    }

    public void setFixedLengthStreamingMode(long l)
    {
        if (super.connected)
        {
            throw new IllegalStateException("Already connected");
        }
        if (chunkLength > 0)
        {
            throw new IllegalStateException("Already in chunked mode");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("contentLength < 0");
        } else
        {
            fixedContentLength = l;
            super.fixedContentLength = (int)Math.min(l, 0x7fffffffL);
            return;
        }
    }

    public void setIfModifiedSince(long l)
    {
        super.setIfModifiedSince(l);
        if (ifModifiedSince != 0L)
        {
            requestHeaders.set("If-Modified-Since", HttpDate.format(new Date(ifModifiedSince)));
            return;
        } else
        {
            requestHeaders.removeAll("If-Modified-Since");
            return;
        }
    }

    public void setInstanceFollowRedirects(boolean flag)
    {
        client.setFollowRedirects(flag);
    }

    public void setReadTimeout(int i)
    {
        client.setReadTimeout(i, TimeUnit.MILLISECONDS);
    }

    public void setRequestMethod(String s)
        throws ProtocolException
    {
        if (!METHODS.contains(s))
        {
            throw new ProtocolException((new StringBuilder()).append("Expected one of ").append(METHODS).append(" but was ").append(s).toString());
        } else
        {
            method = s;
            return;
        }
    }

    public final void setRequestProperty(String s, String s1)
    {
        if (connected)
        {
            throw new IllegalStateException("Cannot set request property after connection is made");
        }
        if (s == null)
        {
            throw new NullPointerException("field == null");
        }
        if (s1 == null)
        {
            Platform.get().logW((new StringBuilder()).append("Ignoring header ").append(s).append(" because its value was null.").toString());
            return;
        }
        if ("X-Android-Transports".equals(s) || "X-Android-Protocols".equals(s))
        {
            setProtocols(s1, false);
            return;
        } else
        {
            requestHeaders.set(s, s1);
            return;
        }
    }

    public final boolean usingProxy()
    {
        Proxy proxy;
        if (route != null)
        {
            proxy = route.getProxy();
        } else
        {
            proxy = client.getProxy();
        }
        return proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT;
    }

}
