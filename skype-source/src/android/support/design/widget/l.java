// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.b;

final class l extends b
{

    static final double a = Math.cos(Math.toRadians(45D));
    final Paint b = new Paint(5);
    final Paint c;
    final RectF d = new RectF();
    float e;
    Path f;
    float g;
    float h;
    float i;
    float j;
    private boolean k;
    private final int l;
    private final int m;
    private final int n;
    private boolean o;
    private boolean p;

    public l(Resources resources, Drawable drawable, float f1, float f2, float f3)
    {
        super(drawable);
        k = true;
        o = true;
        p = false;
        l = resources.getColor(android.support.design.a.c.design_fab_shadow_start_color);
        m = resources.getColor(android.support.design.a.c.design_fab_shadow_mid_color);
        n = resources.getColor(android.support.design.a.c.design_fab_shadow_end_color);
        b.setStyle(android.graphics.Paint.Style.FILL);
        e = Math.round(f1);
        c = new Paint(b);
        c.setAntiAlias(false);
        a(f2, f3);
    }

    private static int a(float f1)
    {
        int j1 = Math.round(f1);
        int i1 = j1;
        if (j1 % 2 == 1)
        {
            i1 = j1 - 1;
        }
        return i1;
    }

    public final void a()
    {
        o = false;
        invalidateSelf();
    }

    final void a(float f1, float f2)
    {
        if (f1 < 0.0F || f2 < 0.0F)
        {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float f3 = a(f1);
        float f4 = a(f2);
        f1 = f3;
        if (f3 > f4)
        {
            f2 = f4;
            f1 = f2;
            if (!p)
            {
                p = true;
                f1 = f2;
            }
        }
        if (j == f1 && h == f4)
        {
            return;
        } else
        {
            j = f1;
            h = f4;
            i = Math.round(1.5F * f1);
            g = f4;
            k = true;
            invalidateSelf();
            return;
        }
    }

    public final void draw(Canvas canvas)
    {
        int j1;
        boolean flag;
        if (k)
        {
            Object obj = getBounds();
            float f1 = h * 1.5F;
            d.set((float)((Rect) (obj)).left + h, (float)((Rect) (obj)).top + f1, (float)((Rect) (obj)).right - h, (float)((Rect) (obj)).bottom - f1);
            b().setBounds((int)d.left, (int)d.top, (int)d.right, (int)d.bottom);
            obj = new RectF(-e, -e, e, e);
            RectF rectf = new RectF(((RectF) (obj)));
            rectf.inset(-i, -i);
            float f3;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            Paint paint1;
            int l1;
            int j2;
            if (f == null)
            {
                f = new Path();
            } else
            {
                f.reset();
            }
            f.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            f.moveTo(-e, 0.0F);
            f.rLineTo(-i, 0.0F);
            f.arcTo(rectf, 180F, 90F, false);
            f.arcTo(((RectF) (obj)), 270F, -90F, false);
            f.close();
            f1 = -rectf.top;
            if (f1 > 0.0F)
            {
                float f2 = e / f1;
                float f4 = (1.0F - f2) / 2.0F;
                Paint paint = b;
                int i1 = l;
                int k1 = m;
                int i2 = n;
                android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
                paint.setShader(new RadialGradient(0.0F, 0.0F, f1, new int[] {
                    0, i1, k1, i2
                }, new float[] {
                    0.0F, f2, f2 + f4, 1.0F
                }, tilemode));
            }
            paint1 = c;
            f1 = ((RectF) (obj)).top;
            f3 = rectf.top;
            j1 = l;
            l1 = m;
            j2 = n;
            obj = android.graphics.Shader.TileMode.CLAMP;
            paint1.setShader(new LinearGradient(0.0F, f1, 0.0F, f3, new int[] {
                j1, l1, j2
            }, new float[] {
                0.0F, 0.5F, 1.0F
            }, ((android.graphics.Shader.TileMode) (obj))));
            c.setAntiAlias(false);
            k = false;
        }
        f1 = -e - i;
        f3 = e;
        if (d.width() - 2.0F * f3 > 0.0F)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (d.height() - 2.0F * f3 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f8 = j;
        f9 = j;
        f5 = j;
        f10 = j;
        f6 = j;
        f7 = j;
        f5 = f3 / ((f5 - f10 * 0.5F) + f3);
        f8 = f3 / ((f8 - f9 * 0.25F) + f3);
        f6 = f3 / (f3 + (f6 - f7 * 1.0F));
        j2 = canvas.save();
        canvas.translate(d.left + f3, d.top + f3);
        canvas.scale(f5, f8);
        canvas.drawPath(f, b);
        if (j1 != 0)
        {
            canvas.scale(1.0F / f5, 1.0F);
            canvas.drawRect(0.0F, f1, d.width() - 2.0F * f3, -e, c);
        }
        canvas.restoreToCount(j2);
        j2 = canvas.save();
        canvas.translate(d.right - f3, d.bottom - f3);
        canvas.scale(f5, f6);
        canvas.rotate(180F);
        canvas.drawPath(f, b);
        if (j1 != 0)
        {
            canvas.scale(1.0F / f5, 1.0F);
            f7 = d.width();
            f9 = -e;
            canvas.drawRect(0.0F, f1, f7 - 2.0F * f3, i + f9, c);
        }
        canvas.restoreToCount(j2);
        j1 = canvas.save();
        canvas.translate(d.left + f3, d.bottom - f3);
        canvas.scale(f5, f6);
        canvas.rotate(270F);
        canvas.drawPath(f, b);
        if (flag)
        {
            canvas.scale(1.0F / f6, 1.0F);
            canvas.drawRect(0.0F, f1, d.height() - 2.0F * f3, -e, c);
        }
        canvas.restoreToCount(j1);
        j1 = canvas.save();
        canvas.translate(d.right - f3, d.top + f3);
        canvas.scale(f5, f8);
        canvas.rotate(90F);
        canvas.drawPath(f, b);
        if (flag)
        {
            canvas.scale(1.0F / f8, 1.0F);
            canvas.drawRect(0.0F, f1, d.height() - 2.0F * f3, -e, c);
        }
        canvas.restoreToCount(j1);
        super.draw(canvas);
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final boolean getPadding(Rect rect)
    {
        float f1 = h;
        float f2 = e;
        float f3;
        int i1;
        int j1;
        if (o)
        {
            double d1 = f1 * 1.5F;
            double d3 = a;
            f1 = (float)((double)f2 * (1.0D - d3) + d1);
        } else
        {
            f1 *= 1.5F;
        }
        i1 = (int)Math.ceil(f1);
        f2 = h;
        f3 = e;
        f1 = f2;
        if (o)
        {
            double d2 = f2;
            double d4 = a;
            f1 = (float)((double)f3 * (1.0D - d4) + d2);
        }
        j1 = (int)Math.ceil(f1);
        rect.set(j1, i1, j1, i1);
        return true;
    }

    protected final void onBoundsChange(Rect rect)
    {
        k = true;
    }

    public final void setAlpha(int i1)
    {
        super.setAlpha(i1);
        b.setAlpha(i1);
        c.setAlpha(i1);
    }

}
