// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.InterestGridCell;

public class LargeInterestGridCell extends InterestGridCell
{

    public static final String IMAGE_TAG = "ExploreSubInterestImage";

    public LargeInterestGridCell(Context context)
    {
        this(context, null);
    }

    public LargeInterestGridCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LargeInterestGridCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static LargeInterestGridCell from(View view, Context context)
    {
        if (view instanceof LargeInterestGridCell)
        {
            return (LargeInterestGridCell)view;
        } else
        {
            return new LargeInterestGridCell(context);
        }
    }

    private void init()
    {
        setLayoutParams(new org.lucasr.twowayview.TwoWayView.LayoutParams(-2, -2));
        setImageCornerRadius((int)Resources.dimension(0x7f0a00f5));
        setImageDimensions((int)Resources.dimension(0x7f0a011b), (int)Resources.dimension(0x7f0a0119));
        setImageTag("ExploreSubInterestImage");
        setForegroundVisibility(8);
        enableTransparentOverlay();
    }
}
