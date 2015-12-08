// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.d;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.google.analytics.tracking.android.GAUsage;
import com.google.analytics.tracking.android.aj;
import com.google.analytics.tracking.android.aq;
import com.google.analytics.tracking.android.ax;
import com.google.analytics.tracking.android.ay;
import com.google.analytics.tracking.android.bd;
import com.google.analytics.tracking.android.bh;
import com.google.analytics.tracking.android.n;
import com.google.analytics.tracking.android.p;
import com.google.analytics.tracking.android.r;
import com.google.analytics.tracking.android.u;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.c;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.logging.f;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.x;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.d:
//            b, c

public final class a extends e
{

    private static final String c = "none";
    private static final String d = "wifi";
    private static final String e = "mobile";
    final c a;
    private final com.google.android.libraries.translate.logging.a b;

    public a(Context context)
    {
        n n1;
        boolean flag1;
        flag1 = true;
        super();
        n1 = n.a();
        if (context != null) goto _L2; else goto _L1
_L1:
        aq.b("Context cannot be null");
_L4:
        b = new com.google.android.libraries.translate.logging.a(context, "events_204");
        a = new c(context, "offline_204");
        return;
_L2:
        Object obj = u.a();
        ay ay1 = new ay(context.getApplicationContext());
        aj aj1 = aj.a(context.getApplicationContext());
        if (context == null)
        {
            aq.b("Context cannot be null");
        }
        if (n1.m != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        n1.m = context.getApplicationContext();
        n1.p = aj1;
        n1.q = ((bd) (obj));
        n1.o = ay1;
        n1.b = n1.o.a("ga_trackingId");
        if (TextUtils.isEmpty(n1.b))
        {
            n1.b = n1.o.a("ga_api_key");
            if (TextUtils.isEmpty(n1.b))
            {
                aq.b("EasyTracker requested, but missing required ga_trackingId");
                n1.n = new p(n1);
                continue; /* Loop/switch isn't completed */
            }
        }
        n1.a = true;
        n1.c = n1.o.a("ga_appName");
        n1.d = n1.o.a("ga_appVersion");
        n1.f = n1.o.c("ga_debug");
        n1.g = n1.o.b("ga_sampleFrequency");
        if (n1.g == null)
        {
            n1.g = new Double(n1.o.a("ga_sampleRate", 100));
        }
        n1.e = n1.o.a("ga_dispatchPeriod", 1800);
        n1.l = n1.o.a("ga_sessionTimeout", 30) * 1000;
        boolean flag = flag1;
        if (!n1.o.c("ga_autoActivityTracking"))
        {
            if (n1.o.c("ga_auto_activity_tracking"))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        n1.k = flag;
        n1.h = n1.o.c("ga_anonymizeIp");
        n1.i = n1.o.c("ga_reportUncaughtExceptions");
        n1.n = n1.p.a(n1.b);
        if (!TextUtils.isEmpty(n1.c))
        {
            aq.c((new StringBuilder("setting appName to ")).append(n1.c).toString());
            n1.n.a(n1.c);
        }
        if (n1.d != null)
        {
            n1.n.b(n1.d);
        }
        n1.n.a(n1.h);
        n1.n.a(n1.g.doubleValue());
        obj = n1.p;
        flag = n1.f;
        GAUsage.a().a(com.google.analytics.tracking.android.GAUsage.Field.SET_DEBUG);
        obj.a = flag;
        aq.a = flag;
        n1.q.a(n1.e);
        if (n1.i)
        {
            Thread.UncaughtExceptionHandler uncaughtexceptionhandler = n1.j;
            Object obj1 = uncaughtexceptionhandler;
            if (uncaughtexceptionhandler == null)
            {
                obj1 = new r(n1.n, n1.q, Thread.getDefaultUncaughtExceptionHandler(), n1.m);
            }
            Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (obj1)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static bh a(String s, String s1)
    {
        bh bh1 = n.b();
        if (s != null && s1 != null)
        {
            bh1.a(2, (new StringBuilder(s)).append("|").append(s1).toString());
        }
        if (!TextUtils.isEmpty(s))
        {
            bh1.a(3, s);
        }
        if (!TextUtils.isEmpty(s1))
        {
            bh1.a(4, s1);
        }
        return bh1;
    }

    private f a(String s, String s1, String s2, String s3)
    {
        return new b(this, s1, s2, s, System.currentTimeMillis(), s3);
    }

    private static String a(String s, PackageType packagetype, int i, int j)
    {
        s = new StringBuilder(s);
        if (packagetype == PackageType.WORD_LENS)
        {
            s.append("_wl");
        }
        return s.append("_").append(i).append("_").append(j).toString();
    }

    private static String a(String s, x x1, String s1, String s2, String s3, String s4)
    {
        return (new StringBuilder(s)).append('=').append("olmv=").append(x1.a).append(",olrv=").append(x1.b).append(',').append(s1).append('=').append(s2).append(',').append(s3).append('=').append(s4).toString();
    }

    private static void a(String s, LogParams logparams, String s1, String s2)
    {
        a(s1, s2).a("error", s, logparams.toString(), Long.valueOf(1L));
    }

    static String d(String s)
    {
        byte byte0 = 1;
        if (!s.contains("&otf=2")) goto _L2; else goto _L1
_L1:
        byte0 = 2;
_L4:
        return Integer.toString(byte0);
_L2:
        if (s.contains("&otf=3"))
        {
            byte0 = 3;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static String e(String s)
    {
        if (s.contains("inputm=2"))
        {
            return "keyboard";
        }
        if (s.contains("inputm=5"))
        {
            return "handwriting";
        }
        if (s.contains("inputm=3"))
        {
            return "voice";
        }
        if (s.contains("inputm=6"))
        {
            return "camera";
        } else
        {
            return "none";
        }
    }

    static String f(String s)
    {
        if (s.contains("source=sms"))
        {
            return "sms";
        }
        if (s.contains("source=url"))
        {
            return "url";
        }
        if (s.contains("source=paste"))
        {
            return "paste";
        }
        if (s.contains("source=cvttx"))
        {
            return "reverse";
        } else
        {
            return "none";
        }
    }

    public final f a(x x1, String s, String s1)
    {
        String s2 = a("oltrans", x1, "sl", s, "tl", s1);
        return a(a("offline_trans", PackageType.TRANSLATE, x1.a, x1.b), s, s1, s2);
    }

    public final void a()
    {
        a.a();
    }

    public final void a(int i, LogParams logparams, String s, String s1)
    {
        a((new StringBuilder(12)).append("E").append(i).toString(), logparams, s, s1);
    }

    public final void a(int i, String s, String s1, String s2, int j, int l)
    {
        a(a("offline", PackageType.TRANSLATE, j, l), LogParams.create(s).addParam("code", Integer.valueOf(i)).addParam("sdcard", Environment.getExternalStorageState()), s1, s2);
    }

    public final void a(Event event, long l, String s, String s1, LogParams logparams, int i)
    {
        s = a(s, s1);
        if (i >= 0)
        {
            s.a(8, Integer.toString(i));
        }
        long l1 = System.currentTimeMillis();
        s1 = event.analyticsCategoryName();
        String s2 = event.analyticsEventName();
        if (logparams == null)
        {
            event = null;
        } else
        {
            event = logparams.toString();
        }
        s.a(s1, l1 - l, s2, event);
    }

    public final void a(Event event, String s, String s1)
    {
        a(event, s, s1, ((LogParams) (null)));
    }

    public final void a(Event event, String s, String s1, int i, LogParams logparams)
    {
        s1 = a(s, s1);
        s1.a(8, Integer.toString(i));
        String s2 = event.analyticsCategoryName();
        String s3 = event.analyticsEventName();
        if (logparams == null)
        {
            s = null;
        } else
        {
            s = logparams.toString();
        }
        s1.a(s2, s3, s, Long.valueOf(1L));
        b.a(event);
    }

    public final void a(Event event, String s, String s1, LogParams logparams)
    {
        s1 = a(s, s1);
        String s2 = event.analyticsCategoryName();
        String s3 = event.analyticsEventName();
        if (logparams == null)
        {
            s = null;
        } else
        {
            s = logparams.toString();
        }
        s1.a(s2, s3, s, Long.valueOf(1L));
        b.a(event);
    }

    public final void a(Event event, String s, String s1, String s2)
    {
        s = a(s, s1);
        s.a(5, d(s2));
        s.a(7, e(s2));
        s.a(6, f(s2));
        s.a(event.analyticsCategoryName(), event.analyticsEventName(), null, Long.valueOf(1L));
    }

    public final void a(String s)
    {
        n.b().a(7, s);
    }

    public final void a(String s, OfflinePackage offlinepackage, String s1)
    {
        bh bh1 = n.b();
        String s2;
        if (o.b(Singleton.a()))
        {
            if (o.c(Singleton.a()))
            {
                s2 = d;
            } else
            {
                s2 = e;
            }
        } else
        {
            s2 = c;
        }
        bh1.a(9, s2);
        if (s1 != null)
        {
            bh1.a(10, s1);
        }
        if (offlinepackage.b == PackageType.WORD_LENS)
        {
            s1 = "wordlens_package";
        } else
        {
            s1 = "offline_package";
        }
        bh1.a(s1, a(s, offlinepackage.b, offlinepackage.g, offlinepackage.h), offlinepackage.a, Long.valueOf(1L));
        if (offlinepackage.b == PackageType.WORD_LENS)
        {
            s1 = "wlpkg";
        } else
        {
            s1 = "olpkg";
        }
        a.a(a(s1, offlinepackage.a(), "pkgei", s, "pkgid", offlinepackage.a));
        a.a();
    }

    public final f b(String s, String s1)
    {
        return a("tws", s, s1, ((String) (null)));
    }

    public final void b()
    {
        com.google.android.libraries.translate.offline.o o1;
        PackageType apackagetype[];
        int i;
        int j;
        o1 = (com.google.android.libraries.translate.offline.o)Singleton.c.b();
        apackagetype = PackageType.values();
        j = apackagetype.length;
        i = 0;
_L6:
        if (i >= j) goto _L2; else goto _L1
_L1:
        PackageType packagetype;
        int l;
        packagetype = apackagetype[i];
        l = o1.c(packagetype).size();
        c.a[packagetype.ordinal()];
        JVM INSTR tableswitch 1 2: default 76
    //                   1 85
    //                   2 105;
           goto _L3 _L4 _L5
_L3:
        i++;
          goto _L6
_L4:
        byte byte0 = 11;
_L7:
        n.b().a(byte0, Integer.toString(l));
          goto _L3
_L5:
        byte0 = 1;
          goto _L7
_L2:
          goto _L3
    }

    public final void b(String s)
    {
        n.b().a(6, s);
    }

    public final void c(String s)
    {
        n.b().c(s);
    }
}
