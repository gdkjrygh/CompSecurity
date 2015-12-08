// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;

public class ViewPagerTabLayout extends LinearLayout
{

    View selectedTabIndicator;
    private int selectedTabPosition;
    ViewGroup tabButtonsContainer;
    private ViewPager viewPager;

    public ViewPagerTabLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void deselectAllTabs()
    {
        for (int i = 0; i < tabButtonsContainer.getChildCount(); i++)
        {
            tabButtonsContainer.getChildAt(i).setSelected(false);
        }

    }

    private void setupTabButtonsListeners()
    {
        for (final int childPosition = 0; childPosition < tabButtonsContainer.getChildCount(); childPosition++)
        {
            tabButtonsContainer.getChildAt(childPosition).setOnClickListener(new android.view.View.OnClickListener() {

                final ViewPagerTabLayout this$0;
                final int val$childPosition;

                public void onClick(View view)
                {
                    deselectAllTabs();
                    view.setSelected(true);
                    viewPager.setCurrentItem(childPosition);
                    android.view.ViewGroup.LayoutParams layoutparams = selectedTabIndicator.getLayoutParams();
                    layoutparams.width = view.getWidth();
                    selectedTabIndicator.setLayoutParams(layoutparams);
                    selectedTabIndicator.setX(view.getX());
                }

            
            {
                this$0 = ViewPagerTabLayout.this;
                childPosition = i;
                super();
            }
            });
        }

    }

    private void setupViewPagerListener()
    {
        viewPager.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final ViewPagerTabLayout this$0;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
                selectedTabIndicator.setX(selectedTabIndicator.getWidth() * i + j / viewPager.getAdapter().getCount());
            }

            public void onPageSelected(int i)
            {
                selectTab(i);
            }

            
            {
                this$0 = ViewPagerTabLayout.this;
                super();
            }
        });
    }

    public int getSelectedTab()
    {
        return selectedTabPosition;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            setupTabButtonsListeners();
            return;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (!flag)
        {
            return;
        } else
        {
            android.view.ViewGroup.LayoutParams layoutparams = selectedTabIndicator.getLayoutParams();
            layoutparams.width = getWidth() / tabButtonsContainer.getChildCount();
            selectedTabIndicator.setLayoutParams(layoutparams);
            return;
        }
    }

    public void selectTab(int i)
    {
        selectedTabPosition = i;
        tabButtonsContainer.getChildAt(i).performClick();
    }

    public void setViewPager(ViewPager viewpager)
    {
        viewPager = viewpager;
        setupViewPagerListener();
    }


}
