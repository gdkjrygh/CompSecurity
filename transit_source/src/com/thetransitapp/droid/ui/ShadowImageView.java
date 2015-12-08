// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ShadowImageView extends ImageView
{

    private Bitmap cacheBitmap;
    private Drawable cachedDrawable;
    private ColorFilter colorFilter;
    private boolean paddingSet;
    private ColorFilter pressedColorFilter;
    private ColorFilter shadowColorFilter;
    private float shadowDx;
    private float shadowDy;

    public ShadowImageView(Context context)
    {
        super(context);
        colorFilter = null;
        shadowColorFilter = null;
        pressedColorFilter = null;
    }

    public ShadowImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        colorFilter = null;
        shadowColorFilter = null;
        pressedColorFilter = null;
    }

    public ShadowImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        colorFilter = null;
        shadowColorFilter = null;
        pressedColorFilter = null;
    }

    protected void onDraw(Canvas canvas)
    {
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            if (cacheBitmap == null || cachedDrawable != drawable)
            {
                cacheBitmap = Bitmap.createBitmap(super.getWidth(), super.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                Canvas canvas1 = new Canvas(cacheBitmap);
                if (shadowColorFilter != null)
                {
                    getDrawable().setColorFilter(shadowColorFilter);
                    float f;
                    float f1;
                    if (shadowDx > 0.0F)
                    {
                        f = shadowDx;
                    } else
                    {
                        f = 0.0F;
                    }
                    if (shadowDy > 0.0F)
                    {
                        f1 = shadowDy;
                    } else
                    {
                        f1 = 0.0F;
                    }
                    canvas1.translate(f, f1);
                    super.onDraw(canvas1);
                    canvas1.translate(-shadowDx, -shadowDy);
                }
                if (isPressed() && pressedColorFilter != null)
                {
                    getDrawable().setColorFilter(pressedColorFilter);
                } else
                {
                    getDrawable().setColorFilter(colorFilter);
                }
                super.onDraw(canvas1);
                cachedDrawable = drawable;
            }
            canvas.drawBitmap(cacheBitmap, 0.0F, 0.0F, null);
        }
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        colorFilter = colorfilter;
        cacheBitmap = null;
        invalidate();
    }

    public void setPressedColorFilter(ColorFilter colorfilter)
    {
        pressedColorFilter = colorfilter;
        cacheBitmap = null;
        invalidate();
    }

    public void setShadowLayer(float f, float f1, float f2, int i)
    {
        shadowColorFilter = new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
        shadowDx = f1;
        shadowDy = f2;
        if (!paddingSet)
        {
            super.setPadding(super.getPaddingLeft(), super.getPaddingTop(), (int)((float)super.getPaddingRight() + Math.abs(shadowDx)), (int)((float)super.getPaddingBottom() + Math.abs(shadowDy)));
            paddingSet = true;
        }
        cacheBitmap = null;
        invalidate();
    }
}
