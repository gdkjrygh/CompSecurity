// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import java.io.InputStream;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.analytics:
//            as, at, an

final class ar extends HttpEntityWrapper
{

    final an a;
    private final URI b;
    private final String c;
    private final HttpContext d;
    private final boolean e;
    private long f;

    public ar(an an, HttpEntity httpentity, URI uri, String s, HttpContext httpcontext, boolean flag)
    {
        a = an;
        super(httpentity);
        f = 0L;
        b = uri;
        c = s;
        d = httpcontext;
        e = flag;
    }

    static long a(ar ar1, long l)
    {
        ar1.f = l;
        return l;
    }

    static HttpContext a(ar ar1)
    {
        return ar1.d;
    }

    static long b(ar ar1)
    {
        return ar1.f;
    }

    static URI c(ar ar1)
    {
        return ar1.b;
    }

    static String d(ar ar1)
    {
        return ar1.c;
    }

    public InputStream getContent()
    {
        Object obj = wrappedEntity.getContent();
        if (e)
        {
            obj = new as(this, ((InputStream) (obj)));
        }
        return new at(this, ((InputStream) (obj)));
    }
}
