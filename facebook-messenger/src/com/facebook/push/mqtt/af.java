// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.mqtt.messages.l;

// Referenced classes of package com.facebook.push.mqtt:
//            aa, v

class af
    implements Runnable
{

    final l a;
    final aa b;

    af(aa aa1, l l)
    {
        b = aa1;
        a = l;
        super();
    }

    public void run()
    {
        if (v.b(b.a) == aa.a(b))
        {
            v.a(b.a, a);
        }
    }
}
