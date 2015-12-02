// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.b;

import com.facebook.config.a.d;
import com.facebook.mqtt.messages.SubscribeTopic;
import com.facebook.push.mqtt.ar;
import com.facebook.push.mqtt.m;
import com.google.common.a.ev;
import com.google.common.a.ew;
import javax.inject.a;

class h
    implements m
{

    private final com.facebook.config.a.a a;
    private final a b;
    private final a c;
    private final a d;

    h(com.facebook.config.a.a a1, a a2, a a3, a a4)
    {
        a = a1;
        b = a2;
        c = a3;
        d = a4;
    }

    public ev a()
    {
        ew ew1 = ev.k();
        ew1.b(new SubscribeTopic("/orca_message_notifications", 0), ar.ALWAYS);
        if (((Boolean)c.b()).booleanValue())
        {
            ew1.b(new SubscribeTopic("/orca_typing_notifications", 0), ar.APP_USE);
            ew1.b(new SubscribeTopic("/orca_presence", 0), ar.APP_USE);
        }
        if (a.i() == d.MESSENGER && ((Boolean)b.b()).booleanValue())
        {
            ew1.b(new SubscribeTopic("/inbox", 0), ar.ALWAYS);
        }
        ew1.b(new SubscribeTopic("/messaging_events", 0), ar.DEVICE_USE);
        ew1.b(new SubscribeTopic("/push_notification", 0), ar.ALWAYS);
        ew1.b(new SubscribeTopic("/webrtc", 0), ar.ALWAYS);
        ew1.b(new SubscribeTopic("/webrtc_response", 0), ar.ALWAYS);
        ew1.b(new SubscribeTopic("/mercury", 0), ar.DEVICE_USE);
        return ew1.b();
    }
}
