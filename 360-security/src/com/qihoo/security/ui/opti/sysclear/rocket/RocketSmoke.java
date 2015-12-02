// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear.rocket;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.animation.AccelerateInterpolator;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.k;
import com.nineoldandroids.a.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class RocketSmoke
{

    private static Drawable h = null;
    private static Rect i = null;
    private static float j = 0.0F;
    private static long k = 0L;
    private static float l = 1.0F;
    private static boolean m = false;
    private static Random n = null;
    private static Context o = null;
    private static Handler p = null;
    private static ArrayList q = null;
    private static com.nineoldandroids.a.o.b r = null;
    private static boolean s = false;
    private static float t = 0.0F;
    private float a;
    private float b;
    private float c;
    private int d;
    private float e;
    private boolean f;
    private k g;

    public RocketSmoke()
    {
        a = 0.0F;
        b = 0.0F;
        c = 0.0F;
        d = 255;
        e = 0.0F;
        f = false;
        g = null;
    }

    static float a()
    {
        return t;
    }

    static float a(float f1)
    {
        f1 = j + f1;
        j = f1;
        return f1;
    }

    static RocketSmoke a(float f1, float f2, float f3)
    {
        return b(f1, f2, f3);
    }

    static boolean a(boolean flag)
    {
        m = flag;
        return flag;
    }

    static long b()
    {
        return k;
    }

    private static RocketSmoke b(float f1, float f2, float f3)
    {
        RocketSmoke rocketsmoke = d();
        Object obj = getBounds();
        ((Rect) (obj)).width();
        int i1 = ((Rect) (obj)).height();
        float f4 = (float)((double)l * (0.59999999999999998D + (double)n.nextFloat() * 0.40000000000000002D));
        rocketsmoke.setRadius(f4);
        rocketsmoke.setAplha(255);
        rocketsmoke.setY(i1);
        rocketsmoke.setAngle(50F * n.nextFloat() + f1);
        obj = com.nineoldandroids.a.k.a(rocketsmoke, new m[] {
            com.nineoldandroids.a.m.a("aplha", new int[] {
                255, 53
            }), com.nineoldandroids.a.m.a("radius", new float[] {
                f4, l * 10F
            }), com.nineoldandroids.a.m.a("x", new float[] {
                f2, f3
            })
        }).c(800L);
        ((k) (obj)).a(new AccelerateInterpolator());
        ((k) (obj)).a(getAnimatorUpdateListener());
        ((k) (obj)).a(new com.nineoldandroids.a.a.a() {

            public void a(a a1)
            {
            }

            public void b(a a1)
            {
                ((RocketSmoke)((k)a1).j()).setDied(true);
            }

            public void c(a a1)
            {
            }

            public void d(a a1)
            {
            }

        });
        rocketsmoke.setAnimator(((k) (obj)));
        ((k) (obj)).a();
        rocketsmoke.setDied(false);
        return rocketsmoke;
    }

    private static float c()
    {
        Rect rect = getBounds();
        float f1;
        float f2;
        if (rect != null)
        {
            f1 = rect.width() / 6 / 2;
        } else
        {
            f1 = 0.0F;
        }
        f2 = f1;
        if (f1 == 0.0F)
        {
            f2 = 1.0F;
        }
        return f2;
    }

    private static RocketSmoke d()
    {
        RocketSmoke rocketsmoke1 = e();
        RocketSmoke rocketsmoke = rocketsmoke1;
        if (rocketsmoke1 == null)
        {
            rocketsmoke = new RocketSmoke();
            q.add(rocketsmoke);
        }
        return rocketsmoke;
    }

    public static void destroy()
    {
        if (s)
        {
            if (p != null)
            {
                p.removeMessages(22);
                p = null;
            }
            Iterator iterator = q.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (RocketSmoke)iterator.next();
                if (obj != null)
                {
                    obj = ((RocketSmoke) (obj)).getAnimator();
                    if (obj != null)
                    {
                        ((k) (obj)).b();
                    }
                }
            } while (true);
            q.clear();
            q = null;
            o = null;
            r = null;
            n = null;
            h = null;
            s = false;
        }
    }

    public static void draw(Canvas canvas)
    {
        if (q != null)
        {
            Iterator iterator = q.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                RocketSmoke rocketsmoke = (RocketSmoke)iterator.next();
                if (!rocketsmoke.isDied() && m)
                {
                    rocketsmoke.a(canvas);
                }
            } while (true);
        }
    }

    private static RocketSmoke e()
    {
        for (Iterator iterator = q.iterator(); iterator.hasNext();)
        {
            RocketSmoke rocketsmoke = (RocketSmoke)iterator.next();
            if (rocketsmoke.isDied())
            {
                return rocketsmoke;
            }
        }

        return null;
    }

    public static com.nineoldandroids.a.o.b getAnimatorUpdateListener()
    {
        return r;
    }

    public static Rect getBounds()
    {
        return i;
    }

    public static void init(Context context, Rect rect, com.nineoldandroids.a.o.b b1)
    {
        if (!s)
        {
            o = context;
            setBounds(rect);
            r = b1;
            n = new Random();
            q = new ArrayList();
            h = o.getResources().getDrawable(0x7f020068);
            l = c();
            h.setBounds(0, 0, (int)l, (int)l);
            j = 0.0F;
            if (p == null)
            {
                p = new Handler() {

                    public void handleMessage(Message message)
                    {
label0:
                        {
label1:
                            {
                                if (message.what == 22)
                                {
                                    message = RocketSmoke.getBounds();
                                    if (message != null)
                                    {
                                        com.qihoo.security.ui.opti.sysclear.rocket.RocketSmoke.a(true);
                                        int i1 = message.width();
                                        com.qihoo.security.ui.opti.sysclear.rocket.RocketSmoke.a(290F, com.qihoo.security.ui.opti.sysclear.rocket.RocketSmoke.a() - 20F, i1);
                                        com.qihoo.security.ui.opti.sysclear.rocket.RocketSmoke.a(180F, com.qihoo.security.ui.opti.sysclear.rocket.RocketSmoke.a() + 20F, 0.0F);
                                        long l1 = System.currentTimeMillis() - RocketSmoke.b();
                                        if (l1 >= 1000L)
                                        {
                                            break label0;
                                        }
                                        if (l1 >= 600L)
                                        {
                                            break label1;
                                        }
                                        sendEmptyMessageDelayed(22, 40L);
                                    }
                                }
                                return;
                            }
                            com.qihoo.security.ui.opti.sysclear.rocket.RocketSmoke.a(30F);
                            sendEmptyMessageDelayed(22, 5L);
                            return;
                        }
                        com.qihoo.security.ui.opti.sysclear.rocket.RocketSmoke.a(false);
                    }

                };
            }
            s = true;
        }
    }

    public static void setAnimatorUpdateListener(com.nineoldandroids.a.o.b b1)
    {
        r = b1;
    }

    public static void setBounds(Rect rect)
    {
        if (i == null)
        {
            i = new Rect(rect);
            return;
        } else
        {
            i.left = rect.left;
            i.top = rect.top;
            i.right = rect.right;
            i.bottom = rect.bottom;
            return;
        }
    }

    public static void startSmoke(float f1)
    {
        if (s)
        {
            t = f1;
            k = System.currentTimeMillis();
            p.sendEmptyMessage(22);
        }
    }

    void a(Canvas canvas)
    {
        float f1 = (float)((double)a + (double)c * Math.cos(((double)e * 3.1415926535897931D) / 180D));
        float f2 = (float)((double)b + (double)c * Math.sin(((double)e * 3.1415926535897931D) / 180D)) + j;
        canvas.save();
        float f3 = c / l;
        canvas.scale(f3, f3, f1, f2);
        canvas.translate(f1, f2);
        h.draw(canvas);
        canvas.restore();
    }

    public int getAlpha()
    {
        return d;
    }

    public float getAngle()
    {
        return e;
    }

    public k getAnimator()
    {
        return g;
    }

    public float getRadius()
    {
        return c;
    }

    public float getX()
    {
        return a;
    }

    public float getY()
    {
        return b;
    }

    public boolean isDied()
    {
        return f;
    }

    public void setAngle(float f1)
    {
        e = f1;
    }

    public void setAnimator(k k1)
    {
        g = k1;
    }

    public void setAplha(int i1)
    {
        d = i1;
    }

    public void setDied(boolean flag)
    {
        f = flag;
    }

    public void setRadius(float f1)
    {
        c = f1;
    }

    public void setX(float f1)
    {
        a = f1;
    }

    public void setY(float f1)
    {
        b = f1;
    }

}
