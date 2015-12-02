// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.analytics.e.i;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.hardware.n;
import com.facebook.common.time.a;
import com.facebook.http.annotations.SslSocketFactory;
import com.facebook.inject.d;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.facebook.http.b:
//            g, w, x

class ac extends d
{

    final w a;

    private ac(w w)
    {
        a = w;
        super();
    }

    ac(w w, x x)
    {
        this(w);
    }

    public ClientConnectionManager a()
    {
        HttpParams httpparams = (HttpParams)a(org/apache/http/params/HttpParams);
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeregistry.register(new Scheme("https", (SocketFactory)a(org/apache/http/conn/scheme/SocketFactory, com/facebook/http/annotations/SslSocketFactory), 443));
        return new g((Context)a(android/content/Context), httpparams, schemeregistry, (a)a(com/facebook/common/time/a), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (PowerManager)a(android/os/PowerManager), (n)a(com/facebook/common/hardware/n), (ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/DefaultExecutorService), (i)a(com/facebook/analytics/e/i));
    }

    public Object b()
    {
        return a();
    }
}
