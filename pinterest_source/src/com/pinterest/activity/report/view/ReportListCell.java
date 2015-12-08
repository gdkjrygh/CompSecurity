// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.ui.ViewHelper;

public class ReportListCell extends LinearLayout
{

    public static final int TYPE_BOTTOM = 2;
    public static final int TYPE_MIDDLE = 0;
    public static final int TYPE_NORMAL = 3;
    public static final int TYPE_TOP = 1;
    View _dividerVw;
    TextView _labelTitle;
    LinearLayout _reportCellButton;
    RelativeLayout _reportCellLayout;
    TextView _reportTextValue;

    public ReportListCell(Context context)
    {
        this(context, null);
    }

    public ReportListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ReportListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static ReportListCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof ReportListCell)
        {
            return (ReportListCell)view;
        } else
        {
            return new ReportListCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    public String getLabelTitleText()
    {
        return _labelTitle.getText().toString();
    }

    public String getSettingTextValue()
    {
        return _reportTextValue.getText().toString();
    }

    public void hideDivider()
    {
        _dividerVw.setVisibility(8);
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030178, this, true);
        ButterKnife.a(this);
    }

    public void reset()
    {
        setCardBackGround(0);
        setSettingTextValueText(null);
        setLabelTitleText(null);
        showDivider();
    }

    public void setCardBackGround(int i)
    {
        switch (i)
        {
        default:
            return;

        case 3: // '\003'
            _reportCellButton.setBackgroundResource(0x7f0200ba);
            return;

        case 2: // '\002'
            _reportCellButton.setBackgroundResource(0x7f0200bb);
            return;

        case 0: // '\0'
            _reportCellButton.setBackgroundResource(0x7f0200bc);
            return;

        case 1: // '\001'
            _reportCellButton.setBackgroundResource(0x7f0200bd);
            return;
        }
    }

    public void setLabelTitleText(String s)
    {
        _labelTitle.setText(s);
    }

    public void setSettingTextValueText(String s)
    {
        _reportTextValue.setText(s);
    }

    public void setTextValueInvisible()
    {
        _reportTextValue.setVisibility(8);
    }

    public void setTextValueVisible()
    {
        _reportTextValue.setVisibility(0);
    }

    public void showDivider()
    {
        _dividerVw.setVisibility(0);
    }
}
