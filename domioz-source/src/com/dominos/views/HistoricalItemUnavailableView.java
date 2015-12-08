// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HistoricalItemUnavailableView extends LinearLayout
{

    TextView mDescriptionView;

    public HistoricalItemUnavailableView(Context context)
    {
        super(context);
    }

    public HistoricalItemUnavailableView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void setDescription(String s)
    {
        mDescriptionView.setText(s);
    }
}
