// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.base.broadcast:
//            q

class r extends BroadcastReceiver
{

    final q a;

    r(q q1)
    {
        a = q1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!q.a(a))
        {
            b.e(q.c(), "Called onReceive after it was unregistered.");
            return;
        } else
        {
            a.a(context, intent);
            return;
        }
    }
}
