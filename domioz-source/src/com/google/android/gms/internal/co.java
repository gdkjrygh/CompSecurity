// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.gms.internal:
//            df, db, cz, zzeo, 
//            cq, zzx, a, eu, 
//            fj, fl, fm, fr, 
//            cp, cs, cr, cm, 
//            cw

public final class co extends df
    implements db
{

    static final int a = Color.argb(0, 0, 0, 0);
    zzeo b;
    cw c;
    fl d;
    cs e;
    cz f;
    boolean g;
    FrameLayout h;
    android.webkit.WebChromeClient.CustomViewCallback i;
    boolean j;
    boolean k;
    RelativeLayout l;
    boolean m;
    int n;
    private final Activity o;
    private boolean p;
    private boolean q;
    private boolean r;

    public co(Activity activity)
    {
        g = false;
        j = false;
        k = false;
        m = false;
        n = 0;
        q = false;
        r = true;
        o = activity;
    }

    static android.widget.RelativeLayout.LayoutParams a(int i1, int j1, int k1, int l1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(k1, l1);
        layoutparams.setMargins(i1, j1, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
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
        f = new cz(o, byte0, this);
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
    {
        boolean flag3 = false;
        boolean flag1 = false;
        if (!p)
        {
            o.requestWindowFeature(1);
        }
        Window window = o.getWindow();
        if (window == null)
        {
            throw new cq("Invalid activity, no window available.");
        }
        if (!k || b.q != null && b.q.c)
        {
            window.setFlags(1024, 1024);
        }
        m = false;
        if (b.k == com.google.android.gms.internal.a.e().a())
        {
            if (o.getResources().getConfiguration().orientation == 1)
            {
                flag1 = true;
            }
            m = flag1;
        } else
        if (b.k == com.google.android.gms.internal.a.e().b())
        {
            boolean flag2 = flag3;
            if (o.getResources().getConfiguration().orientation == 2)
            {
                flag2 = true;
            }
            m = flag2;
        }
        fj.a((new StringBuilder("Delay onShow to next orientation change: ")).append(m).toString());
        a(b.k);
        if (com.google.android.gms.internal.a.e().a(window))
        {
            fj.a("Hardware acceleration on the AdActivity window enabled.");
        }
        if (!k)
        {
            l.setBackgroundColor(0xff000000);
        } else
        {
            l.setBackgroundColor(a);
        }
        o.setContentView(l);
        p = true;
        flag1 = b.e.g().b();
        if (flag)
        {
            com.google.android.gms.internal.a.d();
            d = fr.a(o, b.e.f(), flag1, b.n);
            d.g().a(b.f, b.j, b.o, b.e.g().a());
            d.g().a(new cp(this));
            android.view.ViewParent viewparent;
            if (b.m != null)
            {
                d.loadUrl(b.m);
            } else
            if (b.i != null)
            {
                d.loadDataWithBaseURL(b.g, b.i, "text/html", "UTF-8", null);
            } else
            {
                throw new cq("No URL or HTML to display in ad overlay.");
            }
        } else
        {
            d = b.e;
            d.a(o);
        }
        d.a(this);
        viewparent = d.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(d.a());
        }
        if (k)
        {
            d.setBackgroundColor(a);
        }
        l.addView(d.a(), -1, -1);
        if (!flag && !m)
        {
            n();
        }
        a(flag1);
        if (d.h())
        {
            a(flag1, true);
        }
    }

    private void m()
    {
        if (o.isFinishing() && !q)
        {
            q = true;
            if (o.isFinishing())
            {
                if (d != null)
                {
                    int i1 = n;
                    d.a(i1);
                    l.removeView(d.a());
                    if (e != null)
                    {
                        d.a(e.d);
                        d.a(false);
                        e.c.addView(d.a(), e.a, e.b);
                        e = null;
                    }
                }
                if (b != null && b.d != null)
                {
                    cv cv = b.d;
                    return;
                }
            }
        }
    }

    private void n()
    {
        d.b();
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

    public final void a(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        j = flag;
        b = zzeo.a(o.getIntent());
        if (b == null)
        {
            throw new cq("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (o.getIntent() != null)
        {
            r = o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (b.q == null) goto _L3; else goto _L2
_L2:
        k = b.q.b;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (b.d != null && r)
        {
            bundle = b.d;
        }
        if (b.l != 1 && b.c != null)
        {
            bundle = b.c;
        }
        l = new cr(o, b.p);
        b.l;
        JVM INSTR tableswitch 1 4: default 365
    //                   1 263
    //                   2 269
    //                   3 293
    //                   4 299;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new cq("Could not determine ad overlay type.");
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
            fj.e(bundle.getMessage());
            n = 3;
            o.finish();
        }
          goto _L10
_L6:
        e = new cs(b.e);
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
        com.google.android.gms.internal.a.a();
        bundle = o;
        zzek zzek = b.b;
        da da = b.j;
        if (!cm.a(bundle, zzek))
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
        p = true;
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

    public final void b()
    {
        if (b != null && g)
        {
            a(b.k);
        }
        if (h != null)
        {
            o.setContentView(l);
            p = true;
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

    public final void b(int i1, int j1, int k1, int l1)
    {
        if (c == null)
        {
            c = new cw(o, d);
            l.addView(c, 0, a(i1, j1, k1, l1));
            d.g().e();
        }
    }

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", j);
    }

    public final void c()
    {
        n = 1;
        o.finish();
    }

    public final void d()
    {
    }

    public final void e()
    {
    }

    public final void f()
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
        if (d != null && !d.l())
        {
            com.google.android.gms.internal.a.e().b(d.a());
            return;
        } else
        {
            fj.e("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public final void g()
    {
        if (c != null)
        {
            c.c();
        }
        b();
        if (d != null && (!o.isFinishing() || e == null))
        {
            com.google.android.gms.internal.a.e().a(d.a());
        }
        m();
    }

    public final void h()
    {
        m();
    }

    public final void i()
    {
        if (c != null)
        {
            c.a();
        }
        if (d != null)
        {
            l.removeView(d.a());
        }
        m();
    }

    public final void j()
    {
        p = true;
    }

    public final void k()
    {
        l.removeView(f);
        a(true);
    }

    public final void l()
    {
        if (m)
        {
            m = false;
            n();
        }
    }

}
