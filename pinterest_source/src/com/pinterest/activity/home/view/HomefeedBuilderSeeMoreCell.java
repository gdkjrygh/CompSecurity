// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.kit.application.Resources;

public class HomefeedBuilderSeeMoreCell extends RelativeLayout
{

    public HomefeedBuilderSeeMoreCell(Context context)
    {
        this(context, null);
    }

    public HomefeedBuilderSeeMoreCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HomefeedBuilderSeeMoreCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static HomefeedBuilderSeeMoreCell from(View view, Context context)
    {
        if (view instanceof HomefeedBuilderSeeMoreCell)
        {
            return (HomefeedBuilderSeeMoreCell)view;
        } else
        {
            return new HomefeedBuilderSeeMoreCell(context);
        }
    }

    private void init()
    {
        setLayoutParams(new org.lucasr.twowayview.TwoWayView.LayoutParams(-2, -2));
        inflate(getContext(), 0x7f03015b, this);
        setPadding(0, 0, (int)Resources.dimension(0x7f0a0162), 0);
    }
}
