// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkResponseCache;
import com.squareup.okhttp.ResponseSource;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.RouteDatabase;
import com.squareup.okhttp.TunnelRequest;
import com.squareup.okhttp.internal.Dns;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            Policy, RequestHeaders, RawHeaders, ResponseHeaders, 
//            Transport, RouteSelector, RetryableOutputStream

public class HttpEngine
{

    private static final CacheResponse GATEWAY_TIMEOUT_RESPONSE = new CacheResponse() {

        public InputStream getBody()
            throws IOException
        {
            return new ByteArrayInputStream(Util.EMPTY_BYTE_ARRAY);
        }

        public Map getHeaders()
            throws IOException
        {
            HashMap hashmap = new HashMap();
            hashmap.put(null, Collections.singletonList("HTTP/1.1 504 Gateway Timeout"));
            return hashmap;
        }

    };
    public static final int HTTP_CONTINUE = 100;
    private boolean automaticallyReleaseConnectionToPool;
    private CacheRequest cacheRequest;
    private CacheResponse cacheResponse;
    private InputStream cachedResponseBody;
    private ResponseHeaders cachedResponseHeaders;
    protected final OkHttpClient client;
    boolean connected;
    protected Connection connection;
    private boolean connectionReleased;
    protected final String method;
    protected final Policy policy;
    private OutputStream requestBodyOut;
    final RequestHeaders requestHeaders;
    private InputStream responseBodyIn;
    ResponseHeaders responseHeaders;
    private ResponseSource responseSource;
    private InputStream responseTransferIn;
    protected RouteSelector routeSelector;
    long sentRequestMillis;
    private boolean transparentGzip;
    private Transport transport;
    final URI uri;

    public HttpEngine(OkHttpClient okhttpclient, Policy policy1, String s, RawHeaders rawheaders, Connection connection1, RetryableOutputStream retryableoutputstream)
        throws IOException
    {
        sentRequestMillis = -1L;
        client = okhttpclient;
        policy = policy1;
        method = s;
        connection = connection1;
        requestBodyOut = retryableoutputstream;
        try
        {
            uri = Platform.get().toUriLenient(policy1.getURL());
        }
        // Misplaced declaration of an exception variable
        catch (OkHttpClient okhttpclient)
        {
            throw new IOException(okhttpclient.getMessage());
        }
        requestHeaders = new RequestHeaders(uri, new RawHeaders(rawheaders));
    }

    public static String getDefaultUserAgent()
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

    public static String getOriginAddress(URL url)
    {
        int i = url.getPort();
        String s1 = url.getHost();
        String s = s1;
        if (i > 0)
        {
            s = s1;
            if (i != Util.getDefaultPort(url.getProtocol()))
            {
                s = (new StringBuilder()).append(s1).append(":").append(i).toString();
            }
        }
        return s;
    }

    private void initContentStream(InputStream inputstream)
        throws IOException
    {
        responseTransferIn = inputstream;
        if (transparentGzip && responseHeaders.isContentEncodingGzip())
        {
            responseHeaders.stripContentEncoding();
            responseHeaders.stripContentLength();
            responseBodyIn = new GZIPInputStream(inputstream);
            return;
        } else
        {
            responseBodyIn = inputstream;
            return;
        }
    }

    private void initResponseSource()
        throws IOException
    {
        responseSource = ResponseSource.NETWORK;
        Object obj;
        if (policy.getUseCaches())
        {
            if ((obj = client.getOkResponseCache()) != null && (obj = ((OkResponseCache) (obj)).get(uri, method, requestHeaders.getHeaders().toMultimap(false))) != null)
            {
                Object obj1 = ((CacheResponse) (obj)).getHeaders();
                cachedResponseBody = ((CacheResponse) (obj)).getBody();
                if (!acceptCacheResponseType(((CacheResponse) (obj))) || obj1 == null || cachedResponseBody == null)
                {
                    Util.closeQuietly(cachedResponseBody);
                    return;
                }
                obj1 = RawHeaders.fromMultimap(((Map) (obj1)), true);
                cachedResponseHeaders = new ResponseHeaders(uri, ((RawHeaders) (obj1)));
                long l = System.currentTimeMillis();
                responseSource = cachedResponseHeaders.chooseResponseSource(l, requestHeaders);
                if (responseSource == ResponseSource.CACHE)
                {
                    cacheResponse = ((CacheResponse) (obj));
                    setResponse(cachedResponseHeaders, cachedResponseBody);
                    return;
                }
                if (responseSource == ResponseSource.CONDITIONAL_CACHE)
                {
                    cacheResponse = ((CacheResponse) (obj));
                    return;
                }
                if (responseSource == ResponseSource.NETWORK)
                {
                    Util.closeQuietly(cachedResponseBody);
                    return;
                } else
                {
                    throw new AssertionError();
                }
            }
        }
    }

