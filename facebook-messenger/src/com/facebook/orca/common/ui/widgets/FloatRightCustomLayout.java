// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class FloatRightCustomLayout extends ViewGroup
{

    public FloatRightCustomLayout(Context context)
    {
        super(context);
    }

    public FloatRightCustomLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FloatRightCustomLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void a(View view, int i, int j, int k, int l)
    {
        view.layout(i, j, i + k, j + l);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof android.widget.LinearLayout.LayoutParams;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.widget.LinearLayout.LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.widget.LinearLayout.LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new android.widget.LinearLayout.LayoutParams(layoutparams);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1;
        int j1;
        if (getChildCount() != 2)
        {
            throw new IllegalStateException("Should be two children");
        }
        l = getPaddingTop();
        i1 = getPaddingBottom();
        j1 = getHeight();
        j = getPaddingLeft();
        k = 0;
_L2:
        View view;
        if (k >= 2)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        view = getChildAt(k);
        if (view.getVisibility() != 8)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j;
_L7:
        k++;
        j = i;
        if (true) goto _L2; else goto _L1
_L1:
        android.widget.LinearLayout.LayoutParams layoutparams;
        int k1;
        int l1;
        layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        k1 = view.getMeasuredWidth();
        l1 = view.getMeasuredHeight();
        layoutparams.gravity & 0x70;
        JVM INSTR lookupswitch 3: default 148
    //                   16: 197
    //                   48: 185
    //                   80: 229;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_229;
_L3:
        i = l;
_L8:
        j += layoutparams.leftMargin;
        a(view, j, i, k1, l1);
        i = layoutparams.rightMargin + k1 + j;
          goto _L7
_L5:
        i = l + layoutparams.topMargin;
          goto _L8
_L4:
        i = ((j1 - l - i1 - l1) / 2 + l + layoutparams.topMargin) - layoutparams.bottomMargin;
          goto _L8
        i = j1 - i1 - l1 - layoutparams.bottomMargin;
          goto _L8
    }

    protected void onMeasure(int i, int j)
    {
        if (getChildCount() != 2)
        {
            throw new IllegalStateException("Should be two children");
        }
        View view = getChildAt(0);
        Object obj = getChildAt(1);
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (((View) (obj)).getVisibility() != 8)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
            measureChildWithMargins(((View) (obj)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 0, j, 0);
            i1 = ((View) (obj)).getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
            l = Math.max(0, ((View) (obj)).getMeasuredHeight());
            k = ((View) (obj)).getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin + 0;
        } else
        {
            i1 = 0;
            l = 0;
            k = 0;
        }
        measureChildWithMargins(view, i, i1, j, 0);
        obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i1 = view.getMeasuredWidth();
        j1 = ((android.widget.LinearLayout.LayoutParams) (obj)).leftMargin;
        k1 = ((android.widget.LinearLayout.LayoutParams) (obj)).rightMargin;
        l = Math.max(l, view.getMeasuredHeight());
        l1 = getPaddingTop();
        i2 = getPaddingBottom();
        k = Math.max(k1 + (i1 + j1) + k + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth());
        l = Math.max(l + (l1 + i2), getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(k, i), resolveSize(l, j));
    }
}
