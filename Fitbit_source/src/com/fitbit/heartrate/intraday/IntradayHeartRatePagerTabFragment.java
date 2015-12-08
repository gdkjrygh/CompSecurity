// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.intraday;

import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.fitbit.ui.charts.ChartFragment;
import com.fitbit.ui.endless.c;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.fonts.a;

public class IntradayHeartRatePagerTabFragment extends ChartFragment
{

    private c a;
    private ViewPager b;
    private PagerTabStrip i;

    public IntradayHeartRatePagerTabFragment()
    {
    }

    protected void a(View view)
    {
        super.a(view);
        b = (ViewPager)view.findViewById(0x7f11009e);
        i = (PagerTabStrip)view.findViewById(0x7f1102b6);
    }

    public void f()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.3F);
        alphaanimation.setDuration(100L);
        alphaanimation.setFillAfter(true);
        i.startAnimation(alphaanimation);
    }

    public void g()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.3F, 1.0F);
        alphaanimation.setDuration(100L);
        alphaanimation.setFillAfter(true);
        i.startAnimation(alphaanimation);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0400ac, viewgroup, false);
    }

    protected void u_()
    {
        super.u_();
        android.support.v4.app.FragmentManager fragmentmanager = getChildFragmentManager();
    /* block-local class not found */
    class a {}

        a = new a(getActivity(), fragmentmanager, l());
        b.setAdapter(a);
        b.setCurrentItem(c.a());
        b.setOnPageChangeListener(new _cls1());
        i.setDrawFullUnderline(false);
        com.fitbit.util.fonts.a.a(getActivity(), i, FitbitFont.g);
    }

    /* member class not found */
    class _cls1 {}

}
