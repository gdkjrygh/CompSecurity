// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Gravity;
import com.bumptech.glide.load.resource.a.b;

public class j extends b
{
    static class a extends android.graphics.drawable.Drawable.ConstantState
    {

        private static final Paint d = new Paint(6);
        final Bitmap a;
        int b;
        Paint c;

        void a()
        {
            if (d == c)
            {
                c = new Paint(6);
            }
        }

        void a(int i)
        {
            a();
            c.setAlpha(i);
        }

        void a(ColorFilter colorfilter)
        {
            a();
            c.setColorFilter(colorfilter);
        }

        public int getChangingConfigurations()
        {
            return 0;
        }

        public Drawable newDrawable()
        {
            return new j(null, this);
        }

        public Drawable newDrawable(Resources resources)
        {
            return new j(resources, this);
        }


        public a(Bitmap bitmap)
        {
            c = d;
            a = bitmap;
        }

        a(a a1)
        {
            this(a1.a);
            b = a1.b;
        }
    }


    private final Rect a;
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    private a f;

    public j(Resources resources, Bitmap bitmap)
    {
        this(resources, new a(bitmap));
    }

    j(Resources resources, a a1)
    {
        a = new Rect();
        if (a1 == null)
        {
            throw new NullPointerException("BitmapState must not be null");
        }
        f = a1;
        int i;
        if (resources != null)
        {
            int k = resources.getDisplayMetrics().densityDpi;
            i = k;
            if (k == 0)
            {
                i = 160;
            }
            a1.b = i;
        } else
        {
            i = a1.b;
        }
        b = a1.a.getScaledWidth(i);
        c = a1.a.getScaledHeight(i);
    }

    public void a(int i)
    {
    }

    public boolean a()
    {
        return false;
    }

    public Bitmap b()
    {
        return f.a;
    }

    public void draw(Canvas canvas)
    {
        if (d)
        {
            Gravity.apply(119, b, c, getBounds(), a);
            d = false;
        }
        canvas.drawBitmap(f.a, null, a, f.c);
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return f;
    }

    public int getIntrinsicHeight()
    {
        return c;
    }

    public int getIntrinsicWidth()
    {
        return b;
    }

    public int getOpacity()
    {
        Bitmap bitmap = f.a;
        return bitmap != null && !bitmap.hasAlpha() && f.c.getAlpha() >= 255 ? -1 : -3;
    }

    public boolean isRunning()
    {
        return false;
    }

    public Drawable mutate()
    {
        if (!e && super.mutate() == this)
        {
            f = new a(f);
            e = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        d = true;
    }

    public void setAlpha(int i)
    {
        if (f.c.getAlpha() != i)
        {
            f.a(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        f.a(colorfilter);
        invalidateSelf();
    }

    public void start()
    {
    }

    public void stop()
    {
    }
}
