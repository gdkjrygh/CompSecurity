// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

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

// Referenced classes of package com.EnterpriseMobileBanking:
//            AsyncServiceCallTask

public class sslContext extends SSLSocketFactory
{

    SSLContext sslContext;
    final sslContext this$1;

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

    public _cls1.val.this._cls1(KeyStore keystore)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        this.this$1 = this._cls1.this;
        super(keystore);
        sslContext = SSLContext.getInstance("TLS");
        this$1 = new X509TrustManager() {

            final AsyncServiceCallTask.MyHttpClient.MySSLSocketFactory this$2;
            final AsyncServiceCallTask.MyHttpClient val$this$1;

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
                this$2 = AsyncServiceCallTask.MyHttpClient.MySSLSocketFactory.this;
                this$1 = myhttpclient;
                super();
            }
        };
        sslContext.init(null, new TrustManager[] {
            sslContext.this
        }, null);
    }
}
