// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class ListCellTextWithLeftCheckMark extends FrameLayout
{

    private ImageView _checkMarkIv;
    private View _dividerVw;
    private TextView _textVw;

    public ListCellTextWithLeftCheckMark(Context context)
    {
        this(context, null);
    }

    public ListCellTextWithLeftCheckMark(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static ListCellTextWithLeftCheckMark get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ListCellTextWithLeftCheckMark))
        {
            return new ListCellTextWithLeftCheckMark(viewgroup.getContext());
        } else
        {
            return (ListCellTextWithLeftCheckMark)view;
        }
    }

    private void init()
    {
        setBackgroundResource(0x7f020283);
        inflate(getContext(), 0x7f03016d, this);
        _textVw = (TextView)findViewById(0x7f0f0077);
        _checkMarkIv = (ImageView)findViewById(0x7f0f0354);
        _dividerVw = findViewById(0x7f0f0322);
    }

    public void setCheckMarkVisible(boolean flag)
    {
        ImageView imageview = _checkMarkIv;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    public void setText(String s)
    {
        _textVw.setText(s);
    }
}
