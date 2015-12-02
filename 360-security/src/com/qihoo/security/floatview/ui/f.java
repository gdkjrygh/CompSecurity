// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.nineoldandroids.a.k;
import com.qihoo.security.locale.d;
import com.qihoo.security.opti.a.b;
import com.qihoo.security.ui.opti.sysclear.rocket.a;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.lang.reflect.Field;

// Referenced classes of package com.qihoo.security.floatview.ui:
//            b, a, g, d, 
//            h, e, i

public class f
    implements com.qihoo.security.floatview.ui.b, a
{

    private Context a;
    private Vibrator b;
    private e c;
    private g d;
    private com.qihoo.security.floatview.ui.d e;
    private com.qihoo.security.floatview.ui.a f;
    private i g;
    private h h;
    private ImageView i;
    private WindowManager j;
    private int k;
    private int l;
    private int m;
    private final int n;
    private final int o;
    private Rect p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;
    private boolean u;
    private final Handler v = new Handler();

    public f(Context context, com.qihoo.security.floatview.ui.a a1)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        j = null;
        k = 0;
        l = 0;
        m = 0;
        p = null;
        q = false;
        r = false;
        s = false;
        u = false;
        a = context;
        f = a1;
        g = f.getMemoryUsageView();
        context = a.getResources().getDisplayMetrics();
        n = ((DisplayMetrics) (context)).widthPixels;
        o = ((DisplayMetrics) (context)).heightPixels;
    }

    private int a(Context context)
    {
        if (m == 0)
        {
            try
            {
                Class class1 = Class.forName("com.android.internal.R$dimen");
                Object obj = class1.newInstance();
                int i1 = ((Integer)class1.getField("status_bar_height").get(obj)).intValue();
                m = context.getResources().getDimensionPixelSize(i1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return m;
    }

    static String a(f f1, String s1)
    {
        f1.t = s1;
        return s1;
    }

    static void a(f f1)
    {
        f1.j();
    }

    private void a(String s1)
    {
        if (!s)
        {
            h();
            if (d != null)
            {
                View view = d.getBackView();
                d.setTipText(s1);
                s1 = new AlphaAnimation(0.0F, 1.0F);
                s1.setInterpolator(new AccelerateInterpolator());
                s1.setDuration(700L);
                s1.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final f a;

                    public void onAnimationEnd(Animation animation)
                    {
                        com.qihoo.security.floatview.ui.f.b(a).postDelayed(new Runnable(this) {

                            final _cls2 a;

                            public void run()
                            {
                                com.qihoo.security.floatview.ui.f.a(a.a);
                            }

            
            {
                a = _pcls2;
                super();
            }
                        }, 1000L);
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                a = f.this;
                super();
            }
                });
                view.setVisibility(0);
                view.startAnimation(s1);
                d.setVisibility(0);
                return;
            }
        }
    }

    private void a(boolean flag)
    {
label0:
        {
            if (e != null && e.getVisibility() == 0)
            {
                if (!flag)
                {
                    break label0;
                }
                TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 1.0F, 1, 0.0F, 1, 0.0F);
                AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
                AnimationSet animationset = new AnimationSet(true);
                animationset.setDuration(60L);
                animationset.setInterpolator(new DecelerateInterpolator());
                animationset.addAnimation(translateanimation);
                animationset.addAnimation(alphaanimation);
                e.findViewById(0x7f0b0111).startAnimation(animationset);
                animationset.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final f a;

                    public void onAnimationEnd(Animation animation)
                    {
                        com.qihoo.security.floatview.ui.f.d(a);
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                a = f.this;
                super();
            }
                });
            }
            return;
        }
        k();
    }

    static boolean a(f f1, boolean flag)
    {
        f1.u = flag;
        return flag;
    }

    static g b(f f1)
    {
        return f1.d;
    }

    private void b(int i1, int j1)
    {
        if (h == null)
        {
            return;
        } else
        {
            int k1 = -h.getDrawableWidth();
            int l1 = -h.getDrawableHeight();
            int i2 = f.getMeasuredHeight();
            h.a((k1 >> 1) + i1, l1 + i2 + j1);
            return;
        }
    }

    static void b(f f1, String s1)
    {
        f1.a(s1);
    }

    static void b(f f1, boolean flag)
    {
        f1.a(flag);
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            g();
            if (c != null)
            {
                if (a != null)
                {
                    d(a.getResources().getColor(0x7f08003e));
                }
                i.setVisibility(0);
                c.setVisibility(0);
                c.a(true);
                c.b(true);
            }
        } else
        if (c != null)
        {
            i.setVisibility(8);
            c.setVisibility(8);
            c.a();
            return;
        }
    }

    private com.qihoo.security.floatview.ui.d c(int i1, int j1)
    {
        if (e == null)
        {
            e = new com.qihoo.security.floatview.ui.d(d());
            WindowManager windowmanager = v();
            android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams(-2, -2, 2003, 8, -3);
            layoutparams.gravity = 51;
            layoutparams.x = i1;
            layoutparams.y = j1;
            layoutparams.format = 1;
            windowmanager.addView(e, layoutparams);
        }
        return e;
    }

    static void c(f f1)
    {
        f1.i();
    }

    static void c(f f1, boolean flag)
    {
        f1.b(flag);
    }

    private void c(boolean flag)
    {
        if (c != null)
        {
            c.a(flag);
        }
    }

    private void d(int i1)
    {
        if (i != null)
        {
            i.setBackgroundColor(i1);
        }
    }

    private void d(int i1, int j1)
    {
        if (c != null)
        {
            c.a(i1, j1, this);
        }
    }

    static void d(f f1)
    {
        f1.k();
    }

    static void d(f f1, boolean flag)
    {
        f1.e(flag);
    }

    private void d(boolean flag)
    {
        if (c != null)
        {
            c.b(false);
        }
    }

    static String e(f f1)
    {
        return f1.t;
    }

    private void e(boolean flag)
    {
        if (flag)
        {
            if (h == null)
            {
                o();
            }
            h.setVisibility(0);
            if (g != null)
            {
                if (android.os.Build.VERSION.SDK_INT < 11)
                {
                    g.setMemoryAlpha(0.0F);
                }
                g.setVisibility(4);
            }
        } else
        {
            if (g != null)
            {
                g.setVisibility(0);
            }
            if (h != null)
            {
                h.setVisibility(8);
                return;
            }
        }
    }

    static boolean f(f f1)
    {
        return f1.s;
    }

    static Handler g(f f1)
    {
        return f1.v;
    }

    private e g()
    {
        Context context = d();
        if (c == null)
        {
            c = new e(context);
            WindowManager windowmanager = v();
            int i1 = windowmanager.getDefaultDisplay().getWidth();
            int j1 = windowmanager.getDefaultDisplay().getHeight();
            android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams();
            layoutparams.flags = 1064;
            layoutparams.type = 2002;
            layoutparams.format = 1;
            layoutparams.gravity = 51;
            layoutparams.x = 0;
            layoutparams.y = 0;
            layoutparams.width = i1;
            layoutparams.height = j1 - a(context);
            i = new ImageView(context);
            windowmanager.addView(i, layoutparams);
            windowmanager.addView(c, layoutparams);
        }
        return c;
    }

    private g h()
    {
        if (d == null)
        {
            Context context = d();
            d = new g(context);
            WindowManager windowmanager = v();
            android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams();
            layoutparams.flags = 1064;
            layoutparams.type = 2002;
            layoutparams.format = 1;
            layoutparams.gravity = 49;
            layoutparams.width = -2;
            layoutparams.height = -2;
            layoutparams.y = context.getResources().getDimensionPixelSize(0x7f09006b);
            windowmanager.addView(d, layoutparams);
        }
        return d;
    }

    private void i()
    {
        if (d != null)
        {
            v().removeView(d);
            d = null;
        }
    }

    private void j()
    {
        if (d != null && d.getVisibility() == 0)
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setInterpolator(new AccelerateInterpolator());
            alphaanimation.setDuration(300L);
            alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final f a;

                public void onAnimationEnd(Animation animation)
                {
                    f.c(a);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                a = f.this;
                super();
            }
            });
            View view = d.getBackView();
            if (view != null)
            {
                view.startAnimation(alphaanimation);
            }
        }
    }

    private void k()
    {
        if (e != null)
        {
            v().removeView(e);
            e = null;
        }
    }

    private void l()
    {
        Context context = a;
        if (SharedPref.b(context, "skf_firsttip", true))
        {
            android.view.WindowManager.LayoutParams layoutparams = f.getWindowLayoutParams();
            layoutparams.x = n;
            layoutparams.y = o / 3;
            f.setWindowLayoutParams(layoutparams);
            c(layoutparams.x, layoutparams.y);
            SharedPref.a(context, "skf_firsttip", false);
            f.postDelayed(new Runnable() {

                final f a;

                public void run()
                {
                    com.qihoo.security.floatview.ui.f.b(a, true);
                }

            
            {
                a = f.this;
                super();
            }
            }, 5000L);
        }
    }

    private void m()
    {
label0:
        {
            if (c != null)
            {
                if (i == null || i.getVisibility() != 0)
                {
                    break label0;
                }
                k k1 = com.nineoldandroids.a.k.a(i, "alpha", new float[] {
                    1.0F, 0.0F
                });
                k1.a(new AccelerateInterpolator());
                k1.c(200L);
                k1.a(new com.nineoldandroids.a.b() {

                    final f a;

                    public void b(com.nineoldandroids.a.a a1)
                    {
                        f.c(a, false);
                    }

            
            {
                a = f.this;
                super();
            }
                });
                k1.a();
            }
            return;
        }
        b(false);
    }

    private boolean n()
    {
        while (f == null || Math.sqrt(Math.pow(f.getCurX() - f.getDownX(), 2D) + Math.pow(f.getCurY() - f.getDownY(), 2D)) < 100D) 
        {
            return false;
        }
        return true;
    }

    private void o()
    {
        Context context = d();
        Object obj = context.getResources();
        k = ((Resources) (obj)).getDimensionPixelSize(0x7f090067);
        l = ((Resources) (obj)).getDimensionPixelSize(0x7f090068);
        h = new h(context);
        h.setVisibility(8);
        h.setDrawable(((Resources) (obj)).getDrawable(0x7f0200fb));
        obj = new android.view.WindowManager.LayoutParams();
        obj.flags = 1064;
        obj.type = 2002;
        obj.format = 1;
        obj.gravity = 51;
        obj.x = 0;
        obj.y = 0;
        obj.width = n;
        obj.height = o - a(context);
        v().addView(h, ((android.view.ViewGroup.LayoutParams) (obj)));
    }

    private boolean p()
    {
        if (f != null && f.h())
        {
            Rect rect = r();
            android.view.WindowManager.LayoutParams layoutparams = f.getWindowLayoutParams();
            int i1 = layoutparams.y;
            int j1 = l;
            int k1 = layoutparams.x;
            int l1 = k;
            if (i1 + j1 > rect.top && l1 + k1 > rect.left && k1 < rect.right)
            {
                return true;
            }
        }
        return false;
    }

    private void q()
    {
        if (f != null)
        {
            android.view.WindowManager.LayoutParams layoutparams = f.getWindowLayoutParams();
            int k1 = -h.getDrawableHeight();
            int l1 = f.getMeasuredHeight();
            int i1 = -h.getDrawableWidth();
            int j1 = f.getMeasuredWidth();
            k1 = Math.min(c.getMeasuredHeight() - h.getDrawableHeight(), k1 + l1 + layoutparams.y);
            d(layoutparams.x + (i1 >> j1 + 1 >> 1), k1);
            h.setVisibility(4);
            t();
        }
    }

    private Rect r()
    {
        if (p == null)
        {
            int i1 = n;
            int j1 = o;
            Resources resources = d().getResources();
            int k1 = resources.getDimensionPixelSize(0x7f090069);
            int l1 = resources.getDimensionPixelSize(0x7f09006a);
            p = new Rect();
            p.top = j1 - l1;
            p.bottom = j1;
            p.left = (i1 - k1) / 2;
            p.right = p.left + k1;
        }
        return p;
    }

    private void s()
    {
        if (b == null)
        {
            b = (Vibrator)d().getSystemService("vibrator");
        }
        if (b != null && !r)
        {
            r = true;
            b.vibrate(new long[] {
                200L, 5000L
            }, 0);
        }
    }

    private void t()
    {
        r = false;
        if (b != null)
        {
            b.cancel();
        }
    }

    private void u()
    {
        if (s)
        {
            return;
        } else
        {
            b b1 = new b(a);
            b1.a(new com.qihoo.security.opti.a.b.a() {

                final f a;

                public void a()
                {
                    com.qihoo.security.floatview.ui.f.a(a, com.qihoo.security.locale.d.a().a(0x7f0c007e));
                }

                public void a(int i1, int j1)
                {
                    j1 = (int)(((long)j1 * 100L) / Utils.getMemoryTotalKb());
                    if (i1 <= 0)
                    {
                        i1 = 1;
                    }
                    if (j1 <= 0)
                    {
                        j1 = 1;
                    }
                    com.qihoo.security.floatview.ui.f.a(a, com.qihoo.security.locale.d.a().a(0x7f0c007d, new Object[] {
                        Integer.valueOf(i1), Integer.valueOf(j1)
                    }));
                    f.g(a).post(new Runnable(this) {

                        final _cls8 a;

                        public void run()
                        {
                            if (!TextUtils.isEmpty(f.e(a.a)))
                            {
                                if (!f.f(a.a))
                                {
                                    com.qihoo.security.floatview.ui.f.a(a.a, f.e(a.a).replace("\n", ""));
                                    com.qihoo.security.floatview.ui.f.b(a.a, f.e(a.a));
                                }
                                com.qihoo.security.floatview.ui.f.a(a.a, null);
                            }
                        }

            
            {
                a = _pcls8;
                super();
            }
                    });
                }

            
            {
                a = f.this;
                super();
            }
            });
            b1.b();
            return;
        }
    }

    private WindowManager v()
    {
        if (j == null)
        {
            j = (WindowManager)d().getSystemService("window");
        }
        return j;
    }

    public void a()
    {
        a(true);
    }

    public void a(int i1)
    {
        if (i1 == 1)
        {
            f();
        }
    }

    public void a(int i1, int j1)
    {
label0:
        {
            if (u)
            {
                if (!n())
                {
                    break label0;
                }
                if (!q)
                {
                    q = true;
                    b(true);
                    e(true);
                }
                if (q)
                {
                    if (p())
                    {
                        s();
                        c(false);
                    } else
                    {
                        t();
                    }
                    b(i1, j1);
                }
            }
            return;
        }
        q = false;
        t();
        e(false);
        b(false);
    }

    public boolean a(int i1, int j1, boolean flag)
    {
        boolean flag1 = true;
        if (u)
        {
            t();
            if (!flag && q && p())
            {
                e(true);
                q();
                flag = flag1;
            } else
            {
                e(false);
                b(false);
                flag = false;
            }
            q = false;
            return flag;
        } else
        {
            return false;
        }
    }

    public void b()
    {
        s = false;
        android.view.WindowManager.LayoutParams layoutparams = f.getWindowLayoutParams();
        if (layoutparams != null && (layoutparams.x < 0 || layoutparams.x >= n || layoutparams.y < 0 || layoutparams.y >= o))
        {
            f.l();
        }
        if (!u)
        {
            if (f.i())
            {
                v.postDelayed(new Runnable() {

                    final f a;

                    public void run()
                    {
                        com.qihoo.security.floatview.ui.f.a(a, true);
                    }

            
            {
                a = f.this;
                super();
            }
                }, 5000L);
            }
            return;
        } else
        {
            l();
            e(false);
            b(false);
            return;
        }
    }

    public void b(int i1)
    {
        if (i1 == 4)
        {
            e();
        } else
        if (i1 == 3 && c != null)
        {
            c.b();
            return;
        }
    }

    public void c()
    {
        s = true;
        a(false);
        e(false);
        t();
        b(false);
    }

    public void c(int i1)
    {
    }

    public Context d()
    {
        return a;
    }

    public void e()
    {
        m();
        if (f != null)
        {
            com.qihoo.security.floatview.ui.a a1 = f;
            boolean flag;
            if (!s)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a1.b(flag);
        }
        v.post(new Runnable() {

            final f a;

            public void run()
            {
                com.qihoo.security.floatview.ui.f.d(a, false);
            }

            
            {
                a = f.this;
                super();
            }
        });
        if (!TextUtils.isEmpty(t))
        {
            a(t);
            t = null;
        }
    }

    public void f()
    {
        d(false);
        if (a != null)
        {
            d(a.getResources().getColor(0x7f08003f));
        }
        u();
    }
}
