// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.fq;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

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

        private i tg;
        private Timer vV;
        private TimerTask vW;
        private boolean vX;
        private boolean vY;
        private int vZ;
        private long wa;
        private boolean wb;
        private long wc;
        final Tracker wd;

        static boolean a(a a1, boolean flag)
        {
            a1.vX = flag;
            return flag;
        }

        private void df()
        {
            GoogleAnalytics googleanalytics = GoogleAnalytics.cM();
            if (googleanalytics == null)
            {
                aa.w("GoogleAnalytics isn't initialized for the Tracker!");
                return;
            }
            if (wa >= 0L || vY)
            {
                googleanalytics.a(Tracker.b(wd));
                return;
            } else
            {
                googleanalytics.b(Tracker.b(wd));
                return;
            }
        }

        private void dg()
        {
            this;
            JVM INSTR monitorenter ;
            if (vV != null)
            {
                vV.cancel();
                vV = null;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public long dc()
        {
            return wa;
        }

        public boolean dd()
        {
            return vY;
        }

        public boolean de()
        {
            boolean flag = wb;
            wb = false;
            return flag;
        }

        boolean dh()
        {
            return wa == 0L || wa > 0L && tg.currentTimeMillis() > wc + wa;
        }

        public void enableAutoActivityTracking(boolean flag)
        {
            vY = flag;
            df();
        }

        public void f(Activity activity)
        {
            u.cy().a(u.a.uQ);
            dg();
            if (!vX && vZ == 0 && dh())
            {
                wb = true;
            }
            vX = true;
            vZ = vZ + 1;
            if (vY)
            {
                HashMap hashmap = new HashMap();
                hashmap.put("&t", "appview");
                u.cy().t(true);
                Tracker tracker = wd;
                if (Tracker.c(wd) != null)
                {
                    activity = Tracker.c(wd).h(activity);
                } else
                {
                    activity = activity.getClass().getCanonicalName();
                }
                tracker.set("&cd", activity);
                wd.send(hashmap);
                u.cy().t(false);
            }
        }

        public void g(Activity activity)
        {
            u.cy().a(u.a.uR);
            vZ = vZ - 1;
            vZ = Math.max(0, vZ);
            wc = tg.currentTimeMillis();
            if (vZ == 0)
            {
                dg();
                vW = new a(this);
                vV = new Timer("waitForActivityStart");
                vV.schedule(vW, 1000L);
            }
        }

        public void setSessionTimeout(long l)
        {
            wa = l;
            df();
        }

        public a()
        {
            wd = Tracker.this;
            super();
            vX = false;
            vY = false;
            vZ = 0;
            wa = -1L;
            wb = false;
            tg = new _cls1(this, Tracker.this);
        }
    }

    private class a.a extends TimerTask
    {

        final a wf;

        public void run()
        {
            a.a(wf, false);
        }

        private a.a(a a1)
        {
            wf = a1;
            super();
        }

    }


    private final TrackerHandler vM;
    private final Map vN;
    private ad vO;
    private final h vP;
    private final ae vQ;
    private final g vR;
    private boolean vS;
    private a vT;
    private aj vU;

    Tracker(String s, TrackerHandler trackerhandler)
    {
        this(s, trackerhandler, h.cb(), ae.cZ(), g.ca(), ((ad) (new z("tracking"))));
    }

    Tracker(String s, TrackerHandler trackerhandler, h h1, ae ae1, g g1, ad ad1)
    {
        vN = new HashMap();
        vM = trackerhandler;
        if (s != null)
        {
            vN.put("&tid", s);
        }
        vN.put("useSecure", "1");
        vP = h1;
        vQ = ae1;
        vR = g1;
        vO = ad1;
        vT = new a();
    }

    static a b(Tracker tracker)
    {
        return tracker.vT;
    }

    static aj c(Tracker tracker)
    {
        return tracker.vU;
    }

    void a(Context context, aj aj1)
    {
        aa.y("Loading Tracker config values.");
        vU = aj1;
        if (vU.dj())
        {
            aj1 = vU.dk();
            set("&tid", aj1);
            aa.y((new StringBuilder()).append("[Tracker] trackingId loaded: ").append(aj1).toString());
        }
        if (vU.dl())
        {
            aj1 = Double.toString(vU.dm());
            set("&sf", aj1);
            aa.y((new StringBuilder()).append("[Tracker] sample frequency loaded: ").append(aj1).toString());
        }
        if (vU.dn())
        {
            setSessionTimeout(vU.getSessionTimeout());
            aa.y((new StringBuilder()).append("[Tracker] session timeout loaded: ").append(dc()).toString());
        }
        if (vU._mthdo())
        {
            enableAutoActivityTracking(vU.dp());
            aa.y((new StringBuilder()).append("[Tracker] auto activity tracking loaded: ").append(dd()).toString());
        }
        if (vU.dq())
        {
            if (vU.dr())
            {
                set("&aip", "1");
                aa.y("[Tracker] anonymize ip loaded: true");
            }
            aa.y("[Tracker] anonymize ip loaded: false");
        }
        vS = vU.ds();
        if (vU.ds())
        {
            Thread.setDefaultUncaughtExceptionHandler(new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), context));
            aa.y((new StringBuilder()).append("[Tracker] report uncaught exceptions loaded: ").append(vS).toString());
        }
    }

    long dc()
    {
        return vT.dc();
    }

    boolean dd()
    {
        return vT.dd();
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        if (!flag)
        {
            vN.put("&ate", null);
            vN.put("&adid", null);
        } else
        {
            if (vN.containsKey("&ate"))
            {
                vN.remove("&ate");
            }
            if (vN.containsKey("&adid"))
            {
                vN.remove("&adid");
                return;
            }
        }
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        vT.enableAutoActivityTracking(flag);
    }

    public String get(String s)
    {
        u.cy().a(u.a.tR);
        if (!TextUtils.isEmpty(s))
        {
            if (vN.containsKey(s))
            {
                return (String)vN.get(s);
            }
            if (s.equals("&ul"))
            {
                return ak.a(Locale.getDefault());
            }
            if (vP != null && vP.C(s))
            {
                return vP.getValue(s);
            }
            if (vQ != null && vQ.C(s))
            {
                return vQ.getValue(s);
            }
            if (vR != null && vR.C(s))
            {
                return vR.getValue(s);
            }
        }
        return null;
    }

    public void send(Map map)
    {
        u.cy().a(u.a.tT);
        HashMap hashmap = new HashMap();
        hashmap.putAll(vN);
        if (map != null)
        {
            hashmap.putAll(map);
        }
        if (TextUtils.isEmpty((CharSequence)hashmap.get("&tid")))
        {
            aa.z(String.format("Missing tracking id (%s) parameter.", new Object[] {
                "&tid"
            }));
        }
        String s = (String)hashmap.get("&t");
        map = s;
        if (TextUtils.isEmpty(s))
        {
            aa.z(String.format("Missing hit type (%s) parameter.", new Object[] {
                "&t"
            }));
            map = "";
        }
        if (vT.de())
        {
            hashmap.put("&sc", "start");
        }
        if (!map.equals("transaction") && !map.equals("item") && !vO.cS())
        {
            aa.z("Too many hits sent too quickly, rate limiting invoked.");
            return;
        } else
        {
            vM.q(hashmap);
            return;
        }
    }

    public void set(String s, String s1)
    {
        fq.b(s, "Key should be non-null");
        u.cy().a(u.a.tS);
        vN.put(s, s1);
    }

    public void setAnonymizeIp(boolean flag)
    {
        set("&aip", ak.u(flag));
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
            aa.z("Invalid width or height. The values should be non-negative.");
            return;
        } else
        {
            set("&sr", (new StringBuilder()).append(i).append("x").append(j).toString());
            return;
        }
    }

    public void setSessionTimeout(long l)
    {
        vT.setSessionTimeout(1000L * l);
    }

    public void setTitle(String s)
    {
        set("&dt", s);
    }

    public void setUseSecure(boolean flag)
    {
        set("useSecure", ak.u(flag));
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

        final Tracker we;
        final a wf;

        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

            
            {
                wf = a1;
                we = tracker;
                super();
            }
    }

}
