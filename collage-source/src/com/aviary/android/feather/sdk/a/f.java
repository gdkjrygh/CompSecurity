// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class f extends Drawable
{

    final int a;
    final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    final Paint g = new Paint(7);
    float h;
    final Rect i = new Rect();
    final LinearGradient j;
    final LinearGradient k;
    final BlurMaskFilter l;
    final Matrix m = new Matrix();
    boolean n;
    LinearGradient o;
    private boolean p;
    private boolean q;
    private Xfermode r;

    public f(Context context)
    {
        n = false;
        r = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN);
        context = context.getTheme().obtainStyledAttributes(null, com.aviary.android.feather.sdk.R.styleable.AviaryPreviewSpotDrawable, com.aviary.android.feather.sdk.R.attr.aviaryPreviewSpotDrawableStyle, 0);
        a = context.getDimensionPixelSize(9, 20);
        b = (int)((double)a * 1.7D);
        int i1 = context.getColor(2, -1);
        int j1 = context.getColor(3, 0xff000000);
        int k1 = context.getColor(4, 0xff000000);
        int l1 = context.getColor(5, -1);
        c = context.getColor(0, -1);
        e = context.getColor(6, -1);
        f = context.getColor(7, 0xff000000);
        d = context.getColor(8, 0xff000000);
        int i2 = context.getInteger(1, 3);
        context.recycle();
        g.setStyle(android.graphics.Paint.Style.STROKE);
        context = android.graphics.Shader.TileMode.CLAMP;
        j = new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, new int[] {
            i1, j1
        }, new float[] {
            0.5F, 1.0F
        }, context);
        context = android.graphics.Shader.TileMode.CLAMP;
        k = new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, new int[] {
            k1, l1
        }, new float[] {
            0.5F, 1.0F
        }, context);
        o = j;
        l = new BlurMaskFilter(i2, android.graphics.BlurMaskFilter.Blur.NORMAL);
        j.setLocalMatrix(m);
        h = 10F;
    }

    public void a(float f1)
    {
        Log.i("PreviewSpotDrawable", (new StringBuilder()).append("setRadius: ").append(f1).toString());
        h = f1;
        invalidateSelf();
    }

    public void b(float f1)
    {
        n = true;
        h = f1;
        invalidateSelf();
    }

    public void draw(Canvas canvas)
    {
        copyBounds(i);
        float f1 = h;
        if (!n)
        {
            f1 = (float)Math.min(i.width(), i.height()) * 0.8F * h;
        }
        g.setShader(null);
        g.setMaskFilter(null);
        g.setXfermode(null);
        if (p)
        {
            g.setStrokeWidth(a);
            g.setMaskFilter(l);
            g.setColor(c);
            canvas.drawCircle(i.centerX(), i.centerY(), f1, g);
        }
        g.setStrokeWidth(b);
        g.setMaskFilter(null);
        g.setColor(d);
        canvas.drawCircle(i.centerX(), i.centerY(), f1, g);
        canvas.saveLayer(i.left, i.top, i.right, i.bottom, g, 31);
        g.setStrokeWidth(a);
        Paint paint = g;
        int i1;
        if (p)
        {
            i1 = f;
        } else
        {
            i1 = e;
        }
        paint.setColor(i1);
        canvas.drawCircle(i.centerX(), i.centerY(), f1, g);
        m.reset();
        m.postScale(1.0F, f1 * 2.0F);
        m.postTranslate(0.0F, (float)(i.centerY() + 3) - f1 * 2.0F);
        o.setLocalMatrix(m);
        g.setXfermode(r);
        g.setColor(-1);
        g.setShader(o);
        canvas.drawCircle(i.centerX(), i.centerY() + 3, f1, g);
        canvas.restore();
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isStateful()
    {
        return true;
    }

    protected boolean onStateChange(int ai[])
    {
        boolean flag = false;
        boolean flag2 = p;
        boolean flag1 = q;
        p = false;
        q = false;
        for (int i1 = 0; i1 < ai.length; i1++)
        {
            if (ai[i1] == 0x10100a7)
            {
                q = true;
            }
            if (ai[i1] == 0x10100a1)
            {
                p = true;
            }
        }

        if (p)
        {
            o = k;
        } else
        {
            o = j;
        }
        if (flag2 != p || flag1 != q)
        {
            flag = true;
        }
        return flag;
    }

    public void setAlpha(int i1)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
