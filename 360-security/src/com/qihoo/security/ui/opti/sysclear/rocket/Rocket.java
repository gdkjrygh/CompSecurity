// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear.rocket;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;
import com.nineoldandroids.a.m;
import com.qihoo.security.app.a;
import com.qihoo.security.ui.b.b;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear.rocket:
//            a

public class Rocket
{

    public static final int ROCKET_ANIMATION_ID_FIRE = 2;
    public static final int ROCKET_ANIMATION_ID_LAUNCH_1 = 3;
    public static final int ROCKET_ANIMATION_ID_LAUNCH_2 = 4;
    public static final int ROCKET_ANIMATION_ID_VIBRATE = 1;
    private static Rocket q = null;
    private static boolean r = false;
    c a;
    View b;
    private float c;
    private float d;
    private float e;
    private k f;
    private BitmapDrawable g;
    private BitmapDrawable h;
    private Context i;
    private com.nineoldandroids.a.o.b j;
    private com.qihoo.security.ui.opti.sysclear.rocket.a k;
    private Rect l;
    private Rect m;
    private boolean n;
    private Rect o;
    private boolean p;
    private float s;

    public Rocket(Context context, boolean flag)
    {
        c = 0.0F;
        d = 0.0F;
        e = 0.0F;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = new Rect();
        m = new Rect();
        n = false;
        o = null;
        p = false;
        a = null;
        i = context;
        p = flag;
        a();
    }

    static k a(Rocket rocket)
    {
        return rocket.f;
    }

    private void a()
    {
        Resources resources = i.getResources();
        s = resources.getDisplayMetrics().density;
        if (p)
        {
            g = (BitmapDrawable)resources.getDrawable(0x7f0200fb);
            g.setBounds(0, 0, (int)(38F * s), (int)(104F * s));
        } else
        {
            g = (BitmapDrawable)resources.getDrawable(0x7f02004f);
            g.setBounds(0, 0, (int)(s * 60F), (int)(s * 60F));
        }
        h = (BitmapDrawable)resources.getDrawable(0x7f02013e);
        h.setBounds(0, 0, h.getIntrinsicWidth(), h.getIntrinsicHeight());
    }

    private void a(Canvas canvas)
    {
        if (g())
        {
            Rect rect = g.getBounds();
            Rect rect1 = h.getBounds();
            float f1 = (rect.width() - rect1.width()) / 2;
            float f2 = rect.height();
            float f3 = s;
            canvas.save();
            canvas.translate(f1, f2 - 25F * f3);
            l.bottom = h.getIntrinsicHeight();
            l.top = (int)((float)l.bottom - e);
            l.left = 0;
            l.right = h.getIntrinsicWidth();
            m.top = 0;
            m.left = 0;
            m.bottom = (int)((float)m.top + e);
            m.right = m.left + l.width();
            canvas.drawBitmap(h.getBitmap(), l, m, null);
            canvas.restore();
        }
    }

    static boolean a(Rocket rocket, boolean flag)
    {
        rocket.n = flag;
        return flag;
    }

    private com.nineoldandroids.a.a.a b()
    {
        return new com.nineoldandroids.a.a.a() {

            final Rocket a;

            public void a(com.nineoldandroids.a.a a1)
            {
                if (com.qihoo.security.ui.opti.sysclear.rocket.Rocket.a(a) != null)
                {
                    com.qihoo.security.ui.opti.sysclear.rocket.Rocket.a(a).b();
                }
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.a(3);
                }
            }

            public void b(com.nineoldandroids.a.a a1)
            {
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.b(3);
                }
            }

