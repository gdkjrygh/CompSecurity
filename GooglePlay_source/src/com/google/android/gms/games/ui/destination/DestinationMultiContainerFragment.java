// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter;
import com.google.android.gms.games.ui.util.InboxCountAdapter;
import com.google.android.gms.games.ui.util.TabConfig;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.finsky.PlayTabContainer;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationContainerFragment, LoggablePage

public abstract class DestinationMultiContainerFragment extends DestinationContainerFragment
    implements InboxCountAdapter
{

    public GamesFragmentPagerAdapter mPagerAdapter;
    private PlayHeaderListTabStrip mPlayheaderListTabStrip;
    private final TabConfig mTabConfig;
    private PlayTabContainer mTabContainer;
    public ViewPager mViewPager;

    public DestinationMultiContainerFragment(TabConfig tabconfig, int i)
    {
        super(i);
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

            final DestinationMultiContainerFragment this$0;

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
                this$0 = DestinationMultiContainerFragment.this;
                super(context);
            }
        };
        return mPlayheaderListTabStrip;
    }

    public int getPageInboxCount(int i)
    {
        return -1;
    }

    public final int getPlayHeaderTabMode()
    {
        return 0;
    }

    public final boolean hasViewPager()
    {
        return true;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int j;
label0:
        {
            layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
            mViewPager = (ViewPager)layoutinflater.findViewById(0x7f0d01b7);
            Asserts.checkNotNull(mViewPager, "layout resource did not include include a ViewPager with id 'pager'");
            mPagerAdapter = new GamesFragmentPagerAdapter((GamesFragmentActivity)super.mActivity, getChildFragmentManager(), mTabConfig.tabSpecs, null, this);
            if (hasPlayHeader())
            {
                mPagerAdapter.mFragmentCreatedListener = new com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.OnFragmentCreatedListener() {

                    final DestinationMultiContainerFragment this$0;

                    public final void onFragmentCreated(Fragment fragment, int l)
                    {
                        if (mViewPager != null && l == mViewPager.mCurItem)
                        {
                            attachScrollListener(fragment);
                        }
                    }

            
            {
                this$0 = DestinationMultiContainerFragment.this;
                super();
            }
                };
            }
            mViewPager.setAdapter(mPagerAdapter);
            mTabContainer = (PlayTabContainer)layoutinflater.findViewById(0x7f0d01f0);
            if (!hasPlayHeader())
            {
                int i = getResources().getColor(0x7f0b0255);
                mTabContainer.setSelectedIndicatorColor(i);
                mTabContainer.setViewPager(mViewPager);
                viewgroup = new com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.GamesFragmentPageChangeListener(mViewPager, mPagerAdapter, mTabContainer);
                mViewPager.mOnPageChangeListener = viewgroup;
            } else
            {
                mTabContainer.setVisibility(8);
                Asserts.checkState(layoutinflater instanceof PlayHeaderListLayout);
                viewgroup = (PlayHeaderListLayout)layoutinflater;
                viewgroup.mExternalPageChangeListener = new com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.GamesFragmentPageChangeListener(mViewPager, mPagerAdapter, mTabContainer) {

                    final DestinationMultiContainerFragment this$0;

                    public final void onPageSelected(int l)
                    {
                        super.onPageSelected(l);
                        attachScrollListener(l);
                        logClick(l);
                    }

            
            {
                this$0 = DestinationMultiContainerFragment.this;
                super(viewpager, gamesfragmentpageradapter, playtabcontainer);
            }
                };
                ((PlayHeaderListLayout) (viewgroup)).mTabStrip.notifyPagerAdapterChanged();
            }
            if (bundle == null)
            {
                j = mTabConfig.defaultTabIndex;
                int k = mViewPager.mCurItem;
                mViewPager.setCurrentItem(j, false);
                if (hasPlayHeader())
                {
                    break label0;
                }
                mTabContainer.onPageSelected(j);
            }
            return layoutinflater;
        }
        attachScrollListener(j);
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        int i = mViewPager.mCurItem;
        Fragment fragment = mPagerAdapter.getFragmentAt(i);
        if (fragment instanceof LoggablePage)
        {
            ((LoggablePage)fragment).logPageView(getLogger());
        }
    }



}
