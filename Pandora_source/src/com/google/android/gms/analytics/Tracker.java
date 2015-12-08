// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zza;
import com.google.android.gms.analytics.internal.zzaa;
import com.google.android.gms.analytics.internal.zzac;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzak;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzg;
import com.google.android.gms.analytics.internal.zzj;
import com.google.android.gms.analytics.internal.zzm;
import com.google.android.gms.analytics.internal.zzt;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzkp;
import com.google.android.gms.internal.zzkr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            ExceptionReporter, GoogleAnalytics

public class Tracker extends zzd
{
    private class a extends zzd
        implements GoogleAnalytics.a
    {

        final Tracker a;
        private boolean b;
        private int c;
        private long d;
        private boolean e;
        private long f;

        private void c()
        {
            if (d >= 0L || b)
            {
                zzfT().zza(com.google.android.gms.analytics.Tracker.zza(a));
                return;
            } else
            {
                zzfT().zzb(com.google.android.gms.analytics.Tracker.zza(a));
                return;
            }
        }

        public void a(long l)
        {
            d = l;
            c();
        }

        public void a(Activity activity)
        {
            if (c == 0 && b())
            {
                e = true;
            }
            c = c + 1;
            if (b)
            {
                Object obj = activity.getIntent();
                if (obj != null)
                {
                    a.setCampaignParamsOnNextHit(((Intent) (obj)).getData());
                }
                HashMap hashmap = new HashMap();
                hashmap.put("&t", "screenview");
                Tracker tracker = a;
                if (Tracker.zzk(a) != null)
                {
                    obj = Tracker.zzk(a).zzq(activity);
                } else
                {
                    obj = activity.getClass().getCanonicalName();
                }
                tracker.set("&cd", ((String) (obj)));
                if (TextUtils.isEmpty((CharSequence)hashmap.get("&dr")))
                {
                    activity = Tracker.zzp(activity);
                    if (!TextUtils.isEmpty(activity))
                    {
                        hashmap.put("&dr", activity);
                    }
                }
                a.send(hashmap);
            }
        }

        public void a(boolean flag)
        {
            b = flag;
            c();
        }

        public boolean a()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            flag = e;
            e = false;
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        public void b(Activity activity)
        {
            c = c - 1;
            c = Math.max(0, c);
            if (c == 0)
            {
                f = zzgG().elapsedRealtime();
            }
        }

        boolean b()
        {
            return zzgG().elapsedRealtime() >= f + Math.max(1000L, d);
        }

        protected void zzgb()
        {
        }

        protected a(zze zze1)
        {
            a = Tracker.this;
            super(zze1);
            d = -1L;
        }
    }


    private boolean zzEK;
    private final Map zzEL = new HashMap();
    private final zzac zzEM;
    private final a zzEN;
    private ExceptionReporter zzEO;
    private zzak zzEP;
    private final Map zzvi = new HashMap();

    Tracker(zze zze1, String s, zzac zzac1)
    {
        super(zze1);
        if (s != null)
        {
            zzvi.put("&tid", s);
        }
        zzvi.put("useSecure", "1");
        zzvi.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        if (zzac1 == null)
        {
            zzEM = new zzac("tracking");
        } else
        {
            zzEM = zzac1;
        }
        zzEN = new a(zze1);
    }

    static a zza(Tracker tracker)
    {
        return tracker.zzEN;
    }

