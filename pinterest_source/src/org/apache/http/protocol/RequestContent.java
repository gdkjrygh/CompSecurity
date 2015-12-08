// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;

// Referenced classes of package org.apache.http.protocol:
//            HttpContext

public class RequestContent
    implements HttpRequestInterceptor
{

    private final boolean overwrite;

    public RequestContent()
    {
        this(false);
    }

    public RequestContent(boolean flag)
    {
        overwrite = flag;
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httprequest instanceof HttpEntityEnclosingRequest)
        {
            HttpEntity httpentity;
            if (overwrite)
            {
                httprequest.removeHeaders("Transfer-Encoding");
                httprequest.removeHeaders("Content-Length");
            } else
            {
                if (httprequest.containsHeader("Transfer-Encoding"))
                {
                    throw new ProtocolException("Transfer-encoding header already present");
                }
                if (httprequest.containsHeader("Content-Length"))
                {
                    throw new ProtocolException("Content-Length header already present");
                }
            }
            httpcontext = httprequest.getRequestLine().getProtocolVersion();
            httpentity = ((HttpEntityEnclosingRequest)httprequest).getEntity();
            if (httpentity == null)
            {
                httprequest.addHeader("Content-Length", "0");
            } else
            {
                if (httpentity.isChunked() || httpentity.getContentLength() < 0L)
                {
                    if (httpcontext.lessEquals(HttpVersion.HTTP_1_0))
                    {
                        throw new ProtocolException((new StringBuilder("Chunked transfer encoding not allowed for ")).append(httpcontext).toString());
                    }
                    httprequest.addHeader("Transfer-Encoding", "chunked");
                } else
                {
                    httprequest.addHeader("Content-Length", Long.toString(httpentity.getContentLength()));
                }
                if (httpentity.getContentType() != null && !httprequest.containsHeader("Content-Type"))
                {
                    httprequest.addHeader(httpentity.getContentType());
                }
                if (httpentity.getContentEncoding() != null && !httprequest.containsHeader("Content-Encoding"))
                {
                    httprequest.addHeader(httpentity.getContentEncoding());
                    return;
                }
            }
        }
    }
}
