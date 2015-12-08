// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;

public class TextValueSettingsListCell extends LinearLayout
{

    public static final int TYPE_BOTTOM = 2;
    public static final int TYPE_MIDDLE = 0;
    public static final int TYPE_NORMAL = 3;
    public static final int TYPE_TOP = 1;
    View _dividerVw;
    TextView _labelTitle;
    LinearLayout _settingCellButton;
    RelativeLayout _settingCellLayout;
    TextView _settingTextValue;

    public TextValueSettingsListCell(Context context)
    {
        this(context, null);
    }

    public TextValueSettingsListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TextValueSettingsListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static TextValueSettingsListCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof TextValueSettingsListCell)
        {
            return (TextValueSettingsListCell)view;
        } else
        {
            return new TextValueSettingsListCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    public void centerTextViewGravity()
    {
        _settingCellLayout.setGravity(17);
        _labelTitle.setGravity(17);
        _settingTextValue.setVisibility(8);
    }

    public String getLabelTitleText()
    {
        return _labelTitle.getText().toString();
    }

    public String getSettingTextValue()
    {
        return _settingTextValue.getText().toString();
    }

    public void hideDivider()
    {
        _dividerVw.setVisibility(8);
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f03017a, this, true);
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
            _settingCellButton.setBackgroundResource(0x7f0200ba);
            return;

        case 2: // '\002'
            _settingCellButton.setBackgroundResource(0x7f0200bb);
            return;

        case 0: // '\0'
            _settingCellButton.setBackgroundResource(0x7f0200bc);
            return;

        case 1: // '\001'
            _settingCellButton.setBackgroundResource(0x7f0200bd);
            return;
        }
    }

    public void setLabelTitleText(String s)
    {
        _labelTitle.setText(s);
    }

    public void setNormalSettingTextValueTextSize()
    {
        _settingTextValue.setTextSize(0, Resources.dimension(0x7f0a01d7));
    }

    public void setSettingTextValueText(String s)
    {
        _settingTextValue.setText(s);
    }

    public void setSmallSettingTextValueTextSize()
    {
        _settingTextValue.setTextSize(0, Resources.dimension(0x7f0a01d9));
    }

    public void setTextValueVisible()
    {
        _settingTextValue.setVisibility(0);
    }

    public void showDivider()
    {
        _dividerVw.setVisibility(0);
    }
}
