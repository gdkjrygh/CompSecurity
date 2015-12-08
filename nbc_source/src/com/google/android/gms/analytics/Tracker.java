// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zza;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznx;
import com.google.android.gms.internal.zznz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            GoogleAnalytics

public class Tracker extends zzd
{
    private class zza extends zzd
    {

        final Tracker zzIU;
        private long zzIX;
        private boolean zzIY;

        protected void zzhn()
        {
        }

        public boolean zzhq()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            flag = zzIY;
            zzIY = false;
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        protected zza(zzf zzf1)
        {
            zzIU = Tracker.this;
            super(zzf1);
            zzIX = -1L;
        }
    }


    private boolean zzIH;
    private final Map zzII = new HashMap();
    private final zzad zzIJ;
    private final zza zzIK;
    private final Map zzyn = new HashMap();

    Tracker(zzf zzf1, String s, zzad zzad1)
    {
        super(zzf1);
        if (s != null)
        {
            zzyn.put("&tid", s);
        }
        zzyn.put("useSecure", "1");
        zzyn.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        if (zzad1 == null)
        {
            zzIJ = new zzad("tracking");
        } else
        {
            zzIJ = zzad1;
        }
        zzIK = new zza(zzf1);
    }

    static zza zza(Tracker tracker)
    {
        return tracker.zzIK;
    }

