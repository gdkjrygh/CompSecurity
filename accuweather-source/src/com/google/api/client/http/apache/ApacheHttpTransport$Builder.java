// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http.apache;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.SslUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import org.apache.http.HttpHost;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.google.api.client.http.apache:
//            ApacheHttpTransport, SSLSocketFactoryExtension

public static final class proxySelector
{

    private HttpParams params;
    private ProxySelector proxySelector;
    private SSLSocketFactory socketFactory;

    public ApacheHttpTransport build()
    {
        return new ApacheHttpTransport(ApacheHttpTransport.newDefaultHttpClient(socketFactory, params, proxySelector));
    }

    public proxySelector doNotValidateCertificate()
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

    public socketFactory setProxy(HttpHost httphost)
    {
        ConnRouteParams.setDefaultProxy(params, httphost);
        if (httphost != null)
        {
            proxySelector = null;
        }
        return this;
    }

    public proxySelector setProxySelector(ProxySelector proxyselector)
    {
        proxySelector = proxyselector;
        if (proxyselector != null)
        {
            ConnRouteParams.setDefaultProxy(params, null);
        }
        return this;
    }

    public params setSocketFactory(SSLSocketFactory sslsocketfactory)
    {
        socketFactory = (SSLSocketFactory)Preconditions.checkNotNull(sslsocketfactory);
        return this;
    }

    public socketFactory trustCertificates(KeyStore keystore)
        throws GeneralSecurityException
    {
        javax.net.ssl.SSLContext sslcontext = SslUtils.getTlsSslContext();
        SslUtils.initSslContext(sslcontext, keystore, SslUtils.getPkixTrustManagerFactory());
        return setSocketFactory(new SSLSocketFactoryExtension(sslcontext));
    }

    public nit> trustCertificatesFromJavaKeyStore(InputStream inputstream, String s)
        throws GeneralSecurityException, IOException
    {
        KeyStore keystore = SecurityUtils.getJavaKeyStore();
        SecurityUtils.loadKeyStore(keystore, inputstream, s);
        return trustCertificates(keystore);
    }

    public trustCertificates trustCertificatesFromStream(InputStream inputstream)
        throws GeneralSecurityException, IOException
    {
        KeyStore keystore = SecurityUtils.getJavaKeyStore();
        keystore.load(null, null);
        SecurityUtils.loadKeyStoreFromCertificates(keystore, SecurityUtils.getX509CertificateFactory(), inputstream);
        return trustCertificates(keystore);
    }

    public ()
    {
        socketFactory = SSLSocketFactory.getSocketFactory();
        params = ApacheHttpTransport.newDefaultHttpParams();
        proxySelector = ProxySelector.getDefault();
    }
}
