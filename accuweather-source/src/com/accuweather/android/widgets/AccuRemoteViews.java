// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.TextView;

public class AccuRemoteViews extends RemoteViews
{

    private View layoutForTest;

    public AccuRemoteViews(String s, int i)
    {
        this(s, i, false, null);
    }

    public AccuRemoteViews(String s, int i, boolean flag, Context context)
    {
        super(s, i);
        if (flag && context != null)
        {
            layoutForTest = LayoutInflater.from(context).inflate(i, null);
        }
    }

    public View getLayoutForTest()
    {
        return layoutForTest;
    }

    public void setImageViewResource(int i, int j)
    {
        super.setImageViewResource(i, j);
        if (layoutForTest != null)
        {
            ImageView imageview = (ImageView)layoutForTest.findViewById(i);
            if (imageview != null)
            {
                imageview.setImageResource(j);
            }
        }
    }

    public void setTextViewText(int i, CharSequence charsequence)
    {
        super.setTextViewText(i, charsequence);
        if (layoutForTest != null)
        {
            TextView textview = (TextView)layoutForTest.findViewById(i);
            if (textview != null)
            {
                textview.setText(charsequence);
            }
        }
    }

    public void setViewVisibility(int i, int j)
    {
        super.setViewVisibility(i, j);
        if (layoutForTest != null)
        {
            View view = layoutForTest.findViewById(i);
            if (view != null)
            {
                view.setVisibility(j);
            }
        }
    }
}
