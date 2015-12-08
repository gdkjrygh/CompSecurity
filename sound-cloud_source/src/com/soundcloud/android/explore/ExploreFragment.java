// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import dagger.b;

// Referenced classes of package com.soundcloud.android.explore:
//            ExplorePagerAdapterFactory, ExplorePagerAdapter, ExplorePagerScreenListener

public class ExploreFragment extends Fragment
{

    private ViewPager pager;
    private ExplorePagerAdapter pagerAdapter;
    ExplorePagerAdapterFactory pagerAdapterFactory;
    Resources resources;
    ExplorePagerScreenListener screenListener;

    public ExploreFragment()
    {
        setRetainInstance(true);
        SoundCloudApplication.getObjectGraph().a(this);
    }

    ExploreFragment(Resources resources1, ExplorePagerAdapterFactory explorepageradapterfactory, ExplorePagerScreenListener explorepagerscreenlistener)
    {
        resources = resources1;
        pagerAdapterFactory = explorepageradapterfactory;
        screenListener = explorepagerscreenlistener;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030066, viewgroup, false);
    }

    public void onDestroyView()
    {
        pager = null;
        pagerAdapter = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        pager = (ViewPager)view.findViewById(0x7f0f00b7);
        pager.setPageMarginDrawable(0x7f0200fa);
        pager.setPageMargin(resources.getDimensionPixelOffset(0x7f0b0110));
        pagerAdapter = pagerAdapterFactory.create(getChildFragmentManager());
        pager.setAdapter(pagerAdapter);
        ((TabLayout)view.findViewById(0x7f0f0169)).setupWithViewPager(pager);
        pager.addOnPageChangeListener(screenListener);
        if (bundle == null)
        {
            pager.setCurrentItem(1);
        }
    }
}
