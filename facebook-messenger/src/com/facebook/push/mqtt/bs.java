// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


// Referenced classes of package com.facebook.push.mqtt:
//            MqttPushService

class bs
    implements Runnable
{

    final MqttPushService a;

    bs(MqttPushService mqttpushservice)
    {
        a = mqttpushservice;
        super();
    }

    public void run()
    {
        MqttPushService.a(a);
    }
}
