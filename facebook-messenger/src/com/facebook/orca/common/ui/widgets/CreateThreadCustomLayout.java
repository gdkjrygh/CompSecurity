// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.orca.compose.ap;

public class CreateThreadCustomLayout extends ViewGroup
{

    private ap a;

    public CreateThreadCustomLayout(Context context)
    {
        super(context);
        a = ap.SHRUNK;
    }

    public CreateThreadCustomLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = ap.SHRUNK;
    }

    public CreateThreadCustomLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = ap.SHRUNK;
    }

    private void a(View view, int i, int j, int k, int l)
    {
        view.layout(i, j, i + k, j + l);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof android.view.ViewGroup.MarginLayoutParams;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new android.view.ViewGroup.MarginLayoutParams(layoutparams);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (getChildCount() != 2)
        {
            throw new IllegalStateException("Should be two children");
        }
        l = getPaddingLeft();
        getWidth();
        k = getPaddingTop();
        int i1 = getHeight();
        i = 0;
        for (j = 0; j < 2;)
        {
            Object obj = getChildAt(j);
            int j1 = ((View) (obj)).getMeasuredHeight();
            obj = (android.view.ViewGroup.MarginLayoutParams)((View) (obj)).getLayoutParams();
            int l1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin;
            int j2 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).bottomMargin;
            j++;
            i = j1 + i + (j2 + l1);
        }

        i1 = Math.max(0, i1 - i);
        j = 0;
        i = k;
        for (; j < 2; j++)
        {
            View view = getChildAt(j);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
            k = view.getMeasuredWidth();
            int k1 = view.getMeasuredHeight();
            int i2 = marginlayoutparams.leftMargin;
            if (j == 1)
            {
                i += i1;
            }
            i = marginlayoutparams.topMargin + i;
            a(view, l + i2, i, k, k1);
            i += marginlayoutparams.bottomMargin + k1;
        }

    }

    protected void onMeasure(int i, int j)
    {
        if (getChildCount() != 2)
        {
            throw new IllegalStateException("Should be two children");
        }
        View view = getChildAt(0);
        View view1 = getChildAt(1);
        measureChildWithMargins(view1, i, 0, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 0);
        int i1 = view1.getMeasuredHeight();
        int k = Math.max(0, view1.getMeasuredWidth());
        int l = 0 + view1.getMeasuredHeight();
        int j1;
        if (a == ap.EXPANDED && android.view.View.MeasureSpec.getMode(j) == 0x40000000)
        {
            view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j) - (getPaddingTop() + l + getPaddingBottom()), 0x40000000));
            l = view.getMeasuredHeight() + l;
        } else
        {
            measureChildWithMargins(view, i, 0, j, i1);
            k = Math.max(k, view.getMeasuredWidth());
            l = view.getMeasuredHeight() + l;
        }
        i1 = getPaddingLeft();
        j1 = getPaddingRight();
        l = Math.max(l + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(k + (i1 + j1), getSuggestedMinimumWidth()), i), resolveSize(l, j));
    }

    public void setComposeMode(ap ap1)
    {
        a = ap1;
        requestLayout();
    }
}
