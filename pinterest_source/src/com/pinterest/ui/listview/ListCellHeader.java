// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class ListCellHeader extends FrameLayout
{

    View _dividerVw;
    TextView _headerTv;

    public ListCellHeader(Context context)
    {
        this(context, null);
    }

    public ListCellHeader(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static ListCellHeader get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ListCellHeader))
        {
            return new ListCellHeader(viewgroup.getContext());
        } else
        {
            return (ListCellHeader)view;
        }
    }

    private void init()
    {
        setMinimumHeight(getResources().getDimensionPixelSize(0x7f0a0155));
        setBackgroundResource(0x7f020283);
        inflate(getContext(), 0x7f030158, this);
        ButterKnife.a(this);
    }

    public void setDividerVisibility(int i)
    {
        _dividerVw.setVisibility(i);
    }

    public void setText(String s)
    {
        _headerTv.setText(s);
    }
}
