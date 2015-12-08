// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.view.View;
import com.fitbit.ui.DayPagerFragment;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment

class a
    implements android.view.
{

    final DashboardFragment a;

    public void onClick(View view)
    {
        ((DayPagerFragment)a.getParentFragment()).h();
    }

    (DashboardFragment dashboardfragment)
    {
        a = dashboardfragment;
        super();
    }
}
