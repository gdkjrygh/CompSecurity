// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzlx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zzad, zzy, zzae, zzah, 
//            TrackerHandler, GoogleAnalytics

public class Tracker
{
    class zza
    {

        private long zzFm;
        private boolean zzFn;
        final Tracker zzFp;
        private zzlv zzmW;

        public boolean zzgG()
        {
            boolean flag = zzFn;
            zzFn = false;
            return flag;
        }

        public zza()
        {
            zzFp = Tracker.this;
            super();
            zzFm = -1L;
            zzmW = zzlx.zzkc();
        }
    }


    private final GoogleAnalytics zzBN;
    private final TrackerHandler zzFe;
    private final Map zzFf = new HashMap();
    private final zzah zzFg;
    private final zza zzFh = new zza();
    private final Map zzsZ = new HashMap();

    Tracker(GoogleAnalytics googleanalytics, String s, TrackerHandler trackerhandler, zzah zzah1)
    {
        zzx.zzl(googleanalytics);
        zzBN = googleanalytics;
        if (trackerhandler == null)
        {
            zzFe = googleanalytics;
        } else
        {
            zzFe = trackerhandler;
        }
        if (s != null)
        {
            zzsZ.put("&tid", s);
        }
        zzsZ.put("useSecure", "1");
        zzsZ.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        if (zzah1 == null)
        {
            zzFg = new zzad("tracking");
        } else
        {
            zzFg = zzah1;
        }
        enableAdvertisingIdCollection(false);
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        if (!flag)
        {
            zzsZ.put("&ate", null);
            zzsZ.put("&adid", null);
        } else
        {
            if (zzsZ.containsKey("&ate"))
            {
                zzsZ.remove("&ate");
            }
            if (zzsZ.containsKey("&adid"))
            {
                zzsZ.remove("&adid");
                return;
            }
        }
    }

    public void send(Map map)
    {
        zzy.zzfV().zza(zzy.zza.zzDg);
        HashMap hashmap = new HashMap();
        hashmap.putAll(zzsZ);
        if (map != null)
        {
            hashmap.putAll(map);
        }
        map = zzFf.keySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            String s = (String)map.next();
            if (!hashmap.containsKey(s))
            {
                hashmap.put(s, zzFf.get(s));
            }
        } while (true);
        zzFf.clear();
        if (TextUtils.isEmpty((CharSequence)hashmap.get("&tid")))
        {
            zzae.zzac(String.format("Missing tracking id (%s) parameter.", new Object[] {
                "&tid"
            }));
        }
        String s1 = (String)hashmap.get("&t");
        map = s1;
        if (TextUtils.isEmpty(s1))
        {
            zzae.zzac(String.format("Missing hit type (%s) parameter.", new Object[] {
                "&t"
            }));
            map = "";
        }
        if (zzFh.zzgG())
        {
            hashmap.put("&sc", "start");
        }
        map = map.toLowerCase();
        if ("screenview".equals(map) || "pageview".equals(map) || "appview".equals(map) || TextUtils.isEmpty(map))
        {
            int j = Integer.parseInt((String)zzsZ.get("&a")) + 1;
            int i = j;
            if (j >= 0x7fffffff)
            {
                i = 1;
            }
            zzsZ.put("&a", Integer.toString(i));
        }
        if (!map.equals("transaction") && !map.equals("item") && !zzFg.zzgv())
        {
            zzae.zzac("Too many hits sent too quickly, rate limiting invoked.");
            return;
        } else
        {
            zzFe.zzx(hashmap);
            return;
        }
    }

    public void set(String s, String s1)
    {
        zzx.zzb(s, "Key should be non-null");
        zzy.zzfV().zza(zzy.zza.zzDf);
        zzsZ.put(s, s1);
    }

    public void setScreenName(String s)
    {
        set("&cd", s);
    }
}
