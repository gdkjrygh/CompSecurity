// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

// Referenced classes of package com.microsoft.advertising.android:
//            AbstractWebBasedAdView, AdWebView, av, j, 
//            r, by, bm, bp, 
//            p, bu, y, bq, 
//            an, g, aw, d

final class bl extends AbstractWebBasedAdView
    implements AdWebView.h, AdWebView.i
{

    private int f;
    private bq g;
    private final j h;
    private final Handler i = new Handler();

    public bl(Context context, g g1, j j1, aw aw, int k, bq bq1)
    {
        super(context, g1, aw);
        g = bq1;
        f = k;
        h = j1;
    }

    public final boolean a()
    {
        return e != null && e.o();
    }

    public final boolean a(d d, b.a a1)
    {
        av.b("Flow", "PolyAdView; setAd");
        super.setAdLoadedListener(a1);
        if (d == null)
        {
            return false;
        }
        a = d;
        e = h.i().a();
        if (e == null)
        {
            av.c("PolyAdView", "AdWebViewCacheManager returned a null webview!!");
            return false;
        }
        e.setParentContainer(this);
        e.a(this.d);
        by.a(getContext(), f);
        addView(e);
        e.setVerticalScrollBarEnabled(false);
        e.setHorizontalScrollBarEnabled(false);
        e.a(this);
        e.b(this);
        a1 = (bm)d;
        String s = bp.a;
        bu bu1 = p.a().m();
        int k = bu1.a();
        int l = bu1.b();
        if (l <= k)
        {
            k = l;
        }
        a1 = a1.a(s, k);
        if (a1 == null || a1.c() == null)
        {
            av.c("PolyAdView", "Renderer not present");
            return false;
        } else
        {
            d = y.a(a1, e.a(d));
            e.c(d);
            e.setBackgroundColor(f);
            return true;
        }
    }

    public final void c()
    {
        if (e != null && e.o())
        {
            e.f();
        }
    }

    public final void d_()
    {
        if (!n())
        {
            r();
        }
    }

    public final void e()
    {
        String s = ((bm)a).g();
        String s1 = ((bm)a).h();
        String s2 = g.b();
        e.k().a(s, s1, s2);
        i.postDelayed(new Runnable() {

            final bl a;

            public final void run()
            {
                if (!a.n())
                {
                    a.a(null, 1);
                }
            }

            
            {
                a = bl.this;
                super();
            }
        }, 20000L);
    }

    public final void e_()
    {
    }

    protected final void g()
    {
        e.a(true);
    }

    protected final void h()
    {
        e.p();
    }

    public final boolean i()
    {
        return e.r();
    }

    public final void t()
    {
        i.removeCallbacksAndMessages(null);
        if (e != null)
        {
            e.c();
            ViewGroup viewgroup = (ViewGroup)e.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(e);
            }
            h.i().a(e);
        }
    }
}
