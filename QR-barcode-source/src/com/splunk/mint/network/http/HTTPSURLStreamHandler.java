// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network.http;

import com.splunk.mint.network.MonitorRegistry;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

// Referenced classes of package com.splunk.mint.network.http:
//            URLStreamHandlerBase, MonitorableHttpsURLConnection

public class HTTPSURLStreamHandler extends URLStreamHandlerBase
{

    private static final int PORT = 443;
    private static final String PROTOCOL = "https";
    private static final String SYSTEM_CLASSES[] = {
        "libcore.net.http.HttpsURLConnectionImpl", "org.apache.harmony.luni.internal.net.www.protocol.http.HttpsURLConnectionImpl", "org.apache.harmony.luni.internal.net.www.protocol.http.HttpsURLConnection"
    };
    private final MonitorRegistry registry;

    public HTTPSURLStreamHandler(MonitorRegistry monitorregistry)
        throws ClassNotFoundException
    {
        super(SYSTEM_CLASSES);
        registry = monitorregistry;
    }

    public int getDefaultPort()
    {
        return 443;
    }

    public String getProtocol()
    {
        return "https";
    }

    protected URLConnection openConnection(URL url)
        throws IOException
    {
        url = super.openConnection(url);
        return new MonitorableHttpsURLConnection(registry, url);
    }

    protected URLConnection openConnection(URL url, Proxy proxy)
        throws IOException
    {
        url = super.openConnection(url, proxy);
        return new MonitorableHttpsURLConnection(registry, url);
    }

}
