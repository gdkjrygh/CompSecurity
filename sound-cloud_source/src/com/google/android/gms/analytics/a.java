// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.X;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.v;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService, b

final class a
    implements X
{

    final int a;
    final v b;
    final g c;
    final AnalyticsService d;

    a(AnalyticsService analyticsservice, int i, v v, g g)
    {
        d = analyticsservice;
        a = i;
        b = v;
        c = g;
        super();
    }

    public final void a()
    {
        AnalyticsService.a(d).post(new b(this));
    }
}
