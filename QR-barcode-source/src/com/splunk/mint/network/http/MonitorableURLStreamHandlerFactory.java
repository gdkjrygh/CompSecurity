// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network.http;

import com.splunk.mint.network.MonitorRegistry;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.splunk.mint.network.http:
//            HTTPURLStreamHandler, URLStreamHandlerBase, HTTPSURLStreamHandler

public class MonitorableURLStreamHandlerFactory
    implements URLStreamHandlerFactory
{

    private Map handlers;

    public MonitorableURLStreamHandlerFactory(MonitorRegistry monitorregistry)
        throws ClassNotFoundException
    {
        handlers = new HashMap();
        HTTPURLStreamHandler httpurlstreamhandler = new HTTPURLStreamHandler(monitorregistry);
        handlers.put(httpurlstreamhandler.getProtocol(), httpurlstreamhandler);
        monitorregistry = new HTTPSURLStreamHandler(monitorregistry);
        handlers.put(monitorregistry.getProtocol(), monitorregistry);
    }

    public URLStreamHandler createURLStreamHandler(String s)
    {
        return (URLStreamHandler)handlers.get(s);
    }
}
