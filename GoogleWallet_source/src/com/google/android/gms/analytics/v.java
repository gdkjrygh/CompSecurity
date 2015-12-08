// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.g;
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
//            ai, GoogleAnalytics, b, ac, 
//            d, f, GAServiceManager, c

final class v
    implements ai, c.b, c.c
{
    static final class a extends Enum
    {

        public static final a zA;
        public static final a zB;
        public static final a zC;
        private static final a zD[];
        public static final a zw;
        public static final a zx;
        public static final a zy;
        public static final a zz;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/v$a, s);
        }

        public static a[] values()
        {
            return (a[])zD.clone();
        }

        static 
        {
            zw = new a("CONNECTING", 0);
            zx = new a("CONNECTED_SERVICE", 1);
            zy = new a("CONNECTED_LOCAL", 2);
            zz = new a("BLOCKED", 3);
            zA = new a("PENDING_CONNECTION", 4);
            zB = new a("PENDING_DISCONNECT", 5);
            zC = new a("DISCONNECTED", 6);
            zD = (new a[] {
                zw, zx, zy, zz, zA, zB, zC
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }

    final class b extends TimerTask
    {

        final v zu;

        public final void run()
        {
            if (v.b(zu) == a.zx && com.google.android.gms.analytics.v.e(zu).isEmpty() && v.f(zu) + com.google.android.gms.analytics.v.g(zu) < v.h(zu).elapsedRealtime())
            {
                ac.v("Disconnecting due to inactivity");
                v.i(zu);
                return;
            } else
            {
                v.j(zu).schedule(zu. new b(), com.google.android.gms.analytics.v.g(zu));
                return;
            }
        }

        private b()
        {
            zu = v.this;
            super();
        }

    }

    final class c extends TimerTask
    {

        final v zu;

        public final void run()
        {
            if (v.b(zu) == a.zw)
            {
                v.c(zu);
            }
        }

        private c()
        {
            zu = v.this;
            super();
        }

    }

    static final class d
    {

        private final String path;
        private final Map zE;
        private final long zF;
        private final List zG;

        public final Map eC()
        {
            return zE;
        }

        public final long eD()
        {
            return zF;
        }

        public final List eE()
        {
            return zG;
        }

        public final String getPath()
        {
            return path;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("PATH: ");
            stringbuilder.append(path);
            if (zE != null)
            {
                stringbuilder.append("  PARAMS: ");
                for (Iterator iterator = zE.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
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
            zE = map;
            zF = l;
            path = s;
            zG = list;
        }
    }

    final class e extends TimerTask
    {

        final v zu;

        public final void run()
        {
            v.d(zu);
        }

        private e()
        {
            zu = v.this;
            super();
        }

    }


    private final Context mContext;
    private com.google.android.gms.common.util.e wa;
    private com.google.android.gms.analytics.d yT;
    private final f yU;
    private boolean yW;
    private volatile long zg;
    private volatile a zh;
    private volatile com.google.android.gms.analytics.b zi;
    private com.google.android.gms.analytics.d zj;
    private final GoogleAnalytics zk;
    private final Queue zl;
    private volatile int zm;
    private volatile Timer zn;
    private volatile Timer zo;
    private volatile Timer zp;
    private boolean zq;
    private boolean zr;
    private boolean zs;
    private long zt;

    v(Context context, f f1)
    {
        this(context, f1, null, GoogleAnalytics.getInstance(context));
    }

    private v(Context context, f f1, com.google.android.gms.analytics.d d1, GoogleAnalytics googleanalytics)
    {
        zl = new ConcurrentLinkedQueue();
        zt = 0x493e0L;
        zj = d1;
        mContext = context;
        yU = f1;
        zk = googleanalytics;
        wa = com.google.android.gms.common.util.g.jj();
        zm = 0;
        zh = a.zC;
    }

    private static Timer a(Timer timer)
    {
        if (timer != null)
        {
            timer.cancel();
        }
        return null;
    }

    static void a(v v1)
    {
        v1.ex();
    }

    static a b(v v1)
    {
        return v1.zh;
    }

    static void c(v v1)
    {
        v1.ez();
    }

    private void cJ()
    {
        this;
        JVM INSTR monitorenter ;
        if (zi != null && zh == a.zx)
        {
            zh = a.zB;
            zi.disconnect();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void clearHits()
    {
        ac.v("clearHits called");
        zl.clear();
        static final class _cls2
        {

            static final int zv[];

            static 
            {
                zv = new int[a.values().length];
                try
                {
                    zv[a.zy.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    zv[a.zx.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    zv[a.zw.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    zv[a.zA.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    zv[a.zB.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zv[a.zC.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zv[a.zz.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.zv[zh.ordinal()])
        {
        default:
            zq = true;
            return;

        case 1: // '\001'
            yT.l(0L);
            zq = false;
            return;

        case 2: // '\002'
            zi.clearHits();
            break;
        }
        zq = false;
    }

    static void d(v v1)
    {
        v1.eA();
    }

    static Queue e(v v1)
    {
        return v1.zl;
    }

    private void eA()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        if (zs || zi == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        a1 = zh;
        a2 = a.zy;
        if (a1 == a2)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        zm = zm + 1;
        a(zo);
        zh = a.zw;
        zo = new Timer("Failed Connect");
        zo.schedule(new c(), 3000L);
        ac.v("connecting to Analytics service");
        zi.connect();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ac.w("security exception on connectToService");
        ez();
          goto _L1
        obj;
        throw obj;
        ac.w("client not initialized.");
        ez();
          goto _L1
    }

    private void eB()
    {
        zn = a(zn);
        zn = new Timer("Service Reconnect");
        zn.schedule(new e(), 5000L);
    }

    private void ev()
    {
        zn = a(zn);
        zo = a(zo);
        zp = a(zp);
    }

    private void ex()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(yU.getThread())) goto _L2; else goto _L1
_L1:
        yU.getQueue().add(new Runnable() {

            final v zu;

            public final void run()
            {
                v.a(zu);
            }

            
            {
                zu = v.this;
                super();
            }
        });
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (zq)
        {
            clearHits();
        }
        _cls2.zv[zh.ordinal()];
        JVM INSTR tableswitch 1 7: default 361
    //                   1 108
    //                   2 218
    //                   3 361
    //                   4 361
    //                   5 361
    //                   6 336
    //                   7 186;
           goto _L3 _L4 _L5 _L3 _L3 _L3 _L6 _L7
_L4:
        d d1;
        for (; !zl.isEmpty(); yT.a(d1.eC(), d1.eD(), d1.getPath(), d1.eE()))
        {
            d1 = (d)zl.poll();
            ac.v((new StringBuilder("Sending hit to store  ")).append(d1).toString());
        }

          goto _L8
        Exception exception;
        exception;
        throw exception;
_L7:
        ac.v("Blocked. Dropping hits.");
        zl.clear();
          goto _L3
_L8:
        if (!yW) goto _L3; else goto _L9
_L9:
        ey();
          goto _L3
_L5:
        if (zl.isEmpty()) goto _L11; else goto _L10
_L10:
        d d2;
        d2 = (d)zl.peek();
        ac.v((new StringBuilder("Sending hit to service   ")).append(d2).toString());
        if (zk.isDryRunEnabled()) goto _L13; else goto _L12
_L12:
        zi.a(d2.eC(), d2.eD(), d2.getPath(), d2.eE());
_L14:
        zl.poll();
          goto _L5
_L13:
        ac.v("Dry run enabled. Hit not actually sent to service.");
          goto _L14
_L11:
        zg = wa.elapsedRealtime();
          goto _L3
_L6:
        ac.v("Need to reconnect");
        if (!zl.isEmpty())
        {
            eA();
        }
          goto _L3
    }

    private void ey()
    {
        yT.dispatch();
        yW = false;
    }

    private void ez()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        a1 = zh;
        a2 = a.zy;
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
        zh = a.zz;
        zi.disconnect();
        ac.w("Attempted to fall back to local store from service.");
          goto _L1
        Exception exception;
        exception;
        throw exception;
        ev();
        ac.v("falling back to local store");
        if (zj == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        yT = zj;
_L3:
        zh = a.zy;
        ex();
          goto _L1
        GAServiceManager gaservicemanager = GAServiceManager.getInstance();
        gaservicemanager.a(mContext, yU);
        yT = gaservicemanager.es();
          goto _L3
    }

    static long f(v v1)
    {
        return v1.zg;
    }

    static long g(v v1)
    {
        return v1.zt;
    }

    static com.google.android.gms.common.util.e h(v v1)
    {
        return v1.wa;
    }

    static void i(v v1)
    {
        v1.cJ();
    }

    static Timer j(v v1)
    {
        return v1.zp;
    }

    public final void a(int k, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        zh = a.zA;
        if (zm >= 2) goto _L2; else goto _L1
_L1:
        ac.w((new StringBuilder("Service unavailable (code=")).append(k).append("), will retry.").toString());
        eB();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ac.w((new StringBuilder("Service unavailable (code=")).append(k).append("), using local store.").toString());
        ez();
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        throw intent;
    }

    public final void b(Map map, long l, String s, List list)
    {
        ac.v("putHit called");
        zl.add(new d(map, l, s, list));
        ex();
    }

    public final void dispatch()
    {
        switch (_cls2.zv[zh.ordinal()])
        {
        default:
            yW = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            ey();
            break;
        }
    }

    public final void ew()
    {
        if (zi != null)
        {
            return;
        } else
        {
            zi = new com.google.android.gms.analytics.c(mContext, this, this);
            eA();
            return;
        }
    }

    public final void onConnected()
    {
        this;
        JVM INSTR monitorenter ;
        zo = a(zo);
        zm = 0;
        ac.v("Connected to service");
        zh = a.zx;
        if (!zr) goto _L2; else goto _L1
_L1:
        cJ();
        zr = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ex();
        zp = a(zp);
        zp = new Timer("disconnect check");
        zp.schedule(new b(), zt);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void onDisconnected()
    {
        this;
        JVM INSTR monitorenter ;
        if (zh != a.zz) goto _L2; else goto _L1
_L1:
        ac.v("Service blocked.");
        ev();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (zh != a.zB)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        ac.v("Disconnected from service");
        ev();
        zh = a.zC;
          goto _L3
        Exception exception;
        exception;
        throw exception;
label0:
        {
            ac.v("Unexpected disconnect.");
            zh = a.zA;
            if (zm >= 2)
            {
                break label0;
            }
            eB();
        }
          goto _L3
        ez();
          goto _L3
    }

    public final void setForceLocalDispatch()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zs;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ac.v("setForceLocalDispatch called.");
        zs = true;
        _cls2.zv[zh.ordinal()];
        JVM INSTR tableswitch 1 3: default 84
    //                   1 11
    //                   2 64
    //                   3 76;
           goto _L3 _L3 _L4 _L5
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
        zr = true;
          goto _L1
    }
}
