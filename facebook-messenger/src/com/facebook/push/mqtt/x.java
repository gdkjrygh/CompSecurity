// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.push.mqtt:
//            v

class x
    implements Runnable
{

    final v a;

    x(v v1)
    {
        a = v1;
        super();
    }

    public void run()
    {
        b.b(v.i(), "kick runnable");
        v.a(a);
    }
}
