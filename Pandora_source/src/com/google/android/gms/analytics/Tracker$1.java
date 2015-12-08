// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zza;
import com.google.android.gms.analytics.internal.zzaa;
import com.google.android.gms.analytics.internal.zzac;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzg;
import com.google.android.gms.analytics.internal.zzj;
import com.google.android.gms.analytics.internal.zzt;
import com.google.android.gms.internal.zzkp;
import com.google.android.gms.internal.zzkr;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics

class g
    implements Runnable
{

    final Map a;
    final boolean b;
    final String c;
    final long d;
    final boolean e;
    final boolean f;
    final String g;
    final Tracker h;

    public void run()
    {
        boolean flag1 = true;
        if (com.google.android.gms.analytics.Tracker.zza(h).a())
        {
            a.put("sc", "start");
        }
        zzal.zzc(a, "cid", h.zzfT().getClientId());
        if (a.get("&sf") != null)
        {
            double d1 = zzal.zza((String)a.get("&sf"), 100D);
            if (zzal.zza(d1, (String)a.get("&cid")))
            {
                h.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                return;
            }
        }
        Object obj = com.google.android.gms.analytics.Tracker.zzb(h);
        boolean flag;
        if (b)
        {
            zzal.zzb(a, "ate", ((zza) (obj)).zzgn());
            zzal.zzb(a, "adid", ((zza) (obj)).zzgr());
        } else
        {
            a.remove("ate");
            a.remove("adid");
        }
        obj = Tracker.zzc(h).zzhq();
        zzal.zzb(a, "an", ((zzkp) (obj)).zziE());
        zzal.zzb(a, "av", ((zzkp) (obj)).zziG());
        zzal.zzb(a, "aid", ((zzkp) (obj)).zzqT());
        zzal.zzb(a, "aiid", ((zzkp) (obj)).zzus());
        a.put("v", "1");
        a.put("_v", "ma4.5.0");
        zzal.zzb(a, "ul", Tracker.zzd(h).zzix().getLanguage());
        zzal.zzb(a, "sr", Tracker.zze(h).zziy());
        if (c.equals("transaction") || c.equals("item"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !Tracker.zzf(h).zziU())
        {
            com.google.android.gms.analytics.Tracker.zzg(h).zze(a, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long l1 = zzal.zzaV((String)a.get("ht"));
        long l = l1;
        if (l1 == 0L)
        {
            l = d;
        }
        if (e)
        {
            obj = new zzaa(h, a, l, f);
            Tracker.zzh(h).zzc("Dry run enabled. Would have sent hit", obj);
            return;
        }
        obj = (String)a.get("cid");
        HashMap hashmap = new HashMap();
        zzal.zza(hashmap, "uid", a);
        zzal.zza(hashmap, "an", a);
        zzal.zza(hashmap, "aid", a);
        zzal.zza(hashmap, "av", a);
        zzal.zza(hashmap, "aiid", a);
        String s = g;
        if (TextUtils.isEmpty((CharSequence)a.get("adid")))
        {
            flag1 = false;
        }
        obj = new zzg(0L, ((String) (obj)), s, flag1, 0L, hashmap);
        l1 = Tracker.zzi(h).zza(((zzg) (obj)));
        a.put("_s", String.valueOf(l1));
        obj = new zzaa(h, a, l, f);
        com.google.android.gms.analytics.Tracker.zzj(h).zza(((zzaa) (obj)));
    }

    zb(Tracker tracker, Map map, boolean flag, String s, long l, boolean flag1, 
            boolean flag2, String s1)
    {
        h = tracker;
        a = map;
        b = flag;
        c = s;
        d = l;
        e = flag1;
        f = flag2;
        g = s1;
        super();
    }
}
