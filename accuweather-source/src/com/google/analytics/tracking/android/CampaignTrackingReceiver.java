// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.analytics.tracking.android:
//            CampaignTrackingService

public final class CampaignTrackingReceiver extends BroadcastReceiver
{

    static final String CAMPAIGN_KEY = "referrer";
    static final String INSTALL_ACTION = "com.android.vending.INSTALL_REFERRER";

    public CampaignTrackingReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getStringExtra("referrer");
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) || s == null)
        {
            return;
        } else
        {
            intent = new Intent(context, com/google/analytics/tracking/android/CampaignTrackingService);
            intent.putExtra("referrer", s);
            context.startService(intent);
            return;
        }
    }
}
