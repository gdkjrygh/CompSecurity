// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.bh;
import com.google.android.gms.analytics.internal.j;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService, b

class a
    implements bh
{

    final int a;
    final ab b;
    final j c;
    final AnalyticsService d;

    a(AnalyticsService analyticsservice, int i, ab ab, j j)
    {
        d = analyticsservice;
        a = i;
        b = ab;
        c = j;
        super();
    }

    public void a(Throwable throwable)
    {
        AnalyticsService.a(d).post(new b(this));
    }
}
