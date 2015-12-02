// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.base.broadcast:
//            p

public abstract class o
{

    private static final Class a = com/facebook/base/broadcast/o;
    private final Context b;
    private final IntentFilter c;
    private final BroadcastReceiver d = new p(this);
    private boolean e;

    public o(Context context, IntentFilter intentfilter)
    {
        b = context;
        c = intentfilter;
    }

    static boolean a(o o1)
    {
        return o1.e;
    }

    static Class b()
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
            b.registerReceiver(d, c);
            e = true;
            return;
        }
    }

    public abstract void a(Context context, Intent intent);

}
