// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.ui.ViewHelper;

public class ActionSheetItemView extends LinearLayout
{

    View _divider;
    private boolean _isGrayOut;
    TextView _tv;

    public ActionSheetItemView(Context context)
    {
        this(context, null);
    }

    public ActionSheetItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActionSheetItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030017, this, true);
        ButterKnife.a(this, this);
    }

    public void setGrayOut(boolean flag)
    {
        _isGrayOut = flag;
        if (_isGrayOut)
        {
            _tv.setMaxLines(5);
            _tv.setSingleLine(false);
            _tv.setTextSize(12F);
        }
    }

    public void setLeftDrawable(int i)
    {
        ViewHelper.setLeftDrawable(_tv, i);
    }

    public void setText(String s)
    {
        _tv.setText(s);
    }

    public void setTextColor(int i)
    {
        _tv.setTextColor(i);
    }

    public void showDivider(boolean flag)
    {
        ViewHelper.setVisibility(_divider, flag);
    }
}
