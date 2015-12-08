// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

final class afr extends Drawable
{

    static afs b;
    private static double f = Math.cos(Math.toRadians(45D));
    final int a;
    float c;
    float d;
    boolean e;
    private Paint g;
    private Paint h;
    private Paint i;
    private RectF j;
    private Path k;
    private float l;
    private float m;
    private boolean n;
    private final int o;
    private final int p;
    private boolean q;

    afr(Resources resources, int i1, float f1, float f2, float f3)
    {
        n = true;
        e = true;
        q = false;
        o = resources.getColor(b.bQ);
        p = resources.getColor(b.bP);
        a = resources.getDimensionPixelSize(b.bR);
        g = new Paint(5);
        g.setColor(i1);
        h = new Paint(5);
        h.setStyle(android.graphics.Paint.Style.FILL);
        c = (int)(f1 + 0.5F);
        j = new RectF();
        i = new Paint(h);
        i.setAntiAlias(false);
        if (f2 < 0.0F || f3 < 0.0F)
        {
            throw new IllegalArgumentException("invalid shadow size");
        }
        f2 = a(f2);
        f3 = a(f3);
        f1 = f2;
        if (f2 > f3)
        {
            if (!q)
            {
                q = true;
            }
            f1 = f3;
        }
        if (m != f1 || d != f3)
        {
            m = f1;
            d = f3;
            l = (int)(f1 * 1.5F + (float)a + 0.5F);
            n = true;
            invalidateSelf();
        }
    }

    static float a(float f1, float f2, boolean flag)
    {
        if (flag)
        {
            return (float)((double)(1.5F * f1) + (1.0D - f) * (double)f2);
        } else
        {
            return 1.5F * f1;
        }
    }

    private static int a(float f1)
    {
        int j1 = (int)(0.5F + f1);
        int i1 = j1;
        if (j1 % 2 == 1)
        {
            i1 = j1 - 1;
        }
        return i1;
    }

    static float b(float f1, float f2, boolean flag)
    {
        float f3 = f1;
        if (flag)
        {
            f3 = (float)((double)f1 + (1.0D - f) * (double)f2);
        }
        return f3;
    }

    public final void draw(Canvas canvas)
    {
        boolean flag = true;
        int i1;
        if (n)
        {
            Object obj = getBounds();
            float f1 = d * 1.5F;
            j.set((float)((Rect) (obj)).left + d, (float)((Rect) (obj)).top + f1, (float)((Rect) (obj)).right - d, (float)((Rect) (obj)).bottom - f1);
            obj = new RectF(-c, -c, c, c);
            Object obj1 = new RectF(((RectF) (obj)));
            ((RectF) (obj1)).inset(-l, -l);
            float f2;
            float f3;
            float f4;
            int j1;
            int k1;
            if (k == null)
            {
                k = new Path();
            } else
            {
                k.reset();
            }
            k.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            k.moveTo(-c, 0.0F);
            k.rLineTo(-l, 0.0F);
            k.arcTo(((RectF) (obj1)), 180F, 90F, false);
            k.arcTo(((RectF) (obj)), 270F, -90F, false);
            k.close();
            f1 = c / (c + l);
            obj = h;
            f2 = c;
            f3 = l;
            i1 = o;
            j1 = o;
            k1 = p;
            obj1 = android.graphics.Shader.TileMode.CLAMP;
            ((Paint) (obj)).setShader(new RadialGradient(0.0F, 0.0F, f2 + f3, new int[] {
                i1, j1, k1
            }, new float[] {
                0.0F, f1, 1.0F
            }, ((android.graphics.Shader.TileMode) (obj1))));
            obj = i;
            f1 = -c;
            f2 = l;
            f3 = -c;
            f4 = l;
            i1 = o;
            j1 = o;
            k1 = p;
            obj1 = android.graphics.Shader.TileMode.CLAMP;
            ((Paint) (obj)).setShader(new LinearGradient(0.0F, f1 + f2, 0.0F, f3 - f4, new int[] {
                i1, j1, k1
            }, new float[] {
                0.0F, 0.5F, 1.0F
            }, ((android.graphics.Shader.TileMode) (obj1))));
            i.setAntiAlias(false);
            n = false;
        }
        canvas.translate(0.0F, m / 2.0F);
        f1 = -c - l;
        f2 = c + (float)a + m / 2.0F;
        if (j.width() - f2 * 2.0F > 0.0F)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (j.height() - f2 * 2.0F <= 0.0F)
        {
            flag = false;
        }
        j1 = canvas.save();
        canvas.translate(j.left + f2, j.top + f2);
        canvas.drawPath(k, h);
        if (i1 != 0)
        {
            canvas.drawRect(0.0F, f1, j.width() - f2 * 2.0F, -c, i);
        }
        canvas.restoreToCount(j1);
        j1 = canvas.save();
        canvas.translate(j.right - f2, j.bottom - f2);
        canvas.rotate(180F);
        canvas.drawPath(k, h);
        if (i1 != 0)
        {
            f3 = j.width();
            f4 = -c;
            canvas.drawRect(0.0F, f1, f3 - f2 * 2.0F, l + f4, i);
        }
        canvas.restoreToCount(j1);
        i1 = canvas.save();
        canvas.translate(j.left + f2, j.bottom - f2);
        canvas.rotate(270F);
        canvas.drawPath(k, h);
        if (flag)
        {
            canvas.drawRect(0.0F, f1, j.height() - f2 * 2.0F, -c, i);
        }
        canvas.restoreToCount(i1);
        i1 = canvas.save();
        canvas.translate(j.right - f2, j.top + f2);
        canvas.rotate(90F);
        canvas.drawPath(k, h);
        if (flag)
        {
            canvas.drawRect(0.0F, f1, j.height() - f2 * 2.0F, -c, i);
        }
        canvas.restoreToCount(i1);
        canvas.translate(0.0F, -m / 2.0F);
        b.a(canvas, j, c, g);
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final boolean getPadding(Rect rect)
    {
        int i1 = (int)Math.ceil(a(d, c, e));
        int j1 = (int)Math.ceil(b(d, c, e));
        rect.set(j1, i1, j1, i1);
        return true;
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        n = true;
    }

    public final void setAlpha(int i1)
    {
        g.setAlpha(i1);
        h.setAlpha(i1);
        i.setAlpha(i1);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        g.setColorFilter(colorfilter);
        h.setColorFilter(colorfilter);
        i.setColorFilter(colorfilter);
    }

}
