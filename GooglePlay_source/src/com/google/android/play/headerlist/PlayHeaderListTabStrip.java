// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Paint;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.libraries.bind.bidi.BidiPagingHelper;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListTabContainer

public class PlayHeaderListTabStrip extends FrameLayout
{
    private final class PageListener extends DataSetObserver
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        private int mScrollState;
        final PlayHeaderListTabStrip this$0;

        public final void onChanged()
        {
            updateTabs();
        }

        public final void onPageScrollStateChanged(int i)
        {
            mScrollState = i;
            if (mExternalPageChangeListener != null)
            {
                mExternalPageChangeListener.onPageScrollStateChanged(i);
            }
            if (mScrollState == 0)
            {
                mEnablePagerScrollSync = true;
            }
        }

        public final void onPageScrolled(int i, float f, int j)
        {
            if (mExternalPageChangeListener != null)
            {
                mExternalPageChangeListener.onPageScrolled(i, f, j);
            }
            if (mEnablePagerScrollSync)
            {
                if ((j = mTabContainer.getChildCount()) != 0 && i >= 0 && i < j)
                {
                    Object obj = mTabContainer;
                    obj.mIndexForSelection = i;
                    obj.mSelectionOffset = f;
                    ((PlayHeaderListTabContainer) (obj)).invalidate();
                    obj = mTabContainer.getChildAt(i);
                    int k;
                    if (obj == null)
                    {
                        j = 0;
                    } else
                    {
                        j = ((View) (obj)).getWidth();
                    }
                    obj = mTabContainer.getChildAt(i + 1);
                    if (obj == null)
                    {
                        k = 0;
                    } else
                    {
                        k = ((View) (obj)).getWidth();
                    }
                    j = (int)((float)(j + k) * f * 0.5F);
                    scrollToVisualPosition(i, j);
                    return;
                }
            }
        }

        public final void onPageSelected(int i)
        {
            if (mExternalPageChangeListener != null)
            {
                mExternalPageChangeListener.onPageSelected(i);
            }
            PlayHeaderListTabContainer playheaderlisttabcontainer = mTabContainer;
            playheaderlisttabcontainer.mIndexForSelection = i;
            playheaderlisttabcontainer.mSelectionOffset = 0.0F;
            playheaderlisttabcontainer.invalidate();
            updateSelectedTab$1385ff();
        }

        private PageListener()
        {
            this$0 = PlayHeaderListTabStrip.this;
            super();
        }

