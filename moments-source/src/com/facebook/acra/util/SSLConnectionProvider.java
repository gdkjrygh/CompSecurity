// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

import com.facebook.acra.ACRA;
import com.facebook.acra.reporter.ReportsCrashes;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

// Referenced classes of package com.facebook.acra.util:
//            HttpConnectionProvider

public class SSLConnectionProvider
    implements HttpConnectionProvider
{

    private Proxy mProxy;

    public SSLConnectionProvider(Proxy proxy)
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
        return initializeConnectionParameters((HttpURLConnection)(HttpURLConnection)url);
    }

    public HttpURLConnection initializeConnectionParameters(HttpURLConnection httpurlconnection)
    {
        httpurlconnection.setConnectTimeout(ACRA.getConfig().socketTimeout());
        httpurlconnection.setReadTimeout(ACRA.getConfig().socketTimeout());
        return httpurlconnection;
    }
}
