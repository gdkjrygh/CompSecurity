// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package org.apache.http.protocol:
//            HttpContext

public class RequestExpectContinue
    implements HttpRequestInterceptor
{

    public RequestExpectContinue()
    {
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httprequest instanceof HttpEntityEnclosingRequest)
        {
            httpcontext = ((HttpEntityEnclosingRequest)httprequest).getEntity();
            if (httpcontext != null && httpcontext.getContentLength() != 0L)
            {
                httpcontext = httprequest.getRequestLine().getProtocolVersion();
                if (HttpProtocolParams.useExpectContinue(httprequest.getParams()) && !httpcontext.lessEquals(HttpVersion.HTTP_1_0))
                {
                    httprequest.addHeader("Expect", "100-continue");
                }
            }
        }
    }
}
