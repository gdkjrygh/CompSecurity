// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.http.b:
//            o, s, p

class r
    implements HttpRequestInterceptor
{

    final o a;

    private r(o o1)
    {
        a = o1;
        super();
    }

    r(o o1, p p)
    {
        this(o1);
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        httpcontext = o.b(a);
        if (httpcontext != null && s.a(httpcontext) && (httprequest instanceof HttpUriRequest))
        {
            s.a(httpcontext, o.a((HttpUriRequest)httprequest, false));
        }
    }
}
