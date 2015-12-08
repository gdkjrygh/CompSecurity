// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.offline.AlarmManagerReceiver;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import java.util.concurrent.TimeUnit;

public class DailyUpdateScheduler
{
    public static class PendingIntentFactory
    {

        public PendingIntent getPendingIntent(Context context1, int i)
        {
            Intent intent = new Intent(context1, com/soundcloud/android/offline/AlarmManagerReceiver);
            intent.setAction("action_start_update");
            return PendingIntent.getBroadcast(context1, 0x7f0f001e, intent, i);
        }

        PendingIntentFactory()
        {
        }
    }


    static final int ALARM_TYPE = 0;
    static final long POLICY_UPDATE_DELAY;
    static final int REQUEST_ID = 0x7f0f001e;
    private final AlarmManager alarmManager;
    private final Context context;
    private final DateProvider dateProvider;
    private final PendingIntentFactory pendingIntentFactory;

    public DailyUpdateScheduler(Context context1, AlarmManager alarmmanager, CurrentDateProvider currentdateprovider, PendingIntentFactory pendingintentfactory)
    {
        context = context1;
        alarmManager = alarmmanager;
        dateProvider = currentdateprovider;
        pendingIntentFactory = pendingintentfactory;
    }

    private boolean isNextUpdateAlreadyScheduled()
    {
        return pendingIntentFactory.getPendingIntent(context, 0x20000000) != null;
    }

    public void schedule()
    {
        if (!isNextUpdateAlreadyScheduled())
        {
            PendingIntent pendingintent = pendingIntentFactory.getPendingIntent(context, 0x8000000);
            alarmManager.setInexactRepeating(0, dateProvider.getCurrentTime(), POLICY_UPDATE_DELAY, pendingintent);
        }
    }

    static 
    {
        POLICY_UPDATE_DELAY = TimeUnit.HOURS.toMillis(24L);
    }
}
