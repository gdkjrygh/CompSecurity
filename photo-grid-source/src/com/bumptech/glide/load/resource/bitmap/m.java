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

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            n

public class m extends b
{

    private final Rect a;
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    private n f;

    public m(Resources resources, Bitmap bitmap)
    {
        this(resources, new n(bitmap));
    }

    m(Resources resources, n n1)
    {
        a = new Rect();
        if (n1 == null)
        {
            throw new NullPointerException("BitmapState must not be null");
        }
        f = n1;
        int i;
        if (resources != null)
        {
            int j = resources.getDisplayMetrics().densityDpi;
            i = j;
            if (j == 0)
            {
                i = 160;
            }
            n1.b = i;
        } else
        {
            i = n1.b;
        }
        b = n1.a.getScaledWidth(i);
        c = n1.a.getScaledHeight(i);
    }

    public final void a(int i)
    {
    }

    public final boolean a()
    {
        return false;
    }

    public final Bitmap b()
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
            f = new n(f);
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
            n n1 = f;
            n1.a();
            n1.c.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        n n1 = f;
        n1.a();
        n1.c.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public void start()
    {
    }

    public void stop()
    {
    }
}
