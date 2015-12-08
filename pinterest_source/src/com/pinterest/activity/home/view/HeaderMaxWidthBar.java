// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;

public class HeaderMaxWidthBar extends LinearLayout
{

    private static final int MAX_WIDTH = (int)Resources.dimension(0x7f0a0135);

    public HeaderMaxWidthBar(Context context)
    {
        this(context, null);
    }

    public HeaderMaxWidthBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        int k = i;
        if (Device.isTablet())
        {
            k = i;
            if (android.view.View.MeasureSpec.getSize(i) > MAX_WIDTH)
            {
                k = android.view.View.MeasureSpec.makeMeasureSpec(MAX_WIDTH, 0x40000000);
            }
        }
        super.onMeasure(k, j);
    }

}