    private void maybeCache()
        throws IOException
    {
        OkResponseCache okresponsecache;
        if (policy.getUseCaches())
        {
            if ((okresponsecache = client.getOkResponseCache()) != null)
            {
                HttpURLConnection httpurlconnection = policy.getHttpConnectionToCache();
                if (!responseHeaders.isCacheable(requestHeaders))
                {
                    okresponsecache.maybeRemove(httpurlconnection.getRequestMethod(), uri);
                    return;
                } else
                {
                    cacheRequest = okresponsecache.put(uri, httpurlconnection);
                    return;
                }
            }
        }
    }

    private void prepareRawRequestHeaders()
        throws IOException
    {
        requestHeaders.getHeaders().setRequestLine(getRequestLine());
        if (requestHeaders.getUserAgent() == null)
        {
            requestHeaders.setUserAgent(getDefaultUserAgent());
        }
        if (requestHeaders.getHost() == null)
        {
            requestHeaders.setHost(getOriginAddress(policy.getURL()));
        }
        if ((connection == null || connection.getHttpMinorVersion() != 0) && requestHeaders.getConnection() == null)
        {
            requestHeaders.setConnection("Keep-Alive");
        }
        if (requestHeaders.getAcceptEncoding() == null)
        {
            transparentGzip = true;
            requestHeaders.setAcceptEncoding("gzip");
        }
        if (hasRequestBody() && requestHeaders.getContentType() == null)
        {
            requestHeaders.setContentType("application/x-www-form-urlencoded");
        }
        long l = policy.getIfModifiedSince();
        if (l != 0L)
        {
            requestHeaders.setIfModifiedSince(new Date(l));
        }
        CookieHandler cookiehandler = client.getCookieHandler();
        if (cookiehandler != null)
        {
            requestHeaders.addCookies(cookiehandler.get(uri, requestHeaders.getHeaders().toMultimap(false)));
        }
    }

    public static String requestPath(URL url)
    {
        String s = url.getFile();
        if (s == null)
        {
            url = "/";
        } else
        {
            url = s;
            if (!s.startsWith("/"))
            {
                return (new StringBuilder()).append("/").append(s).toString();
            }
        }
        return url;
    }

    private String requestString()
    {
        URL url = policy.getURL();
        if (includeAuthorityInRequestLine())
        {
            return url.toString();
        } else
        {
            return requestPath(url);
        }
    }

    private void sendSocketRequest()
        throws IOException
    {
        if (connection == null)
        {
            connect();
        }
        if (transport != null)
        {
            throw new IllegalStateException();
        }
        transport = (Transport)connection.newTransport(this);
        if (hasRequestBody() && requestBodyOut == null)
        {
            requestBodyOut = transport.createRequestBody();
        }
    }

    private void setResponse(ResponseHeaders responseheaders, InputStream inputstream)
        throws IOException
    {
        if (responseBodyIn != null)
        {
            throw new IllegalStateException();
        }
        responseHeaders = responseheaders;
        if (inputstream != null)
        {
            initContentStream(inputstream);
        }
    }

    protected boolean acceptCacheResponseType(CacheResponse cacheresponse)
    {
        return true;
    }

