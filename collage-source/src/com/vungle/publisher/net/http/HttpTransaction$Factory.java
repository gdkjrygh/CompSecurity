// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import com.vungle.log.Logger;
import com.vungle.publisher.ct;
import com.vungle.publisher.cw;
import java.util.EnumMap;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.net.http:
//            HttpTransaction, HttpRequest

public static class 
{

    private static final EnumMap a;
    Provider c;

    public final HttpTransaction a(HttpRequest httprequest, ct ct)
    {
        return a(httprequest, ct, new cw());
    }

    public final HttpTransaction a(HttpRequest httprequest, ct ct, cw cw1)
    {
        HttpTransaction httptransaction = (HttpTransaction)c.get();
        HttpTransaction.a(httptransaction, httprequest);
        HttpTransaction.a(httptransaction, ct);
        com.vungle.publisher.async.r.b b = (com.vungle.publisher.async.r.b)a.get(httprequest.a());
        ct = b;
        if (b == null)
        {
            Logger.w("VungleNetwork", (new StringBuilder("missing mapping for HttpTransaction requestType = ")).append(httprequest.a().a()).toString());
            ct = com.vungle.publisher.async.r.b.p;
        }
        HttpTransaction.a(httptransaction, ct);
        HttpTransaction.a(httptransaction, cw1);
        return httptransaction;
    }

    static 
    {
        EnumMap enummap = new EnumMap(com/vungle/publisher/net/http/HttpRequest$b);
        a = enummap;
        enummap.put(a, com.vungle.publisher.async.r.b.i);
        a.put(a, com.vungle.publisher.async.r.b.d);
        a.put(a, com.vungle.publisher.async.r.b.j);
        a.put(a, com.vungle.publisher.async.r.b.f);
        a.put(a, com.vungle.publisher.async.r.b.c);
        a.put(a, com.vungle.publisher.async.r.b.l);
        a.put(a, com.vungle.publisher.async.r.b.m);
        a.put(a, com.vungle.publisher.async.r.b.q);
        a.put(a, com.vungle.publisher.async.r.b.e);
        a.put(a, com.vungle.publisher.async.r.b.n);
        a.put(a, com.vungle.publisher.async.r.b.s);
        a.put(a, com.vungle.publisher.async.r.b.t);
    }

    public ()
    {
    }
}
