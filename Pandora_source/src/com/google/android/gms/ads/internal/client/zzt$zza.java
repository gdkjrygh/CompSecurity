// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import p.br.a;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzt

public static final class zzqt
{

    private Date zzi;
    private Location zzm;
    private final HashSet zzqA = new HashSet();
    private String zzql;
    private int zzqm;
    private boolean zzqn;
    private final Bundle zzqo = new Bundle();
    private String zzqq;
    private String zzqr;
    private int zzqt;
    private final Bundle zzqv = new Bundle();
    private final HashSet zzqx = new HashSet();
    private final HashMap zzqy = new HashMap();
    private final HashSet zzqz = new HashSet();

    static Date zza(zzqt zzqt1)
    {
        return zzqt1.zzi;
    }

    static String zzb(zzi zzi1)
    {
        return zzi1.zzql;
    }

    static int zzc(zzql zzql1)
    {
        return zzql1.zzqm;
    }

    static HashSet zzd(zzqm zzqm1)
    {
        return zzqm1.zzqx;
    }

    static Location zze(zzqx zzqx1)
    {
        return zzqx1.zzm;
    }

    static boolean zzf(zzm zzm1)
    {
        return zzm1.zzqn;
    }

    static Bundle zzg(zzqn zzqn1)
    {
        return zzqn1.zzqo;
    }

    static HashMap zzh(zzqo zzqo1)
    {
        return zzqo1.zzqy;
    }

    static String zzi(zzqy zzqy1)
    {
        return zzqy1.zzqq;
    }

    static String zzj(zzqq zzqq1)
    {
        return zzqq1.zzqr;
    }

    static int zzk(zzqr zzqr1)
    {
        return zzqr1.zzqt;
    }

    static HashSet zzl(zzqt zzqt1)
    {
        return zzqt1.zzqz;
    }

    static Bundle zzm(zzqz zzqz1)
    {
        return zzqz1.zzqv;
    }

    static HashSet zzn(zzqv zzqv1)
    {
        return zzqv1.zzqA;
    }

    public void zza(Location location)
    {
        zzm = location;
    }

    public void zza(NetworkExtras networkextras)
    {
        if (networkextras instanceof AdMobExtras)
        {
            zza(p/br/a, ((AdMobExtras)networkextras).getExtras());
            return;
        } else
        {
            zzqy.put(networkextras.getClass(), networkextras);
            return;
        }
    }

    public void zza(Class class1, Bundle bundle)
    {
        zzqo.putBundle(class1.getName(), bundle);
    }

    public void zza(Date date)
    {
        zzi = date;
    }

    public void zzb(Class class1, Bundle bundle)
    {
        if (zzqo.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
        {
            zzqo.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        zzqo.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
    }

    public void zzc(String s, String s1)
    {
        zzqv.putString(s, s1);
    }

    public void zzi(int i)
    {
        zzqm = i;
    }

    public void zzk(boolean flag)
    {
        zzqn = flag;
    }

    public void zzl(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        zzqt = i;
    }

    public void zzt(String s)
    {
        zzqx.add(s);
    }

    public void zzu(String s)
    {
        zzqz.add(s);
    }

    public void zzv(String s)
    {
        zzqz.remove(s);
    }

    public void zzw(String s)
    {
        zzql = s;
    }

    public void zzx(String s)
    {
        zzqq = s;
    }

    public void zzy(String s)
    {
        zzqr = s;
    }

    public void zzz(String s)
    {
        zzqA.add(s);
    }

    public ras()
    {
        zzqm = -1;
        zzqn = false;
        zzqt = -1;
    }
}
