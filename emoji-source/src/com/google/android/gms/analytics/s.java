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
        public static final a uC;
        public static final a uD;
        public static final a uE;
        private static final a uF[];
        public static final a uy;
        public static final a uz;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/s$a, s1);
        }

        public static a[] values()
        {
            return (a[])uF.clone();
        }

        static 
        {
            uy = new a("CONNECTING", 0);
            uz = new a("CONNECTED_SERVICE", 1);
            uA = new a("CONNECTED_LOCAL", 2);
            uB = new a("BLOCKED", 3);
            uC = new a("PENDING_CONNECTION", 4);
            uD = new a("PENDING_DISCONNECT", 5);
            uE = new a("DISCONNECTED", 6);
            uF = (new a[] {
                uy, uz, uA, uB, uC, uD, uE
            });
        }

        private a(String s1, int k)
        {
            super(s1, k);
        }
    }

    private class b extends TimerTask
    {

        final s uw;

        public void run()
        {
            if (s.b(uw) == a.uz && s.e(uw).isEmpty() && s.f(uw) + s.g(uw) < s.h(uw).currentTimeMillis())
            {
                aa.C("Disconnecting due to inactivity");
                s.i(uw);
                return;
            } else
            {
                s.j(uw).schedule(uw. new b(), s.g(uw));
                return;
            }
        }

        private b()
        {
            uw = s.this;
            super();
        }

    }

    private class c extends TimerTask
    {

        final s uw;

        public void run()
        {
            if (s.b(uw) == a.uy)
            {
                s.c(uw);
            }
        }

        private c()
        {
            uw = s.this;
            super();
        }

    }

    private static class d
    {

        private final Map uG;
        private final long uH;
        private final String uI;
        private final List uJ;

        public Map cR()
        {
            return uG;
        }

        public long cS()
        {
            return uH;
        }

        public List cT()
        {
            return uJ;
        }

        public String getPath()
        {
            return uI;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("PATH: ");
            stringbuilder.append(uI);
            if (uG != null)
            {
                stringbuilder.append("  PARAMS: ");
                for (Iterator iterator = uG.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
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
            uG = map;
            uH = l;
            uI = s1;
            uJ = list;
        }
    }

    private class e extends TimerTask
    {

        final s uw;

        public void run()
        {
            s.d(uw);
        }

        private e()
        {
            uw = s.this;
            super();
        }

    }


    private final Context mContext;
    private com.google.android.gms.analytics.d tU;
    private final f tV;
    private boolean tX;
    private volatile long uh;
    private volatile a ui;
    private volatile com.google.android.gms.analytics.b uj;
    private com.google.android.gms.analytics.d uk;
    private final GoogleAnalytics ul;
    private final Queue um;
    private volatile int un;
    private volatile Timer uo;
    private volatile Timer up;
    private volatile Timer uq;
    private boolean ur;
    private boolean us;
    private boolean ut;
    private i uu = new i() {

        final s uw;

        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

            
            {
                uw = s.this;
                super();
            }
    };
    private long uv;

    s(Context context, f f1)
    {
        this(context, f1, null, GoogleAnalytics.getInstance(context));
    }

    s(Context context, f f1, com.google.android.gms.analytics.d d1, GoogleAnalytics googleanalytics)
    {
        um = new ConcurrentLinkedQueue();
        uv = 0x493e0L;
        uk = d1;
        mContext = context;
        tV = f1;
        ul = googleanalytics;
        un = 0;
        ui = a.uE;
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
        s1.cM();
    }

    static a b(s s1)
    {
        return s1.ui;
    }

    private void bs()
    {
        this;
        JVM INSTR monitorenter ;
        if (uj != null && ui == a.uz)
        {
            ui = a.uD;
            uj.disconnect();
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
        s1.cO();
    }

    private void cK()
    {
        uo = a(uo);
        up = a(up);
        uq = a(uq);
    }

    private void cM()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(tV.getThread())) goto _L2; else goto _L1
_L1:
        tV.ct().add(new Runnable() {

            final s uw;

            public void run()
            {
                s.a(uw);
            }

            
            {
                uw = s.this;
                super();
            }
        });
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (ur)
        {
            cl();
        }
        static class _cls3
        {

            static final int ux[];

            static 
            {
                ux = new int[a.values().length];
                try
                {
                    ux[a.uA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    ux[a.uz.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    ux[a.uy.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    ux[a.uC.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    ux[a.uD.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    ux[a.uE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.ux[ui.ordinal()];
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
        for (; !um.isEmpty(); tU.a(d1.cR(), d1.cS(), d1.getPath(), d1.cT()))
        {
            d1 = (d)um.poll();
            aa.C((new StringBuilder()).append("Sending hit to store  ").append(d1).toString());
        }

          goto _L7
        Exception exception;
        exception;
        throw exception;
_L7:
        if (!tX) goto _L3; else goto _L8
_L8:
        cN();
          goto _L3
_L5:
        if (um.isEmpty()) goto _L10; else goto _L9
_L9:
        d d2;
        d2 = (d)um.peek();
        aa.C((new StringBuilder()).append("Sending hit to service   ").append(d2).toString());
        if (ul.isDryRunEnabled()) goto _L12; else goto _L11
_L11:
        uj.a(d2.cR(), d2.cS(), d2.getPath(), d2.cT());
_L13:
        um.poll();
          goto _L5
_L12:
        aa.C("Dry run enabled. Hit not actually sent to service.");
          goto _L13
_L10:
        uh = uu.currentTimeMillis();
          goto _L3
_L6:
        aa.C("Need to reconnect");
        if (!um.isEmpty())
        {
            cP();
        }
          goto _L3
    }

    private void cN()
    {
        tU.cq();
        tX = false;
    }

    private void cO()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        a1 = ui;
        a2 = a.uA;
        if (a1 != a2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        cK();
        aa.C("falling back to local store");
        if (uk == null)
        {
            break; /* Loop/switch isn't completed */
        }
        tU = uk;
_L4:
        ui = a.uA;
        cM();
        if (true) goto _L1; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        r r1 = r.cE();
        r1.a(mContext, tV);
        tU = r1.cH();
          goto _L4
    }

    private void cP()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        if (ut || uj == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        a1 = ui;
        a2 = a.uA;
        if (a1 == a2)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        un = un + 1;
        a(up);
        ui = a.uy;
        up = new Timer("Failed Connect");
        up.schedule(new c(), 3000L);
        aa.C("connecting to Analytics service");
        uj.connect();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        aa.D("security exception on connectToService");
        cO();
          goto _L1
        obj;
        throw obj;
        aa.D("client not initialized.");
        cO();
          goto _L1
    }

    private void cQ()
    {
        uo = a(uo);
        uo = new Timer("Service Reconnect");
        uo.schedule(new e(), 5000L);
    }

    static void d(s s1)
    {
        s1.cP();
    }

    static Queue e(s s1)
    {
        return s1.um;
    }

    static long f(s s1)
    {
        return s1.uh;
    }

    static long g(s s1)
    {
        return s1.uv;
    }

    static i h(s s1)
    {
        return s1.uu;
    }

    static void i(s s1)
    {
        s1.bs();
    }

    static Timer j(s s1)
    {
        return s1.uq;
    }

    public void a(int k, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        ui = a.uC;
        if (un >= 2) goto _L2; else goto _L1
_L1:
        aa.D((new StringBuilder()).append("Service unavailable (code=").append(k).append("), will retry.").toString());
        cQ();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aa.D((new StringBuilder()).append("Service unavailable (code=").append(k).append("), using local store.").toString());
        cO();
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        throw intent;
    }

    public void b(Map map, long l, String s1, List list)
    {
        aa.C("putHit called");
        um.add(new d(map, l, s1, list));
        cM();
    }

    public void cL()
    {
        if (uj != null)
        {
            return;
        } else
        {
            uj = new com.google.android.gms.analytics.c(mContext, this, this);
            cP();
            return;
        }
    }

    public void cl()
    {
        aa.C("clearHits called");
        um.clear();
        switch (_cls3.ux[ui.ordinal()])
        {
        default:
            ur = true;
            return;

        case 1: // '\001'
            tU.l(0L);
            ur = false;
            return;

        case 2: // '\002'
            uj.cl();
            break;
        }
        ur = false;
    }

    public void cq()
    {
        switch (_cls3.ux[ui.ordinal()])
        {
        default:
            tX = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            cN();
            break;
        }
    }

    public void cs()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ut;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aa.C("setForceLocalDispatch called.");
        ut = true;
        _cls3.ux[ui.ordinal()];
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
        bs();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L5:
        us = true;
          goto _L1
    }

    public void onConnected()
    {
        this;
        JVM INSTR monitorenter ;
        up = a(up);
        un = 0;
        aa.C("Connected to service");
        ui = a.uz;
        if (!us) goto _L2; else goto _L1
_L1:
        bs();
        us = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        cM();
        uq = a(uq);
        uq = new Timer("disconnect check");
        uq.schedule(new b(), uv);
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
        if (ui != a.uD) goto _L2; else goto _L1
_L1:
        aa.C("Disconnected from service");
        cK();
        ui = a.uE;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aa.C("Unexpected disconnect.");
        ui = a.uC;
        if (un >= 2)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        cQ();
          goto _L3
        Exception exception;
        exception;
        throw exception;
        cO();
          goto _L3
    }
}
