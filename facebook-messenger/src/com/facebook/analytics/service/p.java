// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;


// Referenced classes of package com.facebook.analytics.service:
//            f, AnalyticsService, n

class p
    implements f
{

    final AnalyticsService a;

    private p(AnalyticsService analyticsservice)
    {
        a = analyticsservice;
        super();
    }

    p(AnalyticsService analyticsservice, n n)
    {
        this(analyticsservice);
    }

    public void a()
    {
        synchronized (AnalyticsService.a(a))
        {
            if (AnalyticsService.b(a))
            {
                AnalyticsService.a(a, false);
                a.stopSelf();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
