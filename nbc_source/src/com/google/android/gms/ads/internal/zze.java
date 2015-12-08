// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzaz;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzie;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzp, zzo

public class zze extends zzc
{

    public zze(Context context, AdSizeParcel adsizeparcel, String s, zzef zzef, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, zzef, versioninfoparcel);
    }

    private boolean zzb(zzha zzha1, zzha zzha2)
    {
        if (!zzha2.zzCK)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        View view;
        try
        {
            zzha2 = zzha2.zzya.getView();
        }
        // Misplaced declaration of an exception variable
        catch (zzha zzha1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get View from mediation adapter.", zzha1);
            return false;
        }
        if (zzha2 != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("View in mediation adapter is null.");
        return false;
        zzha2 = (View)com.google.android.gms.dynamic.zze.zzn(zzha2);
        view = zzon.zzpK.getNextView();
        if (view != null)
        {
            if (view instanceof zzid)
            {
                ((zzid)view).destroy();
            }
            zzon.zzpK.removeView(view);
        }
        try
        {
            zzb(((View) (zzha2)));
        }
        // Misplaced declaration of an exception variable
        catch (zzha zzha1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not add mediation view to view hierarchy.", zzha1);
            return false;
        }
_L1:
        if (zzon.zzpK.getChildCount() > 1)
        {
            zzon.zzpK.showNext();
        }
        if (zzha1 != null)
        {
            zzha1 = zzon.zzpK.getNextView();
            if (zzha1 instanceof zzid)
            {
                ((zzid)zzha1).zza(zzon.zzpH, zzon.zzpN);
            } else
            if (zzha1 != null)
            {
                zzon.zzpK.removeView(zzha1);
            }
            zzon.zzbL();
        }
        zzon.zzpK.setVisibility(0);
        return true;
        if (zzha2.zzFn != null)
        {
            zzha2.zzzE.zza(zzha2.zzFn);
            zzon.zzpK.removeAllViews();
            zzon.zzpK.setMinimumWidth(zzha2.zzFn.widthPixels);
            zzon.zzpK.setMinimumHeight(zzha2.zzFn.heightPixels);
            zzb(((View) (zzha2.zzzE.getWebView())));
        }
          goto _L1
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public boolean zza(zzha zzha1, zzha zzha2)
    {
        if (!super.zza(zzha1, zzha2))
        {
            return false;
        }
        if (zzon.zzbM() && !zzb(zzha1, zzha2))
        {
            zze(0);
            return false;
        }
        zza(zzha2, false);
        if (!zzon.zzbM()) goto _L2; else goto _L1
_L1:
        if (zzha2.zzzE != null && (zzha2.zzzE.zzgF().zzbU() || zzha2.zzFl != null))
        {
            zzha1 = zzop.zza(zzon.zzpN, zzha2);
            if (zzha2.zzzE.zzgF().zzbU() && zzha1 != null)
            {
                zzha1.zza(this);
            }
        }
        if (zzha2.zzzE != null)
        {
            zzha2.zzzE.zzgF().zzgS();
        }
_L4:
        return true;
_L2:
        if (zzon.zzqg != null && zzha2.zzFl != null)
        {
            zzop.zza(zzon.zzpN, zzha2, zzon.zzqg);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean zzaU()
    {
        boolean flag = true;
        if (!zzo.zzbv().zza(zzon.zzpH.getPackageManager(), zzon.zzpH.getPackageName(), "android.permission.INTERNET"))
        {
            zzk.zzcA().zza(zzon.zzpK, zzon.zzpN, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            flag = false;
        }
        if (!zzo.zzbv().zzG(zzon.zzpH))
        {
            zzk.zzcA().zza(zzon.zzpK, zzon.zzpN, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            flag = false;
        }
        if (!flag && zzon.zzpK != null)
        {
            zzon.zzpK.setVisibility(0);
        }
        return flag;
    }
}
