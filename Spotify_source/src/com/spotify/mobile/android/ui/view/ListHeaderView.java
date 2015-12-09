// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.widget.HeaderView;

public class ListHeaderView extends ViewGroup
{

    private final ImageView a;
    private final HeaderView b;

    public ListHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ListHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ImageView(context);
        a.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        b = new HeaderView(context);
        addView(a);
        addView(b);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        i = k - i;
        a.layout(0, 0, i, a.getMeasuredHeight());
        j = b.getMeasuredHeight();
        b.layout(0, 0, i, j);
    }

    protected void onMeasure(int i, int j)
    {
        if (android.view.View.MeasureSpec.getMode(i) == 0)
        {
            throw new RuntimeException("ListHeaderView doesn't support unspecified width.");
        } else
        {
            i = android.view.View.MeasureSpec.getSize(i);
            b.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            j = b.getMeasuredHeight();
            a.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
            setMeasuredDimension(i, j);
            return;
        }
    }
}
