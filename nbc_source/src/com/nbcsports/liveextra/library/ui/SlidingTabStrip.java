// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

class SlidingTabStrip extends LinearLayout
{
    private static class SimpleTabColorizer
        implements SlidingTabLayout.TabColorizer
    {

        private int mDividerColors[];
        private int mIndicatorColors[];

        public final int getDividerColor(int i)
        {
            return mDividerColors[i % mDividerColors.length];
        }

        public final int getIndicatorColor(int i)
        {
            return mIndicatorColors[i % mIndicatorColors.length];
        }

        transient void setDividerColors(int ai[])
        {
            mDividerColors = ai;
        }

        transient void setIndicatorColors(int ai[])
        {
            mIndicatorColors = ai;
        }

        private SimpleTabColorizer()
        {
        }

    }


    private static final byte DEFAULT_BOTTOM_BORDER_COLOR_ALPHA = 38;
    private static final int DEFAULT_BOTTOM_BORDER_THICKNESS_DIPS = 2;
    private static final byte DEFAULT_DIVIDER_COLOR_ALPHA = 32;
    private static final float DEFAULT_DIVIDER_HEIGHT = 0.5F;
    private static final int DEFAULT_DIVIDER_THICKNESS_DIPS = 1;
    private static final int DEFAULT_SELECTED_INDICATOR_COLOR = 0xff33b5e5;
    private static final int SELECTED_INDICATOR_THICKNESS_DIPS = 8;
    private final Paint mBottomBorderPaint;
    private final int mBottomBorderThickness;
    private SlidingTabLayout.TabColorizer mCustomTabColorizer;
    private final int mDefaultBottomBorderColor;
    private final SimpleTabColorizer mDefaultTabColorizer;
    private final float mDividerHeight;
    private final Paint mDividerPaint;
    private final Paint mSelectedIndicatorPaint;
    private final int mSelectedIndicatorThickness;
    private int mSelectedPosition;
    private float mSelectionOffset;

    SlidingTabStrip(Context context)
    {
        this(context, null);
    }

    SlidingTabStrip(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setWillNotDraw(false);
        float f = getResources().getDisplayMetrics().density;
        attributeset = new TypedValue();
        context.getTheme().resolveAttribute(0x1010030, attributeset, true);
        int i = ((TypedValue) (attributeset)).data;
        mDefaultBottomBorderColor = setColorAlpha(i, (byte)38);
        mDefaultTabColorizer = new SimpleTabColorizer();
        mDefaultTabColorizer.setIndicatorColors(new int[] {
            0xff33b5e5
        });
        mDefaultTabColorizer.setDividerColors(new int[] {
            setColorAlpha(i, (byte)32)
        });
        mBottomBorderThickness = (int)(2.0F * f);
        mBottomBorderPaint = new Paint();
        mBottomBorderPaint.setColor(mDefaultBottomBorderColor);
        mSelectedIndicatorThickness = (int)(8F * f);
        mSelectedIndicatorPaint = new Paint();
        mDividerHeight = 0.5F;
        mDividerPaint = new Paint();
        mDividerPaint.setStrokeWidth((int)(1.0F * f));
    }

    private static int blendColors(int i, int j, float f)
    {
        float f1 = 1.0F - f;
        float f2 = Color.red(i);
        float f3 = Color.red(j);
        float f4 = Color.green(i);
        float f5 = Color.green(j);
        float f6 = Color.blue(i);
        float f7 = Color.blue(j);
        return Color.rgb((int)(f2 * f + f3 * f1), (int)(f4 * f + f5 * f1), (int)(f6 * f + f7 * f1));
    }

    private static int setColorAlpha(int i, byte byte0)
    {
        return Color.argb(byte0, Color.red(i), Color.green(i), Color.blue(i));
    }

    protected void onDraw(Canvas canvas)
    {
        int k2 = getHeight();
        int i2 = getChildCount();
        int j2 = (int)(Math.min(Math.max(0.0F, mDividerHeight), 1.0F) * (float)k2);
        Object obj;
        int l;
        if (mCustomTabColorizer != null)
        {
            obj = mCustomTabColorizer;
        } else
        {
            obj = mDefaultTabColorizer;
        }
        if (i2 > 0)
        {
            View view = getChildAt(mSelectedPosition);
            int l1 = view.getLeft();
            int k1 = view.getRight();
            int k = ((SlidingTabLayout.TabColorizer) (obj)).getIndicatorColor(mSelectedPosition);
            int i = k;
            int j1 = l1;
            int i1 = k1;
            if (mSelectionOffset > 0.0F)
            {
                i = k;
                j1 = l1;
                i1 = k1;
                if (mSelectedPosition < getChildCount() - 1)
                {
                    i1 = ((SlidingTabLayout.TabColorizer) (obj)).getIndicatorColor(mSelectedPosition + 1);
                    i = k;
                    if (k != i1)
                    {
                        i = blendColors(i1, k, mSelectionOffset);
                    }
                    View view1 = getChildAt(mSelectedPosition + 1);
                    j1 = (int)(mSelectionOffset * (float)view1.getLeft() + (1.0F - mSelectionOffset) * (float)l1);
                    i1 = (int)(mSelectionOffset * (float)view1.getRight() + (1.0F - mSelectionOffset) * (float)k1);
                }
            }
            mSelectedIndicatorPaint.setColor(i);
            canvas.drawRect(j1, k2 - mSelectedIndicatorThickness, i1, k2, mSelectedIndicatorPaint);
        }
        canvas.drawRect(0.0F, k2 - mBottomBorderThickness, getWidth(), k2, mBottomBorderPaint);
        l = (k2 - j2) / 2;
        for (int j = 0; j < i2 - 1; j++)
        {
            View view2 = getChildAt(j);
            mDividerPaint.setColor(((SlidingTabLayout.TabColorizer) (obj)).getDividerColor(j));
            canvas.drawLine(view2.getRight(), l, view2.getRight(), l + j2, mDividerPaint);
        }

    }

    void onViewPagerPageChanged(int i, float f)
    {
        mSelectedPosition = i;
        mSelectionOffset = f;
        invalidate();
    }

    void setCustomTabColorizer(SlidingTabLayout.TabColorizer tabcolorizer)
    {
        mCustomTabColorizer = tabcolorizer;
        invalidate();
    }

    transient void setDividerColors(int ai[])
    {
        mCustomTabColorizer = null;
        mDefaultTabColorizer.setDividerColors(ai);
        invalidate();
    }

    transient void setSelectedIndicatorColors(int ai[])
    {
        mCustomTabColorizer = null;
        mDefaultTabColorizer.setIndicatorColors(ai);
        invalidate();
    }
}
