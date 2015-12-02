// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.a;

import android.content.ServiceConnection;
import com.facebook.analytics.cd;
import com.facebook.debug.log.b;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.analytics.a:
//            a

class c
    implements h
{

    final a a;
    private final ServiceConnection b;

    public c(a a1, ServiceConnection serviceconnection)
    {
        a = a1;
        super();
        b = serviceconnection;
    }

    public void a(cd cd1)
    {
        com.facebook.debug.log.b.a(com.facebook.analytics.a.a.e(), "AnalyticsConnectionCallback.onSuccess()");
        a.a(cd1);
        com.facebook.analytics.a.a.a(a, b);
    }

    public volatile void a(Object obj)
    {
        a((cd)obj);
    }

    public void a(Throwable throwable)
    {
        com.facebook.debug.log.b.a(com.facebook.analytics.a.a.e(), "AnalyticsConnectionCallback.onFailure()");
        com.facebook.analytics.a.a.a(a, b);
    }
}
