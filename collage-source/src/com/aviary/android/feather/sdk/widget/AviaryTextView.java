// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.aviary.android.feather.sdk.utils.d;

public class AviaryTextView extends TextView
{

    public AviaryTextView(Context context)
    {
        super(context);
    }

    public AviaryTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviaryDefaultTextStyle);
    }

    public AviaryTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryTextView, i, 0);
        setTypeface(context.getString(2));
        context.recycle();
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
    }

    public void setTypeface(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        setTypeface(d.a(getContext().getAssets(), s));
        return;
        s;
    }
}
