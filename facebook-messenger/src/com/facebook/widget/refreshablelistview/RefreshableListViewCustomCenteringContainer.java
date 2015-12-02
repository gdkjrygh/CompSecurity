// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.refreshablelistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.debug.d.e;

public class RefreshableListViewCustomCenteringContainer extends ViewGroup
{

    public RefreshableListViewCustomCenteringContainer(Context context)
    {
        super(context);
    }

    public RefreshableListViewCustomCenteringContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public RefreshableListViewCustomCenteringContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (getChildCount() != 2)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expecting 2 children not ").append(getChildCount()).toString());
        } else
        {
            e e1 = e.a("RefreshableListViewCustomCenteringContainer.onLayout");
            i = getPaddingLeft();
            int j1 = getRight();
            int k1 = getLeft();
            int l1 = getPaddingRight();
            j = getBottom();
            k = getTop();
            l = getPaddingBottom();
            int i1 = getPaddingTop();
            View view = getChildAt(0);
            View view1 = getChildAt(1);
            j1 = (j1 - k1 - l1 - i) / 2;
            j = (j - k - l - i1) / 2 + i1;
            i = (i + j1) - view1.getMeasuredWidth() / 2;
            k = j - view1.getMeasuredHeight() / 2;
            l = view.getMeasuredWidth();
            j -= view.getMeasuredHeight() / 2;
            view1.layout(i, k, view1.getMeasuredWidth() + i, view1.getMeasuredHeight() + k);
            view.layout(i - l, j, i, view.getMeasuredHeight() + j);
            e1.a();
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        if (getChildCount() != 2)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expecting 2 children not ").append(getChildCount()).toString());
        } else
        {
            e e1 = e.a("RefreshableListViewCustomCenteringContainer.onMeasure");
            View view = getChildAt(0);
            View view1 = getChildAt(1);
            int i1 = android.view.View.MeasureSpec.getMode(i);
            int j1 = android.view.View.MeasureSpec.getSize(i);
            int k1 = getPaddingLeft();
            int l1 = getPaddingRight();
            int k = getPaddingTop();
            int l = getPaddingBottom();
            measureChild(view, i, j);
            k1 = k1 + l1 + 0 + view.getMeasuredWidth() * 2;
            measureChild(view1, android.view.View.MeasureSpec.makeMeasureSpec(j1 - k1, i1), j);
            i1 = view1.getMeasuredWidth();
            k = Math.max(Math.max(view.getMeasuredHeight(), view1.getMeasuredHeight()) + (k + l + 0), getSuggestedMinimumHeight());
            setMeasuredDimension(resolveSize(Math.max(i1 + k1, getSuggestedMinimumWidth()), i), resolveSize(k, j));
            e1.a();
            return;
        }
    }
}
