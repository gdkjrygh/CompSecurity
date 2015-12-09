// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

public class HeartRateZoneView extends TextView
{

    private static final int G = 250;
    private static final int H = 0;
    private static final float c = 0.38F;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private Rect I;
    private int a;
    private int b;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private Paint v;
    private Paint w;
    private Paint x;
    private Paint y;
    private int z;

    public HeartRateZoneView(Context context)
    {
        this(context, null, 0);
    }

    public HeartRateZoneView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HeartRateZoneView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = getResources().getDimensionPixelSize(0x7f0a00d4);
        e = getResources().getDimensionPixelSize(0x7f0a00d2);
        f = getResources().getDimensionPixelSize(0x7f0a00d3);
        g = getResources().getColor(0x7f0f00d3);
        h = getResources().getColor(0x7f0f00c2);
        i = getResources().getColor(0x7f0f00c9);
        j = getResources().getColor(0x7f0f00c6);
        k = Color.rgb(255, 255, 255);
        l = getResources().getDimensionPixelSize(0x7f0a00d8);
        m = getResources().getDimensionPixelSize(0x7f0a00d5);
        n = getResources().getDimensionPixelSize(0x7f0a00d9);
        o = getResources().getDimensionPixelSize(0x7f0a00d7);
        p = getResources().getDimensionPixelSize(0x7f0a00d6);
        q = getResources().getDimensionPixelSize(0x7f0a0006);
        r = getResources().getDimensionPixelSize(0x7f0a00da);
        s = getResources().getDimensionPixelSize(0x7f0a0005);
        t = getResources().getDimensionPixelSize(0x7f0a00db);
        u = getResources().getColor(0x7f0f00c7);
        A = 159;
        B = 131;
        C = 94;
        D = 180;
        E = 150;
        F = true;
        I = new Rect();
        b();
    }

    private int a(String s1)
    {
        w.getTextBounds(s1, 0, s1.length(), I);
        return (I.bottom - I.top) / 2;
    }

    private void a(int i1, int j1, int k1, int l1)
    {
        x.setShader(new LinearGradient(0.0F, i1, 0.0F, j1, k1, l1, android.graphics.Shader.TileMode.CLAMP));
    }

    private void a(Canvas canvas, int i1, int j1, String s1)
    {
        canvas.translate(p, p * 2);
        canvas.drawPath(h(j1), y);
        canvas.translate(-p, p * -2);
        f();
        canvas.drawPath(h(j1), v);
        f(i1);
        e();
        canvas.drawPath(h(j1), v);
        g();
        b(canvas, z + l / 2, j1, s1);
    }

    private void b()
    {
        v = new Paint();
        w = new Paint();
        x = new Paint();
        y = new Paint();
        i();
    }

    private void b(Canvas canvas, int i1, int j1, String s1)
    {
        canvas.drawText(s1, i1, a(s1) + j1, w);
    }

    private void c()
    {
        v.setColor(-1);
        v.setStyle(android.graphics.Paint.Style.FILL);
    }

    private void d()
    {
        w.setAntiAlias(true);
        w.setTextAlign(android.graphics.Paint.Align.LEFT);
        w.setColor(u);
        w.setTextSize(s);
    }

    private void e()
    {
        v.setDither(true);
        v.setStyle(android.graphics.Paint.Style.FILL);
        v.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        v.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        v.setPathEffect(new CornerPathEffect(8F));
        v.setAntiAlias(true);
    }

    private void f()
    {
        v.setColor(k);
        v.setStyle(android.graphics.Paint.Style.STROKE);
        v.setStrokeWidth(o);
    }

    private void f(int i1)
    {
        v.setColor(i1);
    }

    private void g()
    {
        w.setColor(-1);
        w.setTextAlign(android.graphics.Paint.Align.CENTER);
        w.setTextSize(s);
    }

    private void g(int i1)
    {
        w.setColor(i1);
    }

    private Path h(int i1)
    {
        Path path = new Path();
        int j1 = i1 - m / 2;
        int k1 = m / 2 + i1;
        path.moveTo(z, j1);
        path.lineTo(z + l, j1);
        path.lineTo(z + l, j1);
        path.lineTo(z + l + n, i1);
        path.lineTo(z + l, k1);
        path.lineTo(z, k1);
        path.close();
        return path;
    }

    private void h()
    {
        w.setTextAlign(android.graphics.Paint.Align.LEFT);
        w.setTextSize(t);
    }

    private int i(int i1)
    {
        if (i1 < C)
        {
            return (a + (f * 3) / 2 + e * 2) - (e * (i1 + 0)) / (C + 0);
        }
        if (i1 < B)
        {
            return (a + f / 2 + e) - (e * (i1 - C)) / (B - C);
        }
        if (i1 < A)
        {
            return a - f / 2 - (e * (i1 - B)) / (A - B);
        } else
        {
            return a - (f * 3) / 2 - e - (e * (i1 - A)) / (250 - A);
        }
    }

    private void i()
    {
        y.setColor(0xff000000);
        y.setDither(true);
        y.setStyle(android.graphics.Paint.Style.FILL);
        y.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        y.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        y.setPathEffect(new CornerPathEffect(8F));
        y.setAntiAlias(true);
        y.setMaskFilter(new BlurMaskFilter(p, android.graphics.BlurMaskFilter.Blur.NORMAL));
        y.setAlpha(10);
    }

    public void a(int i1)
    {
        A = i1;
    }

    public void a(boolean flag)
    {
        F = flag;
        invalidate();
    }

    public boolean a()
    {
        return F;
    }

    public void b(int i1)
    {
        B = i1;
    }

    public void c(int i1)
    {
        C = i1;
    }

    public void d(int i1)
    {
        D = i1;
        invalidate();
    }

    public void e(int i1)
    {
        E = i1;
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        a = getHeight() / 2;
        b = (int)((float)getWidth() * 0.38F);
        z = b - l - n - d / 2 - r;
        c();
        canvas.drawPaint(v);
        int l1 = a - (f * 3) / 2 - e * 2;
        int i2 = a - (f * 3) / 2 - e;
        int i1 = b - d / 2;
        int k1 = b + d / 2;
        a(l1, i2, -1, g);
        canvas.drawRect(i1, l1, k1, i2, x);
        l1 = a - f / 2 - e;
        i2 = a - f / 2;
        a(l1, i2, g, h);
        canvas.drawRect(i1, l1, k1, i2, x);
        l1 = a + f / 2;
        i2 = a + f / 2 + e;
        a(l1, i2, h, i);
        canvas.drawRect(i1, l1, k1, i2, x);
        l1 = a + (f * 3) / 2 + e;
        i2 = a + f / 2 + e * 2;
        a(l1, i2, i, -1);
        canvas.drawRect(i1, l1, k1, i2, x);
        d();
        i1 = b + l / 2 + q;
        b(canvas, i1, a - ((f + e) * 3) / 2, getResources().getString(0x7f080333));
        b(canvas, i1, a - (f + e) / 2, getResources().getString(0x7f0802c3));
        b(canvas, i1, a + (f + e) / 2, getResources().getString(0x7f0802ed));
        if (!F)
        {
            a(canvas, g, a - f - e, (new StringBuilder()).append(A).append("").toString());
            a(canvas, h, a, (new StringBuilder()).append(B).append("").toString());
            a(canvas, i, a + f + e, (new StringBuilder()).append(C).append("").toString());
        } else
        {
            if (E != 0)
            {
                a(canvas, j, i(E), (new StringBuilder()).append(E).append("").toString());
            }
            if (D != 0)
            {
                a(canvas, j, i(D), (new StringBuilder()).append(D).append("").toString());
            }
            h();
            g(g);
            int j1 = b + d / 2 + 10;
            b(canvas, j1, a - f - e, (new StringBuilder()).append(A).append("").toString());
            g(h);
            b(canvas, j1, a, (new StringBuilder()).append(B).append("").toString());
            g(i);
            b(canvas, j1, a + f + e, (new StringBuilder()).append(C).append("").toString());
        }
        super.onDraw(canvas);
    }
}
