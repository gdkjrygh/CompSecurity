// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzax

public class zzhh
{

    private final Object zznh = new Object();
    final String zzyL;
    long zzyZ;
    long zzza;
    int zzzb;
    int zzzc;
    int zzzd;

    public zzhh(String s)
    {
        zzyZ = -1L;
        zzza = -1L;
        zzzb = -1;
        zzzc = 0;
        zzzd = 0;
        zzyL = s;
    }

    public static boolean zzp(Context context)
    {
        ComponentName componentname;
        int i;
        i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (i == 0)
        {
            zzhx.zzaa("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
        if (i == context.getPackageManager().getActivityInfo(componentname, 0).theme)
        {
            return true;
        }
        try
        {
            zzhx.zzaa("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzhx.zzac("Fail to fetch AdActivity theme");
            zzhx.zzaa("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        return false;
    }

    public void zzb(zzax zzax1, long l)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zzza != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzza = l;
        zzyZ = zzza;
_L2:
        if (zzax1.extras == null || zzax1.extras.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        zzyZ = l;
        if (true) goto _L2; else goto _L1
_L1:
        zzax1;
        obj;
        JVM INSTR monitorexit ;
        throw zzax1;
        zzzb = zzzb + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public Bundle zzc(Context context, String s)
    {
        Bundle bundle;
        synchronized (zznh)
        {
            bundle = new Bundle();
            bundle.putString("session_id", zzyL);
            bundle.putLong("basets", zzza);
            bundle.putLong("currts", zzyZ);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", zzzb);
            bundle.putInt("pclick", zzzc);
            bundle.putInt("pimp", zzzd);
            bundle.putBoolean("support_transparent_background", zzp(context));
        }
        return bundle;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zzdX()
    {
        synchronized (zznh)
        {
            zzzd = zzzd + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdY()
    {
        synchronized (zznh)
        {
            zzzc = zzzc + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long zzeo()
    {
        return zzza;
    }
}
