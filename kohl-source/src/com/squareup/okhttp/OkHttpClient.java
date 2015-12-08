// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpAuthenticator;
import com.squareup.okhttp.internal.http.HttpURLConnectionImpl;
import com.squareup.okhttp.internal.http.HttpsURLConnectionImpl;
import com.squareup.okhttp.internal.http.OkResponseCacheAdapter;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.ResponseCache;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.squareup.okhttp:
//            RouteDatabase, Dispatcher, ConnectionPool, HttpResponseCache, 
//            OkAuthenticator, Request, OkResponseCache

public final class OkHttpClient
    implements URLStreamHandlerFactory
{

    private static final List DEFAULT_TRANSPORTS = Util.immutableList(Arrays.asList(new String[] {
        "spdy/3", "http/1.1"
    }));
    private OkAuthenticator authenticator;
    private int connectTimeout;
    private ConnectionPool connectionPool;
    private CookieHandler cookieHandler;
    private final Dispatcher dispatcher;
    private boolean followProtocolRedirects;
    private HostnameVerifier hostnameVerifier;
    private Proxy proxy;
    private ProxySelector proxySelector;
    private int readTimeout;
    private ResponseCache responseCache;
    private final RouteDatabase routeDatabase;
    private SSLSocketFactory sslSocketFactory;
    private List transports;

    public OkHttpClient()
    {
        followProtocolRedirects = true;
        routeDatabase = new RouteDatabase();
        dispatcher = new Dispatcher();
    }

    private OkHttpClient(OkHttpClient okhttpclient)
    {
        followProtocolRedirects = true;
        routeDatabase = okhttpclient.routeDatabase;
        dispatcher = okhttpclient.dispatcher;
    }

    private OkHttpClient copyWithDefaults()
    {
        OkHttpClient okhttpclient = new OkHttpClient(this);
        okhttpclient.proxy = proxy;
        Object obj;
        if (proxySelector != null)
        {
            obj = proxySelector;
        } else
        {
            obj = ProxySelector.getDefault();
        }
        okhttpclient.proxySelector = ((ProxySelector) (obj));
        if (cookieHandler != null)
        {
            obj = cookieHandler;
        } else
        {
            obj = CookieHandler.getDefault();
        }
        okhttpclient.cookieHandler = ((CookieHandler) (obj));
        if (responseCache != null)
        {
            obj = responseCache;
        } else
        {
            obj = ResponseCache.getDefault();
        }
        okhttpclient.responseCache = ((ResponseCache) (obj));
        if (sslSocketFactory != null)
        {
            obj = sslSocketFactory;
        } else
        {
            obj = HttpsURLConnection.getDefaultSSLSocketFactory();
        }
        okhttpclient.sslSocketFactory = ((SSLSocketFactory) (obj));
        if (hostnameVerifier != null)
        {
            obj = hostnameVerifier;
        } else
        {
            obj = OkHostnameVerifier.INSTANCE;
        }
        okhttpclient.hostnameVerifier = ((HostnameVerifier) (obj));
        if (authenticator != null)
        {
            obj = authenticator;
        } else
        {
            obj = HttpAuthenticator.SYSTEM_DEFAULT;
        }
        okhttpclient.authenticator = ((OkAuthenticator) (obj));
        if (connectionPool != null)
        {
            obj = connectionPool;
        } else
        {
            obj = ConnectionPool.getDefault();
        }
        okhttpclient.connectionPool = ((ConnectionPool) (obj));
        okhttpclient.followProtocolRedirects = followProtocolRedirects;
        if (transports != null)
        {
            obj = transports;
        } else
        {
            obj = DEFAULT_TRANSPORTS;
        }
        okhttpclient.transports = ((List) (obj));
        okhttpclient.connectTimeout = connectTimeout;
        okhttpclient.readTimeout = readTimeout;
        return okhttpclient;
    }

    void cancel(Object obj)
    {
        dispatcher.cancel(obj);
    }

    public URLStreamHandler createURLStreamHandler(final String protocol)
    {
        if (!protocol.equals("http") && !protocol.equals("https"))
        {
            return null;
        } else
        {
            return new URLStreamHandler() {

                final OkHttpClient this$0;
                final String val$protocol;

                protected int getDefaultPort()
                {
                    if (protocol.equals("http"))
                    {
                        return 80;
                    }
                    if (protocol.equals("https"))
                    {
                        return 443;
                    } else
                    {
                        throw new AssertionError();
                    }
                }

                protected URLConnection openConnection(URL url)
                {
                    return open(url);
                }

                protected URLConnection openConnection(URL url, Proxy proxy1)
                {
                    return open(url, proxy1);
                }

            
            {
                this$0 = OkHttpClient.this;
                protocol = s;
                super();
            }
            };
        }
    }

    void enqueue(Request request, Response.Receiver receiver)
    {
        dispatcher.enqueue(copyWithDefaults(), request, receiver);
    }

    public OkAuthenticator getAuthenticator()
    {
        return authenticator;
    }

    public int getConnectTimeout()
    {
        return connectTimeout;
    }

    public ConnectionPool getConnectionPool()
    {
        return connectionPool;
    }

    public CookieHandler getCookieHandler()
    {
        return cookieHandler;
    }

    public boolean getFollowProtocolRedirects()
    {
        return followProtocolRedirects;
    }

    public HostnameVerifier getHostnameVerifier()
    {
        return hostnameVerifier;
    }

    public OkResponseCache getOkResponseCache()
    {
        if (responseCache instanceof HttpResponseCache)
        {
            return ((HttpResponseCache)responseCache).okResponseCache;
        }
        if (responseCache != null)
        {
            return new OkResponseCacheAdapter(responseCache);
        } else
        {
            return null;
        }
    }

    public Proxy getProxy()
    {
        return proxy;
    }

    public ProxySelector getProxySelector()
    {
        return proxySelector;
    }

    public int getReadTimeout()
    {
        return readTimeout;
    }

    public ResponseCache getResponseCache()
    {
        return responseCache;
    }

    public RouteDatabase getRoutesDatabase()
    {
        return routeDatabase;
    }

    public SSLSocketFactory getSslSocketFactory()
    {
        return sslSocketFactory;
    }

    public List getTransports()
    {
        return transports;
    }

    public HttpURLConnection open(URL url)
    {
        return open(url, proxy);
    }

    HttpURLConnection open(URL url, Proxy proxy1)
    {
        String s = url.getProtocol();
        OkHttpClient okhttpclient = copyWithDefaults();
        okhttpclient.proxy = proxy1;
        if (s.equals("http"))
        {
            return new HttpURLConnectionImpl(url, okhttpclient);
        }
        if (s.equals("https"))
        {
            return new HttpsURLConnectionImpl(url, okhttpclient);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected protocol: ").append(s).toString());
        }
    }

    public OkHttpClient setAuthenticator(OkAuthenticator okauthenticator)
    {
        authenticator = okauthenticator;
        return this;
    }

    public void setConnectTimeout(long l, TimeUnit timeunit)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        l = timeunit.toMillis(l);
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        } else
        {
            connectTimeout = (int)l;
            return;
        }
    }

    public OkHttpClient setConnectionPool(ConnectionPool connectionpool)
    {
        connectionPool = connectionpool;
        return this;
    }

    public OkHttpClient setCookieHandler(CookieHandler cookiehandler)
    {
        cookieHandler = cookiehandler;
        return this;
    }

    public OkHttpClient setFollowProtocolRedirects(boolean flag)
    {
        followProtocolRedirects = flag;
        return this;
    }

    public OkHttpClient setHostnameVerifier(HostnameVerifier hostnameverifier)
    {
        hostnameVerifier = hostnameverifier;
        return this;
    }

    public OkHttpClient setProxy(Proxy proxy1)
    {
        proxy = proxy1;
        return this;
    }

    public OkHttpClient setProxySelector(ProxySelector proxyselector)
    {
        proxySelector = proxyselector;
        return this;
    }

    public void setReadTimeout(long l, TimeUnit timeunit)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        l = timeunit.toMillis(l);
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        } else
        {
            readTimeout = (int)l;
            return;
        }
    }

    public OkHttpClient setResponseCache(ResponseCache responsecache)
    {
        responseCache = responsecache;
        return this;
    }

    public OkHttpClient setSslSocketFactory(SSLSocketFactory sslsocketfactory)
    {
        sslSocketFactory = sslsocketfactory;
        return this;
    }

    public OkHttpClient setTransports(List list)
    {
        list = Util.immutableList(list);
        if (!list.contains("http/1.1"))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("transports doesn't contain http/1.1: ").append(list).toString());
        }
        if (list.contains(null))
        {
            throw new IllegalArgumentException("transports must not contain null");
        }
        if (list.contains(""))
        {
            throw new IllegalArgumentException("transports contains an empty string");
        } else
        {
            transports = list;
            return this;
        }
    }

}
