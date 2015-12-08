// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.j;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

final class e
    implements Runnable
{

    final int a;
    final j b;
    final CampaignTrackingService c;

    e(CampaignTrackingService campaigntrackingservice, int i, j j1)
    {
        c = campaigntrackingservice;
        a = i;
        b = j1;
        super();
    }

    public final void run()
    {
        boolean flag = c.stopSelfResult(a);
        if (flag)
        {
            b.a("Install campaign broadcast processed", Boolean.valueOf(flag));
        }
    }
}
