// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.notification;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;

public class ReminderService extends IntentService
{

    private static final int NOTIF_ID = 1;

    public ReminderService()
    {
        super("ReminderService");
    }

    protected void onHandleIntent(Intent intent)
    {
        NotificationManager notificationmanager = (NotificationManager)getSystemService("notification");
        Notification notification = new Notification(0x7f020111, "Kohl's", System.currentTimeMillis());
        notification.defaults = notification.defaults | 1;
        notification.flags = notification.flags | 0x10;
        Appconfig.isSignInShown = false;
        PendingIntent pendingintent = PendingIntent.getActivity(this, 0, new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity), 0);
        String s = "Your Kohl's Cash will expire soon.";
        Bundle bundle = intent.getExtras();
        intent = s;
        if (bundle != null)
        {
            intent = s;
            if (bundle.getString("upcoming") != null)
            {
                intent = s;
                if (bundle.getString("upcoming").equalsIgnoreCase("REDEEMED"))
                {
                    intent = "You have Kohl's Cash available soon.";
                }
            }
        }
        notification.setLatestEventInfo(getApplicationContext(), "Kohl's", intent, pendingintent);
        notificationmanager.notify(1, notification);
    }
}
