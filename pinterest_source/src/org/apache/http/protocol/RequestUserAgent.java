// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package org.apache.http.protocol:
//            HttpContext

public class RequestUserAgent
    implements HttpRequestInterceptor
{

    public RequestUserAgent()
    {
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (!httprequest.containsHeader("User-Agent"))
        {
            httpcontext = HttpProtocolParams.getUserAgent(httprequest.getParams());
            if (httpcontext != null)
            {
                httprequest.addHeader("User-Agent", httpcontext);
            }
        }
    }
}
