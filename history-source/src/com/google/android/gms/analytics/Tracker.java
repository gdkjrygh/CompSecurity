// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            k, ai, g, ad, 
//            ae, am, ExceptionReporter, y, 
//            an, ah, TrackerHandler, GoogleAnalytics

public class Tracker
{
    private class a
        implements GoogleAnalytics.a
    {

        private boolean Co;
        private int Cp;
        private long Cq;
        private boolean Cr;
        private long Cs;
        final Tracker Ct;
        private ld wb;

        private void fq()
        {
            GoogleAnalytics googleanalytics = GoogleAnalytics.eY();
            if (googleanalytics == null)
            {
                ae.T("GoogleAnalytics isn't initialized for the Tracker!");
                return;
            }
            if (Cq >= 0L || Co)
            {
                googleanalytics.a(Tracker.b(Ct));
                return;
            } else
            {
                googleanalytics.b(Tracker.b(Ct));
                return;
            }
        }

        public void enableAutoActivityTracking(boolean flag)
        {
            Co = flag;
            fq();
        }

        public long fn()
        {
            return Cq;
        }

        public boolean fo()
        {
            return Co;
        }

        public boolean fp()
        {
            boolean flag = Cr;
            Cr = false;
            return flag;
        }

        boolean fr()
        {
            return wb.elapsedRealtime() >= Cs + Math.max(1000L, Cq);
        }

        public void i(Activity activity)
        {
            y.eK().a(y.a.Be);
            if (Cp == 0 && fr())
            {
                Cr = true;
            }
            Cp = Cp + 1;
            if (Co)
            {
                Object obj = activity.getIntent();
                if (obj != null)
                {
                    Ct.setCampaignParamsOnNextHit(((Intent) (obj)).getData());
                }
                obj = new HashMap();
                ((Map) (obj)).put("&t", "screenview");
                y.eK().D(true);
                Tracker tracker = Ct;
                if (Tracker.c(Ct) != null)
                {
                    activity = Tracker.c(Ct).k(activity);
                } else
                {
                    activity = activity.getClass().getCanonicalName();
                }
                tracker.set("&cd", activity);
                Ct.send(((Map) (obj)));
                y.eK().D(false);
            }
        }

        public void j(Activity activity)
        {
            y.eK().a(y.a.Bf);
            Cp = Cp - 1;
            Cp = Math.max(0, Cp);
            if (Cp == 0)
            {
                Cs = wb.elapsedRealtime();
            }
        }

        public void setSessionTimeout(long l)
        {
            Cq = l;
            fq();
        }

        public a()
        {
            Ct = Tracker.this;
            super();
            Co = false;
            Cp = 0;
            Cq = -1L;
            Cr = false;
            wb = lf._mthif();
        }
    }


    private final TrackerHandler Ce;
    private final Map Cf;
    private ah Cg;
    private final k Ch;
    private final ai Ci;
    private final g Cj;
    private boolean Ck;
    private a Cl;
    private am Cm;
    private ExceptionReporter Cn;
    private Context mContext;
    private final Map rd;

    Tracker(String s, TrackerHandler trackerhandler, Context context)
    {
        this(s, trackerhandler, k.el(), ai.fl(), g.dZ(), ((ah) (new ad("tracking"))), context);
    }

