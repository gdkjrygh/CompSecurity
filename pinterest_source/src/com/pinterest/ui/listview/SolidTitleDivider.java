// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.ui.ViewHelper;

public class SolidTitleDivider extends LinearLayout
{

    private View _dividerBottom;
    private View _dividerTop;
    private TextView _titleTv;

    public SolidTitleDivider(Context context)
    {
        this(context, null);
    }

    public SolidTitleDivider(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(attributeset);
    }

    public static SolidTitleDivider from(View view, ViewGroup viewgroup)
    {
        if (view instanceof SolidTitleDivider)
        {
            return (SolidTitleDivider)view;
        } else
        {
            return new SolidTitleDivider(ViewHelper.getContext(view, viewgroup));
        }
    }

    private void init(AttributeSet attributeset)
    {
        boolean flag = false;
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(getContext()).inflate(0x7f030203, this, true);
        _titleTv = (TextView)findViewById(0x7f0f04cf);
        _dividerBottom = findViewById(0x7f0f04d0);
        _dividerTop = findViewById(0x7f0f04ce);
        attributeset = getContext().obtainStyledAttributes(attributeset, com.pinterest.R.styleable.Pinterest);
        boolean flag1 = attributeset.getBoolean(7, true);
        boolean flag2 = attributeset.getBoolean(6, true);
        attributeset.recycle();
        int i;
        if (flag1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setDividerTopVisibility(i);
        if (flag2)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        setDividerBottomVisibility(i);
    }

    public void setBgRes(int i)
    {
        _titleTv.setBackgroundResource(i);
    }

    public void setDividerBottomVisibility(int i)
    {
        _dividerBottom.setVisibility(i);
    }

    public void setDividerColor(int i)
    {
        _dividerTop.setBackgroundResource(i);
        _dividerBottom.setBackgroundResource(i);
    }

    public void setDividerTopVisibility(int i)
    {
        _dividerTop.setVisibility(i);
    }

    public void setText(int i)
    {
        _titleTv.setText(i);
    }

    public void setText(String s)
    {
        _titleTv.setText(s);
    }
}