    private static void zza(Map map, Map map1)
    {
        zzv.zzr(map1);
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

    static zza zzb(Tracker tracker)
    {
        return tracker.zzgN();
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
        zzv.zzr(map1);
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

    static zzj zzc(Tracker tracker)
    {
        return tracker.zzgO();
    }

    static zzt zzd(Tracker tracker)
    {
        return tracker.zzgP();
    }

    static zzt zze(Tracker tracker)
    {
        return tracker.zzgP();
    }

    static zzac zzf(Tracker tracker)
    {
        return tracker.zzEM;
    }

    static zzae zzg(Tracker tracker)
    {
        return tracker.zzgH();
    }

    private boolean zzgc()
    {
        return zzEO != null;
    }

    static zzae zzh(Tracker tracker)
    {
        return tracker.zzgH();
    }

    static zzb zzi(Tracker tracker)
    {
        return tracker.zzfZ();
    }

    static zzb zzj(Tracker tracker)
    {
        return tracker.zzfZ();
    }

    static zzak zzk(Tracker tracker)
    {
        return tracker.zzEP;
    }

    static String zzp(Activity activity)
    {
        zzv.zzr(activity);
        activity = activity.getIntent();
        if (activity != null)
        {
            if (!TextUtils.isEmpty(activity = activity.getStringExtra("android.intent.extra.REFERRER_NAME")))
            {
                return activity;
            }
        }
        return null;
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        zzEK = flag;
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        zzEN.a(flag);
    }

    public void enableExceptionReporting(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzgc() != flag)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        android.content.Context context = getContext();
        zzEO = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), context);
        Thread.setDefaultUncaughtExceptionHandler(zzEO);
        zzaF("Uncaught exceptions will be reported to Google Analytics");
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Thread.setDefaultUncaughtExceptionHandler(zzEO.zzfU());
        zzaF("Uncaught exceptions will not be reported to Google Analytics");
          goto _L1
    }

    public String get(String s)
    {
        zzgR();
        if (!TextUtils.isEmpty(s))
        {
            if (zzvi.containsKey(s))
            {
                return (String)zzvi.get(s);
            }
            if (s.equals("&ul"))
            {
                return zzal.zza(Locale.getDefault());
            }
            if (s.equals("&cid"))
            {
                return zzgM().zzhI();
            }
            if (s.equals("&sr"))
            {
                return zzgP().zziy();
            }
            if (s.equals("&aid"))
            {
                return zzgO().zzhq().zzqT();
            }
            if (s.equals("&an"))
            {
                return zzgO().zzhq().zziE();
            }
            if (s.equals("&av"))
            {
                return zzgO().zzhq().zziG();
            }
            if (s.equals("&aiid"))
            {
                return zzgO().zzhq().zzus();
            }
        }
        return null;
    }

    public void send(Map map)
    {
        HashMap hashmap;
        String s;
        long l;
        boolean flag;
        boolean flag1;
        l = zzgG().currentTimeMillis();
        if (zzfT().getAppOptOut())
        {
            zzaG("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        flag = zzfT().isDryRunEnabled();
        hashmap = new HashMap();
        zza(zzvi, hashmap);
        zza(map, hashmap);
        flag1 = zzal.zze((String)zzvi.get("useSecure"), true);
        zzb(zzEL, hashmap);
        zzEL.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            zzgH().zze(hashmap, "Missing hit type parameter");
            return;
        }
        s = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s))
        {
            zzgH().zze(hashmap, "Missing tracking id parameter");
            return;
        }
        boolean flag2 = zzgd();
        this;
        JVM INSTR monitorenter ;
        int j;
        if (!"screenview".equalsIgnoreCase(map) && !"pageview".equalsIgnoreCase(map) && !"appview".equalsIgnoreCase(map) && !TextUtils.isEmpty(map))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        j = Integer.parseInt((String)zzvi.get("&a")) + 1;
        int i;
        i = j;
        if (j >= 0x7fffffff)
        {
            i = 1;
        }
        zzvi.put("&a", Integer.toString(i));
        this;
        JVM INSTR monitorexit ;
        zzgJ().zze(new Runnable(hashmap, flag2, map, l, flag, flag1, s) {

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
                boolean flag4 = true;
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
                boolean flag3;
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
                zzal.zzb(a, "ul", com.google.android.gms.analytics.Tracker.zzd(h).zzix().getLanguage());
                zzal.zzb(a, "sr", com.google.android.gms.analytics.Tracker.zze(h).zziy());
                if (c.equals("transaction") || c.equals("item"))
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (!flag3 && !Tracker.zzf(h).zziU())
                {
                    com.google.android.gms.analytics.Tracker.zzg(h).zze(a, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
                long l2 = zzal.zzaV((String)a.get("ht"));
                long l1 = l2;
                if (l2 == 0L)
                {
                    l1 = d;
                }
                if (e)
                {
                    obj = new zzaa(h, a, l1, f);
                    Tracker.zzh(h).zzc("Dry run enabled. Would have sent hit", obj);
                    return;
                }
                obj = (String)a.get("cid");
                HashMap hashmap1 = new HashMap();
                zzal.zza(hashmap1, "uid", a);
                zzal.zza(hashmap1, "an", a);
                zzal.zza(hashmap1, "aid", a);
                zzal.zza(hashmap1, "av", a);
                zzal.zza(hashmap1, "aiid", a);
                String s1 = g;
                if (TextUtils.isEmpty((CharSequence)a.get("adid")))
                {
                    flag4 = false;
                }
                obj = new zzg(0L, ((String) (obj)), s1, flag4, 0L, hashmap1);
                l2 = Tracker.zzi(h).zza(((zzg) (obj)));
                a.put("_s", String.valueOf(l2));
                obj = new zzaa(h, a, l1, f);
                com.google.android.gms.analytics.Tracker.zzj(h).zza(((zzaa) (obj)));
            }

            
            {
                h = Tracker.this;
                a = map;
                b = flag;
                c = s;
                d = l;
                e = flag1;
                f = flag2;
                g = s1;
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
        zzv.zzb(s, "Key should be non-null");
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            zzvi.put(s, s1);
            return;
        }
    }

    public void setAnonymizeIp(boolean flag)
    {
        set("&aip", zzal.zzH(flag));
    }

    public void setAppId(String s)
    {
        set("&aid", s);
    }

    public void setAppInstallerId(String s)
    {
        set("&aiid", s);
    }

    public void setAppName(String s)
    {
        set("&an", s);
    }

    public void setAppVersion(String s)
    {
        set("&av", s);
    }

    public void setCampaignParamsOnNextHit(Uri uri)
    {
        if (uri != null && !uri.isOpaque())
        {
            if (!TextUtils.isEmpty(uri = uri.getQueryParameter("referrer")))
            {
                uri = Uri.parse((new StringBuilder()).append("http://hostname/?").append(uri).toString());
                String s = uri.getQueryParameter("utm_id");
                if (s != null)
                {
                    zzEL.put("&ci", s);
                }
                s = uri.getQueryParameter("anid");
                if (s != null)
                {
                    zzEL.put("&anid", s);
                }
                s = uri.getQueryParameter("utm_campaign");
                if (s != null)
                {
                    zzEL.put("&cn", s);
                }
                s = uri.getQueryParameter("utm_content");
                if (s != null)
                {
                    zzEL.put("&cc", s);
                }
                s = uri.getQueryParameter("utm_medium");
                if (s != null)
                {
                    zzEL.put("&cm", s);
                }
                s = uri.getQueryParameter("utm_source");
                if (s != null)
                {
                    zzEL.put("&cs", s);
                }
                s = uri.getQueryParameter("utm_term");
                if (s != null)
                {
                    zzEL.put("&ck", s);
                }
                s = uri.getQueryParameter("dclid");
                if (s != null)
                {
                    zzEL.put("&dclid", s);
                }
                s = uri.getQueryParameter("gclid");
                if (s != null)
                {
                    zzEL.put("&gclid", s);
                }
                uri = uri.getQueryParameter("aclid");
                if (uri != null)
                {
                    zzEL.put("&aclid", uri);
                    return;
                }
            }
        }
    }

    public void setClientId(String s)
    {
        set("&cid", s);
    }

    public void setEncoding(String s)
    {
        set("&de", s);
    }

    public void setHostname(String s)
    {
        set("&dh", s);
    }

    public void setLanguage(String s)
    {
        set("&ul", s);
    }

    public void setLocation(String s)
    {
        set("&dl", s);
    }

    public void setPage(String s)
    {
        set("&dp", s);
    }

    public void setReferrer(String s)
    {
        set("&dr", s);
    }

    public void setSampleRate(double d)
    {
        set("&sf", Double.toString(d));
    }

    public void setScreenColors(String s)
    {
        set("&sd", s);
    }

    public void setScreenName(String s)
    {
        set("&cd", s);
    }

    public void setScreenResolution(int i, int j)
    {
        if (i < 0 && j < 0)
        {
            zzaI("Invalid width or height. The values should be non-negative.");
            return;
        } else
        {
            set("&sr", (new StringBuilder()).append(i).append("x").append(j).toString());
            return;
        }
    }

    public void setSessionTimeout(long l)
    {
        zzEN.a(1000L * l);
    }

    public void setTitle(String s)
    {
        set("&dt", s);
    }

    public void setUseSecure(boolean flag)
    {
        set("useSecure", zzal.zzH(flag));
    }

    public void setViewportSize(String s)
    {
        set("&vp", s);
    }

    void zza(zzak zzak1)
    {
        zzaF("Loading Tracker config values");
        zzEP = zzak1;
        if (zzEP.zzjr())
        {
            zzak1 = zzEP.zzjs();
            set("&tid", zzak1);
            zza("trackingId loaded", zzak1);
        }
        if (zzEP.zzjt())
        {
            zzak1 = Double.toString(zzEP.zzju());
            set("&sf", zzak1);
            zza("Sample frequency loaded", zzak1);
        }
        if (zzEP.zzjv())
        {
            int i = zzEP.getSessionTimeout();
            setSessionTimeout(i);
            zza("Session timeout loaded", Integer.valueOf(i));
        }
        if (zzEP.zzjw())
        {
            boolean flag = zzEP.zzjx();
            enableAutoActivityTracking(flag);
            zza("Auto activity tracking loaded", Boolean.valueOf(flag));
        }
        if (zzEP.zzjy())
        {
            boolean flag1 = zzEP.zzjz();
            if (flag1)
            {
                set("&aip", "1");
            }
            zza("Anonymize ip loaded", Boolean.valueOf(flag1));
        }
        enableExceptionReporting(zzEP.zzjA());
    }

    protected void zzgb()
    {
        zzEN.zzfV();
        String s = zzga().zziE();
        if (s != null)
        {
            set("&an", s);
        }
        s = zzga().zziG();
        if (s != null)
        {
            set("&av", s);
        }
    }

    boolean zzgd()
    {
        return zzEK;
    }
}
