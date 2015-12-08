// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.analytics.AppStartTimeLogger;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.pin.api.PinApi;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.tile.HeaderTile;
import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.tile.TileManager;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.scrollview.ObservableScrollView;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.wallet.wobl.exception.WoblException;
import dagger.Lazy;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            WoblTileFactory, MyWalletEvent, MyWalletManager

public class MyWalletActivity extends WalletActivity
{

    public static final String TAG = com/google/android/apps/wallet/mywallet/MyWalletActivity.getSimpleName();
    public ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    AppStartTimeLogger appStartTimeLogger;
    public EventBus eventBus;
    private ViewGroup headerTileContainer;
    MyWalletManager myWalletManager;
    Lazy nativeTileMap;
    private final com.google.android.apps.wallet.widgets.scrollview.ObservableScrollView.ScrollListener scrollListener = new com.google.android.apps.wallet.widgets.scrollview.ObservableScrollView.ScrollListener() {

        final MyWalletActivity this$0;

        public final void onScrollChanged(int i, int j)
        {
            if (!tileManager.hasHeader())
            {
                return;
            } else
            {
                j = headerTileContainer.getHeight();
                i = Math.min(0, Math.max(-i, -j));
                headerTileContainer.animate().y(i).setDuration(0L);
                swipeRefreshLayout.animate().y(i + j).setDuration(0L);
                scrollView.animate().y(-(j + i)).setDuration(0L);
                float f = (float)i / (float)j;
                tileManager.getHeaderTile().animateOnScroll(1.0F + f);
                return;
            }
        }

            
            {
                this$0 = MyWalletActivity.this;
                super();
            }
    };
    private ObservableScrollView scrollView;
    SharedPreferences sharedPreferences;
    private SwipeRefreshLayout swipeRefreshLayout;
    private ViewGroup tileContainer;
    public TileManager tileManager;
    UriRegistry uriRegistry;
    Lazy woblTileFactory;

    public MyWalletActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void adjustTileHeaderPadding()
    {
        if (!tileManager.hasHeader())
        {
            return;
        } else
        {
            (new Handler()).post(new Runnable() {

                final MyWalletActivity this$0;

                public final void run()
                {
                    int i = headerTileContainer.getHeight();
                    tileContainer.setPadding(tileContainer.getPaddingLeft(), i, tileContainer.getPaddingRight(), tileContainer.getPaddingBottom());
                    i = scrollView.getScrollY();
                    android.view.ViewGroup.LayoutParams layoutparams = swipeRefreshLayout.getLayoutParams();
                    int j = ((ViewGroup)swipeRefreshLayout.getParent()).getHeight();
                    if (layoutparams.height != j)
                    {
                        layoutparams.height = j;
                        swipeRefreshLayout.setLayoutParams(layoutparams);
                    }
                    scrollListener.onScrollChanged(i, i);
                }

            
            {
                this$0 = MyWalletActivity.this;
                super();
            }
            });
            return;
        }
    }

    private com.google.android.apps.wallet.tile.Tile.TileDismissedListener createServerDismissListener()
    {
        return new com.google.android.apps.wallet.tile.Tile.TileDismissedListener() {

            final MyWalletActivity this$0;

            public final void onTileDismissed(Tile tile)
            {
                actionExecutor.executeAction(tile. new Callable() {

                    final _cls4 this$1;
                    final Tile val$tile;

                    private Void call()
                        throws Exception
                    {
                        myWalletManager.dismissTile(tile.getServerId());
                        return null;
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$1 = final__pcls4;
                tile = Tile.this;
                super();
            }
                });
            }

            
            {
                this$0 = MyWalletActivity.this;
                super();
            }
        };
    }

