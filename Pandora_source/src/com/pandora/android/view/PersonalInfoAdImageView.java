// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class PersonalInfoAdImageView extends ImageView
{

    public PersonalInfoAdImageView(Context context)
    {
        super(context);
    }

    public PersonalInfoAdImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PersonalInfoAdImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            i = android.view.View.MeasureSpec.getSize(i);
            setMeasuredDimension(i, (drawable.getIntrinsicHeight() * i) / drawable.getIntrinsicWidth());
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }
}
