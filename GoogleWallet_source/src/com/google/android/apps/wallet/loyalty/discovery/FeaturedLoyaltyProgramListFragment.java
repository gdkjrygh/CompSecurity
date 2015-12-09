// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.loyalty.api.LoyaltyApi;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.location.LocationFetcher;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.list.HeadedListAdapter;
import com.google.android.apps.wallet.widgets.list.SimpleListAdapter;
import com.google.android.apps.wallet.widgets.progressspinner.ProgressSpinnerView;
import com.google.common.collect.Ordering;
import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.loyalty.discovery:
//            LoyaltyDiscoveryApiClient, SimplifiedLoyaltyProgramListItemBinder

public class FeaturedLoyaltyProgramListFragment extends WalletFragment
{
    static final class DisplayType extends Enum
    {

        private static final DisplayType $VALUES[];
        public static final DisplayType ERROR;
        public static final DisplayType LIST;
        public static final DisplayType LOADING;

        public static DisplayType valueOf(String s)
        {
            return (DisplayType)Enum.valueOf(com/google/android/apps/wallet/loyalty/discovery/FeaturedLoyaltyProgramListFragment$DisplayType, s);
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


    private static final String TAG = com/google/android/apps/wallet/loyalty/discovery/FeaturedLoyaltyProgramListFragment.getSimpleName();
    public ActionExecutor actionExecutor;
    public AppControl appControl;
    private Collator collator;
    private View display;
    private TextView emptyView;
    private View errorRootView;
    private ListView listView;
    public LocationFetcher locationFetcher;
    public LoyaltyDiscoveryApiClient loyaltyApiClient;
    private SimpleListAdapter loyaltyProgramsAdapter;
    private Ordering ordering;
    private ProgressSpinnerView progressSpinnerView;
    public SimplifiedLoyaltyProgramListItemBinder simplifiedLoyaltyProgramListItemBinder;

    public FeaturedLoyaltyProgramListFragment()
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

                final FeaturedLoyaltyProgramListFragment this$0;

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
                this$0 = FeaturedLoyaltyProgramListFragment.this;
                super();
            }
            }, new AsyncCallback() {

                final FeaturedLoyaltyProgramListFragment this$0;

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
                this$0 = FeaturedLoyaltyProgramListFragment.this;
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

            final FeaturedLoyaltyProgramListFragment this$0;

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
                this$0 = FeaturedLoyaltyProgramListFragment.this;
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
        viewgroup = (Button)Views.findViewById(display, com.google.android.apps.walletnfcrel.R.id.loading_list_retry_button);
        bundle = (TextView)Views.findViewById(display, com.google.android.apps.walletnfcrel.R.id.loading_list_error_message);
        loyaltyProgramsAdapter = new SimpleListAdapter(simplifiedLoyaltyProgramListItemBinder);
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.featured_loyalty_programs_header, null);
        layoutinflater = (new com.google.android.apps.wallet.widgets.list.HeadedListAdapter.Builder()).withHeaderView(layoutinflater).withListAdapter(loyaltyProgramsAdapter).build();
        layoutinflater.setHeaderText(getString(com.google.android.apps.walletnfcrel.R.string.one_view_featured_loyalty_programs_header));
        layoutinflater.setHeaderVisibility(com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.VISIBLE);
        listView.setAdapter(layoutinflater);
        listView.setEmptyView(emptyView);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final FeaturedLoyaltyProgramListFragment this$0;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = ((AdapterView) (adapterview.getAdapter().getItem(i)));
                if (adapterview instanceof com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)
                {
                    adapterview = (com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)adapterview;
                    startActivity(LoyaltyApi.createFeaturedProgramDetailsActivityIntentWithProgramId(getActivity(), ((com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram) (adapterview)).programId));
                }
            }

            
            {
                this$0 = FeaturedLoyaltyProgramListFragment.this;
                super();
            }
        });
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            final FeaturedLoyaltyProgramListFragment this$0;

            public final void onClick(View view)
            {
                doSearch();
            }

            
            {
                this$0 = FeaturedLoyaltyProgramListFragment.this;
                super();
            }
        });
        emptyView.setText(com.google.android.apps.walletnfcrel.R.string.loyalty_program_search_empty_text);
        bundle.setText(com.google.android.apps.walletnfcrel.R.string.loyalty_program_search_error_message);
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

            static final int $SwitchMap$com$google$android$apps$wallet$loyalty$discovery$FeaturedLoyaltyProgramListFragment$DisplayType[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$loyalty$discovery$FeaturedLoyaltyProgramListFragment$DisplayType = new int[DisplayType.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$loyalty$discovery$FeaturedLoyaltyProgramListFragment$DisplayType[DisplayType.LOADING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$loyalty$discovery$FeaturedLoyaltyProgramListFragment$DisplayType[DisplayType.LIST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$loyalty$discovery$FeaturedLoyaltyProgramListFragment$DisplayType[DisplayType.ERROR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls6..SwitchMap.com.google.android.apps.wallet.loyalty.discovery.FeaturedLoyaltyProgramListFragment.DisplayType[displaytype.ordinal()])
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
