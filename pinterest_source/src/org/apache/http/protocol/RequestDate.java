// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;

// Referenced classes of package org.apache.http.protocol:
//            HttpDateGenerator, HttpContext

public class RequestDate
    implements HttpRequestInterceptor
{

    private static final HttpDateGenerator DATE_GENERATOR = new HttpDateGenerator();

    public RequestDate()
    {
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null.");
        }
        if ((httprequest instanceof HttpEntityEnclosingRequest) && !httprequest.containsHeader("Date"))
        {
            httprequest.setHeader("Date", DATE_GENERATOR.getCurrentDate());
        }
    }

}
