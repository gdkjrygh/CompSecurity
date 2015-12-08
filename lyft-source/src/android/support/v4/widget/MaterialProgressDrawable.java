// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;

class MaterialProgressDrawable extends Drawable
    implements Animatable
{

    private static final Interpolator b = new LinearInterpolator();
    private static final Interpolator c = new FastOutSlowInInterpolator();
    boolean a;
    private final int d[] = {
        0xff000000
    };
    private final ArrayList e = new ArrayList();
    private final Ring f;
    private float g;
    private Resources h;
    private View i;
    private Animation j;
    private float k;
    private double l;
    private double m;
    private final android.graphics.drawable.Drawable.Callback n = new android.graphics.drawable.Drawable.Callback() {

        final MaterialProgressDrawable a;

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
                a = MaterialProgressDrawable.this;
                super();
            }
    };

    public MaterialProgressDrawable(Context context, View view)
    {
        i = view;
        h = context.getResources();
        f = new Ring(n);
        f.a(d);
        a(1);
        b();
    }

    private float a(Ring ring)
    {
        return (float)Math.toRadians((double)ring.d() / (6.2831853071795862D * ring.j()));
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

    static float a(MaterialProgressDrawable materialprogressdrawable, Ring ring)
    {
        return materialprogressdrawable.a(ring);
    }

    private int a(float f1, int i1, int j1)
    {
        int i2 = Integer.valueOf(i1).intValue();
        i1 = i2 >> 24 & 0xff;
        int k1 = i2 >> 16 & 0xff;
        int l1 = i2 >> 8 & 0xff;
        i2 &= 0xff;
        j1 = Integer.valueOf(j1).intValue();
        int j2 = (int)((float)((j1 >> 24 & 0xff) - i1) * f1);
        int k2 = (int)((float)((j1 >> 16 & 0xff) - k1) * f1);
        int l2 = (int)((float)((j1 >> 8 & 0xff) - l1) * f1);
        return i2 + (int)((float)((j1 & 0xff) - i2) * f1) | (i1 + j2 << 24 | k1 + k2 << 16 | l2 + l1 << 8);
    }

    static Interpolator a()
    {
        return c;
    }

    private void a(double d1, double d2, double d3, double d4, float f1, float f2)
    {
        Ring ring = f;
        float f3 = h.getDisplayMetrics().density;
        l = (double)f3 * d1;
        m = (double)f3 * d2;
        ring.a((float)d4 * f3);
        ring.a((double)f3 * d3);
        ring.c(0);
        ring.a(f1 * f3, f3 * f2);
        ring.a((int)l, (int)m);
    }

    private void a(float f1, Ring ring)
    {
        if (f1 > 0.75F)
        {
            ring.b(a((f1 - 0.75F) / 0.25F, ring.h(), ring.a()));
        }
    }

    static void a(MaterialProgressDrawable materialprogressdrawable, float f1, Ring ring)
    {
        materialprogressdrawable.b(f1, ring);
    }

    private void b()
    {
        Ring ring = f;
        Animation animation = new Animation(ring) {

            final Ring a;
            final MaterialProgressDrawable b;

            public void applyTransformation(float f1, Transformation transformation)
            {
                if (b.a)
                {
                    MaterialProgressDrawable.a(b, f1, a);
                    return;
                }
                float f2 = MaterialProgressDrawable.a(b, a);
                float f3 = a.g();
                float f5 = a.f();
                float f4 = a.k();
                MaterialProgressDrawable.b(b, f1, a);
                if (f1 <= 0.5F)
                {
                    float f7 = f1 / 0.5F;
                    f7 = MaterialProgressDrawable.a().getInterpolation(f7);
                    a.b(f5 + f7 * (0.8F - f2));
                }
                if (f1 > 0.5F)
                {
                    float f6 = (f1 - 0.5F) / 0.5F;
                    f6 = MaterialProgressDrawable.a().getInterpolation(f6);
                    a.c((0.8F - f2) * f6 + f3);
                }
                a.d(0.25F * f1 + f4);
                f2 = MaterialProgressDrawable.a(b) / 5F;
                b.c(216F * f1 + 1080F * f2);
            }

            
            {
                b = MaterialProgressDrawable.this;
                a = ring;
                super();
            }
        };
        animation.setRepeatCount(-1);
        animation.setRepeatMode(1);
        animation.setInterpolator(b);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(ring) {

            final Ring a;
            final MaterialProgressDrawable b;

            public void onAnimationEnd(Animation animation1)
            {
            }

            public void onAnimationRepeat(Animation animation1)
            {
                a.l();
                a.b();
                a.b(a.i());
                if (b.a)
                {
                    b.a = false;
                    animation1.setDuration(1332L);
                    a.a(false);
                    return;
                } else
                {
                    MaterialProgressDrawable.a(b, (MaterialProgressDrawable.a(b) + 1.0F) % 5F);
                    return;
                }
            }

            public void onAnimationStart(Animation animation1)
            {
                MaterialProgressDrawable.a(b, 0.0F);
            }

            
            {
                b = MaterialProgressDrawable.this;
                a = ring;
                super();
            }
        });
        j = animation;
    }

    private void b(float f1, Ring ring)
    {
        a(f1, ring);
        float f2 = (float)(Math.floor(ring.k() / 0.8F) + 1.0D);
        float f3 = a(ring);
        float f4 = ring.f();
        ring.b((ring.g() - f3 - ring.f()) * f1 + f4);
        ring.c(ring.g());
        f3 = ring.k();
        ring.d((f2 - ring.k()) * f1 + f3);
    }

    static void b(MaterialProgressDrawable materialprogressdrawable, float f1, Ring ring)
    {
        materialprogressdrawable.a(f1, ring);
    }

    public void a(float f1)
    {
        f.e(f1);
    }

    public void a(float f1, float f2)
    {
        f.b(f1);
        f.c(f2);
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
        f.a(flag);
    }

    public transient void a(int ai[])
    {
        f.a(ai);
        f.c(0);
    }

    public void b(float f1)
    {
        f.d(f1);
    }

    public void b(int i1)
    {
        f.a(i1);
    }

    void c(float f1)
    {
        g = f1;
        invalidateSelf();
    }

    public void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int i1 = canvas.save();
        canvas.rotate(g, rect.exactCenterX(), rect.exactCenterY());
        f.a(canvas, rect);
        canvas.restoreToCount(i1);
    }

    public int getAlpha()
    {
        return f.c();
    }

    public int getIntrinsicHeight()
    {
        return (int)m;
    }

    public int getIntrinsicWidth()
    {
        return (int)l;
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isRunning()
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

    public void setAlpha(int i1)
    {
        f.d(i1);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        f.a(colorfilter);
    }

    public void start()
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

    public void stop()
    {
        i.clearAnimation();
        c(0.0F);
        f.a(false);
        f.c(0);
        f.m();
    }


    private class Ring
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
                c.setColor(x);
                canvas.rotate((f1 + f2) - 5F, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(p, c);
            }
        }

        private int n()
        {
            return (k + 1) % j.length;
        }

        private void o()
        {
            d.invalidateDrawable(null);
        }

        public int a()
        {
            return j[n()];
        }

        public void a(double d1)
        {
            r = d1;
        }

        public void a(float f1)
        {
            h = f1;
            b.setStrokeWidth(f1);
            o();
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
            b.setColor(x);
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
            o();
        }

        public void a(boolean flag)
        {
            if (o != flag)
            {
                o = flag;
                o();
            }
        }

        public void a(int ai[])
        {
            j = ai;
            c(0);
        }

        public void b()
        {
            c(n());
        }

        public void b(float f1)
        {
            e = f1;
            o();
        }

        public void b(int i1)
        {
            x = i1;
        }

        public int c()
        {
            return u;
        }

        public void c(float f1)
        {
            f = f1;
            o();
        }

        public void c(int i1)
        {
            k = i1;
            x = j[k];
        }

        public float d()
        {
            return h;
        }

        public void d(float f1)
        {
            g = f1;
            o();
        }

        public void d(int i1)
        {
            u = i1;
        }

        public float e()
        {
            return e;
        }

        public void e(float f1)
        {
            if (f1 != q)
            {
                q = f1;
                o();
            }
        }

        public float f()
        {
            return l;
        }

        public float g()
        {
            return m;
        }

        public int h()
        {
            return j[k];
        }

        public float i()
        {
            return f;
        }

        public double j()
        {
            return r;
        }

        public float k()
        {
            return n;
        }

        public void l()
        {
            l = e;
            m = f;
            n = g;
        }

        public void m()
        {
            l = 0.0F;
            m = 0.0F;
            n = 0.0F;
            b(0.0F);
            c(0.0F);
            d(0.0F);
        }

        public Ring(android.graphics.drawable.Drawable.Callback callback)
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

}
