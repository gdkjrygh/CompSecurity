// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal:
//            zzac, zzat, zzct, zzcw, 
//            zzcy, zzdl, zzeh, zzep, 
//            zzes, zzfk, zzhi, zzv, 
//            zzca, zzab, zzho, zzhg, 
//            zzaa, zzba, zzhf, zzz, 
//            zzbl, zzey, zzhx, zzie, 
//            zzic, zzbx, zzid, zzbh, 
//            zzhe, zzcl, zzcq, zzcm, 
//            zzcr, zzds, zzhy, zzdk, 
//            zzdp, zzdj, zzae, zzbk, 
//            zzhp, zzbg, zzaf, zzx, 
//            zzeo, zzem, zzan, zzak, 
//            zzfl, zzfd, zzcf, zzgq, 
//            zzu, zzcg, zzcj, zzgc, 
//            zzhs, zzdm, zzhj, zzcc, 
//            zzfe, zzbe, zzhw, zzfs, 
//            zzfb, zzfj, zzfo, zzfh, 
//            zzax, zzgj, zzce, zzdr, 
//            zzfg, zzk, zzw, zzhl, 
//            zzel

public class zzt extends zzbi.zza
    implements zzac, zzat, zzct, zzcw, zzcy, zzdl, zzeh, zzep, zzes, zzfk, zzgc.zza, zzgj.zza, zzhi, zzv
{
    public static final class zza extends ViewSwitcher
    {

        private final zzhs zzlL;

        static zzhs zza(zza zza1)
        {
            return zza1.zzlL;
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            zzlL.zzc(motionevent);
            return false;
        }

        public final void removeAllViews()
        {
            for (int i = 0; i < getChildCount(); i++)
            {
                View view = getChildAt(i);
                if (view != null && (view instanceof zzic))
                {
                    ((zzic)view).destroy();
                }
            }

            super.removeAllViews();
        }

        public zza(Context context)
        {
            super(context);
            zzlL = new zzhs(context);
        }
    }

    static class zzb
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        public final String zzlM;
        public final Context zzlN;
        public final zzk zzlO;
        public final zzhy zzlP;
        public zzhl zzlQ;
        public zzbg zzlR;
        public zza zzlS;
        public zzbh zzlT;
        public zzhl zzlU;
        public zzba zzlV;
        public zzhe zzlW;
        public zzhe.zza zzlX;
        public zzhf zzlY;
        public zzbk zzlZ;
        public zzfs zzma;
        public zzfo zzmb;
        public zzcq zzmc;
        public zzcr zzmd;
        public zzcj zzme;
        public List zzmf;
        public zzfl zzmg;
        public zzhj zzmh;
        public View zzmi;
        public int zzmj;
        public boolean zzmk;
        public boolean zzml;
        public zzbl zzmm;
        private HashSet zzmn;
        private int zzmo;
        private int zzmp;

        public void destroy()
        {
            zzlT = null;
            zzlZ = null;
            zzma = null;
            zzmb = null;
            zzme = null;
            zzmm = null;
            if (zzlN != null && (zzlN instanceof Activity) && zzlS != null)
            {
                com.google.android.gms.internal.zzab.zzaO().zzb((Activity)zzlN, this);
            }
            zzf(false);
            if (zzlS != null)
            {
                zzlS.removeAllViews();
            }
            zzay();
            zzaA();
            zzlW = null;
        }

        public void onGlobalLayout()
        {
            if (zzlS != null && zzlW != null && zzlW.zzuq != null && zzlW.zzuq.zzeG().zzba())
            {
                int ai[] = new int[2];
                zzlS.getLocationOnScreen(ai);
                int i = zzbe.zzbD().zzc(zzlN, ai[0]);
                int j = zzbe.zzbD().zzc(zzlN, ai[1]);
                if (i != zzmo || j != zzmp)
                {
                    zzmo = i;
                    zzmp = j;
                    zzlW.zzuq.zzeG().zzb(zzmo, zzmp);
                    return;
                }
            }
        }

        public void zza(HashSet hashset)
        {
            zzmn = hashset;
        }

        public void zzaA()
        {
            if (zzlW == null || zzlW.zzsM == null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            zzlW.zzsM.destroy();
            return;
            RemoteException remoteexception;
            remoteexception;
            zzhx.zzac("Could not destroy mediation adapter.");
            return;
        }

        public HashSet zzax()
        {
            return zzmn;
        }

        public void zzay()
        {
            if (zzlW != null && zzlW.zzuq != null)
            {
                zzlW.zzuq.destroy();
            }
        }

        public void zzaz()
        {
            if (zzlW != null && zzlW.zzuq != null)
            {
                zzlW.zzuq.stopLoading();
            }
        }

        public void zzf(boolean flag)
        {
            if (zzmj == 0)
            {
                zzaz();
            }
            if (zzlQ != null)
            {
                zzlQ.cancel();
            }
            if (zzlU != null)
            {
                zzlU.cancel();
            }
            if (flag)
            {
                zzlW = null;
            }
        }

        public zzb(Context context, zzba zzba1, String s, zzhy zzhy1)
        {
            this(context, zzba1, s, zzhy1, null);
        }

        zzb(Context context, zzba zzba1, String s, zzhy zzhy1, zzk zzk1)
        {
            zzmh = null;
            zzmi = null;
            zzmj = 0;
            zzmk = false;
            zzml = false;
            zzmn = null;
            zzmo = -1;
            zzmp = -1;
            if (zzba1.zzpb)
            {
                zzlS = null;
            } else
            {
                zzlS = new zza(context);
                zzlS.setMinimumWidth(zzba1.widthPixels);
                zzlS.setMinimumHeight(zzba1.heightPixels);
                zzlS.setVisibility(4);
            }
            if (context != null && (context instanceof Activity) && zzlS != null)
            {
                com.google.android.gms.internal.zzab.zzaM().zza((Activity)context, this);
            }
            zzlV = zzba1;
            zzlM = s;
            zzlN = context;
            zzlP = zzhy1;
            if (zzk1 == null)
            {
                zzk1 = new zzk(new zzw(this));
            }
            zzlO = zzk1;
        }
    }


    private zzce zzlA;
    private zzce zzlB;
    private zzax zzlC;
    private final zzdr zzlD;
    private final zzb zzlE;
    private final zzaa zzlF;
    private final zzae zzlG;
    private boolean zzlH;
    private zzcf zzlz;

    public zzt(Context context, zzba zzba1, String s, zzdr zzdr, zzhy zzhy1)
    {
        this(new zzb(context, zzba1, s, zzhy1), zzdr, null);
    }

    zzt(zzb zzb1, zzdr zzdr, zzaa zzaa1)
    {
        zzca.zzl(zzb1.zzlN);
        zzlE = zzb1;
        zzlD = zzdr;
        if (zzaa1 == null)
        {
            zzaa1 = new zzaa(this);
        }
        zzlF = zzaa1;
        com.google.android.gms.internal.zzab.zzaM().zzu(zzlE.zzlN);
        com.google.android.gms.internal.zzab.zzaP().zzb(zzlE.zzlN, zzlE.zzlP);
        zzlG = com.google.android.gms.internal.zzab.zzaP().zzel();
    }

    private zzgo.zza zza(zzax zzax1, Bundle bundle)
    {
        ApplicationInfo applicationinfo = zzlE.zzlN.getApplicationInfo();
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
            packageinfo = zzlE.zzlN.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        displaymetrics = zzlE.zzlN.getResources().getDisplayMetrics();
        s = null;
        obj = s;
        if (!zzlE.zzlV.zzpb)
        {
            obj = s;
            if (zzlE.zzlS.getParent() != null)
            {
                obj = new int[2];
                zzlE.zzlS.getLocationOnScreen(((int []) (obj)));
                int k = obj[0];
                int l = obj[1];
                int i1 = zzlE.zzlS.getWidth();
                int j1 = zzlE.zzlS.getHeight();
                boolean flag = false;
                int i = ((flag) ? 1 : 0);
                if (zzlE.zzlS.isShown())
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
        s = com.google.android.gms.internal.zzab.zzaP().zzee();
        zzlE.zzlY = new zzhf(s, zzlE.zzlM);
        zzlE.zzlY.zze(zzax1);
        s1 = com.google.android.gms.internal.zzab.zzaM().zza(zzlE.zzlN, zzlE.zzlS, zzlE.zzlV);
        j = zzz.zzj(zzlE.zzlN).zzaF();
        flag1 = zzz.zzj(zzlE.zzlN).isInitialized();
        l2 = 0L;
        l1 = l2;
        if (zzlE.zzmm != null)
        {
            try
            {
                l1 = zzlE.zzmm.getValue();
            }
            catch (RemoteException remoteexception)
            {
                zzhx.zzac("Cannot get correlation id, default to 0.");
                l1 = l2;
            }
        }
        s2 = UUID.randomUUID().toString();
        bundle1 = com.google.android.gms.internal.zzab.zzaP().zza(zzlE.zzlN, this, s);
        return new zzgo.zza(((Bundle) (obj)), zzax1, zzlE.zzlV, zzlE.zzlM, applicationinfo, packageinfo, s, com.google.android.gms.internal.zzab.zzaP().getSessionId(), zzlE.zzlP, bundle1, zzlE.zzmf, bundle, com.google.android.gms.internal.zzab.zzaP().zzei(), new Messenger(new zzey(zzlE.zzlN)), displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.density, s1, flag1, j, l1, s2);
    }

    private zzic zza(zzu zzu1)
    {
        Object obj;
        if (zzlE.zzlV.zzpb)
        {
            zzic zzic1 = com.google.android.gms.internal.zzab.zzaN().zza(zzlE.zzlN, zzlE.zzlV, false, false, zzlE.zzlO, zzlE.zzlP);
            zzic1.zzeG().zzb(this, null, this, this, ((Boolean)zzca.zzqJ.get()).booleanValue(), this, this, zzu1, null);
            return zzic1;
        }
        obj = zzlE.zzlS.getNextView();
        if (!(obj instanceof zzic)) goto _L2; else goto _L1
_L1:
        obj = (zzic)obj;
        ((zzic) (obj)).zza(zzlE.zzlN, zzlE.zzlV);
_L4:
        ((zzic) (obj)).zzeG().zzb(this, this, this, this, false, this, null, zzu1, this);
        return ((zzic) (obj));
_L2:
        if (obj != null)
        {
            zzlE.zzlS.removeView(((View) (obj)));
        }
        zzic zzic2 = com.google.android.gms.internal.zzab.zzaN().zza(zzlE.zzlN, zzlE.zzlV, false, false, zzlE.zzlO, zzlE.zzlP);
        obj = zzic2;
        if (zzlE.zzlV.zzpc == null)
        {
            zzc(zzic2.getWebView());
            obj = zzic2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static zzb zza(zzt zzt1)
    {
        return zzt1.zzlE;
    }

    private void zza(int i)
    {
        zzhx.zzac((new StringBuilder("Failed to load ad: ")).append(i).toString());
        if (zzlE.zzlT == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        zzlE.zzlT.onAdFailedToLoad(i);
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.zzhx.zzd("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void zzap()
    {
        zzhx.zzaa("Ad closing.");
        if (zzlE.zzlT == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzlE.zzlT.onAdClosed();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.zzhx.zzd("Could not call AdListener.onAdClosed().", remoteexception);
        return;
    }

    private void zzaq()
    {
        zzhx.zzaa("Ad leaving application.");
        if (zzlE.zzlT == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzlE.zzlT.onAdLeftApplication();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.zzhx.zzd("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    private void zzar()
    {
        zzhx.zzaa("Ad opening.");
        if (zzlE.zzlT == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzlE.zzlT.onAdOpened();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.zzhx.zzd("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    private void zzas()
    {
        zzhx.zzaa("Ad finished loading.");
        if (zzlE.zzlT == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzlE.zzlT.onAdLoaded();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.zzhx.zzd("Could not call AdListener.onAdLoaded().", remoteexception);
        return;
    }

    private void zzat()
    {
        try
        {
            if ((zzlE.zzlW.zzyx instanceof zzcl) && zzlE.zzmc != null)
            {
                zzlE.zzmc.zza((zzcl)zzlE.zzlW.zzyx);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.zzhx.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
        }
    }

    private void zzau()
    {
        try
        {
            if ((zzlE.zzlW.zzyx instanceof zzcm) && zzlE.zzmd != null)
            {
                zzlE.zzmd.zza((zzcm)zzlE.zzlW.zzyx);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.zzhx.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
        }
    }

    private void zzaw()
    {
        if (zzlE.zzmj == 0)
        {
            zzlE.zzay();
            zzlE.zzlW = null;
            zzlE.zzml = false;
        }
    }

    private boolean zzb(zzhe zzhe1)
    {
        if (zzhe1.zzwI)
        {
            View view;
            try
            {
                zzhe1 = (View)com.google.android.gms.dynamic.zze.zzf(zzhe1.zzsM.getView());
            }
            // Misplaced declaration of an exception variable
            catch (zzhe zzhe1)
            {
                com.google.android.gms.internal.zzhx.zzd("Could not get View from mediation adapter.", zzhe1);
                return false;
            }
            view = zzlE.zzlS.getNextView();
            if (view != null)
            {
                if (view instanceof zzic)
                {
                    ((zzic)view).destroy();
                }
                zzlE.zzlS.removeView(view);
            }
            try
            {
                zzc(zzhe1);
            }
            // Misplaced declaration of an exception variable
            catch (zzhe zzhe1)
            {
                com.google.android.gms.internal.zzhx.zzd("Could not add mediation view to view hierarchy.", zzhe1);
                return false;
            }
        } else
        if (zzhe1.zzyu != null)
        {
            zzhe1.zzuq.zza(zzhe1.zzyu);
            zzlE.zzlS.removeAllViews();
            zzlE.zzlS.setMinimumWidth(zzhe1.zzyu.widthPixels);
            zzlE.zzlS.setMinimumHeight(zzhe1.zzyu.heightPixels);
            zzc(zzhe1.zzuq.getWebView());
        }
        if (zzlE.zzlS.getChildCount() > 1)
        {
            zzlE.zzlS.showNext();
        }
        if (zzlE.zzlW != null)
        {
            zzhe1 = zzlE.zzlS.getNextView();
            if (zzhe1 instanceof zzic)
            {
                ((zzic)zzhe1).zza(zzlE.zzlN, zzlE.zzlV);
            } else
            if (zzhe1 != null)
            {
                zzlE.zzlS.removeView(zzhe1);
            }
            zzlE.zzaA();
        }
        zzlE.zzlS.setVisibility(0);
        return true;
    }

    private void zze(boolean flag)
    {
        if (zzlE.zzlW == null)
        {
            zzhx.zzac("Ad state was null when trying to ping impression URLs.");
        } else
        {
            zzhx.zzY("Pinging Impression URLs.");
            zzlE.zzlY.zzdX();
            if (zzlE.zzlW.zzsu != null)
            {
                com.google.android.gms.internal.zzab.zzaM().zza(zzlE.zzlN, zzlE.zzlP.zzzH, zzb(zzlE.zzlW.zzsu));
            }
            if (zzlE.zzlW.zzyt != null && zzlE.zzlW.zzyt.zzsu != null)
            {
                com.google.android.gms.internal.zzab.zzaV().zza(zzlE.zzlN, zzlE.zzlP.zzzH, zzlE.zzlW, zzlE.zzlM, flag, zzb(zzlE.zzlW.zzyt.zzsu));
            }
            if (zzlE.zzlW.zzsL != null && zzlE.zzlW.zzsL.zzsp != null)
            {
                com.google.android.gms.internal.zzab.zzaV().zza(zzlE.zzlN, zzlE.zzlP.zzzH, zzlE.zzlW, zzlE.zzlM, flag, zzlE.zzlW.zzsL.zzsp);
                return;
            }
        }
    }

    public void destroy()
    {
        zzx.zzbd("destroy must be called on the main UI thread.");
        zzlF.cancel();
        zzlG.zze(zzlE.zzlW);
        zzlE.destroy();
    }

    public String getMediationAdapterClassName()
    {
        if (zzlE.zzlW != null)
        {
            return zzlE.zzlW.zzsN;
        } else
        {
            return null;
        }
    }

    public boolean isReady()
    {
        zzx.zzbd("isLoaded must be called on the main UI thread.");
        return zzlE.zzlQ == null && zzlE.zzlU == null && zzlE.zzlW != null;
    }

    public void onAdClicked()
    {
        recordClick();
    }

    public void onAppEvent(String s, String s1)
    {
        if (zzlE.zzlZ == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        zzlE.zzlZ.onAppEvent(s, s1);
        return;
        s;
        com.google.android.gms.internal.zzhx.zzd("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        zzx.zzbd("pause must be called on the main UI thread.");
        if (zzlE.zzlW != null && zzlE.zzmj == 0)
        {
            com.google.android.gms.internal.zzab.zzaO().zza(zzlE.zzlW.zzuq.getWebView());
        }
        if (zzlE.zzlW != null && zzlE.zzlW.zzsM != null)
        {
            try
            {
                zzlE.zzlW.zzsM.pause();
            }
            catch (RemoteException remoteexception)
            {
                zzhx.zzac("Could not pause mediation adapter.");
            }
        }
        zzlG.zzf(zzlE.zzlW);
        zzlF.pause();
    }

    public void recordClick()
    {
        if (zzlE.zzlW == null)
        {
            zzhx.zzac("Ad state was null when trying to ping click URLs.");
        } else
        {
            zzhx.zzY("Pinging click URLs.");
            zzlE.zzlY.zzdY();
            if (zzlE.zzlW.zzst != null)
            {
                com.google.android.gms.internal.zzab.zzaM().zza(zzlE.zzlN, zzlE.zzlP.zzzH, zzb(zzlE.zzlW.zzst));
            }
            if (zzlE.zzlW.zzyt != null && zzlE.zzlW.zzyt.zzst != null)
            {
                com.google.android.gms.internal.zzab.zzaV().zza(zzlE.zzlN, zzlE.zzlP.zzzH, zzlE.zzlW, zzlE.zzlM, false, zzb(zzlE.zzlW.zzyt.zzst));
            }
            if (zzlE.zzlR != null)
            {
                try
                {
                    zzlE.zzlR.onAdClicked();
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.internal.zzhx.zzd("Could not notify onAdClicked event.", remoteexception);
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
        zzx.zzbd("resume must be called on the main UI thread.");
        if (zzlE.zzlW != null && zzlE.zzmj == 0)
        {
            com.google.android.gms.internal.zzab.zzaO().zzb(zzlE.zzlW.zzuq.getWebView());
        }
        if (zzlE.zzlW != null && zzlE.zzlW.zzsM != null)
        {
            try
            {
                zzlE.zzlW.zzsM.resume();
            }
            catch (RemoteException remoteexception)
            {
                zzhx.zzac("Could not resume mediation adapter.");
            }
        }
        zzlF.resume();
        zzlG.zzg(zzlE.zzlW);
    }

    public void showInterstitial()
    {
        zzx.zzbd("showInterstitial must be called on the main UI thread.");
        if (!zzlE.zzlV.zzpb)
        {
            zzhx.zzac("Cannot call showInterstitial on a banner ad.");
        } else
        {
            if (zzlE.zzlW == null)
            {
                zzhx.zzac("The interstitial has not loaded.");
                return;
            }
            if (zzlE.zzmj != 1)
            {
                if (zzlE.zzlW.zzuq.zzeK())
                {
                    zzhx.zzac("The interstitial is already showing.");
                    return;
                }
                zzlE.zzlW.zzuq.zzA(true);
                if (zzlE.zzlW.zzuq.zzeG().zzba() || zzlE.zzlW.zzys != null)
                {
                    zzaf zzaf1 = zzlG.zza(zzlE.zzlV, zzlE.zzlW);
                    if (zzlE.zzlW.zzuq.zzeG().zzba() && zzaf1 != null)
                    {
                        zzaf1.zza(this);
                    }
                }
                if (zzlE.zzlW.zzwI)
                {
                    try
                    {
                        zzlE.zzlW.zzsM.showInterstitial();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        com.google.android.gms.internal.zzhx.zzd("Could not show interstitial.", remoteexception);
                    }
                    zzaw();
                    return;
                }
                Object obj = new com.google.android.gms.internal.zzx(zzlE.zzml, zzao());
                int j = zzlE.zzlW.zzuq.getRequestedOrientation();
                int i = j;
                if (j == -1)
                {
                    i = zzlE.zzlW.orientation;
                }
                obj = new zzeo(this, this, this, zzlE.zzlW.zzuq, i, zzlE.zzlP, zzlE.zzlW.zzwN, ((com.google.android.gms.internal.zzx) (obj)));
                com.google.android.gms.internal.zzab.zzaK().zza(zzlE.zzlN, ((zzeo) (obj)));
                return;
            }
        }
    }

    public void stopLoading()
    {
        zzx.zzbd("stopLoading must be called on the main UI thread.");
        zzlE.zzf(true);
    }

    Bundle zza(zzan zzan1)
    {
        if (zzan1 != null)
        {
            if (zzan1.zzbx())
            {
                zzan1.wakeup();
            }
            zzak zzak1 = zzan1.zzbv();
            if (zzak1 != null)
            {
                zzan1 = zzak1.zzbm();
                zzhx.zzY((new StringBuilder("In AdManger: loadAd, ")).append(zzak1.toString()).toString());
            } else
            {
                zzan1 = null;
            }
            if (zzan1 != null)
            {
                Bundle bundle = new Bundle(1);
                bundle.putString("fingerprint", zzan1);
                bundle.putInt("v", 1);
                return bundle;
            }
        }
        return null;
    }

    public String zza(String s, String s1, int i)
    {
        String s2 = s;
        if (((Boolean)zzca.zzqL.get()).booleanValue())
        {
            s2 = s;
            if (zzz.zzj(zzlE.zzlN).isInitialized())
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
        zzar();
    }

    public void zza(zzaf zzaf1, boolean flag)
    {
        if (zzlE.zzlW != null && zzlE.zzlW.zzuq != null)
        {
            HashMap hashmap = new HashMap();
            if (flag)
            {
                zzaf1 = "1";
            } else
            {
                zzaf1 = "0";
            }
            hashmap.put("isVisible", zzaf1);
            zzlE.zzlW.zzuq.zzb("onAdVisibilityChanged", hashmap);
        }
    }

    public void zza(zzba zzba1)
    {
        zzx.zzbd("setAdSize must be called on the main UI thread.");
        zzlE.zzlV = zzba1;
        if (zzlE.zzlW != null && zzlE.zzmj == 0)
        {
            zzlE.zzlW.zzuq.zza(zzba1);
        }
        if (zzlE.zzlS.getChildCount() > 1)
        {
            zzlE.zzlS.removeView(zzlE.zzlS.getNextView());
        }
        zzlE.zzlS.setMinimumWidth(zzba1.widthPixels);
        zzlE.zzlS.setMinimumHeight(zzba1.heightPixels);
        zzlE.zzlS.requestLayout();
    }

    public void zza(zzbg zzbg1)
    {
        zzx.zzbd("setAdListener must be called on the main UI thread.");
        zzlE.zzlR = zzbg1;
    }

    public void zza(zzbh zzbh1)
    {
        zzx.zzbd("setAdListener must be called on the main UI thread.");
        zzlE.zzlT = zzbh1;
    }

    public void zza(zzbk zzbk1)
    {
        zzx.zzbd("setAppEventListener must be called on the main UI thread.");
        zzlE.zzlZ = zzbk1;
    }

    public void zza(zzbl zzbl1)
    {
        zzx.zzbd("setCorrelationIdProvider must be called on the main UI thread");
        zzlE.zzmm = zzbl1;
    }

    public void zza(zzcj zzcj1)
    {
        zzx.zzbd("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        zzlE.zzme = zzcj1;
    }

    public void zza(zzfo zzfo1)
    {
        zzx.zzbd("setInAppPurchaseListener must be called on the main UI thread.");
        zzlE.zzmb = zzfo1;
    }

    public void zza(zzfs zzfs1, String s)
    {
        zzx.zzbd("setPlayStorePurchaseParams must be called on the main UI thread.");
        zzlE.zzmg = new zzfl(s);
        zzlE.zzma = zzfs1;
        if (!com.google.android.gms.internal.zzab.zzaP().zzeh() && zzfs1 != null)
        {
            (new zzfd(zzlE.zzlN, zzlE.zzma, zzlE.zzmg)).start();
        }
    }

    public void zza(zzhe.zza zza1)
    {
        Object obj = null;
        zzlz.zza(zzlA, new String[] {
            "arf"
        });
        zzlB = zzlz.zzcq();
        zzlE.zzlQ = null;
        zzlE.zzlX = zza1;
        zza(((List) (null)));
        zzic zzic1;
        if (!zza1.zzyz.zzwS)
        {
            zzu zzu1 = new zzu();
            zzic1 = zza(zzu1);
            zzu1.zza(new zzu.zzb(zza1, zzic1));
            zzic1.setOnTouchListener(new android.view.View.OnTouchListener(zzu1) {

                final zzu zzlI;
                final zzt zzlJ;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    zzlI.recordClick();
                    return false;
                }

            
            {
                zzlJ = zzt.this;
                zzlI = zzu1;
                super();
            }
            });
            zzic1.setOnClickListener(new android.view.View.OnClickListener(zzu1) {

                final zzu zzlI;
                final zzt zzlJ;

                public void onClick(View view)
                {
                    zzlI.recordClick();
                }

            
            {
                zzlJ = zzt.this;
                zzlI = zzu1;
                super();
            }
            });
        } else
        {
            zzic1 = null;
        }
        if (zza1.zzlV != null)
        {
            zzlE.zzlV = zza1.zzlV;
        }
        if (zza1.errorCode != -2)
        {
            zza(new zzhe(zza1, zzic1, null, null, null, null, null));
            return;
        }
        if (!zza1.zzyz.zzwI && zza1.zzyz.zzwR)
        {
            if (zza1.zzyz.zzus != null)
            {
                obj = Uri.parse(zza1.zzyz.zzus).buildUpon().query(null).build().toString();
            }
            obj = new zzcg(this, ((String) (obj)), zza1.zzyz.zzwG);
            try
            {
                if (zzlE.zzme != null)
                {
                    zzlE.zzmj = 1;
                    zzlE.zzme.zza(((zzci) (obj)));
                    return;
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.internal.zzhx.zzd("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
            }
        }
        zzlE.zzmj = 0;
        zzlE.zzlU = com.google.android.gms.internal.zzab.zzaL().zza(zzlE.zzlN, this, zza1, zzic1, zzlD, this);
        zzhx.zzY((new StringBuilder("AdRenderer: ")).append(zzlE.zzlU.getClass().getName()).toString());
    }

    public void zza(zzhe zzhe1)
    {
        zzlz.zza(zzlB, new String[] {
            "awr"
        });
        zzlz.zza(zzlA, new String[] {
            "ttc"
        });
        zzlE.zzlU = null;
        boolean flag;
        if (zzhe1.zzyx != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (zzhe1.errorCode != -2 && zzhe1.errorCode != 3)
        {
            com.google.android.gms.internal.zzab.zzaP().zzb(zzlE.zzax());
        }
        if (zzhe1.errorCode != -1)
        {
            if (zza(zzhe1, flag))
            {
                zzhx.zzY("Ad refresh scheduled.");
            }
            if (zzhe1.errorCode == 3 && zzhe1.zzyt != null && zzhe1.zzyt.zzsv != null)
            {
                zzhx.zzY("Pinging no fill URLs.");
                com.google.android.gms.internal.zzab.zzaV().zza(zzlE.zzlN, zzlE.zzlP.zzzH, zzhe1, zzlE.zzlM, false, zzhe1.zzyt.zzsv);
            }
            if (zzhe1.errorCode != -2)
            {
                zza(zzhe1.errorCode);
                return;
            }
            if (!zzlE.zzlV.zzpb && !flag && zzlE.zzmj == 0)
            {
                if (!zzb(zzhe1))
                {
                    zza(0);
                    return;
                }
                if (zzlE.zzlS != null)
                {
                    zza.zza(zzlE.zzlS).zzV(zzhe1.zzwN);
                }
            }
            if (zzlE.zzlW != null && zzlE.zzlW.zzsO != null)
            {
                zzlE.zzlW.zzsO.zza(null);
            }
            if (zzhe1.zzsO != null)
            {
                zzhe1.zzsO.zza(this);
            }
            zzlG.zzd(zzlE.zzlW);
            zzlE.zzlW = zzhe1;
            zzlE.zzlY.zzj(zzhe1.zzyv);
            zzlE.zzlY.zzk(zzhe1.zzyw);
            zzlE.zzlY.zzx(zzlE.zzlV.zzpb);
            zzlE.zzlY.zzy(zzhe1.zzwI);
            if (!zzlE.zzlV.zzpb && !flag && zzlE.zzmj == 0)
            {
                zze(false);
            }
            if (zzlE.zzmh == null)
            {
                zzlE.zzmh = new zzhj(zzlE.zzlM);
            }
            int i;
            int j;
            if (zzhe1.zzyt != null)
            {
                j = zzhe1.zzyt.zzsy;
                i = zzhe1.zzyt.zzsz;
            } else
            {
                i = 0;
                j = 0;
            }
            zzlE.zzmh.zzg(j, i);
            if (zzlE.zzmj == 0)
            {
                if (!zzlE.zzlV.zzpb && zzhe1.zzuq != null && (zzhe1.zzuq.zzeG().zzba() || zzhe1.zzys != null))
                {
                    zzaf zzaf1 = zzlG.zza(zzlE.zzlV, zzlE.zzlW);
                    if (zzhe1.zzuq.zzeG().zzba() && zzaf1 != null)
                    {
                        zzaf1.zza(this);
                    }
                }
                if (zzlE.zzlW.zzuq != null)
                {
                    zzlE.zzlW.zzuq.zzeG().zzeR();
                }
                if (flag)
                {
                    zzhe1 = zzhe1.zzyx;
                    if ((zzhe1 instanceof zzcm) && zzlE.zzmd != null)
                    {
                        zzau();
                    } else
                    if ((zzhe1 instanceof zzcl) && zzlE.zzmc != null)
                    {
                        zzat();
                    } else
                    {
                        zzhx.zzac("No matching listener for retrieved native ad template.");
                        zza(0);
                        return;
                    }
                }
                zzas();
            } else
            if (zzlE.zzmi != null && zzhe1.zzys != null)
            {
                zzlG.zza(zzlE.zzlV, zzlE.zzlW, zzlE.zzmi);
            }
            if (com.google.android.gms.internal.zzab.zzaP().zzeg() != null)
            {
                com.google.android.gms.internal.zzab.zzaP().zzeg().zza(zzlz);
                return;
            }
        }
    }

    public void zza(String s, ArrayList arraylist)
    {
        arraylist = new zzfe(s, arraylist, zzlE.zzlN, zzlE.zzlP.zzzH);
        if (zzlE.zzmb == null)
        {
            zzhx.zzac("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!zzbe.zzbD().zzA(zzlE.zzlN))
            {
                zzhx.zzac("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (zzlE.zzma == null)
            {
                zzhx.zzac("PlayStorePurchaseListener is not set.");
                return;
            }
            if (zzlE.zzmg == null)
            {
                zzhx.zzac("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (zzlE.zzmk)
            {
                zzhx.zzac("An in-app purchase request is already in progress, abort");
                return;
            }
            zzlE.zzmk = true;
            try
            {
                if (!zzlE.zzma.isValidPurchase(s))
                {
                    zzlE.zzmk = false;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zzhx.zzac("Could not start In-App purchase.");
                zzlE.zzmk = false;
                return;
            }
            com.google.android.gms.internal.zzab.zzaU().zza(zzlE.zzlN, zzlE.zzlP.zzzK, new zzfb(zzlE.zzlN, zzlE.zzmg, arraylist, this));
            return;
        }
        try
        {
            zzlE.zzmb.zza(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzhx.zzac("Could not start In-App purchase.");
        }
    }

    public void zza(String s, boolean flag, int i, Intent intent, zzfg zzfg)
    {
        try
        {
            if (zzlE.zzma != null)
            {
                zzlE.zzma.zza(new zzfh(zzlE.zzlN, s, flag, i, intent, zzfg));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzhx.zzac("Fail to invoke PlayStorePurchaseListener.");
        }
        zzhw.zzzG.postDelayed(new Runnable(intent) {

            final zzt zzlJ;
            final Intent zzlK;

            public void run()
            {
                int j = com.google.android.gms.internal.zzab.zzaU().zzd(zzlK);
                com.google.android.gms.internal.zzab.zzaU();
                if (j == 0 && zzt.zza(zzlJ).zzlW != null && zzt.zza(zzlJ).zzlW.zzuq != null && zzt.zza(zzlJ).zzlW.zzuq.zzeF() != null)
                {
                    zzt.zza(zzlJ).zzlW.zzuq.zzeF().close();
                }
                zzt.zza(zzlJ).zzmk = false;
            }

            
            {
                zzlJ = zzt.this;
                zzlK = intent;
                super();
            }
        }, 500L);
    }

    public void zza(HashSet hashset)
    {
        zzlE.zza(hashset);
    }

    public void zza(List list)
    {
        zzx.zzbd("setNativeTemplates must be called on the main UI thread.");
        zzlE.zzmf = list;
    }

    public boolean zza(zzax zzax1)
    {
        zzx.zzbd("loadAd must be called on the main UI thread.");
        if (zzlE.zzlQ != null || zzlE.zzlU != null)
        {
            if (zzlC != null)
            {
                zzhx.zzac("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            zzlC = zzax1;
        } else
        {
            if (zzlE.zzlV.zzpb && zzlE.zzlW != null)
            {
                zzhx.zzac("An interstitial is already loading. Aborting.");
                return false;
            }
            if (zzav())
            {
                zzhx.zzaa("Starting ad request.");
                zzab();
                zzlA = zzlz.zzcq();
                if (!zzax1.zzoO)
                {
                    zzhx.zzaa((new StringBuilder("Use AdRequest.Builder.addTestDevice(\"")).append(zzbe.zzbD().zzz(zzlE.zzlN)).append("\") to get test ads on this device.").toString());
                }
                Bundle bundle = zza(com.google.android.gms.internal.zzab.zzaP().zzo(zzlE.zzlN));
                zzlF.cancel();
                zzlE.zzmj = 0;
                zzax1 = zza(zzax1, bundle);
                zzlE.zzlQ = com.google.android.gms.internal.zzab.zzaI().zza(zzlE.zzlN, zzax1, zzlE.zzlO, this);
                return true;
            }
        }
        return false;
    }

    boolean zza(zzhe zzhe1, boolean flag)
    {
        boolean flag1 = false;
        zzax zzax1;
        if (zzlC != null)
        {
            zzax1 = zzlC;
            zzlC = null;
        } else
        {
            zzax zzax2 = zzhe1.zzwn;
            zzax1 = zzax2;
            if (zzax2.extras != null)
            {
                flag1 = zzax2.extras.getBoolean("_noRefresh", false);
                zzax1 = zzax2;
            }
        }
        if (zzlE.zzlV.zzpb)
        {
            if (zzlE.zzmj == 0)
            {
                com.google.android.gms.internal.zzab.zzaO().zza(zzhe1.zzuq.getWebView());
            }
        } else
        if (!(flag1 | flag) && zzlE.zzmj == 0)
        {
            if (zzhe1.zzsx > 0L)
            {
                zzlF.zza(zzax1, zzhe1.zzsx);
            } else
            if (zzhe1.zzyt != null && zzhe1.zzyt.zzsx > 0L)
            {
                zzlF.zza(zzax1, zzhe1.zzyt.zzsx);
            } else
            if (!zzhe1.zzwI && zzhe1.errorCode == 2)
            {
                zzlF.zzc(zzax1);
            }
        }
        return zzlF.zzaG();
    }

    void zzab()
    {
        zzlz = new zzcf("load_ad");
        zzlA = new zzce(-1L, null, null);
        zzlB = new zzce(-1L, null, null);
    }

    public zzd zzac()
    {
        zzx.zzbd("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.zze.zzn(zzlE.zzlS);
    }

    public zzba zzad()
    {
        zzx.zzbd("getAdSize must be called on the main UI thread.");
        return zzlE.zzlV;
    }

    public void zzae()
    {
        zzaq();
    }

    public void zzaf()
    {
        zzlG.zzd(zzlE.zzlW);
        if (zzlE.zzlV.zzpb)
        {
            zzaw();
        }
        zzlH = false;
        zzap();
        zzlE.zzlY.zzdZ();
    }

    public void zzag()
    {
        if (zzlE.zzlV.zzpb)
        {
            zze(false);
        }
        zzlH = true;
        zzar();
    }

    public void zzah()
    {
        onAdClicked();
    }

    public void zzai()
    {
        zzaf();
    }

    public void zzaj()
    {
        zzae();
    }

    public void zzak()
    {
        zzag();
    }

    public void zzal()
    {
        if (zzlE.zzlW != null)
        {
            zzhx.zzac((new StringBuilder("Mediation adapter ")).append(zzlE.zzlW.zzsN).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        zze(true);
        zzas();
    }

    public void zzam()
    {
        zzap();
    }

    public void zzan()
    {
        zzx.zzbd("recordManualImpression must be called on the main UI thread.");
        if (zzlE.zzlW == null)
        {
            zzhx.zzac("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            zzhx.zzY("Pinging manual tracking URLs.");
            if (zzlE.zzlW.zzwK != null)
            {
                com.google.android.gms.internal.zzab.zzaM().zza(zzlE.zzlN, zzlE.zzlP.zzzH, zzlE.zzlW.zzwK);
                return;
            }
        }
    }

    protected boolean zzao()
    {
        if (!(zzlE.zzlN instanceof Activity))
        {
            return false;
        }
        Window window = ((Activity)zzlE.zzlN).getWindow();
        if (window == null || window.getDecorView() == null)
        {
            return false;
        }
        Rect rect = new Rect();
        Rect rect1 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect1);
        return rect.bottom != 0 && rect1.bottom != 0 && rect.top == rect1.top;
    }

    public boolean zzav()
    {
        boolean flag = true;
        if (!com.google.android.gms.internal.zzab.zzaM().zza(zzlE.zzlN.getPackageManager(), zzlE.zzlN.getPackageName(), "android.permission.INTERNET"))
        {
            if (!zzlE.zzlV.zzpb)
            {
                zzbe.zzbD().zza(zzlE.zzlS, zzlE.zzlV, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            flag = false;
        }
        if (!com.google.android.gms.internal.zzab.zzaM().zzt(zzlE.zzlN))
        {
            if (!zzlE.zzlV.zzpb)
            {
                zzbe.zzbD().zza(zzlE.zzlS, zzlE.zzlV, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            flag = false;
        }
        if (!flag && !zzlE.zzlV.zzpb)
        {
            zzlE.zzlS.setVisibility(0);
        }
        return flag;
    }

    public ArrayList zzb(List list)
    {
        String s = zzlE.zzlW.zzwD;
        int i = zzz.zzj(zzlE.zzlN).zzaF();
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(zza((String)list.next(), s, i))) { }
        return arraylist;
    }

    public void zzb(View view)
    {
        zzlE.zzmi = view;
        zza(new zzhe(zzlE.zzlX, null, null, null, null, null, null));
    }

    public void zzb(zzax zzax1)
    {
        android.view.ViewParent viewparent = zzlE.zzlS.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && com.google.android.gms.internal.zzab.zzaM().zzes() && !zzlH)
        {
            zza(zzax1);
            return;
        } else
        {
            zzhx.zzaa("Ad is not visible. Not refreshing ad.");
            zzlF.zzc(zzax1);
            return;
        }
    }

    protected void zzc(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -2);
        zzlE.zzlS.addView(view, layoutparams);
    }

    public void zzd(boolean flag)
    {
        zzlE.zzml = flag;
    }
}
