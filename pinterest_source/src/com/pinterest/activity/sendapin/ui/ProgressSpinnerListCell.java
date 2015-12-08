// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.ui.progress.SmallLoadingView;

public class ProgressSpinnerListCell extends FrameLayout
{

    private SmallLoadingView _spinner;
    private int _spinnerTopMargin;

    public ProgressSpinnerListCell(Context context)
    {
        this(context, null, 0);
    }

    public ProgressSpinnerListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProgressSpinnerListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _spinnerTopMargin = 0;
        setBackgroundColor(-1);
        _spinner = new SmallLoadingView(getContext());
        i = (int)context.getResources().getDimension(0x7f0a01ab);
        attributeset = new android.widget.FrameLayout.LayoutParams(i, i, 1);
        _spinnerTopMargin = (int)context.getResources().getDimension(0x7f0a01cd);
        attributeset.setMargins(0, _spinnerTopMargin, 0, 0);
        _spinner.setLayoutParams(attributeset);
        addView(_spinner);
    }

    public void hideSpinner()
    {
        _spinner.setVisibility(8);
    }

    public void setSpinnerVisibility(boolean flag)
    {
        SmallLoadingView smallloadingview = _spinner;
        byte byte0;
        if (!flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        smallloadingview.setVisibility(byte0);
    }

    public void showSpinner(boolean flag)
    {
        int i;
        if (flag)
        {
            i = _spinnerTopMargin;
        } else
        {
            i = _spinnerTopMargin / 2;
        }
        ((android.widget.FrameLayout.LayoutParams)_spinner.getLayoutParams()).setMargins(0, i, 0, 0);
        _spinner.setVisibility(0);
    }
}
