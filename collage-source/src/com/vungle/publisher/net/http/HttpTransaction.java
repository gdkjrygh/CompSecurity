// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import android.os.SystemClock;
import com.vungle.log.Logger;
import com.vungle.publisher.ct;
import com.vungle.publisher.cw;
import java.util.EnumMap;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.net.http:
//            HttpTransport, HttpRequest

public class HttpTransaction
{
    public static class Factory
    {

        private static final EnumMap a;
        Provider c;

        public final HttpTransaction a(HttpRequest httprequest, ct ct1)
        {
            return a(httprequest, ct1, new cw());
        }

        public final HttpTransaction a(HttpRequest httprequest, ct ct1, cw cw1)
        {
            HttpTransaction httptransaction = (HttpTransaction)c.get();
            HttpTransaction.a(httptransaction, httprequest);
            HttpTransaction.a(httptransaction, ct1);
            com.vungle.publisher.async.ScheduledPriorityExecutor.b b1 = (com.vungle.publisher.async.ScheduledPriorityExecutor.b)a.get(httprequest.a());
            ct1 = b1;
            if (b1 == null)
            {
                Logger.w("VungleNetwork", (new StringBuilder("missing mapping for HttpTransaction requestType = ")).append(httprequest.a().toString()).toString());
                ct1 = com.vungle.publisher.async.ScheduledPriorityExecutor.b.p;
            }
            HttpTransaction.a(httptransaction, ct1);
            HttpTransaction.a(httptransaction, cw1);
            return httptransaction;
        }

        static 
        {
            EnumMap enummap = new EnumMap(com/vungle/publisher/net/http/HttpRequest$b);
            a = enummap;
            enummap.put(HttpRequest.b.a, com.vungle.publisher.async.ScheduledPriorityExecutor.b.i);
            a.put(HttpRequest.b.b, com.vungle.publisher.async.ScheduledPriorityExecutor.b.d);
            a.put(HttpRequest.b.c, com.vungle.publisher.async.ScheduledPriorityExecutor.b.j);
            a.put(HttpRequest.b.d, com.vungle.publisher.async.ScheduledPriorityExecutor.b.f);
            a.put(HttpRequest.b.e, com.vungle.publisher.async.ScheduledPriorityExecutor.b.c);
            a.put(HttpRequest.b.f, com.vungle.publisher.async.ScheduledPriorityExecutor.b.l);
            a.put(HttpRequest.b.g, com.vungle.publisher.async.ScheduledPriorityExecutor.b.m);
            a.put(HttpRequest.b.h, com.vungle.publisher.async.ScheduledPriorityExecutor.b.q);
            a.put(HttpRequest.b.i, com.vungle.publisher.async.ScheduledPriorityExecutor.b.e);
            a.put(HttpRequest.b.j, com.vungle.publisher.async.ScheduledPriorityExecutor.b.n);
            a.put(HttpRequest.b.l, com.vungle.publisher.async.ScheduledPriorityExecutor.b.s);
            a.put(HttpRequest.b.k, com.vungle.publisher.async.ScheduledPriorityExecutor.b.t);
        }

        public Factory()
        {
        }
    }


    public HttpRequest a;
    public cw b;
    public com.vungle.publisher.async.ScheduledPriorityExecutor.b c;
    HttpTransport d;
    private ct e;

    HttpTransaction()
    {
    }

    static com.vungle.publisher.async.ScheduledPriorityExecutor.b a(HttpTransaction httptransaction, com.vungle.publisher.async.ScheduledPriorityExecutor.b b1)
    {
        httptransaction.c = b1;
        return b1;
    }

    static ct a(HttpTransaction httptransaction, ct ct1)
    {
        httptransaction.e = ct1;
        return ct1;
    }

    static cw a(HttpTransaction httptransaction, cw cw1)
    {
        httptransaction.b = cw1;
        return cw1;
    }

    static HttpRequest a(HttpTransaction httptransaction, HttpRequest httprequest)
    {
        httptransaction.a = httprequest;
        return httprequest;
    }

    public final void a()
    {
        cw cw1 = b;
        if (cw1.a <= 0L)
        {
            cw1.a = SystemClock.elapsedRealtime();
        }
        cw1.b = cw1.b + 1;
        cw1.c = cw1.c + 1;
        e.c(this, d.a(a));
    }

    public String toString()
    {
        return (new StringBuilder("{")).append(a).append(", ").append(b).append("}").toString();
    }
}
