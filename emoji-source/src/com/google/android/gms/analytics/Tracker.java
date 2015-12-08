// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.hm;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

// Referenced classes of package com.google.android.gms.analytics:
//            h, ae, g, z, 
//            aa, aj, ExceptionReporter, u, 
//            ak, ad, TrackerHandler, GoogleAnalytics, 
//            i

public class Tracker
{
    private class a
        implements GoogleAnalytics.a
    {

        private i uu;
        private boolean xo;
        private int xp;
        private long xq;
        private boolean xr;
        private long xs;
        final Tracker xt;

        private void dB()
        {
            GoogleAnalytics googleanalytics = GoogleAnalytics.di();
            if (googleanalytics == null)
            {
                aa.A("GoogleAnalytics isn't initialized for the Tracker!");
                return;
            }
            if (xq >= 0L || xo)
            {
                googleanalytics.a(Tracker.b(xt));
                return;
            } else
            {
                googleanalytics.b(Tracker.b(xt));
                return;
            }
        }

        public boolean dA()
        {
            boolean flag = xr;
            xr = false;
            return flag;
        }

        boolean dC()
        {
            return uu.currentTimeMillis() >= xs + Math.max(1000L, xq);
        }

        public long dy()
        {
            return xq;
        }

        public boolean dz()
        {
            return xo;
        }

        public void enableAutoActivityTracking(boolean flag)
        {
            xo = flag;
            dB();
        }

        public void h(Activity activity)
        {
            u.cU().a(u.a.we);
            if (xp == 0 && dC())
            {
                xr = true;
            }
            xp = xp + 1;
            if (xo)
            {
                HashMap hashmap = new HashMap();
                hashmap.put("&t", "screenview");
                u.cU().u(true);
                Tracker tracker = xt;
                if (Tracker.c(xt) != null)
                {
                    activity = Tracker.c(xt).j(activity);
                } else
                {
                    activity = activity.getClass().getCanonicalName();
                }
                tracker.set("&cd", activity);
                xt.send(hashmap);
                u.cU().u(false);
            }
        }

        public void i(Activity activity)
        {
            u.cU().a(u.a.wf);
            xp = xp - 1;
            xp = Math.max(0, xp);
            if (xp == 0)
            {
                xs = uu.currentTimeMillis();
            }
        }

        public void setSessionTimeout(long l)
        {
            xq = l;
            dB();
        }

        public a()
        {
            xt = Tracker.this;
            super();
            xo = false;
            xp = 0;
            xq = -1L;
            xr = false;
            uu = new _cls1(this, Tracker.this);
        }
    }


    private Context mContext;
    private final TrackerHandler xe;
    private final Map xf;
    private ad xg;
    private final h xh;
    private final ae xi;
    private final g xj;
    private boolean xk;
    private a xl;
    private aj xm;
    private ExceptionReporter xn;

    Tracker(String s, TrackerHandler trackerhandler, Context context)
    {
        this(s, trackerhandler, h.cv(), ae.dv(), g.cu(), ((ad) (new z("tracking"))), context);
    }

