// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.kit.application.Resources;

public class MaxHeightLinearLayout extends LinearLayout
{

    private static final int MAX_HEIGHT = (int)Resources.dimension(0x7f0a00c0);

    public MaxHeightLinearLayout(Context context)
    {
        this(context, null);
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        int k = j;
        if (android.view.View.MeasureSpec.getSize(j) > MAX_HEIGHT)
        {
            k = android.view.View.MeasureSpec.makeMeasureSpec(MAX_HEIGHT, 0x40000000);
        }
        super.onMeasure(i, k);
    }

}
