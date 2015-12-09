// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import android.content.Context;
import android.net.http.HttpResponseCache;
import com.broadcom.bt.util.io.FileUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;

// Referenced classes of package com.fitbit.serverinteraction:
//            m, f

final class d extends g.b
{

    private static final String a = "FitbitHttpClient";
    private static final int b = 10000;
    private static final int c = 60000;

    public d(Context context)
    {
        if (HttpResponseCache.getInstalled() != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        context = new File(context.getCacheDir(), "httpcache");
        if (!context.mkdirs())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        HttpResponseCache.install(context, 10240L);
        return;
        IOException ioexception;
        ioexception;
        try
        {
            com.fitbit.e.a.a("FitbitHttpClient", "Cache installation failed, deleteing cache directory", new Object[0]);
            FileUtils.deleteDirectory(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.fitbit.e.a.a("FitbitHttpClient", "Cache clean up when bad", new Object[0]);
        }
        return;
    }

    public HttpURLConnection a(URL url)
        throws IOException
    {
        m m1 = null;
        if (true)
        {
            m1 = new m((HttpURLConnection)url.openConnection());
        }
        a(((HttpURLConnection) (m1)));
        return m1;
    }

    void a(HttpURLConnection httpurlconnection)
    {
        if (httpurlconnection instanceof HttpsURLConnection)
        {
            X509HostnameVerifier x509hostnameverifier = SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
            com.fitbit.serverinteraction.f.a().setHostnameVerifier((X509HostnameVerifier)x509hostnameverifier);
            ((HttpsURLConnection)httpurlconnection).setHostnameVerifier(x509hostnameverifier);
        }
        httpurlconnection.setUseCaches(false);
        httpurlconnection.setInstanceFollowRedirects(true);
        httpurlconnection.setConnectTimeout(10000);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.addRequestProperty("User-Agent", System.getProperty("http.agent"));
        httpurlconnection.addRequestProperty("X-App-Version", String.valueOf(FitBitApplication.a().f().a()));
    }

    static 
    {
        System.setProperty("http.maxConnections", Integer.toString(10));
        System.setProperty("http.keepAlive", Boolean.toString(true));
    }
}