    Tracker(String s, TrackerHandler trackerhandler, h h1, ae ae1, g g1, ad ad1, Context context)
    {
        xf = new HashMap();
        xe = trackerhandler;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        }
        if (s != null)
        {
            xf.put("&tid", s);
        }
        xf.put("useSecure", "1");
        xh = h1;
        xi = ae1;
        xj = g1;
        xf.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        xg = ad1;
        xl = new a();
        enableAdvertisingIdCollection(false);
    }

    static a b(Tracker tracker)
    {
        return tracker.xl;
    }

    static aj c(Tracker tracker)
    {
        return tracker.xm;
    }

    void a(aj aj1)
    {
        aa.C("Loading Tracker config values.");
        xm = aj1;
        if (xm.dE())
        {
            aj1 = xm.dF();
            set("&tid", aj1);
            aa.C((new StringBuilder()).append("[Tracker] trackingId loaded: ").append(aj1).toString());
        }
        if (xm.dG())
        {
            aj1 = Double.toString(xm.dH());
            set("&sf", aj1);
            aa.C((new StringBuilder()).append("[Tracker] sample frequency loaded: ").append(aj1).toString());
        }
        if (xm.dI())
        {
            setSessionTimeout(xm.getSessionTimeout());
            aa.C((new StringBuilder()).append("[Tracker] session timeout loaded: ").append(dy()).toString());
        }
        if (xm.dJ())
        {
            enableAutoActivityTracking(xm.dK());
            aa.C((new StringBuilder()).append("[Tracker] auto activity tracking loaded: ").append(dz()).toString());
        }
        if (xm.dL())
        {
            if (xm.dM())
            {
                set("&aip", "1");
                aa.C("[Tracker] anonymize ip loaded: true");
            }
            aa.C("[Tracker] anonymize ip loaded: false");
        }
        enableExceptionReporting(xm.dN());
    }

    long dy()
    {
        return xl.dy();
    }

    boolean dz()
    {
        return xl.dz();
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        if (!flag)
        {
            xf.put("&ate", null);
            xf.put("&adid", null);
        } else
        {
            if (xf.containsKey("&ate"))
            {
                xf.remove("&ate");
            }
            if (xf.containsKey("&adid"))
            {
                xf.remove("&adid");
                return;
            }
        }
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        xl.enableAutoActivityTracking(flag);
    }

    public void enableExceptionReporting(boolean flag)
    {
        if (xk == flag)
        {
            return;
        }
        xk = flag;
        if (flag)
        {
            xn = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), mContext);
            Thread.setDefaultUncaughtExceptionHandler(xn);
            aa.C("Uncaught exceptions will be reported to Google Analytics.");
            return;
        }
        if (xn != null)
        {
            Thread.setDefaultUncaughtExceptionHandler(xn.cD());
        } else
        {
            Thread.setDefaultUncaughtExceptionHandler(null);
        }
        aa.C("Uncaught exceptions will not be reported to Google Analytics.");
    }

    public String get(String s)
    {
        u.cU().a(u.a.vf);
        if (!TextUtils.isEmpty(s))
        {
            if (xf.containsKey(s))
            {
                return (String)xf.get(s);
            }
            if (s.equals("&ul"))
            {
                return ak.a(Locale.getDefault());
            }
            if (xh != null && xh.J(s))
            {
                return xh.getValue(s);
            }
            if (xi != null && xi.J(s))
            {
                return xi.getValue(s);
            }
            if (xj != null && xj.J(s))
            {
                return xj.getValue(s);
            }
        }
        return null;
    }

    public void send(Map map)
    {
        u.cU().a(u.a.vh);
        HashMap hashmap = new HashMap();
        hashmap.putAll(xf);
        if (map != null)
        {
            hashmap.putAll(map);
        }
        if (TextUtils.isEmpty((CharSequence)hashmap.get("&tid")))
        {
            aa.D(String.format("Missing tracking id (%s) parameter.", new Object[] {
                "&tid"
            }));
        }
        String s = (String)hashmap.get("&t");
        map = s;
        if (TextUtils.isEmpty(s))
        {
            aa.D(String.format("Missing hit type (%s) parameter.", new Object[] {
                "&t"
            }));
            map = "";
        }
        if (xl.dA())
        {
            hashmap.put("&sc", "start");
        }
        map = map.toLowerCase();
        if ("screenview".equals(map) || "pageview".equals(map) || "appview".equals(map) || TextUtils.isEmpty(map))
        {
            int j = Integer.parseInt((String)xf.get("&a")) + 1;
            int i = j;
            if (j >= 0x7fffffff)
            {
                i = 1;
            }
            xf.put("&a", Integer.toString(i));
        }
        if (!map.equals("transaction") && !map.equals("item") && !xg._mthdo())
        {
            aa.D("Too many hits sent too quickly, rate limiting invoked.");
            return;
        } else
        {
            xe.p(hashmap);
            return;
        }
    }

    public void set(String s, String s1)
    {
        hm.b(s, "Key should be non-null");
        u.cU().a(u.a.vg);
        xf.put(s, s1);
    }

    public void setAnonymizeIp(boolean flag)
    {
        set("&aip", ak.v(flag));
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
            aa.D("Invalid width or height. The values should be non-negative.");
            return;
        } else
        {
            set("&sr", (new StringBuilder()).append(i).append("x").append(j).toString());
            return;
        }
    }

    public void setSessionTimeout(long l)
    {
        xl.setSessionTimeout(1000L * l);
    }

    public void setTitle(String s)
    {
        set("&dt", s);
    }

    public void setUseSecure(boolean flag)
    {
        set("useSecure", ak.v(flag));
    }

    public void setViewportSize(String s)
    {
        set("&vp", s);
    }

    // Unreferenced inner class com/google/android/gms/analytics/Tracker$a$1

/* anonymous class */
    class a._cls1
        implements i
    {

        final Tracker xu;
        final a xv;

        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

            
            {
                xv = a1;
                xu = tracker;
                super();
            }
    }

}
