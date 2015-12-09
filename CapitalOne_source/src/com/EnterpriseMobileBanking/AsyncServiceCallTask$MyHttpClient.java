// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.content.Context;
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
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AsyncServiceCallTask

class context extends DefaultHttpClient
{
    public class MySSLSocketFactory extends SSLSocketFactory
    {

        SSLContext sslContext;
        final AsyncServiceCallTask.MyHttpClient this$1;

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

        public MySSLSocketFactory(KeyStore keystore)
            throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
        {
            this$1 = AsyncServiceCallTask.MyHttpClient.this;
            super(keystore);
            sslContext = SSLContext.getInstance("TLS");
            myhttpclient = new _cls1();
            sslContext.init(null, new TrustManager[] {
                AsyncServiceCallTask.MyHttpClient.this
            }, null);
        }
    }


    final Context context;
    TrustManager easyTrustManager;
    final AsyncServiceCallTask this$0;

    private MySSLSocketFactory newSslSocketFactory()
    {
        Object obj;
        Exception exception;
        try
        {
            obj = KeyStore.getInstance("BKS");
        }
        catch (Exception exception1)
        {
            throw new AssertionError(exception1);
        }
        ((KeyStore) (obj)).load(null, null);
        obj = new MySSLSocketFactory(((KeyStore) (obj)));
        ((MySSLSocketFactory) (obj)).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        return ((MySSLSocketFactory) (obj));
        exception;
        throw exception;
    }

    protected ClientConnectionManager createClientConnectionManager()
    {
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeregistry.register(new Scheme("https", newSslSocketFactory(), 443));
        return new SingleClientConnManager(getParams(), schemeregistry);
    }

    public _cls1.this._cls1(Context context1)
    {
        this$0 = AsyncServiceCallTask.this;
        super();
        easyTrustManager = new X509TrustManager() {

            final AsyncServiceCallTask.MyHttpClient this$1;

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
                this$1 = AsyncServiceCallTask.MyHttpClient.this;
                super();
            }
        };
        context = context1;
    }

    // Unreferenced inner class com/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory$1

/* anonymous class */
    class MySSLSocketFactory._cls1
        implements X509TrustManager
    {

        final MySSLSocketFactory this$2;
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
                this$2 = final_mysslsocketfactory;
                this$1 = AsyncServiceCallTask.MyHttpClient.this;
                super();
            }
    }

}
