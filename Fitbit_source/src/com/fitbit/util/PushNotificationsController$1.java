// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.fitbit.FitbitMobile.GCMNotification;

// Referenced classes of package com.fitbit.util:
//            PushNotificationsController

class a extends BroadcastReceiver
{

    final PushNotificationsController a;

    public void onReceive(Context context, Intent intent)
    {
        if (PushNotificationsController.a(a))
        {
            ((ResultReceiver)intent.getParcelableExtra("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.RESULT_RECEIVER")).send(0, new Bundle());
            a.a((GCMNotification)intent.getParcelableExtra("com.fitbit.FitbitMobile.GCMIntentService.GCM_NOTIFICATION_KEY"));
        }
    }

    (PushNotificationsController pushnotificationscontroller)
    {
        a = pushnotificationscontroller;
        super();
    }
}
