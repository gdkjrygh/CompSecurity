// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;


// Referenced classes of package com.facebook.mqtt:
//            b

class i
    implements Runnable
{

    final int a;
    final b b;

    i(b b1, int j)
    {
        b = b1;
        a = j;
        super();
    }

    public void run()
    {
        com.facebook.mqtt.b.a(b, a);
    }
}
