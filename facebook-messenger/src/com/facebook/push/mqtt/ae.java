// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


// Referenced classes of package com.facebook.push.mqtt:
//            aa, v, MqttPushService

class ae
    implements Runnable
{

    final int a;
    final aa b;

    ae(aa aa1, int i)
    {
        b = aa1;
        a = i;
        super();
    }

    public void run()
    {
        if (v.b(b.a) == aa.a(b))
        {
            v.f(b.a).b(a);
        }
    }
}
