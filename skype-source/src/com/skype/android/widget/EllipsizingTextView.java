// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class EllipsizingTextView extends TextView
{

    public EllipsizingTextView(Context context)
    {
        super(context);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (getWidth() != 0 && flag)
        {
            setText(getText());
        }
    }
}
