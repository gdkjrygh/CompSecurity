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
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzu;
import com.google.android.gms.internal.zznx;
import com.google.android.gms.internal.zznz;
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
        if (Tracker.a(h).b())
        {
            a.put("sc", "start");
        }
        zzam.b(a, "cid", h.s().h());
        Object obj = (String)a.get("sf");
        if (obj != null)
        {
            double d1 = zzam.a(((String) (obj)), 100D);
            if (zzam.a(d1, (String)a.get("cid")))
            {
                h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                return;
            }
        }
        obj = Tracker.b(h);
        boolean flag;
        if (b)
        {
            zzam.a(a, "ate", ((zza) (obj)).b());
            zzam.a(a, "adid", ((zza) (obj)).c());
        } else
        {
            a.remove("ate");
            a.remove("adid");
        }
        obj = Tracker.c(h).c();
        zzam.a(a, "an", ((zznx) (obj)).a());
        zzam.a(a, "av", ((zznx) (obj)).b());
        zzam.a(a, "aid", ((zznx) (obj)).c());
        zzam.a(a, "aiid", ((zznx) (obj)).d());
        a.put("v", "1");
        a.put("_v", zze.b);
        zzam.a(a, "ul", Tracker.d(h).b().f());
        zzam.a(a, "sr", Tracker.e(h).c());
        if (c.equals("transaction") || c.equals("item"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !Tracker.f(h).a())
        {
            Tracker.g(h).a(a, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long l1 = zzam.a((String)a.get("ht"));
        long l = l1;
        if (l1 == 0L)
        {
            l = d;
        }
        if (e)
        {
            obj = new zzab(h, a, l, f);
            Tracker.h(h).c("Dry run enabled. Would have sent hit", obj);
            return;
        }
        obj = (String)a.get("cid");
        HashMap hashmap = new HashMap();
        zzam.a(hashmap, "uid", a);
        zzam.a(hashmap, "an", a);
        zzam.a(hashmap, "aid", a);
        zzam.a(hashmap, "av", a);
        zzam.a(hashmap, "aiid", a);
        String s = g;
        if (TextUtils.isEmpty((CharSequence)a.get("adid")))
        {
            flag1 = false;
        }
        obj = new zzh(0L, ((String) (obj)), s, flag1, 0L, hashmap);
        l1 = Tracker.i(h).a(((zzh) (obj)));
        a.put("_s", String.valueOf(l1));
        obj = new zzab(h, a, l, f);
        Tracker.j(h).a(((zzab) (obj)));
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
