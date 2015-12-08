// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Intent;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment, DeviceView

class a extends c
{

    final DashboardFragment a;

    protected void a(Intent intent)
    {
        if (a.isResumed() && DashboardFragment.a(a) != null)
        {
            DashboardFragment.a(a).n();
        }
    }

    (DashboardFragment dashboardfragment)
    {
        a = dashboardfragment;
        super();
    }
}
