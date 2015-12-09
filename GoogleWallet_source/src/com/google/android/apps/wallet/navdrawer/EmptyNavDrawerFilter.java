// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.google.android.apps.wallet.filter.ActivityFilter;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

public class EmptyNavDrawerFilter extends ActivityFilter
{

    private final FragmentActivity activity;
    private final NavDrawerFragment navDrawerFragment;

    EmptyNavDrawerFilter(FragmentActivity fragmentactivity, NavDrawerFragment navdrawerfragment)
    {
        activity = fragmentactivity;
        navDrawerFragment = navdrawerfragment;
    }

    protected final void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        navDrawerFragment.startInAccountsNavigationMode();
        FragmentManager fragmentmanager = activity.getSupportFragmentManager();
        FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
        if (bundle == null)
        {
            fragmenttransaction.add(com.google.android.apps.walletnfcrel.R.id.RootDrawerLayout, navDrawerFragment);
        } else
        {
            fragmenttransaction.replace(com.google.android.apps.walletnfcrel.R.id.RootDrawerLayout, navDrawerFragment);
        }
        fragmenttransaction.commit();
        fragmentmanager.executePendingTransactions();
    }
}
