// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.facebook.base.a.g;
import com.facebook.common.hardware.o;
import com.facebook.inject.t;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.push.mqtt:
//            ch, av

public class MqttReceiver extends IntentService
{

    private Set a;
    private ch b;

    public MqttReceiver()
    {
        super("MqttReceiver");
    }

    static void a(Context context, Intent intent)
    {
        ((ch)t.a(context).a(com/facebook/push/mqtt/ch)).a.a();
        intent.setClassName(context, com/facebook/push/mqtt/MqttReceiver.getName());
        context.startService(intent);
    }

    public void onCreate()
    {
        super.onCreate();
        g.a(this);
        t t1 = t.a(this);
        b = (ch)t1.a(com/facebook/push/mqtt/ch);
        a = t1.c(com/facebook/push/mqtt/av);
    }

    public final void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if ("com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED".equals(intent.getAction()))
        {
            String s = intent.getStringExtra("topic_name");
            intent = intent.getByteArrayExtra("payload");
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((av)iterator.next()).a(s, intent)) { }
        }
        break MISSING_BLOCK_LABEL_81;
        intent;
        b.a.b();
        throw intent;
        b.a.b();
        return;
    }
}
