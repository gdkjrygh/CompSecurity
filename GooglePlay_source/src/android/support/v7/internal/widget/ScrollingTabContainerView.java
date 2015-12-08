// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.internal.view.ActionBarPolicy;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.HorizontalScrollView;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat

public final class ScrollingTabContainerView extends HorizontalScrollView
{

    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    Runnable mTabSelector;
    private SpinnerCompat mTabSpinner;

    private void setTabSelected(int i)
    {
        mSelectedTabIndex = i;
        throw new NullPointerException();
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mTabSelector != null)
        {
            post(mTabSelector);
        }
    }

    protected final void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = ActionBarPolicy.get(getContext());
        TypedArray typedarray = ((ActionBarPolicy) (configuration)).mContext.obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.ActionBar, 0x7f0100fd, 0);
        int j = typedarray.getLayoutDimension(0, 0);
        Resources resources = ((ActionBarPolicy) (configuration)).mContext.getResources();
        int i = j;
        if (!configuration.hasEmbeddedTabs())
        {
            i = Math.min(j, resources.getDimensionPixelSize(0x7f0c0008));
        }
        typedarray.recycle();
        mContentHeight = i;
        requestLayout();
        mStackedTabMaxWidth = ((ActionBarPolicy) (configuration)).mContext.getResources().getDimensionPixelSize(0x7f0c0009);
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mTabSelector != null)
        {
            removeCallbacks(mTabSelector);
        }
    }

    public final void onMeasure(int i, int j)
    {
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        throw new NullPointerException();
    }


    // Unreferenced inner class android/support/v7/internal/widget/ScrollingTabContainerView$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        final ScrollingTabContainerView this$0;
        final View val$tabView;

        public final void run()
        {
            int i = tabView.getLeft();
            int j = (getWidth() - tabView.getWidth()) / 2;
            smoothScrollTo(i - j, 0);
            mTabSelector = null;
        }

            
            {
                this$0 = ScrollingTabContainerView.this;
                tabView = view;
                super();
            }
    }

}
