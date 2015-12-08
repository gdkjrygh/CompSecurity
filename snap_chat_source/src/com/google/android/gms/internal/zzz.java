// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.analytics.GoogleAnalytics;

// Referenced classes of package com.google.android.gms.internal:
//            zzab, zzho, zzrh, zzhx, 
//            zztb, zzre, zzta

public class zzz extends zzbm.zza
    implements zzre.zza, zztb.zza
{

    private static zzz zzmA;
    private static final Object zzmz = new Object();
    private final Context mContext;
    zzta zzmB;
    String zzmC;
    String zzmD;
    private boolean zzmE;

    zzz(Context context)
    {
        mContext = context;
        zzmE = false;
    }

    public static zzz zzj(Context context)
    {
        synchronized (zzmz)
        {
            if (zzmA == null)
            {
                zzmA = new zzz(context.getApplicationContext());
            }
            context = zzmA;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public String getClientId()
    {
        return GoogleAnalytics.getInstance(mContext).getClientId();
    }

    public boolean isInitialized()
    {
        boolean flag;
        synchronized (zzmz)
        {
            flag = zzmE;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzrh zzrh1)
    {
    }

    public void zza(zzrh zzrh1, Activity activity)
    {
        if (zzrh1 != null && activity != null)
        {
            if (activity instanceof AdActivity)
            {
                int i = zzab.zzaM().zzk(activity);
                if (i == 1)
                {
                    zzrh1.zzaa(true);
                    zzrh1.setScreenName("Interstitial Ad");
                    return;
                }
                if (i == 2 || i == 3)
                {
                    zzrh1.setScreenName("Expanded Ad");
                    return;
                } else
                {
                    zzrh1.setScreenName(null);
                    return;
                }
            }
            if (activity instanceof InAppPurchaseActivity)
            {
                zzrh1.setScreenName(null);
                return;
            }
        }
    }

    public void zza(String s, String s1)
    {
label0:
        {
            synchronized (zzmz)
            {
                if (mContext != null)
                {
                    break label0;
                }
                zzhx.zzac("Fail to initialize MobileAdsSettingManager because context is null.");
            }
            return;
        }
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        zzhx.zzac("Fail to initialize MobileAdsSettingManager because ApplicationCode is empty.");
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        if (!zzmE)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        zzhx.zzaa("MobileAdsSettingManager has been initialized.");
        obj;
        JVM INSTR monitorexit ;
        return;
        zzmE = true;
        zzmC = s;
        zzmD = s1;
        s = zztb.zzah(mContext);
        s1 = new zzta.zza(zzmC);
        if (!TextUtils.isEmpty(zzmD))
        {
            s1.zzcA(zzmD);
        }
        s.zza(s1.zzrA());
        s.zza(this);
        zzre.zzag(mContext).zza(this);
        s.start();
        obj;
        JVM INSTR monitorexit ;
    }

    public void zzaE()
    {
        zzmB = zztb.zzah(mContext).zzrB();
    }

    public int zzaF()
    {
        zzrh zzrh1 = zzre.zzag(mContext).zzqW();
        if (zzrh1 != null)
        {
            return zzrh1.zzaF();
        } else
        {
            return 0;
        }
    }

}
