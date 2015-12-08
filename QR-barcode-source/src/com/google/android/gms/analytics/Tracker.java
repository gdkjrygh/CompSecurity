// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jw;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

// Referenced classes of package com.google.android.gms.analytics:
//            h, ad, g, y, 
//            z, ai, ExceptionReporter, t, 
//            aj, ac, TrackerHandler, GoogleAnalytics

public class Tracker
{
    private class a
        implements GoogleAnalytics.a
    {

        final Tracker BA;
        private boolean Bv;
        private int Bw;
        private long Bx;
        private boolean By;
        private long Bz;
        private ju yD;

        private void eW()
        {
            GoogleAnalytics googleanalytics = GoogleAnalytics.eD();
            if (googleanalytics == null)
            {
                z.T("GoogleAnalytics isn't initialized for the Tracker!");
                return;
            }
            if (Bx >= 0L || Bv)
            {
                googleanalytics.a(Tracker.b(BA));
                return;
            } else
            {
                googleanalytics.b(Tracker.b(BA));
                return;
            }
        }

        public long eT()
        {
            return Bx;
        }

        public boolean eU()
        {
            return Bv;
        }

        public boolean eV()
        {
            boolean flag = By;
            By = false;
            return flag;
        }

        boolean eX()
        {
            return yD.elapsedRealtime() >= Bz + Math.max(1000L, Bx);
        }

        public void enableAutoActivityTracking(boolean flag)
        {
            Bv = flag;
            eW();
        }

        public void i(Activity activity)
        {
            t.ep().a(t.a.An);
            if (Bw == 0 && eX())
            {
                By = true;
            }
            Bw = Bw + 1;
            if (Bv)
            {
                HashMap hashmap = new HashMap();
                hashmap.put("&t", "screenview");
                t.ep().B(true);
                Tracker tracker = BA;
                if (Tracker.c(BA) != null)
                {
                    activity = Tracker.c(BA).k(activity);
                } else
                {
                    activity = activity.getClass().getCanonicalName();
                }
                tracker.set("&cd", activity);
                BA.send(hashmap);
                t.ep().B(false);
            }
        }

        public void j(Activity activity)
        {
            t.ep().a(t.a.Ao);
            Bw = Bw - 1;
            Bw = Math.max(0, Bw);
            if (Bw == 0)
            {
                Bz = yD.elapsedRealtime();
            }
        }

        public void setSessionTimeout(long l)
        {
            Bx = l;
            eW();
        }

        public a()
        {
            BA = Tracker.this;
            super();
            Bv = false;
            Bw = 0;
            Bx = -1L;
            By = false;
            yD = jw.hA();
        }
    }


    private final TrackerHandler Bm;
    private ac Bn;
    private final h Bo;
    private final ad Bp;
    private final g Bq;
    private boolean Br;
    private a Bs;
    private ai Bt;
    private ExceptionReporter Bu;
    private Context mContext;
    private final Map qM;

    Tracker(String s, TrackerHandler trackerhandler, Context context)
    {
        this(s, trackerhandler, h.dQ(), ad.eQ(), g.dP(), ((ac) (new y("tracking"))), context);
    }

