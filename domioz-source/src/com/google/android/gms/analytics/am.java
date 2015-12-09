// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.analytics:
//            m

class am extends BroadcastReceiver
{

    static final String a = com/google/android/gms/analytics/am.getName();
    private final m b;

    am(m m1)
    {
        b = m1;
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        context = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag1 = intent.getBooleanExtra("noConnectivity", false);
            context = b;
            if (!flag1)
            {
                flag = true;
            }
            context.a(flag);
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context) && !intent.hasExtra(a))
        {
            b.b();
            return;
        }
    }

}
