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
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cl;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.cw;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cz;
import com.google.android.gms.internal.da;
import com.google.android.gms.internal.u;
import com.google.android.gms.internal.v;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            k, AdOverlayInfoParcel, e, a, 
//            i

public final class zzd extends com.google.android.gms.internal.bs.a
    implements k
{
    static final class a extends RelativeLayout
    {

        cn a;

        public final boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            cn cn1 = a;
            int j1 = motionevent.getHistorySize();
            for (int i1 = 0; i1 < j1; i1++)
            {
                cn1.a(motionevent.getActionMasked(), motionevent.getHistoricalX(0, i1), motionevent.getHistoricalY(0, i1));
            }

            cn1.a(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
            return false;
        }

        public a(Context context, String s)
        {
            super(context);
            a = new cn(context, s);
        }
    }

    public static final class b
    {

        public final int a;
        public final android.view.ViewGroup.LayoutParams b;
        public final ViewGroup c;
        public final Context d;

        public b(cw cw1)
            throws zza
        {
            b = cw1.getLayoutParams();
            android.view.ViewParent viewparent = cw1.getParent();
            d = cw1.d();
            if (viewparent != null && (viewparent instanceof ViewGroup))
            {
                c = (ViewGroup)viewparent;
                a = c.indexOfChild(cw1.getView());
                c.removeView(cw1.getView());
                cw1.a(true);
                return;
            } else
            {
                throw new zza("Could not get the parent of the WebView for an overlay.");
            }
        }
    }

    private final class c extends ch
    {

        final zzd a;

        public final void a()
        {
            com.google.android.gms.ads.internal.d.c();
            Object obj = cl.b(zzd.a(a), a.c.q.d);
            if (obj != null)
            {
                obj = com.google.android.gms.ads.internal.d.e().a(zzd.a(a), ((android.graphics.Bitmap) (obj)), a.c.q.e, a.c.q.f);
                cl.a.post(new Runnable(this, ((Drawable) (obj))) {

                    final Drawable a;
                    final c b;

                    public final void run()
                    {
                        zzd.a(b.a).getWindow().setBackgroundDrawable(a);
                    }

            
            {
                b = c1;
                a = drawable;
                super();
            }
                });
            }
        }

        private c()
        {
            a = zzd.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    static final int a = Color.argb(0, 0, 0, 0);
    public final Activity b;
    AdOverlayInfoParcel c;
    cw d;
    b e;
    public i f;
    public boolean g;
    public FrameLayout h;
    public android.webkit.WebChromeClient.CustomViewCallback i;
    boolean j;
    boolean k;
    public RelativeLayout l;
    public boolean m;
    int n;
    public boolean o;
    private boolean p;
    private boolean q;

    public zzd(Activity activity)
    {
        g = false;
        j = false;
        k = false;
        m = false;
        n = 0;
        p = false;
        q = true;
        b = activity;
    }

    static Activity a(zzd zzd1)
    {
        return zzd1.b;
    }

    private void b(boolean flag)
        throws zza
    {
        boolean flag3 = false;
        boolean flag1 = false;
        if (!o)
        {
            b.requestWindowFeature(1);
        }
        Window window = b.getWindow();
        if (window == null)
        {
            throw new zza("Invalid activity, no window available.");
        }
        if (!k || c.q != null && c.q.c)
        {
            window.setFlags(1024, 1024);
        }
        boolean flag4 = c.e.i().a();
        m = false;
        if (flag4)
        {
            if (c.k == com.google.android.gms.ads.internal.d.e().a())
            {
                if (b.getResources().getConfiguration().orientation == 1)
                {
                    flag1 = true;
                }
                m = flag1;
            } else
            if (c.k == com.google.android.gms.ads.internal.d.e().b())
            {
                boolean flag2 = flag3;
                if (b.getResources().getConfiguration().orientation == 2)
                {
                    flag2 = true;
                }
                m = flag2;
            }
        }
        com.google.android.gms.ads.internal.util.client.b.a((new StringBuilder("Delay onShow to next orientation change: ")).append(m).toString());
        a(c.k);
        if (com.google.android.gms.ads.internal.d.e().a(window))
        {
            com.google.android.gms.ads.internal.util.client.b.a("Hardware acceleration on the AdActivity window enabled.");
        }
        if (!k)
        {
            l.setBackgroundColor(0xff000000);
        } else
        {
            l.setBackgroundColor(a);
        }
        b.setContentView(l);
        o = true;
        if (flag)
        {
            com.google.android.gms.ads.internal.d.d();
            Object obj = new cz(da.a(b, c.e.h(), c.n));
            ((cw) (obj)).setWebViewClient(com.google.android.gms.ads.internal.d.e().a(((cw) (obj)), flag4));
            ((cw) (obj)).setWebChromeClient(com.google.android.gms.ads.internal.d.e().a(((cw) (obj))));
            d = ((cw) (obj));
            d.i().a(c.f, c.j, c.o, c.e.i().n);
            d.i().f = new com.google.android.gms.internal.cx.a() {

                final zzd a;

                public final void a(cw cw1)
                {
                    cw1.b();
                }

            
            {
                a = zzd.this;
                super();
            }
            };
            if (c.m != null)
            {
                d.loadUrl(c.m);
            } else
            if (c.i != null)
            {
                d.loadDataWithBaseURL(c.g, c.i, "text/html", "UTF-8", null);
            } else
            {
                throw new zza("No URL or HTML to display in ad overlay.");
            }
            if (c.e != null)
            {
                c.e.b(this);
            }
        } else
        {
            d = c.e;
            d.setContext(b);
        }
        d.a(this);
        obj = d.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(d.getView());
        }
        if (k)
        {
            d.setBackgroundColor(a);
        }
        l.addView(d.getView(), -1, -1);
        if (!flag && !m)
        {
            m();
        }
        a(flag4);
        if (d.j())
        {
            a(flag4, true);
        }
    }

    private void n()
    {
        if (b.isFinishing() && !p)
        {
            p = true;
            if (d != null)
            {
                int i1 = n;
                d.a(i1);
                l.removeView(d.getView());
                if (e != null)
                {
                    d.setContext(e.d);
                    d.a(false);
                    e.c.addView(d.getView(), e.a, e.b);
                    e = null;
                }
                d = null;
            }
            if (c != null && c.d != null)
            {
                c.d.a();
                return;
            }
        }
    }

    public final void a()
    {
        n = 2;
        b.finish();
    }

    public final void a(int i1)
    {
        b.setRequestedOrientation(i1);
    }

    public final void a(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        j = flag;
        c = AdOverlayInfoParcel.a(b.getIntent());
        if (c == null)
        {
            throw new zza("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (c.n.d > 0x7270e0)
        {
            n = 3;
        }
        if (b.getIntent() != null)
        {
            q = b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (c.q == null) goto _L3; else goto _L2
_L2:
        k = c.q.b;
_L9:
        com.google.android.gms.internal.r r = v.ap;
        if (((Boolean)com.google.android.gms.ads.internal.d.i().a(r)).booleanValue() && k && c.q.d != null)
        {
            (new c((byte)0)).b();
        }
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        if (c.d != null && q)
        {
            c.d.b();
        }
        if (c.l != 1 && c.c != null)
        {
            bundle = c.c;
        }
        l = new a(b, c.p);
        c.l;
        JVM INSTR tableswitch 1 4: default 445
    //                   1 343
    //                   2 349
    //                   3 373
    //                   4 379;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new zza("Could not determine ad overlay type.");
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
            com.google.android.gms.ads.internal.util.client.b.e(bundle.getMessage());
            n = 3;
            b.finish();
        }
          goto _L10
_L6:
        e = new b(c.e);
        b(false);
        return;
_L7:
        b(true);
        return;
_L8:
        if (j)
        {
            n = 3;
            b.finish();
            return;
        }
        com.google.android.gms.ads.internal.d.a();
        bundle = b;
        AdLauncherIntentInfoParcel adlauncherintentinfoparcel = c.b;
        j j1 = c.j;
        if (!com.google.android.gms.ads.internal.overlay.a.a(bundle, adlauncherintentinfoparcel))
        {
            n = 3;
            b.finish();
            return;
        }
          goto _L10
    }

    public final void a(boolean flag)
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
        f = new i(b, byte0, this);
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
        f.a(flag, c.h);
        l.addView(f, layoutparams);
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
        if (c != null && g)
        {
            a(c.k);
        }
        if (h != null)
        {
            b.setContentView(l);
            o = true;
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

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", j);
    }

    public final void c()
    {
        n = 1;
        b.finish();
    }

    public final void d()
    {
        n = 0;
    }

    public final boolean e()
    {
        n = 0;
        boolean flag;
        if (d == null)
        {
            flag = true;
        } else
        {
            boolean flag1 = d.p();
            flag = flag1;
            if (!flag1)
            {
                d.a("onbackblocked", Collections.emptyMap());
                return flag1;
            }
        }
        return flag;
    }

    public final void f()
    {
    }

    public final void g()
    {
    }

    public final void h()
    {
        if (c != null && c.l == 4)
        {
            if (j)
            {
                n = 3;
                b.finish();
            } else
            {
                j = true;
            }
        }
        if (d != null && !d.n())
        {
            com.google.android.gms.ads.internal.d.e();
            WebView webview = d.getWebView();
            if (webview != null)
            {
                webview.onResume();
            }
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.e("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public final void i()
    {
        b();
        if (d != null && (!b.isFinishing() || e == null))
        {
            com.google.android.gms.ads.internal.d.e();
            WebView webview = d.getWebView();
            if (webview != null)
            {
                webview.onPause();
            }
        }
        n();
    }

    public final void j()
    {
        n();
    }

    public final void k()
    {
        if (d != null)
        {
            l.removeView(d.getView());
        }
        n();
    }

    public final void l()
    {
        o = true;
    }

    public final void m()
    {
        d.b();
    }

}
