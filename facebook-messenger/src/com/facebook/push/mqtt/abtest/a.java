// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt.abtest;

import com.facebook.abtest.qe.d.e;
import com.facebook.mqtt.messages.k;
import com.google.common.a.ev;
import com.google.common.a.ew;

// Referenced classes of package com.facebook.push.mqtt.abtest:
//            e, c

public class a
{

    static final int a;
    public static final com.facebook.push.mqtt.abtest.e b;
    static final ev c;
    private final com.facebook.abtest.qe.d.a d;

    public a(e e1)
    {
        d = e1.a("android_mqtt_push_service_parameters", new c(null));
    }

    public com.facebook.push.mqtt.abtest.e a()
    {
        return (com.facebook.push.mqtt.abtest.e)d.a();
    }

    static 
    {
        a = 1 << k.PINGRESP.toInt() | 1 << k.PUBACK.toInt();
        b = new com.facebook.push.mqtt.abtest.e(30, 30, 120, 15, 3, 0, 2, 900, 60, 900, 300, a);
        c = ev.k().b("dns_timeout_sec", Integer.valueOf(30)).b("tcp_connect_timeout_sec", Integer.valueOf(30)).b("mqtt_connect_timeout_sec", Integer.valueOf(120)).b("mqtt_response_timeout_sec", Integer.valueOf(15)).b("back_to_back_retry_attempts", Integer.valueOf(3)).b("back_to_back_retry_interval_sec", Integer.valueOf(0)).b("back_off_initial_retry_interval_sec", Integer.valueOf(2)).b("back_off_max_retry_interval_sec", Integer.valueOf(900)).b("foreground_keepalive_interval_sec", Integer.valueOf(60)).b("background_keepalive_interval_persistent_sec", Integer.valueOf(900)).b("background_keepalive_interval_transient_sec", Integer.valueOf(300)).b("mqtt_reconnect_for_operations", Integer.valueOf(a)).b();
    }
}
