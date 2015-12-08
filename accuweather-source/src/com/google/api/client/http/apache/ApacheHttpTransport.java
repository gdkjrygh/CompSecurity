// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http.apache;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.SslUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import org.apache.http.HttpHost;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.google.api.client.http.apache:
//            ApacheHttpRequest, HttpExtensionMethod, SSLSocketFactoryExtension

public final class ApacheHttpTransport extends HttpTransport
{
    public static final class Builder
    {

        private HttpParams params;
        private ProxySelector proxySelector;
        private SSLSocketFactory socketFactory;

        public ApacheHttpTransport build()
        {
            return new ApacheHttpTransport(ApacheHttpTransport.newDefaultHttpClient(socketFactory, params, proxySelector));
        }

        public Builder doNotValidateCertificate()
            throws GeneralSecurityException
        {
            socketFactory = new SSLSocketFactoryExtension(SslUtils.trustAllSSLContext());
            socketFactory.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            return this;
        }

        public HttpParams getHttpParams()
        {
            return params;
        }

        public SSLSocketFactory getSSLSocketFactory()
        {
            return socketFactory;
        }

        public Builder setProxy(HttpHost httphost)
        {
            ConnRouteParams.setDefaultProxy(params, httphost);
            if (httphost != null)
            {
                proxySelector = null;
            }
            return this;
        }

        public Builder setProxySelector(ProxySelector proxyselector)
        {
            proxySelector = proxyselector;
            if (proxyselector != null)
            {
                ConnRouteParams.setDefaultProxy(params, null);
            }
            return this;
        }

        public Builder setSocketFactory(SSLSocketFactory sslsocketfactory)
        {
            socketFactory = (SSLSocketFactory)Preconditions.checkNotNull(sslsocketfactory);
            return this;
        }

        public Builder trustCertificates(KeyStore keystore)
            throws GeneralSecurityException
        {
            javax.net.ssl.SSLContext sslcontext = SslUtils.getTlsSslContext();
            SslUtils.initSslContext(sslcontext, keystore, SslUtils.getPkixTrustManagerFactory());
            return setSocketFactory(new SSLSocketFactoryExtension(sslcontext));
        }

        public Builder trustCertificatesFromJavaKeyStore(InputStream inputstream, String s)
            throws GeneralSecurityException, IOException
        {
            KeyStore keystore = SecurityUtils.getJavaKeyStore();
            SecurityUtils.loadKeyStore(keystore, inputstream, s);
            return trustCertificates(keystore);
        }

        public Builder trustCertificatesFromStream(InputStream inputstream)
            throws GeneralSecurityException, IOException
        {
            KeyStore keystore = SecurityUtils.getJavaKeyStore();
            keystore.load(null, null);
            SecurityUtils.loadKeyStoreFromCertificates(keystore, SecurityUtils.getX509CertificateFactory(), inputstream);
            return trustCertificates(keystore);
        }

        public Builder()
        {
            socketFactory = SSLSocketFactory.getSocketFactory();
            params = ApacheHttpTransport.newDefaultHttpParams();
            proxySelector = ProxySelector.getDefault();
        }
    }


    private final HttpClient httpClient;

    public ApacheHttpTransport()
    {
        this(((HttpClient) (newDefaultHttpClient())));
    }

    public ApacheHttpTransport(HttpClient httpclient)
    {
        httpClient = httpclient;
        httpclient = httpclient.getParams();
        HttpProtocolParams.setVersion(httpclient, HttpVersion.HTTP_1_1);
        httpclient.setBooleanParameter("http.protocol.handle-redirects", false);
    }

    public static DefaultHttpClient newDefaultHttpClient()
    {
        return newDefaultHttpClient(SSLSocketFactory.getSocketFactory(), newDefaultHttpParams(), ProxySelector.getDefault());
    }

    static DefaultHttpClient newDefaultHttpClient(SSLSocketFactory sslsocketfactory, HttpParams httpparams, ProxySelector proxyselector)
    {
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeregistry.register(new Scheme("https", sslsocketfactory, 443));
        sslsocketfactory = new DefaultHttpClient(new ThreadSafeClientConnManager(httpparams, schemeregistry), httpparams);
        sslsocketfactory.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        if (proxyselector != null)
        {
            sslsocketfactory.setRoutePlanner(new ProxySelectorRoutePlanner(schemeregistry, proxyselector));
        }
        return sslsocketfactory;
    }

    static HttpParams newDefaultHttpParams()
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, false);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        ConnManagerParams.setMaxTotalConnections(basichttpparams, 200);
        ConnManagerParams.setMaxConnectionsPerRoute(basichttpparams, new ConnPerRouteBean(20));
        return basichttpparams;
    }

    protected volatile LowLevelHttpRequest buildRequest(String s, String s1)
        throws IOException
    {
        return buildRequest(s, s1);
    }

    protected ApacheHttpRequest buildRequest(String s, String s1)
    {
        if (s.equals("DELETE"))
        {
            s = new HttpDelete(s1);
        } else
        if (s.equals("GET"))
        {
            s = new HttpGet(s1);
        } else
        if (s.equals("HEAD"))
        {
            s = new HttpHead(s1);
        } else
        if (s.equals("POST"))
        {
            s = new HttpPost(s1);
        } else
        if (s.equals("PUT"))
        {
            s = new HttpPut(s1);
        } else
        if (s.equals("TRACE"))
        {
            s = new HttpTrace(s1);
        } else
        if (s.equals("OPTIONS"))
        {
            s = new HttpOptions(s1);
        } else
        {
            s = new HttpExtensionMethod(s, s1);
        }
        return new ApacheHttpRequest(httpClient, s);
    }

    public HttpClient getHttpClient()
    {
        return httpClient;
    }

    public void shutdown()
    {
        httpClient.getConnectionManager().shutdown();
    }

    public boolean supportsMethod(String s)
    {
        return true;
    }
}
