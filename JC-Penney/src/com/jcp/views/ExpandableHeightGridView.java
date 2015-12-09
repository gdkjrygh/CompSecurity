// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class ExpandableHeightGridView extends GridView
{

    private boolean a;

    public ExpandableHeightGridView(Context context)
    {
        super(context);
    }

    public ExpandableHeightGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ExpandableHeightGridView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean a()
    {
        return a;
    }

    public void onMeasure(int i, int j)
    {
        if (a())
        {
            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(0xffffff, 0x80000000));
            getLayoutParams().height = getMeasuredHeight();
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public void setExpanded(boolean flag)
    {
        a = flag;
    }
}
