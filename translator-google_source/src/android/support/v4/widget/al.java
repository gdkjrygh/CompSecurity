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
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ao, ap, am, an

final class al extends Drawable
    implements Animatable
{

    private static final Interpolator c = new LinearInterpolator();
    private static final Interpolator d = new a();
    final ap a;
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
    private final android.graphics.drawable.Drawable.Callback n = new ao(this);

    public al(Context context, View view)
    {
        i = view;
        h = context.getResources();
        a = new ap(n);
        a.a(e);
        a(1);
        context = a;
        view = new am(this, context);
        view.setRepeatCount(-1);
        view.setRepeatMode(1);
        view.setInterpolator(c);
        view.setAnimationListener(new an(this, context));
        j = view;
    }

    static float a(al al1)
    {
        return al1.k;
    }

    static float a(al al1, float f1)
    {
        al1.k = f1;
        return f1;
    }

    static float a(ap ap1)
    {
        return b(ap1);
    }

    static Interpolator a()
    {
        return d;
    }

    private void a(double d1, double d2, double d3, double d4, float f1, float f2)
    {
        ap ap1 = a;
        float f3 = h.getDisplayMetrics().density;
        l = (double)f3 * d1;
        m = (double)f3 * d2;
        float f4 = (float)d4 * f3;
        ap1.g = f4;
        ap1.b.setStrokeWidth(f4);
        ap1.d();
        ap1.q = (double)f3 * d3;
        ap1.a(0);
        ap1.r = (int)(f1 * f3);
        ap1.s = (int)(f3 * f2);
        f1 = Math.min((int)l, (int)m);
        if (ap1.q <= 0.0D || f1 < 0.0F)
        {
            f1 = (float)Math.ceil(ap1.g / 2.0F);
        } else
        {
            f1 = (float)((double)(f1 / 2.0F) - ap1.q);
        }
        ap1.h = f1;
    }

    static void a(float f1, ap ap1)
    {
        c(f1, ap1);
        float f2 = (float)(Math.floor(ap1.m / 0.8F) + 1.0D);
        float f3 = b(ap1);
        float f4 = ap1.k;
        ap1.a((ap1.l - f3 - ap1.k) * f1 + f4);
        ap1.b(ap1.l);
        f3 = ap1.m;
        ap1.c((f2 - ap1.m) * f1 + f3);
    }

    private static float b(ap ap1)
    {
        return (float)Math.toRadians((double)ap1.g / (6.2831853071795862D * ap1.q));
    }

    static void b(float f1, ap ap1)
    {
        c(f1, ap1);
    }

    private static void c(float f1, ap ap1)
    {
        if (f1 > 0.75F)
        {
            f1 = (f1 - 0.75F) / 0.25F;
            int i1 = ap1.i[ap1.j];
            int i2 = ap1.i[ap1.a()];
            int l1 = Integer.valueOf(i1).intValue();
            i1 = l1 >>> 24;
            int j1 = l1 >> 16 & 0xff;
            int k1 = l1 >> 8 & 0xff;
            l1 &= 0xff;
            i2 = Integer.valueOf(i2).intValue();
            int j2 = (int)((float)((i2 >>> 24) - i1) * f1);
            int k2 = (int)((float)((i2 >> 16 & 0xff) - j1) * f1);
            int l2 = (int)((float)((i2 >> 8 & 0xff) - k1) * f1);
            ap1.w = (int)(f1 * (float)((i2 & 0xff) - l1)) + l1 | (i1 + j2 << 24 | j1 + k2 << 16 | l2 + k1 << 8);
        }
    }

    public final void a(float f1)
    {
        ap ap1 = a;
        if (f1 != ap1.p)
        {
            ap1.p = f1;
            ap1.d();
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
        ap ap1 = a;
        RectF rectf = ap1.a;
        rectf.set(rect);
        rectf.inset(ap1.h, ap1.h);
        float f1 = 360F * (ap1.d + ap1.f);
        float f2 = (ap1.e + ap1.f) * 360F - f1;
        ap1.b.setColor(ap1.w);
        canvas.drawArc(rectf, f1, f2, false, ap1.b);
        if (ap1.n)
        {
            float f3;
            float f4;
            float f5;
            float f6;
            if (ap1.o == null)
            {
                ap1.o = new Path();
                ap1.o.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            } else
            {
                ap1.o.reset();
            }
            f3 = (int)ap1.h / 2;
            f4 = ap1.p;
            f5 = (float)(ap1.q * Math.cos(0.0D) + (double)rect.exactCenterX());
            f6 = (float)(ap1.q * Math.sin(0.0D) + (double)rect.exactCenterY());
            ap1.o.moveTo(0.0F, 0.0F);
            ap1.o.lineTo((float)ap1.r * ap1.p, 0.0F);
            ap1.o.lineTo(((float)ap1.r * ap1.p) / 2.0F, (float)ap1.s * ap1.p);
            ap1.o.offset(f5 - f3 * f4, f6);
            ap1.o.close();
            ap1.c.setColor(ap1.w);
            canvas.rotate((f1 + f2) - 5F, rect.exactCenterX(), rect.exactCenterY());
            canvas.drawPath(ap1.o, ap1.c);
        }
        if (ap1.t < 255)
        {
            ap1.u.setColor(ap1.v);
            ap1.u.setAlpha(255 - ap1.t);
            canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, ap1.u);
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
        ap ap1 = a;
        ap1.b.setColorFilter(colorfilter);
        ap1.d();
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
