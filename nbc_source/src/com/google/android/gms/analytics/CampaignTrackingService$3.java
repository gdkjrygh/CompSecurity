// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzaf;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

class zzIh
    implements Runnable
{

    final int zzIf;
    final zzaf zzIh;
    final CampaignTrackingService zzIo;

    public void run()
    {
        boolean flag = zzIo.stopSelfResult(zzIf);
        if (flag)
        {
            zzIh.zza("Install campaign broadcast processed", Boolean.valueOf(flag));
        }
    }

    (CampaignTrackingService campaigntrackingservice, int i, zzaf zzaf1)
    {
        zzIo = campaigntrackingservice;
        zzIf = i;
        zzIh = zzaf1;
        super();
    }
}
