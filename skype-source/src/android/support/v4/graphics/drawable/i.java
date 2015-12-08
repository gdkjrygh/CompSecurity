// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public abstract class i extends Drawable
{

    final Bitmap a;
    final Rect b = new Rect();
    private int c;
    private int d;
    private final Paint e = new Paint(3);
    private final BitmapShader f;
    private final Matrix g = new Matrix();
    private float h;
    private final RectF i = new RectF();
    private boolean j;
    private boolean k;
    private int l;
    private int m;

    i(Resources resources, Bitmap bitmap)
    {
        c = 160;
        d = 119;
        j = true;
        if (resources != null)
        {
            c = resources.getDisplayMetrics().densityDpi;
        }
        a = bitmap;
        if (a != null)
        {
            l = a.getScaledWidth(c);
            m = a.getScaledHeight(c);
            f = new BitmapShader(a, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            return;
        } else
        {
            m = -1;
            l = -1;
            f = null;
            return;
        }
    }

    final void a()
    {
        if (j)
        {
            if (k)
            {
                int i1 = Math.min(l, m);
                a(d, i1, i1, getBounds(), b);
                i1 = Math.min(b.width(), b.height());
                int j1 = Math.max(0, (b.width() - i1) / 2);
                int k1 = Math.max(0, (b.height() - i1) / 2);
                b.inset(j1, k1);
                h = 0.5F * (float)i1;
            } else
            {
                a(d, l, m, getBounds(), b);
            }
            i.set(b);
            if (f != null)
            {
                g.setTranslate(i.left, i.top);
                g.preScale(i.width() / (float)a.getWidth(), i.height() / (float)a.getHeight());
                f.setLocalMatrix(g);
                e.setShader(f);
            }
            j = false;
        }
    }

    void a(int i1, int j1, int k1, Rect rect, Rect rect1)
    {
        throw new UnsupportedOperationException();
    }

    public final float b()
    {
        return h;
    }

    public void draw(Canvas canvas)
    {
        Bitmap bitmap = a;
        if (bitmap == null)
        {
            return;
        }
        a();
        if (e.getShader() == null)
        {
            canvas.drawBitmap(bitmap, null, b, e);
            return;
        } else
        {
            canvas.drawRoundRect(i, h, h, e);
            return;
        }
    }

    public int getAlpha()
    {
        return e.getAlpha();
    }

    public ColorFilter getColorFilter()
    {
        return e.getColorFilter();
    }

    public int getIntrinsicHeight()
    {
        return m;
    }

    public int getIntrinsicWidth()
    {
        return l;
    }

    public int getOpacity()
    {
        Bitmap bitmap;
        if (d == 119 && !k)
        {
            if ((bitmap = a) != null && !bitmap.hasAlpha() && e.getAlpha() >= 255)
            {
                boolean flag;
                if (h > 0.05F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    return -1;
                }
            }
        }
        return -3;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        if (k)
        {
            h = Math.min(m, l) / 2;
        }
        j = true;
    }

    public void setAlpha(int i1)
    {
        if (i1 != e.getAlpha())
        {
            e.setAlpha(i1);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        e.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public void setDither(boolean flag)
    {
        e.setDither(flag);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean flag)
    {
        e.setFilterBitmap(flag);
        invalidateSelf();
    }
}
