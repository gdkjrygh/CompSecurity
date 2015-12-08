// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location.impl;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.digby.mm.android.library.location.IDownloadGeofenceAlarmManager;
import com.digby.mm.android.library.services.impl.GeofenceTransitionsService;
import com.digby.mm.android.library.utils.Logger;

public class DownloadGeofenceAlarmManager
    implements IDownloadGeofenceAlarmManager
{

    private AlarmManager mAlarmManager;
    private Context mContext;
    private PendingIntent mPendingIntent;

    public DownloadGeofenceAlarmManager(Context context)
    {
        mContext = context;
        mAlarmManager = (AlarmManager)mContext.getSystemService("alarm");
        Intent intent = new Intent(context, com/digby/mm/android/library/services/impl/GeofenceTransitionsService);
        intent.setAction("Action_Wakeup_Alarm");
        mPendingIntent = PendingIntent.getService(context, 0, intent, 0x8000000);
    }

    public void setDailyDownloadGeofenceAlarm()
    {
        mAlarmManager.cancel(mPendingIntent);
        Logger.Debug("Set alarm to wake up GTS next day", mContext);
        mAlarmManager.set(1, System.currentTimeMillis() + 0x240c8400L, mPendingIntent);
    }
}
