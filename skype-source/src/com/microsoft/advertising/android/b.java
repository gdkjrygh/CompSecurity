// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.microsoft.advertising.android:
//            bw, af, g, aw, 
//            ab, bx, ad, q, 
//            d, ai, c

abstract class com.microsoft.advertising.android.b extends FrameLayout
    implements AdWebView.b
{
    public static interface a
    {

        public abstract void a(com.microsoft.advertising.android.b b1, String s1, int i1);

        public abstract void a(d d1);

        public abstract void a(String s1);
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/microsoft/advertising/android/b$b, s1);
        }

        public static b[] values()
        {
            b ab1[] = d;
            int i1 = ab1.length;
            b ab2[] = new b[i1];
            System.arraycopy(ab1, 0, ab2, 0, i1);
            return ab2;
        }

        static 
        {
            a = new b("NOT_LOADED", 0);
            b = new b("LOADED", 1);
            c = new b("FAILED", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    protected d a;
    protected final g b;
    protected final q c;
    protected aw d;
    private b e;
    private bw f;
    private long g;
    private a h;
    private Runnable i;

    protected com.microsoft.advertising.android.b(Context context, g g1, aw aw1)
    {
        super(context);
        e = b.a;
        f = (new bw()).a();
        g = System.currentTimeMillis();
        a = null;
        h = null;
        i = new Runnable() {

            final com.microsoft.advertising.android.b a;

            public final void run()
            {
                af.b();
                com.microsoft.advertising.android.b.a(a, b.b);
                if (com.microsoft.advertising.android.b.a(a) != null)
                {
                    com.microsoft.advertising.android.b.a(a).a(a.a);
                }
            }

            
            {
                a = com.microsoft.advertising.android.b.this;
                super();
            }
        };
        setBackgroundColor(0);
        af.a(new Object[] {
            g1
        });
        b = g1;
        c = g1.g();
        super.setLayoutParams(new android.view.ViewGroup.LayoutParams(g1.e().intValue(), g1.f().intValue()));
        if (aw1 == null)
        {
            aw1 = new aw(0, 0, 0, 0);
        }
        d = aw1;
    }

    static a a(com.microsoft.advertising.android.b b1)
    {
        return b1.h;
    }

    static void a(com.microsoft.advertising.android.b b1, b b2)
    {
        b1.e = b2;
    }

    public final void a(com.microsoft.advertising.android.a.a a1)
    {
        b.a(a1);
    }

    public void a(String s1)
    {
        af.b();
        if (h != null)
        {
            h.a(s1);
        }
    }

    public void a(String s1, int i1)
    {
        if (!n())
        {
            af.b();
            e = b.c;
            if (h != null)
            {
                h.a(this, s1, i1);
                return;
            }
        }
    }

    public boolean a()
    {
        return false;
    }

    public abstract boolean a(d d1, a a1);

    public boolean a(boolean flag)
    {
        long l1 = (System.currentTimeMillis() - g) / 1000L;
        int i1;
        if (flag)
        {
            i1 = b.r();
        } else
        {
            i1 = ab.a().a("AD_MIN_SCREENTIME_SECONDS");
        }
        return l1 < (long)i1;
    }

    public void b()
    {
    }

    public void c()
    {
    }

    public final ai d()
    {
        if (b != null)
        {
            return b.c();
        } else
        {
            return null;
        }
    }

    public final void f()
    {
        f.a();
        h();
    }

    public final void f_()
    {
        f.b();
        g();
    }

    protected void g()
    {
    }

    protected void h()
    {
    }

    public boolean i()
    {
        return false;
    }

    public void j()
    {
    }

    public void k()
    {
        g = System.currentTimeMillis();
        f = (new bw()).a();
    }

    public long l()
    {
        return System.currentTimeMillis() - g;
    }

    public boolean m()
    {
        return l() > (long)ab.a().a("MAX_AD_CACHE_WHILE_SUSPENDED_MILLISECONDS");
    }

    public final boolean n()
    {
        af.b();
        return o() != b.a;
    }

    public b o()
    {
        return e;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isShown())
        {
            b.d().a(a);
        }
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        if (isShown())
        {
            b.d().a(a);
        }
    }

    public final d p()
    {
        return a;
    }

    public final c q()
    {
        return c.b();
    }

    protected final void r()
    {
        af.a(new Object[] {
            a
        });
        af.a(new Object[] {
            h
        });
        if (!n())
        {
            i.run();
        }
    }

    public void s()
    {
    }

    public final void setAdLoadedListener(a a1)
    {
        h = a1;
    }

    public abstract void t();

    public void u()
    {
    }
}
