// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.ui.drawer.a;

// Referenced classes of package com.fitbit.home.ui:
//            HomeNavigationDrawerActivity, HomeNavigationItem

class b
    implements Runnable
{

    final Fragment a;
    final HomeNavigationItem b;
    final HomeNavigationDrawerActivity c;

    public void run()
    {
        FragmentTransaction fragmenttransaction = c.getSupportFragmentManager().beginTransaction();
        fragmenttransaction.hide(HomeNavigationDrawerActivity.c(c));
        HomeNavigationDrawerActivity.c(c).setUserVisibleHint(false);
        if (c.i != null && c.i != HomeNavigationDrawerActivity.k())
        {
            Fragment fragment = c.getSupportFragmentManager().findFragmentByTag(c.i.name());
            if (fragment != null)
            {
                fragmenttransaction.remove(fragment);
                fragment.setUserVisibleHint(false);
            }
        }
        fragmenttransaction.add(0x7f11017f, a, b.name());
        fragmenttransaction.setTransition(4097);
        fragmenttransaction.commitAllowingStateLoss();
        c.getSupportFragmentManager().executePendingTransactions();
        a.setUserVisibleHint(true);
        c.i = b;
        HomeNavigationDrawerActivity.d(c);
        HomeNavigationDrawerActivity.e(c).a(c.h());
    }

    (HomeNavigationDrawerActivity homenavigationdraweractivity, Fragment fragment, HomeNavigationItem homenavigationitem)
    {
        c = homenavigationdraweractivity;
        a = fragment;
        b = homenavigationitem;
        super();
    }
}
