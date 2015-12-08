// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.overlay.zzi;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.zzc;
import com.google.android.gms.ads.internal.purchase.zzg;
import com.google.android.gms.ads.internal.purchase.zzj;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzab;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzav;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzaz;
import com.google.android.gms.internal.zzbc;
import com.google.android.gms.internal.zzbg;
import com.google.android.gms.internal.zzbh;
import com.google.android.gms.internal.zzbm;
import com.google.android.gms.internal.zzbn;
import com.google.android.gms.internal.zzbq;
import com.google.android.gms.internal.zzbu;
import com.google.android.gms.internal.zzbw;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzck;
import com.google.android.gms.internal.zzcl;
import com.google.android.gms.internal.zzcm;
import com.google.android.gms.internal.zzcp;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzdo;
import com.google.android.gms.internal.zzdr;
import com.google.android.gms.internal.zzdv;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzfa;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzfe;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzfh;
import com.google.android.gms.internal.zzfl;
import com.google.android.gms.internal.zzfm;
import com.google.android.gms.internal.zzfn;
import com.google.android.gms.internal.zzfq;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzgf;
import com.google.android.gms.internal.zzt;
import com.google.android.gms.internal.zzw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzh, zzg, zzf, 
//            InterstitialAdParameterParcel, zzb, a

