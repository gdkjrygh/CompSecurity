// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;

public class g extends Drawable
{

    private Drawable a;
    private float b;
    private long c;
    private float d;
    private Runnable e;

    public g(Drawable drawable, float f)
    {
        c = 0L;
        d = 0.0F;
        e = new Runnable() {

            final g a;

            public void run()
            {
                a.invalidateSelf();
            }

            
            {
                a = g.this;
                super();
            }
        };
        a = drawable;
        b = f;
    }

    public void draw(Canvas canvas)
    {
        long l = 0L;
        int i = canvas.save();
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        float f;
        if (c != 0L)
        {
            l = l1 - c;
        }
        c = l1;
        f = d;
        d = ((float)l / 1000F) * b + f;
        d = d % 360F;
        canvas.rotate(d, getBounds().centerX(), getBounds().centerY());
        a.draw(canvas);
        canvas.restoreToCount(i);
        scheduleSelf(e, 10L);
    }

    public int getIntrinsicHeight()
    {
        return a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth()
    {
        return a.getIntrinsicWidth();
    }

    public int getMinimumHeight()
    {
        return a.getMinimumHeight();
    }

    public int getMinimumWidth()
    {
        return a.getMinimumWidth();
    }

    public int getOpacity()
    {
        return a.getOpacity();
    }

    protected void onBoundsChange(Rect rect)
    {
        a.setBounds(rect);
    }

    public void setAlpha(int i)
    {
        a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
    }
}