    private static void zza(Map map, Map map1)
    {
        zzu.zzu(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s = zzb(entry);
                if (s != null)
                {
                    map1.put(s, entry.getValue());
                }
            }
        }
    }

    private static boolean zza(java.util.Map.Entry entry)
    {
        String s = (String)entry.getKey();
        entry = (String)entry.getValue();
        return s.startsWith("&") && s.length() >= 2;
    }

    static com.google.android.gms.analytics.internal.zza zzb(Tracker tracker)
    {
        return tracker.zzhW();
    }

    private static String zzb(java.util.Map.Entry entry)
    {
        if (!zza(entry))
        {
            return null;
        } else
        {
            return ((String)entry.getKey()).substring(1);
        }
    }

    private static void zzb(Map map, Map map1)
    {
        zzu.zzu(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s = zzb(entry);
                if (s != null && !map1.containsKey(s))
                {
                    map1.put(s, entry.getValue());
                }
            }
        }
    }

    static zzk zzc(Tracker tracker)
    {
        return tracker.zzhX();
    }

    static com.google.android.gms.analytics.internal.zzu zzd(Tracker tracker)
    {
        return tracker.zzhY();
    }

    static com.google.android.gms.analytics.internal.zzu zze(Tracker tracker)
    {
        return tracker.zzhY();
    }

    static zzad zzf(Tracker tracker)
    {
        return tracker.zzIJ;
    }

    static zzaf zzg(Tracker tracker)
    {
        return tracker.zzhQ();
    }

    static zzaf zzh(Tracker tracker)
    {
        return tracker.zzhQ();
    }

    static zzb zzi(Tracker tracker)
    {
        return tracker.zzhl();
    }

    static zzb zzj(Tracker tracker)
    {
        return tracker.zzhl();
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        zzIH = flag;
    }

    public void send(Map map)
    {
        HashMap hashmap;
        String s;
        long l;
        boolean flag;
        boolean flag1;
        l = zzhP().currentTimeMillis();
        if (zzhg().getAppOptOut())
        {
            zzaU("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        flag = zzhg().isDryRunEnabled();
        hashmap = new HashMap();
        zza(zzyn, hashmap);
        zza(map, hashmap);
        flag1 = zzam.zze((String)zzyn.get("useSecure"), true);
        zzb(zzII, hashmap);
        zzII.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            zzhQ().zzg(hashmap, "Missing hit type parameter");
            return;
        }
        s = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s))
        {
            zzhQ().zzg(hashmap, "Missing tracking id parameter");
            return;
        }
        boolean flag2 = zzhp();
        this;
        JVM INSTR monitorenter ;
        int j;
        if (!"screenview".equalsIgnoreCase(map) && !"pageview".equalsIgnoreCase(map) && !"appview".equalsIgnoreCase(map) && !TextUtils.isEmpty(map))
        {
            break MISSING_BLOCK_LABEL_249;
        }
        j = Integer.parseInt((String)zzyn.get("&a")) + 1;
        int i;
        i = j;
        if (j >= 0x7fffffff)
        {
            i = 1;
        }
        zzyn.put("&a", Integer.toString(i));
        this;
        JVM INSTR monitorexit ;
        zzhS().zze(new Runnable(hashmap, flag2, map, l, flag, flag1, s) {

            final Map zzIN;
            final boolean zzIO;
            final String zzIP;
            final long zzIQ;
            final boolean zzIR;
            final boolean zzIS;
            final String zzIT;
            final Tracker zzIU;

            public void run()
            {
                boolean flag4 = true;
                if (com.google.android.gms.analytics.Tracker.zza(zzIU).zzhq())
                {
                    zzIN.put("sc", "start");
                }
                zzam.zzc(zzIN, "cid", zzIU.zzhg().getClientId());
                Object obj = (String)zzIN.get("sf");
                if (obj != null)
                {
                    double d = zzam.zza(((String) (obj)), 100D);
                    if (zzam.zza(d, (String)zzIN.get("cid")))
                    {
                        zzIU.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                        return;
                    }
                }
                obj = com.google.android.gms.analytics.Tracker.zzb(zzIU);
                boolean flag3;
                if (zzIO)
                {
                    zzam.zzb(zzIN, "ate", ((com.google.android.gms.analytics.internal.zza) (obj)).zzhy());
                    zzam.zzb(zzIN, "adid", ((com.google.android.gms.analytics.internal.zza) (obj)).zzhC());
                } else
                {
                    zzIN.remove("ate");
                    zzIN.remove("adid");
                }
                obj = Tracker.zzc(zzIU).zzix();
                zzam.zzb(zzIN, "an", ((zznx) (obj)).zzjL());
                zzam.zzb(zzIN, "av", ((zznx) (obj)).zzjN());
                zzam.zzb(zzIN, "aid", ((zznx) (obj)).zzsK());
                zzam.zzb(zzIN, "aiid", ((zznx) (obj)).zzwi());
                zzIN.put("v", "1");
                zzIN.put("_v", zze.zzJB);
                zzam.zzb(zzIN, "ul", com.google.android.gms.analytics.Tracker.zzd(zzIU).zzjE().getLanguage());
                zzam.zzb(zzIN, "sr", com.google.android.gms.analytics.Tracker.zze(zzIU).zzjF());
                if (zzIP.equals("transaction") || zzIP.equals("item"))
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (!flag3 && !com.google.android.gms.analytics.Tracker.zzf(zzIU).zzkb())
                {
                    Tracker.zzg(zzIU).zzg(zzIN, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
                long l2 = zzam.zzbj((String)zzIN.get("ht"));
                long l1 = l2;
                if (l2 == 0L)
                {
                    l1 = zzIQ;
                }
                if (zzIR)
                {
                    obj = new zzab(zzIU, zzIN, l1, zzIS);
                    com.google.android.gms.analytics.Tracker.zzh(zzIU).zzc("Dry run enabled. Would have sent hit", obj);
                    return;
                }
                obj = (String)zzIN.get("cid");
                HashMap hashmap1 = new HashMap();
                zzam.zza(hashmap1, "uid", zzIN);
                zzam.zza(hashmap1, "an", zzIN);
                zzam.zza(hashmap1, "aid", zzIN);
                zzam.zza(hashmap1, "av", zzIN);
                zzam.zza(hashmap1, "aiid", zzIN);
                String s1 = zzIT;
                if (TextUtils.isEmpty((CharSequence)zzIN.get("adid")))
                {
                    flag4 = false;
                }
                obj = new zzh(0L, ((String) (obj)), s1, flag4, 0L, hashmap1);
                l2 = Tracker.zzi(zzIU).zza(((zzh) (obj)));
                zzIN.put("_s", String.valueOf(l2));
                obj = new zzab(zzIU, zzIN, l1, zzIS);
                Tracker.zzj(zzIU).zza(((zzab) (obj)));
            }

            
            {
                zzIU = Tracker.this;
                zzIN = map;
                zzIO = flag;
                zzIP = s;
                zzIQ = l;
                zzIR = flag1;
                zzIS = flag2;
                zzIT = s1;
                super();
            }
        });
        return;
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
    }

    public void set(String s, String s1)
    {
        zzu.zzb(s, "Key should be non-null");
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            zzyn.put(s, s1);
            return;
        }
    }

    public void setScreenName(String s)
    {
        set("&cd", s);
    }

    protected void zzhn()
    {
        zzIK.zza();
        String s = zzhm().zzjL();
        if (s != null)
        {
            set("&an", s);
        }
        s = zzhm().zzjN();
        if (s != null)
        {
            set("&av", s);
        }
    }

    boolean zzhp()
    {
        return zzIH;
    }
}
