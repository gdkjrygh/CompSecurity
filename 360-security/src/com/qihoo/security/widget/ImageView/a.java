// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.ImageView;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.LevelListDrawable;

public class a extends LevelListDrawable
{

    Paint a;
    Bitmap b;
    Canvas c;
    int d[];
    private int e;
    private int f;
    private Bitmap g;
    private float h;
    private int i[];

    public a()
    {
        a = new Paint();
        d = new int[2];
        h = 1.0F;
        i = new int[5];
    }

    private boolean d()
    {
        int ai[] = new int[5];
        ai[0] = b.getPixel(e / 4, f / 4);
        ai[1] = b.getPixel(e / 4, (f * 3) / 4);
        ai[2] = b.getPixel((e * 3) / 4, f / 4);
        ai[3] = b.getPixel((e * 3) / 4, (f * 3) / 4);
        ai[4] = b.getPixel(e / 2, f / 2);
        for (int j = 0; j < i.length; j++)
        {
            if (ai[j] != i[j])
            {
                i = ai;
                return false;
            }
        }

        return true;
    }

    private void e()
    {
        if (g == null)
        {
            f();
            return;
        }
        if (!g.isRecycled())
        {
            g.recycle();
            g = null;
        }
        f();
    }

    private void f()
    {
        Paint paint = new Paint();
        paint.setMaskFilter(new BlurMaskFilter(20F, android.graphics.BlurMaskFilter.Blur.OUTER));
        try
        {
            g = b.extractAlpha(paint, d);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public Canvas a()
    {
        if (c == null)
        {
            try
            {
                i = new int[5];
                b = Bitmap.createBitmap(e, f, android.graphics.Bitmap.Config.ARGB_4444);
                c = new Canvas(b);
            }
            catch (Exception exception) { }
        }
        return c;
    }

    public void a(float f1)
    {
        h = f1;
    }

    public void a(int j)
    {
        a.setColor(j);
    }

    public void b()
    {
        if (b != null && !b.isRecycled())
        {
            if (d())
            {
                if (g == null || g.isRecycled())
                {
                    f();
                    return;
                }
            } else
            {
                e();
                return;
            }
        }
    }

    public void b(int j)
    {
        e = j;
    }

    public void c()
    {
        if (b != null && !b.isRecycled())
        {
            b.recycle();
            b = null;
            c = null;
            i = null;
        }
        if (g != null && !g.isRecycled())
        {
            g.recycle();
            g = null;
        }
    }

    public void c(int j)
    {
        f = j;
    }

    public void draw(Canvas canvas)
    {
        b();
        if (g == null || g.isRecycled())
        {
            return;
        } else
        {
            a.setAlpha(getLevel());
            canvas.drawBitmap(g, d[0], d[1], a);
            return;
        }
    }
}
