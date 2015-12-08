// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            bi, aq, bj, GAUsage, 
//            bk

public class bh
{

    private static final DecimalFormat a;
    private final bj b;
    private final bi c;
    private volatile boolean d;
    private volatile boolean e;
    private long f;
    private long g;
    private boolean h;

    bh()
    {
        d = false;
        e = false;
        f = 0x1d4c0L;
        h = true;
        b = null;
        c = null;
    }

    bh(String s, bj bj1)
    {
        d = false;
        e = false;
        f = 0x1d4c0L;
        h = true;
        if (s == null)
        {
            throw new IllegalArgumentException("trackingId cannot be null");
        } else
        {
            b = bj1;
            c = new bi();
            c.b("trackingId", s);
            c.b("sampleRate", "100");
            c.a("sessionControl", "start");
            c.b("useSecure", Boolean.toString(true));
            return;
        }
    }

    private void a()
    {
        if (d)
        {
            throw new IllegalStateException("Tracker closed");
        } else
        {
            return;
        }
    }

    private void a(String s, Map map)
    {
        e = true;
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        ((Map) (obj)).put("hitType", s);
        c.a(((Map) (obj)), Boolean.valueOf(true));
        if (!b())
        {
            aq.g("Too many hits sent too quickly, throttling invoked.");
        } else
        {
            b.a(c.b());
        }
        c.a();
    }

    private boolean b()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = h;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        long l;
        long l1;
        l = System.currentTimeMillis();
        if (f >= 0x1d4c0L)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        l1 = l - g;
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        f = Math.min(0x1d4c0L, l1 + f);
        g = l;
        if (f >= 2000L)
        {
            f = f - 2000L;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_104;
        Exception exception;
        exception;
        throw exception;
        aq.g("Excessive tracking detected.  Tracking call ignored.");
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(double d1)
    {
        GAUsage.a().a(GAUsage.Field.SET_SAMPLE_RATE);
        c.b("sampleRate", Double.toString(d1));
    }

    public void a(int i, String s)
    {
        if (i <= 0)
        {
            aq.f((new StringBuilder("index must be > 0, ignoring setCustomDimension call for ")).append(i).append(", ").append(s).toString());
            return;
        } else
        {
            c.a(bk.a("customDimension", i), s);
            return;
        }
    }

    public void a(String s)
    {
        if (e)
        {
            aq.g("Tracking already started, setAppName call ignored");
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            aq.g("setting appName to empty value not allowed, call ignored");
            return;
        } else
        {
            GAUsage.a().a(GAUsage.Field.SET_APP_NAME);
            c.b("appName", s);
            return;
        }
    }

    public void a(String s, long l, String s1, String s2)
    {
        a();
        GAUsage.a().a(GAUsage.Field.TRACK_TIMING);
        GAUsage.a().a(true);
        a("timing", b(s, l, s1, s2));
        GAUsage.a().a(false);
    }

    public void a(String s, String s1, String s2, Long long1)
    {
        a();
        GAUsage.a().a(GAUsage.Field.TRACK_EVENT);
        GAUsage.a().a(true);
        a("event", b(s, s1, s2, long1));
        GAUsage.a().a(false);
    }

    public void a(boolean flag)
    {
        GAUsage.a().a(GAUsage.Field.SET_ANONYMIZE_IP);
        c.b("anonymizeIp", Boolean.toString(flag));
    }

    public Map b(String s, long l, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("timingCategory", s);
        hashmap.put("timingValue", Long.toString(l));
        hashmap.put("timingVar", s1);
        hashmap.put("timingLabel", s2);
        GAUsage.a().a(GAUsage.Field.CONSTRUCT_TIMING);
        return hashmap;
    }

    public Map b(String s, String s1, String s2, Long long1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("eventCategory", s);
        hashmap.put("eventAction", s1);
        hashmap.put("eventLabel", s2);
        if (long1 != null)
        {
            hashmap.put("eventValue", Long.toString(long1.longValue()));
        }
        GAUsage.a().a(GAUsage.Field.CONSTRUCT_EVENT);
        return hashmap;
    }

    public void b(String s)
    {
        if (e)
        {
            aq.g("Tracking already started, setAppVersion call ignored");
            return;
        } else
        {
            GAUsage.a().a(GAUsage.Field.SET_APP_VERSION);
            c.b("appVersion", s);
            return;
        }
    }

    public void c(String s)
    {
        a();
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalStateException("trackView requires a appScreen to be set");
        } else
        {
            GAUsage.a().a(GAUsage.Field.TRACK_VIEW_WITH_APPSCREEN);
            c.b("description", s);
            a("appview", ((Map) (null)));
            return;
        }
    }

    public void d(String s)
    {
        a();
        GAUsage.a().a(GAUsage.Field.TRACK_EXCEPTION_WITH_DESCRIPTION);
        GAUsage.a().a(true);
        a("exception", e(s));
        GAUsage.a().a(false);
    }

    public Map e(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("exDescription", s);
        hashmap.put("exFatal", Boolean.toString(true));
        GAUsage.a().a(GAUsage.Field.CONSTRUCT_EXCEPTION);
        return hashmap;
    }

    static 
    {
        a = new DecimalFormat("0.######", new DecimalFormatSymbols(Locale.US));
    }
}
