// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.auth.credentials.UserTokenCredentials;
import com.facebook.device_id.l;
import com.facebook.mqtt.b;
import com.facebook.mqtt.p;
import com.facebook.mqtt.t;
import com.facebook.mqtt.w;
import com.facebook.push.mqtt.abtest.e;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import javax.inject.a;

public class u
{

    private final p a;
    private final a b;
    private final a c;
    private final l d;
    private final com.facebook.common.v.a e;
    private final a f;
    private final a g;
    private final com.facebook.push.mqtt.abtest.a h;

    public u(p p1, a a1, a a2, l l1, com.facebook.common.v.a a3, a a4, a a5, 
            com.facebook.push.mqtt.abtest.a a6)
    {
        a = p1;
        b = a1;
        c = a2;
        d = l1;
        e = a3;
        f = a4;
        g = a5;
        h = a6;
    }

    public b a(int i)
    {
        Object obj = (t)b.b();
        if (obj == null)
        {
            return null;
        }
        UserTokenCredentials usertokencredentials = (UserTokenCredentials)c.b();
        if (usertokencredentials == null)
        {
            return null;
        }
        String s = d.c();
        if (s == null)
        {
            return null;
        } else
        {
            boolean flag = e.b(10000L);
            boolean flag1 = ((Boolean)f.b()).booleanValue();
            ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("make_user_available_when_in_foreground", flag1);
            objectnode.put("no_automatic_foreground", true);
            objectnode.put("device_id", d.b());
            objectnode.put("initial_foreground_state", flag);
            e e1 = h.a();
            obj = new w(((t) (obj)), s, usertokencredentials.a(), usertokencredentials.b(), (String)g.b(), i, e1.c(), e1.b(), e1.a(), objectnode);
            return a.a(((w) (obj)));
        }
    }
}
