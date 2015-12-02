// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.b;
import com.facebook.c.c;

// Referenced classes of package com.facebook.push.mqtt:
//            o, p

class q
    implements b
{

    final o a;

    private q(o o1)
    {
        a = o1;
        super();
    }

    q(o o1, p p)
    {
        this(o1);
    }

    public void a(Context context, Intent intent, c c)
    {
        com.facebook.debug.log.b.b(o.a(), "Checking cycle due to alarm wake-up %s.", new Object[] {
            intent.getAction()
        });
        o.a(a);
    }
}
