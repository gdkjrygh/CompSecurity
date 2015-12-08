// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.gms.internal:
//            cg, bq, db, bz, 
//            ek, em, eo, br, 
//            bs, bt, bv, bw, 
//            lj, bm, ea

public final class bp extends cg
{

    private final Activity a;
    private bq b;
    private bw c;
    private em d;
    private bt e;
    private bz f;
    private FrameLayout g;
    private android.webkit.WebChromeClient.CustomViewCallback h;
    private boolean i;
    private boolean j;
    private RelativeLayout k;

    public bp(Activity activity)
    {
        i = false;
        j = false;
        a = activity;
    }

    public static void a(Context context, bq bq1)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", bq1.o.f);
        bq.a(intent, bq1);
        intent.addFlags(0x80000);
        context.startActivity(intent);
    }

    private void b(boolean flag)
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
        f = new bz(a, byte0);
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
        f.a(b.i);
        k.addView(f, layoutparams);
    }

    private static android.widget.RelativeLayout.LayoutParams c(int l, int i1, int j1, int k1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(j1, k1);
        layoutparams.setMargins(l, i1, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
    }

    private void c(boolean flag)
    {
        a.requestWindowFeature(1);
        Window window = a.getWindow();
        window.setFlags(1024, 1024);
        a(b.l);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ek.a("Enabling hardware acceleration on the AdActivity window.");
            window.setFlags(0x1000000, 0x1000000);
        }
        k = new RelativeLayout(a);
        k.setBackgroundColor(0xff000000);
        a.setContentView(k);
        boolean flag1 = b.f.e().a();
        if (flag)
        {
            d = em.a(a, b.f.d(), true, flag1, null, b.o);
            d.e().a(null, null, b.g, b.k, true);
            d.e().a(new br(this));
            if (b.n != null)
            {
                d.loadUrl(b.n);
            } else
            if (b.j != null)
            {
                d.loadDataWithBaseURL(b.h, b.j, "text/html", "UTF-8", null);
            } else
            {
                throw new bs("No URL or HTML to display in ad overlay.");
            }
        } else
        {
            d = b.f;
            d.a(a);
        }
        d.a(this);
        k.addView(d, -1, -1);
        if (!flag)
        {
            d.b();
        }
        b(flag1);
    }

    private void k()
    {
        if (a.isFinishing() && !j)
        {
            j = true;
            if (a.isFinishing())
            {
                if (d != null)
                {
                    d.a();
                    k.removeView(d);
                    if (e != null)
                    {
                        d.a(false);
                        e.c.addView(d, e.a, e.b);
                    }
                }
                if (b != null && b.e != null)
                {
                    b.e.o();
                    return;
                }
            }
        }
    }

    public final void a()
    {
        a.finish();
    }

    public final void a(int l)
    {
        a.setRequestedOrientation(l);
    }

    public final void a(int l, int i1, int j1, int k1)
    {
        if (c != null)
        {
            c.setLayoutParams(c(l, i1, j1, k1));
        }
    }

    public final void a(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        i = flag;
        b = bq.a(a.getIntent());
        if (b == null)
        {
            throw new bs("Could not get info for ad overlay.");
        }
          goto _L1
_L7:
        return;
_L1:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        if (b.e != null)
        {
            b.e.p();
        }
        if (b.m != 1 && b.d != null)
        {
            b.d.r();
        }
        b.m;
        JVM INSTR tableswitch 1 4: default 258
    //                   1 175
    //                   2 181
    //                   3 205
    //                   4 211;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        throw new bs("Could not determine ad overlay type.");
_L3:
        c(false);
        return;
_L4:
        try
        {
            e = new bt(b.f);
            c(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            ek.d(bundle.getMessage());
            a.finish();
        }
          goto _L7
_L5:
        c(true);
        return;
_L6:
        if (i)
        {
            a.finish();
            return;
        }
        if (bm.a(a, b.c, b.k)) goto _L7; else goto _L8
_L8:
        a.finish();
        return;
    }

    public final void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        g = new FrameLayout(a);
        g.setBackgroundColor(0xff000000);
        g.addView(view, -1, -1);
        a.setContentView(g);
        h = customviewcallback;
    }

    public final void a(boolean flag)
    {
        if (f != null)
        {
            f.a(flag);
        }
    }

    public final bw b()
    {
        return c;
    }

    public final void b(int l, int i1, int j1, int k1)
    {
        if (c == null)
        {
            c = new bw(a, d);
            k.addView(c, 0, c(l, i1, j1, k1));
            d.e().c();
        }
    }

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", i);
    }

    public final void c()
    {
        if (b != null)
        {
            a(b.l);
        }
        if (g != null)
        {
            a.setContentView(k);
            g.removeAllViews();
            g = null;
        }
        if (h != null)
        {
            h.onCustomViewHidden();
            h = null;
        }
    }

    public final void d()
    {
    }

    public final void e()
    {
    }

    public final void f()
    {
        if (b != null && b.m == 4)
        {
            if (i)
            {
                a.finish();
            } else
            {
                i = true;
            }
        }
        if (d != null)
        {
            ea.b(d);
        }
    }

    public final void g()
    {
        if (c != null)
        {
            c.c();
        }
        c();
        if (d != null && (!a.isFinishing() || e == null))
        {
            ea.a(d);
        }
        k();
    }

    public final void h()
    {
        k();
    }

    public final void i()
    {
        if (c != null)
        {
            c.a();
        }
        if (d != null)
        {
            k.removeView(d);
        }
        k();
    }

    public final void j()
    {
        k.removeView(f);
        b(true);
    }
}
