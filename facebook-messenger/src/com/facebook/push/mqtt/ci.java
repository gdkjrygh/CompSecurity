// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import android.content.Intent;
import android.support.v4.a.e;
import com.facebook.c.j;

// Referenced classes of package com.facebook.push.mqtt:
//            cj

public class ci
{

    private final Context a;
    private final j b;

    public ci(Context context, j j1)
    {
        a = context;
        b = j1;
    }

    private void a(Intent intent)
    {
        e.a(a).a(intent);
        b.a(intent, a);
    }

    void a(cj cj1)
    {
        Intent intent = new Intent("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
        intent.putExtra("event", cj1.toValue());
        a(intent);
    }

    public void a(String s, byte abyte0[])
    {
        Intent intent = new Intent("com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED");
        intent.putExtra("topic_name", s);
        intent.putExtra("payload", abyte0);
        a(intent);
    }
}