    Tracker(String s, TrackerHandler trackerhandler, k k1, ai ai1, g g1, ah ah1, Context context)
    {
        rd = new HashMap();
        Cf = new HashMap();
        Ce = trackerhandler;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        }
        if (s != null)
        {
            rd.put("&tid", s);
        }
        rd.put("useSecure", "1");
        Ch = k1;
        Ci = ai1;
        Cj = g1;
        rd.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        Cg = ah1;
        Cl = new a();
        enableAdvertisingIdCollection(false);
    }

    static a b(Tracker tracker)
    {
        return tracker.Cl;
    }

    static am c(Tracker tracker)
    {
        return tracker.Cm;
    }

    void a(am am1)
    {
        ae.V("Loading Tracker config values.");
        Cm = am1;
        if (Cm.ft())
        {
            am1 = Cm.fu();
            set("&tid", am1);
            ae.V((new StringBuilder()).append("[Tracker] trackingId loaded: ").append(am1).toString());
        }
        if (Cm.fv())
        {
            am1 = Double.toString(Cm.fw());
            set("&sf", am1);
            ae.V((new StringBuilder()).append("[Tracker] sample frequency loaded: ").append(am1).toString());
        }
        if (Cm.fx())
        {
            setSessionTimeout(Cm.getSessionTimeout());
            ae.V((new StringBuilder()).append("[Tracker] session timeout loaded: ").append(fn()).toString());
        }
        if (Cm.fy())
        {
            enableAutoActivityTracking(Cm.fz());
            ae.V((new StringBuilder()).append("[Tracker] auto activity tracking loaded: ").append(fo()).toString());
        }
        if (Cm.fA())
        {
            if (Cm.fB())
            {
                set("&aip", "1");
                ae.V("[Tracker] anonymize ip loaded: true");
            }
            ae.V("[Tracker] anonymize ip loaded: false");
        }
        enableExceptionReporting(Cm.fC());
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        if (!flag)
        {
            rd.put("&ate", null);
            rd.put("&adid", null);
        } else
        {
            if (rd.containsKey("&ate"))
            {
                rd.remove("&ate");
            }
            if (rd.containsKey("&adid"))
            {
                rd.remove("&adid");
                return;
            }
        }
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        Cl.enableAutoActivityTracking(flag);
    }

    public void enableExceptionReporting(boolean flag)
    {
        if (Ck == flag)
        {
            return;
        }
        Ck = flag;
        if (flag)
        {
            Cn = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), mContext);
            Thread.setDefaultUncaughtExceptionHandler(Cn);
            ae.V("Uncaught exceptions will be reported to Google Analytics.");
            return;
        }
        if (Cn != null)
        {
            Thread.setDefaultUncaughtExceptionHandler(Cn.et());
        } else
        {
            Thread.setDefaultUncaughtExceptionHandler(null);
        }
        ae.V("Uncaught exceptions will not be reported to Google Analytics.");
    }

    long fn()
    {
        return Cl.fn();
    }

    boolean fo()
    {
        return Cl.fo();
    }

    public String get(String s)
    {
        y.eK().a(y.a.Af);
        if (!TextUtils.isEmpty(s))
        {
            if (rd.containsKey(s))
            {
                return (String)rd.get(s);
            }
            if (s.equals("&ul"))
            {
                return an.a(Locale.getDefault());
            }
            if (Ch != null && Ch.ac(s))
            {
                return Ch.getValue(s);
            }
            if (Ci != null && Ci.ac(s))
            {
                return Ci.getValue(s);
            }
            if (Cj != null && Cj.ac(s))
            {
                return Cj.getValue(s);
            }
        }
        return null;
    }

    public void send(Map map)
    {
        y.eK().a(y.a.Ah);
        HashMap hashmap = new HashMap();
        hashmap.putAll(rd);
        if (map != null)
        {
            hashmap.putAll(map);
        }
        map = Cf.keySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            String s = (String)map.next();
            if (!hashmap.containsKey(s))
            {
                hashmap.put(s, Cf.get(s));
            }
        } while (true);
        Cf.clear();
        if (TextUtils.isEmpty((CharSequence)hashmap.get("&tid")))
        {
            ae.W(String.format("Missing tracking id (%s) parameter.", new Object[] {
                "&tid"
            }));
        }
        String s1 = (String)hashmap.get("&t");
        map = s1;
        if (TextUtils.isEmpty(s1))
        {
            ae.W(String.format("Missing hit type (%s) parameter.", new Object[] {
                "&t"
            }));
            map = "";
        }
        if (Cl.fp())
        {
            hashmap.put("&sc", "start");
        }
        map = map.toLowerCase();
        if ("screenview".equals(map) || "pageview".equals(map) || "appview".equals(map) || TextUtils.isEmpty(map))
        {
            int j = Integer.parseInt((String)rd.get("&a")) + 1;
            int i = j;
            if (j >= 0x7fffffff)
            {
                i = 1;
            }
            rd.put("&a", Integer.toString(i));
        }
        if (!map.equals("transaction") && !map.equals("item") && !Cg.fe())
        {
            ae.W("Too many hits sent too quickly, rate limiting invoked.");
            return;
        } else
        {
            Ce.u(hashmap);
            return;
        }
    }

    public void set(String s, String s1)
    {
        jx.b(s, "Key should be non-null");
        y.eK().a(y.a.Ag);
        rd.put(s, s1);
    }

    public void setAnonymizeIp(boolean flag)
    {
        set("&aip", an.E(flag));
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
        if (uri != null)
        {
            if (!TextUtils.isEmpty(uri = uri.getQueryParameter("referrer")))
            {
                uri = Uri.parse((new StringBuilder()).append("http://hostname/?").append(uri).toString());
                String s = uri.getQueryParameter("utm_id");
                if (s != null)
                {
                    Cf.put("&ci", s);
                }
                s = uri.getQueryParameter("utm_campaign");
                if (s != null)
                {
                    Cf.put("&cn", s);
                }
                s = uri.getQueryParameter("utm_content");
                if (s != null)
                {
                    Cf.put("&cc", s);
                }
                s = uri.getQueryParameter("utm_medium");
                if (s != null)
                {
                    Cf.put("&cm", s);
                }
                s = uri.getQueryParameter("utm_source");
                if (s != null)
                {
                    Cf.put("&cs", s);
                }
                s = uri.getQueryParameter("utm_term");
                if (s != null)
                {
                    Cf.put("&ck", s);
                }
                s = uri.getQueryParameter("dclid");
                if (s != null)
                {
                    Cf.put("&dclid", s);
                }
                uri = uri.getQueryParameter("gclid");
                if (uri != null)
                {
                    Cf.put("&gclid", uri);
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
            ae.W("Invalid width or height. The values should be non-negative.");
            return;
        } else
        {
            set("&sr", (new StringBuilder()).append(i).append("x").append(j).toString());
            return;
        }
    }

    public void setSessionTimeout(long l)
    {
        Cl.setSessionTimeout(1000L * l);
    }

    public void setTitle(String s)
    {
        set("&dt", s);
    }

    public void setUseSecure(boolean flag)
    {
        set("useSecure", an.E(flag));
    }

    public void setViewportSize(String s)
    {
        set("&vp", s);
    }
}
