// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;


// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment

class a
    implements Runnable
{

    final DashboardFragment a;

    public void run()
    {
        if (a.getActivity() != null)
        {
            DashboardFragment.a(a, false, false);
            DashboardFragment.c(a);
        }
    }

    (DashboardFragment dashboardfragment)
    {
        a = dashboardfragment;
        super();
    }
}
