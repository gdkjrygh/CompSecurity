// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import dgd;

public class SuppressLayoutTextView extends TextView
{

    public boolean a;

    public SuppressLayoutTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setTypeface(dgd.b(context, 0x7f0101d8));
    }

    public void requestLayout()
    {
        if (!a)
        {
            super.requestLayout();
        }
    }
}
