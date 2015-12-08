// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.bb;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.hj;
import com.google.android.gms.internal.hk;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            k, zzm, AdOverlayInfoParcel, f, 
//            zzk, a

public final class com.google.android.gms.ads.internal.overlay.c extends com.google.android.gms.internal.ef.a
    implements k
{
    private static final class a extends Exception
    {

        public a(String s1)
        {
            super(s1);
        }
    }

    static final class b extends RelativeLayout
    {

        go a;

        public final boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            a.a(motionevent);
            return false;
        }

        public b(Context context, String s1)
        {
            super(context);
            a = new go(context, s1);
        }
    }

    public static final class c
    {

        public final int a;
        public final android.view.ViewGroup.LayoutParams b;
        public final ViewGroup c;
        public final Context d;

        public c(hi hi1)
            throws a
        {
            b = hi1.getLayoutParams();
            android.view.ViewParent viewparent = hi1.getParent();
            d = hi1.e();
            if (viewparent != null && (viewparent instanceof ViewGroup))
            {
                c = (ViewGroup)viewparent;
                a = c.indexOfChild(hi1.a());
                c.removeView(hi1.a());
                hi1.b(true);
                return;
            } else
            {
                throw new a("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    static final int a = Color.argb(0, 0, 0, 0);
    AdOverlayInfoParcel b;
    zzk c;
    hi d;
    c e;
    zzm f;
    boolean g;
    FrameLayout h;
    android.webkit.WebChromeClient.CustomViewCallback i;
    boolean j;
    boolean k;
    RelativeLayout l;
    boolean m;
    int n;
    private final Activity o;
    private final be p;
    private final bd q;
    private boolean r;
    private boolean s;
    private boolean t;

    public com.google.android.gms.ads.internal.overlay.c(Activity activity)
    {
        g = false;
        j = false;
        k = false;
        m = false;
        n = 0;
        s = false;
        t = true;
        o = activity;
        activity = ay.G;
        p = new be(((Boolean)com.google.android.gms.ads.internal.p.n().a(activity)).booleanValue(), "show_interstitial", "interstitial");
        q = p.a();
    }

    private void a(boolean flag)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams;
        byte byte0;
        if (flag)
        {
            byte0 = 50;
        } else
        {
            byte0 = 32;
        }
        f = new zzm(o, byte0, this);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(10);
        if (flag)
        {
            byte0 = 11;
        } else
        {
            byte0 = 9;
        }
        layoutparams.addRule(byte0);
        f.a(flag, b.h);
        l.addView(f, layoutparams);
    }

    private void b(boolean flag)
        throws a
    {
        if (!r)
        {
            o.requestWindowFeature(1);
        }
        Object obj = o.getWindow();
        if (obj == null)
        {
            throw new a("Invalid activity, no window available.");
        }
        if (!k || b.q != null && b.q.c)
        {
            ((Window) (obj)).setFlags(1024, 1024);
        }
        boolean flag3 = b.e.j().b();
        m = false;
        if (flag3)
        {
            if (b.k == com.google.android.gms.ads.internal.p.g().a())
            {
                boolean flag1;
                if (o.getResources().getConfiguration().orientation == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                m = flag1;
            } else
            if (b.k == com.google.android.gms.ads.internal.p.g().b())
            {
                boolean flag2;
                if (o.getResources().getConfiguration().orientation == 2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                m = flag2;
            }
        }
        (new StringBuilder("Delay onShow to next orientation change: ")).append(m);
        com.google.android.gms.ads.internal.util.client.b.a(3);
        a(b.k);
        if (com.google.android.gms.ads.internal.p.g().a(((Window) (obj))))
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
        }
        if (!k)
        {
            l.setBackgroundColor(0xff000000);
        } else
        {
            l.setBackgroundColor(a);
        }
        o.setContentView(l);
        r = true;
        if (flag)
        {
            com.google.android.gms.ads.internal.p.f();
            d = hk.a(o, b.e.i(), true, flag3, null, b.n);
            d.j().a(null, null, b.f, b.j, true, b.o, null, b.e.j().a(), null);
            d.j().a(new com.google.android.gms.internal.hj.a() {

                final com.google.android.gms.ads.internal.overlay.c a;

                public final void a(hi hi1, boolean flag4)
                {
                    hi1.c();
                }

            
            {
                a = com.google.android.gms.ads.internal.overlay.c.this;
                super();
            }
            });
            if (b.m != null)
            {
                d.loadUrl(b.m);
            } else
            if (b.i != null)
            {
                d.loadDataWithBaseURL(b.g, b.i, "text/html", "UTF-8", null);
            } else
            {
                throw new a("No URL or HTML to display in ad overlay.");
            }
            if (b.e != null)
            {
                b.e.b(this);
            }
        } else
        {
            d = b.e;
            d.setContext(o);
        }
        d.a(this);
        obj = d.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(d.a());
        }
        if (k)
        {
            d.setBackgroundColor(a);
        }
        l.addView(d.a(), -1, -1);
        if (!flag && !m)
        {
            q();
        }
        a(flag3);
        if (d.k())
        {
            a(flag3, true);
        }
    }

    private void p()
    {
        if (o.isFinishing() && !s)
        {
            s = true;
            if (com.google.android.gms.ads.internal.p.h().d() != null)
            {
                com.google.android.gms.ads.internal.p.h().d().a(p);
            }
            if (d != null)
            {
                int i1 = n;
                d.a(i1);
                l.removeView(d.a());
                if (e != null)
                {
                    d.setContext(e.d);
                    d.b(false);
                    e.c.addView(d.a(), e.a, e.b);
                    e = null;
                }
                d = null;
            }
            if (b != null && b.d != null)
            {
                b.d.a_();
                return;
            }
        }
    }

    private void q()
    {
        d.c();
    }

    public final void a()
    {
        n = 2;
        o.finish();
    }

    public final void a(int i1)
    {
        o.setRequestedOrientation(i1);
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        if (c != null)
        {
            c.a(i1, j1, k1, l1);
        }
    }

    public final void a(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        j = flag;
        b = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.a(o.getIntent());
        if (b == null)
        {
            throw new a("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (b.n.d > 0x7270e0)
        {
            n = 3;
        }
        if (o.getIntent() != null)
        {
            t = o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (b.q == null) goto _L3; else goto _L2
_L2:
        k = b.q.b;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        if (b.d != null && t)
        {
            b.d.b_();
        }
        if (b.l != 1 && b.c != null)
        {
            b.c.e();
        }
        l = new b(o, b.p);
        b.l;
        JVM INSTR tableswitch 1 4: default 388
    //                   1 291
    //                   2 297
    //                   3 321
    //                   4 327;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new a("Could not determine ad overlay type.");
_L3:
        k = false;
          goto _L9
_L5:
        try
        {
            b(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            com.google.android.gms.ads.internal.util.client.b.c(bundle.getMessage());
            n = 3;
            o.finish();
        }
          goto _L10
_L6:
        e = new c(b.e);
        b(false);
        return;
_L7:
        b(true);
        return;
_L8:
        if (j)
        {
            n = 3;
            o.finish();
            return;
        }
        com.google.android.gms.ads.internal.p.b();
        if (!com.google.android.gms.ads.internal.overlay.a.a(o, b.b, b.j))
        {
            n = 3;
            o.finish();
            return;
        }
          goto _L10
    }

    public final void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        h = new FrameLayout(o);
        h.setBackgroundColor(0xff000000);
        h.addView(view, -1, -1);
        o.setContentView(h);
        r = true;
        i = customviewcallback;
        g = true;
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (f != null)
        {
            f.a(flag, flag1);
        }
    }

    public final zzk b()
    {
        return c;
    }

    public final void b(int i1, int j1, int k1, int l1)
    {
        p.a(q, new String[] {
            "vpr"
        });
        bd bd = p.a();
        if (c == null)
        {
            c = new zzk(o, d, p, bd);
            l.addView(c, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            c.a(i1, j1, k1, l1);
            d.j().f();
        }
    }

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", j);
    }

    public final void c()
    {
        if (b != null && g)
        {
            a(b.k);
        }
        if (h != null)
        {
            o.setContentView(l);
            r = true;
            h.removeAllViews();
            h = null;
        }
        if (i != null)
        {
            i.onCustomViewHidden();
            i = null;
        }
        g = false;
    }

    public final void d()
    {
        n = 1;
        o.finish();
    }

    public final void e()
    {
        n = 0;
    }

    public final boolean f()
    {
        n = 0;
        boolean flag;
        if (d == null)
        {
            flag = true;
        } else
        {
            boolean flag1 = d.r();
            flag = flag1;
            if (!flag1)
            {
                d.a("onbackblocked", Collections.emptyMap());
                return flag1;
            }
        }
        return flag;
    }

    public final void g()
    {
    }

    public final void h()
    {
    }

    public final void i()
    {
        if (b != null && b.l == 4)
        {
            if (j)
            {
                n = 3;
                o.finish();
            } else
            {
                j = true;
            }
        }
        if (d != null && !d.p())
        {
            com.google.android.gms.ads.internal.p.g().b(d.a());
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.c("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public final void j()
    {
        if (c != null)
        {
            c.g();
        }
        c();
        if (d != null && (!o.isFinishing() || e == null))
        {
            com.google.android.gms.ads.internal.p.g().a(d.a());
        }
        p();
    }

    public final void k()
    {
        p();
    }

    public final void l()
    {
        if (c != null)
        {
            c.l();
        }
        if (d != null)
        {
            l.removeView(d.a());
        }
        p();
    }

    public final void m()
    {
        r = true;
    }

    public final void n()
    {
        l.removeView(f);
        a(true);
    }

    public final void o()
    {
        if (m)
        {
            m = false;
            q();
        }
    }

}