    private List createTiles(com.google.wallet.proto.api.NanoWalletMywallet.WalletTileGroup awallettilegroup[])
    {
        java.util.LinkedList linkedlist = Lists.newLinkedList();
        if (awallettilegroup != null)
        {
            int k = awallettilegroup.length;
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                com.google.wallet.proto.api.NanoWalletMywallet.WalletTileGroup wallettilegroup = awallettilegroup[i];
                com.google.wallet.proto.api.NanoWalletMywallet.WalletTile awallettile[] = wallettilegroup.tile;
                int l = awallettile.length;
                int j = 0;
                while (j < l) 
                {
                    Object obj = awallettile[j];
                    if (((com.google.wallet.proto.api.NanoWalletMywallet.WalletTile) (obj)).type.intValue() == 2)
                    {
                        try
                        {
                            linkedlist.add(((WoblTileFactory)woblTileFactory.get()).create(((com.google.wallet.proto.api.NanoWalletMywallet.WalletTile) (obj)), wallettilegroup.anchor, createServerDismissListener()));
                        }
                        catch (WoblException woblexception)
                        {
                            WLog.efmt(TAG, woblexception, "Error rendering WOBL tile: %s", new Object[] {
                                ((com.google.wallet.proto.api.NanoWalletMywallet.WalletTile) (obj)).walletTileId
                            });
                        }
                    } else
                    {
                        obj = ((Multimap)nativeTileMap.get()).get(((com.google.wallet.proto.api.NanoWalletMywallet.WalletTile) (obj)).type).iterator();
                        while (((Iterator) (obj)).hasNext()) 
                        {
                            Tile tile = (Tile)((Iterator) (obj)).next();
                            if (tile.shouldShow())
                            {
                                linkedlist.add(tile);
                            }
                        }
                    }
                    j++;
                }
                i++;
            } while (true);
        }
        return linkedlist;
    }

    private void manualRefresh()
    {
        eventBus.post(new RequestRefreshEvent());
        swipeRefreshLayout.setRefreshing(true);
    }

    public final void doOnCreate(Bundle bundle)
    {
        super.doOnCreate(bundle);
        setTitle("");
        setContentView(com.google.android.apps.walletnfcrel.R.layout.my_wallet_activity);
        swipeRefreshLayout = (SwipeRefreshLayout)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.swipe_refresh_widget);
        swipeRefreshLayout.setColorSchemeResources(new int[] {
            com.google.android.apps.walletnfcrel.R.color.google_green, com.google.android.apps.walletnfcrel.R.color.google_red, com.google.android.apps.walletnfcrel.R.color.google_blue, com.google.android.apps.walletnfcrel.R.color.google_yellow
        });
        swipeRefreshLayout.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {

            final MyWalletActivity this$0;

            public final void onRefresh()
            {
                analyticsUtil.sendSwipe("RefreshWallet", new AnalyticsCustomDimension[0]);
                manualRefresh();
            }

            
            {
                this$0 = MyWalletActivity.this;
                super();
            }
        });
        tileContainer = (ViewGroup)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.MyWalletTiles);
        headerTileContainer = (ViewGroup)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.HeaderTileContainer);
        scrollView = (ObservableScrollView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.my_wallet_screen_content);
        scrollView.setScrollListener(scrollListener);
        headerTileContainer.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            final MyWalletActivity this$0;

            public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                    int k1, int l1)
            {
                adjustTileHeaderPadding();
            }

            
            {
                this$0 = MyWalletActivity.this;
                super();
            }
        });
    }

    public final void doOnResume()
    {
        super.doOnResume();
        eventBus.register(this);
        tileManager.activateTiles(tileContainer, headerTileContainer);
        analyticsUtil.endTiming("OpenMyWallet", "user_open_my_wallet");
    }

    public final boolean hasDrawerIndicator()
    {
        return true;
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected final void onBeforeCreate(Bundle bundle)
    {
        getWindow().requestFeature(12);
        super.onBeforeCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 24, 1, com.google.android.apps.walletnfcrel.R.string.refresh_label).setIcon(com.google.android.apps.walletnfcrel.R.drawable.optionsmenu_refresh);
        menu.add(12347, 26, 0x30002, com.google.android.apps.walletnfcrel.R.string.lock_wallet).setIcon(com.google.android.apps.walletnfcrel.R.drawable.ic_menu_lock);
        return true;
    }

    public void onDestroy()
    {
        super.onDestroy();
        tileManager.removeAll();
        actionExecutor.cancelAll();
    }

    void onMyWalletEvent(MyWalletEvent mywalletevent)
    {
        appStartTimeLogger.notifyMainActivityRenderred();
        swipeRefreshLayout.setRefreshing(false);
        tileManager.placeTiles(createTiles(mywalletevent.getTiles()), tileContainer, headerTileContainer);
        adjustTileHeaderPadding();
        if (getIntent() != null && getIntent().getData() != null && !Strings.isNullOrEmpty(getIntent().getData().getEncodedFragment()))
        {
            tileManager.scrollToTile(getIntent().getData().getEncodedFragment(), com.google.android.apps.walletnfcrel.R.id.MyWalletTiles, com.google.android.apps.walletnfcrel.R.id.my_wallet_screen_content);
            setIntent(null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        case 25: // '\031'
        default:
            return super.onOptionsItemSelected(menuitem);

        case 24: // '\030'
            analyticsUtil.sendListItemTap("RefreshWallet", new AnalyticsCustomDimension[0]);
            manualRefresh();
            return true;

        case 26: // '\032'
            analyticsUtil.sendListItemTap("LockWallet", new AnalyticsCustomDimension[0]);
            break;
        }
        startActivity(PinApi.createLockWalletIntent(this));
        return true;
    }

    public void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
        tileManager.deactivateTiles();
    }








}
