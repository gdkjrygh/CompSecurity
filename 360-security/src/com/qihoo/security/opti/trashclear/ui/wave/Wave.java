// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.wave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

class Wave extends View
{
    private class a
        implements Runnable
    {

        final Wave a;

        public void run()
        {
            long l1 = 0L;
            Wave wave = a;
            wave;
            JVM INSTR monitorenter ;
            Wave wave1;
            long l2;
            l2 = System.currentTimeMillis();
            Wave.a(a);
            a.invalidate();
            l2 = 16L - System.currentTimeMillis() - l2;
            wave1 = a;
            Exception exception;
            if (l2 >= 0L)
            {
                l1 = l2;
            }
            wave1.postDelayed(this, l1);
            wave;
            JVM INSTR monitorexit ;
            return;
            exception;
            wave;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private a()
        {
            a = Wave.this;
            super();
        }

    }


    private float A;
    private a B;
    private int C;
    private int D;
    private int E;
    private double F;
    public final int a;
    public final int b;
    WaveView.a c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;
    private final double n;
    private Path o;
    private Path p;
    private Paint q;
    private Paint r;
    private int s;
    private int t;
    private float u;
    private float v;
    private int w;
    private float x;
    private float y;
    private float z;

    public Wave(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        d = 16;
        e = 8;
        f = 5;
        g = 1.5F;
        h = 1.0F;
        i = 0.5F;
        j = 0.13F;
        k = 0.09F;
        l = 0.05F;
        a = 100;
        b = 100;
        m = 20F;
        n = 6.2831853071795862D;
        o = new Path();
        p = new Path();
        q = new Paint();
        r = new Paint();
        z = 0.0F;
    }

    public Wave(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = 16;
        e = 8;
        f = 5;
        g = 1.5F;
        h = 1.0F;
        i = 0.5F;
        j = 0.13F;
        k = 0.09F;
        l = 0.05F;
        a = 100;
        b = 100;
        m = 20F;
        n = 6.2831853071795862D;
        o = new Path();
        p = new Path();
        q = new Paint();
        r = new Paint();
        z = 0.0F;
    }

    static void a(Wave wave)
    {
        wave.f();
    }

    private float c(int i1)
    {
        switch (i1)
        {
        default:
            return 0.0F;

        case 1: // '\001'
            return 1.5F;

        case 2: // '\002'
            return 1.0F;

        case 3: // '\003'
            return 0.5F;
        }
    }

    private int d(int i1)
    {
        switch (i1)
        {
        default:
            return 0;

        case 1: // '\001'
            return 16;

        case 2: // '\002'
            return 8;

        case 3: // '\003'
            return 5;
        }
    }

    private float e(int i1)
    {
        switch (i1)
        {
        default:
            return 0.0F;

        case 1: // '\001'
            return 0.13F;

        case 2: // '\002'
            return 0.09F;

        case 3: // '\003'
            return 0.05F;
        }
    }

    private void f()
    {
        float f3 = 0.0F;
        o.reset();
        p.reset();
        h();
        o.moveTo(C, E);
        for (float f1 = 0.0F; f1 <= x; f1 += 20F)
        {
            float f5 = (float)((double)w * Math.sin(F * (double)f1 + (double)z) + (double)w);
            o.lineTo(f1, f5);
        }

        o.lineTo(D, E);
        p.moveTo(C, E);
        for (float f2 = f3; f2 <= x; f2 += 20F)
        {
            float f4 = (float)((double)w * Math.sin(F * (double)f2 + (double)A) + (double)w);
            p.lineTo(f2, f4);
        }

        p.lineTo(D, E);
    }

    private void g()
    {
        if (getWidth() != 0)
        {
            v = (float)getWidth() * u;
            C = getLeft();
            D = getRight();
            E = getBottom();
            x = (float)D + 20F;
            F = 6.2831853071795862D / (double)v;
        }
    }

    private void h()
    {
        if (A > 3.402823E+38F)
        {
            A = 0.0F;
        } else
        {
            A = A + y;
        }
        if (z > 3.402823E+38F)
        {
            z = 0.0F;
            return;
        } else
        {
            z = z + y;
            return;
        }
    }

    public Path a()
    {
        return p;
    }

    public void a(int i1)
    {
        s = i1;
    }

    public void a(int i1, int j1, int k1)
    {
        u = c(i1);
        w = d(j1);
        y = e(k1);
        A = (float)w * 0.4F;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, w * 2));
    }

    public void a(WaveView.a a1)
    {
        c = a1;
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            if (B != null)
            {
                removeCallbacks(B);
            }
            return;
        } else
        {
            B = new a();
            post(B);
            return;
        }
    }

    public Path b()
    {
        return o;
    }

    public void b(int i1)
    {
        t = i1;
    }

    public Paint c()
    {
        return q;
    }

    public Paint d()
    {
        return r;
    }

    public void e()
    {
        q.setColor(s);
        q.setAlpha(100);
        q.setStyle(android.graphics.Paint.Style.FILL);
        q.setAntiAlias(true);
        r.setColor(t);
        r.setAlpha(100);
        r.setStyle(android.graphics.Paint.Style.FILL);
        r.setAntiAlias(true);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawPath(p, r);
        canvas.drawPath(o, q);
        if (c != null)
        {
            c.a();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag && v == 0.0F)
        {
            g();
        }
    }
}
