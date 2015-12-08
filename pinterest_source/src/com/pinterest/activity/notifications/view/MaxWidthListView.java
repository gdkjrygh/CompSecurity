// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.pinterest.kit.application.Resources;

public class MaxWidthListView extends ListView
{

    private static final int MAX_WIDTH = (int)Resources.dimension(0x7f0a0135);
    private boolean _disableMaxWidth;

    public MaxWidthListView(Context context)
    {
        this(context, null);
    }

    public MaxWidthListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0b01c2);
    }

    public MaxWidthListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _disableMaxWidth = false;
    }

    protected void onMeasure(int i, int j)
    {
        int k = i;
        if (!_disableMaxWidth)
        {
            k = i;
            if (android.view.View.MeasureSpec.getSize(i) > MAX_WIDTH)
            {
                k = android.view.View.MeasureSpec.makeMeasureSpec(MAX_WIDTH, 0x40000000);
            }
        }
        super.onMeasure(k, j);
    }

    public void setDisableMaxWidth(boolean flag)
    {
        _disableMaxWidth = flag;
    }

}
