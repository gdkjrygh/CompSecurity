// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.aviary.android.feather.sdk.a.b;

public class AviaryGalleryTopIndicatorView extends LinearLayout
{

    public AviaryGalleryTopIndicatorView(Context context)
    {
        this(context, null);
    }

    public AviaryGalleryTopIndicatorView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviaryGalleryTopIndicatorStyle);
    }

    public AviaryGalleryTopIndicatorView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryGalleryIndicatorView, i, 0);
        i = attributeset.getResourceId(0, 0);
        attributeset.recycle();
        if (i != 0)
        {
            setBackgroundDrawable(new b(context, 0, i));
            return;
        } else
        {
            setBackgroundDrawable(new b(context));
            return;
        }
    }
}
