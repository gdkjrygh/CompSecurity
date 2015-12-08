// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

import com.facebook.acra.ACRA;
import com.facebook.acra.reporter.ReportsCrashes;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

// Referenced classes of package com.facebook.acra.util:
//            HttpConnectionProvider, TrustEveryoneTrustManager

public class UnsafeConnectionProvider
    implements HttpConnectionProvider
{

    private Proxy mProxy;

    public UnsafeConnectionProvider(Proxy proxy)
    {
        mProxy = proxy;
    }

    public HttpURLConnection getConnection(URL url)
    {
        if (mProxy != null)
        {
            url = url.openConnection(mProxy);
        } else
        {
            url = url.openConnection();
        }
        url = (HttpURLConnection)(HttpURLConnection)url;
        if (url instanceof HttpsURLConnection)
        {
            try
            {
                Object obj = SSLContext.getInstance("TLS");
                ((SSLContext) (obj)).init(null, new TrustManager[] {
                    new TrustEveryoneTrustManager()
                }, null);
                obj = ((SSLContext) (obj)).getSocketFactory();
                HttpsURLConnection httpsurlconnection = (HttpsURLConnection)url;
                httpsurlconnection.setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj)));
                httpsurlconnection.setHostnameVerifier(new _cls1());
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception) { }
            catch (KeyManagementException keymanagementexception) { }
        }
        return initializeConnectionParameters(url);
    }

    public HttpURLConnection initializeConnectionParameters(HttpURLConnection httpurlconnection)
    {
        httpurlconnection.setConnectTimeout(ACRA.getConfig().socketTimeout());
        httpurlconnection.setReadTimeout(ACRA.getConfig().socketTimeout());
        return httpurlconnection;
    }

    private class _cls1
        implements HostnameVerifier
    {

        final UnsafeConnectionProvider this$0;

        public boolean verify(String s, SSLSession sslsession)
        {
            return true;
        }

        _cls1()
        {
            this$0 = UnsafeConnectionProvider.this;
            super();
        }
    }

}
