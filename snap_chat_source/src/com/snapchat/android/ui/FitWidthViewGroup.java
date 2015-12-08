// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class FitWidthViewGroup extends ViewGroup
{

    private final int a;
    private int b;

    public FitWidthViewGroup(Context context)
    {
        this(context, null, 0);
    }

    public FitWidthViewGroup(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FitWidthViewGroup(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        context = context.obtainStyledAttributes(attributeset, kx.a.FitWidthViewGroup);
        setGravity(context.getInt(0, 0));
        context.recycle();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1;
        int j1;
        i1 = l - j;
        j1 = getChildCount();
        l = 0;
_L2:
        View view;
        int k1;
        int l1;
        int i2;
        if (l >= j1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        view = getChildAt(l);
        k1 = view.getMeasuredHeight();
        l1 = view.getMeasuredWidth();
        i2 = (k - i - l1) / 2;
        switch (b)
        {
        case 1: // '\001'
        default:
            j = 0;
            break;

        case 0: // '\0'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_123;
        }
_L3:
        view.layout(i2, j, l1 + i2, k1 + j);
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        j = (i1 - k1) / 2;
          goto _L3
        j = i1 - k1;
          goto _L3
    }

    protected void onMeasure(int i, int j)
    {
        int k = 0;
        super.onMeasure(i, j);
        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i), 0x40000000);
        int j1 = getChildCount();
        int l = 0;
        for (; k < j1; k++)
        {
            View view = getChildAt(k);
            view.measure(i1, a);
            l = Math.max(l, view.getMeasuredHeight());
        }

        j = Math.min(android.view.View.MeasureSpec.getSize(j), l);
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), j);
    }

    public void setGravity(int i)
    {
        if (i > 2 || i < 0)
        {
            throw new IllegalStateException((new StringBuilder("FitWidthViewGroup cannot have gravity: ")).append(i).toString());
        } else
        {
            b = i;
            return;
        }
    }
}
