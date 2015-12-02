// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.os.RemoteException;
import com.facebook.common.w.n;
import com.facebook.mqtt.x;
import java.util.List;

// Referenced classes of package com.facebook.push.mqtt:
//            k, MqttPushService, v, bu, 
//            bq

class bv extends k
{

    final MqttPushService a;

    private bv(MqttPushService mqttpushservice)
    {
        a = mqttpushservice;
        super();
    }

    bv(MqttPushService mqttpushservice, bq bq)
    {
        this(mqttpushservice);
    }

    public int a(String s, String s1, int i)
    {
        s1 = n.c(s1);
        x x1 = x.fromInt(i);
        return MqttPushService.b(a).a(s, s1, x1);
    }

    public void a(List list)
    {
        MqttPushService.b(a).a(list);
    }

    public boolean a()
    {
        return MqttPushService.b(a).d();
    }

    public boolean a(long l)
    {
        return MqttPushService.b(a).a(l);
    }

    public boolean a(String s, String s1, long l)
    {
        s1 = n.c(s1);
        boolean flag;
        try
        {
            flag = MqttPushService.b(a).a(s, s1, l);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RemoteException();
        }
        return flag;
    }

    public void b(List list)
    {
        MqttPushService.b(a).b(list);
    }

    public boolean b()
    {
        return MqttPushService.b(a).e();
    }

    public String c()
    {
        return MqttPushService.c(a).toString();
    }
}
