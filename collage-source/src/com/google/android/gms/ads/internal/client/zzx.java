// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzk, zzl

public final class zzx
{
    public static final class zza
    {

        private Date zzaT;
        private Location zzaX;
        private boolean zzoM;
        private String zzsV;
        private int zzsW;
        private final Bundle zzsX = new Bundle();
        private String zzsZ;
        private String zzta;
        private int zztc;
        private final Bundle zzte = new Bundle();
        private final HashSet zztg = new HashSet();
        private final HashMap zzth = new HashMap();
        private final HashSet zzti = new HashSet();
        private final HashSet zztj = new HashSet();

        static Date zza(zza zza1)
        {
            return zza1.zzaT;
        }

        static String zzb(zza zza1)
        {
            return zza1.zzsV;
        }

        static int zzc(zza zza1)
        {
            return zza1.zzsW;
        }

        static HashSet zzd(zza zza1)
        {
            return zza1.zztg;
        }

        static Location zze(zza zza1)
        {
            return zza1.zzaX;
        }

        static boolean zzf(zza zza1)
        {
            return zza1.zzoM;
        }

        static Bundle zzg(zza zza1)
        {
            return zza1.zzsX;
        }

        static HashMap zzh(zza zza1)
        {
            return zza1.zzth;
        }

        static String zzi(zza zza1)
        {
            return zza1.zzsZ;
        }

        static String zzj(zza zza1)
        {
            return zza1.zzta;
        }

        static int zzk(zza zza1)
        {
            return zza1.zztc;
        }

        static HashSet zzl(zza zza1)
        {
            return zza1.zzti;
        }

        static Bundle zzm(zza zza1)
        {
            return zza1.zzte;
        }

        static HashSet zzn(zza zza1)
        {
            return zza1.zztj;
        }

        public void setManualImpressionsEnabled(boolean flag)
        {
            zzoM = flag;
        }

        public void zzF(String s)
        {
            zztg.add(s);
        }

        public void zzG(String s)
        {
            zzti.add(s);
        }

        public void zzH(String s)
        {
            zzti.remove(s);
        }

        public void zzI(String s)
        {
            zzsV = s;
        }

        public void zzJ(String s)
        {
            zzsZ = s;
        }

        public void zzK(String s)
        {
            zzta = s;
        }

        public void zzL(String s)
        {
            zztj.add(s);
        }

        public void zza(Location location)
        {
            zzaX = location;
        }

        public void zza(NetworkExtras networkextras)
        {
            if (networkextras instanceof AdMobExtras)
            {
                zza(com/google/ads/mediation/admob/AdMobAdapter, ((AdMobExtras)networkextras).getExtras());
                return;
            } else
            {
                zzth.put(networkextras.getClass(), networkextras);
                return;
            }
        }

        public void zza(Class class1, Bundle bundle)
        {
            zzsX.putBundle(class1.getName(), bundle);
        }

        public void zza(Date date)
        {
            zzaT = date;
        }

        public void zzb(Class class1, Bundle bundle)
        {
            if (zzsX.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
            {
                zzsX.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
            }
            zzsX.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
        }

        public void zzb(String s, String s1)
        {
            zzte.putString(s, s1);
        }

        public void zzj(boolean flag)
        {
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            zztc = i;
        }

        public void zzm(int i)
        {
            zzsW = i;
        }

        public zza()
        {
            zzsW = -1;
            zzoM = false;
            zztc = -1;
        }
    }


    public static final String DEVICE_ID_EMULATOR = zzk.zzcE().zzaB("emulator");
    private final Date zzaT;
    private final Set zzaV;
    private final Location zzaX;
    private final boolean zzoM;
    private final String zzsV;
    private final int zzsW;
    private final Bundle zzsX;
    private final Map zzsY;
    private final String zzsZ;
    private final String zzta;
    private final SearchAdRequest zztb;
    private final int zztc;
    private final Set zztd;
    private final Bundle zzte;
    private final Set zztf;

    public zzx(zza zza1)
    {
        this(zza1, null);
    }

    public zzx(zza zza1, SearchAdRequest searchadrequest)
    {
        zzaT = com.google.android.gms.ads.internal.client.zza.zza(zza1);
        zzsV = zza.zzb(zza1);
        zzsW = zza.zzc(zza1);
        zzaV = Collections.unmodifiableSet(zza.zzd(zza1));
        zzaX = zza.zze(zza1);
        zzoM = zza.zzf(zza1);
        zzsX = zza.zzg(zza1);
        zzsY = Collections.unmodifiableMap(zza.zzh(zza1));
        zzsZ = zza.zzi(zza1);
        zzta = zza.zzj(zza1);
        zztb = searchadrequest;
        zztc = zza.zzk(zza1);
        zztd = Collections.unmodifiableSet(zza.zzl(zza1));
        zzte = zza.zzm(zza1);
        zztf = Collections.unmodifiableSet(zza.zzn(zza1));
    }

    public static void updateCorrelator()
    {
        zzk.zzcG().zzcK();
    }

    public Date getBirthday()
    {
        return zzaT;
    }

    public String getContentUrl()
    {
        return zzsV;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        Bundle bundle = zzsX.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null)
        {
            return bundle.getBundle(class1.getClass().getName());
        } else
        {
            return null;
        }
    }

    public Bundle getCustomTargeting()
    {
        return zzte;
    }

    public int getGender()
    {
        return zzsW;
    }

    public Set getKeywords()
    {
        return zzaV;
    }

    public Location getLocation()
    {
        return zzaX;
    }

    public boolean getManualImpressionsEnabled()
    {
        return zzoM;
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return (NetworkExtras)zzsY.get(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return zzsX.getBundle(class1.getName());
    }

    public String getPublisherProvidedId()
    {
        return zzsZ;
    }

    public boolean isTestDevice(Context context)
    {
        return zztd.contains(zzk.zzcE().zzQ(context));
    }

    public String zzcL()
    {
        return zzta;
    }

    public SearchAdRequest zzcM()
    {
        return zztb;
    }

    public Map zzcN()
    {
        return zzsY;
    }

    public Bundle zzcO()
    {
        return zzsX;
    }

    public int zzcP()
    {
        return zztc;
    }

    public Set zzcQ()
    {
        return zztf;
    }

}
