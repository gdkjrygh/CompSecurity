// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.os.Bundle;
import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.view.ModifiedViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.findfriend.adapter.FindFriendsViewAdapter;
import com.pinterest.activity.task.fragment.ViewPagerFragment;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.ui.tab.TabBar;

public class FindFriendsFragment extends ViewPagerFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    TabBar _tabBar;
    private android.support.v4.view.ModifiedViewPager.OnPageChangeListener onPageChanged;
    private com.pinterest.ui.tab.TabBar.Listener onTabChanged;

    public FindFriendsFragment()
    {
        _eventsSubscriber = new _cls1();
        onPageChanged = new _cls2();
        onTabChanged = new _cls3();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300c3;
        _menuId = 0;
        setHasOptionsMenu(Device.hasHardwareMenuKey(Application.context()));
        _viewAdapter = new FindFriendsViewAdapter(getChildFragmentManager());
        _offScreenLimit = _viewAdapter.getCount();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _viewPager.setCurrentItem(0);
        _viewPager.setOnPageChangeListener(onPageChanged);
        _tabBar.setCurrentIndex(0);
        _tabBar.setListener(onTabChanged);
        _actionBar.setTitle(0x7f070294);
        Events.register(_eventsSubscriber, com/pinterest/activity/findfriend/adapter/FindFriendsViewAdapter$InviteTabSwitchEvent, new Class[0]);
    }





    private class _cls2
        implements android.support.v4.view.ModifiedViewPager.OnPageChangeListener
    {

        final FindFriendsFragment this$0;

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int j)
        {
            _tabBar.setPagerScroll(i, f);
        }

        public void onPageSelected(int i)
        {
            _tabBar.setCurrentIndex(i);
            Pinalytics.a(FindFriendsFragment.this);
        }

        _cls2()
        {
            this$0 = FindFriendsFragment.this;
            super();
        }
    }


    private class _cls3
        implements com.pinterest.ui.tab.TabBar.Listener
    {

        final FindFriendsFragment this$0;

        public void onTabReselected(int i)
        {
            scrollActiveFragmentToTop();
            BaseFragment basefragment = getActiveFragment();
            if (basefragment != null)
            {
                basefragment.refresh();
            }
        }

        public void onTabSelected(int i)
        {
            
// JavaClassFileOutputException: get_constant: invalid tag

        _cls3()
        {
            this$0 = FindFriendsFragment.this;
            super();
        }
    }

}
