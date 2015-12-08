// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http.javanet;

import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.SslUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.google.api.client.http.javanet:
//            NetHttpTransport

public static final class A
{

    private HostnameVerifier hostnameVerifier;
    private Proxy proxy;
    private SSLSocketFactory sslSocketFactory;

    public NetHttpTransport build()
    {
        return new NetHttpTransport(proxy, sslSocketFactory, hostnameVerifier);
    }

    public hostnameVerifier doNotValidateCertificate()
        throws GeneralSecurityException
    {
        hostnameVerifier = SslUtils.trustAllHostnameVerifier();
        sslSocketFactory = SslUtils.trustAllSSLContext().getSocketFactory();
        return this;
    }

    public HostnameVerifier getHostnameVerifier()
    {
        return hostnameVerifier;
    }

    public SSLSocketFactory getSslSocketFactory()
    {
        return sslSocketFactory;
    }

    public sslSocketFactory setHostnameVerifier(HostnameVerifier hostnameverifier)
    {
        hostnameVerifier = hostnameverifier;
        return this;
    }

    public hostnameVerifier setProxy(Proxy proxy1)
    {
        proxy = proxy1;
        return this;
    }

    public proxy setSslSocketFactory(SSLSocketFactory sslsocketfactory)
    {
        sslSocketFactory = sslsocketfactory;
        return this;
    }

    public sslSocketFactory trustCertificates(KeyStore keystore)
        throws GeneralSecurityException
    {
        SSLContext sslcontext = SslUtils.getTlsSslContext();
        SslUtils.initSslContext(sslcontext, keystore, SslUtils.getPkixTrustManagerFactory());
        return setSslSocketFactory(sslcontext.getSocketFactory());
    }

    public setSslSocketFactory trustCertificatesFromJavaKeyStore(InputStream inputstream, String s)
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

    public A()
    {
    }
}
