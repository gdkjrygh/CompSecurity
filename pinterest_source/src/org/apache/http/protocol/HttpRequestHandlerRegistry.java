// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import java.util.Map;

// Referenced classes of package org.apache.http.protocol:
//            HttpRequestHandlerResolver, UriPatternMatcher, HttpRequestHandler

public class HttpRequestHandlerRegistry
    implements HttpRequestHandlerResolver
{

    private final UriPatternMatcher matcher = new UriPatternMatcher();

    public HttpRequestHandlerRegistry()
    {
    }

    public Map getHandlers()
    {
        return matcher.getObjects();
    }

    public HttpRequestHandler lookup(String s)
    {
        return (HttpRequestHandler)matcher.lookup(s);
    }

    public void register(String s, HttpRequestHandler httprequesthandler)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("URI request pattern may not be null");
        }
        if (httprequesthandler == null)
        {
            throw new IllegalArgumentException("Request handler may not be null");
        } else
        {
            matcher.register(s, httprequesthandler);
            return;
        }
    }

    public void setHandlers(Map map)
    {
        matcher.setObjects(map);
    }

    public void unregister(String s)
    {
        matcher.unregister(s);
    }
}
