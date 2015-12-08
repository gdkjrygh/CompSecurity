// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class TutorialProgressStrip extends RelativeLayout
{

    private static final int PROGRESS_CELL_ID = 0x1e240;

    public TutorialProgressStrip(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(com.accuweather.android.R.layout.first_launch_progress_strip, this);
    }

    public final void setTutorialPageIndex(int i)
    {
        ViewGroup viewgroup = (ViewGroup)findViewById(com.accuweather.android.R.id.indicator_layout);
        if (viewgroup != null)
        {
            int k = getResources().getColor(com.accuweather.android.R.color.first_launch_background_color);
            int l = getResources().getColor(com.accuweather.android.R.color.white);
            int j = 0;
            while (j < viewgroup.getChildCount()) 
            {
                View view = ((ViewGroup)viewgroup.getChildAt(j)).findViewById(0x1e240);
                if (j <= i)
                {
                    if (view != null)
                    {
                        view.setBackgroundColor(k);
                    }
                } else
                if (view != null)
                {
                    view.setBackgroundColor(l);
                }
                j++;
            }
        }
    }

    public final void showNumberOfProgressStripCells(int i)
    {
        LinearLayout linearlayout = (LinearLayout)findViewById(com.accuweather.android.R.id.indicator_layout);
        linearlayout.removeAllViews();
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        for (int j = 0; j < i; j++)
        {
            LinearLayout linearlayout1 = new LinearLayout(getContext());
            linearlayout1.setOrientation(0);
            if (j > 0)
            {
                View view = new View(getContext());
                view.setBackgroundColor(getResources().getColor(com.accuweather.android.R.color.tertiary_text));
                linearlayout1.addView(view, new android.view.ViewGroup.LayoutParams((int)(4F * displaymetrics.density), -1));
            }
            View view1 = new View(getContext());
            view1.setId(0x1e240);
            linearlayout1.addView(view1, new android.view.ViewGroup.LayoutParams(-1, -1));
            linearlayout.addView(linearlayout1, new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F));
        }

    }
}
