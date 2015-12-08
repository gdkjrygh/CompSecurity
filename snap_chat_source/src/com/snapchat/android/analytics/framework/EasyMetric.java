// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import AS;
import IF;
import Ll;
import PB;
import PC;
import android.os.SystemClock;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.ReleaseManager;
import dv;
import ep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            AnalyticsPlatform, FlurryAnalyticsPlatform, UpdateSnapsAnalyticsPlatform, PerformanceMetric, 
//            ErrorMetric

public class EasyMetric
{
    public static class EasyMetricFactory
    {

        public static EasyMetric a(String s)
        {
            return new EasyMetric(s);
        }

        public static EasyMetric a(String s, double d1)
        {
            return new EasyMetric(s, d1);
        }

        public static EasyMetric b(String s)
        {
            return new PerformanceMetric(s);
        }

        public static EasyMetric b(String s, double d1)
        {
            return new PerformanceMetric(s, d1);
        }

        public static EasyMetric c(String s)
        {
            return new ErrorMetric(s);
        }

        public EasyMetricFactory()
        {
        }
    }


    private static int f = 0;
    protected String a;
    protected final ReleaseManager b;
    protected UpdateSnapsAnalyticsPlatform c;
    protected FlurryAnalyticsPlatform d;
    protected ExecutorService e;
    private Map g;
    private Map h;
    private Map i;
    private Map j;
    private long k;
    private long l;
    private long m;
    private final PB n;
    private final AS o;
    private final boolean p;
    private final double q;
    private final List r;

    public EasyMetric()
    {
        this(null, 0.0D);
    }

    public EasyMetric(String s)
    {
        this(s, 0.0D);
    }

    public EasyMetric(String s, double d1)
    {
        this(s, d1, (new PC()).mClock, AS.a(), ReleaseManager.a());
    }

    private EasyMetric(String s, double d1, PB pb, AS as, ReleaseManager releasemanager)
    {
        boolean flag1 = true;
        super();
        k = -1L;
        l = -1L;
        m = -1L;
        r = new ArrayList();
        SnapchatApplication.getDIComponent().a(this);
        boolean flag;
        if (d1 >= 0.0D && d1 <= 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag, "Percentage must be between [0.0, 1.0]");
        a = s;
        if (d1 == 1.0D)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p = flag;
        q = d1;
        n = pb;
        o = as;
        b = releasemanager;
        a(c);
        a(d);
    }

    private EasyMetric a(AnalyticsPlatform analyticsplatform)
    {
        dv.a(analyticsplatform);
        r.add(analyticsplatform);
        return this;
    }

    static void a(EasyMetric easymetric, boolean flag)
    {
        easymetric.c(flag);
    }

    private void c(boolean flag)
    {
        Iterator iterator = r.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AnalyticsPlatform analyticsplatform = (AnalyticsPlatform)iterator.next();
            if (!(analyticsplatform instanceof FlurryAnalyticsPlatform) || flag)
            {
                analyticsplatform.a(a, g, h, i, j);
            }
        } while (true);
    }

    private boolean f()
    {
        return n != null && k != -1L;
    }

    private void g()
    {
        f++;
        c();
        if (a == null)
        {
            throw new NullPointerException("No event name has been set.");
        } else
        {
            Timber.b("EasyMetric", (new StringBuilder("TRACE - ")).append(f).append(" (").append(a).append(") ").append(g).append(" ").append(h).append(" ").append(i).append(" ").append(j).toString(), new Object[0]);
            return;
        }
    }

    private boolean h()
    {
        return SnapchatApplication.isTestRunning() || b.c() || p || Math.random() < q;
    }

    public final EasyMetric a(long l1)
    {
        l = l1;
        a("timeBucket", IF.a(l1));
        if (i == null)
        {
            i = ep.c();
        }
        i.put("time", Long.valueOf(l1));
        i.put("start", Long.valueOf(k));
        i.put("end", Long.valueOf(k + l));
        return this;
    }

    public final EasyMetric a(String s)
    {
        a = s;
        return this;
    }

    public final EasyMetric a(String s, Long long1)
    {
        if (s != null && long1 != null)
        {
            if (j == null)
            {
                j = ep.c();
            }
            j.put(s, long1);
        }
        return this;
    }

    public final EasyMetric a(String s, Object obj)
    {
        dv.a(s);
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = "null";
        }
        if (g == null)
        {
            g = ep.c();
        }
        g.put(s, obj1);
        return this;
    }

    public final EasyMetric a(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            if (h == null)
            {
                h = ep.c();
            }
            h.put(s, s1);
        }
        return this;
    }

    public final EasyMetric a(Map map)
    {
        if (map != null)
        {
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); a((String)entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        return this;
    }

    public final String a()
    {
        return a;
    }

    public final void a(String s, long l1)
    {
        if (f())
        {
            a(s, Long.valueOf(l1));
            Timber.a("EasyMetric", (new StringBuilder()).append(SystemClock.elapsedRealtime() - k).append(", ").append(s).append(" ELAPSED_TIME ").append(l1).toString(), new Object[0]);
        }
    }

    public void a(boolean flag)
    {
        if (h())
        {
            g();
            c(flag);
        }
    }

    public EasyMetric b()
    {
        k = SystemClock.elapsedRealtime();
        m = k;
        return this;
    }

    public final EasyMetric b(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); a((String)entry.getKey(), String.valueOf(entry.getValue())))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return this;
    }

    public final void b(String s)
    {
        if (f())
        {
            long l1 = SystemClock.elapsedRealtime();
            a(s, l1 - m);
            m = l1;
        }
    }

    public void b(boolean flag)
    {
        if (h())
        {
            g();
            e.execute(new Runnable(flag) {

                private boolean a;
                private EasyMetric b;

                public void run()
                {
                    EasyMetric.a(b, a);
                }

            
            {
                b = EasyMetric.this;
                a = flag;
                super();
            }
            });
        }
    }

    public long c()
    {
        if (f())
        {
            boolean flag;
            if (n != null && l != -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                a(SystemClock.elapsedRealtime() - k);
            }
        }
        return l;
    }

    public final EasyMetric d()
    {
        a("travel_mode", Boolean.valueOf(o.mTravelModeEnabled));
        return this;
    }

    public void e()
    {
        a(true);
    }

}
