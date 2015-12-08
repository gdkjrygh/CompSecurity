// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.kit.application.Resources;
import org.apache.commons.lang3.StringUtils;

public class PinPicksTitleSectionText extends LinearLayout
{

    TextView _subtitleEt;
    TextView _titleEt;

    public PinPicksTitleSectionText(Context context)
    {
        this(context, null);
    }

    public PinPicksTitleSectionText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void setDarkTextColor()
    {
        _titleEt.setTextColor(Resources.color(0x7f0e00a9));
        _subtitleEt.setTextColor(Resources.color(0x7f0e00a9));
    }

    public void setSubTitle(String s)
    {
        if (StringUtils.isNotEmpty(s))
        {
            _subtitleEt.setText(s);
            return;
        } else
        {
            _subtitleEt.setVisibility(8);
            return;
        }
    }

    public void setTitle(String s)
    {
        if (StringUtils.isNotEmpty(s))
        {
            _titleEt.setText(s);
            return;
        } else
        {
            _titleEt.setVisibility(8);
            return;
        }
    }

    public void setWhiteTextColor()
    {
        _titleEt.setTextColor(Resources.color(0x7f0e00bf));
        _subtitleEt.setTextColor(Resources.color(0x7f0e00bf));
    }
}
