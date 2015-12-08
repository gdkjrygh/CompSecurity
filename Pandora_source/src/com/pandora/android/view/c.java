// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class c extends Drawable
{

    private static final int a = Color.parseColor("#FF2e5e75");
    private static final int b = Color.parseColor("#002e5e75");
    private static final int c[] = {
        Color.parseColor("#182458"), Color.parseColor("#161a41"), Color.parseColor("#182552"), Color.parseColor("#2b4081")
    };
    private static final float d[] = {
        0.0F, 0.2F, 0.45F, 1.0F
    };
    private Paint e;
    private Paint f;
    private int g;
    private Paint h;
    private int i;
    private Rect j;
    private boolean k;

    public c()
    {
        e = new Paint();
        f = new Paint();
        h = new Paint();
        h.setColor(0xff000000);
        h.setStyle(android.graphics.Paint.Style.FILL);
        h.setAlpha(0);
    }

    static boolean a(c c1, boolean flag)
    {
        c1.k = flag;
        return flag;
    }

    public void a()
    {
        if (!k)
        {
            return;
        } else
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofObject(this, "dimAlpha", new ArgbEvaluator(), new Object[] {
                Integer.valueOf(i), Integer.valueOf(0)
            });
            objectanimator.addListener(new AnimatorListenerAdapter() {

                final c a;

                public void onAnimationEnd(Animator animator)
                {
                    c.a(a, false);
                }

            
            {
                a = c.this;
                super();
            }
            });
            objectanimator.setDuration(500L).start();
            return;
        }
    }

    public void a(long l)
    {
        ObjectAnimator.ofObject(this, "alpha", new ArgbEvaluator(), new Object[] {
            Integer.valueOf(0), Integer.valueOf(255)
        }).setDuration(l).start();
    }

    public void a(Rect rect, int l)
    {
        if (k)
        {
            return;
        } else
        {
            j = rect;
            i = l;
            ObjectAnimator.ofObject(this, "dimAlpha", new ArgbEvaluator(), new Object[] {
                Integer.valueOf(0), Integer.valueOf(l)
            }).setDuration(500L).start();
            k = true;
            return;
        }
    }

    public void b(long l)
    {
        ObjectAnimator.ofObject(this, "alpha", new ArgbEvaluator(), new Object[] {
            Integer.valueOf(255), Integer.valueOf(0)
        }).setDuration(l).start();
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRect(getBounds(), e);
        canvas.drawCircle(0.0F, 0.0F, g, f);
        if (k)
        {
            canvas.drawRect(j, h);
        }
    }

    public int getOpacity()
    {
        return -2;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        g = rect.width();
        rect = new LinearGradient(0.0F, 0.0F, 0.0F, rect.height(), c, d, android.graphics.Shader.TileMode.REPEAT);
        e.setShader(rect);
        rect = new RadialGradient(0.0F, 0.0F, g, a, b, android.graphics.Shader.TileMode.CLAMP);
        f.setShader(rect);
    }

    public void setAlpha(int l)
    {
        e.setARGB(l, 255, 255, 255);
        f.setARGB(l, 255, 255, 255);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

}
