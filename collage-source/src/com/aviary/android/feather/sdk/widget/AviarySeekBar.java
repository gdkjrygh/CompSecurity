// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class AviarySeekBar extends SeekBar
{

    protected Drawable a;
    protected Drawable b;
    protected Drawable c;
    protected int d;
    protected int e;
    protected double f;
    protected int g;
    private int h;
    private Drawable i;

    public AviarySeekBar(Context context)
    {
        this(context, null);
    }

    public AviarySeekBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviarySeekBarStyle);
    }

    public AviarySeekBar(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        context = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviarySeekBar, j, 0);
        attributeset = context.getDrawable(0);
        j = context.getDimensionPixelOffset(1, 0);
        a = context.getDrawable(2);
        b = context.getDrawable(3);
        c = context.getDrawable(4);
        context.recycle();
        d = a.getIntrinsicWidth();
        e = a.getIntrinsicHeight();
        f = (double)d * 0.5D;
        g = (int)((double)getProgressDrawable().getIntrinsicWidth() * 0.12D);
        setThumb(attributeset);
        setThumbOffset(j);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        int ai[] = getDrawableState();
        a.setState(ai);
        b.setState(ai);
        c.setState(ai);
    }

    protected void onDraw(Canvas canvas)
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        int k = h;
        if (k >= 1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        double d1;
        double d2;
        double d3;
        d1 = ((double)getProgress() - 50D) / 50D;
        d2 = -getPaddingLeft();
        d2 = (double)getWidth() / 2D + d2;
        d3 = ((double)h * d1) / 2D;
        if (!(getProgressDrawable() instanceof LayerDrawable)) goto _L4; else goto _L3
_L3:
        LayerDrawable layerdrawable = (LayerDrawable)getProgressDrawable();
        Drawable drawable = null;
        if (d1 <= 0.0D) goto _L6; else goto _L5
_L5:
        k = (int)(d2 - f);
        j = (int)((double)k + d3 + f);
        drawable = a;
_L8:
        int l;
        int i1;
        i1 = j;
        l = k;
        if (j - k < d)
        {
            l = (int)(d2 - (double)(d / 2));
            i1 = (int)((double)(d / 2) + d2);
            drawable = c;
        }
        if (i != drawable)
        {
            i = drawable;
            layerdrawable.setDrawableByLayerId(0x102000f, i);
        }
        if (drawable == null) goto _L4; else goto _L7
_L7:
        drawable.setBounds(l, 0, i1, e);
_L4:
        super.onDraw(canvas);
          goto _L1
        canvas;
        throw canvas;
_L6:
        if (d1 >= 0.0D)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        k = (int)(d2 + d3);
        j = (int)(f + d2);
        drawable = b;
          goto _L8
        k = 0;
          goto _L8
    }

    protected void onSizeChanged(int j, int k, int l, int i1)
    {
        super.onSizeChanged(j, k, l, i1);
        h = j - (getPaddingLeft() + getPaddingRight()) - g;
    }
}