            public void c(com.nineoldandroids.a.a a1)
            {
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.c(3);
                }
            }

            public void d(com.nineoldandroids.a.a a1)
            {
            }

            
            {
                a = Rocket.this;
                super();
            }
        };
    }

    private com.nineoldandroids.a.a.a c()
    {
        return new com.nineoldandroids.a.a.a() {

            final Rocket a;

            public void a(com.nineoldandroids.a.a a1)
            {
                if (com.qihoo.security.ui.opti.sysclear.rocket.Rocket.a(a) != null)
                {
                    com.qihoo.security.ui.opti.sysclear.rocket.Rocket.a(a).b();
                }
                if (a.b != null)
                {
                    com.qihoo.security.ui.b.b.a(9, a.b);
                }
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.a(4);
                }
            }

            public void b(com.nineoldandroids.a.a a1)
            {
                if (a.b != null)
                {
                    com.qihoo.security.ui.b.b.c(9);
                    com.qihoo.security.ui.b.b.a();
                }
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.b(4);
                }
            }

            public void c(com.nineoldandroids.a.a a1)
            {
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.c(4);
                }
            }

            public void d(com.nineoldandroids.a.a a1)
            {
            }

            
            {
                a = Rocket.this;
                super();
            }
        };
    }

    private com.nineoldandroids.a.a.a d()
    {
        return new com.nineoldandroids.a.a.a() {

            final Rocket a;

            public void a(com.nineoldandroids.a.a a1)
            {
                com.qihoo.security.ui.opti.sysclear.rocket.Rocket.a(a, true);
                if (com.qihoo.security.ui.opti.sysclear.rocket.Rocket.a(a) != null)
                {
                    com.qihoo.security.ui.opti.sysclear.rocket.Rocket.a(a).b();
                }
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.a(2);
                }
            }

            public void b(com.nineoldandroids.a.a a1)
            {
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.b(2);
                }
            }

            public void c(com.nineoldandroids.a.a a1)
            {
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.c(2);
                }
            }

            public void d(com.nineoldandroids.a.a a1)
            {
            }

            
            {
                a = Rocket.this;
                super();
            }
        };
    }

    public static void destroy()
    {
        if (r)
        {
            q.destroySelf();
            q = null;
            r = false;
        }
    }

    public static void draw(Canvas canvas)
    {
        if (q != null)
        {
            q.drawSeft(canvas);
        }
    }

    private com.nineoldandroids.a.a.a e()
    {
        return new com.nineoldandroids.a.a.a() {

            final Rocket a;

            public void a(com.nineoldandroids.a.a a1)
            {
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.a(1);
                }
            }

            public void b(com.nineoldandroids.a.a a1)
            {
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.b(1);
                }
            }

            public void c(com.nineoldandroids.a.a a1)
            {
                a1 = a.getRocketAnimationListener();
                if (a1 != null)
                {
                    a1.c(1);
                }
            }

            public void d(com.nineoldandroids.a.a a1)
            {
            }

            
            {
                a = Rocket.this;
                super();
            }
        };
    }

    private boolean f()
    {
        return true;
    }

    private boolean g()
    {
        return true;
    }

    public static int getRocketWidth()
    {
        boolean flag = false;
        int i1 = ((flag) ? 1 : 0);
        if (q != null)
        {
            i1 = ((flag) ? 1 : 0);
            if (q.g != null)
            {
                i1 = q.g.getBounds().width();
            }
        }
        return i1;
    }

    public static void init(Context context, boolean flag, Rect rect, com.nineoldandroids.a.o.b b1, com.qihoo.security.ui.opti.sysclear.rocket.a a1)
    {
        if (!r)
        {
            q = new Rocket(context, flag);
            if (q != null)
            {
                r = true;
                q.setBounds(rect);
                q.setAnimatorUpdateListener(b1);
                q.setRocketAnimationListener(a1);
            }
        }
    }

    public static void launch(float f1, float f2, boolean flag, View view)
    {
label0:
        {
            if (q != null)
            {
                q.setX(f1);
                q.setY(f2);
                if (!flag)
                {
                    break label0;
                }
                q.fireFloatIcon();
            }
            return;
        }
        q.fireRocket(view);
    }

    public void destroySelf()
    {
        if (a != null)
        {
            a.b();
            a = null;
        }
        if (f != null)
        {
            f.b();
            f = null;
        }
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        o = null;
    }

    public void drawSeft(Canvas canvas)
    {
        if (g != null && h != null)
        {
            canvas.save();
            canvas.translate(c, d);
            if (n)
            {
                a(canvas);
            }
            if (f())
            {
                g.draw(canvas);
            }
            canvas.restore();
        }
    }

    public void fireFloatIcon()
    {
        Object obj = getBounds();
        ((Rect) (obj)).width();
        int i1 = ((Rect) (obj)).height();
        obj = g.getBounds();
        ((Rect) (obj)).width();
        int j1 = ((Rect) (obj)).height();
        float f1 = c;
        float f2 = d;
        float f3 = h.getIntrinsicHeight();
        float f4 = (i1 * 4) / 11;
        a = new c();
        f = com.nineoldandroids.a.k.a(this, new m[] {
            com.nineoldandroids.a.m.a("x", new float[] {
                f1 - 3F, f1 + 6F
            })
        }).c(200L);
        f.a(new LinearInterpolator());
        f.b(2);
        f.a(-1);
        f.a(getAnimatorUpdateListener());
        f.a(e());
        a.a(f);
        k k1 = com.nineoldandroids.a.k.a(this, new m[] {
            com.nineoldandroids.a.m.a("JetSmokeOffset", new float[] {
                0.0F, f3
            })
        }).c(300L);
        k1.a(new AccelerateInterpolator());
        k1.a(getAnimatorUpdateListener());
        k1.a(d());
        a.a(k1).a(200L);
        obj = com.nineoldandroids.a.k.a(this, new m[] {
            com.nineoldandroids.a.m.a("y", new float[] {
                f2, f4
            })
        }).c(300L);
        ((k) (obj)).a(new AccelerateInterpolator());
        ((k) (obj)).a(getAnimatorUpdateListener());
        ((k) (obj)).a(b());
        a.a(((com.nineoldandroids.a.a) (obj))).a(1000L).b(k1);
        k1 = com.nineoldandroids.a.k.a(this, new m[] {
            com.nineoldandroids.a.m.a("y", new float[] {
                f4, -((float)j1 + f3)
            })
        }).c(300L);
        k1.a(new AccelerateInterpolator());
        k1.a(getAnimatorUpdateListener());
        k1.a(c());
        a.a(k1).a(0L).b(((com.nineoldandroids.a.a) (obj)));
        a.a();
    }

    public void fireRocket(View view)
    {
        Object obj = getBounds();
        b = view;
        int i1 = ((Rect) (obj)).height();
        int j1 = g.getBounds().height();
        float f1 = d;
        float f2 = h.getIntrinsicHeight();
        float f3 = (i1 * 4) / 11;
        a = new c();
        view = com.nineoldandroids.a.k.a(this, new m[] {
            com.nineoldandroids.a.m.a("JetSmokeOffset", new float[] {
                0.0F, f2
            })
        });
        long l1;
        if (com.qihoo.security.app.a.b(i))
        {
            l1 = 300L;
        } else
        {
            l1 = 600L;
        }
        view = view.c(l1);
        view.a(new AccelerateInterpolator());
        view.a(getAnimatorUpdateListener());
        view.a(d());
        obj = com.nineoldandroids.a.k.a(this, new m[] {
            com.nineoldandroids.a.m.a("y", new float[] {
                f1, -((float)j1 + f2)
            })
        });
        if (com.qihoo.security.app.a.b(i))
        {
            l1 = 500L;
        } else
        {
            l1 = 1000L;
        }
        obj = ((k) (obj)).c(l1);
        ((k) (obj)).a(new AccelerateInterpolator());
        ((k) (obj)).a(getAnimatorUpdateListener());
        ((k) (obj)).a(c());
        a.a(((com.nineoldandroids.a.a) (obj))).b(view);
        a.a();
    }

    public com.nineoldandroids.a.o.b getAnimatorUpdateListener()
    {
        return j;
    }

    public Rect getBounds()
    {
        return o;
    }

    public float getJetSmokeOffset()
    {
        return e;
    }

    public com.qihoo.security.ui.opti.sysclear.rocket.a getRocketAnimationListener()
    {
        return k;
    }

    public float getX()
    {
        return c;
    }

    public float getY()
    {
        return d;
    }

    public void setAnimatorUpdateListener(com.nineoldandroids.a.o.b b1)
    {
        j = b1;
    }

    public void setBounds(Rect rect)
    {
        if (o == null)
        {
            o = new Rect(rect);
            return;
        } else
        {
            o.left = rect.left;
            o.top = rect.top;
            o.right = rect.right;
            o.bottom = rect.bottom;
            return;
        }
    }

    public void setJetSmokeOffset(float f1)
    {
        e = f1;
    }

    public void setRocketAnimationListener(com.qihoo.security.ui.opti.sysclear.rocket.a a1)
    {
        k = a1;
    }

    public void setX(float f1)
    {
        c = f1;
    }

    public void setY(float f1)
    {
        d = f1;
    }

}
