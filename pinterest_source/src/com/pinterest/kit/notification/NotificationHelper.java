// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.PinterestActivity;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.base.Application;
import com.pinterest.kit.application.PApplication;

public class NotificationHelper
{

    public static final int ID = 0;
    public static final int OTA_ID = 1;

    public NotificationHelper()
    {
    }

    public static void cancelAll()
    {
        ((NotificationManager)Application.context().getSystemService("notification")).cancelAll();
    }

    public static void cancelNotifPinUpload()
    {
        cancelNotification(0);
    }

    public static void cancelNotification(int i)
    {
        ((NotificationManager)Application.context().getSystemService("notification")).cancel(i);
    }

    public static Notification getNotification(String s, String s1)
    {
        return getNotification(s, s1, System.currentTimeMillis());
    }

    public static Notification getNotification(String s, String s1, long l)
    {
        return getNotification(s, s1, l, new Intent(PApplication.context(), com/pinterest/activity/PinterestActivity));
    }

    public static Notification getNotification(String s, String s1, long l, Intent intent)
    {
        android.app.Application application = PApplication.context();
        intent = PendingIntent.getActivity(application, 0, intent, 0x8000000);
        s = (new android.app.Notification.Builder(application)).setSmallIcon(0x7f0201f7).setTicker(s1).setWhen(l).setContentTitle(s).setContentText(s1).setContentIntent(intent).getNotification();
        s.flags = ((Notification) (s)).flags | 0x10;
        return s;
    }

    public static PendingIntent getPendingPin(Pin pin)
    {
        cancelAll();
        pin = new Navigation(Location.PIN, pin);
        pin = ActivityHelper.getTaskIntent(Application.context(), pin);
        return PendingIntent.getActivity(Application.context(), 0, pin, 0x10000000);
    }

    public static PendingIntent getPendingToast(String s)
    {
        cancelAll();
        Intent intent = new Intent(Application.context(), com/pinterest/kit/notification/NotificationHelper$ToastFeedbackActivity);
        intent.putExtra("com.pinterest.EXTRA_MESSAGE", s);
        intent.addFlags(0x10000000);
        return PendingIntent.getActivity(Application.context(), 0, intent, 0x10000000);
    }

    public static PendingIntent getPendingUser(User user)
    {
        cancelAll();
        user = new Navigation(Location.USER, user);
        user = ActivityHelper.getTaskIntent(Application.context(), user);
        return PendingIntent.getActivity(Application.context(), 0, user, 0x10000000);
    }
}
