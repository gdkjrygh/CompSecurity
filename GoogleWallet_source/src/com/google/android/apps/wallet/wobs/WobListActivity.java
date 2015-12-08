// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.fragment.FragmentFactory;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.actionbutton.FloatingActionButton;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.collect.Lists;
import java.util.List;

public abstract class WobListActivity extends WalletActivity
{
    final class EmptyTabFactory
        implements android.widget.TabHost.TabContentFactory
    {

        final WobListActivity this$0;

        public final View createTabContent(String s)
        {
            s = new View(WobListActivity.this);
            s.setMinimumWidth(0);
            s.setMinimumHeight(0);
            return s;
        }

        public EmptyTabFactory()
        {
            this$0 = WobListActivity.this;
            super();
        }
    }

    public static interface OnTabFragmentCreateListener
    {

        public abstract void onTabFragmentCreated(TabSpec tabspec);
    }

    public static final class TabSpec
    {

        private final Class fragmentClass;
        private final long labelOrdinal;
        private final String title;

        public final Class getFragmentClass()
        {
            return fragmentClass;
        }

        public final long getLabelOrdinal()
        {
            return labelOrdinal;
        }



        public TabSpec(long l, String s, Class class1)
        {
            labelOrdinal = l;
            title = s;
            fragmentClass = class1;
        }
    }

    final class ViewPagerAdapter extends FragmentPagerAdapter
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        private final List tabSpecs;
        final WobListActivity this$0;

        public final int getCount()
        {
            return tabSpecs.size();
        }

        public final Fragment getItem(int i)
        {
            TabSpec tabspec = (TabSpec)tabSpecs.get(i);
            Object obj = fragmentFactory;
            obj = (WalletFragment)FragmentFactory.get(tabspec.getFragmentClass());
            if (obj instanceof OnTabFragmentCreateListener)
            {
                ((OnTabFragmentCreateListener)obj).onTabFragmentCreated(tabspec);
            }
            return ((Fragment) (obj));
        }

        public final CharSequence getPageTitle(int i)
        {
            return ((TabSpec)tabSpecs.get(i)).title;
        }

        public final void onPageScrollStateChanged(int i)
        {
        }

        public final void onPageScrolled(int i, float f, int j)
        {
        }

        public final void onPageSelected(int i)
        {
            selectedSubLabelOrdinal = Long.valueOf(((TabSpec)tabSpecs.get(i)).labelOrdinal);
            tabHost.setCurrentTab(i);
            sendAnalyticsScreen(selectedSubLabelOrdinal.longValue());
        }

        public final boolean selectLabel(long l)
        {
            for (int i = 0; i < tabSpecs.size(); i++)
            {
                if (((TabSpec)tabSpecs.get(i)).labelOrdinal == l)
                {
                    viewPager.setCurrentItem(i);
                    highLightSelectedTabs(i);
                    return true;
                }
            }

            return false;
        }

