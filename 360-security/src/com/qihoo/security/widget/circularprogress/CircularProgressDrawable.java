// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.circularprogress;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.nineoldandroids.a.o;

// Referenced classes of package com.qihoo.security.widget.circularprogress:
//            a

public class CircularProgressDrawable extends Drawable
    implements Animatable
{
    public static final class Style extends Enum
    {

        public static final Style NORMAL;
        public static final Style ROUNDED;
        private static final Style a[];

        public static Style valueOf(String s1)
        {
            return (Style)Enum.valueOf(com/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style, s1);
        }

        public static Style[] values()
        {
            return (Style[])a.clone();
        }

        static 
        {
            NORMAL = new Style("NORMAL", 0);
            ROUNDED = new Style("ROUNDED", 1);
            a = (new Style[] {
                NORMAL, ROUNDED
            });
        }

        private Style(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static class a
    {

        private int a[];
        private float b;
        private float c;
        private float d;
        private int e;
        private int f;
        private Style g;
        private Interpolator h;
        private Interpolator i;

        private void a(Context context)
        {
            d = context.getResources().getDimension(0x7f090015);
            b = 1.0F;
            c = 1.0F;
            a = (new int[] {
                context.getResources().getColor(0x7f080048)
            });
            e = context.getResources().getInteger(0x7f0a0002);
            f = context.getResources().getInteger(0x7f0a0003);
            g = Style.ROUNDED;
        }

        public a a(float f1)
        {
            com.qihoo.security.widget.circularprogress.a.a(f1);
            b = f1;
            return this;
        }

        public a a(int i1)
        {
            a = (new int[] {
                i1
            });
            return this;
        }

        public a a(int ai[])
        {
            com.qihoo.security.widget.circularprogress.a.a(ai);
            a = ai;
            return this;
        }

        public CircularProgressDrawable a()
        {
            return new CircularProgressDrawable(a, d, b, c, e, f, g, i, h);
        }

        public a b(float f1)
        {
            com.qihoo.security.widget.circularprogress.a.a(f1);
            c = f1;
            return this;
        }

        public a b(int i1)
        {
            com.qihoo.security.widget.circularprogress.a.a(i1);
            e = i1;
            return this;
        }

        public a c(float f1)
        {
            com.qihoo.security.widget.circularprogress.a.a(f1, "StrokeWidth");
            d = f1;
            return this;
        }

        public a c(int i1)
        {
            com.qihoo.security.widget.circularprogress.a.a(i1);
            f = i1;
            return this;
        }

        public a(Context context)
        {
            h = CircularProgressDrawable.a();
            i = CircularProgressDrawable.b();
            a(context);
        }
    }


    public static final Interpolator a = new LinearInterpolator();
    private static final Interpolator b = new LinearInterpolator();
    private static final Interpolator c = new DecelerateInterpolator();
    private final RectF d;
    private o e;
    private o f;
    private o g;
    private o h;
    private boolean i;
    private Paint j;
    private boolean k;
    private int l;
    private int m;
    private float n;
    private float o;
    private float p;
    private float q;
    private Interpolator r;
    private Interpolator s;
    private float t;
    private int u[];
    private float v;
    private float w;
    private int x;
    private int y;
    private boolean z;

    private CircularProgressDrawable(int ai[], float f1, float f2, float f3, int i1, int j1, Style style, 
            Interpolator interpolator, Interpolator interpolator1)
    {
        d = new RectF();
        o = 0.0F;
        p = 0.0F;
        q = 1.0F;
        s = interpolator1;
        r = interpolator;
        t = f1;
        m = 0;
        u = ai;
        l = u[0];
        v = f2;
        w = f3;
        x = i1;
        y = j1;
        j = new Paint();
        j.setAntiAlias(true);
        j.setStyle(android.graphics.Paint.Style.STROKE);
        j.setStrokeWidth(f1);
        interpolator = j;
        if (style == Style.ROUNDED)
        {
            ai = android.graphics.Paint.Cap.ROUND;
        } else
        {
            ai = android.graphics.Paint.Cap.BUTT;
        }
        interpolator.setStrokeCap(ai);
        j.setColor(u[0]);
        f();
    }


    static int a(CircularProgressDrawable circularprogressdrawable, int i1)
    {
        circularprogressdrawable.m = i1;
        return i1;
    }

    static Interpolator a()
    {
        return c;
    }

    static void a(CircularProgressDrawable circularprogressdrawable, float f1)
    {
        circularprogressdrawable.c(f1);
    }

    static boolean a(CircularProgressDrawable circularprogressdrawable)
    {
        return circularprogressdrawable.z;
    }

    static boolean a(CircularProgressDrawable circularprogressdrawable, boolean flag)
    {
        circularprogressdrawable.i = flag;
        return flag;
    }

    static int b(CircularProgressDrawable circularprogressdrawable)
    {
        return circularprogressdrawable.y;
    }

    static int b(CircularProgressDrawable circularprogressdrawable, int i1)
    {
        circularprogressdrawable.l = i1;
        return i1;
    }

    static Interpolator b()
    {
        return b;
    }

    static boolean b(CircularProgressDrawable circularprogressdrawable, boolean flag)
    {
        circularprogressdrawable.z = flag;
        return flag;
    }

    static int c(CircularProgressDrawable circularprogressdrawable)
    {
        return circularprogressdrawable.x;
    }

    private void c()
    {
        z = true;
        j.setColor(l);
    }

    private void c(float f1)
    {
        q = f1;
        invalidateSelf();
    }

    private void d()
    {
        i = true;
        o = o + (float)x;
    }

    static void d(CircularProgressDrawable circularprogressdrawable)
    {
        circularprogressdrawable.e();
    }

    static o e(CircularProgressDrawable circularprogressdrawable)
    {
        return circularprogressdrawable.f;
    }

    private void e()
    {
        i = false;
        o = o + (float)(360 - y);
    }

    private void f()
    {
        g = com.nineoldandroids.a.o.b(new float[] {
            0.0F, 360F
        });
        g.a(r);
        g.d((long)(2000F / w));
        g.a(new com.nineoldandroids.a.o.b() {

            final CircularProgressDrawable a;

            public void a(o o1)
            {
                float f1 = o1.p();
                a.a(f1 * 360F);
            }

            
            {
                a = CircularProgressDrawable.this;
                super();
            }
        });
        g.a(-1);
        g.b(1);
        e = com.nineoldandroids.a.o.b(new float[] {
            (float)x, (float)y
        });
        e.a(s);
        e.d((long)(600F / v));
        e.a(new com.nineoldandroids.a.o.b() {

            final CircularProgressDrawable a;

            public void a(o o1)
            {
                float f1 = o1.p();
                if (CircularProgressDrawable.a(a))
                {
                    f1 *= CircularProgressDrawable.b(a);
                } else
                {
                    float f2 = CircularProgressDrawable.c(a);
                    f1 = f1 * (float)(CircularProgressDrawable.b(a) - CircularProgressDrawable.c(a)) + f2;
                }
                a.b(f1);
            }

            
            {
                a = CircularProgressDrawable.this;
                super();
            }
        });
        e.a(new com.nineoldandroids.a.a.a() {

            boolean a;
            final CircularProgressDrawable b;

            public void a(com.nineoldandroids.a.a a1)
            {
                a = false;
                CircularProgressDrawable.a(b, true);
            }

            public void b(com.nineoldandroids.a.a a1)
            {
                if (!a)
                {
                    CircularProgressDrawable.b(b, false);
                    CircularProgressDrawable.d(b);
                    CircularProgressDrawable.e(b).a();
                }
            }

            public void c(com.nineoldandroids.a.a a1)
            {
                a = true;
            }

            public void d(com.nineoldandroids.a.a a1)
            {
            }

            
            {
                b = CircularProgressDrawable.this;
                super();
                a = false;
            }
        });
        f = com.nineoldandroids.a.o.b(new float[] {
            (float)y, (float)x
        });
        f.a(s);
        f.d((long)(600F / v));
        f.a(new com.nineoldandroids.a.o.b() {

            final CircularProgressDrawable a;

            public void a(o o1)
            {
                float f1 = o1.p();
                a.b((float)CircularProgressDrawable.b(a) - f1 * (float)(CircularProgressDrawable.b(a) - CircularProgressDrawable.c(a)));
                long l1 = o1.m();
                f1 = (float)o1.n() / (float)l1;
                if (CircularProgressDrawable.f(a).length > 1 && f1 > 0.7F)
                {
                    CircularProgressDrawable.h(a).setColor(CircularProgressDrawable.g(a));
                }
            }

            
            {
                a = CircularProgressDrawable.this;
                super();
            }
        });
        f.a(new com.nineoldandroids.a.a.a() {

            boolean a;
            final CircularProgressDrawable b;

            public void a(com.nineoldandroids.a.a a1)
            {
                a = false;
            }

            public void b(com.nineoldandroids.a.a a1)
            {
                if (!a)
                {
                    CircularProgressDrawable.i(b);
                    CircularProgressDrawable.a(b, (CircularProgressDrawable.j(b) + 1) % CircularProgressDrawable.f(b).length);
                    CircularProgressDrawable.b(b, CircularProgressDrawable.f(b)[CircularProgressDrawable.j(b)]);
                    CircularProgressDrawable.h(b).setColor(CircularProgressDrawable.g(b));
                    CircularProgressDrawable.k(b).a();
                }
            }

            public void c(com.nineoldandroids.a.a a1)
            {
                a = true;
            }

            public void d(com.nineoldandroids.a.a a1)
            {
            }

            
            {
                b = CircularProgressDrawable.this;
                super();
            }
        });
        h = com.nineoldandroids.a.o.b(new float[] {
            1.0F, 0.0F
        });
        h.a(a);
        h.d(200L);
        h.a(new com.nineoldandroids.a.o.b() {

            final CircularProgressDrawable a;

            public void a(o o1)
            {
                CircularProgressDrawable.a(a, 1.0F - o1.p());
            }

            
            {
                a = CircularProgressDrawable.this;
                super();
            }
        });
        h.a(new com.nineoldandroids.a.a.a() {

            final CircularProgressDrawable a;
            private boolean b;

            public void a(com.nineoldandroids.a.a a1)
            {
                b = false;
            }

            public void b(com.nineoldandroids.a.a a1)
            {
                CircularProgressDrawable.a(a, 1.0F);
                if (!b)
                {
                    a.stop();
                }
            }

            public void c(com.nineoldandroids.a.a a1)
            {
                b = true;
            }

            public void d(com.nineoldandroids.a.a a1)
            {
            }

            
            {
                a = CircularProgressDrawable.this;
                super();
            }
        });
    }

    static int[] f(CircularProgressDrawable circularprogressdrawable)
    {
        return circularprogressdrawable.u;
    }

    static int g(CircularProgressDrawable circularprogressdrawable)
    {
        return circularprogressdrawable.l;
    }

    private void g()
    {
        g.b();
        e.b();
        f.b();
        h.b();
    }

    static Paint h(CircularProgressDrawable circularprogressdrawable)
    {
        return circularprogressdrawable.j;
    }

    static void i(CircularProgressDrawable circularprogressdrawable)
    {
        circularprogressdrawable.d();
    }

    static int j(CircularProgressDrawable circularprogressdrawable)
    {
        return circularprogressdrawable.m;
    }

    static o k(CircularProgressDrawable circularprogressdrawable)
    {
        return circularprogressdrawable.e;
    }

    public void a(float f1)
    {
        p = f1;
        invalidateSelf();
    }

    public void b(float f1)
    {
        n = f1;
        invalidateSelf();
    }

    public void draw(Canvas canvas)
    {
        if (!isRunning())
        {
            return;
        }
        float f3 = p - o;
        float f2 = n;
        float f1 = f3;
        if (!i)
        {
            f1 = f3 + (360F - f2);
        }
        f1 %= 360F;
        if (q < 1.0F)
        {
            float f4 = f2 * q;
            f1 = ((f2 - f4) + f1) % 360F;
            f2 = f4;
        }
        canvas.drawArc(d, f1, f2, false, j);
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isRunning()
    {
        return k;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        d.left = (float)rect.left + t / 2.0F + 0.5F;
        d.right = (float)rect.right - t / 2.0F - 0.5F;
        d.top = (float)rect.top + t / 2.0F + 0.5F;
        d.bottom = (float)rect.bottom - t / 2.0F - 0.5F;
    }

    public void setAlpha(int i1)
    {
        j.setAlpha(i1);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        j.setColorFilter(colorfilter);
    }

    public void start()
    {
        if (isRunning())
        {
            return;
        } else
        {
            k = true;
            c();
            g.a();
            e.a();
            invalidateSelf();
            return;
        }
    }

    public void stop()
    {
        if (!isRunning())
        {
            return;
        } else
        {
            k = false;
            g();
            invalidateSelf();
            return;
        }
    }

}
