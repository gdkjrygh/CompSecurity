// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class NUXProgressCell extends RelativeLayout
{

    private ImageView _indicator;
    private View _progressBackground;

    public NUXProgressCell(Context context)
    {
        this(context, null);
    }

    public NUXProgressCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NUXProgressCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        _progressBackground = new View(getContext());
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        _progressBackground.setLayoutParams(layoutparams);
        addView(_progressBackground);
        _indicator = new ImageView(getContext());
        _indicator.setImageResource(0x7f02023a);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(13);
        _indicator.setLayoutParams(layoutparams);
        addView(_indicator);
    }

    public View getProgress()
    {
        return _progressBackground;
    }

    public void setIndicatorResource(int i)
    {
        _indicator.setImageResource(i);
    }

    public void setProgressColor(int i)
    {
        _progressBackground.setBackgroundColor(i);
    }
}
