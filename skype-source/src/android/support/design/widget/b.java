// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.a;

class b extends Drawable
{

    final Paint a = new Paint(1);
    final Rect b = new Rect();
    final RectF c = new RectF();
    float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    public b()
    {
        j = true;
        a.setStyle(android.graphics.Paint.Style.STROKE);
    }

    final void a(float f1)
    {
        if (d != f1)
        {
            d = f1;
            a.setStrokeWidth(1.3333F * f1);
            j = true;
            invalidateSelf();
        }
    }

    final void a(int k)
    {
        i = k;
        j = true;
        invalidateSelf();
    }

    final void a(int k, int l, int i1, int j1)
    {
        e = k;
        f = l;
        g = i1;
        h = j1;
    }

    public void draw(Canvas canvas)
    {
        if (j)
        {
            Paint paint = a;
            Object obj = b;
            copyBounds(((Rect) (obj)));
            float f1 = d / (float)((Rect) (obj)).height();
            int k = android.support.v4.graphics.a.a(e, i);
            int l = android.support.v4.graphics.a.a(f, i);
            int i1 = android.support.v4.graphics.a.a(android.support.v4.graphics.a.b(f, 0), i);
            int j1 = android.support.v4.graphics.a.a(android.support.v4.graphics.a.b(h, 0), i);
            int k1 = android.support.v4.graphics.a.a(h, i);
            int l1 = android.support.v4.graphics.a.a(g, i);
            float f3 = ((Rect) (obj)).top;
            float f4 = ((Rect) (obj)).bottom;
            obj = android.graphics.Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0F, f3, 0.0F, f4, new int[] {
                k, l, i1, j1, k1, l1
            }, new float[] {
                0.0F, f1, 0.5F, 0.5F, 1.0F - f1, 1.0F
            }, ((android.graphics.Shader.TileMode) (obj))));
            j = false;
        }
        float f2 = a.getStrokeWidth() / 2.0F;
        RectF rectf = c;
        copyBounds(b);
        rectf.set(b);
        rectf.left = rectf.left + f2;
        rectf.top = rectf.top + f2;
        rectf.right = rectf.right - f2;
        rectf.bottom = rectf.bottom - f2;
        canvas.drawOval(rectf, a);
    }

    public int getOpacity()
    {
        return d <= 0.0F ? -2 : -3;
    }

    public boolean getPadding(Rect rect)
    {
        int k = Math.round(d);
        rect.set(k, k, k, k);
        return true;
    }

    protected void onBoundsChange(Rect rect)
    {
        j = true;
    }

    public void setAlpha(int k)
    {
        a.setAlpha(k);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
        invalidateSelf();
    }
}
