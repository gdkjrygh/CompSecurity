// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.content.WakefulBroadcastReceiver;

// Referenced classes of package com.accuweather.android.services:
//            WearablesServiceExtended

public class WearablesBroadcastReceiver extends WakefulBroadcastReceiver
{

    public static final String TAG = "WearablesBroadcastReceiver";
    private PendingIntent alarmIntent;
    private AlarmManager alarmMgr;

    public WearablesBroadcastReceiver()
    {
    }

    public void cancelAlarm(Context context)
    {
        if (alarmMgr != null)
        {
            alarmMgr.cancel(alarmIntent);
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = new Intent(context, com/accuweather/android/services/WearablesServiceExtended);
        intent.putExtra("update_wearables_service", true);
        context.startService(intent);
    }

    public void startAlarm(Context context)
    {
        alarmMgr = (AlarmManager)context.getSystemService("alarm");
        alarmIntent = PendingIntent.getBroadcast(context, 0, new Intent(context, com/accuweather/android/services/WearablesBroadcastReceiver), 0);
        alarmMgr.setInexactRepeating(2, SystemClock.elapsedRealtime() + 0x124f80L, 0x124f80L, alarmIntent);
    }
}
