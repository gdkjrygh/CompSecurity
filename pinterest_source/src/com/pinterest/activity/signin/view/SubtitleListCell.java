// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.ui.ViewHelper;

public class SubtitleListCell extends FrameLayout
{

    TextView _subTitle;
    TextView _title;

    public SubtitleListCell(Context context)
    {
        this(context, null);
    }

    public SubtitleListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SubtitleListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static SubtitleListCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof SubtitleListCell)
        {
            return (SubtitleListCell)view;
        } else
        {
            return new SubtitleListCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private void init()
    {
        setBackgroundResource(0x7f0200bc);
        LayoutInflater.from(getContext()).inflate(0x7f03016f, this, true);
        ButterKnife.a(this);
    }

    public void setSubTitle(int i)
    {
        _subTitle.setText(i);
        TextView textview = _subTitle;
        if (i == 0)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ViewHelper.setVisibility(textview, i);
    }

    public void setSubTitle(CharSequence charsequence)
    {
        _subTitle.setText(charsequence);
        TextView textview = _subTitle;
        byte byte0;
        if (charsequence == null)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ViewHelper.setVisibility(textview, byte0);
    }

    public void setText(int i)
    {
        _title.setText(i);
    }

    public void setText(String s)
    {
        _title.setText(s);
    }
}