    public final void automaticallyReleaseConnectionToPool()
    {
        automaticallyReleaseConnectionToPool = true;
        if (connection != null && connectionReleased)
        {
            client.getConnectionPool().recycle(connection);
            connection = null;
        }
    }

    protected final void connect()
        throws IOException
    {
        if (connection == null)
        {
            if (routeSelector == null)
            {
                String s = uri.getHost();
                if (s == null)
                {
                    throw new UnknownHostException(uri.toString());
                }
                javax.net.ssl.SSLSocketFactory sslsocketfactory = null;
                javax.net.ssl.HostnameVerifier hostnameverifier = null;
                if (uri.getScheme().equalsIgnoreCase("https"))
                {
                    sslsocketfactory = client.getSslSocketFactory();
                    hostnameverifier = client.getHostnameVerifier();
                }
                routeSelector = new RouteSelector(new Address(s, Util.getEffectivePort(uri), sslsocketfactory, hostnameverifier, client.getAuthenticator(), client.getProxy(), client.getTransports()), uri, client.getProxySelector(), client.getConnectionPool(), Dns.DEFAULT, client.getRoutesDatabase());
            }
            connection = routeSelector.next(method);
            if (!connection.isConnected())
            {
                connection.connect(client.getConnectTimeout(), client.getReadTimeout(), getTunnelConfig());
                client.getConnectionPool().maybeShare(connection);
                client.getRoutesDatabase().connected(connection.getRoute());
            } else
            if (!connection.isSpdy())
            {
                connection.updateReadTimeout(client.getReadTimeout());
            }
            connected(connection);
            if (connection.getRoute().getProxy() != client.getProxy())
            {
                requestHeaders.getHeaders().setRequestLine(getRequestLine());
                return;
            }
        }
    }

    protected void connected(Connection connection1)
    {
        policy.setSelectedProxy(connection1.getRoute().getProxy());
        connected = true;
    }

    public final CacheResponse getCacheResponse()
    {
        return cacheResponse;
    }

    public final Connection getConnection()
    {
        return connection;
    }

    public final OutputStream getRequestBody()
    {
        if (responseSource == null)
        {
            throw new IllegalStateException();
        } else
        {
            return requestBodyOut;
        }
    }

    public final RequestHeaders getRequestHeaders()
    {
        return requestHeaders;
    }

    String getRequestLine()
    {
        String s;
        if (connection == null || connection.getHttpMinorVersion() != 0)
        {
            s = "HTTP/1.1";
        } else
        {
            s = "HTTP/1.0";
        }
        return (new StringBuilder()).append(method).append(" ").append(requestString()).append(" ").append(s).toString();
    }

    public final InputStream getResponseBody()
    {
        if (responseHeaders == null)
        {
            throw new IllegalStateException();
        } else
        {
            return responseBodyIn;
        }
    }

    public final int getResponseCode()
    {
        if (responseHeaders == null)
        {
            throw new IllegalStateException();
        } else
        {
            return responseHeaders.getHeaders().getResponseCode();
        }
    }

    public final ResponseHeaders getResponseHeaders()
    {
        if (responseHeaders == null)
        {
            throw new IllegalStateException();
        } else
        {
            return responseHeaders;
        }
    }

    protected TunnelRequest getTunnelConfig()
    {
        return null;
    }

    public URI getUri()
    {
        return uri;
    }

    boolean hasRequestBody()
    {
        return method.equals("POST") || method.equals("PUT") || method.equals("PATCH");
    }

    public final boolean hasResponse()
    {
        return responseHeaders != null;
    }

    public final boolean hasResponseBody()
    {
        int i = responseHeaders.getHeaders().getResponseCode();
        if (!method.equals("HEAD"))
        {
            if ((i < 100 || i >= 200) && i != 204 && i != 304)
            {
                return true;
            }
            if (responseHeaders.getContentLength() != -1L || responseHeaders.isChunked())
            {
                return true;
            }
        }
        return false;
    }

    protected boolean includeAuthorityInRequestLine()
    {
        if (connection == null)
        {
            return policy.usingProxy();
        }
        return connection.getRoute().getProxy().type() == java.net.Proxy.Type.HTTP;
    }

