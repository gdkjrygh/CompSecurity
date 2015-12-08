// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment, DeviceView

class > extends BroadcastReceiver
{

    final DashboardFragment a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("unpair_device_action"))
        {
            DashboardFragment.a(a).b();
            DashboardFragment.a(a, false, true);
        }
    }

    (DashboardFragment dashboardfragment)
    {
        a = dashboardfragment;
        super();
    }
}
