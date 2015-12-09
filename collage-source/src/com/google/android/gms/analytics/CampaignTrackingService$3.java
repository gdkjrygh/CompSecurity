// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.g;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

class b
    implements Runnable
{

    final int a;
    final g b;
    final CampaignTrackingService c;

    public void run()
    {
        boolean flag = c.stopSelfResult(a);
        if (flag)
        {
            b.a("Install campaign broadcast processed", Boolean.valueOf(flag));
        }
    }

    (CampaignTrackingService campaigntrackingservice, int i, g g1)
    {
        c = campaigntrackingservice;
        a = i;
        b = g1;
        super();
    }
}
