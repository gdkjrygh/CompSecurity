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
//            URLStreamHandlerBase, MonitorableHttpURLConnection

public final class HTTPURLStreamHandler extends URLStreamHandlerBase
{

    private static final int PORT = 80;
    private static final String PROTOCOL = "http";
    private static final String SYSTEM_CLASSES[] = {
        "libcore.net.http.HttpURLConnectionImpl", "org.apache.harmony.luni.internal.net.www.protocol.http.HttpURLConnectionImpl", "org.apache.harmony.luni.internal.net.www.protocol.http.HttpURLConnection"
    };
    private final MonitorRegistry registry;

    public HTTPURLStreamHandler(MonitorRegistry monitorregistry)
        throws ClassNotFoundException
    {
        super(SYSTEM_CLASSES);
        registry = monitorregistry;
    }

    public int getDefaultPort()
    {
        return 80;
    }

    public String getProtocol()
    {
        return "http";
    }

    protected URLConnection openConnection(URL url)
        throws IOException
    {
        url = super.openConnection(url);
        return new MonitorableHttpURLConnection(registry, url);
    }

    protected URLConnection openConnection(URL url, Proxy proxy)
        throws IOException
    {
        url = super.openConnection(url, proxy);
        return new MonitorableHttpURLConnection(registry, url);
    }

}
