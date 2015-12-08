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
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.zzc;
import com.google.android.gms.ads.internal.purchase.zzd;
import com.google.android.gms.ads.internal.purchase.zzf;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.purchase.zzj;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.as;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.by;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.gh;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.if;
import com.google.android.gms.internal.ig;
import com.google.android.gms.internal.il;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.lc;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.lu;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pc;
import com.google.android.gms.internal.pe;
import com.google.android.gms.internal.ph;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.qd;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.wb;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza, zzq, zzp, zzo, 
//            a, zzd

public abstract class zzb extends com.google.android.gms.ads.internal.zza
    implements zzg, zzj, gh, if
{

    protected final ip j;
    protected transient boolean k;
    private final Messenger l;

    public zzb(Context context, AdSizeParcel adsizeparcel, String s, ip ip, VersionInfoParcel versioninfoparcel, com.google.android.gms.ads.internal.zzd zzd1)
    {
        this(new zzq(context, adsizeparcel, s, versioninfoparcel), ip, zzd1);
    }

    private zzb(zzq zzq1, ip ip, com.google.android.gms.ads.internal.zzd zzd1)
    {
        super(zzq1, zzd1);
        j = ip;
        l = new Messenger(new lc(f.context));
        k = false;
    }

    private com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza a(AdRequestParcel adrequestparcel, Bundle bundle)
    {
        ApplicationInfo applicationinfo = f.context.getApplicationInfo();
        Object obj;
        Object obj1;
        String s;
        DisplayMetrics displaymetrics;
        String s1;
        Object obj2;
        Bundle bundle1;
        ArrayList arraylist;
        long l2;
        long l3;
        try
        {
            obj = f.context.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        displaymetrics = f.context.getResources().getDisplayMetrics();
        s = null;
        obj1 = s;
        if (f.c != null)
        {
            obj1 = s;
            if (f.c.getParent() != null)
            {
                obj1 = new int[2];
                f.c.getLocationOnScreen(((int []) (obj1)));
                int j1 = obj1[0];
                int k1 = obj1[1];
                int l1 = f.c.getWidth();
                int i2 = f.c.getHeight();
                boolean flag = false;
                int i = ((flag) ? 1 : 0);
                if (f.c.isShown())
                {
                    i = ((flag) ? 1 : 0);
                    if (j1 + l1 > 0)
                    {
                        i = ((flag) ? 1 : 0);
                        if (k1 + i2 > 0)
                        {
                            i = ((flag) ? 1 : 0);
                            if (j1 <= displaymetrics.widthPixels)
                            {
                                i = ((flag) ? 1 : 0);
                                if (k1 <= displaymetrics.heightPixels)
                                {
                                    i = 1;
                                }
                            }
                        }
                    }
                }
                obj1 = new Bundle(5);
                ((Bundle) (obj1)).putInt("x", j1);
                ((Bundle) (obj1)).putInt("y", k1);
                ((Bundle) (obj1)).putInt("width", l1);
                ((Bundle) (obj1)).putInt("height", i2);
                ((Bundle) (obj1)).putInt("visible", i);
            }
        }
        s = zzp.zzby().b();
        f.zzqq = new pc(s, f.zzqh);
        f.zzqq.a(adrequestparcel);
        zzp.zzbv();
        s1 = qa.a(f.context, f.c, f.zzqn);
        l3 = 0L;
        l2 = l3;
        if (f.g != null)
        {
            try
            {
                l2 = f.g.getValue();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH("Cannot get correlation id, default to 0.");
                l2 = l3;
            }
        }
        obj2 = UUID.randomUUID().toString();
        bundle1 = zzp.zzby().a(f.context, this, s);
        arraylist = new ArrayList();
        for (int i1 = 0; i1 < f.m.size(); i1++)
        {
            arraylist.add(f.m.b(i1));
        }

        boolean flag1;
        boolean flag2;
        if (f.h != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (f.i != null && zzp.zzby().k())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        return new com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza(((Bundle) (obj1)), adrequestparcel, f.zzqn, f.zzqh, applicationinfo, ((PackageInfo) (obj)), s, zzp.zzby().a(), f.zzqj, bundle1, f.p, arraylist, bundle, zzp.zzby().f(), l, displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.density, s1, l2, ((String) (obj2)), cy.a(), f.a, f.n, new CapabilityParcel(flag1, flag2), f.zzbR());
    }

    protected final void a(pa pa1, boolean flag)
    {
        if (pa1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("Ad state was null when trying to ping impression URLs.");
        } else
        {
            super.b(pa1);
            if (pa1.o != null && pa1.o.d != null)
            {
                zzp.zzbH();
                il.a(f.context, f.zzqj.zzJu, pa1, f.zzqh, flag, pa1.o.d);
            }
            if (pa1.l != null && pa1.l.g != null)
            {
                zzp.zzbH();
                il.a(f.context, f.zzqj.zzJu, pa1, f.zzqh, flag, pa1.l.g);
                return;
            }
        }
    }

    protected final boolean a(AdRequestParcel adrequestparcel)
    {
        return super.a(adrequestparcel) && !k;
    }

    protected boolean a(AdRequestParcel adrequestparcel, pa pa1, boolean flag)
    {
        if (flag || !f.zzbN()) goto _L2; else goto _L1
_L1:
        if (pa1.h <= 0L) goto _L4; else goto _L3
_L3:
        e.zza(adrequestparcel, pa1.h);
_L2:
        return e.zzbp();
_L4:
        if (pa1.o != null && pa1.o.g > 0L)
        {
            e.zza(adrequestparcel, pa1.o.g);
        } else
        if (!pa1.k && pa1.d == 2)
        {
            e.zzg(adrequestparcel);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    final boolean a(pa pa1)
    {
        boolean flag = false;
        if (g == null) goto _L2; else goto _L1
_L1:
        AdRequestParcel adrequestparcel;
        adrequestparcel = g;
        g = null;
_L4:
        return a(adrequestparcel, pa1, flag);
_L2:
        AdRequestParcel adrequestparcel1 = pa1.a;
        adrequestparcel = adrequestparcel1;
        if (adrequestparcel1.extras != null)
        {
            flag = adrequestparcel1.extras.getBoolean("_noRefresh", false);
            adrequestparcel = adrequestparcel1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean d()
    {
        boolean flag;
label0:
        {
            flag = true;
            zzp.zzbv();
            if (qa.a(f.context.getPackageManager(), f.context.getPackageName(), "android.permission.INTERNET"))
            {
                zzp.zzbv();
                if (qa.a(f.context))
                {
                    break label0;
                }
            }
            flag = false;
        }
        return flag;
    }

    public String getMediationAdapterClassName()
    {
        if (f.zzqo == null)
        {
            return null;
        } else
        {
            return f.zzqo.n;
        }
    }

    public void onAdClicked()
    {
        if (f.zzqo == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (f.zzqo.o != null && f.zzqo.o.c != null)
        {
            zzp.zzbH();
            il.a(f.context, f.zzqj.zzJu, f.zzqo, f.zzqh, false, f.zzqo.o.c);
        }
        if (f.zzqo.l != null && f.zzqo.l.f != null)
        {
            zzp.zzbH();
            il.a(f.context, f.zzqj.zzJu, f.zzqo, f.zzqh, false, f.zzqo.l.f);
        }
        super.onAdClicked();
    }

    public void pause()
    {
        bl.b("pause must be called on the main UI thread.");
        if (f.zzqo != null && f.zzqo.b != null && f.zzbN())
        {
            zzp.zzbx();
            qd.a(f.zzqo.b.a());
        }
        if (f.zzqo != null && f.zzqo.m != null)
        {
            try
            {
                f.zzqo.m.d();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH("Could not pause mediation adapter.");
            }
        }
        h.c(f.zzqo);
        e.pause();
    }

    public void resume()
    {
        bl.b("resume must be called on the main UI thread.");
        if (f.zzqo != null && f.zzqo.b != null && f.zzbN())
        {
            zzp.zzbx();
            qd.b(f.zzqo.b.a());
        }
        if (f.zzqo != null && f.zzqo.m != null)
        {
            try
            {
                f.zzqo.m.e();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH("Could not resume mediation adapter.");
            }
        }
        e.resume();
        h.d(f.zzqo);
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public void zza(li li1)
    {
        bl.b("setInAppPurchaseListener must be called on the main UI thread.");
        f.h = li1;
    }

    public void zza(lu lu1, String s)
    {
        bl.b("setPlayStorePurchaseParams must be called on the main UI thread.");
        f.q = new zzk(s);
        f.i = lu1;
        if (!zzp.zzby().e() && lu1 != null)
        {
            (new zzc(f.context, f.i, f.q)).zzgz();
        }
    }

    public void zza(String s, ArrayList arraylist)
    {
        arraylist = new zzd(s, arraylist, f.context, f.zzqj.zzJu);
        if (f.h == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!zzl.zzcF().zzR(f.context))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (f.i == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH("PlayStorePurchaseListener is not set.");
                return;
            }
            if (f.q == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (f.s)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH("An in-app purchase request is already in progress, abort");
                return;
            }
            f.s = true;
            try
            {
                if (!f.i.a(s))
                {
                    f.s = false;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH("Could not start In-App purchase.");
                f.s = false;
                return;
            }
            zzp.zzbF().zza(f.context, f.zzqj.zzJx, new GInAppPurchaseManagerInfoParcel(f.context, f.q, arraylist, this));
            return;
        }
        try
        {
            f.h.a(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("Could not start In-App purchase.");
        }
    }

    public void zza(String s, boolean flag, int i, Intent intent, zzf zzf)
    {
        try
        {
            if (f.i != null)
            {
                f.i.a(new com.google.android.gms.ads.internal.purchase.zzg(f.context, s, flag, i, intent, zzf));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("Fail to invoke PlayStorePurchaseListener.");
        }
        qa.a.postDelayed(new a(this, intent), 500L);
    }

    public boolean zza(AdRequestParcel adrequestparcel, dm dm1)
    {
        Object obj2 = null;
        if (!d())
        {
            return false;
        }
        Object obj = zzp.zzby().a(f.context);
        Object obj1 = obj2;
        if (obj != null)
        {
            if (((by) (obj)).d())
            {
                ((by) (obj)).c();
            }
            obj1 = ((by) (obj)).b();
            if (obj1 != null)
            {
                obj = ((bv) (obj1)).b();
                com.google.android.gms.ads.internal.util.client.zzb.zzaF((new StringBuilder("In AdManger: loadAd, ")).append(((bv) (obj1)).toString()).toString());
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
        e.cancel();
        f.zzqH = 0;
        adrequestparcel = a(adrequestparcel, ((Bundle) (obj1)));
        dm1.a("seq_num", ((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzEq);
        dm1.a("request_id", ((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzEC);
        dm1.a("session_id", ((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzEr);
        if (((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzEo != null)
        {
            dm1.a("app_version", String.valueOf(((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzEo.versionCode));
        }
        f.zzql = zzp.zzbr().zza(f.context, adrequestparcel, f.b, this);
        return true;
    }

    protected boolean zza(pa pa1, pa pa2)
    {
        int i = 0;
        if (pa1 != null && pa1.p != null)
        {
            pa1.p.a(null);
        }
        if (pa2.p != null)
        {
            pa2.p.a(this);
        }
        int i1;
        if (pa2.o != null)
        {
            i1 = pa2.o.j;
            i = pa2.o.k;
        } else
        {
            i1 = 0;
        }
        f.zzqF.a(i1, i);
        return true;
    }

    public void zzaV()
    {
        h.a(f.zzqo);
        k = false;
        a();
        f.zzqq.c();
    }

    public void zzaW()
    {
        k = true;
        b();
    }

    public void zzaX()
    {
        onAdClicked();
    }

    public void zzaY()
    {
        zzaV();
    }

    public void zzaZ()
    {
        zzaO();
    }

    public void zzb(pa pa1)
    {
        super.zzb(pa1);
        if (pa1.d == 3 && pa1.o != null && pa1.o.e != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaF("Pinging no fill URLs.");
            zzp.zzbH();
            il.a(f.context, f.zzqj.zzJu, pa1, f.zzqh, false, pa1.o.e);
        }
    }

    public void zzba()
    {
        zzaW();
    }

    public void zzbb()
    {
        if (f.zzqo != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Mediation adapter ")).append(f.zzqo.n).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        a(f.zzqo, true);
        c();
    }
}
