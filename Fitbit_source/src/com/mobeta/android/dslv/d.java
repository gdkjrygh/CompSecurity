// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class d extends ViewGroup
{

    private int a;

    public d(Context context)
    {
        super(context);
        a = 48;
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        a = i;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = getChildAt(0);
        if (view == null)
        {
            return;
        }
        if (a == 48)
        {
            view.layout(0, 0, getMeasuredWidth(), view.getMeasuredHeight());
            return;
        } else
        {
            view.layout(0, getMeasuredHeight() - view.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(j);
        int l = android.view.View.MeasureSpec.getSize(i);
        j = android.view.View.MeasureSpec.getMode(j);
        View view = getChildAt(0);
        if (view == null)
        {
            setMeasuredDimension(0, l);
            return;
        }
        if (view.isLayoutRequested())
        {
            measureChild(view, i, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        i = k;
        if (j == 0)
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            if (layoutparams.height > 0)
            {
                i = layoutparams.height;
            } else
            {
                i = view.getMeasuredHeight();
            }
        }
        setMeasuredDimension(l, i);
    }
}
