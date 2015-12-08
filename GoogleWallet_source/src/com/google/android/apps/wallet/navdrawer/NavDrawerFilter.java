// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.collect.Lists;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerEvent, NavDrawerFragment

public class NavDrawerFilter extends ActivityFilter
{

    private static final String TAG = com/google/android/apps/wallet/navdrawer/NavDrawerFilter.getSimpleName();
    private DrawerLayout drawerLayout;
    private final EventBus eventBus;
    private final NavDrawerFragment navDrawerFragment;
    private final WalletActivity walletActivity;

    NavDrawerFilter(Activity activity, EventBus eventbus, NavDrawerFragment navdrawerfragment)
    {
        navDrawerFragment = navdrawerfragment;
        walletActivity = (WalletActivity)activity;
        eventBus = eventbus;
    }

    public void onNavDrawerEvent(NavDrawerEvent navdrawerevent)
    {
        com.google.wallet.proto.api.NanoWalletNavigation.TopNavigation topnavigation = navdrawerevent.getTopNavigation();
        if (topnavigation == null)
        {
            WLog.dfmt(TAG, "NavDrawerEvent.topNavigation is null", new Object[0]);
            return;
        }
        int j = 0;
        navdrawerevent = Lists.newArrayList();
        com.google.wallet.proto.api.NanoWalletNavigation.NavigationGroup anavigationgroup[] = topnavigation.navigationGroup;
        int l = anavigationgroup.length;
        for (int i = 0; i < l;)
        {
            com.google.wallet.proto.api.NanoWalletNavigation.NavigationGroup navigationgroup = anavigationgroup[i];
            int k = j + 1;
            boolean flag = true;
            com.google.wallet.proto.api.NanoWalletNavigation.NavigationNode anavigationnode[] = navigationgroup.navigationNode;
            int i1 = anavigationnode.length;
            j = 0;
            while (j < i1) 
            {
                com.google.wallet.proto.api.NanoWalletNavigation.NavigationNode navigationnode = anavigationnode[j];
                boolean flag1;
                if (k > 1 && flag)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                navdrawerevent.add(new NavDrawerFragment.NavDrawerRow(navigationnode, flag1));
                flag = false;
                j++;
            }
            i++;
            j = k;
        }

        navDrawerFragment.setRows(navdrawerevent);
    }

    protected final boolean onOptionsMenuSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c && walletActivity.hasDrawerIndicator())
        {
            if (drawerLayout.isDrawerOpen(3))
            {
                drawerLayout.closeDrawer(3);
            } else
            {
                drawerLayout.openDrawer(3);
            }
            return true;
        } else
        {
            return super.onOptionsMenuSelected(menuitem);
        }
    }

    public final void onPause()
    {
        eventBus.unregisterAll(this);
    }

    protected final void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        FragmentManager fragmentmanager = walletActivity.getSupportFragmentManager();
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

    protected final boolean onPrepareOptionsMenu(Menu menu)
    {
        int i = 0;
        while (i < menu.size()) 
        {
            MenuItem menuitem = menu.getItem(i);
            if (menuitem.getGroupId() != 12347)
            {
                boolean flag;
                boolean flag1;
                if (drawerLayout != null && drawerLayout.isDrawerOpen(3))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                menuitem.setVisible(flag1);
            }
            i++;
        }
        return false;
    }

    protected final void onResume()
    {
        drawerLayout = (DrawerLayout)walletActivity.findViewById(com.google.android.apps.walletnfcrel.R.id.RootDrawerLayout);
        eventBus.register(this);
    }

}
