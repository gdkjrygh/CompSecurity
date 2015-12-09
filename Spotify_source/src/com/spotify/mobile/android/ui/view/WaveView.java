// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import km;

public class WaveView extends View
{

    private static final int e[] = {
        0, -1, -1, 0
    };
    private static final float f[] = {
        0.15F, 0.3F, 0.7F, 0.85F
    };
    private Path a;
    private Matrix b;
    private Matrix c;
    private Paint d;
    private final LinearGradient g;
    private int h;
    private int i;
    private ValueAnimator j;

    public WaveView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Path();
        b = new Matrix();
        c = new Matrix();
        d = new Paint();
        g = new LinearGradient(0.0F, 0.0F, 1.0F, 0.0F, e, f, android.graphics.Shader.TileMode.CLAMP);
        d.setStrokeWidth(5F);
        d.setAntiAlias(true);
        d.setStyle(android.graphics.Paint.Style.STROKE);
        d.setShader(g);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        j = ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        });
        int k = getResources().getInteger(0x7f0e001e);
        j.setDuration(k);
        j.setRepeatCount(-1);
        j.setInterpolator(new LinearInterpolator());
        j.start();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        j.cancel();
    }

    protected void onDraw(Canvas canvas)
    {
        float f1 = ((Float)j.getAnimatedValue()).floatValue();
        b.reset();
        b.postTranslate((float)(-h) * f1, 0.0F);
        a.transform(b);
        canvas.drawPath(a, d);
        super.onDraw(canvas);
        b.reset();
        b.postTranslate(f1 * (float)h, 0.0F);
        a.transform(b);
        km.d(this);
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        super.onLayout(flag, k, l, i1, j1);
        h = getWidth() - getPaddingLeft() - getPaddingRight();
        i = getHeight() - getPaddingTop() - getPaddingBottom();
        k = i;
        l = h;
        a.rewind();
        float f1 = (float)k / 2.0F;
        a.moveTo(0.0F, f1);
        for (k = 0; k < 8; k++)
        {
            a.rQuadTo((float)l / 16F, -f1, (float)l / 8F, 0.0F);
            a.rQuadTo((float)l / 16F, f1, (float)l / 8F, 0.0F);
        }

        if (flag)
        {
            c.setScale(h, 1.0F);
            g.setLocalMatrix(c);
        }
    }

}