    public final void readResponse()
        throws IOException
    {
        if (hasResponse())
        {
            responseHeaders.setResponseSource(responseSource);
        } else
        {
            if (responseSource == null)
            {
                throw new IllegalStateException("readResponse() without sendRequest()");
            }
            if (responseSource.requiresConnection())
            {
                if (sentRequestMillis == -1L)
                {
                    if (requestBodyOut instanceof RetryableOutputStream)
                    {
                        int i = ((RetryableOutputStream)requestBodyOut).contentLength();
                        requestHeaders.setContentLength(i);
                    }
                    transport.writeRequestHeaders();
                }
                if (requestBodyOut != null)
                {
                    requestBodyOut.close();
                    if (requestBodyOut instanceof RetryableOutputStream)
                    {
                        transport.writeRequestBody((RetryableOutputStream)requestBodyOut);
                    }
                }
                transport.flushRequest();
                responseHeaders = transport.readResponseHeaders();
                responseHeaders.setLocalTimestamps(sentRequestMillis, System.currentTimeMillis());
                responseHeaders.setResponseSource(responseSource);
                if (responseSource == ResponseSource.CONDITIONAL_CACHE)
                {
                    if (cachedResponseHeaders.validate(responseHeaders))
                    {
                        release(false);
                        responseHeaders = cachedResponseHeaders.combine(responseHeaders);
                        OkResponseCache okresponsecache = client.getOkResponseCache();
                        okresponsecache.trackConditionalCacheHit();
                        okresponsecache.update(cacheResponse, policy.getHttpConnectionToCache());
                        initContentStream(cachedResponseBody);
                        return;
                    }
                    Util.closeQuietly(cachedResponseBody);
                }
                if (hasResponseBody())
                {
                    maybeCache();
                }
                initContentStream(transport.getTransferStream(cacheRequest));
                return;
            }
        }
    }

    public void receiveHeaders(RawHeaders rawheaders)
        throws IOException
    {
        CookieHandler cookiehandler = client.getCookieHandler();
        if (cookiehandler != null)
        {
            cookiehandler.put(uri, rawheaders.toMultimap(true));
        }
    }

    public final void release(boolean flag)
    {
        if (responseBodyIn == cachedResponseBody)
        {
            Util.closeQuietly(responseBodyIn);
        }
        if (!connectionReleased && connection != null)
        {
            connectionReleased = true;
            if (transport == null || !transport.makeReusable(flag, requestBodyOut, responseTransferIn))
            {
                Util.closeQuietly(connection);
                connection = null;
            } else
            if (automaticallyReleaseConnectionToPool)
            {
                client.getConnectionPool().recycle(connection);
                connection = null;
                return;
            }
        }
    }

    public final void sendRequest()
        throws IOException
    {
        if (responseSource == null)
        {
            prepareRawRequestHeaders();
            initResponseSource();
            OkResponseCache okresponsecache = client.getOkResponseCache();
            if (okresponsecache != null)
            {
                okresponsecache.trackResponse(responseSource);
            }
            if (requestHeaders.isOnlyIfCached() && responseSource.requiresConnection())
            {
                if (responseSource == ResponseSource.CONDITIONAL_CACHE)
                {
                    Util.closeQuietly(cachedResponseBody);
                }
                responseSource = ResponseSource.CACHE;
                cacheResponse = GATEWAY_TIMEOUT_RESPONSE;
                RawHeaders rawheaders = RawHeaders.fromMultimap(cacheResponse.getHeaders(), true);
                setResponse(new ResponseHeaders(uri, rawheaders), cacheResponse.getBody());
            }
            if (responseSource.requiresConnection())
            {
                sendSocketRequest();
                return;
            }
            if (connection != null)
            {
                client.getConnectionPool().recycle(connection);
                connection = null;
                return;
            }
        }
    }

    public void writingRequestHeaders()
    {
        if (sentRequestMillis != -1L)
        {
            throw new IllegalStateException();
        } else
        {
            sentRequestMillis = System.currentTimeMillis();
            return;
        }
    }

}
