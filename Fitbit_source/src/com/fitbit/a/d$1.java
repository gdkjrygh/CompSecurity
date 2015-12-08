// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fitbit.pedometer.service.a;
import com.fitbit.pedometer.service.b;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.a:
//            d

class roadcastReceiver extends BroadcastReceiver
{

    final d a;

    public void onReceive(Context context, Intent intent)
    {
        b.a();
        com.fitbit.widget.b.b(context);
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction()))
        {
            com.fitbit.widget.b.a(context);
            if (p.l())
            {
                com.fitbit.pedometer.service.a.a(false);
            }
        }
    }

    ntent(d d1)
    {
        a = d1;
        super();
    }
}
