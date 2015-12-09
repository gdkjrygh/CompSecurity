// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import android.os.Handler;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.logging.Logger;
import eds;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads:
//            AdEventReporter

final class > extends com.spotify.cosmos.android.eceiver
{

    private Request a;
    private String b;
    private String c;
    private eds d;
    private AdEventReporter e;

    protected final void onError(Throwable throwable)
    {
        Logger.c("failed to resolve %s %s %s", new Object[] {
            a.getAction(), b, c
        });
        if (d != null)
        {
            d.a(throwable);
        }
        synchronized (AdEventReporter.b(e))
        {
            if (AdEventReporter.c(e) == 0)
            {
                AdEventReporter.d(e);
            }
        }
        return;
        exception;
        throwable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void onResolved(Response response)
    {
        Logger.a("resolved %s %s %s", new Object[] {
            a.getAction(), b, c
        });
        if (d != null)
        {
            d.a(response);
        }
        synchronized (AdEventReporter.b(e))
        {
            if (AdEventReporter.c(e) == 0)
            {
                AdEventReporter.d(e);
            }
        }
        return;
        exception;
        response;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (AdEventReporter adeventreporter, Handler handler, Request request, String s, String s1, eds eds1)
    {
        e = adeventreporter;
        a = request;
        b = s;
        c = s1;
        d = eds1;
        super(handler);
    }
}
