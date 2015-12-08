// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.ui:
//            SlidingTabStrip

public class SlidingTabLayout extends HorizontalScrollView
{
    private class InternalViewPagerListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        private int mScrollState;
        final SlidingTabLayout this$0;

        public void onPageScrollStateChanged(int i)
        {
            mScrollState = i;
            if (mViewPagerPageChangeListener != null)
            {
                mViewPagerPageChangeListener.onPageScrollStateChanged(i);
            }
        }

        public void onPageScrolled(int i, float f, int j)
        {
            int k = mTabStrip.getChildCount();
            if (k != 0 && i >= 0 && i < k)
            {
                mTabStrip.onViewPagerPageChanged(i, f);
                View view = mTabStrip.getChildAt(i);
                int l;
                if (view != null)
                {
                    l = (int)((float)view.getWidth() * f);
                } else
                {
                    l = 0;
                }
                scrollToTab(i, l);
                if (mViewPagerPageChangeListener != null)
                {
                    mViewPagerPageChangeListener.onPageScrolled(i, f, j);
                    return;
                }
            }
        }

        public void onPageSelected(int i)
        {
            if (mScrollState == 0)
            {
                mTabStrip.onViewPagerPageChanged(i, 0.0F);
                scrollToTab(i, 0);
            }
            int j = 0;
            while (j < mTabStrip.getChildCount()) 
            {
                View view = mTabStrip.getChildAt(j);
                boolean flag;
                if (i == j)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
                j++;
            }
            if (mViewPagerPageChangeListener != null)
            {
                mViewPagerPageChangeListener.onPageSelected(i);
            }
        }

        private InternalViewPagerListener()
        {
            this$0 = SlidingTabLayout.this;
            super();
        }

    }

    private class TabClickListener
        implements android.view.View.OnClickListener
    {

        final SlidingTabLayout this$0;

        public void onClick(View view)
        {
            int i = 0;
            do
            {
label0:
                {
                    if (i < mTabStrip.getChildCount())
                    {
                        if (view != mTabStrip.getChildAt(i))
                        {
                            break label0;
                        }
                        mViewPager.setCurrentItem(i);
                    }
                    return;
                }
                i++;
            } while (true);
        }

        private TabClickListener()
        {
            this$0 = SlidingTabLayout.this;
            super();
        }

    }

    public static interface TabColorizer
    {

        public abstract int getDividerColor(int i);

        public abstract int getIndicatorColor(int i);
    }


    private static final int TAB_VIEW_PADDING_DIPS = 16;
    private static final int TAB_VIEW_TEXT_SIZE_SP = 12;
    private static final int TITLE_OFFSET_DIPS = 24;
    private final SlidingTabStrip mTabStrip;
    private int mTabViewLayoutId;
    private int mTabViewTextViewId;
    private int mTitleOffset;
    private ViewPager mViewPager;
    private android.support.v4.view.ViewPager.OnPageChangeListener mViewPagerPageChangeListener;
    private int textSelector;
    private boolean viewPagerSet;

    public SlidingTabLayout(Context context)
    {
        this(context, null);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        mTitleOffset = (int)(24F * getResources().getDisplayMetrics().density);
        mTabStrip = new SlidingTabStrip(context);
        addView(mTabStrip, -1, -2);
    }

    private void populateTabStrip()
    {
        PagerAdapter pageradapter = mViewPager.getAdapter();
        TabClickListener tabclicklistener = new TabClickListener();
        for (int i = 0; i < pageradapter.getCount(); i++)
        {
            Object obj = null;
            TextView textview = null;
            if (mTabViewLayoutId != 0)
            {
                obj = LayoutInflater.from(getContext()).inflate(mTabViewLayoutId, mTabStrip, false);
                textview = (TextView)((View) (obj)).findViewById(mTabViewTextViewId);
            }
            Object obj1 = obj;
            if (obj == null)
            {
                obj1 = createDefaultTabView(getContext());
            }
            obj = textview;
            if (textview == null)
            {
                obj = textview;
                if (android/widget/TextView.isInstance(obj1))
                {
                    TextView textview1 = (TextView)obj1;
                    obj = textview1;
                    if (textSelector != 0)
                    {
                        textview1.setTextColor(getResources().getColorStateList(textSelector));
                        obj = textview1;
                    }
                }
            }
            ((TextView) (obj)).setText(pageradapter.getPageTitle(i));
            ((View) (obj1)).setOnClickListener(tabclicklistener);
            mTabStrip.addView(((View) (obj1)));
            if (i == mViewPager.getCurrentItem())
            {
                ((View) (obj1)).setSelected(true);
            }
        }

    }

    private void scrollToTab(int i, int j)
    {
        int k = mTabStrip.getChildCount();
        View view;
        if (k != 0 && i >= 0 && i < k)
        {
            if ((view = mTabStrip.getChildAt(i)) != null)
            {
label0:
                {
                    int l = view.getLeft() + j;
                    if (i <= 0)
                    {
                        i = l;
                        if (j <= 0)
                        {
                            break label0;
                        }
                    }
                    i = l - mTitleOffset;
                }
                scrollTo(i, 0);
                return;
            }
        }
    }

    protected TextView createDefaultTabView(Context context)
    {
        context = new TextView(context);
        context.setGravity(17);
        context.setTextSize(2, 12F);
        context.setTypeface(Typeface.DEFAULT_BOLD);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            TypedValue typedvalue = new TypedValue();
            getContext().getTheme().resolveAttribute(0x101030e, typedvalue, true);
            context.setBackgroundResource(typedvalue.resourceId);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            context.setAllCaps(true);
        }
        int i = (int)(16F * getResources().getDisplayMetrics().density);
        context.setPadding(i, i, i, i);
        return context;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mViewPager != null)
        {
            scrollToTab(mViewPager.getCurrentItem(), 0);
        }
    }

    public void setCustomTabColorizer(TabColorizer tabcolorizer)
    {
        mTabStrip.setCustomTabColorizer(tabcolorizer);
    }

    public void setCustomTabView(int i, int j)
    {
        mTabViewLayoutId = i;
        mTabViewTextViewId = j;
    }

    public void setCustomTextSelector(int i)
    {
        if (viewPagerSet)
        {
            Timber.w("Set custom text selector before calling `setViewPager(ViewPager pager)`", new Object[0]);
        }
        textSelector = i;
    }

    public transient void setDividerColors(int ai[])
    {
        mTabStrip.setDividerColors(ai);
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        mViewPagerPageChangeListener = onpagechangelistener;
    }

    public transient void setSelectedIndicatorColors(int ai[])
    {
        mTabStrip.setSelectedIndicatorColors(ai);
    }

    public void setViewPager(ViewPager viewpager)
    {
        mTabStrip.removeAllViews();
        mViewPager = viewpager;
        if (viewpager != null)
        {
            viewPagerSet = true;
            viewpager.setOnPageChangeListener(new InternalViewPagerListener());
            populateTabStrip();
        }
    }




}
