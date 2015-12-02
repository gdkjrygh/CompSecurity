// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.b;

import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.mqtt.t;
import com.facebook.orca.annotations.ForMessages;
import com.facebook.push.mqtt.MqttTopicList;
import com.facebook.push.mqtt.av;
import com.facebook.push.mqtt.ck;
import com.facebook.push.mqtt.m;

// Referenced classes of package com.facebook.orca.push.b:
//            d, a, e, f, 
//            i, g

public class b extends c
{

    public b()
    {
    }

    protected void a()
    {
        a(com/facebook/mqtt/t).a(new d(this, null));
        a(com/facebook/orca/push/b/a).a(new e(this, null)).a();
        c(com/facebook/push/mqtt/av).a(com/facebook/orca/push/b/a);
        a(com/facebook/push/mqtt/m, com/facebook/push/mqtt/MqttTopicList).a(com/facebook/push/mqtt/m, com/facebook/orca/annotations/ForMessages);
        a(com/facebook/push/mqtt/m).a(com/facebook/orca/annotations/ForMessages).a(new f(this, null)).a();
        c(com/facebook/push/mqtt/ck).a(com/facebook/orca/push/b/i);
        a(com/facebook/orca/push/b/i).a(new com.facebook.orca.push.b.g(this, null));
    }
}
