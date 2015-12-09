// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.receiver;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerResult;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.notification.NotificationUI;
import com.dominos.wear.manager.WearManager;
import com.dominos.wear.manager.WearManager_;
import com.google.a.b.ar;

// Referenced classes of package com.dominos.remote.receiver:
//            TrackerReceiver

public class NotificationReceiver extends TrackerReceiver
{

    public static final int NOTIFICATION_ID = 0x4a6f43d2;
    private static final String TAG = com/dominos/remote/receiver/NotificationReceiver.getSimpleName();

    public NotificationReceiver()
    {
    }

    private void sendDeviceNotification(Context context, Intent intent)
    {
        if (intent.getAction().equalsIgnoreCase("com.dominos.notifications.tracker") && intent.getExtras() != null)
        {
            String s = intent.getStringExtra("tracker-status");
            Object obj = intent.getExtras();
            NotificationUI notificationui = new NotificationUI(context, ((Bundle) (obj)).getString("phone"), ((Bundle) (obj)).getString("extension"), ((Bundle) (obj)).getString("orderID"));
            obj = (NotificationManager)context.getSystemService("notification");
            context = (StoreProfile)intent.getParcelableExtra("storeProfile");
            if (StringHelper.equalsIgnoreCase(s, "tracking-started"))
            {
                context = notificationui.getStartNotification(context);
            } else
            if (StringHelper.equalsIgnoreCase(s, "tracking-progress"))
            {
                int i = intent.getIntExtra("tracker-index", 0);
                context = notificationui.processOrderMessage((TrackerOrderStatus)((TrackerResult)intent.getParcelableExtra("tracker-result")).getOrderStatuses().get(i), context);
            } else
            if (StringHelper.equalsIgnoreCase(s, "tracking-completed"))
            {
                ((NotificationManager) (obj)).cancelAll();
                context = null;
            } else
            if (StringHelper.equalsIgnoreCase(s, "tracking-timedout"))
            {
                context = notificationui.processOrderMessage(null, null);
            } else
            {
                context = null;
            }
            if (context != null)
            {
                LogUtil.d(TAG, "displayNotification", new Object[0]);
                ((NotificationManager) (obj)).notify(0x4a6f43d2, context);
            }
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null || intent.getAction() == null)
        {
            return;
        } else
        {
            sendDeviceNotification(context, intent);
            WearManager_.getInstance_(context).sendTrackerStatusToWear(context, intent);
            return;
        }
    }

}
