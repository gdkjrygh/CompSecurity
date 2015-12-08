// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.microsoft.advertising.android.a.b;
import com.microsoft.advertising.android.a.e;
import java.io.File;

// Referenced classes of package com.microsoft.advertising.android:
//            aa, g, bk, f, 
//            av, af, q, bj, 
//            ak, p, ai, by, 
//            j, ab, m, aw, 
//            bu, bx, bq

public final class AdControl extends aa
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/microsoft/advertising/android/AdControl$a, s1);
        }

        public static a[] values()
        {
            a aa1[] = c;
            int i1 = aa1.length;
            a aa2[] = new a[i1];
            System.arraycopy(aa1, 0, aa2, 0, i1);
            return aa2;
        }

        static 
        {
            a = new a("COLLAPSED", 0);
            b = new a("ANCHOR", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    int a;
    int b;
    private bk c;
    private final g d;
    private j e;
    private a f;
    private boolean g;
    private aw h;
    private int i;
    private boolean j;
    private int k;
    private Point l[] = {
        new Point(), new Point()
    };
    private Point m[] = {
        new Point(), new Point()
    };
    private Rect n;

    public AdControl(Context context, Integer integer, Integer integer1, String s1, String s2)
    {
        this(context, s1, s2);
        d.a(integer);
        d.b(integer1);
    }

    private AdControl(Context context, String s1, String s2)
    {
        super(context);
        c = bk.a;
        d = new g(new f(this));
        f = a.a;
        g = false;
        a = -1;
        b = -1;
        j = true;
        k = 0;
        n = new Rect();
        com.microsoft.advertising.android.av.b("Flow", "AdControl; start");
        if (TextUtils.isEmpty(s2))
        {
            throw new IllegalArgumentException("adUnitId cannot be null/empty");
        }
        com.microsoft.advertising.android.af.b();
        d.g().j().a("initalize_to_first_fetch");
        Object obj = context.getCacheDir();
        if (obj != null)
        {
            ak.a();
            ak.a(((File) (obj)).getAbsolutePath());
        }
        com.microsoft.advertising.android.p.a().a(context);
        d.a(c);
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0)
        {
            d.c().c("Requires INTERNET: Neither user nor current process has android.permission.INTERNET.", e.c);
        }
        super.setVisibility(4);
        setBackgroundColor(-1);
        obj = String.format("adSDK version = %s; DeviceModel = %s; DeviceOsVersion = %s; PackageName = %s; versionName= %s", new Object[] {
            "4.4.40715.7", Build.MODEL, android.os.Build.VERSION.RELEASE, context.getPackageName(), by.a(context)
        });
        d.c().c("AdControl created", ((String) (obj)));
        if (TextUtils.isEmpty(s1))
        {
            av.c("AdControl-init", "applicationId was null or empty");
            throw new NullPointerException("null/empty applicationId");
        }
        if (TextUtils.isEmpty(s2))
        {
            av.c("AdControl-init", "adUnitId was null or empty");
            throw new NullPointerException("null/empty adUnitId");
        } else
        {
            setApplicationId(s1);
            setAdUnitId(s2);
            e = new j(context, this, d);
            e.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            addView(e);
            d.o();
            return;
        }
    }

    static int a(AdControl adcontrol)
    {
        return adcontrol.k;
    }

    public static transient Object a(Object aobj[])
    {
        if (!"NetworkPrefetchAdLoader".equals(aobj[0]) || aobj[1] == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (com.microsoft.advertising.android.p.a().a(aobj[1].toString()))
        {
            return com.microsoft.advertising.android.p.a().e();
        }
        break MISSING_BLOCK_LABEL_106;
        if (!"enableConfig".equals(aobj[0]) || aobj[1] == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        return Boolean.valueOf(ab.a.c(aobj[1].toString()));
        if (!"ApplicationId".equals(aobj[0]))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        aobj = com.microsoft.advertising.android.p.a().d();
        return ((Object) (aobj));
        aobj;
        av.a("AdControl", "error in getExtra", ((Throwable) (aobj)));
        return null;
    }

    static void a(AdControl adcontrol, int i1)
    {
        adcontrol.aa.setVisibility(i1);
    }

    static void a(AdControl adcontrol, a a1)
    {
        adcontrol.f = a1;
    }

    static g b(AdControl adcontrol)
    {
        return adcontrol.d;
    }

    public static String x()
    {
        return "4.4.40715.7";
    }

    private static boolean y()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    final bk a()
    {
        return c;
    }

    final void a(android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
    {
        if (d.n() && !flag)
        {
            return;
        }
        if (layoutparams.height > 0)
        {
            d.b(Integer.valueOf(layoutparams.height));
        } else
        {
            d.c().b((new StringBuilder("invalid height: ")).append(layoutparams.height).toString(), e.d);
        }
        if (layoutparams.width > 0)
        {
            d.a(Integer.valueOf(layoutparams.width));
        } else
        {
            d.c().b((new StringBuilder("invalid width: ")).append(layoutparams.width).toString(), e.d);
        }
        super.setLayoutParams(layoutparams);
    }

    public final void a(b b1)
    {
        d.c().a(b1);
    }

    public final void a(String s1)
    {
        d.g().g().b(s1);
    }

    public final void a(String s1, String s2)
    {
        if ("*detach*".equalsIgnoreCase(s1))
        {
            d.a();
            return;
        } else
        {
            d.g().g().a(s1, s2);
            return;
        }
    }

    final boolean a(a a1)
    {
        return a1 != null && f == a1;
    }

    public final String b()
    {
        return d.g().f();
    }

    final bq c()
    {
        return d.g().g().a();
    }

    public final boolean d()
    {
        return d.i();
    }

    public final boolean e()
    {
        return j;
    }

    final void f()
    {
        Runnable runnable = new Runnable() {

            final AdControl a;

            public final void run()
            {
                boolean flag1 = false;
                AdControl adcontrol;
                int i1;
                boolean flag;
                if (a.e() && !a.j())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (AdControl.a(a) == 0)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (flag)
                {
                    i1 = 0;
                }
                if (!a.a(a.a) && flag)
                {
                    AdControl.a(a, a.a);
                    a.requestLayout();
                } else
                if (a.a(a.a) && !flag)
                {
                    AdControl.a(a, com.microsoft.advertising.android.a.b);
                    a.requestLayout();
                }
                adcontrol = a;
                if (i1 != 0)
                {
                    i1 = ((flag1) ? 1 : 0);
                } else
                {
                    i1 = 4;
                }
                AdControl.a(adcontrol, i1);
            }

            
            {
                a = AdControl.this;
                super();
            }
        };
        if (!y())
        {
            d.a(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    public final boolean g()
    {
        return f == a.a;
    }

    protected final int h()
    {
        return d.e().intValue();
    }

    protected final int i()
    {
        return d.f().intValue();
    }

    public final boolean isEnabled()
    {
        return !d.q();
    }

    final boolean j()
    {
        return !e.a();
    }

    public final void k()
    {
        d.m();
    }

    public final void l()
    {
        Runnable runnable = new Runnable() {

            final AdControl a;

            public final void run()
            {
                com.microsoft.advertising.android.AdControl.b(a).a(true);
            }

            
            {
                a = AdControl.this;
                super();
            }
        };
        if (!y())
        {
            d.a(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    public final void m()
    {
        Runnable runnable = new Runnable() {

            final AdControl a;

            public final void run()
            {
                com.microsoft.advertising.android.AdControl.b(a).a(false);
            }

            
            {
                a = AdControl.this;
                super();
            }
        };
        if (!y())
        {
            d.a(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    public final boolean n()
    {
        return e.e();
    }

    public final void o()
    {
        if (e.a() || a(a.a))
        {
            return;
        } else
        {
            e.h();
            return;
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        g = true;
        d.c().c("AdControl.onAttachedToWindow", "");
        d.h();
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            d.b(new Runnable() {

                final AdControl a;

                public final void run()
                {
                    a.invalidate();
                }

            
            {
                a = AdControl.this;
                super();
            }
            });
        }
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        g = false;
        d.c().c("AdControl.onDetachedFromWindow", "");
        d.h();
    }

    protected final void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
    }

    protected final void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        d.d(false);
    }

    protected final void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        d.c().c("AdControl.onWindowVisibilityChanged", String.format("visibility[%d]", new Object[] {
            Integer.valueOf(i1)
        }));
        d.p();
    }

    final aw p()
    {
        return h;
    }

    public final void q()
    {
        if (!y())
        {
            d.c().b("cleanUpAdControl should be called on UI Thread ", e.d);
        } else
        if (!g)
        {
            d.s();
            e.f();
            e = null;
            h = null;
            return;
        }
    }

    final boolean r()
    {
        return g;
    }

    final int s()
    {
        return k;
    }

    public final void setAdUnitId(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            d.c().b("Invalid property.", String.format("Invalid property %s value. The value of the property must not be empty.", new Object[] {
                "AdUnitId"
            }));
            return;
        } else
        {
            d.b(s1);
            return;
        }
    }

    public final void setApplicationId(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            d.c().b("Invalid property.", String.format("Invalid property %s value. The value of the property must not be empty.", new Object[] {
                "ApplicationId"
            }));
            return;
        } else
        {
            com.microsoft.advertising.android.p.a().a(s1);
            d.j();
            return;
        }
    }

    public final void setAutoCollapse(boolean flag)
    {
        j = flag;
        f();
    }

    public final void setAutoRefreshEnabled(boolean flag)
    {
        d.c(flag);
    }

    public final void setAutoRefreshInterval(int i1)
    {
        d.a(i1);
    }

    public final void setBackgroundColor(int i1)
    {
        try
        {
            i = i1;
            super.setBackgroundColor(i1);
            return;
        }
        catch (Exception exception)
        {
            d.c().a(exception, e.a);
        }
    }

    public final void setCountryOrRegion(String s1)
    {
        d.g().g().a(s1);
    }

    public final void setEnabled(boolean flag)
    {
        if (flag)
        {
            m();
        } else
        {
            l();
        }
        super.setEnabled(flag);
    }

    public final void setExpandedAdMargin(int i1, int j1, int k1, int l1)
    {
        h = new aw(by.a(i1, com.microsoft.advertising.android.p.a().m().a() / 3), by.a(j1, com.microsoft.advertising.android.p.a().m().b() / 3), by.a(k1, com.microsoft.advertising.android.p.a().m().a() / 3), by.a(l1, com.microsoft.advertising.android.p.a().m().b() / 3));
    }

    public final void setKeywords(String s1)
    {
        d.g().g().c(s1);
    }

    public final void setLatitude(double d1)
    {
        d.g().g().a(Double.valueOf(d1));
    }

    public final void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        a(layoutparams, false);
    }

    public final void setLongitude(double d1)
    {
        d.g().g().b(Double.valueOf(d1));
    }

    public final void setPostalCode(String s1)
    {
        d.g().g().d(s1);
    }

    public final void setVisibility(int i1)
    {
        if (getVisibility() != i1)
        {
            k = i1;
            d.c().c("AdControl.onVisibilityChanged", String.format("visibility[%d]", new Object[] {
                Integer.valueOf(i1)
            }));
            d.p();
        }
        super.setVisibility(i1);
    }

    final g t()
    {
        return d;
    }

    final int u()
    {
        return i;
    }

    final boolean v()
    {
        if (e.g())
        {
            return true;
        }
        if (!g)
        {
            return false;
        } else
        {
            float f1 = (float)ab.a().a("AD_VISIBILITY_SCREEN_AREA_PP") / 100F;
            by.a a1 = new by.a();
            return by.a(this, d.c(), l, m, n, f1, a1);
        }
    }

    final j w()
    {
        return e;
    }
}
