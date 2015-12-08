// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
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
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            Policy, RawHeaders, HttpEngine, RetryableOutputStream, 
//            RouteSelector, HttpsEngine, ResponseHeaders, HttpAuthenticator

public class HttpURLConnectionImpl extends HttpURLConnection
    implements Policy
{
    static final class Retry extends Enum
    {

        private static final Retry $VALUES[];
        public static final Retry DIFFERENT_CONNECTION;
        public static final Retry NONE;
        public static final Retry SAME_CONNECTION;

        public static Retry valueOf(String s)
        {
            return (Retry)Enum.valueOf(com/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry, s);
        }

        public static Retry[] values()
        {
            return (Retry[])$VALUES.clone();
        }

        static 
        {
            NONE = new Retry("NONE", 0);
            SAME_CONNECTION = new Retry("SAME_CONNECTION", 1);
            DIFFERENT_CONNECTION = new Retry("DIFFERENT_CONNECTION", 2);
            $VALUES = (new Retry[] {
                NONE, SAME_CONNECTION, DIFFERENT_CONNECTION
            });
        }

        private Retry(String s, int i)
        {
            super(s, i);
        }
    }


    static final int HTTP_TEMP_REDIRECT = 307;
    private static final int MAX_REDIRECTS = 20;
    final OkHttpClient client;
    private long fixedContentLength;
    protected HttpEngine httpEngine;
    protected IOException httpEngineFailure;
    private final RawHeaders rawRequestHeaders = new RawHeaders();
    private int redirectionCount;

    public HttpURLConnectionImpl(URL url, OkHttpClient okhttpclient)
    {
        super(url);
        fixedContentLength = -1L;
        client = okhttpclient;
    }

    private boolean execute(boolean flag)
        throws IOException
    {
        try
        {
            httpEngine.sendRequest();
        }
        catch (IOException ioexception)
        {
            if (handleFailure(ioexception))
            {
                return false;
            } else
            {
                throw ioexception;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        httpEngine.readResponse();
        return true;
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
            Retry retry = processResponseHeaders();
            if (retry == Retry.NONE)
            {
                httpEngine.automaticallyReleaseConnectionToPool();
                return httpEngine;
            }
            String s = method;
            OutputStream outputstream = httpEngine.getRequestBody();
            int i = getResponseCode();
            if (i == 300 || i == 301 || i == 302 || i == 303)
            {
                s = "GET";
                outputstream = null;
            }
            if (outputstream != null && !(outputstream instanceof RetryableOutputStream))
            {
                throw new HttpRetryException("Cannot retry streamed HTTP body", httpEngine.getResponseCode());
            }
            if (retry == Retry.DIFFERENT_CONNECTION)
            {
                httpEngine.automaticallyReleaseConnectionToPool();
            }
            httpEngine.release(false);
            httpEngine = newHttpEngine(s, rawRequestHeaders, httpEngine.getConnection(), (RetryableOutputStream)outputstream);
        } while (true);
    }

    private boolean handleFailure(IOException ioexception)
        throws IOException
    {
        RouteSelector routeselector = httpEngine.routeSelector;
        if (routeselector != null && httpEngine.connection != null)
        {
            routeselector.connectFailed(httpEngine.connection, ioexception);
        }
        OutputStream outputstream = httpEngine.getRequestBody();
        boolean flag;
        if (outputstream == null || (outputstream instanceof RetryableOutputStream))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (routeselector == null && httpEngine.connection == null || routeselector != null && !routeselector.hasNext() || !isRecoverable(ioexception) || !flag)
        {
            httpEngineFailure = ioexception;
            return false;
        } else
        {
            httpEngine.release(true);
            ioexception = (RetryableOutputStream)outputstream;
            httpEngine = newHttpEngine(method, rawRequestHeaders, null, ioexception);
            httpEngine.routeSelector = routeselector;
            return true;
        }
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
        httpEngine = newHttpEngine(method, rawRequestHeaders, null, null);
        return;
        IOException ioexception;
        ioexception;
        httpEngineFailure = ioexception;
        throw ioexception;
_L4:
        if (method.equals("POST") || method.equals("PUT")) goto _L2; else goto _L5
_L5:
        throw new ProtocolException((new StringBuilder()).append(method).append(" does not support writing").toString());
    }

    private boolean isRecoverable(IOException ioexception)
    {
        boolean flag;
        boolean flag1;
        if ((ioexception instanceof SSLHandshakeException) && (ioexception.getCause() instanceof CertificateException))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = ioexception instanceof ProtocolException;
        return !flag && !flag1;
    }

    private HttpEngine newHttpEngine(String s, RawHeaders rawheaders, Connection connection, RetryableOutputStream retryableoutputstream)
        throws IOException
    {
        if (url.getProtocol().equals("http"))
        {
            return new HttpEngine(client, this, s, rawheaders, connection, retryableoutputstream);
        }
        if (url.getProtocol().equals("https"))
        {
            return new HttpsEngine(client, this, s, rawheaders, connection, retryableoutputstream);
        } else
        {
            throw new AssertionError();
        }
    }

    private Retry processResponseHeaders()
        throws IOException
    {
        Object obj;
        int i;
        if (httpEngine.connection != null)
        {
            obj = httpEngine.connection.getRoute().getProxy();
        } else
        {
            obj = client.getProxy();
        }
        i = getResponseCode();
        switch (i)
        {
        default:
            return Retry.NONE;

        case 407: 
            if (((Proxy) (obj)).type() != java.net.Proxy.Type.HTTP)
            {
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            // fall through

        case 401: 
            if (HttpAuthenticator.processAuthHeader(client.getAuthenticator(), getResponseCode(), httpEngine.getResponseHeaders().getHeaders(), rawRequestHeaders, ((Proxy) (obj)), this.url))
            {
                return Retry.SAME_CONNECTION;
            } else
            {
                return Retry.NONE;
            }

        case 300: 
        case 301: 
        case 302: 
        case 303: 
        case 307: 
            break;
        }
        if (!getInstanceFollowRedirects())
        {
            return Retry.NONE;
        }
        int j = redirectionCount + 1;
        redirectionCount = j;
        if (j > 20)
        {
            throw new ProtocolException((new StringBuilder()).append("Too many redirects: ").append(redirectionCount).toString());
        }
        if (i == 307 && !method.equals("GET") && !method.equals("HEAD"))
        {
            return Retry.NONE;
        }
        obj = getHeaderField("Location");
        if (obj == null)
        {
            return Retry.NONE;
        }
        URL url = this.url;
        this.url = new URL(url, ((String) (obj)));
        if (!this.url.getProtocol().equals("https") && !this.url.getProtocol().equals("http"))
        {
            return Retry.NONE;
        }
        boolean flag = url.getProtocol().equals(this.url.getProtocol());
        if (!flag && !client.getFollowProtocolRedirects())
        {
            return Retry.NONE;
        }
        boolean flag1 = url.getHost().equals(this.url.getHost());
        if (Util.getEffectivePort(url) == Util.getEffectivePort(this.url))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (flag1 && i && flag)
        {
            return Retry.SAME_CONNECTION;
        } else
        {
            return Retry.DIFFERENT_CONNECTION;
        }
    }

    private void setTransports(String s, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            arraylist.addAll(client.getTransports());
        }
        s = s.split(",", -1);
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(s[i]);
        }

        client.setTransports(arraylist);
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
        if ("X-Android-Transports".equals(s))
        {
            setTransports(s1, true);
            return;
        } else
        {
            rawRequestHeaders.add(s, s1);
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
        if (httpEngine != null)
        {
            if (httpEngine.hasResponse())
            {
                Util.closeQuietly(httpEngine.getResponseBody());
            }
            httpEngine.release(true);
        }
    }

    public final int getChunkLength()
    {
        return chunkLength;
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
        if (!httpengine.hasResponseBody())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        inputstream = obj;
        if (httpengine.getResponseCode() >= 400)
        {
            inputstream = httpengine.getResponseBody();
        }
        return inputstream;
    }

    public final long getFixedContentLength()
    {
        return fixedContentLength;
    }

    public final String getHeaderField(int i)
    {
        String s;
        try
        {
            s = getResponse().getResponseHeaders().getHeaders().getValue(i);
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return s;
    }

    public final String getHeaderField(String s)
    {
        RawHeaders rawheaders;
        try
        {
            rawheaders = getResponse().getResponseHeaders().getHeaders();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        return rawheaders.getStatusLine();
        s = rawheaders.get(s);
        return s;
    }

    public final String getHeaderFieldKey(int i)
    {
        String s;
        try
        {
            s = getResponse().getResponseHeaders().getHeaders().getFieldName(i);
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
            map = getResponse().getResponseHeaders().getHeaders().toMultimap(true);
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return map;
    }

    public HttpURLConnection getHttpConnectionToCache()
    {
        return this;
    }

    public HttpEngine getHttpEngine()
    {
        return httpEngine;
    }

    public final InputStream getInputStream()
        throws IOException
    {
        if (!doInput)
        {
            throw new ProtocolException("This protocol does not support input");
        }
        Object obj = getResponse();
        if (getResponseCode() >= 400)
        {
            throw new FileNotFoundException(url.toString());
        }
        obj = ((HttpEngine) (obj)).getResponseBody();
        if (obj == null)
        {
            throw new ProtocolException((new StringBuilder()).append("No response body exists; responseCode=").append(getResponseCode()).toString());
        } else
        {
            return ((InputStream) (obj));
        }
    }

    public final OutputStream getOutputStream()
        throws IOException
    {
        connect();
        OutputStream outputstream = httpEngine.getRequestBody();
        if (outputstream == null)
        {
            throw new ProtocolException((new StringBuilder()).append("method does not support a request body: ").append(method).toString());
        }
        if (httpEngine.hasResponse())
        {
            throw new ProtocolException("cannot write request body after response has been read");
        } else
        {
            return outputstream;
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
            return rawRequestHeaders.toMultimap(false);
        }
    }

    public final String getRequestProperty(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return rawRequestHeaders.get(s);
        }
    }

    public final int getResponseCode()
        throws IOException
    {
        return getResponse().getResponseCode();
    }

    public String getResponseMessage()
        throws IOException
    {
        return getResponse().getResponseHeaders().getHeaders().getResponseMessage();
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

    public void setReadTimeout(int i)
    {
        client.setReadTimeout(i, TimeUnit.MILLISECONDS);
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
        if ("X-Android-Transports".equals(s))
        {
            setTransports(s1, false);
            return;
        } else
        {
            rawRequestHeaders.set(s, s1);
            return;
        }
    }

    public final boolean usingProxy()
    {
        Proxy proxy = client.getProxy();
        return proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT;
    }
}
