// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.accounts.Account;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.wallet.account.AccountChanger;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.api.UriResolver;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;
import com.google.android.apps.wallet.widgets.list.SimpleListAdapter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.People;
import com.google.android.gms.people.accountswitcherview.OwnersAvatarManager;
import com.google.android.gms.people.accountswitcherview.OwnersListAdapter;
import com.google.android.gms.people.accountswitcherview.ScrimDrawable;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
import com.google.android.gms.people.model.Owner;
import com.google.android.gms.people.model.OwnerBuffer;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import dagger.Lazy;
import java.nio.charset.Charset;
import java.util.List;
import javax.inject.Provider;

public class NavDrawerFragment extends WalletFragment
    implements android.content.DialogInterface.OnCancelListener, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
{
    static final class NavDrawerItemHolder
        implements ViewHolder
    {

        final View divider;
        final ImageView iconView;
        final TextView titleView;
        final TextView valueView;
        private final View view;

        public final View getView()
        {
            return view;
        }

        NavDrawerItemHolder(View view1)
        {
            view = view1;
            titleView = (TextView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.Title);
            valueView = (TextView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.Value);
            iconView = (ImageView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.Icon);
            divider = Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.Divider);
        }
    }

    final class NavDrawerListItemBinder
        implements android.view.View.OnClickListener, ListItemBinder
    {

        final NavDrawerFragment this$0;

        private void bind(int i, ViewHolder viewholder, NavDrawerRow navdrawerrow)
        {
            viewholder = (NavDrawerItemHolder)viewholder;
            com.google.wallet.proto.api.NanoWalletNavigation.NavigationNode navigationnode = navdrawerrow.node;
            ((NavDrawerItemHolder) (viewholder)).titleView.setText(navigationnode.display.title);
            ((NavDrawerItemHolder) (viewholder)).valueView.setText(navigationnode.display.value);
            View view = ((NavDrawerItemHolder) (viewholder)).divider;
            if (navdrawerrow.hasDivider())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
            if (navigationnode.display.iconUrl != null)
            {
                ((Picasso)picasso.get()).load(Uri.parse(navigationnode.display.iconUrl)).resizeDimen(com.google.android.apps.walletnfcrel.R.dimen.nav_drawer_icon_size, com.google.android.apps.walletnfcrel.R.dimen.nav_drawer_icon_size).error(com.google.android.apps.walletnfcrel.R.drawable.img_icon_generic).into(((NavDrawerItemHolder) (viewholder)).iconView);
            } else
            {
                ((NavDrawerItemHolder) (viewholder)).iconView.setImageDrawable(null);
            }
            ((NavDrawerItemHolder) (viewholder)).iconView.setContentDescription(navigationnode.display.accessibilityLabel);
            viewholder.getView().setTag(com.google.android.apps.walletnfcrel.R.id.ViewUri, navigationnode.uri);
        }

        private static boolean isEnabled(NavDrawerRow navdrawerrow)
        {
            return true;
        }

        public final volatile void bind(int i, ViewHolder viewholder, Object obj)
        {
            bind(i, viewholder, (NavDrawerRow)obj);
        }

        public final ViewHolder createDisplay()
        {
            View view = getActivity().getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.nav_drawer_item, null);
            view.setOnClickListener(this);
            view.setFocusable(true);
            return new NavDrawerItemHolder(view);
        }

        public final volatile boolean isEnabled(Object obj)
        {
            return isEnabled((NavDrawerRow)obj);
        }

        public final void onClick(View view)
        {
            view = (String)view.getTag(com.google.android.apps.walletnfcrel.R.id.ViewUri);
            if (view != null && !view.equals(currentlyCheckedRowUri))
            {
                uriAwaitingNavigation = view;
                highlightNavDrawerItem(view);
            }
            drawerLayout.closeDrawer(3);
        }

        private NavDrawerListItemBinder()
        {
            this$0 = NavDrawerFragment.this;
            super();
        }

    }

    public static final class NavDrawerRow
    {

        private final boolean hasDivider;
        private final com.google.wallet.proto.api.NanoWalletNavigation.NavigationNode node;

        public final com.google.wallet.proto.api.NanoWalletNavigation.NavigationNode getNode()
        {
            return node;
        }

        public final boolean hasDivider()
        {
            return hasDivider;
        }


        public NavDrawerRow(com.google.wallet.proto.api.NanoWalletNavigation.NavigationNode navigationnode, boolean flag)
        {
            node = navigationnode;
            hasDivider = flag;
        }
    }

    static final class TrackingIds
    {

        final String analyticsEventId;
        final String analyticsTimingId;
        final String csiTimingId;

        TrackingIds(String s, String s1, String s2)
        {
            analyticsEventId = s;
            analyticsTimingId = s1;
            csiTimingId = s2;
        }
    }


    private static final String TAG = com/google/android/apps/wallet/navdrawer/NavDrawerFragment.getSimpleName();
    private static final ImmutableMap URI_TO_TRACKING_IDS = ImmutableMap.builder().put(UriRegistry.getUri(2, new Object[0]), new TrackingIds("OpenMyWallet", "OpenMyWallet", "user_open_my_wallet")).put(UriRegistry.getUri(4000, new Object[0]), new TrackingIds("OpenSendMoney", "OpenSendMoney", "user_open_send_money")).put(UriRegistry.getUri(8000, new Object[0]), new TrackingIds("OpenTransactions", "OpenTransactions", "user_open_transactions")).put(UriRegistry.getUri(5003, new Object[0]), new TrackingIds("OpenWalletBalance", "OpenWalletBalance", "user_open_wallet_balance")).put(UriRegistry.getUri(9000, new Object[0]), new TrackingIds("OpenCardsAndAccounts", "OpenCardsAndAccounts", null)).put(UriRegistry.getUri(1001, new Object[] {
        Long.valueOf(0x5ca6fa4359bfd2eeL)
    }), new TrackingIds("OpenGiftCards", "OpenGiftCards", "user_open_gift_cards")).put(UriRegistry.getUri(1001, new Object[] {
        Long.valueOf(0xcc9803b6c1192477L)
    }), new TrackingIds("OpenLoyaltyPrograms", "OpenLoyaltyPrograms", "user_open_loyalty_programs")).put(UriRegistry.getUri(1001, new Object[] {
        Long.valueOf(0x6a73ed851981cb68L)
    }), new TrackingIds("OpenOffers", "OpenOffers", "user_open_tap_offers")).put(UriRegistry.getUri(1001, new Object[] {
        Long.valueOf(0xb01efe87478e2482L)
    }), new TrackingIds("OpenOrders", "OpenOrders", "user_open_orders")).put(UriRegistry.getUri(10000, new Object[0]), new TrackingIds("OpenSettings", "OpenSettings", null)).put(UriRegistry.getUri(7001, new Object[0]), new TrackingIds("OpenHelpAndFeedback", "OpenHelpAndFeedback", null)).put(UriRegistry.getUri(5, new Object[0]), new TrackingIds("OpenOneView", "OpenOneView", "user_open_one_view")).build();
    Provider account;
    Provider accountChanger;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private Owner currentOwner;
    private String currentlyCheckedRowUri;
    private DrawerLayout drawerLayout;
    private FrameLayout frameLayout;
    SharedPreferences globalSharedPreferences;
    GoogleApiClient googleApiClient;
    private SimpleListAdapter listAdapter;
    private OwnersListAdapter ownersAdapter;
    private OwnersAvatarManager ownersAvatarManager;
    Lazy picasso;
    private ListView rootList;
    private ScrimDrawable scrimDrawable;
    private SelectedAccountNavigationView selectedAccountNavigationView;
    private boolean startInAccountsNavigationMode;
    private String uriAwaitingNavigation;
    UriResolver uriResolver;

    public NavDrawerFragment()
    {
        startInAccountsNavigationMode = false;
        uriAwaitingNavigation = null;
    }

    private int getListPosition(String s)
    {
        for (int i = 0; i < rootList.getCount(); i++)
        {
            if ((rootList.getItemAtPosition(i) instanceof NavDrawerRow) && s.equals(((NavDrawerRow)rootList.getItemAtPosition(i)).getNode().uri))
            {
                return i;
            }
        }

        return -1;
    }

    private void highlightNavDrawerItem(String s)
    {
        if (selectedAccountNavigationView.getNavigationMode() != 0)
        {
            return;
        }
        currentlyCheckedRowUri = s;
        int i;
        if (s != null)
        {
            i = getListPosition(s);
        } else
        {
            i = -1;
        }
        rootList.setItemChecked(i, true);
    }

    private void loadOwners()
    {
        com.google.android.gms.people.Graph.LoadOwnersOptions loadownersoptions = (new com.google.android.gms.people.Graph.LoadOwnersOptions()).setIncludePlusPages(false);
        People.GraphApi.loadOwners(googleApiClient, loadownersoptions).setResultCallback(new ResultCallback() {

            final NavDrawerFragment this$0;

            private void onResult(com.google.android.gms.people.Graph.LoadOwnersResult loadownersresult)
            {
                onOwnersLoaded(loadownersresult.getStatus(), loadownersresult.getOwners());
            }

            public final volatile void onResult(Result result)
            {
                onResult((com.google.android.gms.people.Graph.LoadOwnersResult)result);
            }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }
        });
    }

    private void navigateTo(String s)
    {
        Uri uri = Uri.parse(s);
        TrackingIds trackingids = (TrackingIds)URI_TO_TRACKING_IDS.get(uri);
        s = trackingids;
        if (trackingids == null)
        {
            s = new TrackingIds("OpenUnknown", null, null);
        }
        analyticsUtil.sendNavDrawerItemSelect(((TrackingIds) (s)).analyticsEventId, new AnalyticsCustomDimension[0]);
        if (((TrackingIds) (s)).analyticsTimingId != null || ((TrackingIds) (s)).csiTimingId != null)
        {
            analyticsUtil.startTiming(((TrackingIds) (s)).analyticsTimingId, ((TrackingIds) (s)).csiTimingId);
        }
        uriResolver.resolve(uri);
    }

    private void selectOwner(Owner owner)
    {
        analyticsUtil.sendListItemTap("ChangeUser", new AnalyticsCustomDimension[0]);
        ((AccountChanger)accountChanger.get()).changeAccount(owner.getAccountName());
    }

    private void updateCheckedItem()
    {
        if (currentlyCheckedRowUri != null)
        {
            highlightNavDrawerItem(currentlyCheckedRowUri);
        }
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        googleApiClient.registerConnectionCallbacks(this);
        googleApiClient.registerConnectionFailedListener$40dd7b8f(this);
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            super.onActivityResult(i, j, intent);
            if (i == 9000 || i == 9001)
            {
                if (j != -1)
                {
                    break label0;
                }
                googleApiClient.connect();
            }
            return;
        }
        WLog.w(TAG, (new StringBuilder(50)).append("non-OK result for request ").append(i).append(": ").append(j).toString());
        getActivity().finish();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        getActivity().finish();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        actionBarDrawerToggle.onConfigurationChanged(configuration);
    }

    public final void onConnected(Bundle bundle)
    {
        loadOwners();
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        Object obj = TAG;
        String s = String.valueOf(connectionresult);
        WLog.w(((String) (obj)), (new StringBuilder(String.valueOf(s).length() + 27)).append("Client connection failure: ").append(s).toString());
        obj = GooglePlayServicesUtil.getErrorDialog(connectionresult.getErrorCode(), getActivity(), 9001, this);
        if (obj != null)
        {
            ((Dialog) (obj)).show();
        } else
        if (connectionresult.hasResolution())
        {
            try
            {
                connectionresult.startResolutionForResult(getActivity(), 9000);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ConnectionResult connectionresult)
            {
                googleApiClient.connect();
            }
            return;
        }
    }

    public final void onConnectionSuspended(int i)
    {
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        frameLayout = (FrameLayout)layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.nav_drawer, viewgroup, false);
        rootList = (ListView)Views.findViewById(frameLayout, com.google.android.apps.walletnfcrel.R.id.NavDrawerItemList);
        drawerLayout = (DrawerLayout)getActivity().findViewById(com.google.android.apps.walletnfcrel.R.id.RootDrawerLayout);
        drawerLayout.setDrawerShadow(com.google.android.apps.walletnfcrel.R.drawable.drawer_shadow, 3);
        drawerLayout.setStatusBarBackgroundColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.primary_dark));
        listAdapter = new SimpleListAdapter(new NavDrawerListItemBinder());
        rootList.setDividerHeight(0);
        rootList.setChoiceMode(1);
        int i = getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.list_padding_bottom);
        int j = getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.list_padding_top);
        rootList.setPadding(0, 0, 0, i);
        rootList.setClipToPadding(false);
        actionBarDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, com.google.android.apps.walletnfcrel.R.string.nav_drawer_open, com.google.android.apps.walletnfcrel.R.string.nav_drawer_close) {

            final NavDrawerFragment this$0;

            public final void onDrawerClosed(View view)
            {
                if (uriAwaitingNavigation != null)
                {
                    navigateTo(uriAwaitingNavigation);
                    uriAwaitingNavigation = null;
                }
                selectedAccountNavigationView.setNavigationMode(0);
                rootList.setAdapter(listAdapter);
                updateCheckedItem();
            }

            public final void onDrawerOpened(View view)
            {
                view = getActivity().getCurrentFocus();
                if (view != null)
                {
                    Views.hideSoftKeyboard(getActivity(), view);
                    view.clearFocus();
                }
            }

            
            {
                this$0 = NavDrawerFragment.this;
                super(activity, drawerlayout, i, j);
            }
        };
        ownersAvatarManager = new OwnersAvatarManager(getActivity(), googleApiClient);
        ownersAdapter = new OwnersListAdapter(getActivity(), com.google.android.apps.walletnfcrel.R.layout.account_item_view, null, null);
        ownersAdapter.setAvatarManager(ownersAvatarManager);
        ownersAdapter.showManageAccounts(true);
        selectedAccountNavigationView = (SelectedAccountNavigationView)layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.account_selection_header, null);
        selectedAccountNavigationView.setForceFullHeight(true);
        selectedAccountNavigationView.setClient(googleApiClient);
        selectedAccountNavigationView.setAvatarManager(ownersAvatarManager);
        selectedAccountNavigationView.setSelectedAccountLayout(com.google.android.apps.walletnfcrel.R.layout.selected_account, null, null);
        selectedAccountNavigationView.setPadding(0, 0, 0, j);
        selectedAccountNavigationView.setOnAccountChangeListener(new com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.AccountChangeListener() {

            final NavDrawerFragment this$0;

            public final void onAccountChange(Owner owner)
            {
                selectOwner(owner);
            }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }
        });
        selectedAccountNavigationView.setOnNavigationModeChange(new com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.NavigationModeChangeListener() {

            final NavDrawerFragment this$0;

            public final void onNavigationModeChange(SelectedAccountNavigationView selectedaccountnavigationview)
            {
                switch (selectedaccountnavigationview.getNavigationMode())
                {
                default:
                    return;

                case 1: // '\001'
                    rootList.setAdapter(ownersAdapter);
                    return;

                case 0: // '\0'
                    rootList.setAdapter(listAdapter);
                    updateCheckedItem();
                    return;
                }
            }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }
        });
        selectedAccountNavigationView.setFitsSystemWindows(true);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setForegroundGravity(55);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            frameLayout.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() {

                final NavDrawerFragment this$0;

                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
                {
                    int k = windowinsets.getSystemWindowInsetTop();
                    selectedAccountNavigationView.applyTopInset(k);
                    return windowinsets;
                }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }
            });
            frameLayout.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() {

                final NavDrawerFragment this$0;

                public final void onViewAttachedToWindow(View view)
                {
                    view = (View)view.getParent();
                    if (!(view instanceof DrawerLayout))
                    {
                        view.setFitsSystemWindows(true);
                        view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() {

                            final _cls5 this$1;

                            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
                            {
                                int i = windowinsets.getSystemWindowInsetTop();
                                scrimDrawable.setIntrinsicHeight(i);
                                return windowinsets;
                            }

            
            {
                this$1 = _cls5.this;
                super();
            }
                        });
                    }
                    selectedAccountNavigationView.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() {

                        final _cls5 this$1;

                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
                        {
                            return windowinsets;
                        }

            
            {
                this$1 = _cls5.this;
                super();
            }
                    });
                }

                public final void onViewDetachedFromWindow(View view)
                {
                }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }
            });
        }
        scrimDrawable = new ScrimDrawable();
        frameLayout.setForeground(scrimDrawable);
        rootList.addHeaderView(selectedAccountNavigationView);
        rootList.setAdapter(listAdapter);
        if (startInAccountsNavigationMode)
        {
            selectedAccountNavigationView.setNavigationMode(1);
            rootList.setAdapter(ownersAdapter);
        }
        layoutinflater = (WalletActivity)getActivity();
        actionBarDrawerToggle.setDrawerIndicatorEnabled(layoutinflater.hasDrawerIndicator());
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        rootList.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final NavDrawerFragment this$0;

            public final void onItemClick(AdapterView adapterview, View view, int k, long l)
            {
                k--;
                selectedAccountNavigationView.getNavigationMode();
                JVM INSTR tableswitch 1 1: default 32
            //                           1 33;
                   goto _L1 _L2
_L1:
                return;
_L2:
                if (ownersAdapter.getItemViewType(k) == 0)
                {
                    adapterview = ownersAdapter.getItem(k);
                    selectedAccountNavigationView.bind(adapterview);
                    selectOwner(adapterview);
                    return;
                }
                if (ownersAdapter.getItemViewType(k) == 1)
                {
                    analyticsUtil.sendListItemTap("AddAccount", new AnalyticsCustomDimension[0]);
                    adapterview = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
                    adapterview.putExtra("account_types", new String[] {
                        "com.google"
                    });
                    startActivityForResult(adapterview, 9002);
                    return;
                }
                if (ownersAdapter.getItemViewType(k) == 2)
                {
                    adapterview = new Intent("android.settings.SYNC_SETTINGS");
                    adapterview.putExtra("settings", new String[] {
                        "google"
                    });
                    startActivityForResult(adapterview, 9003);
                    return;
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }
        });
        return frameLayout;
    }

    public final void onDestroy()
    {
        if (ownersAvatarManager != null)
        {
            ownersAvatarManager.close();
        }
        ownersAvatarManager = null;
        if (ownersAdapter != null)
        {
            ownersAdapter.disconnect();
        }
        ownersAdapter = null;
        super.onDestroy();
    }

    public final void onOwnersLoaded(Status status, OwnerBuffer ownerbuffer)
    {
        status = Maps.uniqueIndex(ownerbuffer, new Function() {

            final NavDrawerFragment this$0;

            private static String apply(Owner owner1)
            {
                return owner1.getAccountName();
            }

            public final volatile Object apply(Object obj1)
            {
                return apply((Owner)obj1);
            }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }
        });
        Object obj = Iterables.transform(Splitter.on(',').split(globalSharedPreferences.getString("ACCOUNT_SWITCHER_RECENTS", "")), new Function() {

            final NavDrawerFragment this$0;

            private static String apply(String s)
            {
                return new String(Base64.decode(s, 0));
            }

            public final volatile Object apply(Object obj1)
            {
                return apply((String)obj1);
            }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }
        }).iterator();
        ownerbuffer = Iterables.filter(ownerbuffer, new Predicate() {

            final NavDrawerFragment this$0;

            private boolean apply(Owner owner1)
            {
                return !owner1.getAccountName().equals(((Account)account.get()).name);
            }

            public final volatile boolean apply(Object obj1)
            {
                return apply((Owner)obj1);
            }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }
        });
        Owner owner = (Owner)status.get(Iterators.getNext(((java.util.Iterator) (obj)), null));
        obj = (Owner)status.get(Iterators.getNext(((java.util.Iterator) (obj)), null));
        selectedAccountNavigationView.setRecents(owner, ((Owner) (obj)));
        currentOwner = (Owner)status.get(((Account)account.get()).name);
        selectedAccountNavigationView.bind(currentOwner);
        if (ownersAdapter != null)
        {
            ownersAdapter.setOwners(Lists.newArrayList(ownerbuffer));
        }
    }

    public final void onPause()
    {
        super.onPause();
        List list = Lists.transform(selectedAccountNavigationView.getRecents(), new Function() {

            final NavDrawerFragment this$0;

            private static String apply(Owner owner)
            {
                return Base64.encodeToString(owner.getAccountName().getBytes(Charset.forName("UTF-8")), 0);
            }

            public final volatile Object apply(Object obj)
            {
                return apply((Owner)obj);
            }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }
        });
        if (!list.isEmpty())
        {
            globalSharedPreferences.edit().putString("ACCOUNT_SWITCHER_RECENTS", Joiner.on(',').join(list)).commit();
        }
    }

    public final void onResume()
    {
        super.onResume();
        uriAwaitingNavigation = null;
        if (getActivity().getIntent() != null && getActivity().getIntent().getDataString() != null)
        {
            highlightNavDrawerItem(getActivity().getIntent().getDataString());
        } else
        {
            highlightNavDrawerItem(null);
        }
        actionBarDrawerToggle.syncState();
    }

    public final void onStart()
    {
        super.onStart();
        if (googleApiClient != null && !googleApiClient.isConnected() && !googleApiClient.isConnecting())
        {
            googleApiClient.connect();
        }
    }

    public final void onStop()
    {
        if (googleApiClient != null && (googleApiClient.isConnected() || googleApiClient.isConnecting()))
        {
            googleApiClient.disconnect();
        }
        super.onStop();
    }

    public final void setRows(List list)
    {
        listAdapter.setItems(list);
        updateCheckedItem();
    }

    public final void startInAccountsNavigationMode()
    {
        startInAccountsNavigationMode = true;
    }




/*
    static String access$102(NavDrawerFragment navdrawerfragment, String s)
    {
        navdrawerfragment.uriAwaitingNavigation = s;
        return s;
    }

*/











}
