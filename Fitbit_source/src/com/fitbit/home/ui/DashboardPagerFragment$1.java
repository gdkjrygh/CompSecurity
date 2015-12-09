// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Intent;
import android.os.Bundle;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardPagerFragment

class a extends c
{

    final DashboardPagerFragment a;

    protected void a(Intent intent)
    {
        Object obj = intent.getExtras().getString("EXTRA_FW_UPDATE_STATUS");
        intent = intent.getExtras().getString("EXTRA_FW_UPDATE_DEVICE");
        obj = com.fitbit.serverinteraction.eStatus.a(((String) (obj)));
        if (com.fitbit.serverinteraction.eStatus.a == obj)
        {
            DashboardPagerFragment.a(a, intent);
        } else
        if (com.fitbit.serverinteraction.eStatus.c == obj)
        {
            a.a(intent);
            return;
        }
    }

    mwareUpdateStatus(DashboardPagerFragment dashboardpagerfragment)
    {
        a = dashboardpagerfragment;
        super();
    }
}
