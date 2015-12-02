// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster.draglist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class GridLayout extends ViewGroup
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public GridLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 4;
    }

    private void a(View view, int i, int j, int k, int l)
    {
        view.layout(i, j, i + k, j + l);
    }

    public int getColums()
    {
        return a;
    }

    public int getRows()
    {
        return b;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = (getMeasuredWidth() - d * 2) / a;
        for (i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            k = i / a;
            l = a;
            int i1 = c;
            a(view, d + (i % l) * j, i1 * k, j, c);
        }

    }

    protected void onMeasure(int i, int j)
    {
        j = 0;
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.makeMeasureSpec(c, 0x40000000);
        e = (k - d * 2) / a;
        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(e, 0x40000000);
        for (i = 0; i < getChildCount(); i++)
        {
            getChildAt(i).measure(i1, l);
        }

        if (getChildCount() % a == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        l = getChildCount() / a;
        if (i != 0)
        {
            i = j;
        } else
        {
            i = 1;
        }
        j = getLayoutParams().height;
        setMeasuredDimension(k, Math.max((l + i) * c, j));
    }

    public void setColums(int i)
    {
        a = i;
    }

    public void setRowHeight(int i)
    {
        c = i;
    }

    public void setRows(int i)
    {
        b = i;
    }
}
