// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.analytics:
//            ag, GoogleAnalytics, b, f, 
//            aa, d, i, r, 
//            c

class s
    implements ag, c.b, c.c
{
    private static final class a extends Enum
    {

        public static final a tk;
        public static final a tl;
        public static final a tm;
        public static final a tn;
        public static final a to;
        public static final a tp;
        public static final a tq;
        private static final a tr[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/s$a, s1);
        }

        public static a[] values()
        {
            return (a[])tr.clone();
        }

        static 
        {
            tk = new a("CONNECTING", 0);
            tl = new a("CONNECTED_SERVICE", 1);
            tm = new a("CONNECTED_LOCAL", 2);
            tn = new a("BLOCKED", 3);
            to = new a("PENDING_CONNECTION", 4);
            tp = new a("PENDING_DISCONNECT", 5);
            tq = new a("DISCONNECTED", 6);
            tr = (new a[] {
                tk, tl, tm, tn, to, tp, tq
            });
        }

        private a(String s1, int k)
        {
            super(s1, k);
        }
    }

    private class b extends TimerTask
    {

        final s ti;

        public void run()
        {
            if (s.b(ti) == a.tl && s.e(ti).isEmpty() && s.f(ti) + s.g(ti) < s.h(ti).currentTimeMillis())
            {
                aa.y("Disconnecting due to inactivity");
                s.i(ti);
                return;
            } else
            {
                s.j(ti).schedule(ti. new b(), s.g(ti));
                return;
            }
        }

        private b()
        {
            ti = s.this;
            super();
        }

    }

    private class c extends TimerTask
    {

        final s ti;

        public void run()
        {
            if (s.b(ti) == a.tk)
            {
                s.c(ti);
            }
        }

        private c()
        {
            ti = s.this;
            super();
        }

    }

    private static class d
    {

        private final Map ts;
        private final long tt;
        private final String tu;
        private final List tv;

        public Map cv()
        {
            return ts;
        }

        public long cw()
        {
            return tt;
        }

        public List cx()
        {
            return tv;
        }

        public String getPath()
        {
            return tu;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("PATH: ");
            stringbuilder.append(tu);
            if (ts != null)
            {
                stringbuilder.append("  PARAMS: ");
                for (Iterator iterator = ts.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    stringbuilder.append((String)entry.getKey());
                    stringbuilder.append("=");
                    stringbuilder.append((String)entry.getValue());
                }

            }
            return stringbuilder.toString();
        }

        public d(Map map, long l, String s1, List list)
        {
            ts = map;
            tt = l;
            tu = s1;
            tv = list;
        }
    }

    private class e extends TimerTask
    {

        final s ti;

        public void run()
        {
            s.d(ti);
        }

        private e()
        {
            ti = s.this;
            super();
        }

    }


    private final Context mContext;
    private com.google.android.gms.analytics.d sG;
    private final f sH;
    private boolean sJ;
    private volatile long sT;
    private volatile a sU;
    private volatile com.google.android.gms.analytics.b sV;
    private com.google.android.gms.analytics.d sW;
    private final GoogleAnalytics sX;
    private final Queue sY;
    private volatile int sZ;
    private volatile Timer ta;
    private volatile Timer tb;
    private volatile Timer tc;
    private boolean td;
    private boolean te;
    private boolean tf;
    private i tg = new i() {

        final s ti;

        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

            
            {
                ti = s.this;
                super();
            }
    };
    private long th;

    s(Context context, f f1)
    {
        this(context, f1, null, GoogleAnalytics.getInstance(context));
    }

    s(Context context, f f1, com.google.android.gms.analytics.d d1, GoogleAnalytics googleanalytics)
    {
        sY = new ConcurrentLinkedQueue();
        th = 0x493e0L;
        sW = d1;
        mContext = context;
        sH = f1;
        sX = googleanalytics;
        sZ = 0;
        sU = a.tq;
    }

    private Timer a(Timer timer)
    {
        if (timer != null)
        {
            timer.cancel();
        }
        return null;
    }

    static void a(s s1)
    {
        s1.cq();
    }

    static a b(s s1)
    {
        return s1.sU;
    }

    private void be()
    {
        this;
        JVM INSTR monitorenter ;
        if (sV != null && sU == a.tl)
        {
            sU = a.tp;
            sV.disconnect();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void c(s s1)
    {
        s1.cs();
    }

    private void co()
    {
        ta = a(ta);
        tb = a(tb);
        tc = a(tc);
    }

    private void cq()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(sH.getThread())) goto _L2; else goto _L1
_L1:
        sH.bZ().add(new Runnable() {

            final s ti;

            public void run()
            {
                s.a(ti);
            }

            
            {
                ti = s.this;
                super();
            }
        });
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (td)
        {
            bR();
        }
        static class _cls3
        {

            static final int tj[];

            static 
            {
                tj = new int[a.values().length];
                try
                {
                    tj[a.tm.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    tj[a.tl.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    tj[a.tk.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    tj[a.to.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    tj[a.tp.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    tj[a.tq.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.tj[sU.ordinal()];
        JVM INSTR tableswitch 1 6: default 342
    //                   1 104
    //                   2 198
    //                   3 342
    //                   4 342
    //                   5 342
    //                   6 317;
           goto _L3 _L4 _L5 _L3 _L3 _L3 _L6
_L4:
        d d1;
        for (; !sY.isEmpty(); sG.a(d1.cv(), d1.cw(), d1.getPath(), d1.cx()))
        {
            d1 = (d)sY.poll();
            aa.y((new StringBuilder()).append("Sending hit to store  ").append(d1).toString());
        }

          goto _L7
        Exception exception;
        exception;
        throw exception;
_L7:
        if (!sJ) goto _L3; else goto _L8
_L8:
        cr();
          goto _L3
_L5:
        if (sY.isEmpty()) goto _L10; else goto _L9
_L9:
        d d2;
        d2 = (d)sY.peek();
        aa.y((new StringBuilder()).append("Sending hit to service   ").append(d2).toString());
        if (sX.isDryRunEnabled()) goto _L12; else goto _L11
_L11:
        sV.a(d2.cv(), d2.cw(), d2.getPath(), d2.cx());
_L13:
        sY.poll();
          goto _L5
_L12:
        aa.y("Dry run enabled. Hit not actually sent to service.");
          goto _L13
_L10:
        sT = tg.currentTimeMillis();
          goto _L3
_L6:
        aa.y("Need to reconnect");
        if (!sY.isEmpty())
        {
            ct();
        }
          goto _L3
    }

    private void cr()
    {
        sG.bW();
        sJ = false;
    }

    private void cs()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        a1 = sU;
        a2 = a.tm;
        if (a1 != a2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        co();
        aa.y("falling back to local store");
        if (sW == null)
        {
            break; /* Loop/switch isn't completed */
        }
        sG = sW;
_L4:
        sU = a.tm;
        cq();
        if (true) goto _L1; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        r r1 = r.ci();
        r1.a(mContext, sH);
        sG = r1.cl();
          goto _L4
    }

    private void ct()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        if (tf || sV == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        a1 = sU;
        a2 = a.tm;
        if (a1 == a2)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        sZ = sZ + 1;
        a(tb);
        sU = a.tk;
        tb = new Timer("Failed Connect");
        tb.schedule(new c(), 3000L);
        aa.y("connecting to Analytics service");
        sV.connect();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        aa.z("security exception on connectToService");
        cs();
          goto _L1
        obj;
        throw obj;
        aa.z("client not initialized.");
        cs();
          goto _L1
    }

    private void cu()
    {
        ta = a(ta);
        ta = new Timer("Service Reconnect");
        ta.schedule(new e(), 5000L);
    }

    static void d(s s1)
    {
        s1.ct();
    }

    static Queue e(s s1)
    {
        return s1.sY;
    }

    static long f(s s1)
    {
        return s1.sT;
    }

    static long g(s s1)
    {
        return s1.th;
    }

    static i h(s s1)
    {
        return s1.tg;
    }

    static void i(s s1)
    {
        s1.be();
    }

    static Timer j(s s1)
    {
        return s1.tc;
    }

    public void a(int k, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        sU = a.to;
        if (sZ >= 2) goto _L2; else goto _L1
_L1:
        aa.z((new StringBuilder()).append("Service unavailable (code=").append(k).append("), will retry.").toString());
        cu();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aa.z((new StringBuilder()).append("Service unavailable (code=").append(k).append("), using local store.").toString());
        cs();
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        throw intent;
    }

    public void b(Map map, long l, String s1, List list)
    {
        aa.y("putHit called");
        sY.add(new d(map, l, s1, list));
        cq();
    }

    public void bR()
    {
        aa.y("clearHits called");
        sY.clear();
        switch (_cls3.tj[sU.ordinal()])
        {
        default:
            td = true;
            return;

        case 1: // '\001'
            sG.j(0L);
            td = false;
            return;

        case 2: // '\002'
            sV.bR();
            break;
        }
        td = false;
    }

    public void bW()
    {
        switch (_cls3.tj[sU.ordinal()])
        {
        default:
            sJ = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            cr();
            break;
        }
    }

    public void bY()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = tf;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aa.y("setForceLocalDispatch called.");
        tf = true;
        _cls3.tj[sU.ordinal()];
        JVM INSTR tableswitch 1 6: default 96
    //                   1 11
    //                   2 76
    //                   3 88
    //                   4 11
    //                   5 11
    //                   6 11;
           goto _L3 _L3 _L4 _L5 _L3 _L3 _L3
_L3:
        if (true) goto _L1; else goto _L6
_L6:
_L4:
        be();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L5:
        te = true;
          goto _L1
    }

    public void cp()
    {
        if (sV != null)
        {
            return;
        } else
        {
            sV = new com.google.android.gms.analytics.c(mContext, this, this);
            ct();
            return;
        }
    }

    public void onConnected()
    {
        this;
        JVM INSTR monitorenter ;
        tb = a(tb);
        sZ = 0;
        aa.y("Connected to service");
        sU = a.tl;
        if (!te) goto _L2; else goto _L1
_L1:
        be();
        te = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        cq();
        tc = a(tc);
        tc = new Timer("disconnect check");
        tc.schedule(new b(), th);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onDisconnected()
    {
        this;
        JVM INSTR monitorenter ;
        if (sU != a.tp) goto _L2; else goto _L1
_L1:
        aa.y("Disconnected from service");
        co();
        sU = a.tq;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aa.y("Unexpected disconnect.");
        sU = a.to;
        if (sZ >= 2)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        cu();
          goto _L3
        Exception exception;
        exception;
        throw exception;
        cs();
          goto _L3
    }
}
