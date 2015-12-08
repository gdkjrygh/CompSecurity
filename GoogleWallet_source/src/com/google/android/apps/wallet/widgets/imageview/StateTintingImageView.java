// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

public class StateTintingImageView extends ImageView
{

    static final android.graphics.PorterDuff.Mode BLEND_MODE;
    private ColorStateList tint;

    public StateTintingImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.StateTintingImageView, 0, 0);
        tint = context.getColorStateList(com.google.android.apps.walletnfcrel.R.styleable.StateTintingImageView_tint);
        context.recycle();
        updateTintColor();
    }

    private void updateTintColor()
    {
        if (tint != null)
        {
            setColorFilter(tint.getColorForState(getDrawableState(), 0), BLEND_MODE);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        updateTintColor();
    }

    public void setColorFilter(ColorStateList colorstatelist)
    {
        tint = colorstatelist;
        updateTintColor();
    }

    static 
    {
        BLEND_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
    }
}
