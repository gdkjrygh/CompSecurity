// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BevelTitleDivider extends LinearLayout
{

    public ImageView _bevelIv;
    private String _defaultTitle;
    private TextView _titleTv;

    public BevelTitleDivider(Context context)
    {
        this(context, null);
    }

    public BevelTitleDivider(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _defaultTitle = null;
        if (attributeset != null)
        {
            context = getContext().obtainStyledAttributes(attributeset, com.pinterest.R.styleable.Tab);
            _defaultTitle = context.getString(3);
            context.recycle();
        }
        init();
    }

    private void init()
    {
        setGravity(16);
        LayoutInflater.from(getContext()).inflate(0x7f0301be, this, true);
        _titleTv = (TextView)findViewById(0x7f0f0077);
        _bevelIv = (ImageView)findViewById(0x7f0f0455);
        if (_defaultTitle != null)
        {
            _titleTv.setText(_defaultTitle);
        }
    }

    public void setIcon(int i)
    {
        _bevelIv.setImageResource(i);
        _bevelIv.setVisibility(0);
        _titleTv.setVisibility(8);
    }

    public void setIconClickListener(android.view.View.OnClickListener onclicklistener)
    {
        _bevelIv.setOnClickListener(onclicklistener);
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