        public ViewPagerAdapter(List list)
        {
            this$0 = WobListActivity.this;
            super(getSupportFragmentManager());
            tabSpecs = list;
        }
    }


    private FloatingActionButton actionButton;
    public AnalyticsUtil analyticsUtil;
    public EventBus eventBus;
    public FragmentFactory fragmentFactory;
    protected FullScreenProgressSpinnerManager fullScreenSpinnerManager;
    private Long selectedSubLabelOrdinal;
    private float selectedTabOpacity;
    private TabHost tabHost;
    private final List tabLabels = Lists.newArrayList();
    private TabWidget tabWidget;
    private Toolbar toolbar;
    private float unselectedTabOpacity;
    UriRegistry uriRegistry;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    public WobListActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private float getFloatDimenionValue(int i)
    {
        TypedValue typedvalue = new TypedValue();
        getResources().getValue(i, typedvalue, true);
        return typedvalue.getFloat();
    }

    private void highLightSelectedTabs(int i)
    {
        int j = 0;
        while (j < tabLabels.size()) 
        {
            TextView textview = (TextView)tabLabels.get(j);
            float f;
            if (j == i)
            {
                f = selectedTabOpacity;
            } else
            {
                f = unselectedTabOpacity;
            }
            textview.setAlpha(f);
            j++;
        }
    }

    public void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.wob_list_activity);
        viewPager = (ViewPager)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.WobListViewPager);
        tabHost = (TabHost)Views.findViewById(this, 0x1020012);
        tabHost.setup();
        tabWidget = (TabWidget)Views.findViewById(this, 0x1020013);
        actionButton = (FloatingActionButton)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.SingleActionButton);
        toolbar = (Toolbar)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.toolbar);
        selectedTabOpacity = getFloatDimenionValue(com.google.android.apps.walletnfcrel.R.dimen.opacity_full);
        unselectedTabOpacity = getFloatDimenionValue(com.google.android.apps.walletnfcrel.R.dimen.opacity_medium);
        if (bundle == null)
        {
            bundle = getIntent();
            if (bundle.hasExtra("EXTRA_SELECTED_WOB_SUB_LABEL"))
            {
                selectedSubLabelOrdinal = Long.valueOf(bundle.getLongExtra("EXTRA_SELECTED_WOB_SUB_LABEL", 0L));
                bundle.removeExtra("EXTRA_SELECTED_WOB_SUB_LABEL");
            }
        } else
        if (bundle.containsKey("selected_sub_label"))
        {
            selectedSubLabelOrdinal = Long.valueOf(bundle.getLong("selected_sub_label"));
            return;
        }
    }

    protected final void doOnResume()
    {
        fullScreenSpinnerManager.showImmediately();
    }

    public final boolean hasDrawerIndicator()
    {
        return true;
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onBackPressed()
    {
        startActivity(uriRegistry.createIntent(2, new Object[0]));
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (selectedSubLabelOrdinal != null)
        {
            bundle.putLong("selected_sub_label", selectedSubLabelOrdinal.longValue());
        }
    }

    protected void sendAnalyticsScreen(long l)
    {
    }

    protected final void setupTabs(List list)
    {
        viewPagerAdapter = new ViewPagerAdapter(list);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setOnPageChangeListener(viewPagerAdapter);
        TabHost tabhost = tabHost;
        int i;
        if (list.size() <= 1)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        tabhost.setVisibility(i);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            Object obj = toolbar;
            float f;
            TextView textview;
            Object obj1;
            if (list.isEmpty())
            {
                f = getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.toolbar_elevation);
            } else
            {
                f = 0.0F;
            }
            ((Toolbar) (obj)).setElevation(f);
        }
        if (list.size() > 1)
        {
            tabHost.clearAllTabs();
            tabLabels.clear();
            for (i = 0; i < list.size(); i++)
            {
                obj1 = (TabSpec)list.get(i);
                obj = getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.tab_indicator, tabWidget, false);
                textview = (TextView)Views.findViewById(((View) (obj)), 0x1020016);
                textview.setText(((TabSpec) (obj1)).title);
                obj1 = tabHost.newTabSpec(Integer.toString(i));
                ((android.widget.TabHost.TabSpec) (obj1)).setContent(new EmptyTabFactory());
                ((android.widget.TabHost.TabSpec) (obj1)).setIndicator(((View) (obj)));
                tabLabels.add(textview);
                tabHost.addTab(((android.widget.TabHost.TabSpec) (obj1)));
            }

            tabHost.setOnTabChangedListener(new android.widget.TabHost.OnTabChangeListener() {

                final WobListActivity this$0;

                public final void onTabChanged(String s)
                {
                    int j = Integer.parseInt(s);
                    viewPager.setCurrentItem(j);
                    highLightSelectedTabs(j);
                }

            
            {
                this$0 = WobListActivity.this;
                super();
            }
            });
            boolean flag = false;
            if (selectedSubLabelOrdinal != null)
            {
                flag = viewPagerAdapter.selectLabel(selectedSubLabelOrdinal.longValue());
            }
            if (!flag)
            {
                selectedSubLabelOrdinal = Long.valueOf(((TabSpec)list.get(0)).labelOrdinal);
                highLightSelectedTabs(0);
            }
            sendAnalyticsScreen(selectedSubLabelOrdinal.longValue());
            return;
        } else
        {
            sendAnalyticsScreen(((TabSpec)list.get(0)).labelOrdinal);
            return;
        }
    }





/*
    static Long access$402(WobListActivity woblistactivity, Long long1)
    {
        woblistactivity.selectedSubLabelOrdinal = long1;
        return long1;
    }

*/

}
