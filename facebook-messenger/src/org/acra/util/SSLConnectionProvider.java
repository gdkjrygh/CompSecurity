// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.util;

import java.net.HttpURLConnection;
import java.net.URL;
import org.acra.ACRA;
import org.acra.reporter.ReportsCrashes;

// Referenced classes of package org.acra.util:
//            HttpConnectionProvider

public class SSLConnectionProvider
    implements HttpConnectionProvider
{

    public SSLConnectionProvider()
    {
    }

    public HttpURLConnection getConnection(URL url)
    {
        return initializeConnectionParameters((HttpURLConnection)url.openConnection());
    }

    public HttpURLConnection initializeConnectionParameters(HttpURLConnection httpurlconnection)
    {
        httpurlconnection.setConnectTimeout(ACRA.getConfig().socketTimeout());
        httpurlconnection.setReadTimeout(ACRA.getConfig().socketTimeout());
        return httpurlconnection;
    }
}
