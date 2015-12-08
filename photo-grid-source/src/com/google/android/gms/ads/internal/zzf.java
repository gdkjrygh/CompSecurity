// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.as;
import com.google.android.gms.internal.at;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.zzja;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzq, zzp, f, 
//            zzd, zze

public class zzf extends zzc
{

    private boolean l;

    public zzf(Context context, AdSizeParcel adsizeparcel, String s, ip ip, VersionInfoParcel versioninfoparcel, zzd zzd)
    {
        super(context, adsizeparcel, s, ip, versioninfoparcel, zzd);
    }

    private boolean a(pa pa1, pa pa2)
    {
        if (!pa2.k)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        View view;
        try
        {
            pa2 = pa2.m.a();
        }
        // Misplaced declaration of an exception variable
        catch (pa pa1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get View from mediation adapter.", pa1);
            return false;
        }
        if (pa2 != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaH("View in mediation adapter is null.");
        return false;
        pa2 = (View)com.google.android.gms.b.d.a(pa2);
        view = f.c.getNextView();
        if (view != null)
        {
            if (view instanceof ry)
            {
                ((ry)view).destroy();
            }
            f.c.removeView(view);
        }
        try
        {
            a(((View) (pa2)));
        }
        // Misplaced declaration of an exception variable
        catch (pa pa1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not add mediation view to view hierarchy.", pa1);
            return false;
        }
_L1:
        if (f.c.getChildCount() > 1)
        {
            f.c.showNext();
        }
        if (pa1 != null)
        {
            pa1 = f.c.getNextView();
            if (pa1 instanceof ry)
            {
                ((ry)pa1).a(f.context, f.zzqn, a);
            } else
            if (pa1 != null)
            {
                f.c.removeView(pa1);
            }
            f.zzbM();
        }
        f.c.setVisibility(0);
        return true;
        if (pa2.r != null && pa2.b != null)
        {
            pa2.b.a(pa2.r);
            f.c.removeAllViews();
            f.c.setMinimumWidth(pa2.r.widthPixels);
            f.c.setMinimumHeight(pa2.r.heightPixels);
            a(pa2.b.b());
        }
          goto _L1
    }

    protected final ry a(pb pb1, zze zze)
    {
        if (f.zzqn.zzti)
        {
            zzq zzq1 = f;
            Object obj;
            if (pb1.b.zzti)
            {
                obj = f.zzqn;
            } else
            {
                obj = pb1.b.zzEN;
                if (obj != null)
                {
                    obj = ((String) (obj)).split("[xX]");
                    obj[0] = obj[0].trim();
                    obj[1] = obj[1].trim();
                    obj = new AdSize(Integer.parseInt(obj[0]), Integer.parseInt(obj[1]));
                } else
                {
                    obj = f.zzqn.zzcD();
                }
                obj = new AdSizeParcel(f.context, ((AdSize) (obj)));
            }
            zzq1.zzqn = ((AdSizeParcel) (obj));
        }
        return super.a(pb1, zze);
    }

    protected final boolean d()
    {
        boolean flag = true;
        zzp.zzbv();
        if (!qa.a(f.context.getPackageManager(), f.context.getPackageName(), "android.permission.INTERNET"))
        {
            zzl.zzcF().zza(f.c, f.zzqn, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            flag = false;
        }
        zzp.zzbv();
        if (!qa.a(f.context))
        {
            zzl.zzcF().zza(f.c, f.zzqn, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            flag = false;
        }
        if (!flag && f.c != null)
        {
            f.c.setVisibility(0);
        }
        return flag;
    }

    public void setManualImpressionsEnabled(boolean flag)
    {
        bl.b("setManualImpressionsEnabled must be called from the main thread.");
        l = flag;
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public boolean zza(pa pa1, pa pa2)
    {
        if (!super.zza(pa1, pa2))
        {
            return false;
        }
        if (f.zzbN() && !a(pa1, pa2))
        {
            a(0);
            return false;
        }
        a(pa2, false);
        if (!f.zzbN()) goto _L2; else goto _L1
_L1:
        if (pa2.b != null)
        {
            if (pa2.j != null)
            {
                h.a(f.zzqn, pa2);
            }
            if (pa2.a())
            {
                h.a(f.zzqn, pa2).a(pa2.b);
            } else
            {
                pa2.b.k().zza(new f(this, pa2));
            }
        }
_L4:
        return true;
_L2:
        if (f.r != null && pa2.j != null)
        {
            h.a(f.zzqn, pa2, f.r);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean zzb(AdRequestParcel adrequestparcel)
    {
        if (adrequestparcel.zzsG != l)
        {
            int i = adrequestparcel.versionCode;
            long l1 = adrequestparcel.zzsB;
            android.os.Bundle bundle = adrequestparcel.extras;
            int j = adrequestparcel.zzsC;
            java.util.List list = adrequestparcel.zzsD;
            boolean flag1 = adrequestparcel.zzsE;
            int k = adrequestparcel.zzsF;
            boolean flag;
            if (adrequestparcel.zzsG || l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            adrequestparcel = new AdRequestParcel(i, l1, bundle, j, list, flag1, k, flag, adrequestparcel.zzsH, adrequestparcel.zzsI, adrequestparcel.zzsJ, adrequestparcel.zzsK, adrequestparcel.zzsL, adrequestparcel.zzsM, adrequestparcel.zzsN, adrequestparcel.zzsO, adrequestparcel.zzsP);
        }
        return super.zzb(adrequestparcel);
    }
}
