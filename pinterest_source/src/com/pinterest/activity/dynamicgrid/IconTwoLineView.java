// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.base.Constants;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.GrayWebImageView;

public class IconTwoLineView extends LinearLayout
{

    protected GrayWebImageView _icon;
    TextView _subtitle;
    TextView _title;

    public IconTwoLineView(Context context)
    {
        this(context, null);
    }

    public IconTwoLineView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    protected void init()
    {
        inflate(getContext(), 0x7f0301de, this);
        ButterKnife.a(this);
        _icon.setOval(true);
        ViewHelper.setViewPadding(this, Constants.MARGIN_HALF);
    }

    public void setImageUrl(String s)
    {
        _icon.loadUrl(s);
    }

    public void setSubtitle(String s)
    {
        _subtitle.setText(s);
    }

    public void setTitle(String s)
    {
        _title.setText(s);
    }
}
