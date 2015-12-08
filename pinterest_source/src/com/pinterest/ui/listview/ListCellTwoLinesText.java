// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.apache.commons.lang3.StringUtils;

public class ListCellTwoLinesText extends LinearLayout
{

    private TextView _subtitleEt;
    private TextView _titleEt;

    public ListCellTwoLinesText(Context context)
    {
        this(context, null);
    }

    public ListCellTwoLinesText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        _titleEt = (TextView)findViewById(0x7f0f0077);
        _subtitleEt = (TextView)findViewById(0x7f0f01d1);
    }

    public void setSubTitle(String s)
    {
        if (StringUtils.isNotEmpty(s))
        {
            _subtitleEt.setText(s);
            _subtitleEt.setVisibility(0);
            return;
        } else
        {
            _subtitleEt.setVisibility(8);
            return;
        }
    }

    public void setTitle(String s)
    {
        _titleEt.setText(s);
    }
}
