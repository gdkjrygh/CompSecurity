// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.k;

import com.facebook.http.b.t;
import org.apache.http.protocol.HttpRequestInterceptorList;
import org.apache.http.protocol.HttpResponseInterceptorList;

// Referenced classes of package com.facebook.k:
//            d, a

public class b
    implements t
{

    private final a a;

    public b(a a1)
    {
        a = a1;
    }

    static a a(b b1)
    {
        return b1.a;
    }

    public void a(HttpRequestInterceptorList httprequestinterceptorlist, HttpResponseInterceptorList httpresponseinterceptorlist)
    {
        httprequestinterceptorlist.addRequestInterceptor(new d(this, null));
    }
}
