// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class VariantHelpTextView extends FrameLayout
{

    TextView _helpText;

    public VariantHelpTextView(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f0301b6, this);
        ButterKnife.a(this);
    }

    public void setText(String s)
    {
        _helpText.setText(s);
    }
}
