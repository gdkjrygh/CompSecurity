// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.widget.e;

public class MultipickerCustomLayout extends e
{

    private int a;

    public MultipickerCustomLayout(Context context)
    {
        this(context, null);
    }

    public MultipickerCustomLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return new android.widget.LinearLayout.LayoutParams(-1, -1);
    }

    protected void onMeasure(int i, int j)
    {
        if (getChildCount() != 2)
        {
            throw new IllegalStateException("Should be two children");
        } else
        {
            int k = getPaddingLeft() + getPaddingRight();
            int l = getPaddingTop() + getPaddingBottom();
            View view = getChildAt(0);
            View view1 = getChildAt(1);
            measureChildWithMargins(view, i, k, android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j) - a, 0x80000000), l);
            int i1 = l + view.getMeasuredHeight();
            measureChildWithMargins(view1, i, k, j, i1);
            int j1 = view1.getMeasuredHeight();
            l = Math.max(Math.max(0, view.getMeasuredWidth()), view1.getMeasuredWidth());
            i1 = Math.max(j1 + i1, getSuggestedMinimumHeight());
            setMeasuredDimension(resolveSize(Math.max(l + k, getSuggestedMinimumWidth()), i), resolveSize(i1, j));
            return;
        }
    }

    public void setMinBottomSizePx(int i)
    {
        a = i;
    }
}
