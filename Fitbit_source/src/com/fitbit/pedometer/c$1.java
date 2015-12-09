// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.pedometer:
//            c

class Receiver extends BroadcastReceiver
{

    final c a;

    public void onReceive(Context context, Intent intent)
    {
        if (com.fitbit.pedometer.c.a(a))
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "onReceive", new Object[0]);
            context = intent.getAction();
            if (context != null && context.equalsIgnoreCase("com.fitbit.FitbitMobile.HtcAdapterNotificationsReceiver.HTC_ADAPTER_COMPATIBILITY_STATUS_ACTION"))
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityController", "HTC_ADAPTER_COMPATIBILITY_STATUS_ACTION", new Object[0]);
                context = intent.getExtras().getString("com.fitbit.FitbitMobile.HtcAdapterNotificationsReceiver.HTC_ADAPTER_COMPATIBILITY_STATUS_KEY");
                if (context != null && (c.i() == null || !context.equals(c.i())))
                {
                    com.fitbit.e.a.a("HtcPedometerCompatibilityController", "newStatus", new Object[0]);
                    com.fitbit.pedometer.c.a(intent.getExtras().getString("com.fitbit.FitbitMobile.HtcAdapterNotificationsReceiver.HTC_ADAPTER_COMPATIBILITY_STATUS_KEY"));
                }
                c.b(a);
            }
        }
    }

    Receiver(c c1)
    {
        a = c1;
        super();
    }
}
