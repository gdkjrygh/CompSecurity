// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;

import java.util.List;

// Referenced classes of package com.facebook.mqtt:
//            b

class e
    implements Runnable
{

    final List a;
    final int b;
    final b c;

    e(b b1, List list, int i)
    {
        c = b1;
        a = list;
        b = i;
        super();
    }

    public void run()
    {
        com.facebook.mqtt.b.b(c, a, b);
    }
}
