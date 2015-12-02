// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.util;

import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.acra.ACRA;
import org.acra.reporter.ReportsCrashes;

// Referenced classes of package org.acra.util:
//            HttpConnectionProvider, TrustEveryoneTrustManager

public class UnsafeConnectionProvider
    implements HttpConnectionProvider
{

    public UnsafeConnectionProvider()
    {
    }

    public HttpURLConnection getConnection(URL url)
    {
        url = (HttpURLConnection)url.openConnection();
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
