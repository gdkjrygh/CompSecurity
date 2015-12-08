// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import di;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzbe, zzhw

public final class zzbo
{
    public static final class zza
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

        static Date zza(zza zza1)
        {
            return zza1.zzd;
        }

        static String zzb(zza zza1)
        {
            return zza1.zzpn;
        }

        static int zzc(zza zza1)
        {
            return zza1.zzpo;
        }

        static HashSet zzd(zza zza1)
        {
            return zza1.zzpz;
        }

        static Location zze(zza zza1)
        {
            return zza1.zzh;
        }

        static boolean zzf(zza zza1)
        {
            return zza1.zzpp;
        }

        static Bundle zzg(zza zza1)
        {
            return zza1.zzpq;
        }

        static HashMap zzh(zza zza1)
        {
            return zza1.zzpA;
        }

        static String zzi(zza zza1)
        {
            return zza1.zzps;
        }

        static String zzj(zza zza1)
        {
            return zza1.zzpt;
        }

        static int zzk(zza zza1)
        {
            return zza1.zzpv;
        }

        static HashSet zzl(zza zza1)
        {
            return zza1.zzpB;
        }

        static Bundle zzm(zza zza1)
        {
            return zza1.zzpx;
        }

        static HashSet zzn(zza zza1)
        {
            return zza1.zzpC;
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

        public zza()
        {
            zzpo = -1;
            zzpp = false;
            zzpv = -1;
        }
    }


    public static final String DEVICE_ID_EMULATOR = zzbe.zzbD().zzX("emulator");
    private final Date zzd;
    private final Set zzf;
    private final Location zzh;
    private final String zzpn;
    private final int zzpo;
    private final boolean zzpp;
    private final Bundle zzpq;
    private final Map zzpr;
    private final String zzps;
    private final String zzpt;
    private final SearchAdRequest zzpu;
    private final int zzpv;
    private final Set zzpw;
    private final Bundle zzpx;
    private final Set zzpy;

    public zzbo(zza zza1)
    {
        this(zza1, null);
    }

    public zzbo(zza zza1, SearchAdRequest searchadrequest)
    {
        zzd = zza.zza(zza1);
        zzpn = zza.zzb(zza1);
        zzpo = zza.zzc(zza1);
        zzf = Collections.unmodifiableSet(zza.zzd(zza1));
        zzh = zza.zze(zza1);
        zzpp = zza.zzf(zza1);
        zzpq = zza.zzg(zza1);
        zzpr = Collections.unmodifiableMap(zza.zzh(zza1));
        zzps = zza.zzi(zza1);
        zzpt = zza.zzj(zza1);
        zzpu = searchadrequest;
        zzpv = zza.zzk(zza1);
        zzpw = Collections.unmodifiableSet(zza.zzl(zza1));
        zzpx = zza.zzm(zza1);
        zzpy = Collections.unmodifiableSet(zza.zzn(zza1));
    }

    public final Date getBirthday()
    {
        return zzd;
    }

    public final String getContentUrl()
    {
        return zzpn;
    }

    public final Bundle getCustomTargeting()
    {
        return zzpx;
    }

    public final int getGender()
    {
        return zzpo;
    }

    public final Set getKeywords()
    {
        return zzf;
    }

    public final Location getLocation()
    {
        return zzh;
    }

    public final boolean getManualImpressionsEnabled()
    {
        return zzpp;
    }

    public final Bundle getNetworkExtrasBundle(Class class1)
    {
        return zzpq.getBundle(class1.getName());
    }

    public final String getPublisherProvidedId()
    {
        return zzps;
    }

    public final boolean isTestDevice(Context context)
    {
        return zzpw.contains(zzbe.zzbD().zzz(context));
    }

    public final String zzbH()
    {
        return zzpt;
    }

    public final SearchAdRequest zzbI()
    {
        return zzpu;
    }

    public final Map zzbJ()
    {
        return zzpr;
    }

    public final Bundle zzbK()
    {
        return zzpq;
    }

    public final int zzbL()
    {
        return zzpv;
    }

    public final Set zzbM()
    {
        return zzpy;
    }

}
