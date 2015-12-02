// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.customfont;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends TextView
{

    private static String a = "TextViewWithFontRegular";

    public CustomTextView(Context context)
    {
        this(context, null);
        setPaintFlags(getPaintFlags() | 0x80);
    }

    public CustomTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
        setPaintFlags(getPaintFlags() | 0x80);
    }

    public CustomTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setPaintFlags(getPaintFlags() | 0x80);
        if (!isInEditMode());
    }

}
