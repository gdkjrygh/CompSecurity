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
import com.squareup.okhttp.internal.http.RetryableSink;
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

    private static final Set e = new LinkedHashSet(Arrays.asList(new String[] {
        "OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"
    }));
    final OkHttpClient a;
    protected IOException b;
    protected HttpEngine c;
    Handshake d;
    private com.squareup.okhttp.Headers.Builder f;
    private long g;
    private int h;
    private Headers i;
    private Route j;

    public HttpURLConnectionImpl(URL url, OkHttpClient okhttpclient)
    {
        super(url);
        f = new com.squareup.okhttp.Headers.Builder();
        g = -1L;
        a = okhttpclient;
    }

    private Headers a()
    {
        if (i == null)
        {
            Object obj = c().h();
            com.squareup.okhttp.Headers.Builder builder = ((Response) (obj)).f().b();
            Object obj1 = new StringBuilder();
            Platform.a();
            obj1 = ((StringBuilder) (obj1)).append(Platform.b()).append("-Response-Source").toString();
            if (((Response) (obj)).i() == null)
            {
                if (((Response) (obj)).j() == null)
                {
                    obj = "NONE";
                } else
                {
                    obj = (new StringBuilder("CACHE ")).append(((Response) (obj)).c()).toString();
                }
            } else
            if (((Response) (obj)).j() == null)
            {
                obj = (new StringBuilder("NETWORK ")).append(((Response) (obj)).c()).toString();
            } else
            {
                obj = (new StringBuilder("CONDITIONAL_CACHE ")).append(((Response) (obj)).i().c()).toString();
            }
            i = builder.a(((String) (obj1)), ((String) (obj))).a();
        }
        return i;
    }

    private HttpEngine a(String s, Connection connection, RetryableSink retryablesink, Response response)
    {
        Object obj = (new com.squareup.okhttp.Request.Builder()).a(getURL()).a(s, null);
        Object obj1 = f.a();
        int k = 0;
        for (int l = ((Headers) (obj1)).a(); k < l; k++)
        {
            ((com.squareup.okhttp.Request.Builder) (obj)).b(((Headers) (obj1)).a(k), ((Headers) (obj1)).b(k));
        }

        boolean flag1 = false;
        boolean flag = false;
        if (HttpMethod.b(s))
        {
            if (g != -1L)
            {
                ((com.squareup.okhttp.Request.Builder) (obj)).a("Content-Length", Long.toString(g));
            } else
            if (chunkLength > 0)
            {
                ((com.squareup.okhttp.Request.Builder) (obj)).a("Transfer-Encoding", "chunked");
            } else
            {
                flag = true;
            }
            flag1 = flag;
            if (((Headers) (obj1)).a("Content-Type") == null)
            {
                ((com.squareup.okhttp.Request.Builder) (obj)).a("Content-Type", "application/x-www-form-urlencoded");
                flag1 = flag;
            }
        }
        if (((Headers) (obj1)).a("User-Agent") == null)
        {
            s = System.getProperty("http.agent");
            if (s == null)
            {
                s = (new StringBuilder("Java")).append(System.getProperty("java.version")).toString();
            }
            ((com.squareup.okhttp.Request.Builder) (obj)).a("User-Agent", s);
        }
        obj1 = ((com.squareup.okhttp.Request.Builder) (obj)).a();
        obj = a;
        s = ((String) (obj));
        if (Internal.b.a(((OkHttpClient) (obj))) != null)
        {
            s = ((String) (obj));
            if (!getUseCaches())
            {
                s = a.y().a(null);
            }
        }
        return new HttpEngine(s, ((Request) (obj1)), flag1, true, false, connection, null, retryablesink, response);
    }

    private void a(String s, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            arraylist.addAll(a.t());
        }
        s = s.split(",", -1);
        int l = s.length;
        int k = 0;
        while (k < l) 
        {
            String s1 = s[k];
            try
            {
                arraylist.add(Protocol.a(s1));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalStateException(s);
            }
            k++;
        }
        a.a(arraylist);
    }

    private boolean a(boolean flag)
    {
        Handshake handshake;
        c.a();
        j = c.j();
        if (c.i() == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        handshake = c.i().i();
_L1:
        d = handshake;
        if (flag)
        {
            try
            {
                c.n();
            }
            catch (IOException ioexception)
            {
                HttpEngine httpengine = c.a(ioexception);
                if (httpengine != null)
                {
                    c = httpengine;
                    return false;
                } else
                {
                    b = ioexception;
                    throw ioexception;
                }
            }
        }
        return true;
        handshake = null;
          goto _L1
    }

    private void b()
    {
        if (b != null)
        {
            throw b;
        }
        if (c != null)
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
        c = a(method, null, null, null);
        return;
        IOException ioexception;
        ioexception;
        b = ioexception;
        throw ioexception;
_L4:
        if (HttpMethod.b(method)) goto _L2; else goto _L5
_L5:
        throw new ProtocolException((new StringBuilder()).append(method).append(" does not support writing").toString());
    }

    private HttpEngine c()
    {
        b();
        if (c.f())
        {
            return c;
        }
        do
        {
            while (!a(true)) ;
            response = c.h();
            request = c.o();
            if (request == null)
            {
                c.k();
                return c;
            }
            int k = h + 1;
            h = k;
            if (k > 20)
            {
                throw new ProtocolException((new StringBuilder("Too many follow-up requests: ")).append(h).toString());
            }
            url = request.a();
            f = request.e().b();
            sink = c.d();
            if (!request.d().equals(method))
            {
                sink = null;
            }
            if (sink == null || (sink instanceof RetryableSink))
            {
                if (!c.b(request.a()))
                {
                    c.k();
                }
                Connection connection = c.m();
                c = a(request.d(), connection, (RetryableSink)sink, response);
            } else
            {
                throw new HttpRetryException("Cannot retry streamed HTTP body", responseCode);
            }
        } while (true);
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
            Platform.a();
            Platform.a((new StringBuilder("Ignoring header ")).append(s).append(" because its value was null.").toString());
            return;
        }
        if ("X-Android-Transports".equals(s) || "X-Android-Protocols".equals(s))
        {
            a(s1, true);
            return;
        } else
        {
            f.a(s, s1);
            return;
        }
    }

    public final void connect()
    {
        b();
        while (!a(false)) ;
    }

    public final void disconnect()
    {
        if (c == null)
        {
            return;
        } else
        {
            c.l();
            return;
        }
    }

    public int getConnectTimeout()
    {
        return a.a();
    }

    public final InputStream getErrorStream()
    {
        Object obj = null;
        InputStream inputstream;
        HttpEngine httpengine;
        try
        {
            httpengine = c();
        }
        catch (IOException ioexception)
        {
            return null;
        }
        inputstream = obj;
        if (!HttpEngine.a(httpengine.h()))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        inputstream = obj;
        if (httpengine.h().c() >= 400)
        {
            inputstream = httpengine.h().g().d();
        }
        return inputstream;
    }

    public final String getHeaderField(int k)
    {
        String s;
        try
        {
            s = a().b(k);
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
        return StatusLine.a(c().h()).toString();
        s = a().a(s);
        return s;
        s;
        return null;
    }

    public final String getHeaderFieldKey(int k)
    {
        String s;
        try
        {
            s = a().a(k);
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
            map = OkHeaders.a(a(), StatusLine.a(c().h()).toString());
        }
        catch (IOException ioexception)
        {
            return Collections.emptyMap();
        }
        return map;
    }

    public final InputStream getInputStream()
    {
        if (!doInput)
        {
            throw new ProtocolException("This protocol does not support input");
        }
        HttpEngine httpengine = c();
        if (getResponseCode() >= 400)
        {
            throw new FileNotFoundException(url.toString());
        } else
        {
            return httpengine.h().g().d();
        }
    }

    public final OutputStream getOutputStream()
    {
        connect();
        BufferedSink bufferedsink = c.e();
        if (bufferedsink == null)
        {
            throw new ProtocolException((new StringBuilder("method does not support a request body: ")).append(method).toString());
        }
        if (c.f())
        {
            throw new ProtocolException("cannot write request body after response has been read");
        } else
        {
            return bufferedsink.d();
        }
    }

    public final Permission getPermission()
    {
        String s = getURL().getHost();
        int k = Util.a(getURL());
        if (usingProxy())
        {
            InetSocketAddress inetsocketaddress = (InetSocketAddress)a.d().address();
            s = inetsocketaddress.getHostName();
            k = inetsocketaddress.getPort();
        }
        return new SocketPermission((new StringBuilder()).append(s).append(":").append(k).toString(), "connect, resolve");
    }

    public int getReadTimeout()
    {
        return a.b();
    }

    public final Map getRequestProperties()
    {
        if (connected)
        {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        } else
        {
            return OkHeaders.a(f.a(), null);
        }
    }

    public final String getRequestProperty(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return f.c(s);
        }
    }

    public final int getResponseCode()
    {
        return c().h().c();
    }

    public String getResponseMessage()
    {
        return c().h().d();
    }

    public void setConnectTimeout(int k)
    {
        a.a(k, TimeUnit.MILLISECONDS);
    }

    public void setFixedLengthStreamingMode(int k)
    {
        setFixedLengthStreamingMode(k);
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
            g = l;
            super.fixedContentLength = (int)Math.min(l, 0x7fffffffL);
            return;
        }
    }

    public void setIfModifiedSince(long l)
    {
        super.setIfModifiedSince(l);
        if (ifModifiedSince != 0L)
        {
            f.b("If-Modified-Since", HttpDate.a(new Date(ifModifiedSince)));
            return;
        } else
        {
            f.b("If-Modified-Since");
            return;
        }
    }

    public void setInstanceFollowRedirects(boolean flag)
    {
        a.a(flag);
    }

    public void setReadTimeout(int k)
    {
        a.b(k, TimeUnit.MILLISECONDS);
    }

    public void setRequestMethod(String s)
    {
        if (!e.contains(s))
        {
            throw new ProtocolException((new StringBuilder("Expected one of ")).append(e).append(" but was ").append(s).toString());
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
            Platform.a();
            Platform.a((new StringBuilder("Ignoring header ")).append(s).append(" because its value was null.").toString());
            return;
        }
        if ("X-Android-Transports".equals(s) || "X-Android-Protocols".equals(s))
        {
            a(s1, false);
            return;
        } else
        {
            f.b(s, s1);
            return;
        }
    }

    public final boolean usingProxy()
    {
        Proxy proxy;
        if (j != null)
        {
            proxy = j.b();
        } else
        {
            proxy = a.d();
        }
        return proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT;
    }

}
