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
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;

class h extends Drawable
    implements Animatable
{
    private static class a extends AccelerateDecelerateInterpolator
    {

        public float getInterpolation(float f1)
        {
            return super.getInterpolation(Math.max(0.0F, (f1 - 0.5F) * 2.0F));
        }

        private a()
        {
        }

    }

    private static class b
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
        private final Paint v = new Paint();
        private int w;

        private void a(Canvas canvas, float f1, float f2, Rect rect)
        {
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
                c.setColor(j[k]);
                canvas.rotate((f1 + f2) - 5F, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(p, c);
            }
        }

        private void l()
        {
            d.invalidateDrawable(null);
        }

        public void a()
        {
            k = (k + 1) % j.length;
        }

        public void a(double d1)
        {
            r = d1;
        }

        public void a(float f1)
        {
            h = f1;
            b.setStrokeWidth(f1);
            l();
        }

        public void a(float f1, float f2)
        {
            s = (int)f1;
            t = (int)f2;
        }

        public void a(int i1)
        {
            w = i1;
        }

        public void a(int i1, int j1)
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

        public void a(Canvas canvas, Rect rect)
        {
            RectF rectf = a;
            rectf.set(rect);
            rectf.inset(i, i);
            float f1 = (e + g) * 360F;
            float f2 = (f + g) * 360F - f1;
            b.setColor(j[k]);
            canvas.drawArc(rectf, f1, f2, false, b);
            a(canvas, f1, f2, rect);
            if (u < 255)
            {
                v.setColor(w);
                v.setAlpha(255 - u);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, v);
            }
        }

        public void a(ColorFilter colorfilter)
        {
            b.setColorFilter(colorfilter);
            l();
        }

        public void a(boolean flag)
        {
            if (o != flag)
            {
                o = flag;
                l();
            }
        }

        public void a(int ai[])
        {
            j = ai;
            b(0);
        }

        public int b()
        {
            return u;
        }

        public void b(float f1)
        {
            e = f1;
            l();
        }

        public void b(int i1)
        {
            k = i1;
        }

        public float c()
        {
            return h;
        }

        public void c(float f1)
        {
            f = f1;
            l();
        }

        public void c(int i1)
        {
            u = i1;
        }

        public float d()
        {
            return e;
        }

        public void d(float f1)
        {
            g = f1;
            l();
        }

        public float e()
        {
            return l;
        }

        public void e(float f1)
        {
            if (f1 != q)
            {
                q = f1;
                l();
            }
        }

        public float f()
        {
            return m;
        }

        public float g()
        {
            return f;
        }

        public double h()
        {
            return r;
        }

        public float i()
        {
            return n;
        }

        public void j()
        {
            l = e;
            m = f;
            n = g;
        }

        public void k()
        {
            l = 0.0F;
            m = 0.0F;
            n = 0.0F;
            b(0.0F);
            c(0.0F);
            d(0.0F);
        }

        public b(android.graphics.drawable.Drawable.Callback callback)
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

    private static class c extends AccelerateDecelerateInterpolator
    {

        public float getInterpolation(float f1)
        {
            return super.getInterpolation(Math.min(1.0F, 2.0F * f1));
        }

        private c()
        {
        }

    }


    private static final Interpolator b = new LinearInterpolator();
    private static final Interpolator c = new a();
    private static final Interpolator d = new c();
    private static final Interpolator e = new AccelerateDecelerateInterpolator();
    boolean a;
    private final int f[] = {
        0xff000000
    };
    private final ArrayList g = new ArrayList();
    private final b h;
    private float i;
    private Resources j;
    private View k;
    private Animation l;
    private float m;
    private double n;
    private double o;
    private final android.graphics.drawable.Drawable.Callback p = new android.graphics.drawable.Drawable.Callback() {

        final h a;

        public void invalidateDrawable(Drawable drawable)
        {
            a.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long l1)
        {
            a.scheduleSelf(runnable, l1);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable)
        {
            a.unscheduleSelf(runnable);
        }

            
            {
                a = h.this;
                super();
            }
    };

    public h(Context context, View view)
    {
        k = view;
        j = context.getResources();
        h = new b(p);
        h.a(f);
        a(1);
        c();
    }

    static float a(h h1)
    {
        return h1.m;
    }

    static float a(h h1, float f1)
    {
        h1.m = f1;
        return f1;
    }

    static Interpolator a()
    {
        return d;
    }

    private void a(double d1, double d2, double d3, double d4, float f1, float f2)
    {
        b b1 = h;
        float f3 = j.getDisplayMetrics().density;
        n = (double)f3 * d1;
        o = (double)f3 * d2;
        b1.a((float)d4 * f3);
        b1.a((double)f3 * d3);
        b1.b(0);
        b1.a(f1 * f3, f3 * f2);
        b1.a((int)n, (int)o);
    }

    private void a(float f1, b b1)
    {
        float f2 = (float)(Math.floor(b1.i() / 0.8F) + 1.0D);
        b1.b(b1.e() + (b1.f() - b1.e()) * f1);
        float f3 = b1.i();
        b1.d((f2 - b1.i()) * f1 + f3);
    }

    static void a(h h1, float f1, b b1)
    {
        h1.a(f1, b1);
    }

    static Interpolator b()
    {
        return c;
    }

    private void c()
    {
        b b1 = h;
        Animation animation = new Animation(b1) {

            final b a;
            final h b;

            public void applyTransformation(float f1, Transformation transformation)
            {
                if (b.a)
                {
                    h.a(b, f1, a);
                    return;
                } else
                {
                    float f4 = (float)Math.toRadians((double)a.c() / (6.2831853071795862D * a.h()));
                    float f5 = a.f();
                    float f2 = a.e();
                    float f3 = a.i();
                    float f6 = h.a().getInterpolation(f1);
                    a.c((0.8F - f4) * f6 + f5);
                    f4 = h.b().getInterpolation(f1);
                    a.b(f4 * 0.8F + f2);
                    a.d(0.25F * f1 + f3);
                    f2 = h.a(b) / 5F;
                    b.c(144F * f1 + 720F * f2);
                    return;
                }
            }

            
            {
                b = h.this;
                a = b1;
                super();
            }
        };
        animation.setRepeatCount(-1);
        animation.setRepeatMode(1);
        animation.setInterpolator(b);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(b1) {

            final b a;
            final h b;

            public void onAnimationEnd(Animation animation1)
            {
            }

            public void onAnimationRepeat(Animation animation1)
            {
                a.j();
                a.a();
                a.b(a.g());
                if (b.a)
                {
                    b.a = false;
                    animation1.setDuration(1333L);
                    a.a(false);
                    return;
                } else
                {
                    h.a(b, (h.a(b) + 1.0F) % 5F);
                    return;
                }
            }

            public void onAnimationStart(Animation animation1)
            {
                h.a(b, 0.0F);
            }

            
            {
                b = h.this;
                a = b1;
                super();
            }
        });
        l = animation;
    }

    public void a(float f1)
    {
        h.e(f1);
    }

    public void a(float f1, float f2)
    {
        h.b(f1);
        h.c(f2);
    }

    public void a(int i1)
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

    public void a(boolean flag)
    {
        h.a(flag);
    }

    public transient void a(int ai[])
    {
        h.a(ai);
        h.b(0);
    }

    public void b(float f1)
    {
        h.d(f1);
    }

    public void b(int i1)
    {
        h.a(i1);
    }

    void c(float f1)
    {
        i = f1;
        invalidateSelf();
    }

    public void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int i1 = canvas.save();
        canvas.rotate(i, rect.exactCenterX(), rect.exactCenterY());
        h.a(canvas, rect);
        canvas.restoreToCount(i1);
    }

    public int getAlpha()
    {
        return h.b();
    }

    public int getIntrinsicHeight()
    {
        return (int)o;
    }

    public int getIntrinsicWidth()
    {
        return (int)n;
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isRunning()
    {
        ArrayList arraylist = g;
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

    public void setAlpha(int i1)
    {
        h.c(i1);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        h.a(colorfilter);
    }

    public void start()
    {
        l.reset();
        h.j();
        if (h.g() != h.d())
        {
            a = true;
            l.setDuration(666L);
            k.startAnimation(l);
            return;
        } else
        {
            h.b(0);
            h.k();
            l.setDuration(1333L);
            k.startAnimation(l);
            return;
        }
    }

    public void stop()
    {
        k.clearAnimation();
        c(0.0F);
        h.a(false);
        h.b(0);
        h.k();
    }

}
