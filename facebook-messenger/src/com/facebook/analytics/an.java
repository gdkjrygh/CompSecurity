// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.i.d;
import com.facebook.http.b.ar;
import com.facebook.http.b.au;
import com.facebook.http.b.t;
import org.apache.http.protocol.HttpRequestInterceptorList;
import org.apache.http.protocol.HttpResponseInterceptorList;

// Referenced classes of package com.facebook.analytics:
//            ap, aq, ck

public class an
    implements t
{

    private static final Class a = com/facebook/analytics/an;
    private final ck b;
    private final d c;
    private final au d;
    private final ar e;

    public an(ck ck, d d1, au au, ar ar)
    {
        b = ck;
        c = d1;
        d = au;
        e = ar;
    }

    static d a(an an1)
    {
        return an1.c;
    }

    static ar b(an an1)
    {
        return an1.e;
    }

    static ck c(an an1)
    {
        return an1.b;
    }

    static au d(an an1)
    {
        return an1.d;
    }

    public void a(HttpRequestInterceptorList httprequestinterceptorlist, HttpResponseInterceptorList httpresponseinterceptorlist)
    {
        if (b == null)
        {
            return;
        } else
        {
            httprequestinterceptorlist.addRequestInterceptor(new ap(this, null));
            httpresponseinterceptorlist.addResponseInterceptor(new aq(this, null), 0);
            return;
        }
    }

}
