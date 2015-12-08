// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.g;
import com.google.android.gms.internal.kn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            k, ag, g, af, 
//            ExceptionReporter, ac, w, TrackerHandler

public final class Tracker
{
    final class a
    {

        private boolean Cl;
        private int Cm;
        private long Cn;
        private boolean Co;
        final Tracker Cq;
        private e wa;

        public final boolean fk()
        {
            boolean flag = Co;
            Co = false;
            return flag;
        }

        public a()
        {
            Cq = Tracker.this;
            super();
            Cl = false;
            Cm = 0;
            Cn = -1L;
            Co = false;
            wa = g.jj();
        }
    }


    private final TrackerHandler Cb;
    private final Map Cc;
    private af Cd;
    private final k Ce;
    private final ag Cf;
    private final com.google.android.gms.analytics.g Cg;
    private boolean Ch;
    private a Ci;
    private ExceptionReporter Ck;
    private Context mContext;
    private final Map re;

    Tracker(String s, TrackerHandler trackerhandler, Context context)
    {
        this(s, trackerhandler, k.eh(), ag.fg(), g.dV(), new af("tracking"), context);
    }

    private Tracker(String s, TrackerHandler trackerhandler, k k1, ag ag1, com.google.android.gms.analytics.g g1, af af1, Context context)
    {
        re = new HashMap();
        Cc = new HashMap();
        Cb = trackerhandler;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        }
        if (s != null)
        {
            re.put("&tid", s);
        }
        re.put("useSecure", "1");
        Ce = k1;
        Cf = ag1;
        Cg = g1;
        re.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        Cd = af1;
        Ci = new a();
        enableAdvertisingIdCollection(false);
    }

    private void enableAdvertisingIdCollection(boolean flag)
    {
        if (!flag)
        {
            re.put("&ate", null);
            re.put("&adid", null);
        } else
        {
            if (re.containsKey("&ate"))
            {
                re.remove("&ate");
            }
            if (re.containsKey("&adid"))
            {
                re.remove("&adid");
                return;
            }
        }
    }

    public final void enableExceptionReporting(boolean flag)
    {
        if (Ch == flag)
        {
            return;
        }
        Ch = flag;
        if (flag)
        {
            Ck = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), mContext);
            Thread.setDefaultUncaughtExceptionHandler(Ck);
            ac.v("Uncaught exceptions will be reported to Google Analytics.");
            return;
        }
        if (Ck != null)
        {
            Thread.setDefaultUncaughtExceptionHandler(Ck.ep());
        } else
        {
            Thread.setDefaultUncaughtExceptionHandler(null);
        }
        ac.v("Uncaught exceptions will not be reported to Google Analytics.");
    }

    public final void send(Map map)
    {
        w.eF().a(w.a.Af);
        HashMap hashmap = new HashMap();
        hashmap.putAll(re);
        if (map != null)
        {
            hashmap.putAll(map);
        }
        map = Cc.keySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            String s = (String)map.next();
            if (!hashmap.containsKey(s))
            {
                hashmap.put(s, Cc.get(s));
            }
        } while (true);
        Cc.clear();
        if (TextUtils.isEmpty((CharSequence)hashmap.get("&tid")))
        {
            ac.w(String.format("Missing tracking id (%s) parameter.", new Object[] {
                "&tid"
            }));
        }
        String s1 = (String)hashmap.get("&t");
        map = s1;
        if (TextUtils.isEmpty(s1))
        {
            ac.w(String.format("Missing hit type (%s) parameter.", new Object[] {
                "&t"
            }));
            map = "";
        }
        if (Ci.fk())
        {
            hashmap.put("&sc", "start");
        }
        map = map.toLowerCase();
        if ("screenview".equals(map) || "pageview".equals(map) || "appview".equals(map) || TextUtils.isEmpty(map))
        {
            int j = Integer.parseInt((String)re.get("&a")) + 1;
            int i = j;
            if (j >= 0x7fffffff)
            {
                i = 1;
            }
            re.put("&a", Integer.toString(i));
        }
        if (!map.equals("transaction") && !map.equals("item") && !Cd.eZ())
        {
            ac.w("Too many hits sent too quickly, rate limiting invoked.");
            return;
        } else
        {
            Cb.sendHit(hashmap);
            return;
        }
    }

    public final void set(String s, String s1)
    {
        kn.b(s, "Key should be non-null");
        w.eF().a(w.a.Ae);
        re.put(s, s1);
    }

    public final void setScreenName(String s)
    {
        set("&cd", s);
    }
}
