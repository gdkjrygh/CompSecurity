// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jw;
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
//            af, GoogleAnalytics, b, f, 
//            z, d, q, c

class r
    implements af, c.b, c.c
{
    private static final class a extends Enum
    {

        public static final a yH;
        public static final a yI;
        public static final a yJ;
        public static final a yK;
        public static final a yL;
        public static final a yM;
        public static final a yN;
        private static final a yO[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/r$a, s);
        }

        public static a[] values()
        {
            return (a[])yO.clone();
        }

        static 
        {
            yH = new a("CONNECTING", 0);
            yI = new a("CONNECTED_SERVICE", 1);
            yJ = new a("CONNECTED_LOCAL", 2);
            yK = new a("BLOCKED", 3);
            yL = new a("PENDING_CONNECTION", 4);
            yM = new a("PENDING_DISCONNECT", 5);
            yN = new a("DISCONNECTED", 6);
            yO = (new a[] {
                yH, yI, yJ, yK, yL, yM, yN
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }

    private class b extends TimerTask
    {

        final r yF;

        public void run()
        {
            if (r.b(yF) == a.yI && r.e(yF).isEmpty() && r.f(yF) + r.g(yF) < r.h(yF).elapsedRealtime())
            {
                z.V("Disconnecting due to inactivity");
                r.i(yF);
                return;
            } else
            {
                r.j(yF).schedule(yF. new b(), r.g(yF));
                return;
            }
        }

        private b()
        {
            yF = r.this;
            super();
        }

    }

    private class c extends TimerTask
    {

        final r yF;

        public void run()
        {
            if (r.b(yF) == a.yH)
            {
                r.c(yF);
            }
        }

        private c()
        {
            yF = r.this;
            super();
        }

    }

    private static class d
    {

        private final Map yP;
        private final long yQ;
        private final String yR;
        private final List yS;

        public Map em()
        {
            return yP;
        }

        public long en()
        {
            return yQ;
        }

        public List eo()
        {
            return yS;
        }

        public String getPath()
        {
            return yR;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("PATH: ");
            stringbuilder.append(yR);
            if (yP != null)
            {
                stringbuilder.append("  PARAMS: ");
                for (Iterator iterator = yP.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    stringbuilder.append((String)entry.getKey());
                    stringbuilder.append("=");
                    stringbuilder.append((String)entry.getValue());
                }

            }
            return stringbuilder.toString();
        }

        public d(Map map, long l, String s, List list)
        {
            yP = map;
            yQ = l;
            yR = s;
            yS = list;
        }
    }

    private class e extends TimerTask
    {

        final r yF;

        public void run()
        {
            r.d(yF);
        }

        private e()
        {
            yF = r.this;
            super();
        }

    }


    private final Context mContext;
    private boolean yA;
    private boolean yB;
    private boolean yC;
    private ju yD;
    private long yE;
    private com.google.android.gms.analytics.d yd;
    private final f ye;
    private boolean yg;
    private volatile long yq;
    private volatile a yr;
    private volatile com.google.android.gms.analytics.b ys;
    private com.google.android.gms.analytics.d yt;
    private final GoogleAnalytics yu;
    private final Queue yv;
    private volatile int yw;
    private volatile Timer yx;
    private volatile Timer yy;
    private volatile Timer yz;

    r(Context context, f f1)
    {
        this(context, f1, null, GoogleAnalytics.getInstance(context));
    }

    r(Context context, f f1, com.google.android.gms.analytics.d d1, GoogleAnalytics googleanalytics)
    {
        yv = new ConcurrentLinkedQueue();
        yE = 0x493e0L;
        yt = d1;
        mContext = context;
        ye = f1;
        yu = googleanalytics;
        yD = jw.hA();
        yw = 0;
        yr = a.yN;
    }

    private Timer a(Timer timer)
    {
        if (timer != null)
        {
            timer.cancel();
        }
        return null;
    }

    static void a(r r1)
    {
        r1.eh();
    }

    static a b(r r1)
    {
        return r1.yr;
    }

    static void c(r r1)
    {
        r1.ej();
    }

    private void cC()
    {
        this;
        JVM INSTR monitorenter ;
        if (ys != null && yr == a.yI)
        {
            yr = a.yM;
            ys.disconnect();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void d(r r1)
    {
        r1.ek();
    }

    static Queue e(r r1)
    {
        return r1.yv;
    }

    private void ef()
    {
        yx = a(yx);
        yy = a(yy);
        yz = a(yz);
    }

    private void eh()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(ye.getThread())) goto _L2; else goto _L1
_L1:
        ye.dO().add(new Runnable() {

            final r yF;

            public void run()
            {
                r.a(yF);
            }

            
            {
                yF = r.this;
                super();
            }
        });
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (yA)
        {
            dH();
        }
        static class _cls2
        {

            static final int yG[];

            static 
            {
                yG = new int[a.values().length];
                try
                {
                    yG[a.yJ.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    yG[a.yI.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    yG[a.yH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    yG[a.yL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    yG[a.yM.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    yG[a.yN.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    yG[a.yK.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.yG[yr.ordinal()];
        JVM INSTR tableswitch 1 7: default 365
    //                   1 108
    //                   2 219
    //                   3 365
    //                   4 365
    //                   5 365
    //                   6 340
    //                   7 188;
           goto _L3 _L4 _L5 _L3 _L3 _L3 _L6 _L7
_L4:
        d d1;
        for (; !yv.isEmpty(); yd.a(d1.em(), d1.en(), d1.getPath(), d1.eo()))
        {
            d1 = (d)yv.poll();
            z.V((new StringBuilder()).append("Sending hit to store  ").append(d1).toString());
        }

          goto _L8
        Exception exception;
        exception;
        throw exception;
_L7:
        z.V("Blocked. Dropping hits.");
        yv.clear();
          goto _L3
_L8:
        if (!yg) goto _L3; else goto _L9
_L9:
        ei();
          goto _L3
_L5:
        if (yv.isEmpty()) goto _L11; else goto _L10
_L10:
        d d2;
        d2 = (d)yv.peek();
        z.V((new StringBuilder()).append("Sending hit to service   ").append(d2).toString());
        if (yu.isDryRunEnabled()) goto _L13; else goto _L12
_L12:
        ys.a(d2.em(), d2.en(), d2.getPath(), d2.eo());
_L14:
        yv.poll();
          goto _L5
_L13:
        z.V("Dry run enabled. Hit not actually sent to service.");
          goto _L14
_L11:
        yq = yD.elapsedRealtime();
          goto _L3
_L6:
        z.V("Need to reconnect");
        if (!yv.isEmpty())
        {
            ek();
        }
          goto _L3
    }

    private void ei()
    {
        yd.dispatch();
        yg = false;
    }

    private void ej()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        a1 = yr;
        a2 = a.yJ;
        if (a1 != a2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (mContext == null || !"com.google.android.gms".equals(mContext.getPackageName()))
        {
            break MISSING_BLOCK_LABEL_72;
        }
        yr = a.yK;
        ys.disconnect();
        z.W("Attempted to fall back to local store from service.");
          goto _L1
        Exception exception;
        exception;
        throw exception;
        ef();
        z.V("falling back to local store");
        if (yt == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        yd = yt;
_L3:
        yr = a.yJ;
        eh();
          goto _L1
        q q1 = q.dZ();
        q1.a(mContext, ye);
        yd = q1.ec();
          goto _L3
    }

    private void ek()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        if (yC || ys == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        a1 = yr;
        a2 = a.yJ;
        if (a1 == a2)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        yw = yw + 1;
        a(yy);
        yr = a.yH;
        yy = new Timer("Failed Connect");
        yy.schedule(new c(), 3000L);
        z.V("connecting to Analytics service");
        ys.connect();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        z.W("security exception on connectToService");
        ej();
          goto _L1
        obj;
        throw obj;
        z.W("client not initialized.");
        ej();
          goto _L1
    }

    private void el()
    {
        yx = a(yx);
        yx = new Timer("Service Reconnect");
        yx.schedule(new e(), 5000L);
    }

    static long f(r r1)
    {
        return r1.yq;
    }

    static long g(r r1)
    {
        return r1.yE;
    }

    static ju h(r r1)
    {
        return r1.yD;
    }

    static void i(r r1)
    {
        r1.cC();
    }

    static Timer j(r r1)
    {
        return r1.yz;
    }

    public void a(int k, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        yr = a.yL;
        if (yw >= 2) goto _L2; else goto _L1
_L1:
        z.W((new StringBuilder()).append("Service unavailable (code=").append(k).append("), will retry.").toString());
        el();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        z.W((new StringBuilder()).append("Service unavailable (code=").append(k).append("), using local store.").toString());
        ej();
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        throw intent;
    }

    public void b(Map map, long l, String s, List list)
    {
        z.V("putHit called");
        yv.add(new d(map, l, s, list));
        eh();
    }

    public void dH()
    {
        z.V("clearHits called");
        yv.clear();
        switch (_cls2.yG[yr.ordinal()])
        {
        default:
            yA = true;
            return;

        case 1: // '\001'
            yd.l(0L);
            yA = false;
            return;

        case 2: // '\002'
            ys.dH();
            break;
        }
        yA = false;
    }

    public void dN()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = yC;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        z.V("setForceLocalDispatch called.");
        yC = true;
        _cls2.yG[yr.ordinal()];
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
        cC();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L5:
        yB = true;
          goto _L1
    }

    public void dispatch()
    {
        switch (_cls2.yG[yr.ordinal()])
        {
        default:
            yg = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            ei();
            break;
        }
    }

    public void eg()
    {
        if (ys != null)
        {
            return;
        } else
        {
            ys = new com.google.android.gms.analytics.c(mContext, this, this);
            ek();
            return;
        }
    }

    public void onConnected()
    {
        this;
        JVM INSTR monitorenter ;
        yy = a(yy);
        yw = 0;
        z.V("Connected to service");
        yr = a.yI;
        if (!yB) goto _L2; else goto _L1
_L1:
        cC();
        yB = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        eh();
        yz = a(yz);
        yz = new Timer("disconnect check");
        yz.schedule(new b(), yE);
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
        if (yr != a.yK) goto _L2; else goto _L1
_L1:
        z.V("Service blocked.");
        ef();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (yr != a.yM)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        z.V("Disconnected from service");
        ef();
        yr = a.yN;
          goto _L3
        Exception exception;
        exception;
        throw exception;
label0:
        {
            z.V("Unexpected disconnect.");
            yr = a.yL;
            if (yw >= 2)
            {
                break label0;
            }
            el();
        }
          goto _L3
        ej();
          goto _L3
    }
}
