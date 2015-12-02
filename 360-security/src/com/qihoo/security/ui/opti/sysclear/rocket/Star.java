// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear.rocket;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.nineoldandroids.a.a;

public class Star
{

    protected float a;
    protected float b;
    protected float c;
    protected float d;
    protected int e;
    protected boolean f;
    protected a g;
    protected Drawable h;

    public Star()
    {
        a = 0.0F;
        b = 0.0F;
        c = 0.0F;
        d = 1.0F;
        e = 255;
        f = false;
    }

    public Star(Drawable drawable, float f1, float f2)
    {
        a = 0.0F;
        b = 0.0F;
        c = 0.0F;
        d = 1.0F;
        e = 255;
        f = false;
        h = drawable;
        a = f1;
        b = f2;
    }

    public void draw(Canvas canvas, Rect rect)
    {
        if (h != null)
        {
            Rect rect1 = h.getBounds();
            if (rect.intersect(rect1))
            {
                float f1 = rect1.width() / 2 + rect1.left;
                int i = rect1.height() / 2;
                float f2 = rect1.top + i;
                canvas.save();
                canvas.translate(a, b);
                if (c % 360F != 0.0F)
                {
                    canvas.rotate(90F - c, f1, f2);
                }
                if (d != 1.0F)
                {
                    canvas.scale(d, d, f1, f2);
                }
                h.draw(canvas);
                canvas.restore();
            }
        }
    }

    public int getAlpha()
    {
        return e;
    }

    public float getAngle()
    {
        return c;
    }

    public a getAnimator()
    {
        return g;
    }

    public Drawable getImage()
    {
        return h;
    }

    public float getScale()
    {
        return d;
    }

    public float getX()
    {
        return a;
    }

    public float getY()
    {
        return b;
    }

    public boolean isDied()
    {
        return f;
    }

    public void setAlpha(int i)
    {
        e = i;
    }

    public void setAngle(float f1)
    {
        c = f1;
    }

    public void setAnimator(a a1)
    {
        g = a1;
        g.a(new com.nineoldandroids.a.a.a() {

            final Star a;

            public void a(a a2)
            {
            }

            public void b(a a2)
            {
                a.setDied(true);
            }

            public void c(a a2)
            {
            }

            public void d(a a2)
            {
            }

            
            {
                a = Star.this;
                super();
            }
        });
    }

    public void setDied(boolean flag)
    {
        f = flag;
    }

    public void setImage(Drawable drawable)
    {
        h = drawable;
    }

    public void setScale(float f1)
    {
        d = f1;
    }

    public void setX(float f1)
    {
        a = f1;
    }

    public void setY(float f1)
    {
        b = f1;
    }

    public void start()
    {
        if (g != null)
        {
            g.a();
        }
    }
}
