// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import bmp;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

final class b
    implements Runnable
{

    private int a;
    private bmp b;
    private CampaignTrackingService c;

    public final void run()
    {
        boolean flag = c.stopSelfResult(a);
        if (flag)
        {
            b.a("Install campaign broadcast processed", Boolean.valueOf(flag));
        }
    }

    (CampaignTrackingService campaigntrackingservice, int i, bmp bmp1)
    {
        c = campaigntrackingservice;
        a = i;
        b = bmp1;
        super();
    }
}
