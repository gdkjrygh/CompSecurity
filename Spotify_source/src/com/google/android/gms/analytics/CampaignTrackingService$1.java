// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import bmp;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

final class c
    implements Runnable
{

    private bmp a;
    private Handler b;
    private int c;
    private CampaignTrackingService d;

    public final void run()
    {
        d.a(a, b, c);
    }

    (CampaignTrackingService campaigntrackingservice, bmp bmp, Handler handler, int i)
    {
        d = campaigntrackingservice;
        a = bmp;
        b = handler;
        c = i;
        super();
    }
}