        PageListener(byte byte0)
        {
            this();
        }
    }


    private boolean mAnimateContainerPadding;
    private boolean mEnablePagerScrollSync;
    public android.support.v4.view.ViewPager.OnPageChangeListener mExternalPageChangeListener;
    private int mLastScrollto;
    private int mMaxTabWidthPx;
    final PageListener mPageListener;
    ViewPager mPager;
    private HorizontalScrollView mScrollView;
    private float mSmoothScrollThresholdPx;
    public int mTabBackgroundResId;
    public PlayHeaderListTabContainer mTabContainer;
    boolean mUseHighContrast;
    private WeakReference mWatchingAdapter;

    public PlayHeaderListTabStrip(Context context)
    {
        this(context, null, 0);
    }

    public PlayHeaderListTabStrip(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayHeaderListTabStrip(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mPageListener = new PageListener((byte)0);
        mEnablePagerScrollSync = true;
        mSmoothScrollThresholdPx = getResources().getDisplayMetrics().density * 5F;
    }

    private int getSelectedTabPosition()
    {
        if (mPager != null)
        {
            int i = mPager.mCurItem;
            View view = mTabContainer.getChildAt(i);
            if (view != null)
            {
                return view.getLeft() - mScrollView.getScrollX();
            }
        }
        return 0;
    }

    private void scrollToVisualPosition(int i, int j, boolean flag)
    {
        View view;
        int k;
        if (mScrollView != null)
        {
            if ((k = mTabContainer.getChildCount()) != 0 && i >= 0 && i < k && ((view = mTabContainer.getChildAt(i)) != null && view.getMeasuredWidth() != 0) && (j = ((view.getLeft() + j) - getWidth() / 2) + view.getWidth() / 2) != mLastScrollto)
            {
                if ((float)Math.abs(j - mScrollView.getScrollX()) > mSmoothScrollThresholdPx)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i != 0 && flag)
                {
                    mScrollView.smoothScrollTo(j, 0);
                } else
                {
                    mScrollView.smoothScrollBy(0, 0);
                    mScrollView.smoothScrollBy(0, 0);
                    mScrollView.scrollTo(j, 0);
                }
                mLastScrollto = j;
                return;
            }
        }
    }

    private void updateTabs()
    {
        mTabContainer.removeAllViews();
        PagerAdapter pageradapter;
        if (mPager == null)
        {
            pageradapter = null;
        } else
        {
            pageradapter = mPager.mAdapter;
        }
        if (pageradapter == null)
        {
            return;
        }
        LayoutInflater layoutinflater = LayoutInflater.from(getContext());
        int j = pageradapter.getCount();
        for (int i = 0; i < j; i++)
        {
            int k = BidiPagingHelper.getLogicalPosition(pageradapter, i);
            View view = makeTabView$7ed5ff07(layoutinflater, mTabContainer);
            bindTabViewData(view, pageradapter, k);
            mTabContainer.addView(view);
        }

        mTabContainer.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final PlayHeaderListTabStrip this$0;

            public final void onGlobalLayout()
            {
                int l = mPager.mCurItem;
                scrollToVisualPosition(l, 0);
                mTabContainer.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }

            
            {
                this$0 = PlayHeaderListTabStrip.this;
                super();
            }
        });
        updateSelectedTab$1385ff();
        mTabContainer.mPaddingValidForTabs = false;
    }

    void applyTabContrastMode(TextView textview, boolean flag)
    {
        if (flag)
        {
            textview.setTextColor(-1);
            return;
        } else
        {
            textview.setTextColor(getResources().getColorStateList(0x7f0b02c1));
            return;
        }
    }

    public void bindTabViewData(View view, PagerAdapter pageradapter, int i)
    {
        view = (TextView)view;
        view.setText(pageradapter.getPageTitle(i));
        view.setOnClickListener(makeOnTabClickListener(BidiPagingHelper.getVisualPosition(pageradapter, i)));
    }

    public final void getSubViewReferences()
    {
        mScrollView = (HorizontalScrollView)findViewById(0x7f0d031c);
        mTabContainer = (PlayHeaderListTabContainer)findViewById(0x7f0d031d);
    }

    public final android.view.View.OnClickListener makeOnTabClickListener(final int pagerPosition)
    {
        return new android.view.View.OnClickListener() {

            final PlayHeaderListTabStrip this$0;
            final int val$pagerPosition;

            public final void onClick(View view)
            {
                mEnablePagerScrollSync = false;
                updateSelectedTab(pagerPosition, true);
                mPager.setCurrentItem(pagerPosition);
            }

            
            {
                this$0 = PlayHeaderListTabStrip.this;
                pagerPosition = i;
                super();
            }
        };
    }

    public View makeTabView$7ed5ff07(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = (TextView)layoutinflater.inflate(0x7f04011d, viewgroup, false);
        if (mMaxTabWidthPx == 0)
        {
            viewgroup = new DisplayMetrics();
            ((Activity)getContext()).getWindowManager().getDefaultDisplay().getMetrics(viewgroup);
            mMaxTabWidthPx = ((DisplayMetrics) (viewgroup)).widthPixels;
        }
        layoutinflater.setMaxWidth(mMaxTabWidthPx);
        applyTabContrastMode(layoutinflater, mUseHighContrast);
        layoutinflater.setBackgroundResource(mTabBackgroundResId);
        return layoutinflater;
    }

    public final void notifyPagerAdapterChanged()
    {
        PagerAdapter pageradapter;
        PagerAdapter pageradapter1;
        if (mPager == null)
        {
            pageradapter = null;
        } else
        {
            pageradapter = mPager.mAdapter;
        }
        if (mWatchingAdapter != null)
        {
            pageradapter1 = (PagerAdapter)mWatchingAdapter.get();
        } else
        {
            pageradapter1 = null;
        }
        if (pageradapter1 != null)
        {
            pageradapter1.unregisterDataSetObserver(mPageListener);
            mWatchingAdapter = null;
        }
        if (pageradapter != null)
        {
            pageradapter.registerDataSetObserver(mPageListener);
            mWatchingAdapter = new WeakReference(pageradapter);
        }
        updateTabs();
    }

    protected void onFinishInflate()
    {
        getSubViewReferences();
        PlayHeaderListTabContainer playheaderlisttabcontainer = mTabContainer;
        int i = getResources().getColor(0x7f0b025e);
        playheaderlisttabcontainer.mSelectedUnderlinePaint.setColor(i);
        playheaderlisttabcontainer.invalidate();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1;
        if (mAnimateContainerPadding)
        {
            i1 = getSelectedTabPosition();
        } else
        {
            i1 = 0;
        }
        super.onLayout(flag, i, j, k, l);
        if (mScrollView.getScrollX() != mLastScrollto)
        {
            mScrollView.scrollTo(mLastScrollto, 0);
        }
        if (mAnimateContainerPadding)
        {
            updateSelectedTab$1385ff();
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                i = getSelectedTabPosition();
                if (i != i1)
                {
                    mTabContainer.setTranslationX(-(i - i1));
                    mTabContainer.animate().translationX(0.0F).setDuration(200L);
                }
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        if (k > 0)
        {
            PlayHeaderListTabContainer playheaderlisttabcontainer = mTabContainer;
            if (playheaderlisttabcontainer.mStripWidth != k || !playheaderlisttabcontainer.mPaddingValidForTabs)
            {
                playheaderlisttabcontainer.mStripWidth = k;
                playheaderlisttabcontainer.updatePadding();
            }
        }
        super.onMeasure(i, j);
    }

    final void setUseFloatingTabPadding(boolean flag, boolean flag1)
    {
        PlayHeaderListTabContainer playheaderlisttabcontainer = mTabContainer;
        if (playheaderlisttabcontainer.mUseFloatingTabPadding != flag)
        {
            playheaderlisttabcontainer.mUseFloatingTabPadding = flag;
            playheaderlisttabcontainer.updatePadding();
        }
        mAnimateContainerPadding = flag1;
        updateSelectedTab$1385ff();
    }

    protected final void updateSelectedTab(int i, boolean flag)
    {
        scrollToVisualPosition(i, 0, flag);
        int j = 0;
        while (j < mTabContainer.getChildCount()) 
        {
            View view = mTabContainer.getChildAt(j);
            if (j == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            j++;
        }
    }

    protected final void updateSelectedTab$1385ff()
    {
        if (mPager == null)
        {
            return;
        } else
        {
            updateSelectedTab(mPager.mCurItem, false);
            return;
        }
    }






/*
    static boolean access$502(PlayHeaderListTabStrip playheaderlisttabstrip, boolean flag)
    {
        playheaderlisttabstrip.mEnablePagerScrollSync = flag;
        return flag;
    }

*/


}
