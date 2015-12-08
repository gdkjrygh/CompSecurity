// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.ui.ViewHelper;

public class CheckedTextViewSettingsListCell extends LinearLayout
{

    public static final int TYPE_BOTTOM = 2;
    public static final int TYPE_MIDDLE = 0;
    public static final int TYPE_NORMAL = 3;
    public static final int TYPE_TOP = 1;
    View _dividerVw;
    LinearLayout _settingCheckedCell;
    CheckedTextView _socialCheckedTv;

    public CheckedTextViewSettingsListCell(Context context)
    {
        this(context, null);
    }

    public CheckedTextViewSettingsListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CheckedTextViewSettingsListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static CheckedTextViewSettingsListCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof CheckedTextViewSettingsListCell)
        {
            return (CheckedTextViewSettingsListCell)view;
        } else
        {
            return new CheckedTextViewSettingsListCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    public CheckedTextView getSocialCheckedTv()
    {
        return _socialCheckedTv;
    }

    public void hideDivider()
    {
        _dividerVw.setVisibility(8);
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030179, this, true);
        ButterKnife.a(this);
    }

    public void reset()
    {
        setCardBackGround(0);
        setSocialCheckedString(null);
        setSocialChecked(Boolean.valueOf(false));
    }

    public void setCardBackGround(int i)
    {
        switch (i)
        {
        default:
            return;

        case 3: // '\003'
            _settingCheckedCell.setBackgroundResource(0x7f0200ba);
            return;

        case 2: // '\002'
            _settingCheckedCell.setBackgroundResource(0x7f0200bb);
            return;

        case 0: // '\0'
            _settingCheckedCell.setBackgroundResource(0x7f0200bc);
            return;

        case 1: // '\001'
            _settingCheckedCell.setBackgroundResource(0x7f0200bd);
            return;
        }
    }

    public void setSocialChecked(Boolean boolean1)
    {
        _socialCheckedTv.setChecked(boolean1.booleanValue());
    }

    public void setSocialCheckedString(String s)
    {
        _socialCheckedTv.setText(s);
    }

    public void setSocialCheckedTv(CheckedTextView checkedtextview)
    {
        _socialCheckedTv = checkedtextview;
    }

    public void showDivider()
    {
        _dividerVw.setVisibility(0);
    }
}
