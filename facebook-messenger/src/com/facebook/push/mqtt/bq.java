// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.push.mqtt:
//            MqttPushService

class bq extends BroadcastReceiver
{

    final MqttPushService a;

    bq(MqttPushService mqttpushservice)
    {
        a = mqttpushservice;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        MqttPushService.a(a, intent);
    }
}
