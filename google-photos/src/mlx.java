// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class mlx extends Drawable
    implements Animatable, mlw
{

    private static final LinearInterpolator c = new LinearInterpolator();
    private static final Interpolator d = b.r();
    private static final ArgbEvaluator e = new ArgbEvaluator();
    private long A;
    private long B;
    private long C;
    private boolean D;
    private Runnable E;
    private final RectF a = new RectF();
    private final Rect b = new Rect();
    private AnimatorSet f;
    private final ValueAnimator g;
    private final ValueAnimator h;
    private final ValueAnimator i;
    private final ValueAnimator j;
    private final ValueAnimator k;
    private final ValueAnimator l;
    private final ArrayList m = new ArrayList();
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private int s;
    private int t;
    private Paint u;
    private int v[];
    private int w;
    private int x;
    private int y;
    private float z;

    public mlx(float f1, int i1, int j1, int ai[])
    {
        x = i1;
        z = -1F;
        y = j1;
        v = ai;
        D = isVisible();
        ai = m;
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "detentFraction", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setDuration(1332L);
        objectanimator.setInterpolator(c);
        g = objectanimator;
        ai.add(objectanimator);
        ai = m;
        objectanimator = ObjectAnimator.ofInt(this, "currentColor", new int[] {
            v[s], v[b()]
        });
        objectanimator.setEvaluator(e);
        objectanimator.setStartDelay(999L);
        objectanimator.setDuration(333L);
        objectanimator.setInterpolator(c);
        t = v[s];
        j = objectanimator;
        ai.add(objectanimator);
        ai = m;
        objectanimator = ObjectAnimator.ofFloat(this, "headFraction", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setDuration(666L);
        objectanimator.setInterpolator(d);
        h = objectanimator;
        ai.add(objectanimator);
        ai = m;
        objectanimator = ObjectAnimator.ofFloat(this, "tailFraction", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setStartDelay(666L);
        objectanimator.setDuration(666L);
        objectanimator.setInterpolator(d);
        i = objectanimator;
        ai.add(objectanimator);
        ai = m;
        objectanimator = ObjectAnimator.ofFloat(this, "alphaFraction", new float[] {
            0.0F, 1.0F
        });
        objectanimator.addListener(new mly(this));
        objectanimator.setDuration(750L);
        objectanimator.setInterpolator(c);
        k = objectanimator;
        ai.add(objectanimator);
        ai = m;
        objectanimator = ObjectAnimator.ofFloat(this, "alphaFraction", new float[] {
            1.0F, 0.0F
        });
        objectanimator.addListener(new mlz(this));
        objectanimator.setDuration(750L);
        objectanimator.setInterpolator(c);
        l = objectanimator;
        ai.add(objectanimator);
        ai = new AnimatorSet();
        ai.playTogether(new Animator[] {
            g, h, i, j
        });
        mkb.a(ai, new mma(this));
        f = ai;
        u = new Paint();
        u.setStyle(android.graphics.Paint.Style.STROKE);
        u.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        u.setAntiAlias(true);
        w = 255;
        setVisible(false, false);
        c();
    }

    static float a(mlx mlx1, float f1)
    {
        mlx1.q = 0.0F;
        return 0.0F;
    }

    static int a(mlx mlx1, int i1)
    {
        mlx1.s = i1;
        return i1;
    }

    static AnimatorSet a(mlx mlx1)
    {
        return mlx1.f;
    }

    static Runnable a(mlx mlx1, Runnable runnable)
    {
        mlx1.E = null;
        return null;
    }

    static boolean a(mlx mlx1, boolean flag, boolean flag1)
    {
        return mlx1.Drawable.setVisible(flag, false);
    }

    static float b(mlx mlx1, float f1)
    {
        mlx1.n = f1;
        return f1;
    }

    private int b()
    {
        return (s + 1) % v.length;
    }

    static int b(mlx mlx1, int i1)
    {
        mlx1.t = i1;
        return i1;
    }

    static boolean b(mlx mlx1)
    {
        return mlx1.D;
    }

    static Runnable c(mlx mlx1)
    {
        return mlx1.E;
    }

    private void c()
    {
        super.setVisible(D, false);
        f.cancel();
        for (Iterator iterator = m.iterator(); iterator.hasNext(); ((Animator)iterator.next()).cancel()) { }
        d();
        p = 0.0F;
        q = 0.0F;
        o = 0.0F;
        n = 0.0F;
        s = 0;
        t = v[s];
        j.setIntValues(new int[] {
            v[s], v[b()]
        });
        r = 0.0F;
        invalidateSelf();
    }

    private void d()
    {
        j.setStartDelay(999L);
        i.setStartDelay(666L);
    }

    static void d(mlx mlx1)
    {
        mlx1.c();
    }

    static void e(mlx mlx1)
    {
        mlx1.d();
    }

    static float f(mlx mlx1)
    {
        return mlx1.n;
    }

    static int g(mlx mlx1)
    {
        return mlx1.b();
    }

    static int[] h(mlx mlx1)
    {
        return mlx1.v;
    }

    static int i(mlx mlx1)
    {
        return mlx1.s;
    }

    static ValueAnimator j(mlx mlx1)
    {
        return mlx1.j;
    }

    public final void a()
    {
        stop();
        c();
    }

    public final void draw(Canvas canvas)
    {
        if (getBounds().isEmpty() || !isVisible() && !l.isRunning())
        {
            return;
        }
        float f1;
        float f2;
        float f3;
        float f4;
        Rect rect;
        int i1;
        if (z == -1F)
        {
            rect = getBounds();
        } else
        {
            rect = getBounds();
            int j1 = rect.centerX();
            int k1 = rect.centerY();
            b.left = j1 - getIntrinsicWidth() / 2;
            b.right = j1 + getIntrinsicWidth() / 2;
            b.top = k1 - getIntrinsicHeight() / 2;
            b.bottom = k1 + getIntrinsicHeight() / 2;
            rect = b;
        }
        f1 = (float)x * r;
        i1 = (int)((float)w * r);
        f2 = (float)(y + x) - f1 / 2.0F;
        u.setColor(t);
        u.setAlpha(i1);
        u.setStrokeWidth(f1);
        a.set(rect);
        a.inset(f2, f2);
        f2 = (float)((3.1415926535897931D * (double)(a.width() / 2.0F - f1)) / (double)(180F * f1));
        f1 = q * 290F;
        f2 = Math.max(Math.abs(p * 290F - f1), f2);
        f3 = o;
        f4 = n;
        canvas.drawArc(a, (286F * f3 + f4 + f1) - 90F, f2, false, u);
    }

    public final float getAlphaFraction()
    {
        return r;
    }

    public final int getCurrentColor()
    {
        return t;
    }

    public final float getDetentFraction()
    {
        return o;
    }

    public final float getHeadFraction()
    {
        return p;
    }

    public final int getIntrinsicHeight()
    {
        if (z != -1F)
        {
            return (int)(2.0F * z);
        } else
        {
            return super.getIntrinsicHeight();
        }
    }

    public final int getIntrinsicWidth()
    {
        if (z != -1F)
        {
            return (int)(2.0F * z);
        } else
        {
            return super.getIntrinsicWidth();
        }
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final float getTailFraction()
    {
        return q;
    }

    public final boolean isRunning()
    {
        return f.isRunning() || k.isRunning();
    }

    public final void setAlpha(int i1)
    {
        if (i1 != w)
        {
            w = i1;
            invalidateSelf();
        }
    }

    public final void setAlphaFraction(float f1)
    {
        r = f1;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        u.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public final void setCurrentColor(int i1)
    {
        t = i1;
        invalidateSelf();
    }

    public final void setDetentFraction(float f1)
    {
        o = f1;
        invalidateSelf();
    }

    public final void setHeadFraction(float f1)
    {
        p = f1;
        invalidateSelf();
    }

    public final void setTailFraction(float f1)
    {
        q = f1;
        invalidateSelf();
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        boolean flag2;
        if (flag != D)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag2 && !flag1)
        {
            return false;
        }
        D = flag;
        if (flag)
        {
            super.setVisible(true, flag1);
            if (l.isRunning())
            {
                if (0L == 0L)
                {
                    k.setCurrentPlayTime(750L - l.getCurrentPlayTime());
                }
                l.cancel();
            }
            if (flag1)
            {
                c();
                k.setStartDelay(0L);
                k.start();
                B = 0L;
                A = 0L;
            } else
            {
                long l1 = SystemClock.elapsedRealtime();
                long l2 = C;
                B = Math.max(0L, B - (l1 - l2));
                k.setStartDelay(B);
                k.start();
            }
            C = SystemClock.elapsedRealtime();
            E = null;
        } else
        if (flag2)
        {
            if (k.isRunning())
            {
                l.setCurrentPlayTime(750L - k.getCurrentPlayTime());
                k.cancel();
            }
            l.start();
        } else
        {
            c();
        }
        return flag2;
    }

    public final void start()
    {
        setVisible(true, true);
    }

    public final void stop()
    {
        setVisible(false, true);
    }

}
