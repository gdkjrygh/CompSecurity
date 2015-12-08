// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.c;
import java.util.TimeZone;

// Referenced classes of package com.fitbit.a:
//            d

class roadcastReceiver extends BroadcastReceiver
{

    final d a;

    public void onReceive(Context context, Intent intent)
    {
        com.fitbit.e.a.a("SystemEventsController", "Locale changed broadcast %s", new Object[] {
            TimeZone.getDefault()
        });
        c.c(context);
    }

    ntent(d d1)
    {
        a = d1;
        super();
    }
}
