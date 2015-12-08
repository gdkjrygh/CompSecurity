// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter;
import com.google.android.gms.games.ui.util.TabConfig;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.finsky.PlayTabContainer;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationFragmentActivity, LoggablePage, DestinationFragmentActivityBase

public abstract class DestinationMultiFragmentActivity extends DestinationFragmentActivity
{

    public GamesFragmentPagerAdapter mPagerAdapter;
    private PlayHeaderListTabStrip mPlayheaderListTabStrip;
    private final TabConfig mTabConfig;
    private PlayTabContainer mTabContainer;
    public ViewPager mViewPager;

    public DestinationMultiFragmentActivity(TabConfig tabconfig, int i, int j)
    {
        this(tabconfig, i, j, false);
    }

    public DestinationMultiFragmentActivity(TabConfig tabconfig, int i, int j, boolean flag)
    {
        super(i, j, flag);
        Asserts.checkNotNull(tabconfig);
        mTabConfig = tabconfig;
    }

    private void attachScrollListener(int i)
    {
        attachScrollListener(mPagerAdapter.getFragmentAt(i));
    }

    private void attachScrollListener(Fragment fragment)
    {
        if (fragment instanceof GamesHeaderRecyclerViewFragment)
        {
            ((GamesHeaderRecyclerViewFragment)fragment).attachScrollListener(mPlayHeaderListLayout);
        }
    }

    public final PlayHeaderListTabStrip getCustomTabStrip$78490773(Context context)
    {
        mPlayheaderListTabStrip = new PlayHeaderListTabStrip(context) {

            final DestinationMultiFragmentActivity this$0;

            protected final void bindTabViewData(View view, PagerAdapter pageradapter, int i)
            {
                view.setOnClickListener(makeOnTabClickListener(i));
                UiUtils.bindTabViewData(getResources(), view, pageradapter, i);
            }

            protected final View makeTabView$7ed5ff07(LayoutInflater layoutinflater, ViewGroup viewgroup)
            {
                return layoutinflater.inflate(0x7f0400b6, viewgroup, false);
            }

            
            {
                this$0 = DestinationMultiFragmentActivity.this;
                super(context);
            }
        };
        return mPlayheaderListTabStrip;
    }

    public void onAttachFragment(Fragment fragment)
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mViewPager = (ViewPager)findViewById(0x7f0d01b7);
        Asserts.checkNotNull(mViewPager, "layout resource did not include include a ViewPager with id 'pager'");
        mViewPager.setOffscreenPageLimit(2);
        mPagerAdapter = new GamesFragmentPagerAdapter(this, super.mFragments, mTabConfig.tabSpecs, null);
        if (hasPlayHeader())
        {
            mPagerAdapter.mFragmentCreatedListener = new com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.OnFragmentCreatedListener() {

                final DestinationMultiFragmentActivity this$0;

                public final void onFragmentCreated(Fragment fragment, int j)
                {
                    if (mViewPager != null && j == mViewPager.mCurItem)
                    {
                        attachScrollListener(fragment);
                    }
                }

            
            {
                this$0 = DestinationMultiFragmentActivity.this;
                super();
            }
            };
        }
        mViewPager.setAdapter(mPagerAdapter);
        mTabContainer = (PlayTabContainer)findViewById(0x7f0d01f0);
        if (!hasPlayHeader())
        {
            int i = getResources().getColor(0x7f0b0255);
            mTabContainer.setSelectedIndicatorColor(i);
            mTabContainer.setViewPager(mViewPager);
            mViewPager.mOnPageChangeListener = new com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.GamesFragmentPageChangeListener(mViewPager, mPagerAdapter, mTabContainer);
        } else
        {
            mTabContainer.setVisibility(8);
            Asserts.checkNotNull(mPlayHeaderListLayout);
            mPlayHeaderListLayout.mTabStrip.notifyPagerAdapterChanged();
            mPlayHeaderListLayout.mExternalPageChangeListener = new com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.GamesFragmentPageChangeListener(mViewPager, mPagerAdapter, mTabContainer) {

                final DestinationMultiFragmentActivity this$0;

                public final void onPageSelected(int j)
                {
                    super.onPageSelected(j);
                    attachScrollListener(j);
                }

            
            {
                this$0 = DestinationMultiFragmentActivity.this;
                super(viewpager, gamesfragmentpageradapter, playtabcontainer);
            }
            };
        }
        if (bundle == null)
        {
            setCurrentTab(mTabConfig.defaultTabIndex, false);
        }
    }

    public void onResume()
    {
        super.onResume();
        int i = mViewPager.mCurItem;
        Fragment fragment = mPagerAdapter.getFragmentAt(i);
        if (fragment instanceof LoggablePage)
        {
            ((LoggablePage)fragment).logPageView(super.mPlayLogger);
        }
    }

    public final void setCurrentTab(int i, boolean flag)
    {
        int j = mViewPager.mCurItem;
        if (i >= mPagerAdapter.getCount())
        {
            GamesLog.w("DestMultiFragActivity", "setCurrentTab(): new tab index is bigger than the number of tabs. We must be in a rotation without any tabs. disregarding it.");
            return;
        }
        mViewPager.setCurrentItem(i, false);
        if (!hasPlayHeader())
        {
            mTabContainer.onPageSelected(i);
            return;
        } else
        {
            attachScrollListener(i);
            return;
        }
    }



}
