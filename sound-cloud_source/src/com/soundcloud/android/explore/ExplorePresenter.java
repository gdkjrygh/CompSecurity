// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

// Referenced classes of package com.soundcloud.android.explore:
//            ExplorePagerAdapterFactory, ExplorePagerAdapter, ExplorePagerScreenListener

class ExplorePresenter extends DefaultActivityLightCycle
{

    private final ExplorePagerAdapterFactory adapterFactory;
    private ViewPager pager;
    private ExplorePagerAdapter pagerAdapter;
    private final Resources resources;
    private final ExplorePagerScreenListener screenListener;

    public ExplorePresenter(Resources resources1, ExplorePagerAdapterFactory explorepageradapterfactory, ExplorePagerScreenListener explorepagerscreenlistener)
    {
        resources = resources1;
        adapterFactory = explorepageradapterfactory;
        screenListener = explorepagerscreenlistener;
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        pager = (ViewPager)appcompatactivity.findViewById(0x7f0f00b7);
        pager.setPageMarginDrawable(0x7f0200fa);
        pager.setPageMargin(resources.getDimensionPixelOffset(0x7f0b0110));
        pagerAdapter = adapterFactory.create(appcompatactivity.getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        ((TabLayout)appcompatactivity.findViewById(0x7f0f0169)).setupWithViewPager(pager);
        pager.addOnPageChangeListener(screenListener);
        if (bundle == null)
        {
            pager.setCurrentItem(1);
        }
    }

    public volatile void onDestroy(Activity activity)
    {
        onDestroy((AppCompatActivity)activity);
    }

    public void onDestroy(AppCompatActivity appcompatactivity)
    {
        pagerAdapter = null;
        pager = null;
    }
}
