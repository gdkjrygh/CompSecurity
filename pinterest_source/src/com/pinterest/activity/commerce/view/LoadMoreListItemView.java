// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class LoadMoreListItemView extends FrameLayout
{

    TextView loadingText;
    ProgressBar spinner;

    public LoadMoreListItemView(Context context)
    {
        super(context);
        inflate(context, 0x7f03017c, this);
        loadingText = (TextView)findViewById(0x7f0f03a2);
        spinner = (ProgressBar)findViewById(0x7f0f03a3);
        setLayoutParams(new android.support.v7.widget.RecyclerView.LayoutParams(-1, getResources().getDimensionPixelSize(0x7f0a015e)));
    }

    public void hideLoadingText()
    {
        loadingText.setVisibility(8);
    }

    public void hideSpinner()
    {
        spinner.setVisibility(8);
    }

    public void setLoadingText(int i)
    {
        loadingText.setText(i);
        loadingText.setVisibility(0);
    }

    public void setLoadingText(String s)
    {
        loadingText.setText(s);
        loadingText.setVisibility(0);
    }

    public void showSpinner()
    {
        spinner.setVisibility(0);
    }
}
