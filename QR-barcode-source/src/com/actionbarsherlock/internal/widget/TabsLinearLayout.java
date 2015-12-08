// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsLinearLayout

public class TabsLinearLayout extends IcsLinearLayout
{

    private static final int LinearLayout_measureWithLargestChild = 0;
    private static final int R_styleable_LinearLayout[] = {
        0x10102d4
    };
    private boolean mUseLargestChild;

    public TabsLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, R_styleable_LinearLayout);
        mUseLargestChild = context.getBoolean(0, false);
        context.recycle();
    }

    private void useLargestChildHorizontal()
    {
        int i;
        int j;
        int i1;
        i1 = getChildCount();
        i = 0;
        j = 0;
_L3:
        if (j < i1) goto _L2; else goto _L1
_L1:
        int k;
        k = 0;
        j = 0;
_L4:
        if (j >= i1)
        {
            setMeasuredDimension(k + (getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
            return;
        }
        break MISSING_BLOCK_LABEL_75;
_L2:
        i = Math.max(getChildAt(j).getMeasuredWidth(), i);
        j++;
          goto _L3
        View view = getChildAt(j);
        int l = k;
        if (view != null)
        {
            if (view.getVisibility() == 8)
            {
                l = k;
            } else
            {
                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
                if (layoutparams.weight > 0.0F)
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
                    k += i;
                } else
                {
                    k += view.getMeasuredWidth();
                }
                l = k + (layoutparams.leftMargin + layoutparams.rightMargin);
            }
        }
        j++;
        k = l;
          goto _L4
    }

    public boolean isMeasureWithLargestChildEnabled()
    {
        return mUseLargestChild;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (getChildCount() > 2)
        {
            i = android.view.View.MeasureSpec.getMode(i);
            if (mUseLargestChild && i == 0 && getOrientation() == 0)
            {
                useLargestChildHorizontal();
                return;
            }
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean flag)
    {
        mUseLargestChild = flag;
    }

}
