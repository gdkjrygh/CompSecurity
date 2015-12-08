// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class EmptySearchCell extends LinearLayout
{

    TextView _textEt;

    public EmptySearchCell(Context context)
    {
        this(context, null);
    }

    public EmptySearchCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EmptySearchCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030193, this, true);
        ButterKnife.a(this);
    }

    public void setText(int i)
    {
        _textEt.setText(i);
    }

    public void setText(String s)
    {
        _textEt.setText(s);
    }
}
