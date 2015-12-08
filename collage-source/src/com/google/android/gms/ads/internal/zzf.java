// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ht;
import com.google.android.gms.internal.y;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzq, zzp

public class zzf extends zzc
{

    private boolean zzoM;

    public zzf(Context context, AdSizeParcel adsizeparcel, String s, di di, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, di, versioninfoparcel, null);
    }

    private boolean zzb(gl gl1, gl gl2)
    {
        if (!gl2.k)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        View view;
        try
        {
            gl2 = gl2.m.a();
        }
        // Misplaced declaration of an exception variable
        catch (gl gl1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get View from mediation adapter.", gl1);
            return false;
        }
        if (gl2 != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("View in mediation adapter is null.");
        return false;
        gl2 = (View)b.a(gl2);
        view = zzos.zzqc.getNextView();
        if (view != null)
        {
            if (view instanceof hs)
            {
                ((hs)view).destroy();
            }
            zzos.zzqc.removeView(view);
        }
        try
        {
            zzb(((View) (gl2)));
        }
        // Misplaced declaration of an exception variable
        catch (gl gl1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not add mediation view to view hierarchy.", gl1);
            return false;
        }
_L1:
        if (zzos.zzqc.getChildCount() > 1)
        {
            zzos.zzqc.showNext();
        }
        if (gl1 != null)
        {
            gl1 = zzos.zzqc.getNextView();
            if (gl1 instanceof hs)
            {
                ((hs)gl1).a(zzos.context, zzos.zzqf);
            } else
            if (gl1 != null)
            {
                zzos.zzqc.removeView(gl1);
            }
            zzos.zzbO();
        }
        zzos.zzqc.setVisibility(0);
        return true;
        if (gl2.r != null && gl2.b != null)
        {
            gl2.b.a(gl2.r);
            zzos.zzqc.removeAllViews();
            zzos.zzqc.setMinimumWidth(gl2.r.widthPixels);
            zzos.zzqc.setMinimumHeight(gl2.r.heightPixels);
            zzb(((View) (gl2.b.getWebView())));
        }
          goto _L1
    }

    public void setManualImpressionsEnabled(boolean flag)
    {
        z.b("setManualImpressionsEnabled must be called from the main thread.");
        zzoM = flag;
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public boolean zza(AdRequestParcel adrequestparcel)
    {
        return super.zza(zzd(adrequestparcel));
    }

    public boolean zza(gl gl1, gl gl2)
    {
        if (!super.zza(gl1, gl2))
        {
            return false;
        }
        if (zzos.zzbP() && !zzb(gl1, gl2))
        {
            zze(0);
            return false;
        }
        zza(gl2, false);
        if (!zzos.zzbP()) goto _L2; else goto _L1
_L1:
        if (gl2.b != null)
        {
            if (gl2.j != null)
            {
                zzou.a(zzos.zzqf, gl2);
            }
            if (gl2.a())
            {
                zzou.a(zzos.zzqf, gl2).a(gl2.b);
            } else
            {
                gl2.b.i().a(new com.google.android.gms.internal.ht.b(gl2) {

                    final gl zzoN;
                    final zzf zzoO;

                    public void zzbf()
                    {
                        zzoO.zzou.a(zzoO.zzos.zzqf, zzoN).a(zzoN.b);
                    }

            
            {
                zzoO = zzf.this;
                zzoN = gl1;
                super();
            }
                });
            }
        }
_L4:
        return true;
_L2:
        if (zzos.zzqy != null && gl2.j != null)
        {
            zzou.a(zzos.zzqf, gl2, zzos.zzqy);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean zzaU()
    {
        boolean flag = true;
        if (!zzp.zzbx().a(zzos.context.getPackageManager(), zzos.context.getPackageName(), "android.permission.INTERNET"))
        {
            zzk.zzcE().zza(zzos.zzqc, zzos.zzqf, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            flag = false;
        }
        if (!zzp.zzbx().a(zzos.context))
        {
            zzk.zzcE().zza(zzos.zzqc, zzos.zzqf, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            flag = false;
        }
        if (!flag && zzos.zzqc != null)
        {
            zzos.zzqc.setVisibility(0);
        }
        return flag;
    }

    AdRequestParcel zzd(AdRequestParcel adrequestparcel)
    {
        if (adrequestparcel.zzsv == zzoM)
        {
            return adrequestparcel;
        }
        int i = adrequestparcel.versionCode;
        long l = adrequestparcel.zzsq;
        android.os.Bundle bundle = adrequestparcel.extras;
        int j = adrequestparcel.zzsr;
        java.util.List list = adrequestparcel.zzss;
        boolean flag1 = adrequestparcel.zzst;
        int k = adrequestparcel.zzsu;
        boolean flag;
        if (adrequestparcel.zzsv || zzoM)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new AdRequestParcel(i, l, bundle, j, list, flag1, k, flag, adrequestparcel.zzsw, adrequestparcel.zzsx, adrequestparcel.zzsy, adrequestparcel.zzsz, adrequestparcel.zzsA, adrequestparcel.zzsB, adrequestparcel.zzsC, adrequestparcel.zzsD, adrequestparcel.zzsE);
    }
}
