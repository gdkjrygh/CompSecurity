// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import bfe;
import bhk;
import bhn;
import bho;
import bhp;
import bhs;
import bhy;
import bia;
import bka;
import bkv;
import cba;
import cbb;
import cgj;
import cjl;
import ckw;
import ckx;
import cky;
import clc;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdOverlayInfoParcel

public final class zzd extends cgj
    implements bia
{

    private static int j = Color.argb(0, 0, 0, 0);
    public final Activity a;
    public AdOverlayInfoParcel b;
    public bhy c;
    public boolean d;
    public FrameLayout e;
    public android.webkit.WebChromeClient.CustomViewCallback f;
    public RelativeLayout g;
    public boolean h;
    public boolean i;
    private ckw k;
    private bho l;
    private boolean m;
    private boolean n;
    private int o;
    private boolean p;
    private boolean q;

    public zzd(Activity activity)
    {
        d = false;
        m = false;
        n = false;
        h = false;
        o = 0;
        p = false;
        q = true;
        a = activity;
    }

    public static Activity a(zzd zzd1)
    {
        return zzd1.a;
    }

    private void b(boolean flag)
    {
        if (!i)
        {
            a.requestWindowFeature(1);
        }
        Object obj = a.getWindow();
        if (obj == null)
        {
            throw new zza("Invalid activity, no window available.");
        }
        if (!n || b.q != null && b.q.c)
        {
            ((Window) (obj)).setFlags(1024, 1024);
        }
        boolean flag3 = b.e.k().a();
        h = false;
        if (flag3)
        {
            if (b.k == bkv.g().a())
            {
                boolean flag1;
                if (a.getResources().getConfiguration().orientation == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                h = flag1;
            } else
            if (b.k == bkv.g().b())
            {
                boolean flag2;
                if (a.getResources().getConfiguration().orientation == 2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                h = flag2;
            }
        }
        bka.a((new StringBuilder("Delay onShow to next orientation change: ")).append(h).toString());
        a(b.k);
        if (bkv.g().a(((Window) (obj))))
        {
            bka.a("Hardware acceleration on the AdActivity window enabled.");
        }
        if (!n)
        {
            g.setBackgroundColor(0xff000000);
        } else
        {
            g.setBackgroundColor(j);
        }
        a.setContentView(g);
        i = true;
        if (flag)
        {
            bkv.f();
            k = clc.a(a, b.e.j(), true, flag3, null, b.n);
            k.k().a(null, null, b.f, b.j, true, b.o, null, b.e.k().i, null);
            k.k().d = new cky() {

                public final void a(ckw ckw1, boolean flag4)
                {
                    ckw1.d();
                }

            };
            if (b.m != null)
            {
                k.loadUrl(b.m);
            } else
            if (b.i != null)
            {
                k.loadDataWithBaseURL(b.g, b.i, "text/html", "UTF-8", null);
            } else
            {
                throw new zza("No URL or HTML to display in ad overlay.");
            }
            if (b.e != null)
            {
                b.e.b(this);
            }
        } else
        {
            k = b.e;
            k.a(a);
        }
        k.a(this);
        obj = k.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(k.b());
        }
        if (n)
        {
            k.setBackgroundColor(j);
        }
        g.addView(k.b(), -1, -1);
        if (!flag && !h)
        {
            m();
        }
        a(flag3);
        if (k.l())
        {
            a(flag3, true);
        }
    }

    private void n()
    {
        if (a.isFinishing() && !p)
        {
            p = true;
            if (k != null)
            {
                int i1 = o;
                k.a(i1);
                g.removeView(k.b());
                if (l != null)
                {
                    k.a(l.d);
                    k.a(false);
                    l.c.addView(k.b(), l.a, l.b);
                    l = null;
                }
                k = null;
            }
            if (b != null && b.d != null)
            {
                b.d.i_();
                return;
            }
        }
    }

    public final void a()
    {
        o = 2;
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
        m = flag;
        b = AdOverlayInfoParcel.a(a.getIntent());
        if (b == null)
        {
            throw new zza("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (b.n.d > 0x7270e0)
        {
            o = 3;
        }
        if (a.getIntent() != null)
        {
            q = a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (b.q == null) goto _L3; else goto _L2
_L2:
        n = b.q.b;
_L9:
        cax cax = cbb.U;
        if (((Boolean)bkv.n().a(cax)).booleanValue() && n && b.q.d != null)
        {
            (new bhp(this, (byte)0)).e();
        }
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        if (b.d != null && q)
        {
            b.d.j_();
        }
        if (b.l != 1 && b.c != null)
        {
            b.c.e();
        }
        g = new bhn(a, b.p);
        b.l;
        JVM INSTR tableswitch 1 4: default 440
    //                   1 343
    //                   2 349
    //                   3 373
    //                   4 379;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new zza("Could not determine ad overlay type.");
_L3:
        n = false;
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
            bka.e(bundle.getMessage());
            o = 3;
            a.finish();
        }
          goto _L10
_L6:
        l = new bho(b.e);
        b(false);
        return;
_L7:
        b(true);
        return;
_L8:
        if (m)
        {
            o = 3;
            a.finish();
            return;
        }
        bkv.b();
        if (!bhk.a(a, b.b, b.j))
        {
            o = 3;
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
        c = new bhy(a, byte0, this);
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
        c.a(flag, b.h);
        g.addView(c, layoutparams);
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (c != null)
        {
            c.a(flag, flag1);
        }
    }

    public final void b()
    {
        if (b != null && d)
        {
            a(b.k);
        }
        if (e != null)
        {
            a.setContentView(g);
            i = true;
            e.removeAllViews();
            e = null;
        }
        if (f != null)
        {
            f.onCustomViewHidden();
            f = null;
        }
        d = false;
    }

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", m);
    }

    public final void c()
    {
        o = 1;
        a.finish();
    }

    public final void d()
    {
        o = 0;
    }

    public final boolean e()
    {
        o = 0;
        boolean flag;
        if (k == null)
        {
            flag = true;
        } else
        {
            boolean flag1 = k.s();
            flag = flag1;
            if (!flag1)
            {
                k.a("onbackblocked", Collections.emptyMap());
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
        if (b != null && b.l == 4)
        {
            if (m)
            {
                o = 3;
                a.finish();
            } else
            {
                m = true;
            }
        }
        if (k != null && !k.q())
        {
            bkv.g();
            cjl.b(k.a());
            return;
        } else
        {
            bka.e("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public final void i()
    {
        b();
        if (k != null && (!a.isFinishing() || l == null))
        {
            bkv.g();
            cjl.a(k.a());
        }
        n();
    }

    public final void j()
    {
        n();
    }

    public final void k()
    {
        if (k != null)
        {
            g.removeView(k.b());
        }
        n();
    }

    public final void l()
    {
        i = true;
    }

    public final void m()
    {
        k.d();
    }


    private class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }

}
