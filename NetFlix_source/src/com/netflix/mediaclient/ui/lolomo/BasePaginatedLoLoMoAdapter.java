// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import android.view.View;
import android.widget.LinearLayout;
import com.netflix.mediaclient.ui.lomo.LoMoViewPager;
import com.netflix.mediaclient.util.AndroidUtils;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            BaseLoLoMoAdapter, LoLoMoFrag

public abstract class BasePaginatedLoLoMoAdapter extends BaseLoLoMoAdapter
{

    protected static final String TAG = "BasePaginatedLoLoMoAdapter";
    private final Set pagerSet = new HashSet();

    public BasePaginatedLoLoMoAdapter(LoLoMoFrag lolomofrag, String s)
    {
        super(lolomofrag, s);
    }

    private boolean isAnyPagerLoading()
    {
        for (Iterator iterator = pagerSet.iterator(); iterator.hasNext();)
        {
            if (((LoMoViewPager)iterator.next()).isLoading())
            {
                return true;
            }
        }

        return false;
    }

    protected BaseLoLoMoAdapter.LoMoRowContent createRowContent(LinearLayout linearlayout, View view)
    {
        CirclePageIndicator circlepageindicator = new CirclePageIndicator(activity);
        view = new LoMoViewPager(frag, manager, circlepageindicator, viewRecycler, view, isGenreList());
        pagerSet.add(view);
        view.setFocusable(false);
        linearlayout.addView(view);
        circlepageindicator.setRadius(AndroidUtils.dipToPixels(activity, 4));
        circlepageindicator.setPageColor(0x60ffffff);
        circlepageindicator.setStrokeColor(0);
        circlepageindicator.setStrokeWidth(0.0F);
        circlepageindicator.setOnPageChangeListener(view.getOnPageChangeListener());
        circlepageindicator.setViewPager(view);
        circlepageindicator.setVisibility(8);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.topMargin = (int)(2.0F * circlepageindicator.getRadius() + (float)circlepageindicator.getPaddingTop() + (float)circlepageindicator.getPaddingBottom() + 1.0F) * -2;
        linearlayout.addView(circlepageindicator, layoutparams);
        return view;
    }

    public boolean isLoadingData()
    {
        return super.isLoadingData() || isAnyPagerLoading();
    }

    public void onDestroyView()
    {
        for (Iterator iterator = pagerSet.iterator(); iterator.hasNext(); ((LoMoViewPager)iterator.next()).destroy()) { }
    }

    public void onPause()
    {
        for (Iterator iterator = pagerSet.iterator(); iterator.hasNext(); ((LoMoViewPager)iterator.next()).onPause()) { }
    }

    public void onResume()
    {
        for (Iterator iterator = pagerSet.iterator(); iterator.hasNext(); ((LoMoViewPager)iterator.next()).onResume()) { }
    }
}
