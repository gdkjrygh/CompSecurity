// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.fitbit.ui.endless.c;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.fonts.a;
import java.util.Date;

// Referenced classes of package com.fitbit.ui.charts:
//            ChartFragment

public abstract class IntradayPagerChartFragment extends ChartFragment
{

    private c a;
    private ViewPager b;
    private PagerTabStrip i;

    public IntradayPagerChartFragment()
    {
    }

    protected abstract c a(Context context, FragmentManager fragmentmanager, Date date);

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

    protected void u_()
    {
        super.u_();
        FragmentManager fragmentmanager = getChildFragmentManager();
        a = a(getActivity(), fragmentmanager, l());
        b.setAdapter(a);
        b.setCurrentItem(c.a());
        b.setOnPageChangeListener(new _cls1());
        i.setDrawFullUnderline(false);
        com.fitbit.util.fonts.a.a(getActivity(), i, FitbitFont.g);
    }

    /* member class not found */
    class _cls1 {}

}