    Tracker(String s, TrackerHandler trackerhandler, h h1, ad ad1, g g1, ac ac1, Context context)
    {
        qM = new HashMap();
        Bm = trackerhandler;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        }
        if (s != null)
        {
            qM.put("&tid", s);
        }
        qM.put("useSecure", "1");
        Bo = h1;
        Bp = ad1;
        Bq = g1;
        qM.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        Bn = ac1;
        Bs = new a();
        enableAdvertisingIdCollection(false);
    }

    static a b(Tracker tracker)
    {
        return tracker.Bs;
    }

    static ai c(Tracker tracker)
    {
        return tracker.Bt;
    }

    void a(ai ai1)
    {
        z.V("Loading Tracker config values.");
        Bt = ai1;
        if (Bt.eZ())
        {
            ai1 = Bt.fa();
            set("&tid", ai1);
            z.V((new StringBuilder()).append("[Tracker] trackingId loaded: ").append(ai1).toString());
        }
        if (Bt.fb())
        {
            ai1 = Double.toString(Bt.fc());
            set("&sf", ai1);
            z.V((new StringBuilder()).append("[Tracker] sample frequency loaded: ").append(ai1).toString());
        }
        if (Bt.fd())
        {
            setSessionTimeout(Bt.getSessionTimeout());
            z.V((new StringBuilder()).append("[Tracker] session timeout loaded: ").append(eT()).toString());
        }
        if (Bt.fe())
        {
            enableAutoActivityTracking(Bt.ff());
            z.V((new StringBuilder()).append("[Tracker] auto activity tracking loaded: ").append(eU()).toString());
        }
        if (Bt.fg())
        {
            if (Bt.fh())
            {
                set("&aip", "1");
                z.V("[Tracker] anonymize ip loaded: true");
            }
            z.V("[Tracker] anonymize ip loaded: false");
        }
        enableExceptionReporting(Bt.fi());
    }

    long eT()
    {
        return Bs.eT();
    }

    boolean eU()
    {
        return Bs.eU();
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        if (!flag)
        {
            qM.put("&ate", null);
            qM.put("&adid", null);
        } else
        {
            if (qM.containsKey("&ate"))
            {
                qM.remove("&ate");
            }
            if (qM.containsKey("&adid"))
            {
                qM.remove("&adid");
                return;
            }
        }
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        Bs.enableAutoActivityTracking(flag);
    }

    public void enableExceptionReporting(boolean flag)
    {
        if (Br == flag)
        {
            return;
        }
        Br = flag;
        if (flag)
        {
            Bu = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), mContext);
            Thread.setDefaultUncaughtExceptionHandler(Bu);
            z.V("Uncaught exceptions will be reported to Google Analytics.");
            return;
        }
        if (Bu != null)
        {
            Thread.setDefaultUncaughtExceptionHandler(Bu.dY());
        } else
        {
            Thread.setDefaultUncaughtExceptionHandler(null);
        }
        z.V("Uncaught exceptions will not be reported to Google Analytics.");
    }

    public String get(String s)
    {
        t.ep().a(t.a.zo);
        if (!TextUtils.isEmpty(s))
        {
            if (qM.containsKey(s))
            {
                return (String)qM.get(s);
            }
            if (s.equals("&ul"))
            {
                return aj.a(Locale.getDefault());
            }
            if (Bo != null && Bo.ac(s))
            {
                return Bo.getValue(s);
            }
            if (Bp != null && Bp.ac(s))
            {
                return Bp.getValue(s);
            }
            if (Bq != null && Bq.ac(s))
            {
                return Bq.getValue(s);
            }
        }
        return null;
    }

    public void send(Map map)
    {
        t.ep().a(t.a.zq);
        HashMap hashmap = new HashMap();
        hashmap.putAll(qM);
        if (map != null)
        {
            hashmap.putAll(map);
        }
        if (TextUtils.isEmpty((CharSequence)hashmap.get("&tid")))
        {
            z.W(String.format("Missing tracking id (%s) parameter.", new Object[] {
                "&tid"
            }));
        }
        String s = (String)hashmap.get("&t");
        map = s;
        if (TextUtils.isEmpty(s))
        {
            z.W(String.format("Missing hit type (%s) parameter.", new Object[] {
                "&t"
            }));
            map = "";
        }
        if (Bs.eV())
        {
            hashmap.put("&sc", "start");
        }
        map = map.toLowerCase();
        if ("screenview".equals(map) || "pageview".equals(map) || "appview".equals(map) || TextUtils.isEmpty(map))
        {
            int j = Integer.parseInt((String)qM.get("&a")) + 1;
            int i = j;
            if (j >= 0x7fffffff)
            {
                i = 1;
            }
            qM.put("&a", Integer.toString(i));
        }
        if (!map.equals("transaction") && !map.equals("item") && !Bn.eJ())
        {
            z.W("Too many hits sent too quickly, rate limiting invoked.");
            return;
        } else
        {
            Bm.u(hashmap);
            return;
        }
    }

    public void set(String s, String s1)
    {
        o.b(s, "Key should be non-null");
        t.ep().a(t.a.zp);
        qM.put(s, s1);
    }

    public void setAnonymizeIp(boolean flag)
    {
        set("&aip", aj.C(flag));
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
        set("&sf", Double.toHexString(d));
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
            z.W("Invalid width or height. The values should be non-negative.");
            return;
        } else
        {
            set("&sr", (new StringBuilder()).append(i).append("x").append(j).toString());
            return;
        }
    }

    public void setSessionTimeout(long l)
    {
        Bs.setSessionTimeout(1000L * l);
    }

    public void setTitle(String s)
    {
        set("&dt", s);
    }

    public void setUseSecure(boolean flag)
    {
        set("useSecure", aj.C(flag));
    }

    public void setViewportSize(String s)
    {
        set("&vp", s);
    }
}
