// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.MyUser;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.receiver:
//            SignupNotificationReceiver, GlobalDataUpdateReceiver

public class DeviceStartReceiver extends BroadcastReceiver
{

    public DeviceStartReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        PLog.info("DeviceStartReceiver.onReceive", new Object[0]);
        Pinalytics.a(EventType.DEVICE_START, null, Pinalytics.b());
        if (!MyUser.hasAccessTokenAndUser())
        {
            SignupNotificationReceiver.a(0x493e0L);
        }
        GlobalDataUpdateReceiver.a();
    }
}
