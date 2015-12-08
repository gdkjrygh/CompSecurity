// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class ListCellOverflow extends FrameLayout
{

    TextView _textVw;

    public ListCellOverflow(Context context)
    {
        this(context, null);
    }

    public ListCellOverflow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static ListCellOverflow get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ListCellOverflow))
        {
            return new ListCellOverflow(viewgroup.getContext());
        } else
        {
            return (ListCellOverflow)view;
        }
    }

    private void init()
    {
        setBackgroundResource(0x7f020283);
        inflate(getContext(), 0x7f030160, this);
        ButterKnife.a(this);
        _textVw = (TextView)findViewById(0x7f0f0077);
    }

    public void setText(String s)
    {
        _textVw.setText(s);
    }
}
