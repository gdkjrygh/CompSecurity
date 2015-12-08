// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.kohls.mcommerce.opal.wallet.notification.ReminderService;

public class LocalNotification
{

    public static String TAG = com/kohls/mcommerce/opal/wallet/util/LocalNotification.getSimpleName();

    public LocalNotification()
    {
    }

    public void cancelLocalNotification(Context context, String s)
    {
        Intent intent = new Intent(context, com/kohls/mcommerce/opal/wallet/notification/ReminderService);
        s = PendingIntent.getService(context, s.hashCode(), intent, 0);
        ((AlarmManager)context.getSystemService("alarm")).cancel(s);
        s.cancel();
    }

    public void createLocalNotification(Context context, String s, long l, String s1)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        Intent intent = new Intent(context, com/kohls/mcommerce/opal/wallet/notification/ReminderService);
        intent.putExtra("upcoming", s1);
        alarmmanager.set(0, l, PendingIntent.getService(context, s.hashCode(), intent, 0));
    }

}
