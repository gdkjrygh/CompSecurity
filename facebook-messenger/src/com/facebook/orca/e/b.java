// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.e;

import com.facebook.bugreporter.c;
import com.facebook.common.w.q;
import com.facebook.contacts.data.i;
import com.facebook.contacts.data.j;
import com.facebook.contacts.data.k;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.push.b.a;
import com.facebook.push.mqtt.v;
import com.google.common.a.ev;
import com.google.common.a.ew;

public class b
    implements c
{

    private final d a;
    private final k b;
    private final v c;

    public b(d d1, k k1, v v1)
    {
        a = d1;
        b = k1;
        c = v1;
    }

    public ev a()
    {
        return ev.k().b(a.a.toString(), a.b(a.a).name()).b("MqttConnectionManager.lastConnectionTimeStampMs", Long.toString(c.h())).b("MqttConnectionManager.lastDisconnectionTimeStampMs", Long.toString(c.g())).b();
    }

    public ev b()
    {
        return ev.k().b(i.a.toString(), b.a(i.a, "-1")).b(i.f.toString(), b.a(i.f, "-1")).b();
    }
}
