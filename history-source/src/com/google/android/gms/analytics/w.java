// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
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
//            ak, GoogleAnalytics, b, f, 
//            ae, d, v, c

class w
    implements ak, c.b, c.c
{
    private static final class a extends Enum
    {

        public static final a zA;
        public static final a zB;
        public static final a zC;
        public static final a zD;
        private static final a zE[];
        public static final a zx;
        public static final a zy;
        public static final a zz;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/w$a, s);
        }

        public static a[] values()
        {
            return (a[])zE.clone();
        }

        static 
        {
            zx = new a("CONNECTING", 0);
            zy = new a("CONNECTED_SERVICE", 1);
            zz = new a("CONNECTED_LOCAL", 2);
            zA = new a("BLOCKED", 3);
            zB = new a("PENDING_CONNECTION", 4);
            zC = new a("PENDING_DISCONNECT", 5);
            zD = new a("DISCONNECTED", 6);
            zE = (new a[] {
                zx, zy, zz, zA, zB, zC, zD
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }

    private class b extends TimerTask
    {

        final w zv;

        public void run()
        {
            if (w.b(zv) == a.zy && w.e(zv).isEmpty() && w.f(zv) + w.g(zv) < w.h(zv).elapsedRealtime())
            {
                ae.V("Disconnecting due to inactivity");
                w.i(zv);
                return;
            } else
            {
                w.j(zv).schedule(zv. new b(), w.g(zv));
                return;
            }
        }

        private b()
        {
            zv = w.this;
            super();
        }

    }

    private class c extends TimerTask
    {

        final w zv;

        public void run()
        {
            if (w.b(zv) == a.zx)
            {
                w.c(zv);
            }
        }

        private c()
        {
            zv = w.this;
            super();
        }

    }

    private static class d
    {

        private final Map zF;
        private final long zG;
        private final String zH;
        private final List zI;

        public Map eH()
        {
            return zF;
        }

        public long eI()
        {
            return zG;
        }

        public List eJ()
        {
            return zI;
        }

        public String getPath()
        {
            return zH;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("PATH: ");
            stringbuilder.append(zH);
            if (zF != null)
            {
                stringbuilder.append("  PARAMS: ");
                for (Iterator iterator = zF.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
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
            zF = map;
            zG = l;
            zH = s;
            zI = list;
        }
    }

    private class e extends TimerTask
    {

        final w zv;

        public void run()
        {
            w.d(zv);
        }

        private e()
        {
            zv = w.this;
            super();
        }

    }


    private final Context mContext;
    private ld wb;
    private com.google.android.gms.analytics.d yU;
    private final f yV;
    private boolean yX;
    private volatile long zh;
    private volatile a zi;
    private volatile com.google.android.gms.analytics.b zj;
    private com.google.android.gms.analytics.d zk;
    private final GoogleAnalytics zl;
    private final Queue zm;
    private volatile int zn;
    private volatile Timer zo;
    private volatile Timer zp;
    private volatile Timer zq;
    private boolean zr;
    private boolean zs;
    private boolean zt;
    private long zu;

    w(Context context, f f1)
    {
        this(context, f1, null, GoogleAnalytics.getInstance(context));
    }

    w(Context context, f f1, com.google.android.gms.analytics.d d1, GoogleAnalytics googleanalytics)
    {
        zm = new ConcurrentLinkedQueue();
        zu = 0x493e0L;
        zk = d1;
        mContext = context;
        yV = f1;
        zl = googleanalytics;
        wb = lf._mthif();
        zn = 0;
        zi = a.zD;
    }

    private Timer a(Timer timer)
    {
        if (timer != null)
        {
            timer.cancel();
        }
        return null;
    }

    static void a(w w1)
    {
        w1.eC();
    }

    static a b(w w1)
    {
        return w1.zi;
    }

    static void c(w w1)
    {
        w1.eE();
    }

    private void cJ()
    {
        this;
        JVM INSTR monitorenter ;
        if (zj != null && zi == a.zy)
        {
            zi = a.zC;
            zj.disconnect();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void d(w w1)
    {
        w1.eF();
    }

    static Queue e(w w1)
    {
        return w1.zm;
    }

    private void eA()
    {
        zo = a(zo);
        zp = a(zp);
        zq = a(zq);
    }

    private void eC()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(yV.getThread())) goto _L2; else goto _L1
_L1:
        yV.dX().add(new Runnable() {

            final w zv;

            public void run()
            {
                w.a(zv);
            }

            
            {
                zv = w.this;
                super();
            }
        });
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (zr)
        {
            dQ();
        }
        static class _cls2
        {

            static final int zw[];

            static 
            {
                zw = new int[a.values().length];
                try
                {
                    zw[a.zz.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    zw[a.zy.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    zw[a.zx.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    zw[a.zB.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    zw[a.zC.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zw[a.zD.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zw[a.zA.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.zw[zi.ordinal()];
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
        for (; !zm.isEmpty(); yU.a(d1.eH(), d1.eI(), d1.getPath(), d1.eJ()))
        {
            d1 = (d)zm.poll();
            ae.V((new StringBuilder()).append("Sending hit to store  ").append(d1).toString());
        }

          goto _L8
        Exception exception;
        exception;
        throw exception;
_L7:
        ae.V("Blocked. Dropping hits.");
        zm.clear();
          goto _L3
_L8:
        if (!yX) goto _L3; else goto _L9
_L9:
        eD();
          goto _L3
_L5:
        if (zm.isEmpty()) goto _L11; else goto _L10
_L10:
        d d2;
        d2 = (d)zm.peek();
        ae.V((new StringBuilder()).append("Sending hit to service   ").append(d2).toString());
        if (zl.isDryRunEnabled()) goto _L13; else goto _L12
_L12:
        zj.a(d2.eH(), d2.eI(), d2.getPath(), d2.eJ());
_L14:
        zm.poll();
          goto _L5
_L13:
        ae.V("Dry run enabled. Hit not actually sent to service.");
          goto _L14
_L11:
        zh = wb.elapsedRealtime();
          goto _L3
_L6:
        ae.V("Need to reconnect");
        if (!zm.isEmpty())
        {
            eF();
        }
          goto _L3
    }

    private void eD()
    {
        yU.dispatch();
        yX = false;
    }

    private void eE()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        a1 = zi;
        a2 = a.zz;
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
        zi = a.zA;
        zj.disconnect();
        ae.W("Attempted to fall back to local store from service.");
          goto _L1
        Exception exception;
        exception;
        throw exception;
        eA();
        ae.V("falling back to local store");
        if (zk == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        yU = zk;
_L3:
        zi = a.zz;
        eC();
          goto _L1
        v v1 = v.eu();
        v1.a(mContext, yV);
        yU = v1.ex();
          goto _L3
    }

    private void eF()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        if (zt || zj == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        a1 = zi;
        a2 = a.zz;
        if (a1 == a2)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        zn = zn + 1;
        a(zp);
        zi = a.zx;
        zp = new Timer("Failed Connect");
        zp.schedule(new c(), 3000L);
        ae.V("connecting to Analytics service");
        zj.connect();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ae.W("security exception on connectToService");
        eE();
          goto _L1
        obj;
        throw obj;
        ae.W("client not initialized.");
        eE();
          goto _L1
    }

    private void eG()
    {
        zo = a(zo);
        zo = new Timer("Service Reconnect");
        zo.schedule(new e(), 5000L);
    }

    static long f(w w1)
    {
        return w1.zh;
    }

    static long g(w w1)
    {
        return w1.zu;
    }

    static ld h(w w1)
    {
        return w1.wb;
    }

    static void i(w w1)
    {
        w1.cJ();
    }

    static Timer j(w w1)
    {
        return w1.zq;
    }

    public void a(int k, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        zi = a.zB;
        if (zn >= 2) goto _L2; else goto _L1
_L1:
        ae.W((new StringBuilder()).append("Service unavailable (code=").append(k).append("), will retry.").toString());
        eG();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ae.W((new StringBuilder()).append("Service unavailable (code=").append(k).append("), using local store.").toString());
        eE();
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        throw intent;
    }

    public void b(Map map, long l, String s, List list)
    {
        ae.V("putHit called");
        zm.add(new d(map, l, s, list));
        eC();
    }

    public void dQ()
    {
        ae.V("clearHits called");
        zm.clear();
        switch (_cls2.zw[zi.ordinal()])
        {
        default:
            zr = true;
            return;

        case 1: // '\001'
            yU.l(0L);
            zr = false;
            return;

        case 2: // '\002'
            zj.dQ();
            break;
        }
        zr = false;
    }

    public void dW()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zt;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ae.V("setForceLocalDispatch called.");
        zt = true;
        _cls2.zw[zi.ordinal()];
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
        cJ();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L5:
        zs = true;
          goto _L1
    }

    public void dispatch()
    {
        switch (_cls2.zw[zi.ordinal()])
        {
        default:
            yX = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            eD();
            break;
        }
    }

    public void eB()
    {
        if (zj != null)
        {
            return;
        } else
        {
            zj = new com.google.android.gms.analytics.c(mContext, this, this);
            eF();
            return;
        }
    }

    public void onConnected()
    {
        this;
        JVM INSTR monitorenter ;
        zp = a(zp);
        zn = 0;
        ae.V("Connected to service");
        zi = a.zy;
        if (!zs) goto _L2; else goto _L1
_L1:
        cJ();
        zs = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        eC();
        zq = a(zq);
        zq = new Timer("disconnect check");
        zq.schedule(new b(), zu);
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
        if (zi != a.zA) goto _L2; else goto _L1
_L1:
        ae.V("Service blocked.");
        eA();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (zi != a.zC)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        ae.V("Disconnected from service");
        eA();
        zi = a.zD;
          goto _L3
        Exception exception;
        exception;
        throw exception;
label0:
        {
            ae.V("Unexpected disconnect.");
            zi = a.zB;
            if (zn >= 2)
            {
                break label0;
            }
            eG();
        }
          goto _L3
        eE();
          goto _L3
    }
}