public class com.google.android.gms.ads.internal.zza extends com.google.android.gms.ads.internal.client.zzn.zza
    implements com.google.android.gms.ads.internal.client.zza, zzf, zzi, zzj, com.google.android.gms.ads.internal.request.zza, com.google.android.gms.ads.internal.zzc, zzbq, zzbu, zzbw, zzcl, zzdh, com.google.android.gms.internal.zzef.zza, zzfe, zzt
{
    static class a
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
    {

        public zzq A;
        private HashSet B;
        private int C;
        private int D;
        private zzfq E;
        public final String a;
        public final Context b;
        public final com.google.android.gms.internal.zzk c;
        public final VersionInfoParcel d;
        public zzfh e;
        public zzl f;
        public zza g;
        public zzm h;
        public zzfh i;
        public AdSizeParcel j;
        public zzfa k;
        public com.google.android.gms.internal.zzfa.zza l;
        public zzfb m;
        public zzp n;
        public zzdv o;
        public zzdr p;
        public zzbm q;
        public zzbn r;
        public zzbc s;
        public List t;
        public zzk u;
        public zzff v;
        public View w;
        public int x;
        public boolean y;
        public boolean z;

        private void b(boolean flag)
        {
            boolean flag1;
            flag1 = true;
            break MISSING_BLOCK_LABEL_3;
            if (g != null && k != null && k.zzwz != null && k.zzwz.zzft().zzbg() && (!flag || E.tryAcquire()))
            {
                int ai[] = new int[2];
                g.getLocationOnScreen(ai);
                int i1 = com.google.android.gms.ads.internal.client.zzj.zzbJ().zzc(b, ai[0]);
                int j1 = com.google.android.gms.ads.internal.client.zzj.zzbJ().zzc(b, ai[1]);
                if (i1 != C || j1 != D)
                {
                    C = i1;
                    D = j1;
                    zzge zzge1 = k.zzwz.zzft();
                    i1 = C;
                    j1 = D;
                    if (!flag)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                    zzge1.zza(i1, j1, flag);
                    return;
                }
            }
            return;
        }

        public HashSet a()
        {
            return B;
        }

        public void a(HashSet hashset)
        {
            B = hashset;
        }

        public void a(boolean flag)
        {
            if (x == 0)
            {
                c();
            }
            if (e != null)
            {
                e.cancel();
            }
            if (i != null)
            {
                i.cancel();
            }
            if (flag)
            {
                k = null;
            }
        }

        public void b()
        {
            if (k != null && k.zzwz != null)
            {
                k.zzwz.destroy();
            }
        }

        public void c()
        {
            if (k != null && k.zzwz != null)
            {
                k.zzwz.stopLoading();
            }
        }

        public void d()
        {
            if (k == null || k.zzuV == null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            k.zzuV.destroy();
            return;
            RemoteException remoteexception;
            remoteexception;
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not destroy mediation adapter.");
            return;
        }

        public void e()
        {
            h = null;
            n = null;
            o = null;
            p = null;
            s = null;
            A = null;
            if (b != null && (b instanceof Activity) && g != null)
            {
                zzh.zzaS().zzb((Activity)b, this);
                zzh.zzaQ().zzb((Activity)b, this);
            }
            a(false);
            if (g != null)
            {
                g.removeAllViews();
            }
            b();
            d();
            k = null;
        }

        public void onGlobalLayout()
        {
            b(false);
        }

        public void onScrollChanged()
        {
            b(true);
        }

        public a(Context context, AdSizeParcel adsizeparcel, String s1, VersionInfoParcel versioninfoparcel)
        {
            this(context, adsizeparcel, s1, versioninfoparcel, null);
        }

        a(Context context, AdSizeParcel adsizeparcel, String s1, VersionInfoParcel versioninfoparcel, com.google.android.gms.internal.zzk zzk1)
        {
            v = null;
            w = null;
            x = 0;
            y = false;
            z = false;
            B = null;
            C = -1;
            D = -1;
            com.google.android.gms.internal.zzat.zzo(context);
            if (adsizeparcel.zzpY || adsizeparcel.zzqa)
            {
                g = null;
            } else
            {
                g = new zza(context);
                g.setMinimumWidth(adsizeparcel.widthPixels);
                g.setMinimumHeight(adsizeparcel.heightPixels);
                g.setVisibility(4);
            }
            if (context != null && (context instanceof Activity) && g != null)
            {
                zzh.zzaQ().zza((Activity)context, this);
                zzh.zzaQ().zza((Activity)context, this);
            }
            j = adsizeparcel;
            a = s1;
            b = context;
            d = versioninfoparcel;
            if (zzk1 == null)
            {
                zzk1 = new com.google.android.gms.internal.zzk(new com.google.android.gms.ads.internal.a(this));
            }
            c = zzk1;
            E = new zzfq(200L);
        }
    }

    public static final class zza extends ViewSwitcher
    {

        private final zzfn zzmF;

        static zzfn zza(zza zza1)
        {
            return zza1.zzmF;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            zzmF.zzc(motionevent);
            return false;
        }

        public void removeAllViews()
        {
            for (int i = 0; i < getChildCount(); i++)
            {
                View view = getChildAt(i);
                if (view != null && (view instanceof zzgd))
                {
                    ((zzgd)view).destroy();
                }
            }

            super.removeAllViews();
        }

        public zza(Context context)
        {
            super(context);
            zzmF = new zzfn(context);
        }
    }


    private boolean zzmA;
    private boolean zzmB;
    private zzay zzmr;
    private zzax zzms;
    private zzax zzmt;
    private AdRequestParcel zzmu;
    private final zzcr zzmv;
    private final a zzmw;
    private final com.google.android.gms.ads.internal.zzg zzmx;
    private final com.google.android.gms.internal.zzv zzmy;
    private final Messenger zzmz;

    public com.google.android.gms.ads.internal.zza(Context context, AdSizeParcel adsizeparcel, String s, zzcr zzcr, VersionInfoParcel versioninfoparcel)
    {
        this(new a(context, adsizeparcel, s, versioninfoparcel), zzcr, null);
    }

    com.google.android.gms.ads.internal.zza(a a1, zzcr zzcr, com.google.android.gms.ads.internal.zzg zzg1)
    {
        zzmw = a1;
        zzmv = zzcr;
        if (zzg1 == null)
        {
            zzg1 = new com.google.android.gms.ads.internal.zzg(this);
        }
        zzmx = zzg1;
        zzh.zzaQ().zzw(zzmw.b);
        zzh.zzaT().zzb(zzmw.b, zzmw.d);
        zzmy = zzh.zzaT().zzeR();
        zzmz = new Messenger(new zzdo(zzmw.b));
    }

    private com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza zza(AdRequestParcel adrequestparcel, Bundle bundle)
    {
        ApplicationInfo applicationinfo = zzmw.b.getApplicationInfo();
        android.content.pm.PackageInfo packageinfo;
        Object obj;
        String s;
        DisplayMetrics displaymetrics;
        String s1;
        String s2;
        Bundle bundle1;
        int j;
        long l1;
        long l2;
        boolean flag1;
        try
        {
            packageinfo = zzmw.b.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        displaymetrics = zzmw.b.getResources().getDisplayMetrics();
        s = null;
        obj = s;
        if (zzmw.g != null)
        {
            obj = s;
            if (zzmw.g.getParent() != null)
            {
                obj = new int[2];
                zzmw.g.getLocationOnScreen(((int []) (obj)));
                int k = obj[0];
                int l = obj[1];
                int i1 = zzmw.g.getWidth();
                int j1 = zzmw.g.getHeight();
                boolean flag = false;
                int i = ((flag) ? 1 : 0);
                if (zzmw.g.isShown())
                {
                    i = ((flag) ? 1 : 0);
                    if (k + i1 > 0)
                    {
                        i = ((flag) ? 1 : 0);
                        if (l + j1 > 0)
                        {
                            i = ((flag) ? 1 : 0);
                            if (k <= displaymetrics.widthPixels)
                            {
                                i = ((flag) ? 1 : 0);
                                if (l <= displaymetrics.heightPixels)
                                {
                                    i = 1;
                                }
                            }
                        }
                    }
                }
                obj = new Bundle(5);
                ((Bundle) (obj)).putInt("x", k);
                ((Bundle) (obj)).putInt("y", l);
                ((Bundle) (obj)).putInt("width", i1);
                ((Bundle) (obj)).putInt("height", j1);
                ((Bundle) (obj)).putInt("visible", i);
            }
        }
        s = zzh.zzaT().zzeK();
        zzmw.m = new zzfb(s, zzmw.a);
        zzmw.m.zze(adrequestparcel);
        s1 = zzh.zzaQ().zza(zzmw.b, zzmw.g, zzmw.j);
        j = com.google.android.gms.ads.internal.zzf.zzl(zzmw.b).zzaJ();
        flag1 = com.google.android.gms.ads.internal.zzf.zzl(zzmw.b).isInitialized();
        l2 = 0L;
        l1 = l2;
        if (zzmw.A != null)
        {
            try
            {
                l1 = zzmw.A.getValue();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Cannot get correlation id, default to 0.");
                l1 = l2;
            }
        }
        s2 = UUID.randomUUID().toString();
        bundle1 = zzh.zzaT().zza(zzmw.b, this, s);
        return new com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza(((Bundle) (obj)), adrequestparcel, zzmw.j, zzmw.a, applicationinfo, packageinfo, s, zzh.zzaT().getSessionId(), zzmw.d, bundle1, zzmw.t, bundle, zzh.zzaT().zzeO(), zzmz, displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.density, s1, flag1, j, l1, s2, com.google.android.gms.internal.zzat.zzcg());
    }

    static a zza(com.google.android.gms.ads.internal.zza zza1)
    {
        return zza1.zzmw;
    }

    private zzgd zza(com.google.android.gms.ads.internal.zzb zzb1)
    {
        if (zzmw.j.zzpY)
        {
            zzgd zzgd1 = zzh.zzaR().zza(zzmw.b, zzmw.j, false, false, zzmw.c, zzmw.d);
            zzgd1.zzft().zzb(this, null, this, this, ((Boolean)zzat.zzrO.get()).booleanValue(), this, this, zzb1, null);
            return zzgd1;
        }
        if (zzmw.j.zzqa) goto _L2; else goto _L1
_L1:
        Object obj = zzmw.g.getNextView();
        if (!(obj instanceof zzgd)) goto _L4; else goto _L3
_L3:
        obj = (zzgd)obj;
        ((zzgd) (obj)).zza(zzmw.b, zzmw.j);
_L5:
        ((zzgd) (obj)).zzft().zzb(this, this, this, this, false, this, null, zzb1, this);
        return ((zzgd) (obj));
_L4:
        if (obj != null)
        {
            zzmw.g.removeView(((View) (obj)));
        }
        zzgd zzgd2 = zzh.zzaR().zza(zzmw.b, zzmw.j, false, false, zzmw.c, zzmw.d);
        obj = zzgd2;
        if (zzmw.j.zzpZ == null)
        {
            zzc(zzgd2.getWebView());
            obj = zzgd2;
        }
        if (true) goto _L5; else goto _L2
_L2:
        return null;
    }

    private void zza(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (zzmw.h == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        zzmw.h.onAdFailedToLoad(i);
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void zza(Bundle bundle)
    {
        zzh.zzaQ().zza(zzmw.b, zzmw.d.zzCI, "gmob-apps", bundle);
    }

    private void zzaA()
    {
        if (zzmw.x == 0)
        {
            zzmw.b();
            zzmw.k = null;
            zzmw.z = false;
            zzmB = false;
        }
    }

    private void zzat()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("Ad closing.");
        if (zzmw.h == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzmw.h.onAdClosed();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdClosed().", remoteexception);
        return;
    }

    private void zzau()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("Ad leaving application.");
        if (zzmw.h == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzmw.h.onAdLeftApplication();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    private void zzav()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("Ad opening.");
        if (zzmw.h == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzmw.h.onAdOpened();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    private void zzaw()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("Ad finished loading.");
        if (zzmw.h != null)
        {
            try
            {
                zzmw.h.onAdLoaded();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdLoaded().", remoteexception);
            }
        }
        zzmB = true;
    }

    private void zzax()
    {
        try
        {
            if ((zzmw.k.zzBx instanceof zzbg) && zzmw.q != null)
            {
                zzmw.q.zza((zzbg)zzmw.k.zzBx);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
        }
    }

    private void zzay()
    {
        try
        {
            if ((zzmw.k.zzBx instanceof zzbh) && zzmw.r != null)
            {
                zzmw.r.zza((zzbh)zzmw.k.zzBx);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
        }
    }

    private boolean zzb(zzfa zzfa1)
    {
        if (zzfa1.zzzt)
        {
            View view;
            try
            {
                zzfa1 = (View)com.google.android.gms.dynamic.zze.zzg(zzfa1.zzuV.getView());
            }
            // Misplaced declaration of an exception variable
            catch (zzfa zzfa1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get View from mediation adapter.", zzfa1);
                return false;
            }
            view = zzmw.g.getNextView();
            if (view != null)
            {
                if (view instanceof zzgd)
                {
                    ((zzgd)view).destroy();
                }
                zzmw.g.removeView(view);
            }
            try
            {
                zzc(zzfa1);
            }
            // Misplaced declaration of an exception variable
            catch (zzfa zzfa1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not add mediation view to view hierarchy.", zzfa1);
                return false;
            }
        } else
        if (zzfa1.zzBu != null)
        {
            zzfa1.zzwz.zza(zzfa1.zzBu);
            zzmw.g.removeAllViews();
            zzmw.g.setMinimumWidth(zzfa1.zzBu.widthPixels);
            zzmw.g.setMinimumHeight(zzfa1.zzBu.heightPixels);
            zzc(zzfa1.zzwz.getWebView());
        }
        if (zzmw.g.getChildCount() > 1)
        {
            zzmw.g.showNext();
        }
        if (zzmw.k != null)
        {
            zzfa1 = zzmw.g.getNextView();
            if (zzfa1 instanceof zzgd)
            {
                ((zzgd)zzfa1).zza(zzmw.b, zzmw.j);
            } else
            if (zzfa1 != null)
            {
                zzmw.g.removeView(zzfa1);
            }
            zzmw.d();
        }
        zzmw.g.setVisibility(0);
        return true;
    }

    private void zze(boolean flag)
    {
        if (zzmw.k == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Ad state was null when trying to ping impression URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Pinging Impression URLs.");
            zzmw.m.zzeD();
            if (zzmw.k.zzuD != null)
            {
                zzh.zzaQ().zza(zzmw.b, zzmw.d.zzCI, zzb(zzmw.k.zzuD));
            }
            if (zzmw.k.zzBt != null && zzmw.k.zzBt.zzuD != null)
            {
                zzh.zzba().zza(zzmw.b, zzmw.d.zzCI, zzmw.k, zzmw.a, flag, zzb(zzmw.k.zzBt.zzuD));
            }
            if (zzmw.k.zzuU != null && zzmw.k.zzuU.zzux != null)
            {
                zzh.zzba().zza(zzmw.b, zzmw.d.zzCI, zzmw.k, zzmw.a, flag, zzmw.k.zzuU.zzux);
                return;
            }
        }
    }

    public void destroy()
    {
        zzv.zzbI("destroy must be called on the main UI thread.");
        zzmx.cancel();
        zzmy.zze(zzmw.k);
        zzmw.e();
    }

    public String getMediationAdapterClassName()
    {
        if (zzmw.k != null)
        {
            return zzmw.k.zzuW;
        } else
        {
            return null;
        }
    }

    public boolean isReady()
    {
        zzv.zzbI("isLoaded must be called on the main UI thread.");
        return zzmw.e == null && zzmw.i == null && zzmw.k != null;
    }

    public void onAdClicked()
    {
        recordClick();
    }

    public void onAppEvent(String s, String s1)
    {
        if (zzmw.n == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        zzmw.n.onAppEvent(s, s1);
        return;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        zzv.zzbI("pause must be called on the main UI thread.");
        if (zzmw.k != null && zzmw.x == 0)
        {
            zzh.zzaS().zza(zzmw.k.zzwz.getWebView());
        }
        if (zzmw.k != null && zzmw.k.zzuV != null)
        {
            try
            {
                zzmw.k.zzuV.pause();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not pause mediation adapter.");
            }
        }
        zzmy.zzf(zzmw.k);
        zzmx.pause();
    }

    public void recordClick()
    {
        if (zzmw.k == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Ad state was null when trying to ping click URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Pinging click URLs.");
            zzmw.m.zzeE();
            if (zzmw.k.zzuC != null)
            {
                zzh.zzaQ().zza(zzmw.b, zzmw.d.zzCI, zzb(zzmw.k.zzuC));
            }
            if (zzmw.k.zzBt != null && zzmw.k.zzBt.zzuC != null)
            {
                zzh.zzba().zza(zzmw.b, zzmw.d.zzCI, zzmw.k, zzmw.a, false, zzb(zzmw.k.zzBt.zzuC));
            }
            if (zzmw.k.zzuU != null && zzmw.k.zzuU.zzuw != null)
            {
                zzh.zzba().zza(zzmw.b, zzmw.d.zzCI, zzmw.k, zzmw.a, false, zzmw.k.zzuU.zzuw);
            }
            if (zzmw.f != null)
            {
                try
                {
                    zzmw.f.onAdClicked();
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not notify onAdClicked event.", remoteexception);
                }
                return;
            }
        }
    }

    public void recordImpression()
    {
        zze(false);
    }

    public void resume()
    {
        zzv.zzbI("resume must be called on the main UI thread.");
        if (zzmw.k != null && zzmw.x == 0)
        {
            zzh.zzaS().zzb(zzmw.k.zzwz.getWebView());
        }
        if (zzmw.k != null && zzmw.k.zzuV != null)
        {
            try
            {
                zzmw.k.zzuV.resume();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not resume mediation adapter.");
            }
        }
        zzmx.resume();
        zzmy.zzg(zzmw.k);
    }

    public void showInterstitial()
    {
        zzv.zzbI("showInterstitial must be called on the main UI thread.");
        if (!zzmw.j.zzpY)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Cannot call showInterstitial on a banner ad.");
        } else
        {
            if (zzmw.k == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("The interstitial has not loaded.");
                return;
            }
            if (!zzmB)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", zzmw.b.getApplicationContext().getPackageName());
                bundle.putString("action", "show_interstitial_before_load_finish");
                zza(bundle);
            }
            if (!zzh.zzaQ().zzB(zzmw.b))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle1 = new Bundle();
                bundle1.putString("appid", zzmw.b.getApplicationContext().getPackageName());
                bundle1.putString("action", "show_interstitial_app_not_in_foreground");
                zza(bundle1);
            }
            if (zzmw.x != 1)
            {
                if (zzmw.k.zzwz.zzfx())
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzan("The interstitial is already showing.");
                    return;
                }
                zzmw.k.zzwz.zzB(true);
                if (zzmw.k.zzwz.zzft().zzbg() || zzmw.k.zzBs != null)
                {
                    zzw zzw1 = zzmy.zza(zzmw.j, zzmw.k);
                    if (zzmw.k.zzwz.zzft().zzbg() && zzw1 != null)
                    {
                        zzw1.zza(this);
                    }
                }
                if (zzmw.k.zzzt)
                {
                    try
                    {
                        zzmw.k.zzuV.showInterstitial();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show interstitial.", remoteexception);
                    }
                    zzaA();
                    return;
                }
                Object obj = new InterstitialAdParameterParcel(zzmw.z, zzas());
                int j = zzmw.k.zzwz.getRequestedOrientation();
                int i = j;
                if (j == -1)
                {
                    i = zzmw.k.orientation;
                }
                obj = new AdOverlayInfoParcel(this, this, this, zzmw.k.zzwz, i, zzmw.d, zzmw.k.zzzy, ((InterstitialAdParameterParcel) (obj)));
                zzh.zzaO().zza(zzmw.b, ((AdOverlayInfoParcel) (obj)));
                return;
            }
        }
    }

    public void stopLoading()
    {
        zzv.zzbI("stopLoading must be called on the main UI thread.");
        zzmw.a(true);
    }

    Bundle zza(zzae zzae1)
    {
        if (zzae1 != null)
        {
            if (zzae1.zzbD())
            {
                zzae1.wakeup();
            }
            zzab zzab1 = zzae1.zzbB();
            if (zzab1 != null)
            {
                zzae1 = zzab1.zzbs();
                com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("In AdManger: loadAd, ").append(zzab1.toString()).toString());
            } else
            {
                zzae1 = null;
            }
            if (zzae1 != null)
            {
                Bundle bundle = new Bundle(1);
                bundle.putString("fingerprint", zzae1);
                bundle.putInt("v", 1);
                return bundle;
            }
        }
        return null;
    }

    public String zza(String s, String s1, int i)
    {
        String s2 = s;
        if (((Boolean)zzat.zzrQ.get()).booleanValue())
        {
            s2 = s;
            if (com.google.android.gms.ads.internal.zzf.zzl(zzmw.b).isInitialized())
            {
                s2 = s;
                if (!TextUtils.isEmpty(s))
                {
                    s2 = Uri.parse(s).buildUpon().appendQueryParameter("ga_cid", s1).appendQueryParameter("ga_hid", String.valueOf(i)).build().toString();
                }
            }
        }
        return s2;
    }

    public void zza(int i, int j, int k, int l)
    {
        zzav();
    }

    public void zza(AdSizeParcel adsizeparcel)
    {
        zzv.zzbI("setAdSize must be called on the main UI thread.");
        zzmw.j = adsizeparcel;
        if (zzmw.k != null && zzmw.x == 0)
        {
            zzmw.k.zzwz.zza(adsizeparcel);
        }
        if (zzmw.g.getChildCount() > 1)
        {
            zzmw.g.removeView(zzmw.g.getNextView());
        }
        zzmw.g.setMinimumWidth(adsizeparcel.widthPixels);
        zzmw.g.setMinimumHeight(adsizeparcel.heightPixels);
        zzmw.g.requestLayout();
    }

    public void zza(zzl zzl1)
    {
        zzv.zzbI("setAdListener must be called on the main UI thread.");
        zzmw.f = zzl1;
    }

    public void zza(zzm zzm1)
    {
        zzv.zzbI("setAdListener must be called on the main UI thread.");
        zzmw.h = zzm1;
    }

    public void zza(zzp zzp1)
    {
        zzv.zzbI("setAppEventListener must be called on the main UI thread.");
        zzmw.n = zzp1;
    }

    public void zza(zzq zzq1)
    {
        zzv.zzbI("setCorrelationIdProvider must be called on the main UI thread");
        zzmw.A = zzq1;
    }

    public void zza(zzbc zzbc1)
    {
        zzv.zzbI("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        zzmw.s = zzbc1;
    }

    public void zza(zzdr zzdr1)
    {
        zzv.zzbI("setInAppPurchaseListener must be called on the main UI thread.");
        zzmw.p = zzdr1;
    }

    public void zza(zzdv zzdv1, String s)
    {
        zzv.zzbI("setPlayStorePurchaseParams must be called on the main UI thread.");
        zzmw.u = new zzk(s);
        zzmw.o = zzdv1;
        if (!zzh.zzaT().zzeN() && zzdv1 != null)
        {
            (new zzc(zzmw.b, zzmw.o, zzmw.u)).zzeW();
        }
    }

    public void zza(com.google.android.gms.internal.zzfa.zza zza1)
    {
        Object obj = null;
        zzmr.zza(zzms, new String[] {
            "arf"
        });
        zzmt = zzmr.zzct();
        zzmw.e = null;
        zzmw.l = zza1;
        zzgd zzgd1;
        if (!zzmw.j.zzqa)
        {
            com.google.android.gms.ads.internal.zzb zzb1 = new com.google.android.gms.ads.internal.zzb();
            zzgd1 = zza(zzb1);
            zzb1.zza(new zzb.zzb(zza1, zzgd1));
            zzgd1.setOnTouchListener(new android.view.View.OnTouchListener(zzb1) {

                final com.google.android.gms.ads.internal.zzb a;
                final com.google.android.gms.ads.internal.zza b;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    a.recordClick();
                    return false;
                }

            
            {
                b = com.google.android.gms.ads.internal.zza.this;
                a = zzb1;
                super();
            }
            });
            zzgd1.setOnClickListener(new android.view.View.OnClickListener(zzb1) {

                final com.google.android.gms.ads.internal.zzb a;
                final com.google.android.gms.ads.internal.zza b;

                public void onClick(View view)
                {
                    a.recordClick();
                }

            
            {
                b = com.google.android.gms.ads.internal.zza.this;
                a = zzb1;
                super();
            }
            });
        } else
        {
            zzgd1 = null;
        }
        if (zza1.zzmP != null)
        {
            zzmw.j = zza1.zzmP;
        }
        if (zza1.errorCode != -2)
        {
            zza(new zzfa(zza1, zzgd1, null, null, null, null, null));
            return;
        }
        if (!zza1.zzBz.zzzt && zza1.zzBz.zzzC)
        {
            if (zza1.zzBz.zzwB != null)
            {
                obj = Uri.parse(zza1.zzBz.zzwB).buildUpon().query(null).build().toString();
            }
            obj = new zzaz(this, ((String) (obj)), zza1.zzBz.zzzr);
            try
            {
                if (zzmw.s != null)
                {
                    zzmw.x = 1;
                    zzmw.s.zza(((com.google.android.gms.internal.zzbb) (obj)));
                    return;
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
            }
            catch (RuntimeException runtimeexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Exception happens when invoking onCustomRenderedAdLoaded.", runtimeexception);
                zzh.zzaT().zzc(runtimeexception, true);
            }
        }
        zzmw.x = 0;
        zzmw.i = zzh.zzaP().zza(zzmw.b, this, zza1, zzmw.c, zzgd1, zzmv, this);
        com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("AdRenderer: ").append(zzmw.i.getClass().getName()).toString());
    }

    public void zza(zzfa zzfa1)
    {
        zzmr.zza(zzmt, new String[] {
            "awr"
        });
        zzmr.zza(zzms, new String[] {
            "ttc"
        });
        zzmw.i = null;
        boolean flag = zzmw.j.zzqa;
        zza(((List) (null)));
        if (zzfa1.errorCode != -2 && zzfa1.errorCode != 3)
        {
            zzh.zzaT().zzb(zzmw.a());
        }
        if (zzfa1.errorCode != -1)
        {
            if (zza(zzfa1, flag))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaj("Ad refresh scheduled.");
            }
            if (zzfa1.errorCode == 3 && zzfa1.zzBt != null && zzfa1.zzBt.zzuE != null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaj("Pinging no fill URLs.");
                zzh.zzba().zza(zzmw.b, zzmw.d.zzCI, zzfa1, zzmw.a, false, zzfa1.zzBt.zzuE);
            }
            if (zzfa1.errorCode != -2)
            {
                zza(zzfa1.errorCode);
                return;
            }
            if (!zzmw.j.zzpY && !flag && zzmw.x == 0)
            {
                if (!zzb(zzfa1))
                {
                    zza(0);
                    return;
                }
                if (zzmw.g != null)
                {
                    zza.zza(zzmw.g).zzag(zzfa1.zzzy);
                }
            }
            if (zzmw.k != null && zzmw.k.zzuX != null)
            {
                zzmw.k.zzuX.zza(null);
            }
            if (zzfa1.zzuX != null)
            {
                zzfa1.zzuX.zza(this);
            }
            zzmy.zzd(zzmw.k);
            zzmw.k = zzfa1;
            zzmw.m.zzj(zzfa1.zzBv);
            zzmw.m.zzk(zzfa1.zzBw);
            zzmw.m.zzy(zzmw.j.zzpY);
            zzmw.m.zzz(zzfa1.zzzt);
            if (!zzmw.j.zzpY && !flag && zzmw.x == 0)
            {
                zze(false);
            }
            if (zzmw.v == null)
            {
                zzmw.v = new zzff(zzmw.a);
            }
            int i;
            int j;
            if (zzfa1.zzBt != null)
            {
                j = zzfa1.zzBt.zzuH;
                i = zzfa1.zzBt.zzuI;
            } else
            {
                i = 0;
                j = 0;
            }
            zzmw.v.zzf(j, i);
            if (zzmw.x == 0)
            {
                if (!zzmw.j.zzpY && zzfa1.zzwz != null && (zzfa1.zzwz.zzft().zzbg() || zzfa1.zzBs != null))
                {
                    zzw zzw1 = zzmy.zza(zzmw.j, zzmw.k);
                    if (zzfa1.zzwz.zzft().zzbg() && zzw1 != null)
                    {
                        zzw1.zza(this);
                    }
                }
                if (zzmw.k.zzwz != null)
                {
                    zzmw.k.zzwz.zzft().zzfG();
                }
                if (flag)
                {
                    zzfa1 = zzfa1.zzBx;
                    if ((zzfa1 instanceof zzbh) && zzmw.r != null)
                    {
                        zzay();
                    } else
                    if ((zzfa1 instanceof zzbg) && zzmw.q != null)
                    {
                        zzax();
                    } else
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzan("No matching listener for retrieved native ad template.");
                        zza(0);
                        return;
                    }
                }
                zzaw();
            } else
            if (zzmw.w != null && zzfa1.zzBs != null)
            {
                zzmy.zza(zzmw.j, zzmw.k, zzmw.w);
            }
            if (zzh.zzaT().zzeM() != null)
            {
                zzh.zzaT().zzeM().zza(zzmr);
                return;
            }
        }
    }

    public void zza(zzw zzw1, boolean flag)
    {
        if (zzmw.k != null && zzmw.k.zzwz != null)
        {
            HashMap hashmap = new HashMap();
            if (flag)
            {
                zzw1 = "1";
            } else
            {
                zzw1 = "0";
            }
            hashmap.put("isVisible", zzw1);
            zzmw.k.zzwz.zzb("onAdVisibilityChanged", hashmap);
        }
    }

    public void zza(String s, ArrayList arraylist)
    {
        arraylist = new com.google.android.gms.ads.internal.purchase.zzd(s, arraylist, zzmw.b, zzmw.d.zzCI);
        if (zzmw.p == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!com.google.android.gms.ads.internal.client.zzj.zzbJ().zzD(zzmw.b))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (zzmw.o == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("PlayStorePurchaseListener is not set.");
                return;
            }
            if (zzmw.u == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (zzmw.y)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("An in-app purchase request is already in progress, abort");
                return;
            }
            zzmw.y = true;
            try
            {
                if (!zzmw.o.isValidPurchase(s))
                {
                    zzmw.y = false;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not start In-App purchase.");
                zzmw.y = false;
                return;
            }
            zzh.zzaZ().zza(zzmw.b, zzmw.d.zzCL, new GInAppPurchaseManagerInfoParcel(zzmw.b, zzmw.u, arraylist, this));
            return;
        }
        try
        {
            zzmw.p.zza(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not start In-App purchase.");
        }
    }

    public void zza(String s, boolean flag, int i, Intent intent, com.google.android.gms.ads.internal.purchase.zzf zzf1)
    {
        try
        {
            if (zzmw.o != null)
            {
                zzmw.o.zza(new zzg(zzmw.b, s, flag, i, intent, zzf1));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Fail to invoke PlayStorePurchaseListener.");
        }
        zzfl.zzCr.postDelayed(new Runnable(intent) {

            final Intent a;
            final com.google.android.gms.ads.internal.zza b;

            public void run()
            {
                int j = zzh.zzaZ().zzd(a);
                zzh.zzaZ();
                if (j == 0 && com.google.android.gms.ads.internal.zza.zza(b).k != null && com.google.android.gms.ads.internal.zza.zza(b).k.zzwz != null && com.google.android.gms.ads.internal.zza.zza(b).k.zzwz.zzfr() != null)
                {
                    com.google.android.gms.ads.internal.zza.zza(b).k.zzwz.zzfr().close();
                }
                com.google.android.gms.ads.internal.zza.zza(b).y = false;
            }

            
            {
                b = com.google.android.gms.ads.internal.zza.this;
                a = intent;
                super();
            }
        }, 500L);
    }

    public void zza(HashSet hashset)
    {
        zzmw.a(hashset);
    }

    public void zza(List list)
    {
        zzv.zzbI("setNativeTemplates must be called on the main UI thread.");
        zzmw.t = list;
    }

    public boolean zza(AdRequestParcel adrequestparcel)
    {
        zzv.zzbI("loadAd must be called on the main UI thread.");
        if (zzmw.e != null || zzmw.i != null)
        {
            if (zzmu != null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            zzmu = adrequestparcel;
        } else
        {
            if (zzmw.j.zzpY && zzmw.k != null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("An interstitial is already loading. Aborting.");
                return false;
            }
            if (zzaz())
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzal("Starting ad request.");
                zzaf();
                zzms = zzmr.zzct();
                if (!adrequestparcel.zzpL)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzal((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(com.google.android.gms.ads.internal.client.zzj.zzbJ().zzC(zzmw.b)).append("\") to get test ads on this device.").toString());
                }
                Bundle bundle = zza(zzh.zzaT().zzs(zzmw.b));
                zzmx.cancel();
                zzmw.x = 0;
                adrequestparcel = zza(adrequestparcel, bundle);
                zzmw.e = zzh.zzaM().zza(zzmw.b, adrequestparcel, zzmw.c, this);
                return true;
            }
        }
        return false;
    }

    boolean zza(zzfa zzfa1, boolean flag)
    {
        boolean flag1 = false;
        AdRequestParcel adrequestparcel;
        if (zzmu != null)
        {
            adrequestparcel = zzmu;
            zzmu = null;
        } else
        {
            AdRequestParcel adrequestparcel1 = zzfa1.zzyW;
            adrequestparcel = adrequestparcel1;
            if (adrequestparcel1.extras != null)
            {
                flag1 = adrequestparcel1.extras.getBoolean("_noRefresh", false);
                adrequestparcel = adrequestparcel1;
            }
        }
        if (zzmw.j.zzpY)
        {
            if (zzmw.x == 0)
            {
                zzh.zzaS().zza(zzfa1.zzwz.getWebView());
            }
        } else
        if (!(flag1 | flag) && zzmw.x == 0)
        {
            if (zzfa1.zzuG > 0L)
            {
                zzmx.zza(adrequestparcel, zzfa1.zzuG);
            } else
            if (zzfa1.zzBt != null && zzfa1.zzBt.zzuG > 0L)
            {
                zzmx.zza(adrequestparcel, zzfa1.zzBt.zzuG);
            } else
            if (!zzfa1.zzzt && zzfa1.errorCode == 2)
            {
                zzmx.zzc(adrequestparcel);
            }
        }
        return zzmx.zzaK();
    }

    void zzaf()
    {
        zzmr = new zzay("load_ad");
        zzms = new zzax(-1L, null, null);
        zzmt = new zzax(-1L, null, null);
    }

    public com.google.android.gms.dynamic.zzd zzag()
    {
        zzv.zzbI("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.zze.zzt(zzmw.g);
    }

    public AdSizeParcel zzah()
    {
        zzv.zzbI("getAdSize must be called on the main UI thread.");
        return zzmw.j;
    }

    public void zzai()
    {
        zzau();
    }

    public void zzaj()
    {
        zzmy.zzd(zzmw.k);
        if (zzmw.j.zzpY)
        {
            zzaA();
        }
        zzmA = false;
        zzat();
        zzmw.m.zzeF();
    }

    public void zzak()
    {
        if (zzmw.j.zzpY)
        {
            zze(false);
        }
        zzmA = true;
        zzav();
    }

    public void zzal()
    {
        onAdClicked();
    }

    public void zzam()
    {
        zzaj();
    }

    public void zzan()
    {
        zzai();
    }

    public void zzao()
    {
        zzak();
    }

    public void zzap()
    {
        if (zzmw.k != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Mediation adapter ").append(zzmw.k.zzuW).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        zze(true);
        zzaw();
    }

    public void zzaq()
    {
        zzat();
    }

    public void zzar()
    {
        zzv.zzbI("recordManualImpression must be called on the main UI thread.");
        if (zzmw.k == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Pinging manual tracking URLs.");
            if (zzmw.k.zzzv != null)
            {
                zzh.zzaQ().zza(zzmw.b, zzmw.d.zzCI, zzmw.k.zzzv);
                return;
            }
        }
    }

    protected boolean zzas()
    {
        Window window;
        if (zzmw.b instanceof Activity)
        {
            if ((window = ((Activity)zzmw.b).getWindow()) != null && window.getDecorView() != null)
            {
                Rect rect = new Rect();
                Rect rect1 = new Rect();
                window.getDecorView().getGlobalVisibleRect(rect, null);
                window.getDecorView().getWindowVisibleDisplayFrame(rect1);
                boolean flag;
                if (rect.bottom != 0 && rect1.bottom != 0 && rect.top == rect1.top)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public boolean zzaz()
    {
        boolean flag = true;
        if (!zzh.zzaQ().zza(zzmw.b.getPackageManager(), zzmw.b.getPackageName(), "android.permission.INTERNET"))
        {
            if (!zzmw.j.zzpY)
            {
                com.google.android.gms.ads.internal.client.zzj.zzbJ().zza(zzmw.g, zzmw.j, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            flag = false;
        }
        if (!zzh.zzaQ().zzv(zzmw.b))
        {
            if (!zzmw.j.zzpY)
            {
                com.google.android.gms.ads.internal.client.zzj.zzbJ().zza(zzmw.g, zzmw.j, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            flag = false;
        }
        if (!flag && zzmw.g != null)
        {
            zzmw.g.setVisibility(0);
        }
        return flag;
    }

    public ArrayList zzb(List list)
    {
        String s = zzmw.k.zzzm;
        int i = com.google.android.gms.ads.internal.zzf.zzl(zzmw.b).zzaJ();
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(zza((String)list.next(), s, i))) { }
        return arraylist;
    }

    public void zzb(View view)
    {
        zzmw.w = view;
        zza(new zzfa(zzmw.l, null, null, null, null, null, null));
    }

    public void zzb(AdRequestParcel adrequestparcel)
    {
        android.view.ViewParent viewparent = zzmw.g.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && zzh.zzaQ().zzeZ() && !zzmA)
        {
            zza(adrequestparcel);
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzal("Ad is not visible. Not refreshing ad.");
            zzmx.zzc(adrequestparcel);
            return;
        }
    }

    protected void zzc(View view)
    {
        zzmw.g.addView(view, zzh.zzaS().zzfh());
    }

    public void zzd(boolean flag)
    {
        zzmw.z = flag;
    }
}
