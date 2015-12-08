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
import com.google.android.gms.ads.internal.client.zzu;
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
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.cj;
import com.google.android.gms.internal.da;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dc;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.dg;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.el;
import com.google.android.gms.internal.eo;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.iu;
import com.google.android.gms.internal.y;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza, zzq, zzp, zzm, 
//            zzo, zzd

public abstract class zzb extends com.google.android.gms.ads.internal.zza
    implements zzg, zzj, cj, dc
{

    private final Messenger mMessenger;
    protected final di zzow;
    protected transient boolean zzox;

    public zzb(Context context, AdSizeParcel adsizeparcel, String s, di di, VersionInfoParcel versioninfoparcel, com.google.android.gms.ads.internal.zzd zzd1)
    {
        this(new zzq(context, adsizeparcel, s, versioninfoparcel), di, null, zzd1);
    }

    zzb(zzq zzq1, di di, zzo zzo1, com.google.android.gms.ads.internal.zzd zzd1)
    {
        super(zzq1, zzo1, zzd1);
        zzow = di;
        mMessenger = new Messenger(new el(zzos.context));
        zzox = false;
    }

    private com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza zza(AdRequestParcel adrequestparcel, Bundle bundle)
    {
        ApplicationInfo applicationinfo = zzos.context.getApplicationInfo();
        Object obj;
        Object obj1;
        String s;
        DisplayMetrics displaymetrics;
        String s1;
        Object obj2;
        Bundle bundle1;
        ArrayList arraylist;
        int k;
        long l1;
        long l2;
        boolean flag3;
        try
        {
            obj = zzos.context.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        displaymetrics = zzos.context.getResources().getDisplayMetrics();
        s = null;
        obj1 = s;
        if (zzos.zzqc != null)
        {
            obj1 = s;
            if (zzos.zzqc.getParent() != null)
            {
                obj1 = new int[2];
                zzos.zzqc.getLocationOnScreen(((int []) (obj1)));
                int l = obj1[0];
                int i1 = obj1[1];
                int j1 = zzos.zzqc.getWidth();
                int k1 = zzos.zzqc.getHeight();
                boolean flag = false;
                int i = ((flag) ? 1 : 0);
                if (zzos.zzqc.isShown())
                {
                    i = ((flag) ? 1 : 0);
                    if (l + j1 > 0)
                    {
                        i = ((flag) ? 1 : 0);
                        if (i1 + k1 > 0)
                        {
                            i = ((flag) ? 1 : 0);
                            if (l <= displaymetrics.widthPixels)
                            {
                                i = ((flag) ? 1 : 0);
                                if (i1 <= displaymetrics.heightPixels)
                                {
                                    i = 1;
                                }
                            }
                        }
                    }
                }
                obj1 = new Bundle(5);
                ((Bundle) (obj1)).putInt("x", l);
                ((Bundle) (obj1)).putInt("y", i1);
                ((Bundle) (obj1)).putInt("width", j1);
                ((Bundle) (obj1)).putInt("height", k1);
                ((Bundle) (obj1)).putInt("visible", i);
            }
        }
        s = zzp.zzbA().c();
        zzos.zzqi = new gm(s, zzos.zzpZ);
        zzos.zzqi.a(adrequestparcel);
        s1 = zzp.zzbx().a(zzos.context, zzos.zzqc, zzos.zzqf);
        k = zzm.zzq(zzos.context).zzbp();
        flag3 = zzm.zzq(zzos.context).zzbn();
        l2 = 0L;
        l1 = l2;
        if (zzos.zzqm != null)
        {
            try
            {
                l1 = zzos.zzqm.getValue();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Cannot get correlation id, default to 0.");
                l1 = l2;
            }
        }
        obj2 = UUID.randomUUID().toString();
        bundle1 = zzp.zzbA().a(zzos.context, this, s);
        arraylist = new ArrayList();
        for (int j = 0; j < zzos.zzqs.size(); j++)
        {
            arraylist.add(zzos.zzqs.b(j));
        }

        boolean flag1;
        boolean flag2;
        if (zzos.zzqn != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (zzos.zzqo != null && zzp.zzbA().l())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        return new com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza(((Bundle) (obj1)), adrequestparcel, zzos.zzqf, zzos.zzpZ, applicationinfo, ((PackageInfo) (obj)), s, zzp.zzbA().a(), zzos.zzqb, bundle1, zzos.zzqv, arraylist, bundle, zzp.zzbA().g(), mMessenger, displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.density, s1, flag3, k, l1, ((String) (obj2)), ay.a(), zzos.zzpY, zzos.zzqt, new CapabilityParcel(flag1, flag2));
    }

    public String getMediationAdapterClassName()
    {
        if (zzos.zzqg == null)
        {
            return null;
        } else
        {
            return zzos.zzqg.n;
        }
    }

    public void onAdClicked()
    {
        if (zzos.zzqg == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (zzos.zzqg.o != null && zzos.zzqg.o.c != null)
        {
            zzp.zzbJ().a(zzos.context, zzos.zzqb.zzIz, zzos.zzqg, zzos.zzpZ, false, zzp.zzbx().a(zzos.context, zzos.zzqg.o.c, zzos.zzqg.x));
        }
        if (zzos.zzqg.l != null && zzos.zzqg.l.f != null)
        {
            zzp.zzbJ().a(zzos.context, zzos.zzqb.zzIz, zzos.zzqg, zzos.zzpZ, false, zzp.zzbx().a(zzos.context, zzos.zzqg.l.f, zzos.zzqg.x));
        }
        super.onAdClicked();
    }

    public void pause()
    {
        z.b("pause must be called on the main UI thread.");
        if (zzos.zzqg != null && zzos.zzqg.b != null && zzos.zzbP())
        {
            zzp.zzbz().a(zzos.zzqg.b.getWebView());
        }
        if (zzos.zzqg != null && zzos.zzqg.m != null)
        {
            try
            {
                zzos.zzqg.m.d();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Could not pause mediation adapter.");
            }
        }
        zzou.d(zzos.zzqg);
        zzor.pause();
    }

    public void resume()
    {
        z.b("resume must be called on the main UI thread.");
        if (zzos.zzqg != null && zzos.zzqg.b != null && zzos.zzbP())
        {
            zzp.zzbz().b(zzos.zzqg.b.getWebView());
        }
        if (zzos.zzqg != null && zzos.zzqg.m != null)
        {
            try
            {
                zzos.zzqg.m.e();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Could not resume mediation adapter.");
            }
        }
        zzor.resume();
        zzou.e(zzos.zzqg);
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public void zza(eo eo1)
    {
        z.b("setInAppPurchaseListener must be called on the main UI thread.");
        zzos.zzqn = eo1;
    }

    public void zza(es es1, String s)
    {
        z.b("setPlayStorePurchaseParams must be called on the main UI thread.");
        zzos.zzqw = new zzk(s);
        zzos.zzqo = es1;
        if (!zzp.zzbA().f() && es1 != null)
        {
            (new zzc(zzos.context, zzos.zzqo, zzos.zzqw)).zzgn();
        }
    }

    protected void zza(gl gl1, boolean flag)
    {
        if (gl1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Ad state was null when trying to ping impression URLs.");
        } else
        {
            super.zzc(gl1);
            if (gl1.o != null && gl1.o.d != null)
            {
                zzp.zzbJ().a(zzos.context, zzos.zzqb.zzIz, gl1, zzos.zzpZ, flag, zzp.zzbx().a(zzos.context, gl1.o.d, gl1.x));
            }
            if (gl1.l != null && gl1.l.g != null)
            {
                zzp.zzbJ().a(zzos.context, zzos.zzqb.zzIz, gl1, zzos.zzpZ, flag, zzp.zzbx().a(zzos.context, gl1.l.g, gl1.x));
                return;
            }
        }
    }

    public void zza(String s, ArrayList arraylist)
    {
        arraylist = new zzd(s, arraylist, zzos.context, zzos.zzqb.zzIz);
        if (zzos.zzqn == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!com.google.android.gms.ads.internal.client.zzk.zzcE().zzR(zzos.context))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (zzos.zzqo == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("PlayStorePurchaseListener is not set.");
                return;
            }
            if (zzos.zzqw == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (zzos.zzqA)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("An in-app purchase request is already in progress, abort");
                return;
            }
            zzos.zzqA = true;
            try
            {
                if (!zzos.zzqo.a(s))
                {
                    zzos.zzqA = false;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Could not start In-App purchase.");
                zzos.zzqA = false;
                return;
            }
            zzp.zzbH().zza(zzos.context, zzos.zzqb.zzIC, new GInAppPurchaseManagerInfoParcel(zzos.context, zzos.zzqw, arraylist, this));
            return;
        }
        try
        {
            zzos.zzqn.a(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Could not start In-App purchase.");
        }
    }

    public void zza(String s, boolean flag, int i, Intent intent, zzf zzf)
    {
        try
        {
            if (zzos.zzqo != null)
            {
                zzos.zzqo.a(new com.google.android.gms.ads.internal.purchase.zzg(zzos.context, s, flag, i, intent, zzf));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to invoke PlayStorePurchaseListener.");
        }
        gw.a.postDelayed(new Runnable(intent) {

            final Intent zzoy;
            final zzb zzoz;

            public void run()
            {
                int j = zzp.zzbH().zzd(zzoy);
                zzp.zzbH();
                if (j == 0 && zzoz.zzos.zzqg != null && zzoz.zzos.zzqg.b != null && zzoz.zzos.zzqg.b.f() != null)
                {
                    zzoz.zzos.zzqg.b.f().close();
                }
                zzoz.zzos.zzqA = false;
            }

            
            {
                zzoz = zzb.this;
                zzoy = intent;
                super();
            }
        }, 500L);
    }

    public boolean zza(AdRequestParcel adrequestparcel, bd bd1)
    {
        if (!zzaU())
        {
            return false;
        }
        Bundle bundle = zza(zzp.zzbA().a(zzos.context));
        zzor.cancel();
        zzos.zzqz = 0;
        adrequestparcel = zza(adrequestparcel, bundle);
        bd1.a("seq_num", ((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzDB);
        if (((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzDQ != null)
        {
            bd1.a("request_id", ((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzDQ);
        }
        if (((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzDz != null)
        {
            bd1.a("app_version", String.valueOf(((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzDz.versionCode));
        }
        zzos.zzqd = zzp.zzbt().zza(zzos.context, adrequestparcel, zzos.zzqa, this);
        return true;
    }

    protected boolean zza(AdRequestParcel adrequestparcel, gl gl1, boolean flag)
    {
        if (flag || !zzos.zzbP()) goto _L2; else goto _L1
_L1:
        if (gl1.h <= 0L) goto _L4; else goto _L3
_L3:
        zzor.zza(adrequestparcel, gl1.h);
_L2:
        return zzor.zzbr();
_L4:
        if (gl1.o != null && gl1.o.g > 0L)
        {
            zzor.zza(adrequestparcel, gl1.o.g);
        } else
        if (!gl1.k && gl1.d == 2)
        {
            zzor.zzf(adrequestparcel);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    boolean zza(gl gl1)
    {
        boolean flag = false;
        if (zzot == null) goto _L2; else goto _L1
_L1:
        AdRequestParcel adrequestparcel;
        adrequestparcel = zzot;
        zzot = null;
_L4:
        return zza(adrequestparcel, gl1, flag);
_L2:
        AdRequestParcel adrequestparcel1 = gl1.a;
        adrequestparcel = adrequestparcel1;
        if (adrequestparcel1.extras != null)
        {
            flag = adrequestparcel1.extras.getBoolean("_noRefresh", false);
            adrequestparcel = adrequestparcel1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean zza(gl gl1, gl gl2)
    {
        int i = 0;
        if (gl1 != null && gl1.p != null)
        {
            gl1.p.a(null);
        }
        if (gl2.p != null)
        {
            gl2.p.a(this);
        }
        int j;
        if (gl2.o != null)
        {
            j = gl2.o.j;
            i = gl2.o.k;
        } else
        {
            j = 0;
        }
        zzos.zzqx.a(j, i);
        return true;
    }

    protected boolean zzaU()
    {
        boolean flag = true;
        if (!zzp.zzbx().a(zzos.context.getPackageManager(), zzos.context.getPackageName(), "android.permission.INTERNET") || !zzp.zzbx().a(zzos.context))
        {
            flag = false;
        }
        return flag;
    }

    public void zzaV()
    {
        zzou.b(zzos.zzqg);
        zzox = false;
        zzaQ();
        zzos.zzqi.c();
    }

    public void zzaW()
    {
        zzox = true;
        zzaS();
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

    public void zzb(gl gl1)
    {
        super.zzb(gl1);
        if (gl1.d == 3 && gl1.o != null && gl1.o.e != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Pinging no fill URLs.");
            zzp.zzbJ().a(zzos.context, zzos.zzqb.zzIz, gl1, zzos.zzpZ, false, gl1.o.e);
        }
    }

    protected boolean zzb(AdRequestParcel adrequestparcel)
    {
        return super.zzb(adrequestparcel) && !zzox;
    }

    public void zzba()
    {
        zzaW();
    }

    public void zzbb()
    {
        if (zzos.zzqg != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Mediation adapter ").append(zzos.zzqg.n).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        zza(zzos.zzqg, true);
        zzaT();
    }
}
