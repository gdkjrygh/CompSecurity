// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import com.fitbit.data.bl.dg;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.home.ui:
//            HomeNavigationDrawerActivity

class a
    implements Runnable
{

    final HomeNavigationDrawerActivity a;

    public void run()
    {
        try
        {
            com.fitbit.e.a.a("HomeNavigationDrawerActivity", "Start data load", new Object[0]);
            dg.d().j(false, null);
            com.fitbit.e.a.a("HomeNavigationDrawerActivity", "Completed data load", new Object[0]);
            return;
        }
        catch (Exception exception)
        {
            com.fitbit.e.a.f("HomeNavigationDrawerActivity", "Unable to load data", exception, new Object[0]);
        }
    }

    (HomeNavigationDrawerActivity homenavigationdraweractivity)
    {
        a = homenavigationdraweractivity;
        super();
    }
}
