// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout
{

    private boolean mAllowStacking;
    private int mLastWidthSize;

    public ButtonBarLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mLastWidthSize = -1;
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ButtonBarLayout);
        mAllowStacking = context.getBoolean(android.support.v7.appcompat.R.styleable.ButtonBarLayout_allowStacking, false);
        context.recycle();
    }

    private boolean isStacked()
    {
        return getOrientation() == 1;
    }

    private void setStacked(boolean flag)
    {
        View view;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        setOrientation(i);
        if (flag)
        {
            i = 5;
        } else
        {
            i = 80;
        }
        setGravity(i);
        view = findViewById(android.support.v7.appcompat.R.id.spacer);
        if (view != null)
        {
            if (flag)
            {
                i = 8;
            } else
            {
                i = 4;
            }
            view.setVisibility(i);
        }
        for (i = getChildCount() - 2; i >= 0; i--)
        {
            bringChildToFront(getChildAt(i));
        }

    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        if (mAllowStacking)
        {
            if (k > mLastWidthSize && isStacked())
            {
                setStacked(false);
            }
            mLastWidthSize = k;
        }
        int l;
        if (!isStacked() && android.view.View.MeasureSpec.getMode(i) == 0x40000000)
        {
            l = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x80000000);
            k = 1;
        } else
        {
            k = 0;
            l = i;
        }
        super.onMeasure(l, j);
        l = k;
        if (mAllowStacking)
        {
            l = k;
            if (!isStacked())
            {
                l = k;
                if ((getMeasuredWidthAndState() & 0xff000000) == 0x1000000)
                {
                    setStacked(true);
                    l = 1;
                }
            }
        }
        if (l != 0)
        {
            super.onMeasure(i, j);
        }
    }

    public void setAllowStacking(boolean flag)
    {
        if (mAllowStacking != flag)
        {
            mAllowStacking = flag;
            if (!mAllowStacking && getOrientation() == 1)
            {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
