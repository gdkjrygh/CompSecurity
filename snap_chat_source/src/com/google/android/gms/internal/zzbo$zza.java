// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import di;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            zzbo

public static final class zzpv
{

    private Date zzd;
    private Location zzh;
    private final HashMap zzpA = new HashMap();
    private final HashSet zzpB = new HashSet();
    private final HashSet zzpC = new HashSet();
    private String zzpn;
    private int zzpo;
    private boolean zzpp;
    private final Bundle zzpq = new Bundle();
    private String zzps;
    private String zzpt;
    private int zzpv;
    private final Bundle zzpx = new Bundle();
    private final HashSet zzpz = new HashSet();

    static Date zza(zzpv zzpv1)
    {
        return zzpv1.zzd;
    }

    static String zzb(zzd zzd1)
    {
        return zzd1.zzpn;
    }

    static int zzc(zzpn zzpn1)
    {
        return zzpn1.zzpo;
    }

    static HashSet zzd(zzpo zzpo1)
    {
        return zzpo1.zzpz;
    }

    static Location zze(zzpz zzpz1)
    {
        return zzpz1.zzh;
    }

    static boolean zzf(zzh zzh1)
    {
        return zzh1.zzpp;
    }

    static Bundle zzg(zzpp zzpp1)
    {
        return zzpp1.zzpq;
    }

    static HashMap zzh(zzpq zzpq1)
    {
        return zzpq1.zzpA;
    }

    static String zzi(zzpA zzpa)
    {
        return zzpa.zzps;
    }

    static String zzj(zzps zzps1)
    {
        return zzps1.zzpt;
    }

    static int zzk(zzpt zzpt1)
    {
        return zzpt1.zzpv;
    }

    static HashSet zzl(zzpv zzpv1)
    {
        return zzpv1.zzpB;
    }

    static Bundle zzm(zzpB zzpb)
    {
        return zzpb.zzpx;
    }

    static HashSet zzn(zzpx zzpx1)
    {
        return zzpx1.zzpC;
    }

    public final void zza(Location location)
    {
        zzh = location;
    }

    public final void zza(NetworkExtras networkextras)
    {
        if (networkextras instanceof AdMobExtras)
        {
            zza(di, ((AdMobExtras)networkextras).getExtras());
            return;
        } else
        {
            zzpA.put(networkextras.getClass(), networkextras);
            return;
        }
    }

    public final void zza(Class class1, Bundle bundle)
    {
        zzpq.putBundle(class1.getName(), bundle);
    }

    public final void zza(Date date)
    {
        zzd = date;
    }

    public final void zzh(int i)
    {
        zzpo = i;
    }

    public final void zzj(boolean flag)
    {
        zzpp = flag;
    }

    public final void zzk(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        zzpv = i;
    }

    public final void zzr(String s)
    {
        zzpz.add(s);
    }

    public final void zzs(String s)
    {
        zzpB.add(s);
    }

    public final void zzt(String s)
    {
        zzpB.remove(s);
    }

    public orkExtras()
    {
        zzpo = -1;
        zzpp = false;
        zzpv = -1;
    }
}
