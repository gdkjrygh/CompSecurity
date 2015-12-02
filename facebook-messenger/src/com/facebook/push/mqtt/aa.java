// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.os.Handler;
import com.facebook.debug.log.b;
import com.facebook.mqtt.a;
import com.facebook.mqtt.messages.k;
import com.facebook.mqtt.messages.l;
import com.facebook.mqtt.o;

// Referenced classes of package com.facebook.push.mqtt:
//            v, ab, ac, af, 
//            ad, MqttPushService, ae

class aa
    implements o
{

    final v a;
    private final com.facebook.mqtt.b b;

    public aa(v v1, com.facebook.mqtt.b b1)
    {
        a = v1;
        super();
        b = b1;
    }

    static com.facebook.mqtt.b a(aa aa1)
    {
        return aa1.b;
    }

    public void a()
    {
        com.facebook.debug.log.b.a(v.i(), "connectionEstablished");
        v.e(a).post(new ab(this));
    }

    public void a(int i)
    {
    }

    public void a(a a1)
    {
        com.facebook.debug.log.b.a(v.i(), "connectionFailed");
        v.e(a).post(new ac(this));
    }

    public void a(l l1)
    {
        com.facebook.debug.log.b.a(v.i(), "messageReceived %d", new Object[] {
            Integer.valueOf(l1.e().toInt())
        });
        v.e(a).post(new af(this, l1));
    }

    public void a(String s)
    {
        com.facebook.debug.log.b.a(v.i(), "connectionLost");
        v.e(a).post(new ad(this, s));
    }

    public void a(String s, byte abyte0[], int i, boolean flag)
    {
        v.f(a).a(s, abyte0);
    }

    public void b(int i)
    {
        v.e(a).post(new ae(this, i));
    }
}
