// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.loyalty.api.LoyaltyApi;
import com.google.android.apps.wallet.loyalty.discovery.LoyaltyDiscoveryApiClient;
import com.google.android.apps.wallet.loyalty.discovery.SimplifiedLoyaltyProgramListItemBinder;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.location.LocationFetcher;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.list.HeadedListAdapter;
import com.google.android.apps.wallet.widgets.list.MergedListAdapter;
import com.google.android.apps.wallet.widgets.list.SimpleListAdapter;
import com.google.android.apps.wallet.widgets.list.SingleItemAdapter;
import com.google.android.apps.wallet.widgets.progressspinner.ProgressSpinnerView;
import com.google.common.collect.Ordering;
import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            AddLoyaltyProgramHeaderBinder, LoyaltyCardsHandler

public class SimplifiedLoyaltyProgramListFragment extends WalletFragment
{
    static final class DisplayType extends Enum
    {

        private static final DisplayType $VALUES[];
        public static final DisplayType ERROR;
        public static final DisplayType LIST;
        public static final DisplayType LOADING;

        public static DisplayType valueOf(String s)
        {
            return (DisplayType)Enum.valueOf(com/google/android/apps/wallet/loyalty/SimplifiedLoyaltyProgramListFragment$DisplayType, s);
        }

        public static DisplayType[] values()
        {
            return (DisplayType[])$VALUES.clone();
        }

        static 
        {
            LOADING = new DisplayType("LOADING", 0);
            LIST = new DisplayType("LIST", 1);
            ERROR = new DisplayType("ERROR", 2);
            $VALUES = (new DisplayType[] {
                LOADING, LIST, ERROR
            });
        }

        private DisplayType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Object ADD_NEW_PROGRAM_ITEM = new Object();
    private static final String TAG = com/google/android/apps/wallet/loyalty/SimplifiedLoyaltyProgramListFragment.getSimpleName();
    ActionExecutor actionExecutor;
    AddLoyaltyProgramHeaderBinder addLoyaltyProgramHeaderBinder;
    AppControl appControl;
    private Collator collator;
    private View display;
    private TextView emptyView;
    private View errorRootView;
    private ListView listView;
    LocationFetcher locationFetcher;
    LoyaltyDiscoveryApiClient loyaltyApiClient;
    LoyaltyCardsHandler loyaltyCardsHandler;
    private SimpleListAdapter loyaltyProgramsAdapter;
    private Ordering ordering;
    private ProgressSpinnerView progressSpinnerView;
    SimplifiedLoyaltyProgramListItemBinder simplifiedLoyaltyProgramListItemBinder;

    public SimplifiedLoyaltyProgramListFragment()
    {
    }

