// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.progress;

import android.content.Context;
import android.support.v4.view.ModifiedViewPager;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.base.Constants;
import com.pinterest.ui.text.IconView;

public class DotIndicatorView extends LinearLayout
    implements android.support.v4.view.ModifiedViewPager.OnPageChangeListener, android.view.View.OnClickListener
{

    private float _alphaOff;
    private float _alphaOn;
    private int _colorOff;
    private int _colorOn;
    private android.support.v4.view.ModifiedViewPager.OnPageChangeListener _pageChangeListener;
    private ModifiedViewPager _viewPager;

    public DotIndicatorView(Context context)
    {
        this(context, null);
    }

    public DotIndicatorView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _colorOn = 0x7f0e009c;
        _colorOff = 0x7f0e0024;
        _alphaOn = 1.0F;
        _alphaOff = 0.3F;
        init();
    }

    private void activateIndicator(int i)
    {
        resetIndicators();
        IconView iconview = (IconView)findViewWithTag(Integer.valueOf(i));
        iconview.setTint(_colorOn);
        iconview.setAlpha(_alphaOn);
    }

    private void init()
    {
    }

    private void initIndicators()
    {
        removeAllViews();
        int i;
        int j;
        if (_viewPager != null && _viewPager.getAdapter() != null)
        {
            i = _viewPager.getAdapter().getCount();
        } else
        {
            i = 0;
        }
        for (j = 0; j < i; j++)
        {
            IconView iconview = new IconView(getContext());
            iconview.setTint(_colorOff);
            iconview.setAlpha(_alphaOff);
            iconview.setImageResource(0x7f020130);
            iconview.setPadding(0, 0, Constants.MARGIN_HALF, 0);
            iconview.setTag(Integer.valueOf(j));
            iconview.setOnClickListener(this);
            addView(iconview);
        }

        if (getChildCount() > 0)
        {
            activateIndicator(0);
        }
    }

    private void resetIndicators()
    {
        for (int i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            if (view instanceof IconView)
            {
                ((IconView)view).setTint(_colorOff);
                view.setAlpha(_alphaOff);
            }
        }

    }

    public void notifyDataSetChanged()
    {
        removeAllViews();
        initIndicators();
    }

    public void onClick(View view)
    {
        int i = ((Integer)view.getTag()).intValue();
        _viewPager.setCurrentItem(i);
    }

    public void onPageScrollStateChanged(int i)
    {
        if (_pageChangeListener != null)
        {
            _pageChangeListener.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
        if (_pageChangeListener != null)
        {
            _pageChangeListener.onPageScrolled(i, f, j);
        }
    }

    public void onPageSelected(int i)
    {
        if (_pageChangeListener != null)
        {
            _pageChangeListener.onPageSelected(i);
        }
        activateIndicator(i);
    }

    public void setColorOff(int i, float f)
    {
        _colorOff = i;
        _alphaOff = f;
        initIndicators();
    }

    public void setColorOn(int i, float f)
    {
        _colorOn = i;
        _alphaOn = f;
        initIndicators();
    }

    public void setOnPageChangeListener(android.support.v4.view.ModifiedViewPager.OnPageChangeListener onpagechangelistener)
    {
        _pageChangeListener = onpagechangelistener;
    }

    public void setUseWhiteIndicators(boolean flag)
    {
        int j = 0x7f0e00bf;
        int i;
        if (flag)
        {
            i = 0x7f0e00bf;
        } else
        {
            i = 0x7f0e0024;
        }
        _colorOff = i;
        if (flag)
        {
            i = j;
        } else
        {
            i = 0x7f0e009c;
        }
        _colorOn = i;
    }

    public void setViewPager(ModifiedViewPager modifiedviewpager)
    {
        _viewPager = modifiedviewpager;
        if (_viewPager != null)
        {
            _viewPager.setOnPageChangeListener(this);
        }
        initIndicators();
    }
}
