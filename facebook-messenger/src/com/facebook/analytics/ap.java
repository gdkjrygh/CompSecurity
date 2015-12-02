// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.i.d;
import com.facebook.http.b.ar;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.analytics:
//            an, ck, ao

final class ap
    implements HttpRequestInterceptor
{

    final an a;

    private ap(an an1)
    {
        a = an1;
        super();
    }

    ap(an an1, ao ao)
    {
        this(an1);
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        long l = an.a(a).a(httprequest);
        httprequest = an.b(a).b(httprequest, httpcontext);
        an.c(a).a(httprequest, l);
    }
}
