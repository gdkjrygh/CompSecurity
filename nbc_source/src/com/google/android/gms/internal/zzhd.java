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
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

public class zzhd
{

    final String zzFE;
    long zzFQ;
    long zzFR;
    int zzFS;
    int zzFT;
    int zzFU;
    private final Object zzqt = new Object();

    public zzhd(String s)
    {
        zzFQ = -1L;
        zzFR = -1L;
        zzFS = -1;
        zzFT = 0;
        zzFU = 0;
        zzFE = s;
    }

    public static boolean zzE(Context context)
    {
        ComponentName componentname;
        int i;
        i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (i == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaA("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
        if (i == context.getPackageManager().getActivityInfo(componentname, 0).theme)
        {
            return true;
        }
        try
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaA("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to fetch AdActivity theme");
            com.google.android.gms.ads.internal.util.client.zzb.zzaA("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        return false;
    }

    public void zzb(AdRequestParcel adrequestparcel, long l)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzFR != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzFR = l;
        zzFQ = zzFR;
_L2:
        if (adrequestparcel.extras == null || adrequestparcel.extras.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        zzFQ = l;
        if (true) goto _L2; else goto _L1
_L1:
        adrequestparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adrequestparcel;
        zzFS = zzFS + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public Bundle zzd(Context context, String s)
    {
        Bundle bundle;
        synchronized (zzqt)
        {
            bundle = new Bundle();
            bundle.putString("session_id", zzFE);
            bundle.putLong("basets", zzFR);
            bundle.putLong("currts", zzFQ);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", zzFS);
            bundle.putInt("pclick", zzFT);
            bundle.putInt("pimp", zzFU);
            bundle.putBoolean("support_transparent_background", zzE(context));
        }
        return bundle;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zzfP()
    {
        synchronized (zzqt)
        {
            zzFU = zzFU + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzfQ()
    {
        synchronized (zzqt)
        {
            zzFT = zzFT + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long zzgg()
    {
        return zzFR;
    }
}
