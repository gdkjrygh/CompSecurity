// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Collections;

public final class jov extends kvy
    implements jpg
{

    private static int l = Color.argb(0, 0, 0, 0);
    public final Activity a;
    public final ktm b;
    public final ktl c;
    public jpe d;
    public kxu e;
    public jpf f;
    public boolean g;
    public FrameLayout h;
    public android.webkit.WebChromeClient.CustomViewCallback i;
    public RelativeLayout j;
    public boolean k;
    private AdOverlayInfoParcel m;
    private joz n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean s;
    private boolean t;

    public jov(Activity activity)
    {
        g = false;
        o = false;
        p = false;
        q = false;
        r = 0;
        s = false;
        t = true;
        a = activity;
        activity = ktk.g;
        b = new ktm(((Boolean)jqc.i().a(activity)).booleanValue(), "show_interstitial", "interstitial");
        c = b.a();
    }

    private void b(boolean flag)
    {
        if (!k)
        {
            a.requestWindowFeature(1);
        }
        Object obj = a.getWindow();
        if (obj == null)
        {
            throw new jox("Invalid activity, no window available.");
        }
        if (!p || m.q != null && m.q.c)
        {
            ((Window) (obj)).setFlags(1024, 1024);
        }
        boolean flag3 = m.e.j().a();
        q = false;
        if (flag3)
        {
            if (m.k == jqc.e().a())
            {
                jpz jpz1;
                kxv kxv1;
                k k1;
                k k2;
                k k3;
                boolean flag1;
                if (a.getResources().getConfiguration().orientation == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                q = flag1;
            } else
            if (m.k == jqc.e().b())
            {
                boolean flag2;
                if (a.getResources().getConfiguration().orientation == 2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                q = flag2;
            }
        }
        (new StringBuilder("Delay onShow to next orientation change: ")).append(q).toString();
        b.p(3);
        a(m.k);
        if (jqc.e().a(((Window) (obj))))
        {
            b.p(3);
        }
        if (!p)
        {
            j.setBackgroundColor(0xff000000);
        } else
        {
            j.setBackgroundColor(l);
        }
        a.setContentView(j);
        k = true;
        if (flag)
        {
            jqc.d();
            e = kyb.a(a, m.e.i(), true, flag3, null, m.n, null);
            kxv1 = e.j();
            k1 = m.f;
            k2 = m.j;
            k3 = m.o;
            jpz1 = m.e.j().n;
            obj = jpz1;
            if (jpz1 == null)
            {
                obj = new jpz(false);
            }
            kxv1.o = new kvl(kxv1.a, null);
            kxv1.a("/appEvent", new ktu(k1));
            kxv1.a("/backButton", ktv.i);
            kxv1.a("/canOpenURLs", ktv.a);
            kxv1.a("/canOpenIntents", ktv.b);
            kxv1.a("/click", ktv.c);
            kxv1.a("/close", ktv.d);
            kxv1.a("/customClose", ktv.e);
            kxv1.a("/delayPageLoaded", new kxy(kxv1));
            kxv1.a("/httpTrack", ktv.f);
            kxv1.a("/log", ktv.g);
            kxv1.a("/mraid", new kug(((jpz) (obj)), kxv1.o));
            kxv1.a("/mraidLoaded", kxv1.m);
            kxv1.a("/open", new kuh(k3, ((jpz) (obj)), kxv1.o));
            kxv1.a("/precache", ktv.k);
            kxv1.a("/touch", ktv.h);
            kxv1.a("/video", ktv.j);
            kxv1.d = null;
            kxv1.e = null;
            kxv1.g = k1;
            kxv1.j = k3;
            kxv1.l = k2;
            kxv1.n = ((jpz) (obj));
            kxv1.i = true;
            kxv1.p = false;
            e.j().f = new jow(this);
            if (m.m != null)
            {
                e.loadUrl(m.m);
            } else
            if (m.i != null)
            {
                e.loadDataWithBaseURL(m.g, m.i, "text/html", "UTF-8", null);
            } else
            {
                throw new jox("No URL or HTML to display in ad overlay.");
            }
            if (m.e != null)
            {
                m.e.b(this);
            }
        } else
        {
            e = m.e;
            e.a(a);
        }
        e.a(this);
        obj = e.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(e.a());
        }
        if (p)
        {
            e.setBackgroundColor(l);
        }
        j.addView(e.a(), -1, -1);
        if (!flag && !q)
        {
            o();
        }
        a(flag3);
        if (e.k())
        {
            a(flag3, true);
        }
    }

    private void n()
    {
        if (a.isFinishing() && !s)
        {
            s = true;
            if (jqc.f().a() != null)
            {
                jqc.f().a().a(b);
            }
            if (e != null)
            {
                int i1 = r;
                e.a(i1);
                j.removeView(e.a());
                if (n != null)
                {
                    e.a(n.d);
                    e.a(false);
                    n.c.addView(e.a(), n.a, n.b);
                    n = null;
                }
                e = null;
            }
            if (m != null && m.d != null)
            {
                m.d.a();
                return;
            }
        }
    }

    private void o()
    {
        e.c();
    }

    public final void a()
    {
        r = 2;
        a.finish();
    }

    public final void a(int i1)
    {
        a.setRequestedOrientation(i1);
    }

    public final void a(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        o = flag;
        m = AdOverlayInfoParcel.a(a.getIntent());
        if (m == null)
        {
            throw new jox("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (m.n.d > 0x7270e0)
        {
            r = 3;
        }
        if (a.getIntent() != null)
        {
            t = a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (m.q == null) goto _L3; else goto _L2
_L2:
        p = m.q.b;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        if (m.d != null && t)
        {
            m.d.b();
        }
        j = new joy(a, m.p);
        m.l;
        JVM INSTR tableswitch 1 4: default 352
    //                   1 255
    //                   2 261
    //                   3 285
    //                   4 291;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new jox("Could not determine ad overlay type.");
_L3:
        p = false;
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
            b.m(bundle.getMessage());
            r = 3;
            a.finish();
        }
          goto _L10
_L6:
        n = new joz(m.e);
        b(false);
        return;
_L7:
        b(true);
        return;
_L8:
        if (o)
        {
            r = 3;
            a.finish();
            return;
        }
        jqc.a();
        if (!jot.a(a, m.b, m.j))
        {
            r = 3;
            a.finish();
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
        f = new jpf(a, byte0, this);
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
        f.a(flag, m.h);
        j.addView(f, layoutparams);
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
        if (m != null && g)
        {
            a(m.k);
        }
        if (h != null)
        {
            a.setContentView(j);
            k = true;
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
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", o);
    }

    public final void c()
    {
        r = 1;
        a.finish();
    }

    public final void d()
    {
        r = 0;
    }

    public final boolean e()
    {
        r = 0;
        boolean flag;
        if (e == null)
        {
            flag = true;
        } else
        {
            boolean flag1 = e.q();
            flag = flag1;
            if (!flag1)
            {
                e.a("onbackblocked", Collections.emptyMap());
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
        if (m != null && m.l == 4)
        {
            if (o)
            {
                r = 3;
                a.finish();
            } else
            {
                o = true;
            }
        }
        if (e != null && !e.o())
        {
            jqc.e().b(e.a());
            return;
        } else
        {
            b.m("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public final void i()
    {
        b();
        if (e != null && (!a.isFinishing() || n == null))
        {
            jqc.e().a(e.a());
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
            jpe jpe1 = d;
            jph jph1 = jpe1.c;
            jph1.a = true;
            kwz.a.removeCallbacks(jph1);
            if (jpe1.a.d() != null);
        }
        if (e != null)
        {
            j.removeView(e.a());
        }
        n();
    }

    public final void l()
    {
        k = true;
    }

    public final void m()
    {
        if (q)
        {
            q = false;
            o();
        }
    }

}
