// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.hn;
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

        private i ur;
        private boolean xl;
        private int xm;
        private long xn;
        private boolean xo;
        private long xp;
        final Tracker xq;

        private void dw()
        {
            GoogleAnalytics googleanalytics = GoogleAnalytics.dd();
            if (googleanalytics == null)
            {
                aa.A("GoogleAnalytics isn't initialized for the Tracker!");
                return;
            }
            if (xn >= 0L || xl)
            {
                googleanalytics.a(Tracker.b(xq));
                return;
            } else
            {
                googleanalytics.b(Tracker.b(xq));
                return;
            }
        }

        public long dt()
        {
            return xn;
        }

        public boolean du()
        {
            return xl;
        }

        public boolean dv()
        {
            boolean flag = xo;
            xo = false;
            return flag;
        }

        boolean dx()
        {
            return ur.currentTimeMillis() >= xp + Math.max(1000L, xn);
        }

        public void enableAutoActivityTracking(boolean flag)
        {
            xl = flag;
            dw();
        }

        public void h(Activity activity)
        {
            u.cP().a(u.a.wb);
            if (xm == 0 && dx())
            {
                xo = true;
            }
            xm = xm + 1;
            if (xl)
            {
                HashMap hashmap = new HashMap();
                hashmap.put("&t", "screenview");
                u.cP().u(true);
                Tracker tracker = xq;
                if (Tracker.c(xq) != null)
                {
                    activity = Tracker.c(xq).j(activity);
                } else
                {
                    activity = activity.getClass().getCanonicalName();
                }
                tracker.set("&cd", activity);
                xq.send(hashmap);
                u.cP().u(false);
            }
        }

        public void i(Activity activity)
        {
            u.cP().a(u.a.wc);
            xm = xm - 1;
            xm = Math.max(0, xm);
            if (xm == 0)
            {
                xp = ur.currentTimeMillis();
            }
        }

        public void setSessionTimeout(long l)
        {
            xn = l;
            dw();
        }

        public a()
        {
            xq = Tracker.this;
            super();
            xl = false;
            xm = 0;
            xn = -1L;
            xo = false;
            ur = new _cls1(this, Tracker.this);
        }
    }


    private Context mContext;
    private final TrackerHandler xb;
    private final Map xc;
    private ad xd;
    private final h xe;
    private final ae xf;
    private final g xg;
    private boolean xh;
    private a xi;
    private aj xj;
    private ExceptionReporter xk;

    Tracker(String s, TrackerHandler trackerhandler, Context context)
    {
        this(s, trackerhandler, h.cq(), ae.dq(), g.cp(), ((ad) (new z("tracking"))), context);
    }

    Tracker(String s, TrackerHandler trackerhandler, h h1, ae ae1, g g1, ad ad1, Context context)
    {
        xc = new HashMap();
        xb = trackerhandler;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        }
        if (s != null)
        {
            xc.put("&tid", s);
        }
        xc.put("useSecure", "1");
        xe = h1;
        xf = ae1;
        xg = g1;
        xc.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        xd = ad1;
        xi = new a();
        enableAdvertisingIdCollection(false);
    }

    static a b(Tracker tracker)
    {
        return tracker.xi;
    }

    static aj c(Tracker tracker)
    {
        return tracker.xj;
    }

    void a(aj aj1)
    {
        aa.C("Loading Tracker config values.");
        xj = aj1;
        if (xj.dz())
        {
            aj1 = xj.dA();
            set("&tid", aj1);
            aa.C((new StringBuilder()).append("[Tracker] trackingId loaded: ").append(aj1).toString());
        }
        if (xj.dB())
        {
            aj1 = Double.toString(xj.dC());
            set("&sf", aj1);
            aa.C((new StringBuilder()).append("[Tracker] sample frequency loaded: ").append(aj1).toString());
        }
        if (xj.dD())
        {
            setSessionTimeout(xj.getSessionTimeout());
            aa.C((new StringBuilder()).append("[Tracker] session timeout loaded: ").append(dt()).toString());
        }
        if (xj.dE())
        {
            enableAutoActivityTracking(xj.dF());
            aa.C((new StringBuilder()).append("[Tracker] auto activity tracking loaded: ").append(du()).toString());
        }
        if (xj.dG())
        {
            if (xj.dH())
            {
                set("&aip", "1");
                aa.C("[Tracker] anonymize ip loaded: true");
            }
            aa.C("[Tracker] anonymize ip loaded: false");
        }
        enableExceptionReporting(xj.dI());
    }

    long dt()
    {
        return xi.dt();
    }

    boolean du()
    {
        return xi.du();
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        if (!flag)
        {
            xc.put("&ate", null);
            xc.put("&adid", null);
        } else
        {
            if (xc.containsKey("&ate"))
            {
                xc.remove("&ate");
            }
            if (xc.containsKey("&adid"))
            {
                xc.remove("&adid");
                return;
            }
        }
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        xi.enableAutoActivityTracking(flag);
    }

    public void enableExceptionReporting(boolean flag)
    {
        if (xh == flag)
        {
            return;
        }
        xh = flag;
        if (flag)
        {
            xk = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), mContext);
            Thread.setDefaultUncaughtExceptionHandler(xk);
            aa.C("Uncaught exceptions will be reported to Google Analytics.");
            return;
        }
        if (xk != null)
        {
            Thread.setDefaultUncaughtExceptionHandler(xk.cy());
        } else
        {
            Thread.setDefaultUncaughtExceptionHandler(null);
        }
        aa.C("Uncaught exceptions will not be reported to Google Analytics.");
    }

    public String get(String s)
    {
        u.cP().a(u.a.vc);
        if (!TextUtils.isEmpty(s))
        {
            if (xc.containsKey(s))
            {
                return (String)xc.get(s);
            }
            if (s.equals("&ul"))
            {
                return ak.a(Locale.getDefault());
            }
            if (xe != null && xe.J(s))
            {
                return xe.getValue(s);
            }
            if (xf != null && xf.J(s))
            {
                return xf.getValue(s);
            }
            if (xg != null && xg.J(s))
            {
                return xg.getValue(s);
            }
        }
        return null;
    }

    public void send(Map map)
    {
        u.cP().a(u.a.ve);
        HashMap hashmap = new HashMap();
        hashmap.putAll(xc);
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
        if (xi.dv())
        {
            hashmap.put("&sc", "start");
        }
        map = map.toLowerCase();
        if ("screenview".equals(map) || "pageview".equals(map) || "appview".equals(map) || TextUtils.isEmpty(map))
        {
            int j = Integer.parseInt((String)xc.get("&a")) + 1;
            int i = j;
            if (j >= 0x7fffffff)
            {
                i = 1;
            }
            xc.put("&a", Integer.toString(i));
        }
        if (!map.equals("transaction") && !map.equals("item") && !xd.dj())
        {
            aa.D("Too many hits sent too quickly, rate limiting invoked.");
            return;
        } else
        {
            xb.p(hashmap);
            return;
        }
    }

    public void set(String s, String s1)
    {
        hn.b(s, "Key should be non-null");
        u.cP().a(u.a.vd);
        xc.put(s, s1);
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
        xi.setSessionTimeout(1000L * l);
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

        final Tracker xr;
        final a xs;

        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

            
            {
                xs = a1;
                xr = tracker;
                super();
            }
    }

}
