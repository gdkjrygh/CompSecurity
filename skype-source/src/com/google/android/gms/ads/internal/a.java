// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.client.p;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.client.w;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.c;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.bb;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.bi;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.er;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.gg;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.hj;
import com.google.android.gms.internal.x;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.ads.internal:
//            o, p, zzq, d

public abstract class a extends com.google.android.gms.ads.internal.client.u.a
    implements com.google.android.gms.ads.internal.client.a, j, com.google.android.gms.ads.internal.request.a, cc, com.google.android.gms.internal.fc.a, gf
{

    boolean a;
    protected final o b = new o(this);
    protected final zzq c;
    protected transient AdRequestParcel d;
    protected final x e = com.google.android.gms.ads.internal.p.h().i();
    protected final com.google.android.gms.ads.internal.d f;
    private be g;
    private bd h;
    private bd i;

    a(zzq zzq1, com.google.android.gms.ads.internal.d d1)
    {
        a = false;
        c = zzq1;
        f = d1;
        com.google.android.gms.ads.internal.p.e().b(c.c);
        com.google.android.gms.ads.internal.p.h().a(c.c, c.e);
    }

    private static long a(String s)
    {
        int k;
        int j1;
        j1 = s.indexOf("ufe");
        int i1 = s.indexOf(',', j1);
        k = i1;
        if (i1 == -1)
        {
            k = s.length();
        }
        long l1 = Long.parseLong(s.substring(j1 + 4, k));
        return l1;
        s;
        com.google.android.gms.ads.internal.util.client.b.c("Invalid index for Url fetch time in CSI latency info.");
_L2:
        return -1L;
        s;
        com.google.android.gms.ads.internal.util.client.b.c("Cannot find valid format of Url fetch time in CSI latency info.");
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean r()
    {
        com.google.android.gms.ads.internal.util.client.b.b("Ad leaving application.");
        if (c.n == null)
        {
            return false;
        }
        try
        {
            c.n.b();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call AdListener.onAdLeftApplication().", remoteexception);
            return false;
        }
        return true;
    }

    public final c a()
    {
        y.b("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.b.d.a(c.f);
    }

    protected final void a(View view)
    {
        c.f.addView(view, com.google.android.gms.ads.internal.p.g().d());
    }

    public final void a(AdSizeParcel adsizeparcel)
    {
        y.b("setAdSize must be called on the main UI thread.");
        c.i = adsizeparcel;
        if (c.j != null && c.j.b != null && c.C == 0)
        {
            c.j.b.a(adsizeparcel);
        }
        if (c.f == null)
        {
            return;
        }
        if (c.f.getChildCount() > 1)
        {
            c.f.removeView(c.f.getNextView());
        }
        c.f.setMinimumWidth(adsizeparcel.g);
        c.f.setMinimumHeight(adsizeparcel.d);
        c.f.requestLayout();
    }

    public final void a(p p1)
    {
        y.b("setAdListener must be called on the main UI thread.");
        c.m = p1;
    }

    public final void a(q q1)
    {
        y.b("setAdListener must be called on the main UI thread.");
        c.n = q1;
    }

    public final void a(w w1)
    {
        y.b("setAppEventListener must be called on the main UI thread.");
        c.o = w1;
    }

    public final void a(com.google.android.gms.ads.internal.client.x x1)
    {
        y.b("setCorrelationIdProvider must be called on the main UI thread");
        c.p = x1;
    }

    public void a(bi bi)
    {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void a(en en)
    {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void a(er er, String s)
    {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public final void a(com.google.android.gms.internal.gb.a a1)
    {
        if (a1.b.n != -1L && !TextUtils.isEmpty(a1.b.z))
        {
            long l1 = a(a1.b.z);
            if (l1 != -1L)
            {
                bd bd1 = g.a(l1 + a1.b.n);
                g.a(bd1, new String[] {
                    "stc"
                });
            }
        }
        g.a(a1.b.z);
        g.a(h, new String[] {
            "arf"
        });
        i = g.a();
        c.g = null;
        c.k = a1;
        a(a1, g);
    }

    protected abstract void a(com.google.android.gms.internal.gb.a a1, be be1);

    public final void a(String s, String s1)
    {
        if (c.o == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        c.o.a(s, s1);
        return;
        s;
        com.google.android.gms.ads.internal.util.client.b.b("Could not call the AppEventListener.", s);
        return;
    }

    public final void a(HashSet hashset)
    {
        c.a(hashset);
    }

    public void a(boolean flag)
    {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    protected final boolean a(int k)
    {
        com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Failed to load ad: ")).append(k).toString());
        a = false;
        if (c.n == null)
        {
            return false;
        }
        try
        {
            c.n.a(k);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call AdListener.onAdFailedToLoad().", remoteexception);
            return false;
        }
        return true;
    }

    public boolean a(AdRequestParcel adrequestparcel)
    {
        y.b("loadAd must be called on the main UI thread.");
        if (c.g != null || c.h != null)
        {
            if (d != null)
            {
                com.google.android.gms.ads.internal.util.client.b.c("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            d = adrequestparcel;
            return false;
        }
        com.google.android.gms.ads.internal.util.client.b.b("Starting ad request.");
        a = true;
        com.google.android.gms.internal.au au = ay.G;
        g = new be(((Boolean)com.google.android.gms.ads.internal.p.n().a(au)).booleanValue(), "load_ad", c.i.b);
        h = new bd(-1L, null, null);
        i = new bd(-1L, null, null);
        h = g.a();
        if (!adrequestparcel.f)
        {
            StringBuilder stringbuilder = new StringBuilder("Use AdRequest.Builder.addTestDevice(\"");
            com.google.android.gms.ads.internal.client.n.a();
            com.google.android.gms.ads.internal.util.client.b.b(stringbuilder.append(com.google.android.gms.ads.internal.util.client.a.a(c.c)).append("\") to get test ads on this device.").toString());
        }
        return a(adrequestparcel, g);
    }

    protected abstract boolean a(AdRequestParcel adrequestparcel, be be1);

    boolean a(gb gb1)
    {
        return false;
    }

    protected abstract boolean a(gb gb1, gb gb2);

    public final void b()
    {
        y.b("destroy must be called on the main UI thread.");
        b.a();
        e.b(c.j);
        zzq zzq1 = c;
        if (zzq1.f != null)
        {
            zzq1.f.b();
        }
        zzq1.n = null;
        zzq1.o = null;
        zzq1.r = null;
        zzq1.q = null;
        zzq1.x = null;
        zzq1.p = null;
        zzq1.a(false);
        if (zzq1.f != null)
        {
            zzq1.f.removeAllViews();
        }
        zzq1.b();
        zzq1.c();
        zzq1.j = null;
    }

    public void b(gb gb1)
    {
        g.a(i, new String[] {
            "awr"
        });
        c.h = null;
        if (gb1.d != -2 && gb1.d != 3)
        {
            com.google.android.gms.ads.internal.p.h().a(c.a());
        }
        if (gb1.d == -1)
        {
            a = false;
        } else
        {
            if (a(gb1))
            {
                com.google.android.gms.ads.internal.util.client.b.a(3);
            }
            if (gb1.d != -2)
            {
                a(gb1.d);
                return;
            }
            if (c.A == null)
            {
                c.A = new gg(c.b);
            }
            e.a(c.j);
            if (a(c.j, gb1))
            {
                c.j = gb1;
                gb1 = c;
                ((zzq) (gb1)).l.a(((zzq) (gb1)).j.t);
                ((zzq) (gb1)).l.b(((zzq) (gb1)).j.u);
                ((zzq) (gb1)).l.a(((zzq) (gb1)).i.e);
                ((zzq) (gb1)).l.b(((zzq) (gb1)).j.k);
                be be1 = g;
                if (c.j.a())
                {
                    gb1 = "1";
                } else
                {
                    gb1 = "0";
                }
                be1.a("is_mraid", gb1);
                be1 = g;
                if (c.j.k)
                {
                    gb1 = "1";
                } else
                {
                    gb1 = "0";
                }
                be1.a("is_mediation", gb1);
                if (c.j.b != null && c.j.b.j() != null)
                {
                    be be2 = g;
                    if (c.j.b.j().c())
                    {
                        gb1 = "1";
                    } else
                    {
                        gb1 = "0";
                    }
                    be2.a("is_video", gb1);
                }
                g.a(h, new String[] {
                    "ttc"
                });
                if (com.google.android.gms.ads.internal.p.h().d() != null)
                {
                    com.google.android.gms.ads.internal.p.h().d().a(g);
                }
                if (c.d())
                {
                    p();
                    return;
                }
            }
        }
    }

    protected boolean b(AdRequestParcel adrequestparcel)
    {
        adrequestparcel = c.f.getParent();
        return (adrequestparcel instanceof View) && ((View)adrequestparcel).isShown() && com.google.android.gms.ads.internal.p.e().a();
    }

    public final void c(AdRequestParcel adrequestparcel)
    {
        if (b(adrequestparcel))
        {
            a(adrequestparcel);
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.b("Ad is not visible. Not refreshing ad.");
            b.a(adrequestparcel);
            return;
        }
    }

    protected final void c(gb gb1)
    {
        if (gb1 == null)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Ad state was null when trying to ping impression URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            c.l.a();
            if (gb1.e != null)
            {
                com.google.android.gms.ads.internal.p.e();
                android.content.Context context = c.c;
                String s = c.e.b;
                com.google.android.gms.ads.internal.p.e();
                gm.a(context, s, gm.a(c.c, gb1.e, gb1.x));
                return;
            }
        }
    }

    public final boolean c()
    {
        y.b("isLoaded must be called on the main UI thread.");
        return c.g == null && c.h == null && c.j != null;
    }

    public void d()
    {
        y.b("pause must be called on the main UI thread.");
    }

    public void e()
    {
        if (c.j == null)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Ad state was null when trying to ping click URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            c.l.b();
            if (c.j.c != null)
            {
                com.google.android.gms.ads.internal.p.e();
                android.content.Context context = c.c;
                String s = c.e.b;
                com.google.android.gms.ads.internal.p.e();
                gm.a(context, s, gm.a(c.c, c.j.c, c.j.x));
            }
            if (c.m != null)
            {
                try
                {
                    c.m.a();
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.b.b("Could not notify onAdClicked event.", remoteexception);
                }
                return;
            }
        }
    }

    public void f()
    {
        y.b("resume must be called on the main UI thread.");
    }

    public final void h()
    {
        y.b("stopLoading must be called on the main UI thread.");
        a = false;
        c.a(true);
    }

    public final void i()
    {
        y.b("recordManualImpression must be called on the main UI thread.");
        if (c.j == null)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            if (c.j.f != null)
            {
                com.google.android.gms.ads.internal.p.e();
                android.content.Context context = c.c;
                String s = c.e.b;
                com.google.android.gms.ads.internal.p.e();
                gm.a(context, s, gm.a(c.c, c.j.f, c.j.x));
                return;
            }
        }
    }

    public final AdSizeParcel j()
    {
        y.b("getAdSize must be called on the main UI thread.");
        return c.i;
    }

    public final boolean l()
    {
        return a;
    }

    public final void m()
    {
        r();
    }

    protected final boolean n()
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        if (c.n == null)
        {
            return false;
        }
        try
        {
            c.n.a();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call AdListener.onAdClosed().", remoteexception);
            return false;
        }
        return true;
    }

    protected final boolean o()
    {
        com.google.android.gms.ads.internal.util.client.b.b("Ad opening.");
        if (c.n == null)
        {
            return false;
        }
        try
        {
            c.n.d();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call AdListener.onAdOpened().", remoteexception);
            return false;
        }
        return true;
    }

    protected boolean p()
    {
        com.google.android.gms.ads.internal.util.client.b.b("Ad finished loading.");
        a = false;
        if (c.n == null)
        {
            return false;
        }
        try
        {
            c.n.c();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call AdListener.onAdLoaded().", remoteexception);
            return false;
        }
        return true;
    }

    protected void q()
    {
        c(c.j);
    }
}
