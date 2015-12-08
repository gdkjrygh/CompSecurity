// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;


// Referenced classes of package com.mopub.volley:
//            Request, Response, ExecutorDelivery

final class c
    implements Runnable
{

    final ExecutorDelivery a;
    private final Request b;
    private final Response c;
    private final Runnable d;

    public c(ExecutorDelivery executordelivery, Request request, Response response, Runnable runnable)
    {
        a = executordelivery;
        super();
        b = request;
        c = response;
        d = runnable;
    }

    public final void run()
    {
        if (b.isCanceled())
        {
            b.a("canceled-at-delivery");
        } else
        {
            if (c.isSuccess())
            {
                b.deliverResponse(c.result);
            } else
            {
                b.deliverError(c.error);
            }
            if (c.intermediate)
            {
                b.addMarker("intermediate-response");
            } else
            {
                b.a("done");
            }
            if (d != null)
            {
                d.run();
                return;
            }
        }
    }
}
