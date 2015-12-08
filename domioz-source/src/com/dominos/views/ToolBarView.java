// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ToolBarView extends RelativeLayout
{

    ImageButton mHomeButton;
    TextView mToolBarTitleTextView;

    public ToolBarView(Context context)
    {
        super(context);
    }

    public ToolBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ToolBarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void setHomeButtonVisibility(int i)
    {
        mHomeButton.setVisibility(i);
    }

    public void setTitle(String s)
    {
        mToolBarTitleTextView.setText(s);
    }
}
