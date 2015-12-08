// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class SslUtils
{

    private SslUtils()
    {
    }

    public static KeyManagerFactory getDefaultKeyManagerFactory()
        throws NoSuchAlgorithmException
    {
        return KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
    }

    public static TrustManagerFactory getDefaultTrustManagerFactory()
        throws NoSuchAlgorithmException
    {
        return TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    }

    public static KeyManagerFactory getPkixKeyManagerFactory()
        throws NoSuchAlgorithmException
    {
        return KeyManagerFactory.getInstance("PKIX");
    }

    public static TrustManagerFactory getPkixTrustManagerFactory()
        throws NoSuchAlgorithmException
    {
        return TrustManagerFactory.getInstance("PKIX");
    }

    public static SSLContext getSslContext()
        throws NoSuchAlgorithmException
    {
        return SSLContext.getInstance("SSL");
    }

    public static SSLContext getTlsSslContext()
        throws NoSuchAlgorithmException
    {
        return SSLContext.getInstance("TLS");
    }

    public static SSLContext initSslContext(SSLContext sslcontext, KeyStore keystore, TrustManagerFactory trustmanagerfactory)
        throws GeneralSecurityException
    {
        trustmanagerfactory.init(keystore);
        sslcontext.init(null, trustmanagerfactory.getTrustManagers(), null);
        return sslcontext;
    }

    public static HostnameVerifier trustAllHostnameVerifier()
    {
        return new HostnameVerifier() {

            public boolean verify(String s, SSLSession sslsession)
            {
                return true;
            }

        };
    }

    public static SSLContext trustAllSSLContext()
        throws GeneralSecurityException
    {
        X509TrustManager x509trustmanager = new X509TrustManager() {

            public void checkClientTrusted(X509Certificate ax509certificate[], String s)
                throws CertificateException
            {
            }

            public void checkServerTrusted(X509Certificate ax509certificate[], String s)
                throws CertificateException
            {
            }

            public X509Certificate[] getAcceptedIssuers()
            {
                return null;
            }

        };
        SSLContext sslcontext = getTlsSslContext();
        sslcontext.init(null, new TrustManager[] {
            x509trustmanager
        }, null);
        return sslcontext;
    }
}
