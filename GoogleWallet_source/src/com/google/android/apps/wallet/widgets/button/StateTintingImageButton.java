// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class StateTintingImageButton extends ImageButton
{

    private boolean isLollipop;
    private ColorStateList tint;

    public StateTintingImageButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isLollipop = flag;
        context = context.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.StateTintingImageButton, 0, 0);
        tint = context.getColorStateList(com.google.android.apps.walletnfcrel.R.styleable.StateTintingImageButton_tint);
        context.recycle();
        if (isLollipop)
        {
            setImageTintList(tint);
        }
        updateTintColor();
    }

    private void updateTintColor()
    {
        if (!isLollipop && tint != null)
        {
            setColorFilter(tint.getColorForState(getDrawableState(), 0), android.graphics.PorterDuff.Mode.SRC_IN);
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
        if (isLollipop)
        {
            setImageTintList(colorstatelist);
        }
        updateTintColor();
    }
}
