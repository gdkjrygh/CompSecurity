// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.bf;
import com.google.android.gms.analytics.internal.j;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService, b

final class a
    implements bf
{

    final int a;
    final aa b;
    final j c;
    final AnalyticsService d;

    a(AnalyticsService analyticsservice, int i, aa aa, j j)
    {
        d = analyticsservice;
        a = i;
        b = aa;
        c = j;
        super();
    }

    public final void a()
    {
        AnalyticsService.a(d).post(new b(this));
    }
}
