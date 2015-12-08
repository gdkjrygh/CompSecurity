// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class b extends Drawable
{

    private Drawable a;
    private float b;

    public b()
    {
        this(null);
    }

    public b(Drawable drawable)
    {
        b = 1.0F;
        a = drawable;
    }

    static Drawable a(b b1)
    {
        return b1.a;
    }

    public void a(float f)
    {
        b = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas)
    {
        Rect rect = a.getBounds();
        float f = b;
        float f1 = b;
        float f2 = rect.left + rect.width() / 2;
        int i = rect.top;
        canvas.scale(f, f1, f2, rect.height() / 2 + i);
        a.draw(canvas);
        canvas.save();
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return new android.graphics.drawable.Drawable.ConstantState() {

            final b a;

            public int getChangingConfigurations()
            {
                return 0;
            }

            public Drawable newDrawable()
            {
                return new b(b.a(a));
            }

            
            {
                a = b.this;
                super();
            }
        };
    }

    public int getIntrinsicHeight()
    {
        return (int)((double)a.getIntrinsicHeight() * 1.3999999999999999D);
    }

    public int getIntrinsicWidth()
    {
        return (int)((double)a.getIntrinsicWidth() * 1.3999999999999999D);
    }

    public int getOpacity()
    {
        return a.getOpacity();
    }

    protected void onBoundsChange(Rect rect)
    {
        a.setBounds(rect.left, rect.top, rect.right, rect.bottom);
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
