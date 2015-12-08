// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WarningView extends LinearLayout
{

    LinearLayout mWarningRootLayout;
    TextView mWarningTextView;

    public WarningView(Context context)
    {
        super(context);
    }

    public WarningView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void hide()
    {
        mWarningRootLayout.setVisibility(8);
    }

    public void setWarningMessage(String s)
    {
        mWarningTextView.setText(s);
    }

    public void show()
    {
        mWarningRootLayout.setVisibility(0);
    }
}
