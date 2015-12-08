// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.util;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.bi;
import com.dominos.beacon.model.Beacon;
import com.dominos.beacon.model.CarryoutOrder;
import com.dominos.beacon.receiver.BeaconDismissReceiver_;
import com.dominos.beacon.receiver.BeaconReceiver_;
import com.dominos.utils.AnalyticsUtil;

public class BeaconNotificationUI
{

    private static final int NOTIFICATION_ID = 10130;
    AnalyticsUtil mAnalyticsUtil;
    NotificationManager mNotificationManager;

    public BeaconNotificationUI()
    {
    }

    private Notification createNotification(Context context, CarryoutOrder carryoutorder, Beacon beacon, String s, String s1, boolean flag)
    {
        Intent intent = new Intent(context, com/dominos/beacon/receiver/BeaconReceiver_);
        intent.putExtra("beacon.order", carryoutorder);
        intent.putExtra("beacon.profile.user", flag);
        intent.putExtra("beacon.device", beacon);
        intent.setAction("beacon.intent.action.CHECK_IN");
        carryoutorder = PendingIntent.getBroadcast(context, 0, intent, 0x8000000);
        beacon = new Intent(context, com/dominos/beacon/receiver/BeaconDismissReceiver_);
        beacon.setAction("com.dominos.intent.action.NOTIFICATION_DISMISSED");
        beacon = PendingIntent.getBroadcast(context, 0, beacon, 0x10000000);
        return (new bi(context)).a(0x7f020113).a(s).b(s1).b(beacon).a(carryoutorder).b(-1).b();
    }

    private void sendAnalytics(Context context)
    {
        if (((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
        {
            mAnalyticsUtil.postOnEventLockedScreen();
            return;
        } else
        {
            mAnalyticsUtil.postOnEventUnlockedScreen();
            return;
        }
    }

    private void sendNotification(Context context, Notification notification)
    {
        sendAnalytics(context);
        mNotificationManager.notify(10130, notification);
    }

    public void cancel()
    {
        mNotificationManager.cancel(10130);
    }

    public void showConfirmationNotification(Context context, CarryoutOrder carryoutorder, String s, Beacon beacon)
    {
        sendNotification(context, createNotification(context, carryoutorder, beacon, context.getString(0x7f080364, new Object[] {
            s
        }), context.getString(0x7f080366), true));
    }

    public void showWelcomeNotification(Context context, CarryoutOrder carryoutorder, Beacon beacon)
    {
        sendNotification(context, createNotification(context, carryoutorder, beacon, context.getString(0x7f080367), context.getString(0x7f080365), false));
    }
}
