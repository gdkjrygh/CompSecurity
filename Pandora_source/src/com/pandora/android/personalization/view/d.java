// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class d extends Drawable
{

    private int a;
    private RectF b;
    private final Paint c = new Paint(1);
    private Paint d;
    private float e;
    private final float f;
    private float g;
    private final boolean h;
    private final int i;

    public d(int j, float f1, float f2, boolean flag)
    {
        g = 353F;
        f = f2;
        e = f1;
        i = j;
        b = new RectF();
        c.setColor(i);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        d = new Paint(1);
        d.setStyle(android.graphics.Paint.Style.STROKE);
        d.setColor(0);
        h = flag;
        a();
    }

    static int a(d d1)
    {
        return d1.i;
    }

    private Path a(float f1)
    {
        Path path = new Path();
        path.moveTo(0.0F, 0.0F);
        path.addCircle(0.0F, 0.0F, f1, android.graphics.Path.Direction.CW);
        path.close();
        return path;
    }

    private void a()
    {
        PathDashPathEffect pathdashpatheffect = new PathDashPathEffect(a(e), f + e, 0.0F, android.graphics.PathDashPathEffect.Style.ROTATE);
        c.setPathEffect(pathdashpatheffect);
        pathdashpatheffect = new PathDashPathEffect(a(e * 2.0F), f + e, 0.0F, android.graphics.PathDashPathEffect.Style.ROTATE);
        d.setPathEffect(pathdashpatheffect);
    }

    static float b(d d1)
    {
        return d1.e;
    }

    static float c(d d1)
    {
        return d1.f;
    }

    static boolean d(d d1)
    {
        return d1.h;
    }

    public void a(int j)
    {
        c.setColor(j);
        invalidateSelf();
    }

    public void a(boolean flag, int j)
    {
        if (flag)
        {
            d.setColor(j);
        } else
        {
            d.setColor(0);
        }
        a();
    }

    public void draw(Canvas canvas)
    {
        canvas.drawArc(b, 270F, g, false, d);
        canvas.drawArc(b, 270F, g, false, c);
        canvas.save();
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return new android.graphics.drawable.Drawable.ConstantState() {

            final d a;

            public int getChangingConfigurations()
            {
                return 0;
            }

            public Drawable newDrawable()
            {
                return new d(d.a(a), d.b(a), d.c(a), d.d(a));
            }

            
            {
                a = d.this;
                super();
            }
        };
    }

    public int getOpacity()
    {
        return -2;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        b.left = (float)rect.left + e;
        b.top = (float)rect.top + e;
        b.right = (float)rect.right - e;
        b.bottom = (float)rect.bottom - e;
    }

    protected boolean onLevelChange(int j)
    {
        if (!h)
        {
            g = (int)(356D * ((double)j / 100D));
            invalidateSelf();
        }
        return true;
    }

    public void setAlpha(int j)
    {
        a = j;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
