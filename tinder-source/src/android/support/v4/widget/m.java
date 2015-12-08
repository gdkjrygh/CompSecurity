// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.b.a;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;

final class m extends Drawable
    implements Animatable
{
    private static final class a
    {

        final RectF a = new RectF();
        final Paint b = new Paint();
        final Paint c = new Paint();
        float d;
        float e;
        float f;
        float g;
        float h;
        int i[];
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float p;
        double q;
        int r;
        int s;
        int t;
        final Paint u = new Paint(1);
        int v;
        int w;
        private final android.graphics.drawable.Drawable.Callback x;

        final int a()
        {
            return (j + 1) % i.length;
        }

        public final void a(float f1)
        {
            d = f1;
            d();
        }

        public final void a(int i1)
        {
            j = i1;
            w = i[j];
        }

        public final void a(boolean flag)
        {
            if (n != flag)
            {
                n = flag;
                d();
            }
        }

        public final void a(int ai[])
        {
            i = ai;
            a(0);
        }

        public final void b()
        {
            k = d;
            l = e;
            m = f;
        }

        public final void b(float f1)
        {
            e = f1;
            d();
        }

        public final void c()
        {
            k = 0.0F;
            l = 0.0F;
            m = 0.0F;
            a(0.0F);
            b(0.0F);
            c(0.0F);
        }

        public final void c(float f1)
        {
            f = f1;
            d();
        }

        final void d()
        {
            x.invalidateDrawable(null);
        }

        public a(android.graphics.drawable.Drawable.Callback callback)
        {
            d = 0.0F;
            e = 0.0F;
            f = 0.0F;
            g = 5F;
            h = 2.5F;
            x = callback;
            b.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            b.setAntiAlias(true);
            b.setStyle(android.graphics.Paint.Style.STROKE);
            c.setStyle(android.graphics.Paint.Style.FILL);
            c.setAntiAlias(true);
        }
    }


    private static final Interpolator c = new LinearInterpolator();
    private static final Interpolator d = new android.support.v4.view.b.a();
    final a a;
    boolean b;
    private final int e[] = {
        0xff000000
    };
    private final ArrayList f = new ArrayList();
    private float g;
    private Resources h;
    private View i;
    private Animation j;
    private float k;
    private double l;
    private double m;
    private final android.graphics.drawable.Drawable.Callback n = new android.graphics.drawable.Drawable.Callback() {

        final m a;

        public final void invalidateDrawable(Drawable drawable)
        {
            a.invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l1)
        {
            a.scheduleSelf(runnable, l1);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
        {
            a.unscheduleSelf(runnable);
        }

            
            {
                a = m.this;
                super();
            }
    };

    public m(Context context, View view)
    {
        i = view;
        h = context.getResources();
        a = new a(n);
        a.a(e);
        a(1);
        context = a;
        view = new Animation(context) {

            final a a;
            final m b;

            public final void applyTransformation(float f1, Transformation transformation)
            {
                if (b.b)
                {
                    android.support.v4.widget.m.a(f1, a);
                    return;
                }
                float f2 = android.support.v4.widget.m.a(a);
                float f3 = a.l;
                float f5 = a.k;
                float f4 = a.m;
                m.b(f1, a);
                if (f1 <= 0.5F)
                {
                    float f7 = f1 / 0.5F;
                    f7 = android.support.v4.widget.m.a().getInterpolation(f7);
                    a.a(f5 + f7 * (0.8F - f2));
                }
                if (f1 > 0.5F)
                {
                    float f6 = (f1 - 0.5F) / 0.5F;
                    f6 = android.support.v4.widget.m.a().getInterpolation(f6);
                    a.b((0.8F - f2) * f6 + f3);
                }
                a.c(0.25F * f1 + f4);
                f2 = android.support.v4.widget.m.a(b) / 5F;
                b.c(216F * f1 + 1080F * f2);
            }

            
            {
                b = m.this;
                a = a1;
                super();
            }
        };
        view.setRepeatCount(-1);
        view.setRepeatMode(1);
        view.setInterpolator(c);
        view.setAnimationListener(new android.view.animation.Animation.AnimationListener(context) {

            final a a;
            final m b;

            public final void onAnimationEnd(Animation animation)
            {
            }

            public final void onAnimationRepeat(Animation animation)
            {
                a.b();
                a a1 = a;
                a1.a(a1.a());
                a.a(a.e);
                if (b.b)
                {
                    b.b = false;
                    animation.setDuration(1332L);
                    a.a(false);
                    return;
                } else
                {
                    android.support.v4.widget.m.a(b, (android.support.v4.widget.m.a(b) + 1.0F) % 5F);
                    return;
                }
            }

            public final void onAnimationStart(Animation animation)
            {
                android.support.v4.widget.m.a(b, 0.0F);
            }

            
            {
                b = m.this;
                a = a1;
                super();
            }
        });
        j = view;
    }

    static float a(a a1)
    {
        return b(a1);
    }

    static float a(m m1)
    {
        return m1.k;
    }

    static float a(m m1, float f1)
    {
        m1.k = f1;
        return f1;
    }

    static Interpolator a()
    {
        return d;
    }

    private void a(double d1, double d2, double d3, double d4, float f1, float f2)
    {
        a a1 = a;
        float f3 = h.getDisplayMetrics().density;
        l = (double)f3 * d1;
        m = (double)f3 * d2;
        float f4 = (float)d4 * f3;
        a1.g = f4;
        a1.b.setStrokeWidth(f4);
        a1.d();
        a1.q = (double)f3 * d3;
        a1.a(0);
        a1.r = (int)(f1 * f3);
        a1.s = (int)(f3 * f2);
        f1 = Math.min((int)l, (int)m);
        if (a1.q <= 0.0D || f1 < 0.0F)
        {
            f1 = (float)Math.ceil(a1.g / 2.0F);
        } else
        {
            f1 = (float)((double)(f1 / 2.0F) - a1.q);
        }
        a1.h = f1;
    }

    static void a(float f1, a a1)
    {
        c(f1, a1);
        float f2 = (float)(Math.floor(a1.m / 0.8F) + 1.0D);
        float f3 = b(a1);
        float f4 = a1.k;
        a1.a((a1.l - f3 - a1.k) * f1 + f4);
        a1.b(a1.l);
        f3 = a1.m;
        a1.c((f2 - a1.m) * f1 + f3);
    }

    private static float b(a a1)
    {
        return (float)Math.toRadians((double)a1.g / (6.2831853071795862D * a1.q));
    }

    static void b(float f1, a a1)
    {
        c(f1, a1);
    }

    private static void c(float f1, a a1)
    {
        if (f1 > 0.75F)
        {
            f1 = (f1 - 0.75F) / 0.25F;
            int i1 = a1.i[a1.j];
            int i2 = a1.i[a1.a()];
            int l1 = Integer.valueOf(i1).intValue();
            i1 = l1 >> 24 & 0xff;
            int j1 = l1 >> 16 & 0xff;
            int k1 = l1 >> 8 & 0xff;
            l1 &= 0xff;
            i2 = Integer.valueOf(i2).intValue();
            int j2 = (int)((float)((i2 >> 24 & 0xff) - i1) * f1);
            int k2 = (int)((float)((i2 >> 16 & 0xff) - j1) * f1);
            int l2 = (int)((float)((i2 >> 8 & 0xff) - k1) * f1);
            a1.w = (int)(f1 * (float)((i2 & 0xff) - l1)) + l1 | (i1 + j2 << 24 | j1 + k2 << 16 | l2 + k1 << 8);
        }
    }

    public final void a(float f1)
    {
        a a1 = a;
        if (f1 != a1.p)
        {
            a1.p = f1;
            a1.d();
        }
    }

    public final void a(int i1)
    {
        if (i1 == 0)
        {
            a(56D, 56D, 12.5D, 3D, 12F, 6F);
            return;
        } else
        {
            a(40D, 40D, 8.75D, 2.5D, 10F, 5F);
            return;
        }
    }

    public final void a(boolean flag)
    {
        a.a(flag);
    }

    public final void b(float f1)
    {
        a.a(0.0F);
        a.b(f1);
    }

    public final void b(int i1)
    {
        a.v = i1;
    }

    final void c(float f1)
    {
        g = f1;
        invalidateSelf();
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int i1 = canvas.save();
        canvas.rotate(g, rect.exactCenterX(), rect.exactCenterY());
        a a1 = a;
        RectF rectf = a1.a;
        rectf.set(rect);
        rectf.inset(a1.h, a1.h);
        float f1 = 360F * (a1.d + a1.f);
        float f2 = (a1.e + a1.f) * 360F - f1;
        a1.b.setColor(a1.w);
        canvas.drawArc(rectf, f1, f2, false, a1.b);
        if (a1.n)
        {
            float f3;
            float f4;
            float f5;
            float f6;
            if (a1.o == null)
            {
                a1.o = new Path();
                a1.o.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            } else
            {
                a1.o.reset();
            }
            f3 = (int)a1.h / 2;
            f4 = a1.p;
            f5 = (float)(a1.q * Math.cos(0.0D) + (double)rect.exactCenterX());
            f6 = (float)(a1.q * Math.sin(0.0D) + (double)rect.exactCenterY());
            a1.o.moveTo(0.0F, 0.0F);
            a1.o.lineTo((float)a1.r * a1.p, 0.0F);
            a1.o.lineTo(((float)a1.r * a1.p) / 2.0F, (float)a1.s * a1.p);
            a1.o.offset(f5 - f3 * f4, f6);
            a1.o.close();
            a1.c.setColor(a1.w);
            canvas.rotate((f1 + f2) - 5F, rect.exactCenterX(), rect.exactCenterY());
            canvas.drawPath(a1.o, a1.c);
        }
        if (a1.t < 255)
        {
            a1.u.setColor(a1.v);
            a1.u.setAlpha(255 - a1.t);
            canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, a1.u);
        }
        canvas.restoreToCount(i1);
    }

    public final int getAlpha()
    {
        return a.t;
    }

    public final int getIntrinsicHeight()
    {
        return (int)m;
    }

    public final int getIntrinsicWidth()
    {
        return (int)l;
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final boolean isRunning()
    {
        ArrayList arraylist = f;
        int j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            Animation animation = (Animation)arraylist.get(i1);
            if (animation.hasStarted() && !animation.hasEnded())
            {
                return true;
            }
        }

        return false;
    }

    public final void setAlpha(int i1)
    {
        a.t = i1;
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        a a1 = a;
        a1.b.setColorFilter(colorfilter);
        a1.d();
    }

    public final void start()
    {
        j.reset();
        a.b();
        if (a.e != a.d)
        {
            b = true;
            j.setDuration(666L);
            i.startAnimation(j);
            return;
        } else
        {
            a.a(0);
            a.c();
            j.setDuration(1332L);
            i.startAnimation(j);
            return;
        }
    }

    public final void stop()
    {
        i.clearAnimation();
        c(0.0F);
        a.a(false);
        a.a(0);
        a.c();
    }

}
