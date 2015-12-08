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

        public static final a uA;
        public static final a uB;
        private static final a uC[];
        public static final a uv;
        public static final a uw;
        public static final a ux;
        public static final a uy;
        public static final a uz;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/s$a, s1);
        }

        public static a[] values()
        {
            return (a[])uC.clone();
        }

        static 
        {
            uv = new a("CONNECTING", 0);
            uw = new a("CONNECTED_SERVICE", 1);
            ux = new a("CONNECTED_LOCAL", 2);
            uy = new a("BLOCKED", 3);
            uz = new a("PENDING_CONNECTION", 4);
            uA = new a("PENDING_DISCONNECT", 5);
            uB = new a("DISCONNECTED", 6);
            uC = (new a[] {
                uv, uw, ux, uy, uz, uA, uB
            });
        }

        private a(String s1, int k)
        {
            super(s1, k);
        }
    }

    private class b extends TimerTask
    {

        final s ut;

        public void run()
        {
            if (s.b(ut) == a.uw && s.e(ut).isEmpty() && s.f(ut) + s.g(ut) < s.h(ut).currentTimeMillis())
            {
                aa.C("Disconnecting due to inactivity");
                s.i(ut);
                return;
            } else
            {
                s.j(ut).schedule(ut. new b(), s.g(ut));
                return;
            }
        }

        private b()
        {
            ut = s.this;
            super();
        }

    }

    private class c extends TimerTask
    {

        final s ut;

        public void run()
        {
            if (s.b(ut) == a.uv)
            {
                s.c(ut);
            }
        }

        private c()
        {
            ut = s.this;
            super();
        }

    }

    private static class d
    {

        private final Map uD;
        private final long uE;
        private final String uF;
        private final List uG;

        public Map cM()
        {
            return uD;
        }

        public long cN()
        {
            return uE;
        }

        public List cO()
        {
            return uG;
        }

        public String getPath()
        {
            return uF;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("PATH: ");
            stringbuilder.append(uF);
            if (uD != null)
            {
                stringbuilder.append("  PARAMS: ");
                for (Iterator iterator = uD.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
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
            uD = map;
            uE = l;
            uF = s1;
            uG = list;
        }
    }

    private class e extends TimerTask
    {

        final s ut;

        public void run()
        {
            s.d(ut);
        }

        private e()
        {
            ut = s.this;
            super();
        }

    }


    private final Context mContext;
    private com.google.android.gms.analytics.d tR;
    private final f tS;
    private boolean tU;
    private volatile long ue;
    private volatile a uf;
    private volatile com.google.android.gms.analytics.b ug;
    private com.google.android.gms.analytics.d uh;
    private final GoogleAnalytics ui;
    private final Queue uj;
    private volatile int uk;
    private volatile Timer ul;
    private volatile Timer um;
    private volatile Timer un;
    private boolean uo;
    private boolean up;
    private boolean uq;
    private i ur = new i() {

        final s ut;

        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

            
            {
                ut = s.this;
                super();
            }
    };
    private long us;

    s(Context context, f f1)
    {
        this(context, f1, null, GoogleAnalytics.getInstance(context));
    }

    s(Context context, f f1, com.google.android.gms.analytics.d d1, GoogleAnalytics googleanalytics)
    {
        uj = new ConcurrentLinkedQueue();
        us = 0x493e0L;
        uh = d1;
        mContext = context;
        tS = f1;
        ui = googleanalytics;
        uk = 0;
        uf = a.uB;
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
        s1.cH();
    }

    static a b(s s1)
    {
        return s1.uf;
    }

    private void bn()
    {
        this;
        JVM INSTR monitorenter ;
        if (ug != null && uf == a.uw)
        {
            uf = a.uA;
            ug.disconnect();
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
        s1.cJ();
    }

    private void cF()
    {
        ul = a(ul);
        um = a(um);
        un = a(un);
    }

    private void cH()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(tS.getThread())) goto _L2; else goto _L1
_L1:
        tS.co().add(new Runnable() {

            final s ut;

            public void run()
            {
                s.a(ut);
            }

            
            {
                ut = s.this;
                super();
            }
        });
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (uo)
        {
            cg();
        }
        static class _cls3
        {

            static final int uu[];

            static 
            {
                uu = new int[a.values().length];
                try
                {
                    uu[a.ux.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    uu[a.uw.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    uu[a.uv.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    uu[a.uz.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    uu[a.uA.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    uu[a.uB.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.uu[uf.ordinal()];
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
        for (; !uj.isEmpty(); tR.a(d1.cM(), d1.cN(), d1.getPath(), d1.cO()))
        {
            d1 = (d)uj.poll();
            aa.C((new StringBuilder()).append("Sending hit to store  ").append(d1).toString());
        }

          goto _L7
        Exception exception;
        exception;
        throw exception;
_L7:
        if (!tU) goto _L3; else goto _L8
_L8:
        cI();
          goto _L3
_L5:
        if (uj.isEmpty()) goto _L10; else goto _L9
_L9:
        d d2;
        d2 = (d)uj.peek();
        aa.C((new StringBuilder()).append("Sending hit to service   ").append(d2).toString());
        if (ui.isDryRunEnabled()) goto _L12; else goto _L11
_L11:
        ug.a(d2.cM(), d2.cN(), d2.getPath(), d2.cO());
_L13:
        uj.poll();
          goto _L5
_L12:
        aa.C("Dry run enabled. Hit not actually sent to service.");
          goto _L13
_L10:
        ue = ur.currentTimeMillis();
          goto _L3
_L6:
        aa.C("Need to reconnect");
        if (!uj.isEmpty())
        {
            cK();
        }
          goto _L3
    }

    private void cI()
    {
        tR.cl();
        tU = false;
    }

    private void cJ()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        a1 = uf;
        a2 = a.ux;
        if (a1 != a2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        cF();
        aa.C("falling back to local store");
        if (uh == null)
        {
            break; /* Loop/switch isn't completed */
        }
        tR = uh;
_L4:
        uf = a.ux;
        cH();
        if (true) goto _L1; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        r r1 = r.cz();
        r1.a(mContext, tS);
        tR = r1.cC();
          goto _L4
    }

    private void cK()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        if (uq || ug == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        a1 = uf;
        a2 = a.ux;
        if (a1 == a2)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        uk = uk + 1;
        a(um);
        uf = a.uv;
        um = new Timer("Failed Connect");
        um.schedule(new c(), 3000L);
        aa.C("connecting to Analytics service");
        ug.connect();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        aa.D("security exception on connectToService");
        cJ();
          goto _L1
        obj;
        throw obj;
        aa.D("client not initialized.");
        cJ();
          goto _L1
    }

    private void cL()
    {
        ul = a(ul);
        ul = new Timer("Service Reconnect");
        ul.schedule(new e(), 5000L);
    }

    static void d(s s1)
    {
        s1.cK();
    }

    static Queue e(s s1)
    {
        return s1.uj;
    }

    static long f(s s1)
    {
        return s1.ue;
    }

    static long g(s s1)
    {
        return s1.us;
    }

    static i h(s s1)
    {
        return s1.ur;
    }

    static void i(s s1)
    {
        s1.bn();
    }

    static Timer j(s s1)
    {
        return s1.un;
    }

    public void a(int k, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        uf = a.uz;
        if (uk >= 2) goto _L2; else goto _L1
_L1:
        aa.D((new StringBuilder()).append("Service unavailable (code=").append(k).append("), will retry.").toString());
        cL();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aa.D((new StringBuilder()).append("Service unavailable (code=").append(k).append("), using local store.").toString());
        cJ();
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        throw intent;
    }

    public void b(Map map, long l, String s1, List list)
    {
        aa.C("putHit called");
        uj.add(new d(map, l, s1, list));
        cH();
    }

    public void cG()
    {
        if (ug != null)
        {
            return;
        } else
        {
            ug = new com.google.android.gms.analytics.c(mContext, this, this);
            cK();
            return;
        }
    }

    public void cg()
    {
        aa.C("clearHits called");
        uj.clear();
        switch (_cls3.uu[uf.ordinal()])
        {
        default:
            uo = true;
            return;

        case 1: // '\001'
            tR.l(0L);
            uo = false;
            return;

        case 2: // '\002'
            ug.cg();
            break;
        }
        uo = false;
    }

    public void cl()
    {
        switch (_cls3.uu[uf.ordinal()])
        {
        default:
            tU = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            cI();
            break;
        }
    }

    public void cn()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = uq;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aa.C("setForceLocalDispatch called.");
        uq = true;
        _cls3.uu[uf.ordinal()];
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
        bn();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L5:
        up = true;
          goto _L1
    }

    public void onConnected()
    {
        this;
        JVM INSTR monitorenter ;
        um = a(um);
        uk = 0;
        aa.C("Connected to service");
        uf = a.uw;
        if (!up) goto _L2; else goto _L1
_L1:
        bn();
        up = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        cH();
        un = a(un);
        un = new Timer("disconnect check");
        un.schedule(new b(), us);
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
        if (uf != a.uA) goto _L2; else goto _L1
_L1:
        aa.C("Disconnected from service");
        cF();
        uf = a.uB;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aa.C("Unexpected disconnect.");
        uf = a.uz;
        if (uk >= 2)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        cL();
          goto _L3
        Exception exception;
        exception;
        throw exception;
        cJ();
          goto _L3
    }
}
