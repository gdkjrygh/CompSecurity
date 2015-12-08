// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.receiver;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.pinterest.base.Application;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.NotificationUtils;

public class SignupNotificationReceiver extends BroadcastReceiver
{

    public SignupNotificationReceiver()
    {
    }

    public static void a(long l)
    {
        int i = Preferences.persisted().getInt("PREF_SIGNUP_NOTIF_SHOWN_TIMES", 0);
        if (i >= 3)
        {
            return;
        } else
        {
            Preferences.persisted().set("PREF_SIGNUP_NOTIF_SHOWN_TIMES", i + 1);
            Object obj = Application.context();
            AlarmManager alarmmanager = (AlarmManager)((Context) (obj)).getSystemService("alarm");
            obj = PendingIntent.getBroadcast(((Context) (obj)), 0, new Intent(((Context) (obj)), com/pinterest/receiver/SignupNotificationReceiver), 0);
            alarmmanager.set(2, SystemClock.elapsedRealtime() + l, ((PendingIntent) (obj)));
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        PLog.info("SignupNotificationReceiver.onReceive", new Object[0]);
        NotificationUtils.showSignupNotification();
    }
}