    private void doSearch()
    {
        if (!isAdded())
        {
            return;
        } else
        {
            setDisplayType(DisplayType.LOADING);
            actionExecutor.cancelAll();
            actionExecutor.executeAction(new Callable() {

                final SimplifiedLoyaltyProgramListFragment this$0;

                private com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse call()
                    throws Exception
                {
                    return loyaltyApiClient.fetchFeaturedPrograms(getLastKnownLocation());
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = SimplifiedLoyaltyProgramListFragment.this;
                super();
            }
            }, new AsyncCallback() {

                final SimplifiedLoyaltyProgramListFragment this$0;

                private void onSuccess(com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse discoverloyaltyprogramsresponse)
                {
                    setPrograms(Arrays.asList(discoverloyaltyprogramsresponse.programs));
                    setDisplayType(DisplayType.LIST);
                }

                public final void onFailure(Exception exception)
                {
                    setDisplayType(DisplayType.ERROR);
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverLoyaltyProgramsResponse)obj);
                }

            
            {
                this$0 = SimplifiedLoyaltyProgramListFragment.this;
                super();
            }
            });
            return;
        }
    }

    private Location getLastKnownLocation()
    {
        String s;
        long l;
        l = TimeUnit.MINUTES.toMillis(10L);
        s = appControl.getString(AppControlKey.LOYALTY_DISCOVERABLE_PROGRAM_LOCATION_STALE_TIME);
        long l1 = TimeUnit.SECONDS.toMillis(Long.parseLong(s));
        l = l1;
_L2:
        return locationFetcher.getLastKnownLocation(l);
        NumberFormatException numberformatexception;
        numberformatexception;
        WLog.vfmt(TAG, "Invalid loyalty discoverable program location stale time: %s", new Object[] {
            s
        });
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void setPrograms(List list)
    {
        loyaltyProgramsAdapter.setItems(ordering.sortedCopy(list));
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        collator = Collator.getInstance();
        collator.setStrength(0);
        ordering = new Ordering() {

            final SimplifiedLoyaltyProgramListFragment this$0;

            private int compare(com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram, com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram1)
            {
                return collator.compare(getMerchantName(discoverableloyaltyprogram), getMerchantName(discoverableloyaltyprogram1));
            }

            private static String getMerchantName(com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram)
            {
                if (discoverableloyaltyprogram.nativeRenderingInfo != null && discoverableloyaltyprogram.nativeRenderingInfo.merchantName != null)
                {
                    return discoverableloyaltyprogram.nativeRenderingInfo.merchantName;
                } else
                {
                    return "";
                }
            }

            public final volatile int compare(Object obj, Object obj1)
            {
                return compare((com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)obj, (com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)obj1);
            }

            
            {
                this$0 = SimplifiedLoyaltyProgramListFragment.this;
                super();
            }
        };
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        display = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.loyalty_simplified_program_list, null);
        listView = (ListView)Views.findViewById(display, com.google.android.apps.walletnfcrel.R.id.loyalty_ProgramList);
        emptyView = (TextView)Views.findViewById(display, 0x1020004);
        errorRootView = Views.findViewById(display, com.google.android.apps.walletnfcrel.R.id.loading_list_error_view);
        progressSpinnerView = (ProgressSpinnerView)Views.findViewById(display, com.google.android.apps.walletnfcrel.R.id.loyalty_ProgressSpinner);
        layoutinflater = (Button)Views.findViewById(display, com.google.android.apps.walletnfcrel.R.id.loading_list_retry_button);
        viewgroup = (TextView)Views.findViewById(display, com.google.android.apps.walletnfcrel.R.id.loading_list_error_message);
        bundle = new SingleItemAdapter(addLoyaltyProgramHeaderBinder);
        bundle.setItem(ADD_NEW_PROGRAM_ITEM);
        bundle.setIsEnabled(true);
        loyaltyProgramsAdapter = new SimpleListAdapter(simplifiedLoyaltyProgramListItemBinder);
        HeadedListAdapter headedlistadapter = (new com.google.android.apps.wallet.widgets.list.HeadedListAdapter.Builder()).withDefaultHeaderView(getActivity()).withListAdapter(loyaltyProgramsAdapter).build();
        headedlistadapter.setHeaderText(getString(com.google.android.apps.walletnfcrel.R.string.loyalty_featured_programs_title));
        headedlistadapter.setHeaderVisibility(com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.VISIBLE_UNLESS_EMPTY);
        MergedListAdapter mergedlistadapter = new MergedListAdapter();
        mergedlistadapter.setAdapters(new ListAdapter[] {
            bundle, headedlistadapter
        });
        listView.setAdapter(mergedlistadapter);
        listView.setEmptyView(emptyView);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SimplifiedLoyaltyProgramListFragment this$0;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = ((AdapterView) (adapterview.getAdapter().getItem(i)));
                if (adapterview == SimplifiedLoyaltyProgramListFragment.ADD_NEW_PROGRAM_ITEM)
                {
                    startActivity(LoyaltyApi.createStartNewAdhocLoyaltyCardFlowIntent(getActivity(), loyaltyCardsHandler.supportsImageCapture()));
                } else
                if (adapterview instanceof com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)
                {
                    adapterview = (com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)adapterview;
                    startActivity(LoyaltyApi.createFeaturedProgramDetailsActivityIntentWithProgramId(getActivity(), ((com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram) (adapterview)).programId));
                    return;
                }
            }

            
            {
                this$0 = SimplifiedLoyaltyProgramListFragment.this;
                super();
            }
        });
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            final SimplifiedLoyaltyProgramListFragment this$0;

            public final void onClick(View view)
            {
                doSearch();
            }

            
            {
                this$0 = SimplifiedLoyaltyProgramListFragment.this;
                super();
            }
        });
        emptyView.setText(com.google.android.apps.walletnfcrel.R.string.loyalty_program_search_empty_text);
        viewgroup.setText(com.google.android.apps.walletnfcrel.R.string.loyalty_program_search_error_message);
        return display;
    }

    public final void onResume()
    {
        super.onResume();
        doSearch();
    }

    final void setDisplayType(DisplayType displaytype)
    {
        if (display == null)
        {
            return;
        }
        static final class _cls6
        {

            static final int $SwitchMap$com$google$android$apps$wallet$loyalty$SimplifiedLoyaltyProgramListFragment$DisplayType[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$loyalty$SimplifiedLoyaltyProgramListFragment$DisplayType = new int[DisplayType.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$loyalty$SimplifiedLoyaltyProgramListFragment$DisplayType[DisplayType.LOADING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$loyalty$SimplifiedLoyaltyProgramListFragment$DisplayType[DisplayType.LIST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$loyalty$SimplifiedLoyaltyProgramListFragment$DisplayType[DisplayType.ERROR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls6..SwitchMap.com.google.android.apps.wallet.loyalty.SimplifiedLoyaltyProgramListFragment.DisplayType[displaytype.ordinal()])
        {
        default:
            throw new AssertionError("Unexpected DisplayType");

        case 1: // '\001'
            progressSpinnerView.showDelayed();
            listView.setVisibility(8);
            emptyView.setVisibility(8);
            errorRootView.setVisibility(8);
            return;

        case 2: // '\002'
            listView.setVisibility(0);
            progressSpinnerView.hide();
            errorRootView.setVisibility(8);
            return;

        case 3: // '\003'
            errorRootView.setVisibility(0);
            break;
        }
        listView.setVisibility(8);
        emptyView.setVisibility(8);
        progressSpinnerView.hide();
    }






}
