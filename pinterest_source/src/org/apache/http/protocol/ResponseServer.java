// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.protocol:
//            HttpContext

public class ResponseServer
    implements HttpResponseInterceptor
{

    public ResponseServer()
    {
    }

    public void process(HttpResponse httpresponse, HttpContext httpcontext)
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (!httpresponse.containsHeader("Server"))
        {
            httpcontext = (String)httpresponse.getParams().getParameter("http.origin-server");
            if (httpcontext != null)
            {
                httpresponse.addHeader("Server", httpcontext);
            }
        }
    }
}
