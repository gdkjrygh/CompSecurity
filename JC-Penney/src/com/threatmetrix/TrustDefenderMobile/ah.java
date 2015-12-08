// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import android.util.TimingLogger;
import java.util.concurrent.CountDownLatch;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            g, ag, c, an, 
//            NativeGatherer, ab

final class ah extends g
{

    final Context a;
    final boolean b;
    final ag c;

    ah(ag ag1, ag ag2, CountDownLatch countdownlatch, Context context, boolean flag)
    {
        c = ag1;
        a = context;
        b = flag;
        super(ag2, null);
    }

    public final void run()
    {
        ag.d();
        ag.a(c).a(a, b, 0);
        if (ag.b(c) != null)
        {
            ag.b(c).addSplit("init - initJSExecutor");
        }
        Object obj = ag.a(c).a();
        if (ag.b(c) != null)
        {
            ag.b(c).addSplit("getUserAgent");
        }
        if (c.b == null)
        {
            c.b = AndroidHttpClient.newInstance(((String) (obj)), ag.c(c));
            obj = c.b.getParams();
            HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), ag.d(c));
            HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), ag.d(c));
            an.a(a, c.b, ag.d(c));
            HttpConnectionParams.setTcpNoDelay(((org.apache.http.params.HttpParams) (obj)), true);
            HttpConnectionParams.setStaleCheckingEnabled(((org.apache.http.params.HttpParams) (obj)), false);
        }
        if (ag.b(c) != null)
        {
            ag.b(c).addSplit("create AndroidHttpClient");
        }
        NativeGatherer.a.a();
        ab.b(null);
        if (ag.e(c) != null)
        {
            ag.e(c).countDown();
        }
        return;
        Exception exception;
        exception;
        if (ag.e(c) != null)
        {
            ag.e(c).countDown();
        }
        throw exception;
    }
}
