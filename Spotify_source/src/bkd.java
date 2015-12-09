// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.request.zzb;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

public abstract class bkd extends bkc
    implements bhs, bin, cdo, cep
{

    protected final cex g;
    private final Messenger h;
    private transient boolean i;

    public bkd(Context context, AdSizeParcel adsizeparcel, String s1, cex cex, VersionInfoParcel versioninfoparcel, bkf bkf)
    {
        this(new bkw(context, adsizeparcel, s1, versioninfoparcel), cex, bkf);
    }

    private bkd(bkw bkw1, cex cex, bkf bkf)
    {
        super(bkw1, bkf);
        g = cex;
        h = new Messenger(new cgq(c.c));
        i = false;
    }

    private biq a(AdRequestParcel adrequestparcel, Bundle bundle)
    {
        Object obj;
        PackageInfo packageinfo;
        Bundle bundle1;
        ApplicationInfo applicationinfo;
        String s1;
        Object obj1;
        Object obj2;
        Bundle bundle2;
        ArrayList arraylist;
        Object obj3;
        long l2;
        applicationinfo = c.c.getApplicationInfo();
        int l;
        try
        {
            packageinfo = c.c.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            packageinfo = null;
        }
        obj3 = c.c.getResources().getDisplayMetrics();
        obj = null;
        bundle1 = ((Bundle) (obj));
        if (c.f != null)
        {
            bundle1 = ((Bundle) (obj));
            if (c.f.getParent() != null)
            {
                int ai[] = new int[2];
                c.f.getLocationOnScreen(ai);
                int k1 = ai[0];
                int l1 = ai[1];
                int i2 = c.f.getWidth();
                int j2 = c.f.getHeight();
                boolean flag = false;
                int j = ((flag) ? 1 : 0);
                if (c.f.isShown())
                {
                    j = ((flag) ? 1 : 0);
                    if (k1 + i2 > 0)
                    {
                        j = ((flag) ? 1 : 0);
                        if (l1 + j2 > 0)
                        {
                            j = ((flag) ? 1 : 0);
                            if (k1 <= ((DisplayMetrics) (obj3)).widthPixels)
                            {
                                j = ((flag) ? 1 : 0);
                                if (l1 <= ((DisplayMetrics) (obj3)).heightPixels)
                                {
                                    j = 1;
                                }
                            }
                        }
                    }
                }
                bundle1 = new Bundle(5);
                bundle1.putInt("x", k1);
                bundle1.putInt("y", l1);
                bundle1.putInt("width", i2);
                bundle1.putInt("height", j2);
                bundle1.putInt("visible", j);
            }
        }
        s1 = bkv.h().a();
        c.l = new civ(s1, c.b);
        obj2 = c.l;
        ai = ((int []) (((civ) (obj2)).c));
        ai;
        JVM INSTR monitorenter ;
        obj2.i = SystemClock.elapsedRealtime();
        obj1 = ((civ) (obj2)).a.b();
        l2 = ((civ) (obj2)).i;
        obj2 = ((ciy) (obj1)).d;
        obj2;
        JVM INSTR monitorenter ;
        if (((ciy) (obj1)).b != -1L) goto _L2; else goto _L1
_L1:
        obj1.b = l2;
        obj1.a = ((ciy) (obj1)).b;
_L13:
        if (adrequestparcel.c == null || adrequestparcel.c.getInt("gw", 2) != 1) goto _L4; else goto _L3
_L3:
        ai;
        JVM INSTR monitorexit ;
        bkv.e();
        obj1 = cjj.a(c.c, c.f, c.i);
        long l3 = 0L;
        l2 = l3;
        if (c.p != null)
        {
            try
            {
                l2 = c.p.a();
            }
            catch (RemoteException remoteexception)
            {
                bka.e("Cannot get correlation id, default to 0.");
                l2 = l3;
            }
        }
        obj2 = UUID.randomUUID().toString();
        bundle2 = bkv.h().a(c.c, this, s1);
        arraylist = new ArrayList();
        for (l = 0; l < c.v.size(); l++)
        {
            arraylist.add(c.v.b(l));
        }

        break; /* Loop/switch isn't completed */
_L2:
        obj1.a = l2;
        continue; /* Loop/switch isn't completed */
        adrequestparcel;
        obj2;
        JVM INSTR monitorexit ;
        throw adrequestparcel;
        adrequestparcel;
        ai;
        JVM INSTR monitorexit ;
        throw adrequestparcel;
_L4:
        obj1.c = ((ciy) (obj1)).c + 1;
        obj2;
        JVM INSTR monitorexit ;
        if (true) goto _L3; else goto _L5
_L5:
        float f1;
        AdSizeParcel adsizeparcel;
        String s2;
        String s3;
        VersionInfoParcel versioninfoparcel;
        List list;
        Messenger messenger;
        String s4;
        com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel nativeadoptionsparcel;
        CapabilityParcel capabilityparcel;
        int i1;
        int j1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (c.q != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (c.r != null && bkv.h().i())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        adsizeparcel = c.i;
        s2 = c.b;
        s3 = bkv.h().b;
        versioninfoparcel = c.e;
        list = c.y;
        flag3 = bkv.h().e();
        messenger = h;
        i1 = ((DisplayMetrics) (obj3)).widthPixels;
        j1 = ((DisplayMetrics) (obj3)).heightPixels;
        f1 = ((DisplayMetrics) (obj3)).density;
        obj3 = cbb.a();
        s4 = c.a;
        nativeadoptionsparcel = c.w;
        capabilityparcel = new CapabilityParcel(flag1, flag2);
        remoteexception = c;
        if (((bkw) (remoteexception)).G && ((bkw) (remoteexception)).H) goto _L7; else goto _L6
_L6:
        if (!((bkw) (remoteexception)).G) goto _L9; else goto _L8
_L8:
        if (((bkw) (remoteexception)).I)
        {
            remoteexception = "top-scrollable";
        } else
        {
            remoteexception = "top-locked";
        }
_L11:
        return new biq(bundle1, adrequestparcel, adsizeparcel, s2, applicationinfo, packageinfo, s1, s3, versioninfoparcel, bundle2, list, arraylist, bundle, flag3, messenger, i1, j1, f1, ((String) (obj1)), l2, ((String) (obj2)), ((List) (obj3)), s4, nativeadoptionsparcel, capabilityparcel, remoteexception);
_L9:
        if (((bkw) (remoteexception)).H)
        {
            if (((bkw) (remoteexception)).I)
            {
                remoteexception = "bottom-scrollable";
            } else
            {
                remoteexception = "bottom-locked";
            }
            continue; /* Loop/switch isn't completed */
        }
_L7:
        remoteexception = "";
        if (true) goto _L11; else goto _L10
_L10:
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void a(cgv cgv1)
    {
        btl.b("setInAppPurchaseListener must be called on the main UI thread.");
        c.q = cgv1;
    }

    public final void a(chh chh1, String s1)
    {
        btl.b("setPlayStorePurchaseParams must be called on the main UI thread.");
        c.z = new bio(s1);
        c.r = chh1;
        if (!bkv.h().d() && chh1 != null)
        {
            (new bif(c.c, c.r, c.z)).e();
        }
    }

    protected final void a(cit cit1, boolean flag)
    {
        if (cit1 == null)
        {
            bka.e("Ad state was null when trying to ping impression URLs.");
        } else
        {
            super.c(cit1);
            if (cit1.o != null && cit1.o.d != null)
            {
                bkv.q();
                ceu.a(c.c, c.e.b, cit1, c.b, flag, cit1.o.d);
            }
            if (cit1.l != null && cit1.l.g != null)
            {
                bkv.q();
                ceu.a(c.c, c.e.b, cit1, c.b, flag, cit1.l.g);
                return;
            }
        }
    }

    public final void a(String s1, ArrayList arraylist)
    {
        arraylist = new big(s1, arraylist, c.c, c.e.b);
        if (c.q == null)
        {
            bka.e("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            bfq.a();
            if (!bjz.b(c.c))
            {
                bka.e("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (c.r == null)
            {
                bka.e("PlayStorePurchaseListener is not set.");
                return;
            }
            if (c.z == null)
            {
                bka.e("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (c.D)
            {
                bka.e("An in-app purchase request is already in progress, abort");
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
                bka.e("Could not start In-App purchase.");
                c.D = false;
                return;
            }
            bkv.o();
            s1 = c.c;
            boolean flag = c.e.e;
            arraylist = new GInAppPurchaseManagerInfoParcel(c.c, c.z, arraylist, this);
            Intent intent = new Intent();
            intent.setClassName(s1, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
            intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", flag);
            GInAppPurchaseManagerInfoParcel.a(intent, arraylist);
            bkv.e();
            cjj.a(s1, intent);
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
            bka.e("Could not start In-App purchase.");
        }
    }

    public final void a(String s1, boolean flag, int j, Intent intent, bii bii)
    {
        try
        {
            if (c.r != null)
            {
                c.r.a(new bij(c.c, s1, flag, j, intent, bii));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            bka.e("Fail to invoke PlayStorePurchaseListener.");
        }
        cjj.a.postDelayed(new Runnable(intent) {

            private Intent a;
            private bkd b;

            public final void run()
            {
                bkv.o();
                int l = bim.a(a);
                bkv.o();
                if (l == 0 && b.c.j != null && b.c.j.b != null && b.c.j.b.h() != null)
                {
                    b.c.j.b.h().a();
                }
                b.c.D = false;
            }

            
            {
                b = bkd.this;
                a = intent;
                super();
            }
        }, 500L);
    }

    final boolean a(cit cit1)
    {
        boolean flag = false;
        if (d == null) goto _L2; else goto _L1
_L1:
        AdRequestParcel adrequestparcel;
        adrequestparcel = d;
        d = null;
_L4:
        return a(adrequestparcel, cit1, flag);
_L2:
        AdRequestParcel adrequestparcel1 = cit1.a;
        adrequestparcel = adrequestparcel1;
        if (adrequestparcel1.c != null)
        {
            flag = adrequestparcel1.c.getBoolean("_noRefresh", false);
            adrequestparcel = adrequestparcel1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean a(cit cit1, cit cit2)
    {
        int j = 0;
        if (cit1 != null && cit1.p != null)
        {
            cit1.p.a(null);
        }
        if (cit2.p != null)
        {
            cit2.p.a(this);
        }
        cja cja1;
        cix cix1;
        String s1;
        int l;
        if (cit2.o != null)
        {
            l = cit2.o.h;
            j = cit2.o.i;
        } else
        {
            l = 0;
        }
        cja1 = c.A;
        cit1 = ((cit) (cja1.a));
        cit1;
        JVM INSTR monitorenter ;
        cja1.b = l;
        cja1.c = j;
        cix1 = cja1.d;
        s1 = cja1.e;
        synchronized (cix1.a)
        {
            cix1.e.put(s1, cja1);
        }
        cit1;
        JVM INSTR monitorexit ;
        return true;
        exception;
        cit2;
        JVM INSTR monitorexit ;
        throw exception;
        cit2;
        cit1;
        JVM INSTR monitorexit ;
        throw cit2;
    }

    public boolean a(AdRequestParcel adrequestparcel, cbk cbk1)
    {
        if (!s())
        {
            return false;
        }
        Object obj = a(bkv.h().a(c.c));
        b.a();
        c.C = 0;
        adrequestparcel = a(adrequestparcel, ((Bundle) (obj)));
        cbk1.a("seq_num", ((biq) (adrequestparcel)).g);
        cbk1.a("request_id", ((biq) (adrequestparcel)).v);
        cbk1.a("session_id", ((biq) (adrequestparcel)).h);
        if (((biq) (adrequestparcel)).f != null)
        {
            cbk1.a("app_version", String.valueOf(((biq) (adrequestparcel)).f.versionCode));
        }
        cbk1 = c;
        bkv.a();
        obj = c.c;
        bzm bzm = c.d;
        if (((biq) (adrequestparcel)).b.c.getBundle("sdk_less_server_data") != null)
        {
            adrequestparcel = new bjl(((Context) (obj)), adrequestparcel, this);
        } else
        {
            adrequestparcel = new zzb(((Context) (obj)), adrequestparcel, bzm, this);
        }
        adrequestparcel.e();
        cbk1.g = adrequestparcel;
        return true;
    }

    protected boolean a(AdRequestParcel adrequestparcel, cit cit1, boolean flag)
    {
        if (flag || !c.c()) goto _L2; else goto _L1
_L1:
        if (cit1.h <= 0L) goto _L4; else goto _L3
_L3:
        b.a(adrequestparcel, cit1.h);
_L2:
        return b.d;
_L4:
        if (cit1.o != null && cit1.o.g > 0L)
        {
            b.a(adrequestparcel, cit1.o.g);
        } else
        if (!cit1.k && cit1.d == 2)
        {
            b.a(adrequestparcel);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void b(cit cit1)
    {
        super.b(cit1);
        if (cit1.d == 3 && cit1.o != null && cit1.o.e != null)
        {
            bka.a("Pinging no fill URLs.");
            bkv.q();
            ceu.a(c.c, c.e.b, cit1, c.b, false, cit1.o.e);
        }
    }

    protected final boolean b(AdRequestParcel adrequestparcel)
    {
        return super.b(adrequestparcel) && !i;
    }

    public void d()
    {
        Object obj;
        btl.b("pause must be called on the main UI thread.");
        if (c.j != null && c.j.b != null && c.c())
        {
            bkv.g();
            cjl.a(c.j.b.a());
        }
        Object obj1;
        cit cit1;
        if (c.j != null && c.j.m != null)
        {
            try
            {
                c.j.m.d();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                bka.e("Could not pause mediation adapter.");
            }
        }
        obj1 = e;
        cit1 = c.j;
        obj = ((bzv) (obj1)).a;
        obj;
        JVM INSTR monitorenter ;
        obj1 = (bzw)((bzv) (obj1)).b.get(cit1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        ((bzw) (obj1)).f();
        obj;
        JVM INSTR monitorexit ;
        obj = b;
        obj.e = true;
        if (((bkt) (obj)).d)
        {
            ((bkt) (obj)).a.a(((bkt) (obj)).b);
        }
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
        if (c.j == null)
        {
            bka.e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (c.j.o != null && c.j.o.c != null)
        {
            bkv.q();
            ceu.a(c.c, c.e.b, c.j, c.b, false, c.j.o.c);
        }
        if (c.j.l != null && c.j.l.f != null)
        {
            bkv.q();
            ceu.a(c.c, c.e.b, c.j, c.b, false, c.j.l.f);
        }
        super.e();
    }

    public void f()
    {
        Object obj;
        btl.b("resume must be called on the main UI thread.");
        if (c.j != null && c.j.b != null && c.c())
        {
            bkv.g();
            cjl.b(c.j.b.a());
        }
        Object obj1;
        cit cit1;
        if (c.j != null && c.j.m != null)
        {
            try
            {
                c.j.m.e();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                bka.e("Could not resume mediation adapter.");
            }
        }
        obj = b;
        obj.e = false;
        if (((bkt) (obj)).d)
        {
            obj.d = false;
            ((bkt) (obj)).a(((bkt) (obj)).c, ((bkt) (obj)).f);
        }
        obj1 = e;
        cit1 = c.j;
        obj = ((bzv) (obj1)).a;
        obj;
        JVM INSTR monitorenter ;
        obj1 = (bzw)((bzv) (obj1)).b.get(cit1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        ((bzw) (obj1)).g();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void g()
    {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public final void i_()
    {
        e.a(c.j);
        i = false;
        n();
        civ civ1 = c.l;
        synchronized (civ1.c)
        {
            if (civ1.j != -1L && !civ1.b.isEmpty())
            {
                ciw ciw1 = (ciw)civ1.b.getLast();
                if (ciw1.b == -1L)
                {
                    ciw1.b = SystemClock.elapsedRealtime();
                    civ1.a.a(civ1);
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void j_()
    {
        i = true;
        p();
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

    protected boolean s()
    {
        boolean flag;
label0:
        {
            flag = true;
            bkv.e();
            if (cjj.a(c.c.getPackageManager(), c.c.getPackageName(), "android.permission.INTERNET"))
            {
                bkv.e();
                if (cjj.a(c.c))
                {
                    break label0;
                }
            }
            flag = false;
        }
        return flag;
    }

    public final void t()
    {
        e();
    }

    public final void u()
    {
        i_();
    }

    public final void v()
    {
        super.o();
    }

    public final void w()
    {
        j_();
    }

    public final void x()
    {
        if (c.j != null)
        {
            bka.e((new StringBuilder("Mediation adapter ")).append(c.j.n).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        a(c.j, true);
        q();
    }
}
