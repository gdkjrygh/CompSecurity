// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.internal.zzfl;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzkv;
import com.google.android.gms.internal.zzmg;
import com.google.android.gms.internal.zzmh;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzh

public class zzf extends com.google.android.gms.ads.internal.client.zzr.zza
    implements com.google.android.gms.internal.zzko.zza, com.google.android.gms.internal.zzmh.zza
{

    private static final Object zznu = new Object();
    private static zzf zznv;
    private final Context mContext;
    zzmg zznw;
    String zznx;
    String zzny;
    private boolean zznz;

    zzf(Context context)
    {
        mContext = context;
        zznz = false;
    }

    public static zzf zzl(Context context)
    {
        synchronized (zznu)
        {
            if (zznv == null)
            {
                zznv = new zzf(context.getApplicationContext());
            }
            context = zznv;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public String getClientId()
    {
label0:
        {
            synchronized (zznu)
            {
                if (zznz)
                {
                    break label0;
                }
            }
            return null;
        }
        String s = GoogleAnalytics.getInstance(mContext).getClientId();
        obj;
        JVM INSTR monitorexit ;
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isInitialized()
    {
        boolean flag;
        synchronized (zznu)
        {
            flag = zznz;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzkv zzkv1)
    {
    }

    public void zza(zzkv zzkv1, Activity activity)
    {
        if (zzkv1 != null && activity != null)
        {
            if (activity instanceof AdActivity)
            {
                int i = zzh.zzaQ().zzk(activity);
                if (i == 1)
                {
                    zzkv1.zzad(true);
                    zzkv1.setScreenName("Interstitial Ad");
                    return;
                }
                if (i == 2 || i == 3)
                {
                    zzkv1.setScreenName("Expanded Ad");
                    return;
                } else
                {
                    zzkv1.setScreenName(null);
                    return;
                }
            }
            if (activity instanceof InAppPurchaseActivity)
            {
                zzkv1.setScreenName(null);
                return;
            }
        }
    }

    public void zza(String s, String s1)
    {
label0:
        {
            synchronized (zznu)
            {
                if (zzh.zzaQ().zza(mContext.getPackageManager(), mContext.getPackageName(), "android.permission.INTERNET"))
                {
                    break label0;
                }
                zzb.zzak("Missing permission android.permission.INTERNET");
            }
            return;
        }
        if (zzh.zzaQ().zza(mContext.getPackageManager(), mContext.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
        {
            break MISSING_BLOCK_LABEL_77;
        }
        zzb.zzak("Missing permission android.permission.ACCESS_NETWORK_STATE");
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        if (mContext != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        zzb.zzan("Fail to initialize MobileAdsSettingManager because context is null.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_107;
        }
        zzb.zzan("Fail to initialize MobileAdsSettingManager because ApplicationCode is empty.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!zznz)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        zzb.zzal("MobileAdsSettingManager has been initialized.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!Pattern.matches("ca-app-[a-z0-9_-]+~[a-z0-9_-]+", s))
        {
            throw new IllegalArgumentException("Please provide a valid application code");
        }
        zznz = true;
        zznx = s;
        zzny = s1;
        s = zzmh.zzat(mContext);
        s1 = new com.google.android.gms.internal.zzmg.zza(zznx);
        if (!TextUtils.isEmpty(zzny))
        {
            s1.zzek(zzny);
        }
        s.zza(s1.zzyc());
        s.zza(this);
        zzko.zzal(mContext).zza(this);
        s.start();
        obj;
        JVM INSTR monitorexit ;
    }

    public void zzaI()
    {
        zznw = zzmh.zzat(mContext).zzyd();
    }

    public int zzaJ()
    {
label0:
        {
            synchronized (zznu)
            {
                if (zznz)
                {
                    break label0;
                }
            }
            return -1;
        }
        zzkv zzkv1 = zzko.zzal(mContext).zzuo();
        if (zzkv1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        int i = zzkv1.zzaJ();
        obj;
        JVM INSTR monitorexit ;
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        return -1;
    }

}
