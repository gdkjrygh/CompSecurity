// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.j;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

final class d
    implements Runnable
{

    final j a;
    final Handler b;
    final int c;
    final CampaignTrackingService d;

    d(CampaignTrackingService campaigntrackingservice, j j, Handler handler, int i)
    {
        d = campaigntrackingservice;
        a = j;
        b = handler;
        c = i;
        super();
    }

    public final void run()
    {
        d.a(a, b, c);
    }
}
