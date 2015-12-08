// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.LinearLayout;

public class FakeDialogPhoneWindow extends LinearLayout
{

    final TypedValue mMinWidthMajor = new TypedValue();
    final TypedValue mMinWidthMinor = new TypedValue();

    public FakeDialogPhoneWindow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockTheme);
        context.getValue(49, mMinWidthMajor);
        context.getValue(50, mMinWidthMinor);
        context.recycle();
    }

    protected void onMeasure(int i, int j)
    {
        DisplayMetrics displaymetrics = getContext().getResources().getDisplayMetrics();
        TypedValue typedvalue;
        int k;
        boolean flag;
        boolean flag1;
        int l;
        int i1;
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        super.onMeasure(i, j);
        i1 = getMeasuredWidth();
        flag1 = false;
        l = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        if (k != 0)
        {
            typedvalue = mMinWidthMinor;
        } else
        {
            typedvalue = mMinWidthMajor;
        }
        flag = flag1;
        k = l;
        if (typedvalue.type != 0)
        {
            if (typedvalue.type == 5)
            {
                i = (int)typedvalue.getDimension(displaymetrics);
            } else
            if (typedvalue.type == 6)
            {
                i = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
            } else
            {
                i = 0;
            }
            flag = flag1;
            k = l;
            if (i1 < i)
            {
                k = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
                flag = true;
            }
        }
        if (flag)
        {
            super.onMeasure(k, j);
        }
    }
}
