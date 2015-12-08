// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;

// Referenced classes of package org.apache.http.protocol:
//            HttpContext

public class ResponseConnControl
    implements HttpResponseInterceptor
{

    public ResponseConnControl()
    {
    }

    public void process(HttpResponse httpresponse, HttpContext httpcontext)
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i == 400 || i == 408 || i == 411 || i == 413 || i == 414 || i == 503 || i == 501)
        {
            httpresponse.setHeader("Connection", "Close");
        } else
        {
            Header header = httpresponse.getFirstHeader("Connection");
            if (header == null || !"Close".equalsIgnoreCase(header.getValue()))
            {
                HttpEntity httpentity = httpresponse.getEntity();
                if (httpentity != null)
                {
                    ProtocolVersion protocolversion = httpresponse.getStatusLine().getProtocolVersion();
                    if (httpentity.getContentLength() < 0L && (!httpentity.isChunked() || protocolversion.lessEquals(HttpVersion.HTTP_1_0)))
                    {
                        httpresponse.setHeader("Connection", "Close");
                        return;
                    }
                }
                httpcontext = (HttpRequest)httpcontext.getAttribute("http.request");
                if (httpcontext != null)
                {
                    Header header1 = httpcontext.getFirstHeader("Connection");
                    if (header1 != null)
                    {
                        httpresponse.setHeader("Connection", header1.getValue());
                        return;
                    }
                    if (httpcontext.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0))
                    {
                        httpresponse.setHeader("Connection", "Close");
                        return;
                    }
                }
            }
        }
    }
}
