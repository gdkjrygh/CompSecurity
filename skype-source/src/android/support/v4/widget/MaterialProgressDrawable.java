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
import android.support.v4.view.animation.b;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.lang.annotation.Annotation;
import java.util.ArrayList;

final class MaterialProgressDrawable extends Drawable
    implements Animatable
{
    public static interface ProgressDrawableSize
        extends Annotation
    {
    }

    private static final class a
    {

        private final RectF a = new RectF();
        private final Paint b = new Paint();
        private final Paint c = new Paint();
        private final android.graphics.drawable.Drawable.Callback d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        private int j[];
        private int k;
        private float l;
        private float m;
        private float n;
        private boolean o;
        private Path p;
        private float q;
        private double r;
        private int s;
        private int t;
        private int u;
        private final Paint v = new Paint(1);
        private int w;
        private int x;

        private int n()
        {
            return (k + 1) % j.length;
        }

        private void o()
        {
            d.invalidateDrawable(null);
        }

        public final int a()
        {
            return j[n()];
        }

        public final void a(double d1)
        {
            r = d1;
        }

        public final void a(float f1)
        {
            h = f1;
            b.setStrokeWidth(f1);
            o();
        }

        public final void a(float f1, float f2)
        {
            s = (int)f1;
            t = (int)f2;
        }

        public final void a(int i1)
        {
            w = i1;
        }

        public final void a(int i1, int j1)
        {
            float f1 = Math.min(i1, j1);
            if (r <= 0.0D || f1 < 0.0F)
            {
                f1 = (float)Math.ceil(h / 2.0F);
            } else
            {
                f1 = (float)((double)(f1 / 2.0F) - r);
            }
            i = f1;
        }

        public final void a(Canvas canvas, Rect rect)
        {
            RectF rectf = a;
            rectf.set(rect);
            rectf.inset(i, i);
            float f1 = (e + g) * 360F;
            float f2 = (f + g) * 360F - f1;
            b.setColor(x);
            canvas.drawArc(rectf, f1, f2, false, b);
            if (o)
            {
                float f3;
                float f4;
                float f5;
                float f6;
                if (p == null)
                {
                    p = new Path();
                    p.setFillType(android.graphics.Path.FillType.EVEN_ODD);
                } else
                {
                    p.reset();
                }
                f3 = (int)i / 2;
                f4 = q;
                f5 = (float)(r * Math.cos(0.0D) + (double)rect.exactCenterX());
                f6 = (float)(r * Math.sin(0.0D) + (double)rect.exactCenterY());
                p.moveTo(0.0F, 0.0F);
                p.lineTo((float)s * q, 0.0F);
                p.lineTo(((float)s * q) / 2.0F, (float)t * q);
                p.offset(f5 - f3 * f4, f6);
                p.close();
                c.setColor(x);
                canvas.rotate((f1 + f2) - 5F, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(p, c);
            }
            if (u < 255)
            {
                v.setColor(w);
                v.setAlpha(255 - u);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, v);
            }
        }

        public final void a(ColorFilter colorfilter)
        {
            b.setColorFilter(colorfilter);
            o();
        }

        public final void a(boolean flag)
        {
            if (o != flag)
            {
                o = flag;
                o();
            }
        }

        public final void a(int ai[])
        {
            j = ai;
            c(0);
        }

        public final void b()
        {
            c(n());
        }

        public final void b(float f1)
        {
            e = f1;
            o();
        }

        public final void b(int i1)
        {
            x = i1;
        }

        public final int c()
        {
            return u;
        }

        public final void c(float f1)
        {
            f = f1;
            o();
        }

        public final void c(int i1)
        {
            k = i1;
            x = j[k];
        }

        public final float d()
        {
            return h;
        }

        public final void d(float f1)
        {
            g = f1;
            o();
        }

        public final void d(int i1)
        {
            u = i1;
        }

        public final float e()
        {
            return e;
        }

        public final void e(float f1)
        {
            if (f1 != q)
            {
                q = f1;
                o();
            }
        }

        public final float f()
        {
            return l;
        }

        public final float g()
        {
            return m;
        }

        public final int h()
        {
            return j[k];
        }

        public final float i()
        {
            return f;
        }

        public final double j()
        {
            return r;
        }

        public final float k()
        {
            return n;
        }

        public final void l()
        {
            l = e;
            m = f;
            n = g;
        }

        public final void m()
        {
            l = 0.0F;
            m = 0.0F;
            n = 0.0F;
            b(0.0F);
            c(0.0F);
            d(0.0F);
        }

        public a(android.graphics.drawable.Drawable.Callback callback)
        {
            e = 0.0F;
            f = 0.0F;
            g = 0.0F;
            h = 5F;
            i = 2.5F;
            d = callback;
            b.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            b.setAntiAlias(true);
            b.setStyle(android.graphics.Paint.Style.STROKE);
            c.setStyle(android.graphics.Paint.Style.FILL);
            c.setAntiAlias(true);
        }
    }


    private static final Interpolator b = new LinearInterpolator();
    private static final Interpolator c = new b();
    boolean a;
    private final int d[] = {
        0xff000000
    };
    private final ArrayList e = new ArrayList();
    private final a f;
    private float g;
    private Resources h;
    private View i;
    private Animation j;
    private float k;
    private double l;
    private double m;
    private final android.graphics.drawable.Drawable.Callback n = new android.graphics.drawable.Drawable.Callback() {

        final MaterialProgressDrawable a;

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
                a = MaterialProgressDrawable.this;
                super();
            }
    };

    public MaterialProgressDrawable(Context context, View view)
    {
        i = view;
        h = context.getResources();
        f = new a(n);
        f.a(d);
        a(1);
        context = f;
        view = new Animation(context) {

            final a a;
            final MaterialProgressDrawable b;

            public final void applyTransformation(float f1, Transformation transformation)
            {
                if (b.a)
                {
                    MaterialProgressDrawable.a(f1, a);
                    return;
                }
                float f2 = MaterialProgressDrawable.a(a);
                float f3 = a.g();
                float f5 = a.f();
                float f4 = a.k();
                android.support.v4.widget.MaterialProgressDrawable.b(f1, a);
                if (f1 <= 0.5F)
                {
                    float f7 = f1 / 0.5F;
                    f7 = MaterialProgressDrawable.a().getInterpolation(f7);
                    a.b(f5 + (0.8F - f2) * f7);
                }
                if (f1 > 0.5F)
                {
                    float f6 = (f1 - 0.5F) / 0.5F;
                    f6 = MaterialProgressDrawable.a().getInterpolation(f6);
                    a.c(f3 + f6 * (0.8F - f2));
                }
                a.d(f4 + 0.25F * f1);
                f2 = MaterialProgressDrawable.a(b) / 5F;
                b.d(216F * f1 + 1080F * f2);
            }

            
            {
                b = MaterialProgressDrawable.this;
                a = a1;
                super();
            }
        };
        view.setRepeatCount(-1);
        view.setRepeatMode(1);
        view.setInterpolator(b);
        view.setAnimationListener(new android.view.animation.Animation.AnimationListener(context) {

            final a a;
            final MaterialProgressDrawable b;

            public final void onAnimationEnd(Animation animation)
            {
            }

            public final void onAnimationRepeat(Animation animation)
            {
                a.l();
                a.b();
                a.b(a.i());
                if (b.a)
                {
                    b.a = false;
                    animation.setDuration(1332L);
                    a.a(false);
                    return;
                } else
                {
                    MaterialProgressDrawable.a(b, (MaterialProgressDrawable.a(b) + 1.0F) % 5F);
                    return;
                }
            }

            public final void onAnimationStart(Animation animation)
            {
                MaterialProgressDrawable.a(b, 0.0F);
            }

            
            {
                b = MaterialProgressDrawable.this;
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

    static float a(MaterialProgressDrawable materialprogressdrawable)
    {
        return materialprogressdrawable.k;
    }

    static float a(MaterialProgressDrawable materialprogressdrawable, float f1)
    {
        materialprogressdrawable.k = f1;
        return f1;
    }

    static Interpolator a()
    {
        return c;
    }

    private void a(double d1, double d2, double d3, double d4, float f1, float f2)
    {
        a a1 = f;
        float f3 = h.getDisplayMetrics().density;
        l = (double)f3 * d1;
        m = (double)f3 * d2;
        a1.a((float)d4 * f3);
        a1.a((double)f3 * d3);
        a1.c(0);
        a1.a(f1 * f3, f2 * f3);
        a1.a((int)l, (int)m);
    }

    static void a(float f1, a a1)
    {
        c(f1, a1);
        float f2 = (float)(Math.floor(a1.k() / 0.8F) + 1.0D);
        float f3 = b(a1);
        float f4 = a1.f();
        a1.b((a1.g() - f3 - a1.f()) * f1 + f4);
        a1.c(a1.g());
        f3 = a1.k();
        a1.d((f2 - a1.k()) * f1 + f3);
    }

    private static float b(a a1)
    {
        return (float)Math.toRadians((double)a1.d() / (6.2831853071795862D * a1.j()));
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
            int i1 = a1.h();
            int i2 = a1.a();
            int l1 = Integer.valueOf(i1).intValue();
            i1 = l1 >> 24 & 0xff;
            int j1 = l1 >> 16 & 0xff;
            int k1 = l1 >> 8 & 0xff;
            l1 &= 0xff;
            i2 = Integer.valueOf(i2).intValue();
            int j2 = (int)((float)((i2 >> 24 & 0xff) - i1) * f1);
            int k2 = (int)((float)((i2 >> 16 & 0xff) - j1) * f1);
            int l2 = (int)((float)((i2 >> 8 & 0xff) - k1) * f1);
            a1.b((int)(f1 * (float)((i2 & 0xff) - l1)) + l1 | (i1 + j2 << 24 | j1 + k2 << 16 | l2 + k1 << 8));
        }
    }

    public final void a(float f1)
    {
        f.e(f1);
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
        f.a(flag);
    }

    public final transient void a(int ai[])
    {
        f.a(ai);
        f.c(0);
    }

    public final void b(float f1)
    {
        f.b(0.0F);
        f.c(f1);
    }

    public final void b(int i1)
    {
        f.a(i1);
    }

    public final void c(float f1)
    {
        f.d(f1);
    }

    final void d(float f1)
    {
        g = f1;
        invalidateSelf();
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int i1 = canvas.save();
        canvas.rotate(g, rect.exactCenterX(), rect.exactCenterY());
        f.a(canvas, rect);
        canvas.restoreToCount(i1);
    }

    public final int getAlpha()
    {
        return f.c();
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
        ArrayList arraylist = e;
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
        f.d(i1);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        f.a(colorfilter);
    }

    public final void start()
    {
        j.reset();
        f.l();
        if (f.i() != f.e())
        {
            a = true;
            j.setDuration(666L);
            i.startAnimation(j);
            return;
        } else
        {
            f.c(0);
            f.m();
            j.setDuration(1332L);
            i.startAnimation(j);
            return;
        }
    }

    public final void stop()
    {
        i.clearAnimation();
        d(0.0F);
        f.a(false);
        f.c(0);
        f.m();
    }

}
