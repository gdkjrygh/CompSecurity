// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.k;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.k:
//            b, a, c

final class d
    implements HttpRequestInterceptor
{

    final b a;

    private d(b b1)
    {
        a = b1;
        super();
    }

    d(b b1, c c)
    {
        this(b1);
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        b.a(a).a();
    }
}
