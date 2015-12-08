// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

// Referenced classes of package com.viewpagerindicator:
//            PageIndicator, IcsLinearLayout, IconPagerAdapter

public class TabPageIndicator extends HorizontalScrollView
    implements PageIndicator
{
    public static interface OnTabReselectedListener
    {

        public abstract void onTabReselected(int i);
    }

    private class TabView extends TextView
    {

        private int mIndex;
        final TabPageIndicator this$0;

        public int getIndex()
        {
            return mIndex;
        }

        public void onMeasure(int i, int j)
        {
            super.onMeasure(i, j);
            if (mMaxTabWidth > 0 && getMeasuredWidth() > mMaxTabWidth)
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(mMaxTabWidth, 0x40000000), j);
            }
        }


/*
        static int access$302(TabView tabview, int i)
        {
            tabview.mIndex = i;
            return i;
        }

*/

        public TabView(Context context)
        {
            this$0 = TabPageIndicator.this;
            super(context, null, R.attr.vpiTabPageIndicatorStyle);
        }
    }


    private static final CharSequence EMPTY_TITLE = "";
    private android.support.v4.view.ViewPager.OnPageChangeListener mListener;
    private int mMaxTabWidth;
    private int mSelectedTabIndex;
    private final android.view.View.OnClickListener mTabClickListener;
    private final IcsLinearLayout mTabLayout;
    private OnTabReselectedListener mTabReselectedListener;
    private Runnable mTabSelector;
    private ViewPager mViewPager;

    public TabPageIndicator(Context context)
    {
        this(context, null);
    }

    public TabPageIndicator(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mTabClickListener = new android.view.View.OnClickListener() {

            final TabPageIndicator this$0;

            public void onClick(View view)
            {
                view = (TabView)view;
                int i = mViewPager.getCurrentItem();
                int j = view.getIndex();
                mViewPager.setCurrentItem(j);
                if (i == j && mTabReselectedListener != null)
                {
                    mTabReselectedListener.onTabReselected(j);
                }
            }

            
            {
                this$0 = TabPageIndicator.this;
                super();
            }
        };
        setHorizontalScrollBarEnabled(false);
        mTabLayout = new IcsLinearLayout(context, R.attr.vpiTabPageIndicatorStyle);
        addView(mTabLayout, new android.view.ViewGroup.LayoutParams(-2, -1));
    }

    private void addTab(int i, CharSequence charsequence, int j)
    {
        TabView tabview = new TabView(getContext());
        tabview.mIndex = i;
        tabview.setFocusable(true);
        tabview.setOnClickListener(mTabClickListener);
        tabview.setText(charsequence);
        if (j != 0)
        {
            tabview.setCompoundDrawablesWithIntrinsicBounds(j, 0, 0, 0);
        }
        mTabLayout.addView(tabview, new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F));
    }

    private void animateToTab(int i)
    {
        final View tabView = mTabLayout.getChildAt(i);
        if (mTabSelector != null)
        {
            removeCallbacks(mTabSelector);
        }
        mTabSelector = new Runnable() {

            final TabPageIndicator this$0;
            final View val$tabView;

            public void run()
            {
                int j = tabView.getLeft();
                int k = (getWidth() - tabView.getWidth()) / 2;
                smoothScrollTo(j - k, 0);
                mTabSelector = null;
            }

            
            {
                this$0 = TabPageIndicator.this;
                tabView = view;
                super();
            }
        };
        post(mTabSelector);
    }

    public void notifyDataSetChanged()
    {
        mTabLayout.removeAllViews();
        PagerAdapter pageradapter = mViewPager.getAdapter();
        IconPagerAdapter iconpageradapter = null;
        if (pageradapter instanceof IconPagerAdapter)
        {
            iconpageradapter = (IconPagerAdapter)pageradapter;
        }
        int k = pageradapter.getCount();
        for (int i = 0; i < k; i++)
        {
            CharSequence charsequence1 = pageradapter.getPageTitle(i);
            CharSequence charsequence = charsequence1;
            if (charsequence1 == null)
            {
                charsequence = EMPTY_TITLE;
            }
            int j = 0;
            if (iconpageradapter != null)
            {
                j = iconpageradapter.getIconResId(i);
            }
            addTab(i, charsequence, j);
        }

        if (mSelectedTabIndex > k)
        {
            mSelectedTabIndex = k - 1;
        }
        setCurrentItem(mSelectedTabIndex);
        requestLayout();
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mTabSelector != null)
        {
            post(mTabSelector);
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mTabSelector != null)
        {
            removeCallbacks(mTabSelector);
        }
    }

    public void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(i);
        int l;
        boolean flag;
        if (k == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        l = mTabLayout.getChildCount();
        if (l > 1 && (k == 0x40000000 || k == 0x80000000))
        {
            if (l > 2)
            {
                mMaxTabWidth = (int)((float)android.view.View.MeasureSpec.getSize(i) * 0.4F);
            } else
            {
                mMaxTabWidth = android.view.View.MeasureSpec.getSize(i) / 2;
            }
        } else
        {
            mMaxTabWidth = -1;
        }
        k = getMeasuredWidth();
        super.onMeasure(i, j);
        i = getMeasuredWidth();
        if (flag && k != i)
        {
            setCurrentItem(mSelectedTabIndex);
        }
    }

    public void onPageScrollStateChanged(int i)
    {
        if (mListener != null)
        {
            mListener.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
        if (mListener != null)
        {
            mListener.onPageScrolled(i, f, j);
        }
    }

    public void onPageSelected(int i)
    {
        setCurrentItem(i);
        if (mListener != null)
        {
            mListener.onPageSelected(i);
        }
    }

    public void setCurrentItem(int i)
    {
        if (mViewPager == null)
        {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        mSelectedTabIndex = i;
        mViewPager.setCurrentItem(i);
        int k = mTabLayout.getChildCount();
        int j = 0;
        while (j < k) 
        {
            View view = mTabLayout.getChildAt(j);
            boolean flag;
            if (j == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            if (flag)
            {
                animateToTab(i);
            }
            j++;
        }
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        mListener = onpagechangelistener;
    }

    public void setOnTabReselectedListener(OnTabReselectedListener ontabreselectedlistener)
    {
        mTabReselectedListener = ontabreselectedlistener;
    }

    public void setViewPager(ViewPager viewpager)
    {
        if (mViewPager == viewpager)
        {
            return;
        }
        if (mViewPager != null)
        {
            mViewPager.setOnPageChangeListener(null);
        }
        if (viewpager.getAdapter() == null)
        {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        } else
        {
            mViewPager = viewpager;
            viewpager.setOnPageChangeListener(this);
            notifyDataSetChanged();
            return;
        }
    }

    public void setViewPager(ViewPager viewpager, int i)
    {
        setViewPager(viewpager);
        setCurrentItem(i);
    }





/*
    static Runnable access$202(TabPageIndicator tabpageindicator, Runnable runnable)
    {
        tabpageindicator.mTabSelector = runnable;
        return runnable;
    }

*/

}
