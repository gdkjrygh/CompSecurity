// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear.rocket;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends Drawable
{
    private class a
    {

        final c a;
        private float b;
        private int c;
        private int d;
        private long e;

        public float a()
        {
            return b;
        }

        public void a(float f1)
        {
            b = f1;
        }

        public void a(int i1)
        {
            c = i1;
        }

        public void a(long l1)
        {
            e = 0L;
        }

        public int b()
        {
            return c;
        }

        public void b(int i1)
        {
            d = i1;
        }

        public boolean b(long l1)
        {
            if (d >= 10000)
            {
                return false;
            }
            float f1 = b;
            int i1 = c;
            Interpolator interpolator = a.b();
            if (interpolator != null)
            {
                if (e == 0L)
                {
                    e = System.currentTimeMillis();
                }
                long l2 = Math.abs(l1 - e);
                l1 = l2;
                if (l2 > (long)c.a(a))
                {
                    l1 = c.a(a);
                }
                d = (int)(interpolator.getInterpolation((float)l1 / (float)c.a(a)) * 10000F);
                b = c.b(a) + ((c.c(a) - c.b(a)) * (float)d) / 10000F;
                c = (int)((float)c.d(a) * (1.0F - (float)d / 10000F));
            }
            boolean flag;
            if (f1 != b || i1 != c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }

        public float c()
        {
            return (float)d;
        }

        private a()
        {
            a = c.this;
            super();
            b = 0.0F;
            c = 255;
            d = 0;
            e = 0L;
        }

    }


    Handler a;
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private Paint k;
    private ArrayList l;
    private Interpolator m;
    private Rect n;

    public c(Context context)
    {
        b = 0.0F;
        c = 0.0F;
        d = 0.0F;
        e = 0.0F;
        f = 5;
        g = 2500;
        h = 60;
        i = 204;
        j = false;
        k = null;
        l = null;
        m = null;
        a = null;
        k = new Paint();
        k.setStyle(android.graphics.Paint.Style.STROKE);
        k.setAntiAlias(true);
        k.setColor(0xccffffff);
        context = context.getResources();
        k.setStrokeWidth(context.getDimensionPixelSize(0x7f09006c));
        d = context.getDimensionPixelSize(0x7f09006d);
        e = context.getDimensionPixelSize(0x7f09006e);
        l = new ArrayList();
        n = new Rect();
    }

    static int a(c c1)
    {
        return c1.g;
    }

    private void a(Canvas canvas)
    {
        if (l != null && k != null)
        {
            Iterator iterator = l.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                a a1 = (a)iterator.next();
                if (a1 != null && a1.b() > 0)
                {
                    canvas.save();
                    canvas.clipRect(n);
                    k.setAlpha(a1.b());
                    canvas.drawCircle(b, c, a1.a(), k);
                    canvas.restore();
                }
            } while (true);
        }
    }

    static float b(c c1)
    {
        return c1.d;
    }

    static float c(c c1)
    {
        return c1.e;
    }

    private void c()
    {
        f();
    }

    static int d(c c1)
    {
        return c1.i;
    }

    private boolean d()
    {
        if (l != null)
        {
            Iterator iterator = l.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                a a1 = (a)iterator.next();
                if (a1 != null && a1.b() > 0 && a1.b(System.currentTimeMillis()))
                {
                    flag = true;
                }
            } while (true);
            if (flag)
            {
                invalidateSelf();
            }
        }
        return true;
    }

    private a e()
    {
label0:
        {
            if (l == null)
            {
                break label0;
            }
            Iterator iterator = l.iterator();
            a a1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                a1 = (a)iterator.next();
            } while (a1 == null || a1.c() < 10000F);
            return a1;
        }
        return null;
    }

    static boolean e(c c1)
    {
        return c1.j;
    }

    private a f()
    {
        a a2 = e();
        a a1 = a2;
        if (a2 == null)
        {
            a1 = new a();
            l.add(a1);
        }
        a1.a(i);
        a1.a(d);
        a1.a(0L);
        a1.b(0);
        return a1;
    }

    static void f(c c1)
    {
        c1.c();
    }

    static int g(c c1)
    {
        return c1.f;
    }

    static boolean h(c c1)
    {
        return c1.d();
    }

    static int i(c c1)
    {
        return c1.h;
    }

    public void a()
    {
        j = false;
        if (a != null)
        {
            a.removeMessages(1);
            a.removeMessages(2);
            l.clear();
        }
    }

    public void a(float f1, float f2)
    {
        a();
        n.set(0, Math.round(f2 - e), getBounds().right, getBounds().bottom);
        b = f1;
        c = f2;
        if (b() == null)
        {
            a(((Interpolator) (new LinearInterpolator())));
        }
        if (a == null)
        {
            a = new Handler() {

                final c a;

                public void handleMessage(Message message)
                {
                    if (!c.e(a)) goto _L2; else goto _L1
_L1:
                    int i1 = message.what;
                    i1;
                    JVM INSTR tableswitch 1 2: default 40
                //                               1 41
                //                               2 73;
                       goto _L2 _L3 _L4
_L2:
                    return;
_L3:
                    c.f(a);
                    sendEmptyMessageDelayed(i1, (long)((float)c.a(a) / (float)c.g(a)));
                    return;
_L4:
                    if (c.h(a))
                    {
                        sendEmptyMessageDelayed(i1, 1000 / c.i(a));
                        return;
                    }
                    if (true) goto _L2; else goto _L5
_L5:
                }

            
            {
                a = c.this;
                super();
            }
            };
        }
        if (a != null)
        {
            j = true;
            a.sendEmptyMessage(1);
            a.sendEmptyMessage(2);
        }
    }

    public void a(Interpolator interpolator)
    {
        m = interpolator;
    }

    public Interpolator b()
    {
        return m;
    }

    public void draw(Canvas canvas)
    {
        a(canvas);
    }

    public int getOpacity()
    {
        return 0;
    }

    public void setAlpha(int i1)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
