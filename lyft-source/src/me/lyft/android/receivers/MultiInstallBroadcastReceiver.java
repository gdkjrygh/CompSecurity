// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.mobileapptracker.Tracker;

// Referenced classes of package me.lyft.android.receivers:
//            ReferrerBroadcastReceiver

public class MultiInstallBroadcastReceiver extends BroadcastReceiver
{

    final BroadcastReceiver receivers[] = {
        new ReferrerBroadcastReceiver(), new Tracker(), new CampaignTrackingReceiver()
    };

    public MultiInstallBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        BroadcastReceiver abroadcastreceiver[] = receivers;
        int j = abroadcastreceiver.length;
        for (int i = 0; i < j; i++)
        {
            abroadcastreceiver[i].onReceive(context, intent);
        }

    }
}
