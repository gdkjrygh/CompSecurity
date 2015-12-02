// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.a.e;
import com.facebook.base.c;

// Referenced classes of package com.facebook.push.mqtt:
//            MqttReceiver

public class s extends BroadcastReceiver
    implements c
{

    private final Context a;

    public s(Context context)
    {
        a = context;
    }

    public void a()
    {
        IntentFilter intentfilter = new IntentFilter("com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED");
        e.a(a).a(this, intentfilter);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED"))
        {
            MqttReceiver.a(context, intent);
        }
    }
}
