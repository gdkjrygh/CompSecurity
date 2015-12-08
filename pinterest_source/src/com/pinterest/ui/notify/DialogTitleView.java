// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.notify;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class DialogTitleView extends FrameLayout
{

    public Button dismissBt;
    public TextView subTitleTv;
    public TextView textTv;
    public View titleDivider;
    public TextView titleTv;

    public DialogTitleView(Context context)
    {
        this(context, null);
    }

    public DialogTitleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DialogTitleView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(attributeset);
    }

    private void init(AttributeSet attributeset)
    {
        inflate(getContext(), 0x7f0301c6, this);
        ButterKnife.a(this);
        initAttrs(attributeset);
    }

    private void initAttrs(AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return;
        }
        attributeset = getContext().obtainStyledAttributes(attributeset, com.pinterest.R.styleable.DialogTitleView, 0, 0);
        int i = attributeset.getDimensionPixelSize(0, -1);
        if (i != -1)
        {
            titleTv.setTextSize(0, i);
        }
        i = attributeset.getInteger(1, -1);
        if (i != -1 && i == 0)
        {
            titleTv.setGravity(1);
        }
        if (attributeset.getBoolean(2, false))
        {
            titleDivider.setVisibility(8);
        }
        attributeset.recycle();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.a(this);
    }

    public void setHeight(int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        layoutparams.height = i;
        setLayoutParams(layoutparams);
    }
}
