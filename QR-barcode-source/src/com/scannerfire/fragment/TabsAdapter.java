// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

public class TabsAdapter extends FragmentPagerAdapter
    implements android.widget.TabHost.OnTabChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
{
    static class DummyTabFactory
        implements android.widget.TabHost.TabContentFactory
    {

        private final Context mContext;

        public View createTabContent(String s)
        {
            s = new View(mContext);
            s.setMinimumWidth(0);
            s.setMinimumHeight(0);
            return s;
        }

        public DummyTabFactory(Context context)
        {
            mContext = context;
        }
    }

    static final class TabInfo
    {

        private final Bundle args;
        private final Class clss;
        private final String tag;



        TabInfo(String s, Class class1, Bundle bundle)
        {
            tag = s;
            clss = class1;
            args = bundle;
        }
    }


    private final Context mContext;
    private final TabHost mTabHost;
    private final ArrayList mTabs = new ArrayList();
    private final ViewPager mViewPager;

    public TabsAdapter(FragmentActivity fragmentactivity, TabHost tabhost, ViewPager viewpager)
    {
        super(fragmentactivity.getSupportFragmentManager());
        mContext = fragmentactivity;
        mTabHost = tabhost;
        mViewPager = viewpager;
        mTabHost.setOnTabChangedListener(this);
        mViewPager.setAdapter(this);
        mViewPager.setOnPageChangeListener(this);
    }

    public void addTab(android.widget.TabHost.TabSpec tabspec, Class class1, Bundle bundle, String s)
    {
        tabspec.setContent(new DummyTabFactory(mContext));
        class1 = new TabInfo(tabspec.getTag(), class1, bundle);
        mTabs.add(class1);
        mTabHost.addTab(tabspec);
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return mTabs.size();
    }

    public Fragment getItem(int i)
    {
        TabInfo tabinfo = (TabInfo)mTabs.get(i);
        return Fragment.instantiate(mContext, tabinfo.clss.getName(), tabinfo.args);
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        TabWidget tabwidget = mTabHost.getTabWidget();
        int j = tabwidget.getDescendantFocusability();
        tabwidget.setDescendantFocusability(0x60000);
        mTabHost.setCurrentTab(i);
        tabwidget.setDescendantFocusability(j);
    }

    public void onTabChanged(String s)
    {
        int i = mTabHost.getCurrentTab();
        mViewPager.setCurrentItem(i);
    }
}
