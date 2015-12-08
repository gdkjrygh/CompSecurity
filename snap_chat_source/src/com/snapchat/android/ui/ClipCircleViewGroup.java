// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jr;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class ClipCircleViewGroup extends ViewGroup
{
    public static interface a
        extends Annotation
    {
    }

    public static interface b
        extends Annotation
    {
    }

    public static interface c
    {

        public abstract void a(int i1, float f1);

        public abstract void l();

        public abstract void m();
    }

    public static interface d
    {

        public abstract void a(Canvas canvas, float f1, float f2, float f3);
    }


    public static final boolean h;
    private final Path a = new Path();
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    public final List i = new ArrayList();
    public final List j = new ArrayList();
    final List k = new ArrayList();
    protected boolean l;
    public int m;
    public float n;
    protected int o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;

    public ClipCircleViewGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = false;
    }

    private static float a(float f1)
    {
        return (0.549978F * f1) / (1.282F * f1 + 1.0F);
    }

    private float a(float f1, float f2)
    {
        return Math.max(4F * f1 * (1.0F - 11.65F * f2), r);
    }

    private static float a(float f1, float f2, float f3)
    {
        return (0.5F - 0.75F * (f1 / f2 - 0.5F)) + f3;
    }

    private void a()
    {
        m = 0;
        n = 0.0F;
        l = false;
    }

    private void b()
    {
        m = 3;
        n = 1.0F;
        c = q;
        d = r;
        b = p;
    }

    private void b(float f1)
    {
        m = 1;
        n = f1 / 0.075F;
    }

    private void c()
    {
        for (int i1 = i.size() - 1; i1 >= 0; i1--)
        {
            ((c)i.get(i1)).a(m, n);
        }

    }

    private void c(float f1)
    {
        m = 2;
        n = (f1 - 0.075F) / 0.01F;
    }

    private void f(float f1, float f2)
    {
        l = true;
        s = f1;
        t = f2;
    }

    public final void a(float f1, float f2, int i1, boolean flag)
    {
        e = f1;
        f = f2;
        o = i1;
        g = flag;
        m = 0;
        n = 0.0F;
        s = 0.0F;
        t = 0.0F;
        for (i1 = i.size() - 1; i1 >= 0; i1--)
        {
            ((c)i.get(i1)).l();
        }

    }

    public final void a(c c1)
    {
        i.add(c1);
    }

    public final void a(boolean flag)
    {
        if (flag && h)
        {
            g();
            return;
        }
        float f1;
        float f2;
        ValueAnimator valueanimator;
        if (o == 0)
        {
            f1 = t;
        } else
        {
            f1 = s;
        }
        if (o == 0)
        {
            f2 = s;
        } else
        {
            f2 = t;
        }
        if (flag)
        {
            valueanimator = ValueAnimator.ofFloat(new float[] {
                f1, 0.085F
            });
        } else
        {
            valueanimator = ValueAnimator.ofFloat(new float[] {
                f1, 0.0F
            });
        }
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(f2) {

            private float a;
            private ClipCircleViewGroup b;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                if (b.o == 0)
                {
                    b.c(a, ((Float)valueanimator1.getAnimatedValue()).floatValue());
                    return;
                }
                if (b.o == 1)
                {
                    b.d(((Float)valueanimator1.getAnimatedValue()).floatValue(), a);
                    return;
                } else
                {
                    b.e(((Float)valueanimator1.getAnimatedValue()).floatValue(), a);
                    return;
                }
            }

            
            {
                b = ClipCircleViewGroup.this;
                a = f1;
                super();
            }
        });
        valueanimator.addListener(new Jr(flag) {

            private boolean a;
            private ClipCircleViewGroup b;

            public final void onAnimationEnd(Animator animator)
            {
                if (a)
                {
                    b.g();
                } else
                {
                    b.l = false;
                    b.setEnabled(true);
                    animator = b;
                    int i1 = ((ClipCircleViewGroup) (animator)).k.size() - 1;
                    while (i1 >= 0) 
                    {
                        ((ClipCircleViewGroup) (animator)).k.get(i1);
                        i1--;
                    }
                }
            }

            
            {
                b = ClipCircleViewGroup.this;
                a = flag;
                super();
            }
        });
        valueanimator.setDuration(150L);
        valueanimator.start();
    }

    public final void b(float f1, float f2)
    {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0)
        {
            float f4 = f1;
            float f3 = f2;
            if (o == 2)
            {
                f4 = -f1;
                f3 = -f2;
            }
            if (f4 < 0.0F)
            {
                f2 = -a(-f4 / (float)getMeasuredWidth());
            } else
            {
                f2 = a(f4 / (float)getMeasuredWidth());
            }
            if (f3 < 0.0F)
            {
                f1 = -a(-f3 / (float)getMeasuredHeight());
            } else
            {
                f1 = a(f3 / (float)getMeasuredWidth());
            }
            f3 = f1;
            if (g)
            {
                f3 = f1 / 2.0F;
            }
            if (o == 0)
            {
                c(f2, f3);
                return;
            }
            if (o == 1)
            {
                d(f2, f3);
                return;
            }
            if (o == 2)
            {
                e(f2, f3);
                return;
            }
        }
    }

    protected final void c(float f1, float f2)
    {
        f(f1, f2);
        float f3 = a(getMeasuredWidth(), f2);
        f1 = a(e, getMeasuredWidth(), f1);
        if (f2 <= 0.0F)
        {
            a();
        } else
        if (f2 <= 0.075F)
        {
            b(f2);
            c = f1 * (float)getMeasuredWidth();
            d = f3;
            b = f3 + (float)getMeasuredHeight() * f2;
        } else
        if (f2 < 0.085F)
        {
            c(f2);
            c = (f1 * (1.0F - n) + (n * q) / (float)getMeasuredWidth()) * (float)getMeasuredWidth();
            d = f3;
            b = f3 + (((p - r) / (float)getMeasuredHeight() - 0.075F) * n + 0.075F) * (float)getMeasuredHeight();
        } else
        {
            b();
        }
        c();
        invalidate();
    }

    public final void d()
    {
        l = false;
        t = 0.0F;
        s = 0.0F;
        g = false;
        m = 0;
        n = 0.0F;
    }

    protected final void d(float f1, float f2)
    {
        f(f1, f2);
        float f3 = a(getMeasuredHeight(), f1);
        f2 = a(f, getMeasuredHeight(), f2);
        if (f1 <= 0.0F)
        {
            a();
        } else
        if (f1 <= 0.075F)
        {
            b(f1);
            c = (float)getMeasuredWidth() * f1 + f3;
            d = f3;
            b = (float)getMeasuredHeight() * f2;
        } else
        if (f1 < 0.085F)
        {
            c(f1);
            b = (f2 * (1.0F - n) + (n * p) / (float)getMeasuredHeight()) * (float)getMeasuredHeight();
            d = f3;
            c = f3 + (((q - r) / (float)getMeasuredWidth() - 0.075F) * n + 0.075F) * (float)getMeasuredWidth();
        } else
        {
            b();
        }
        c();
        invalidate();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (!h) goto _L2; else goto _L1
_L1:
        super.dispatchDraw(canvas);
_L4:
        return;
_L2:
        if (l)
        {
            a.reset();
            a.addCircle(c, b, d, android.graphics.Path.Direction.CW);
            canvas.clipPath(a);
        }
        super.dispatchDraw(canvas);
        if (l)
        {
            int i1 = 0;
            while (i1 < j.size()) 
            {
                ((d)j.get(i1)).a(canvas, c, b, d);
                i1++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void e(float f1, float f2)
    {
        f(f1, f2);
        float f3 = a(getMeasuredHeight(), f1);
        f2 = a(f, getMeasuredHeight(), f2);
        if (f1 <= 0.0F)
        {
            a();
        } else
        if (f1 <= 0.075F)
        {
            b(f1);
            c = (1.0F - f1) * (float)getMeasuredWidth() - f3;
            d = f3;
            b = (float)getMeasuredHeight() * f2;
        } else
        if (f1 < 0.085F)
        {
            c(f1);
            b = (f2 * (1.0F - n) + (n * p) / (float)getMeasuredHeight()) * (float)getMeasuredHeight();
            d = f3;
            f1 = q;
            f2 = n;
            c = (0.925F * (float)getMeasuredWidth() - f3) * (1.0F - n) + f1 * f2;
        } else
        {
            b();
        }
        c();
        invalidate();
    }

    public final boolean e()
    {
        if (o != 0) goto _L2; else goto _L1
_L1:
        if (t > 0.042F) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        return true;
_L2:
        if (s > 0.042F)
        {
            return true;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void f()
    {
        a(getMeasuredWidth() / 2, getMeasuredHeight() / 2, 0, false);
        a(true);
    }

    protected final void g()
    {
        for (int i1 = i.size() - 1; i1 >= 0; i1--)
        {
            ((c)i.get(i1)).m();
        }

    }

    public void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int j2 = getChildCount();
        for (int i2 = 0; i2 < j2; i2++)
        {
            getChildAt(i2).layout(0, 0, k1 - i1, l1 - j1);
        }

    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        int l1 = getChildCount();
        for (int k1 = 0; k1 < l1; k1++)
        {
            getChildAt(k1).measure(i1, j1);
        }

    }

    public void setUpFinalCircle(int i1, int j1, int k1)
    {
        p = i1;
        q = j1;
        r = k1;
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }
}
