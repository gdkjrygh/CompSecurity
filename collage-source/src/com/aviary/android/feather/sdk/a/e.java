// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class e extends Drawable
{

    final int a;
    final int b;
    final Paint c = new Paint(7);
    float d;
    final Rect e = new Rect();
    final Matrix f = new Matrix();
    boolean g;
    LinearGradient h;
    int i;
    int j;
    private boolean k;
    private boolean l;

    public e(Context context)
    {
        g = false;
        context = context.getTheme().obtainStyledAttributes(null, com.aviary.android.feather.sdk.R.styleable.AviaryPreviewFillDrawable, com.aviary.android.feather.sdk.R.attr.aviaryPreviewFillDrawableStyle, 0);
        a = context.getDimensionPixelSize(2, 20);
        b = context.getColor(1, 0xff000000);
        d = (float)context.getInteger(0, 50) / 100F;
        context.recycle();
        c.setStyle(android.graphics.Paint.Style.FILL);
        context = android.graphics.Shader.TileMode.CLAMP;
        h = new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, new int[] {
            -1, 0xff000000
        }, new float[] {
            0.5F, 1.0F
        }, context);
    }

    public void a(float f1)
    {
        g = true;
        d = f1;
        invalidateSelf();
    }

    public void a(int i1)
    {
        i = i1;
        float af[] = new float[3];
        Color.colorToHSV(i1, af);
        int j1 = Color.red(i1);
        int k1 = Color.green(i1);
        i1 = Color.blue(i1);
        j = Color.argb(255, (int)((double)j1 * 0.5D + 127D), (int)((double)k1 * 0.5D + 127D), (int)((double)i1 * 0.5D + 127D));
        af[1] = af[1] * 1.1F;
        af[2] = af[2] * 0.3F;
        i1 = Color.HSVToColor(af);
        j1 = i;
        android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
        h = new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, new int[] {
            j1, i1
        }, new float[] {
            0.0F, 1.0F
        }, tilemode);
        invalidateSelf();
    }

    public void draw(Canvas canvas)
    {
        copyBounds(e);
        float f1 = d;
        if (!g)
        {
            f1 = (float)Math.min(e.width(), e.height()) * 0.5F * d;
        }
        c.setShader(null);
        c.setMaskFilter(null);
        c.setXfermode(null);
        c.setMaskFilter(null);
        c.setColor(b);
        canvas.drawCircle(e.centerX(), e.centerY(), (float)a + f1, c);
        canvas.saveLayer(e.left, e.top, e.right, e.bottom, c, 31);
        c.setColor(j);
        canvas.drawCircle(e.centerX(), e.centerY(), f1, c);
        f.reset();
        f.postScale(1.0F, 4F * f1);
        f.postTranslate(0.0F, (float)(e.centerY() + 2) - 2.0F * f1);
        h.setLocalMatrix(f);
        c.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        c.setColor(-1);
        c.setShader(h);
        canvas.drawCircle(e.centerX(), e.centerY() + 2, f1, c);
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
        boolean flag2 = k;
        boolean flag1 = l;
        k = false;
        l = false;
        for (int i1 = 0; i1 < ai.length; i1++)
        {
            if (ai[i1] == 0x10100a7)
            {
                l = true;
            }
            if (ai[i1] == 0x10100a1)
            {
                k = true;
            }
        }

        if (flag2 != k || flag1 != l)
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
