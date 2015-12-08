// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

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

class RoundRectDrawableWithShadow extends Drawable
{

    static final double a = Math.cos(Math.toRadians(45D));
    static RoundRectHelper c;
    final int b;
    Paint d;
    Paint e;
    Paint f;
    final RectF g = new RectF();
    float h;
    Path i;
    float j;
    float k;
    float l;
    float m;
    private boolean n;
    private final int o;
    private final int p;
    private boolean q;
    private boolean r;

    RoundRectDrawableWithShadow(Resources resources, int i1, float f1, float f2, float f3)
    {
        n = true;
        q = true;
        r = false;
        o = resources.getColor(android.support.v7.cardview.R.color.cardview_shadow_start_color);
        p = resources.getColor(android.support.v7.cardview.R.color.cardview_shadow_end_color);
        b = resources.getDimensionPixelSize(android.support.v7.cardview.R.dimen.cardview_compat_inset_shadow);
        d = new Paint(5);
        d.setColor(i1);
        e = new Paint(5);
        e.setStyle(android.graphics.Paint.Style.FILL);
        h = (int)(0.5F + f1);
        f = new Paint(e);
        f.setAntiAlias(false);
        a(f2, f3);
    }

    static float a(float f1, float f2, boolean flag)
    {
        if (flag)
        {
            return (float)((double)(1.5F * f1) + (1.0D - a) * (double)f2);
        } else
        {
            return 1.5F * f1;
        }
    }

    private void a(Canvas canvas)
    {
        float f1 = -h - l;
        float f2 = h + (float)b + m / 2.0F;
        int i1;
        boolean flag;
        int j1;
        if (g.width() - 2.0F * f2 > 0.0F)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (g.height() - 2.0F * f2 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = canvas.save();
        canvas.translate(g.left + f2, g.top + f2);
        canvas.drawPath(i, e);
        if (i1 != 0)
        {
            canvas.drawRect(0.0F, f1, g.width() - 2.0F * f2, -h, f);
        }
        canvas.restoreToCount(j1);
        j1 = canvas.save();
        canvas.translate(g.right - f2, g.bottom - f2);
        canvas.rotate(180F);
        canvas.drawPath(i, e);
        if (i1 != 0)
        {
            float f3 = g.width();
            float f4 = -h;
            canvas.drawRect(0.0F, f1, f3 - 2.0F * f2, l + f4, f);
        }
        canvas.restoreToCount(j1);
        i1 = canvas.save();
        canvas.translate(g.left + f2, g.bottom - f2);
        canvas.rotate(270F);
        canvas.drawPath(i, e);
        if (flag)
        {
            canvas.drawRect(0.0F, f1, g.height() - 2.0F * f2, -h, f);
        }
        canvas.restoreToCount(i1);
        i1 = canvas.save();
        canvas.translate(g.right - f2, g.top + f2);
        canvas.rotate(90F);
        canvas.drawPath(i, e);
        if (flag)
        {
            canvas.drawRect(0.0F, f1, g.height() - 2.0F * f2, -h, f);
        }
        canvas.restoreToCount(i1);
    }

    static float b(float f1, float f2, boolean flag)
    {
        float f3 = f1;
        if (flag)
        {
            f3 = (float)((double)f1 + (1.0D - a) * (double)f2);
        }
        return f3;
    }

    private void b(Rect rect)
    {
        float f1 = k * 1.5F;
        g.set((float)rect.left + k, (float)rect.top + f1, (float)rect.right - k, (float)rect.bottom - f1);
        f();
    }

    private int d(float f1)
    {
        int j1 = (int)(0.5F + f1);
        int i1 = j1;
        if (j1 % 2 == 1)
        {
            i1 = j1 - 1;
        }
        return i1;
    }

    private void f()
    {
        Object obj = new RectF(-h, -h, h, h);
        Object obj1 = new RectF(((RectF) (obj)));
        ((RectF) (obj1)).inset(-l, -l);
        float f1;
        float f2;
        float f3;
        float f4;
        int i1;
        int j1;
        int k1;
        if (i == null)
        {
            i = new Path();
        } else
        {
            i.reset();
        }
        i.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        i.moveTo(-h, 0.0F);
        i.rLineTo(-l, 0.0F);
        i.arcTo(((RectF) (obj1)), 180F, 90F, false);
        i.arcTo(((RectF) (obj)), 270F, -90F, false);
        i.close();
        f1 = h / (h + l);
        obj = e;
        f2 = h;
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
        obj = f;
        f1 = -h;
        f2 = l;
        f3 = -h;
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
        f.setAntiAlias(false);
    }

    float a()
    {
        return h;
    }

    void a(float f1)
    {
        f1 = (int)(0.5F + f1);
        if (h == f1)
        {
            return;
        } else
        {
            h = f1;
            n = true;
            invalidateSelf();
            return;
        }
    }

    void a(float f1, float f2)
    {
        if (f1 < 0.0F || f2 < 0.0F)
        {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float f3 = d(f1);
        f2 = d(f2);
        f1 = f3;
        if (f3 > f2)
        {
            if (!r)
            {
                r = true;
            }
            f1 = f2;
        }
        if (m == f1 && k == f2)
        {
            return;
        } else
        {
            m = f1;
            k = f2;
            l = (int)(f1 * 1.5F + (float)b + 0.5F);
            j = (float)b + f2;
            n = true;
            invalidateSelf();
            return;
        }
    }

    public void a(int i1)
    {
        d.setColor(i1);
        invalidateSelf();
    }

    void a(Rect rect)
    {
        getPadding(rect);
    }

    public void a(boolean flag)
    {
        q = flag;
        invalidateSelf();
    }

    float b()
    {
        return m;
    }

    void b(float f1)
    {
        a(f1, k);
    }

    float c()
    {
        return k;
    }

    void c(float f1)
    {
        a(m, f1);
    }

    float d()
    {
        return Math.max(k, h + (float)b + k / 2.0F) * 2.0F + (k + (float)b) * 2.0F;
    }

    public void draw(Canvas canvas)
    {
        if (n)
        {
            b(getBounds());
            n = false;
        }
        canvas.translate(0.0F, m / 2.0F);
        a(canvas);
        canvas.translate(0.0F, -m / 2.0F);
        c.a(canvas, g, h, d);
    }

    float e()
    {
        return Math.max(k, h + (float)b + (k * 1.5F) / 2.0F) * 2.0F + (k * 1.5F + (float)b) * 2.0F;
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean getPadding(Rect rect)
    {
        int i1 = (int)Math.ceil(a(k, h, q));
        int j1 = (int)Math.ceil(b(k, h, q));
        rect.set(j1, i1, j1, i1);
        return true;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        n = true;
    }

    public void setAlpha(int i1)
    {
        d.setAlpha(i1);
        e.setAlpha(i1);
        f.setAlpha(i1);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        d.setColorFilter(colorfilter);
        e.setColorFilter(colorfilter);
        f.setColorFilter(colorfilter);
    }


    private class RoundRectHelper
    {

        public abstract void a(Canvas canvas, RectF rectf, float f1, Paint paint);
    }

}
