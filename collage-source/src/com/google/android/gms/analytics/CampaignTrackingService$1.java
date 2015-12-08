// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.g;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

class c
    implements Runnable
{

    final g a;
    final Handler b;
    final int c;
    final CampaignTrackingService d;

    public void run()
    {
        d.a(a, b, c);
    }

    (CampaignTrackingService campaigntrackingservice, g g, Handler handler, int i)
    {
        d = campaigntrackingservice;
        a = g;
        b = handler;
        c = i;
        super();
    }
}
