// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.dynamicwidth.ScreenWidthSensitiveListView;
import com.google.common.collect.ImmutableList;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            ViewWoblActivity

public abstract class WobListFragment extends WalletFragment
    implements WobListActivity.OnTabFragmentCreateListener
{

    private static final List LABELS_WITH_NO_SPLASH_SCREEN = ImmutableList.of(Long.valueOf(0x5ca6fa4359bfd2efL), Long.valueOf(0x1795015b9646fc27L), Long.valueOf(0x8d11e6de4edbd1d3L), Long.valueOf(0x80d2f5009d3c79e3L));
    protected final String csiTimingListLoaded;
    protected TextView emptyText;
    public EventBus eventBus;
    protected final String gaTimingListLoaded;
    protected ScreenWidthSensitiveListView listView;
    protected long selectedSubLabelOrdinal;
    protected int splashLayout;
    protected ViewStub splashStub;
    private ViewGroup view;

    public WobListFragment(int i, String s, String s1)
    {
        splashLayout = i;
        gaTimingListLoaded = s;
        csiTimingListLoaded = s1;
    }

    private void setSubLabelOrdinal(long l)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("sublabel", l);
        setArguments(bundle);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        selectedSubLabelOrdinal = getArguments().getLong("sublabel");
        setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        menu.add(0, 24, 1, com.google.android.apps.walletnfcrel.R.string.refresh_label);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        view = (ViewGroup)layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wob_list, viewgroup, false);
        listView = (ScreenWidthSensitiveListView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.ListView);
        listView.addHeaderView(new View(getActivity()));
        listView.addFooterView(new View(getActivity()));
        listView.setIgnoreHeadersAndFootersForAccessibility(true);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final WobListFragment this$0;

            public final void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                adapterview = ((AdapterView) (listView.getAdapter().getItem(i)));
                if (adapterview instanceof com.google.wallet.proto.NanoWalletObjects.WobInstance)
                {
                    startActivity(ViewWoblActivity.createExpandedViewIntent(getActivity(), (com.google.wallet.proto.NanoWalletObjects.WobInstance)adapterview));
                } else
                if (adapterview instanceof com.google.android.apps.wallet.wobs.list.FastWoblListAdapter.ListItem)
                {
                    adapterview = ((com.google.android.apps.wallet.wobs.list.FastWoblListAdapter.ListItem)adapterview).getEntityId();
                    startActivity(ViewWoblActivity.createExpandedViewIntent(getActivity(), adapterview));
                    return;
                }
            }

            
            {
                this$0 = WobListFragment.this;
                super();
            }
        });
        splashStub = (ViewStub)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashStub);
        splashStub.setLayoutResource(splashLayout);
        splashStub.setOnInflateListener(new android.view.ViewStub.OnInflateListener() {

            final WobListFragment this$0;

            public final void onInflate(ViewStub viewstub, View view1)
            {
                onSplashViewInflated(view1);
            }

            
            {
                this$0 = WobListFragment.this;
                super();
            }
        });
        emptyText = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.EmptyText);
        return view;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 24: // '\030'
            analyticsUtil.sendListItemTap("RefreshWallet", new AnalyticsCustomDimension[0]);
            break;
        }
        eventBus.post(new RequestRefreshEvent());
        return true;
    }

    protected abstract void onSplashViewInflated(View view1);

    public final void onTabFragmentCreated(WobListActivity.TabSpec tabspec)
    {
        setSubLabelOrdinal(tabspec.getLabelOrdinal());
    }

}
