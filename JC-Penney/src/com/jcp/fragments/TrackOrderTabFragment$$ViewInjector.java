// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.fragments:
//            TrackOrderTabFragment, hd, he, hf

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, TrackOrderTabFragment trackordertabfragment, Object obj)
    {
        View view = (View)ector.ector(obj, 0x7f0e031c, "field 'mViewPager' and method 'onPageSelected'");
        trackordertabfragment.mViewPager = (ViewPager)ector.er(view, 0x7f0e031c, "field 'mViewPager'");
        ((ViewPager)view).setOnPageChangeListener(new hd(this, trackordertabfragment));
        view = (View)ector.ector(obj, 0x7f0e0319, "field 'mTabOne' and method 'onTabOneClick'");
        trackordertabfragment.mTabOne = (TextView)ector.ector(view, 0x7f0e0319, "field 'mTabOne'");
        view.setOnClickListener(new he(this, trackordertabfragment));
        view = (View)ector.ector(obj, 0x7f0e031b, "field 'mTabTwo' and method 'onTabTwoClick'");
        trackordertabfragment.mTabTwo = (TextView)ector.ector(view, 0x7f0e031b, "field 'mTabTwo'");
        view.setOnClickListener(new hf(this, trackordertabfragment));
        trackordertabfragment.mFirstTab = (LinearLayout)ector.b((View)ector.b(obj, 0x7f0e0342, "field 'mFirstTab'"), 0x7f0e0342, "field 'mFirstTab'");
        trackordertabfragment.mSecondTab = (LinearLayout)ector.ab((View)ector.ab(obj, 0x7f0e0343, "field 'mSecondTab'"), 0x7f0e0343, "field 'mSecondTab'");
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (TrackOrderTabFragment)obj, obj1);
    }

    public void reset(TrackOrderTabFragment trackordertabfragment)
    {
        trackordertabfragment.mViewPager = null;
        trackordertabfragment.mTabOne = null;
        trackordertabfragment.mTabTwo = null;
        trackordertabfragment.mFirstTab = null;
        trackordertabfragment.mSecondTab = null;
    }

    public volatile void reset(Object obj)
    {
        reset((TrackOrderTabFragment)obj);
    }

    public ()
    {
    }
}
