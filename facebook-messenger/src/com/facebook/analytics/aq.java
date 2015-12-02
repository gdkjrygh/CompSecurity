// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.i.d;
import com.facebook.http.b.ar;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.analytics:
//            an, ck, ar, ao

final class aq
    implements HttpResponseInterceptor
{

    final an a;

    private aq(an an1)
    {
        a = an1;
        super();
    }

    aq(an an1, ao ao)
    {
        this(an1);
    }

    public void process(HttpResponse httpresponse, HttpContext httpcontext)
    {
        String s = an.a(a).a(httpresponse);
        long l2 = an.a(a).a(httpresponse);
        long l1 = an.a(a).b(httpresponse);
        HttpEntity httpentity = httpresponse.getEntity();
        long l = l1;
        if (l1 < 0L)
        {
            l = httpentity.getContentLength();
        }
        java.net.URI uri = an.b(a).b(null, httpcontext);
        an.c(a).a(uri, s, l2, l);
        boolean flag;
        if (l < 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        httpresponse.setEntity(new com.facebook.analytics.ar(a, httpentity, uri, s, httpcontext, flag));
    }
}
