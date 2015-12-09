// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.swatchpicker;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.google.common.primitives.Ints;

public final class SwatchDrawable extends GradientDrawable
{

    private final ColorStateList highlightColorStateList;
    private final int highlightThickness;
    private final Drawable icon;
    private boolean selectedState;

    public SwatchDrawable(Resources resources, int i)
    {
        this(resources, ((Drawable) (null)));
        setColor(i);
    }

    public SwatchDrawable(Resources resources, Drawable drawable)
    {
        setColor(resources.getColor(0x106000d));
        icon = drawable;
        highlightColorStateList = resources.getColorStateList(com.google.android.apps.walletnfcrel.R.color.swatch_highlight_color);
        highlightThickness = resources.getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.swatch_picker_highlight_thickness);
        setStroke(highlightThickness, 0);
        setCornerRadius(resources.getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.swatch_picker_item_corner_radius));
    }

    public final void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (icon != null)
        {
            icon.setBounds(getBounds());
            icon.draw(canvas);
        }
    }

    public final int getOpacity()
    {
        return -2;
    }

    public final boolean isStateful()
    {
        return true;
    }

    protected final boolean onStateChange(int ai[])
    {
        boolean flag = false;
        boolean flag1 = Ints.contains(ai, 0x10100a1);
        if (selectedState != flag1)
        {
            int i = highlightColorStateList.getColorForState(ai, 0);
            setStroke(highlightThickness, i);
            selectedState = flag1;
            flag = true;
        }
        return flag;
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
