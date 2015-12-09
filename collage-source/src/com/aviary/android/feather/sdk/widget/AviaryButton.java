// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;
import com.aviary.android.feather.sdk.utils.d;

public class AviaryButton extends Button
{

    public AviaryButton(Context context)
    {
        this(context, null);
    }

    public AviaryButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviaryPrimaryButtonStyle);
    }

    public AviaryButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryTextView, i, 0);
        setTypeface(context.getString(2));
        context.recycle();
    }

    public void setTextAppearance(Context context, int i)
    {
        Log.i("View", (new StringBuilder()).append("setTextAppearance: ").append(i).toString());
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
