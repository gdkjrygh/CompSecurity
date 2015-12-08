// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.SeekBar;
import b;
import mk;

public class RelativeSeekBar extends SeekBar
{

    public boolean a;
    public boolean b;
    private final Drawable c;
    private final Drawable d;

    public RelativeSeekBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
        b = true;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            if (android.os.Build.VERSION.SDK_INT > 21)
            {
                int i = (int)getResources().getDimension(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_inset_drawable_insets);
                int j = (int)getResources().getDimension(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_thumb_width_height);
                d = new ShapeDrawable(new OvalShape());
                ((ShapeDrawable)d).setIntrinsicHeight(j - i * 2);
                ((ShapeDrawable)d).setIntrinsicWidth(j - i * 2);
                ((ShapeDrawable)d).getPaint().setColor(getResources().getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_inset_thumb_color));
            } else
            {
                d = getResources().getDrawable(com.google.android.apps.consumerphotoeditor.R.drawable.cpe_inset_thumb_design);
            }
        } else
        {
            d = getResources().getDrawable(com.google.android.apps.consumerphotoeditor.R.drawable.cpe_state_changeable_thumb_design);
        }
        setThumb(d);
        c = d;
    }

    public final void a(int i)
    {
        LayerDrawable layerdrawable;
        if (android.os.Build.VERSION.SDK_INT > 21)
        {
            ((ShapeDrawable)d).getPaint().setColor(i);
            ((ShapeDrawable)c).getPaint().setColor(i);
        } else
        if (android.os.Build.VERSION.SDK_INT == 21)
        {
            ((InsetDrawable)d).setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
            ((InsetDrawable)c).setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
        } else
        {
            ((StateListDrawable)d).setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
            ((StateListDrawable)c).setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        layerdrawable = (LayerDrawable)getProgressDrawable();
        if (layerdrawable != null)
        {
            layerdrawable.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
            ((GradientDrawable)layerdrawable.getDrawable(0)).setColorFilter(getResources().getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_strength_trackbar_background_color), android.graphics.PorterDuff.Mode.SRC_IN);
        }
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L2; else goto _L1
_L1:
        Object obj = (LayerDrawable)getProgressDrawable();
        if (obj == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        int k;
        int l;
        int i1;
        j = getPaddingLeft();
        i = getPaddingRight();
        k = getPaddingTop();
        i1 = getPaddingBottom();
        l = getMax();
        if (l <= 0) goto _L6; else goto _L5
_L5:
        float f1 = (float)getProgress() / (float)l;
_L17:
        float f = f1;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        f1 -= 0.5F;
        f = f1;
        if (mk.h(this) == 1)
        {
            f = -f1;
        }
        if (!b) goto _L8; else goto _L7
_L7:
        if (!a) goto _L10; else goto _L9
_L9:
        setProgress(l / 2);
        f = 0.0F;
_L8:
        l = canvas.save();
        GradientDrawable gradientdrawable = (GradientDrawable)((LayerDrawable) (obj)).getDrawable(0);
        obj = (ClipDrawable)((LayerDrawable) (obj)).getDrawable(2);
        canvas.save();
        canvas.translate(j, k);
        gradientdrawable.draw(canvas);
        canvas.restore();
        canvas.clipRect(j, k, getWidth() - i, getHeight() - i1);
        if (!a) goto _L12; else goto _L11
_L11:
        i1 = (getWidth() - j - i) / 2;
        if (f >= 0.0F)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        i = (int)((float)(getWidth() - j - i) * f);
_L20:
        canvas.translate(i + (j + i1), k);
_L18:
        ((ClipDrawable) (obj)).setLevel((int)(Math.abs(f) * 10000F));
        ((ClipDrawable) (obj)).draw(canvas);
        canvas.restoreToCount(l);
_L4:
        Drawable drawable = getThumb();
        if (drawable == null) goto _L14; else goto _L13
_L13:
        canvas.save();
        canvas.translate(getPaddingLeft() - getThumbOffset(), getPaddingTop());
        if (!b) goto _L16; else goto _L15
_L15:
        setThumb(c);
        c.draw(canvas);
        setThumb(drawable);
_L19:
        canvas.restore();
_L14:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        f1 = 0.0F;
          goto _L17
_L10:
        setProgress(0);
          goto _L8
_L12:
        if (mk.h(this) != 0)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        canvas.translate(j, k);
          goto _L18
        canvas;
        throw canvas;
        canvas.translate((int)((1.0F - f) * (float)(getWidth() - j - i)) + j, k);
          goto _L18
_L16:
        drawable.draw(canvas);
          goto _L19
_L2:
        super.onDraw(canvas);
          goto _L14
        i = 0;
          goto _L20
    }

    public boolean performAccessibilityAction(int i, Bundle bundle)
    {
        if (!super.performAccessibilityAction(i, bundle))
        {
            return false;
        }
        if (i == 4096 || i == 8192)
        {
            bundle = getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_filter_slider_value, new Object[] {
                Integer.valueOf((getProgress() * 100) / getMax())
            });
            b.a(getContext(), bundle, this);
        }
        return true;
    }
}
