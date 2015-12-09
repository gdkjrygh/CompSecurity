// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.MobileAdsSettingsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.analytics.c;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.jr;
import com.google.android.gms.internal.jy;
import com.google.android.gms.internal.kg;
import com.google.android.gms.internal.kh;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp

public class zzm extends com.google.android.gms.ads.internal.client.zzv.zza
    implements com.google.android.gms.internal.jr.a, com.google.android.gms.internal.kh.a
{

    private static final Object zzpm = new Object();
    private static zzm zzpn;
    private final Context mContext;
    kg zzpo;
    String zzpp;
    String zzpq;
    private boolean zzpr;
    private boolean zzps;

    zzm(Context context)
    {
        mContext = context;
        zzpr = false;
    }

    public static zzm zzq(Context context)
    {
        synchronized (zzpm)
        {
            if (zzpn == null)
            {
                zzpn = new zzm(context.getApplicationContext());
            }
            context = zzpn;
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
            synchronized (zzpm)
            {
                if (zzps)
                {
                    break label0;
                }
            }
            return null;
        }
        String s = c.a(mContext).h();
        obj;
        JVM INSTR monitorexit ;
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(jy jy1)
    {
    }

    public void zza(jy jy1, Activity activity)
    {
        if (jy1 != null && activity != null)
        {
            if (activity instanceof AdActivity)
            {
                int i = zzp.zzbx().e(activity);
                if (i == 1)
                {
                    jy1.b(true);
                    jy1.a("Interstitial Ad");
                    return;
                }
                if (i == 2 || i == 3)
                {
                    jy1.a("Expanded Ad");
                    return;
                } else
                {
                    jy1.a(null);
                    return;
                }
            }
            if (activity instanceof InAppPurchaseActivity)
            {
                jy1.a(null);
                return;
            }
        }
    }

    public void zza(String s, MobileAdsSettingsParcel mobileadssettingsparcel)
    {
label0:
        {
            synchronized (zzpm)
            {
                if (!zzpr)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Mobile ads is initialized already.");
            }
            return;
        }
        if (mContext != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to initialize mobile ads because context is null.");
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to initialize mobile ads because ApplicationCode is empty.");
        obj;
        JVM INSTR monitorexit ;
        return;
        zzpr = true;
        zzb(s, mobileadssettingsparcel);
        obj;
        JVM INSTR monitorexit ;
    }

    void zzb(String s, MobileAdsSettingsParcel mobileadssettingsparcel)
    {
label0:
        {
            if (mobileadssettingsparcel != null && mobileadssettingsparcel.zzty)
            {
                if (zzp.zzbx().a(mContext.getPackageManager(), mContext.getPackageName(), "android.permission.INTERNET"))
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.e("Missing permission android.permission.INTERNET");
            }
            return;
        }
        if (!zzp.zzbx().a(mContext.getPackageManager(), mContext.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
        {
            com.google.android.gms.ads.internal.util.client.zzb.e("Missing permission android.permission.ACCESS_NETWORK_STATE");
            return;
        }
        if (!Pattern.matches("ca-app-[a-z0-9_-]+~[a-z0-9_-]+", s))
        {
            throw new IllegalArgumentException("Please provide a valid application code");
        }
        zzps = true;
        zzpp = s;
        zzpq = mobileadssettingsparcel.zztz;
        s = kh.a(mContext);
        mobileadssettingsparcel = new com.google.android.gms.internal.kg.a(zzpp);
        if (!TextUtils.isEmpty(zzpq))
        {
            mobileadssettingsparcel.a(zzpq);
        }
        s.a(mobileadssettingsparcel.a());
        s.a(this);
        jr.a(mContext).a(this);
        s.b();
    }

    public boolean zzbn()
    {
        boolean flag;
        synchronized (zzpm)
        {
            flag = zzps;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbo()
    {
        zzpo = kh.a(mContext).a();
    }

    public int zzbp()
    {
label0:
        {
            synchronized (zzpm)
            {
                if (zzps)
                {
                    break label0;
                }
            }
            return -1;
        }
        jy jy1 = jr.a(mContext).a();
        if (jy1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        int i = jy1.c();
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
