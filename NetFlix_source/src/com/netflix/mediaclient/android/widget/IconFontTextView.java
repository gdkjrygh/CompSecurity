// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class IconFontTextView extends TextView
{

    private static Typeface iconTypeface;

    public IconFontTextView(Context context)
    {
        super(context);
        init();
    }

    public IconFontTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public IconFontTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        if (iconTypeface == null)
        {
            iconTypeface = Typeface.createFromAsset(getContext().getAssets(), "nf-icon.ttf");
        }
        setTypeface(iconTypeface);
    }
}
