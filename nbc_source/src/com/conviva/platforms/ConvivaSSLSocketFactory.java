// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.platforms;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

public class ConvivaSSLSocketFactory extends SSLSocketFactory
{

    private SSLContext sslContext;

    public ConvivaSSLSocketFactory(KeyStore keystore)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        super(keystore);
        sslContext = SSLContext.getInstance("TLS");
        keystore = new X509TrustManager() {

            final ConvivaSSLSocketFactory this$0;

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

            
            {
                this$0 = ConvivaSSLSocketFactory.this;
                super();
            }
        };
        sslContext.init(null, new TrustManager[] {
            keystore
        }, null);
    }

    public ConvivaSSLSocketFactory(SSLContext sslcontext)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        super(null);
        sslContext = SSLContext.getInstance("TLS");
        sslContext = sslcontext;
    }

    public Socket createSocket()
        throws IOException
    {
        return sslContext.getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
        throws IOException, UnknownHostException
    {
        return sslContext.getSocketFactory().createSocket(socket, s, i, flag);
    }
}
