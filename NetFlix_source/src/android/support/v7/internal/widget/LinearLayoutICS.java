// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class LinearLayoutICS extends LinearLayout
{

    private static final int SHOW_DIVIDER_BEGINNING = 1;
    private static final int SHOW_DIVIDER_END = 4;
    private static final int SHOW_DIVIDER_MIDDLE = 2;
    private static final int SHOW_DIVIDER_NONE = 0;
    private final Drawable mDivider;
    private final int mDividerHeight;
    private final int mDividerPadding;
    private final int mDividerWidth;
    private final int mShowDividers;

    public LinearLayoutICS(Context context, AttributeSet attributeset)
    {
        boolean flag = true;
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.LinearLayoutICS);
        mDivider = context.getDrawable(0);
        if (mDivider != null)
        {
            mDividerWidth = mDivider.getIntrinsicWidth();
            mDividerHeight = mDivider.getIntrinsicHeight();
        } else
        {
            mDividerWidth = 0;
            mDividerHeight = 0;
        }
        mShowDividers = context.getInt(1, 0);
        mDividerPadding = context.getDimensionPixelSize(2, 0);
        context.recycle();
        if (mDivider != null)
        {
            flag = false;
        }
        setWillNotDraw(flag);
    }

    void drawSupportDividersHorizontal(Canvas canvas)
    {
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            View view = getChildAt(i);
            if (view != null && view.getVisibility() != 8 && hasSupportDividerBeforeChildAt(i))
            {
                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
                drawSupportVerticalDivider(canvas, view.getLeft() - layoutparams.leftMargin);
            }
        }

        if (hasSupportDividerBeforeChildAt(k))
        {
            View view1 = getChildAt(k - 1);
            int j;
            if (view1 == null)
            {
                j = getWidth() - getPaddingRight() - mDividerWidth;
            } else
            {
                j = view1.getRight();
            }
            drawSupportVerticalDivider(canvas, j);
        }
    }

    void drawSupportDividersVertical(Canvas canvas)
    {
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            View view = getChildAt(i);
            if (view != null && view.getVisibility() != 8 && hasSupportDividerBeforeChildAt(i))
            {
                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
                drawSupportHorizontalDivider(canvas, view.getTop() - layoutparams.topMargin);
            }
        }

        if (hasSupportDividerBeforeChildAt(k))
        {
            View view1 = getChildAt(k - 1);
            int j;
            if (view1 == null)
            {
                j = getHeight() - getPaddingBottom() - mDividerHeight;
            } else
            {
                j = view1.getBottom();
            }
            drawSupportHorizontalDivider(canvas, j);
        }
    }

    void drawSupportHorizontalDivider(Canvas canvas, int i)
    {
        mDivider.setBounds(getPaddingLeft() + mDividerPadding, i, getWidth() - getPaddingRight() - mDividerPadding, mDividerHeight + i);
        mDivider.draw(canvas);
    }

    void drawSupportVerticalDivider(Canvas canvas, int i)
    {
        mDivider.setBounds(i, getPaddingTop() + mDividerPadding, mDividerWidth + i, getHeight() - getPaddingBottom() - mDividerPadding);
        mDivider.draw(canvas);
    }

    public int getSupportDividerWidth()
    {
        return mDividerWidth;
    }

    protected boolean hasSupportDividerBeforeChildAt(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        if ((mShowDividers & 1) == 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i != getChildCount())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((mShowDividers & 4) == 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if ((mShowDividers & 2) != 0)
        {
            boolean flag1 = false;
            i--;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (i >= 0)
                    {
                        if (getChildAt(i).getVisibility() == 8)
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    return flag;
                }
                i--;
            } while (true);
        } else
        {
            return false;
        }
    }

    protected void measureChildWithMargins(View view, int i, int j, int k, int l)
    {
        if (mDivider == null) goto _L2; else goto _L1
_L1:
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i1;
        int j1;
        i1 = indexOfChild(view);
        j1 = getChildCount();
        layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        if (getOrientation() != 1) goto _L4; else goto _L3
_L3:
        if (!hasSupportDividerBeforeChildAt(i1)) goto _L6; else goto _L5
_L5:
        layoutparams.topMargin = mDividerHeight;
_L2:
        super.measureChildWithMargins(view, i, j, k, l);
        return;
_L6:
        if (i1 == j1 - 1 && hasSupportDividerBeforeChildAt(j1))
        {
            layoutparams.bottomMargin = mDividerHeight;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (hasSupportDividerBeforeChildAt(i1))
        {
            layoutparams.leftMargin = mDividerWidth;
        } else
        if (i1 == j1 - 1 && hasSupportDividerBeforeChildAt(j1))
        {
            layoutparams.rightMargin = mDividerWidth;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    protected void onDraw(Canvas canvas)
    {
        if (mDivider == null)
        {
            return;
        }
        if (getOrientation() == 1)
        {
            drawSupportDividersVertical(canvas);
            return;
        } else
        {
            drawSupportDividersHorizontal(canvas);
            return;
        }
    }
}
