// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.a.e;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.base.broadcast:
//            r

public abstract class q
{

    private static final Class a = com/facebook/base/broadcast/q;
    private final e b;
    private final IntentFilter c;
    private final BroadcastReceiver d = new r(this);
    private boolean e;

    public q(Context context, IntentFilter intentfilter)
    {
        b = android.support.v4.a.e.a(context);
        c = intentfilter;
    }

    static boolean a(q q1)
    {
        return q1.e;
    }

    static Class c()
    {
        return a;
    }

    public void a()
    {
        if (e)
        {
            com.facebook.debug.log.b.e(a, "Called registerNotificationReceiver twice.");
            return;
        } else
        {
            b.a(d, c);
            e = true;
            return;
        }
    }

    public abstract void a(Context context, Intent intent);

    public void b()
    {
        if (e)
        {
            b.a(d);
            e = false;
        }
    }

}
