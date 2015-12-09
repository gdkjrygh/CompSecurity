// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.internal.Asserts;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            CarouselPagerAdapter

public final class CarouselViewPager extends ViewPager
{
    public static interface LayoutChangedListener
    {

        public abstract void onLayout();
    }


    int mCardWidth;
    LayoutChangedListener mLayoutChangedListener;
    int mNumColumns;
    int mPageMarginFix;

    public CarouselViewPager(Context context)
    {
        super(context);
        mNumColumns = 1;
    }

    public CarouselViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mNumColumns = 1;
    }

    private boolean isSwipeEnabled()
    {
        return super.mAdapter.getCount() > mNumColumns;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (isSwipeEnabled())
        {
            return super.onInterceptTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (mLayoutChangedListener != null)
        {
            mLayoutChangedListener.onLayout();
        }
    }

    protected final void onMeasure(int i, int j)
    {
        int k;
        int i1;
        super.onMeasure(i, j);
        i = 0;
        k = 0;
        for (int l = getChildCount(); k < l; k++)
        {
            View view = getChildAt(k);
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(mCardWidth, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            i = Math.max(i, view.getMeasuredHeight());
        }

        i1 = android.view.View.MeasureSpec.getMode(j);
        k = android.view.View.MeasureSpec.getSize(j);
        if (i1 != 0x40000000) goto _L2; else goto _L1
_L1:
        j = k;
_L4:
        setMeasuredDimension(getMeasuredWidth(), j);
        i = 0;
        for (k = getChildCount(); i < k; i++)
        {
            getChildAt(i).getLayoutParams().height = j;
        }

        break; /* Loop/switch isn't completed */
_L2:
        j = i;
        if (i1 == 0x80000000)
        {
            j = Math.min(i, k);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void onPageScrolled(int i, float f, int j)
    {
        super.onPageScrolled(i, f, j);
        CarouselPagerAdapter carouselpageradapter = (CarouselPagerAdapter)super.mAdapter;
        if (carouselpageradapter != null)
        {
            carouselpageradapter.mPagerIndex = super.mCurItem;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (isSwipeEnabled())
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public final void setAdapter(PagerAdapter pageradapter)
    {
        super.setAdapter(pageradapter);
        Asserts.checkState(pageradapter instanceof CarouselPagerAdapter);
        pageradapter = (CarouselPagerAdapter)pageradapter;
        pageradapter.mMargins = mPageMarginFix;
        setCurrentItem(pageradapter.getCurrentIndex());
    }
}
