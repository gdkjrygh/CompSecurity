// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public class ListCellText extends FrameLayout
{

    private View _dividerVw;
    private TextView _textVw;

    public ListCellText(Context context)
    {
        this(context, null);
    }

    public ListCellText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static ListCellText get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ListCellText))
        {
            return new ListCellText(viewgroup.getContext());
        } else
        {
            return (ListCellText)view;
        }
    }

    private void init()
    {
        setBackgroundResource(0x7f020283);
        inflate(getContext(), 0x7f03016c, this);
        _textVw = (TextView)findViewById(0x7f0f0077);
        _dividerVw = findViewById(0x7f0f0322);
    }

    public void setMaxLines(int i)
    {
        _textVw.setMaxLines(i);
    }

    public void setSingleLine(boolean flag)
    {
        _textVw.setSingleLine(flag);
    }

    public void setText(String s)
    {
        _textVw.setText(s);
    }

    public void setTypeface(Typeface typeface)
    {
        _textVw.setTypeface(typeface);
    }
}
