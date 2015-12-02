// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import com.facebook.analytics.ce;
import java.util.List;

// Referenced classes of package com.facebook.analytics.service:
//            AnalyticsService

public class o extends ce
{

    final AnalyticsService a;

    protected o(AnalyticsService analyticsservice)
    {
        a = analyticsservice;
        super();
    }

    public void a(List list)
    {
        AnalyticsService.a(a, list);
    }
}
