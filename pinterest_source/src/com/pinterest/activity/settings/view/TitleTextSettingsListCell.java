// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class TitleTextSettingsListCell extends LinearLayout
{

    TextView _titleSettingsTv;

    public TitleTextSettingsListCell(Context context)
    {
        this(context, null);
    }

    public TitleTextSettingsListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TitleTextSettingsListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public String getTitleSettingsTv()
    {
        return _titleSettingsTv.getText().toString();
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f03017b, this, true);
        ButterKnife.a(this);
    }

    public void setTitleSettingsTvText(String s)
    {
        _titleSettingsTv.setText(s);
    }
}
