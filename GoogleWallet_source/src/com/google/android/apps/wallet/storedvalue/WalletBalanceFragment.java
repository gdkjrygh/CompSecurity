// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.fragment.FragmentFactory;
import com.google.android.apps.wallet.network.NetworkConnectivityEvent;
import com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            TileFragment

public class WalletBalanceFragment extends WalletFragment
    implements TileFragment.TileChangedListener
{

    EventBus eventBus;
    FragmentFactory fragmentFactory;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    NetworkConnectivityReturnChecker networkConnectivityReturnChecker;
    private int readyToViewTilesCount;
    private int tilesCount;
    private View view;

    public WalletBalanceFragment()
    {
    }

    private void configTiles()
    {
        readyToViewTilesCount = 0;
        tilesCount = 0;
        Iterator iterator = getChildFragmentManager().getFragments().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Fragment fragment = (Fragment)iterator.next();
            if (fragment instanceof TileFragment)
            {
                ((TileFragment)fragment).setTileChangedListener(this);
                tilesCount = tilesCount + 1;
            }
        } while (true);
    }

    private void updateTilesHeaderVisibility()
    {
        boolean flag2 = false;
        Object obj = (ViewGroup)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.FragmentTileListActivityContent);
        boolean flag = true;
        int i = 0;
        while (i < ((ViewGroup) (obj)).getChildCount()) 
        {
            boolean flag1;
            if (((ViewGroup) (obj)).getChildAt(i).getVisibility() == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag &= flag1;
            i++;
        }
        obj = Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.TilesHeader);
        if (flag)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        menu.add(0, 24, 1, com.google.android.apps.walletnfcrel.R.string.refresh_label).setIcon(com.google.android.apps.walletnfcrel.R.drawable.optionsmenu_refresh);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        view = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wallet_balance_fragment, viewgroup, false);
        view.setVisibility(4);
        fullScreenProgressSpinnerManager.show();
        analyticsUtil.sendListItemTap("RefreshWallet", new AnalyticsCustomDimension[0]);
        configTiles();
        return view;
    }

    public void onNetworkConnectivityChanged(NetworkConnectivityEvent networkconnectivityevent)
    {
        if (networkConnectivityReturnChecker.isConnectivityReturned(networkconnectivityevent))
        {
            eventBus.post(new RequestRefreshEvent());
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 24: // '\030'
            eventBus.post(new RequestRefreshEvent());
            break;
        }
        return true;
    }

    public final void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    public final void onResume()
    {
        super.onResume();
        getActivity().setTitle(com.google.android.apps.walletnfcrel.R.string.label_wallet_balance);
        eventBus.register(this);
    }

    public final void onTileChanged(TileFragment tilefragment)
    {
        readyToViewTilesCount = readyToViewTilesCount + 1;
        View view1 = tilefragment.getView();
        int i;
        if (tilefragment.shouldShow())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view1.setVisibility(i);
        if (readyToViewTilesCount == tilesCount)
        {
            updateTilesHeaderVisibility();
            view.setVisibility(0);
            fullScreenProgressSpinnerManager.hide();
        }
    }
}
