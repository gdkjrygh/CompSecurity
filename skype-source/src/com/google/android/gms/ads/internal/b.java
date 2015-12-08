// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.c;
import com.google.android.gms.ads.internal.purchase.d;
import com.google.android.gms.ads.internal.purchase.g;
import com.google.android.gms.ads.internal.purchase.i;
import com.google.android.gms.ads.internal.purchase.j;
import com.google.android.gms.ads.internal.purchase.k;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.request.m;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ah;
import com.google.android.gms.internal.ak;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.da;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dc;
import com.google.android.gms.internal.df;
import com.google.android.gms.internal.dh;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.ek;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.er;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.gg;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.ij;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            a, zzq, p, m, 
//            o, d

public abstract class b extends com.google.android.gms.ads.internal.a
    implements f, j, ch, db
{

    protected final dh g;
    protected transient boolean h;
    private final Messenger i;

    public b(Context context, AdSizeParcel adsizeparcel, String s1, dh dh, VersionInfoParcel versioninfoparcel, com.google.android.gms.ads.internal.d d1)
    {
        this(new zzq(context, adsizeparcel, s1, versioninfoparcel), dh, d1);
    }

    private b(zzq zzq1, dh dh, com.google.android.gms.ads.internal.d d1)
    {
        super(zzq1, d1);
        g = dh;
        i = new Messenger(new ek(c.c));
        h = false;
    }

    private com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a a(AdRequestParcel adrequestparcel, Bundle bundle)
    {
        ApplicationInfo applicationinfo = c.c.getApplicationInfo();
        Object obj;
        Object obj1;
        String s1;
        DisplayMetrics displaymetrics;
        String s2;
        Object obj2;
        Bundle bundle1;
        ArrayList arraylist;
        int j1;
        long l2;
        long l3;
        boolean flag3;
        try
        {
            obj = c.c.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        displaymetrics = c.c.getResources().getDisplayMetrics();
        s1 = null;
        obj1 = s1;
        if (c.f != null)
        {
            obj1 = s1;
            if (c.f.getParent() != null)
            {
                obj1 = new int[2];
                c.f.getLocationOnScreen(((int []) (obj1)));
                int k1 = obj1[0];
                int l1 = obj1[1];
                int i2 = c.f.getWidth();
                int j2 = c.f.getHeight();
                boolean flag = false;
                int l = ((flag) ? 1 : 0);
                if (c.f.isShown())
                {
                    l = ((flag) ? 1 : 0);
                    if (k1 + i2 > 0)
                    {
                        l = ((flag) ? 1 : 0);
                        if (l1 + j2 > 0)
                        {
                            l = ((flag) ? 1 : 0);
                            if (k1 <= displaymetrics.widthPixels)
                            {
                                l = ((flag) ? 1 : 0);
                                if (l1 <= displaymetrics.heightPixels)
                                {
                                    l = 1;
                                }
                            }
                        }
                    }
                }
                obj1 = new Bundle(5);
                ((Bundle) (obj1)).putInt("x", k1);
                ((Bundle) (obj1)).putInt("y", l1);
                ((Bundle) (obj1)).putInt("width", i2);
                ((Bundle) (obj1)).putInt("height", j2);
                ((Bundle) (obj1)).putInt("visible", l);
            }
        }
        s1 = p.h().b();
        c.l = new gc(s1, c.b);
        c.l.a(adrequestparcel);
        p.e();
        s2 = gm.a(c.c, c.f, c.i);
        j1 = com.google.android.gms.ads.internal.m.a(c.c).c();
        flag3 = com.google.android.gms.ads.internal.m.a(c.c).a();
        l3 = 0L;
        l2 = l3;
        if (c.p != null)
        {
            try
            {
                l2 = c.p.a();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                com.google.android.gms.ads.internal.util.client.b.c("Cannot get correlation id, default to 0.");
                l2 = l3;
            }
        }
        obj2 = UUID.randomUUID().toString();
        bundle1 = p.h().a(c.c, this, s1);
        arraylist = new ArrayList();
        for (int i1 = 0; i1 < c.v.size(); i1++)
        {
            arraylist.add(c.v.b(i1));
        }

        boolean flag1;
        boolean flag2;
        if (c.q != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (c.r != null && p.h().k())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        return new com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a(((Bundle) (obj1)), adrequestparcel, c.i, c.b, applicationinfo, ((PackageInfo) (obj)), s1, p.h().a(), c.e, bundle1, c.y, arraylist, bundle, p.h().f(), i, displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.density, s2, flag3, j1, l2, ((String) (obj2)), ay.a(), c.a, c.w, new CapabilityParcel(flag1, flag2));
    }

    public void a(en en1)
    {
        y.b("setInAppPurchaseListener must be called on the main UI thread.");
        c.q = en1;
    }

    public final void a(er er1, String s1)
    {
        y.b("setPlayStorePurchaseParams must be called on the main UI thread.");
        c.z = new k(s1);
        c.r = er1;
        if (!p.h().e() && er1 != null)
        {
            (new c(c.c, c.r, c.z)).e();
        }
    }

    protected final void a(gb gb1, boolean flag)
    {
        if (gb1 == null)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Ad state was null when trying to ping impression URLs.");
        } else
        {
            super.c(gb1);
            if (gb1.o != null && gb1.o.d != null)
            {
                p.q();
                Context context = c.c;
                String s1 = c.e.b;
                String s3 = c.b;
                p.e();
                df.a(context, s1, gb1, s3, flag, gm.a(c.c, gb1.o.d, gb1.x));
            }
            if (gb1.l != null && gb1.l.g != null)
            {
                p.q();
                Context context1 = c.c;
                String s2 = c.e.b;
                String s4 = c.b;
                p.e();
                df.a(context1, s2, gb1, s4, flag, gm.a(c.c, gb1.l.g, gb1.x));
                return;
            }
        }
    }

    public final void a(String s1, ArrayList arraylist)
    {
        arraylist = new d(s1, arraylist, c.c, c.e.b);
        if (c.q == null)
        {
            com.google.android.gms.ads.internal.util.client.b.c("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            n.a();
            if (!com.google.android.gms.ads.internal.util.client.a.b(c.c))
            {
                com.google.android.gms.ads.internal.util.client.b.c("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (c.r == null)
            {
                com.google.android.gms.ads.internal.util.client.b.c("PlayStorePurchaseListener is not set.");
                return;
            }
            if (c.z == null)
            {
                com.google.android.gms.ads.internal.util.client.b.c("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (c.D)
            {
                com.google.android.gms.ads.internal.util.client.b.c("An in-app purchase request is already in progress, abort");
                return;
            }
            c.D = true;
            try
            {
                if (!c.r.a(s1))
                {
                    c.D = false;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.google.android.gms.ads.internal.util.client.b.c("Could not start In-App purchase.");
                c.D = false;
                return;
            }
            p.o();
            s1 = c.c;
            boolean flag = c.e.e;
            arraylist = new GInAppPurchaseManagerInfoParcel(c.c, c.z, arraylist, this);
            Intent intent = new Intent();
            intent.setClassName(s1, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
            intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", flag);
            GInAppPurchaseManagerInfoParcel.a(intent, arraylist);
            s1.startActivity(intent);
            return;
        }
        try
        {
            c.q.a(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Could not start In-App purchase.");
        }
    }

    public final void a(String s1, boolean flag, int l, Intent intent, com.google.android.gms.ads.internal.purchase.f f1)
    {
        try
        {
            if (c.r != null)
            {
                c.r.a(new g(c.c, s1, flag, l, intent, f1));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Fail to invoke PlayStorePurchaseListener.");
        }
        gm.a.postDelayed(new Runnable(intent) {

            final Intent a;
            final b b;

            public final void run()
            {
                p.o();
                int i1 = com.google.android.gms.ads.internal.purchase.i.a(a);
                p.o();
                if (i1 == 0 && b.c.j != null && b.c.j.b != null && b.c.j.b.g() != null)
                {
                    b.c.j.b.g().a();
                }
                b.c.D = false;
            }

            
            {
                b = b.this;
                a = intent;
                super();
            }
        }, 500L);
    }

    public boolean a(AdRequestParcel adrequestparcel, be be1)
    {
        Object obj2 = null;
        if (!r())
        {
            return false;
        }
        Object obj = p.h().a(c.c);
        Object obj1 = obj2;
        if (obj != null)
        {
            if (((ak) (obj)).d())
            {
                ((ak) (obj)).c();
            }
            obj1 = ((ak) (obj)).b();
            if (obj1 != null)
            {
                obj = ((ah) (obj1)).b();
                (new StringBuilder("In AdManger: loadAd, ")).append(((ah) (obj1)).toString());
                com.google.android.gms.ads.internal.util.client.b.a(3);
            } else
            {
                obj = null;
            }
            obj1 = obj2;
            if (obj != null)
            {
                obj1 = new Bundle(1);
                ((Bundle) (obj1)).putString("fingerprint", ((String) (obj)));
                ((Bundle) (obj1)).putInt("v", 1);
            }
        }
        b.a();
        c.C = 0;
        adrequestparcel = a(adrequestparcel, ((Bundle) (obj1)));
        be1.a("seq_num", ((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a) (adrequestparcel)).g);
        if (((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a) (adrequestparcel)).x != null)
        {
            be1.a("request_id", ((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a) (adrequestparcel)).x);
        }
        if (((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a) (adrequestparcel)).f != null)
        {
            be1.a("app_version", String.valueOf(((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a) (adrequestparcel)).f.versionCode));
        }
        be1 = c;
        com.google.android.gms.ads.internal.p.a();
        obj = c.c;
        obj1 = c.d;
        if (((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a) (adrequestparcel)).b.c.getBundle("sdk_less_server_data") != null)
        {
            adrequestparcel = new m(((Context) (obj)), adrequestparcel, this);
        } else
        {
            adrequestparcel = new com.google.android.gms.ads.internal.request.b(((Context) (obj)), adrequestparcel, ((com.google.android.gms.internal.o) (obj1)), this);
        }
        adrequestparcel.f();
        be1.g = adrequestparcel;
        return true;
    }

    protected boolean a(AdRequestParcel adrequestparcel, gb gb1, boolean flag)
    {
        if (flag || !c.d()) goto _L2; else goto _L1
_L1:
        if (gb1.h <= 0L) goto _L4; else goto _L3
_L3:
        b.a(adrequestparcel, gb1.h);
_L2:
        return b.d();
_L4:
        if (gb1.o != null && gb1.o.g > 0L)
        {
            b.a(adrequestparcel, gb1.o.g);
        } else
        if (!gb1.k && gb1.d == 2)
        {
            b.a(adrequestparcel);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    final boolean a(gb gb1)
    {
        boolean flag = false;
        if (d == null) goto _L2; else goto _L1
_L1:
        AdRequestParcel adrequestparcel;
        adrequestparcel = d;
        d = null;
_L4:
        return a(adrequestparcel, gb1, flag);
_L2:
        AdRequestParcel adrequestparcel1 = gb1.a;
        adrequestparcel = adrequestparcel1;
        if (adrequestparcel1.c != null)
        {
            flag = adrequestparcel1.c.getBoolean("_noRefresh", false);
            adrequestparcel = adrequestparcel1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean a(gb gb1, gb gb2)
    {
        int l = 0;
        if (gb1 != null && gb1.p != null)
        {
            gb1.p.a(null);
        }
        if (gb2.p != null)
        {
            gb2.p.a(this);
        }
        int i1;
        if (gb2.o != null)
        {
            i1 = gb2.o.j;
            l = gb2.o.k;
        } else
        {
            i1 = 0;
        }
        c.A.a(i1, l);
        return true;
    }

    public void a_()
    {
        e.a(c.j);
        h = false;
        n();
        c.l.c();
    }

    public final void b(gb gb1)
    {
        super.b(gb1);
        if (gb1.d == 3 && gb1.o != null && gb1.o.e != null)
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            p.q();
            df.a(c.c, c.e.b, gb1, c.b, false, gb1.o.e);
        }
    }

    protected final boolean b(AdRequestParcel adrequestparcel)
    {
        return super.b(adrequestparcel) && !h;
    }

    public void b_()
    {
        h = true;
        o();
    }

    public void d()
    {
        y.b("pause must be called on the main UI thread.");
        if (c.j != null && c.j.b != null && c.d())
        {
            com.google.android.gms.ads.internal.p.g().a(c.j.b.a());
        }
        if (c.j != null && c.j.m != null)
        {
            try
            {
                c.j.m.d();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.b.c("Could not pause mediation adapter.");
            }
        }
        e.c(c.j);
        b.b();
    }

    public final void e()
    {
        if (c.j == null)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (c.j.o != null && c.j.o.c != null)
        {
            p.q();
            Context context = c.c;
            String s1 = c.e.b;
            gb gb1 = c.j;
            String s3 = c.b;
            p.e();
            df.a(context, s1, gb1, s3, false, gm.a(c.c, c.j.o.c, c.j.x));
        }
        if (c.j.l != null && c.j.l.f != null)
        {
            p.q();
            Context context1 = c.c;
            String s2 = c.e.b;
            gb gb2 = c.j;
            String s4 = c.b;
            p.e();
            df.a(context1, s2, gb2, s4, false, gm.a(c.c, c.j.l.f, c.j.x));
        }
        super.e();
    }

    public void f()
    {
        y.b("resume must be called on the main UI thread.");
        if (c.j != null && c.j.b != null && c.d())
        {
            com.google.android.gms.ads.internal.p.g().b(c.j.b.a());
        }
        if (c.j != null && c.j.m != null)
        {
            try
            {
                c.j.m.e();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.b.c("Could not resume mediation adapter.");
            }
        }
        b.c();
        e.d(c.j);
    }

    public void g()
    {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public final String k()
    {
        if (c.j == null)
        {
            return null;
        } else
        {
            return c.j.n;
        }
    }

    protected boolean r()
    {
        boolean flag;
label0:
        {
            flag = true;
            p.e();
            if (gm.a(c.c.getPackageManager(), c.c.getPackageName(), "android.permission.INTERNET"))
            {
                p.e();
                if (gm.a(c.c))
                {
                    break label0;
                }
            }
            flag = false;
        }
        return flag;
    }

    public final void s()
    {
        e();
    }

    public final void t()
    {
        a_();
    }

    public final void u()
    {
        m();
    }

    public final void v()
    {
        b_();
    }

    public final void w()
    {
        if (c.j != null)
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Mediation adapter ")).append(c.j.n).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        a(c.j, true);
        p();
    }
}
