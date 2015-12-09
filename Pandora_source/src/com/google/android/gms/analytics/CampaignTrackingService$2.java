// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzae;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

class c
    implements Runnable
{

    final zzae a;
    final Handler b;
    final int c;
    final CampaignTrackingService d;

    public void run()
    {
        d.zza(a, b, c);
    }

    (CampaignTrackingService campaigntrackingservice, zzae zzae, Handler handler, int i)
    {
        d = campaigntrackingservice;
        a = zzae;
        b = handler;
        c = i;
        super();
    }
}
