// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.SecureSSLSocketFactory;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Locale;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.dropbox.client2.session:
//            Session, AppKeyPair, AccessTokenPair

public abstract class AbstractSession
    implements Session
{

    private static final String API_SERVER = "api.dropbox.com";
    private static final String CONTENT_SERVER = "api-content.dropbox.com";
    private static final int DEFAULT_TIMEOUT_MILLIS = 30000;
    private static final int KEEP_ALIVE_DURATION_SECS = 20;
    private static final int KEEP_ALIVE_MONITOR_INTERVAL_SECS = 5;
    private static final String WEB_SERVER = "www.dropbox.com";
    private final Session.AccessType accessType;
    private final AppKeyPair appKeyPair;
    private HttpClient client;
    private AccessTokenPair oauth1AccessToken;
    private String oauth2AccessToken;

    public AbstractSession(AppKeyPair appkeypair)
    {
        this(appkeypair, ((AccessTokenPair) (null)));
    }

    public AbstractSession(AppKeyPair appkeypair, AccessTokenPair accesstokenpair)
    {
        this(appkeypair, Session.AccessType.AUTO, accesstokenpair);
    }

    public AbstractSession(AppKeyPair appkeypair, Session.AccessType accesstype)
    {
        this(appkeypair, accesstype, null);
    }

    public AbstractSession(AppKeyPair appkeypair, Session.AccessType accesstype, AccessTokenPair accesstokenpair)
    {
        oauth1AccessToken = null;
        oauth2AccessToken = null;
        client = null;
        if (appkeypair == null)
        {
            throw new IllegalArgumentException("'appKeyPair' must be non-null");
        }
        if (accesstype == null)
        {
            throw new IllegalArgumentException("'type' must be non-null");
        } else
        {
            appKeyPair = appkeypair;
            accessType = accesstype;
            oauth1AccessToken = accesstokenpair;
            return;
        }
    }

    public AbstractSession(AppKeyPair appkeypair, String s)
    {
        this(appkeypair);
        oauth2AccessToken = s;
    }

    private static String buildOAuth1Header(AppKeyPair appkeypair, AccessTokenPair accesstokenpair)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("OAuth oauth_version=\"1.0\"");
        stringbuilder.append(", oauth_signature_method=\"PLAINTEXT\"");
        stringbuilder.append(", oauth_consumer_key=\"").append(encode(appkeypair.key)).append("\"");
        if (accesstokenpair != null)
        {
            stringbuilder.append(", oauth_token=\"").append(encode(accesstokenpair.key)).append("\"");
            appkeypair = (new StringBuilder()).append(encode(appkeypair.secret)).append("&").append(encode(accesstokenpair.secret)).toString();
        } else
        {
            appkeypair = (new StringBuilder()).append(encode(appkeypair.secret)).append("&").toString();
        }
        stringbuilder.append(", oauth_signature=\"").append(appkeypair).append("\"");
        return stringbuilder.toString();
    }

    private static String encode(String s)
    {
        try
        {
            s = URLEncoder.encode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            AssertionError assertionerror = new AssertionError("UTF-8 isn't available");
            assertionerror.initCause(s);
            throw assertionerror;
        }
        return s;
    }

    public String getAPIServer()
    {
        return "api.dropbox.com";
    }

    public AccessTokenPair getAccessTokenPair()
    {
        return oauth1AccessToken;
    }

    public Session.AccessType getAccessType()
    {
        return accessType;
    }

    public AppKeyPair getAppKeyPair()
    {
        return appKeyPair;
    }

    public String getContentServer()
    {
        return "api-content.dropbox.com";
    }

    public HttpClient getHttpClient()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (client != null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        obj = new BasicHttpParams();
        ConnManagerParams.setMaxConnectionsPerRoute(((HttpParams) (obj)), new _cls1());
        ConnManagerParams.setMaxTotalConnections(((HttpParams) (obj)), 20);
        Object obj2 = new SecureSSLSocketFactory();
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj2)), 443));
        obj = new DBClientConnManager(((HttpParams) (obj)), schemeregistry);
        obj2 = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj2)), 30000);
        HttpConnectionParams.setSoTimeout(((HttpParams) (obj2)), 30000);
        HttpConnectionParams.setSocketBufferSize(((HttpParams) (obj2)), 8192);
        HttpProtocolParams.setUserAgent(((HttpParams) (obj2)), (new StringBuilder("OfficialDropboxJavaSDK/")).append(DropboxAPI.SDK_VERSION).toString());
        obj = new _cls2(((ClientConnectionManager) (obj)), ((HttpParams) (obj2)));
        ((DefaultHttpClient) (obj)).addRequestInterceptor(new _cls3());
        ((DefaultHttpClient) (obj)).addResponseInterceptor(new _cls4());
        client = ((HttpClient) (obj));
        obj = client;
        this;
        JVM INSTR monitorexit ;
        return ((HttpClient) (obj));
        Object obj1;
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
    }

    public Locale getLocale()
    {
        return Locale.ENGLISH;
    }

    public String getOAuth2AccessToken()
    {
        return oauth2AccessToken;
    }

    public Session.ProxyInfo getProxyInfo()
    {
        this;
        JVM INSTR monitorenter ;
        return null;
    }

    public String getWebServer()
    {
        return "www.dropbox.com";
    }

    public boolean isLinked()
    {
        return oauth1AccessToken != null || oauth2AccessToken != null;
    }

    public void setAccessTokenPair(AccessTokenPair accesstokenpair)
    {
        if (accesstokenpair == null)
        {
            throw new IllegalArgumentException("'oauth1AccessToken' must be non-null");
        } else
        {
            oauth1AccessToken = accesstokenpair;
            oauth2AccessToken = null;
            return;
        }
    }

    public void setOAuth2AccessToken(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("'oauth2AccessToken' must be non-null");
        } else
        {
            oauth2AccessToken = s;
            oauth1AccessToken = null;
            return;
        }
    }

    public void setRequestTimeout(HttpUriRequest httpurirequest)
    {
        httpurirequest = httpurirequest.getParams();
        HttpConnectionParams.setSoTimeout(httpurirequest, 30000);
        HttpConnectionParams.setConnectionTimeout(httpurirequest, 30000);
    }

    public void sign(HttpRequest httprequest)
    {
        String s;
        if (oauth2AccessToken != null)
        {
            s = (new StringBuilder("Bearer ")).append(oauth2AccessToken).toString();
        } else
        {
            s = buildOAuth1Header(appKeyPair, oauth1AccessToken);
        }
        httprequest.addHeader("Authorization", s);
    }

    public void unlink()
    {
        oauth1AccessToken = null;
        oauth2AccessToken = null;
    }

    private class _cls1
        implements ConnPerRoute
    {

        final AbstractSession this$0;

        public int getMaxForRoute(HttpRoute httproute)
        {
            return 10;
        }

        _cls1()
        {
            this$0 = AbstractSession.this;
            super();
        }
    }


    private class DBClientConnManager extends ThreadSafeClientConnManager
    {

        public ClientConnectionRequest requestConnection(HttpRoute httproute, Object obj)
        {
            IdleConnectionCloserThread.ensureRunning(this, 20, 5);
            return super.requestConnection(httproute, obj);
        }

        public DBClientConnManager(HttpParams httpparams, SchemeRegistry schemeregistry)
        {
            super(httpparams, schemeregistry);
        }

        private class IdleConnectionCloserThread extends Thread
        {

            private static IdleConnectionCloserThread thread = null;
            private final int checkIntervalMs;
            private final int idleTimeoutSeconds;
            private final DBClientConnManager manager;

            public static void ensureRunning(DBClientConnManager dbclientconnmanager, int i, int j)
            {
                com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
                JVM INSTR monitorenter ;
                if (thread == null)
                {
                    dbclientconnmanager = dbclientconnmanager. new IdleConnectionCloserThread(i, j);
                    thread = dbclientconnmanager;
                    dbclientconnmanager.start();
                }
                com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
                JVM INSTR monitorexit ;
                return;
                dbclientconnmanager;
                throw dbclientconnmanager;
            }

            public void run()
            {
_L2:
                this;
                JVM INSTR monitorenter ;
                wait(checkIntervalMs);
                this;
                JVM INSTR monitorexit ;
                manager.closeExpiredConnections();
                manager.closeIdleConnections(idleTimeoutSeconds, TimeUnit.SECONDS);
                com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
                JVM INSTR monitorenter ;
                if (manager.getConnectionsInPool() != 0)
                {
                    break MISSING_BLOCK_LABEL_67;
                }
                thread = null;
                com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                this;
                JVM INSTR monitorexit ;
                try
                {
                    throw obj;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    thread = null;
                }
                return;
                com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
                JVM INSTR monitorexit ;
                if (true) goto _L2; else goto _L1
_L1:
                obj;
                com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
                JVM INSTR monitorexit ;
                throw obj;
            }


            public IdleConnectionCloserThread(int i, int j)
            {
                manager = DBClientConnManager.this;
                idleTimeoutSeconds = i;
                checkIntervalMs = j * 1000;
            }
        }

    }


    private class _cls2 extends DefaultHttpClient
    {

        final AbstractSession this$0;

        protected ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy()
        {
            return new DBKeepAliveStrategy(null);
        }

        protected ConnectionReuseStrategy createConnectionReuseStrategy()
        {
            return new DBConnectionReuseStrategy(null);
        }

        _cls2(ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
        {
            this$0 = AbstractSession.this;
            super(clientconnectionmanager, httpparams);
        }

        private class DBKeepAliveStrategy
            implements ConnectionKeepAliveStrategy
        {

            public long getKeepAliveDuration(HttpResponse httpresponse, HttpContext httpcontext)
            {
                long l;
                l = 20000L;
                httpresponse = new BasicHeaderElementIterator(httpresponse.headerIterator("Keep-Alive"));
_L2:
                Object obj;
                if (!httpresponse.hasNext())
                {
                    break MISSING_BLOCK_LABEL_86;
                }
                obj = httpresponse.nextElement();
                httpcontext = ((HeaderElement) (obj)).getName();
                obj = ((HeaderElement) (obj)).getValue();
                if (obj == null || !httpcontext.equalsIgnoreCase("timeout"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                long l1 = Math.min(l, Long.parseLong(((String) (obj))) * 1000L);
                l = l1;
                continue; /* Loop/switch isn't completed */
                return l;
                httpcontext;
                if (true) goto _L2; else goto _L1
_L1:
            }

            private DBKeepAliveStrategy()
            {
            }

            DBKeepAliveStrategy(_cls1 _pcls1)
            {
                this();
            }
        }


        private class DBConnectionReuseStrategy extends DefaultConnectionReuseStrategy
        {

            public boolean keepAlive(HttpResponse httpresponse, HttpContext httpcontext)
            {
                ProtocolVersion protocolversion;
                boolean flag2;
                flag2 = true;
                if (httpresponse == null)
                {
                    throw new IllegalArgumentException("HTTP response may not be null.");
                }
                if (httpcontext == null)
                {
                    throw new IllegalArgumentException("HTTP context may not be null.");
                }
                protocolversion = httpresponse.getStatusLine().getProtocolVersion();
                httpcontext = httpresponse.getFirstHeader("Transfer-Encoding");
                if (httpcontext == null) goto _L2; else goto _L1
_L1:
                if ("chunked".equalsIgnoreCase(httpcontext.getValue())) goto _L4; else goto _L3
_L3:
                boolean flag1 = false;
_L8:
                return flag1;
_L2:
                httpcontext = httpresponse.getHeaders("Content-Length");
                if (httpcontext == null || httpcontext.length != 1)
                {
                    return false;
                }
                httpcontext = httpcontext[0];
                int i;
                try
                {
                    i = Integer.parseInt(httpcontext.getValue());
                }
                // Misplaced declaration of an exception variable
                catch (HttpResponse httpresponse)
                {
                    return false;
                }
                if (i < 0)
                {
                    return false;
                }
_L4:
                HeaderIterator headeriterator = httpresponse.headerIterator("Connection");
                httpcontext = headeriterator;
                if (!headeriterator.hasNext())
                {
                    httpcontext = httpresponse.headerIterator("Proxy-Connection");
                }
                if (!httpcontext.hasNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                boolean flag;
                try
                {
                    httpresponse = createTokenIterator(httpcontext);
                }
                // Misplaced declaration of an exception variable
                catch (HttpResponse httpresponse)
                {
                    return false;
                }
                flag = false;
                if (!httpresponse.hasNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                httpcontext = httpresponse.nextToken();
                if ("Close".equalsIgnoreCase(httpcontext))
                {
                    return false;
                }
                flag1 = "Keep-Alive".equalsIgnoreCase(httpcontext);
                if (flag1)
                {
                    flag = true;
                }
                if (true) goto _L6; else goto _L5
_L6:
                break MISSING_BLOCK_LABEL_170;
_L5:
                flag1 = flag2;
                if (flag) goto _L8; else goto _L7
_L7:
                flag1 = flag2;
                if (protocolversion.lessEquals(HttpVersion.HTTP_1_0))
                {
                    return false;
                }
                if (true) goto _L8; else goto _L9
_L9:
            }

            private DBConnectionReuseStrategy()
            {
            }

            DBConnectionReuseStrategy(_cls1 _pcls1)
            {
                this();
            }
        }

    }


    private class _cls3
        implements HttpRequestInterceptor
    {

        final AbstractSession this$0;

        public void process(HttpRequest httprequest, HttpContext httpcontext)
        {
            if (!httprequest.containsHeader("Accept-Encoding"))
            {
                httprequest.addHeader("Accept-Encoding", "gzip");
            }
        }

        _cls3()
        {
            this$0 = AbstractSession.this;
            super();
        }
    }


    private class _cls4
        implements HttpResponseInterceptor
    {

        final AbstractSession this$0;

        public void process(HttpResponse httpresponse, HttpContext httpcontext)
        {
            httpcontext = httpresponse.getEntity();
            if (httpcontext == null) goto _L2; else goto _L1
_L1:
            httpcontext = httpcontext.getContentEncoding();
            if (httpcontext == null) goto _L2; else goto _L3
_L3:
            int i;
            int j;
            httpcontext = httpcontext.getElements();
            j = httpcontext.length;
            i = 0;
_L8:
            if (i >= j) goto _L2; else goto _L4
_L4:
            if (!httpcontext[i].getName().equalsIgnoreCase("gzip")) goto _L6; else goto _L5
_L5:
            httpresponse.setEntity(new GzipDecompressingEntity(httpresponse.getEntity()));
_L2:
            return;
_L6:
            i++;
            if (true) goto _L8; else goto _L7
_L7:
        }

        _cls4()
        {
            this$0 = AbstractSession.this;
            super();
        }

        private class GzipDecompressingEntity extends HttpEntityWrapper
        {

            public InputStream getContent()
            {
                return new GZIPInputStream(wrappedEntity.getContent());
            }

            public long getContentLength()
            {
                return -1L;
            }

            public GzipDecompressingEntity(HttpEntity httpentity)
            {
                super(httpentity);
            }
        }

    }

}
