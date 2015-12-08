// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.flurry.sdk:
//            le, lg, lh, kc, 
//            jy, lb, js, lc, 
//            jb, jo, jx

public class ld
    implements lh.a
{

    private static ld a;
    private static final String b = com/flurry/sdk/ld.getSimpleName();
    private final Map c = new WeakHashMap();
    private final le d = new le();
    private final Object e = new Object();
    private long f;
    private long g;
    private lb h;
    private jx i;
    private jx j;

    private ld()
    {
        i = new _cls1();
        j = new _cls2();
        lg lg1 = lg.a();
        f = 0L;
        g = ((Long)lg1.a("ContinueSessionMillis")).longValue();
        lg1.a("ContinueSessionMillis", this);
        kc.a(4, b, (new StringBuilder("initSettings, ContinueSessionMillis = ")).append(g).toString());
        jy.a().a("com.flurry.android.sdk.ActivityLifecycleEvent", j);
        jy.a().a("com.flurry.android.sdk.FlurrySessionTimerEvent", i);
    }

    public static ld a()
    {
        com/flurry/sdk/ld;
        JVM INSTR monitorenter ;
        ld ld1;
        if (a == null)
        {
            a = new ld();
        }
        ld1 = a;
        com/flurry/sdk/ld;
        JVM INSTR monitorexit ;
        return ld1;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(lb lb1)
    {
        synchronized (e)
        {
            h = lb1;
        }
        return;
        lb1;
        obj;
        JVM INSTR monitorexit ;
        throw lb1;
    }

    static void a(ld ld1)
    {
        ld1.i();
    }

    static void a(ld ld1, Context context)
    {
        ld1.e(context);
    }

    static void a(ld ld1, lb lb1)
    {
        ld1.b(lb1);
    }

    public static void b()
    {
        com/flurry/sdk/ld;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            jy.a().a(a.i);
            jy.a().a(a.j);
            lg.a().b("ContinueSessionMillis", a);
        }
        a = null;
        com/flurry/sdk/ld;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(lb lb1)
    {
        synchronized (e)
        {
            if (h == lb1)
            {
                h = null;
            }
        }
        return;
        lb1;
        obj;
        JVM INSTR monitorexit ;
        throw lb1;
    }

    private void e(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if ((lb)c.get(context) == null) goto _L2; else goto _L1
_L1:
        if (!js.a().c()) goto _L4; else goto _L3
_L3:
        kc.a(3, b, (new StringBuilder("Session already started with context:")).append(context).toString());
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        kc.e(b, (new StringBuilder("Session already started with context:")).append(context).toString());
          goto _L5
        context;
        throw context;
_L2:
        lb lb2;
        d.a();
        lb2 = e();
        lb lb1;
        lb1 = lb2;
        if (lb2 != null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        lb1 = new lb();
        kc.e(b, (new StringBuilder("Flurry session started for context:")).append(context).toString());
        lc lc1 = new lc();
        lc1.a = new WeakReference(context);
        lc1.b = lb1;
        lc1.c = lc.a.a;
        lc1.b();
        c.put(context, lb1);
        a(lb1);
        kc.e(b, (new StringBuilder("Flurry session resumed for context:")).append(context).toString());
        lc lc2 = new lc();
        lc2.a = new WeakReference(context);
        lc2.b = lb1;
        lc2.c = lc.a.c;
        lc2.b();
        f = 0L;
          goto _L5
    }

    static String h()
    {
        return b;
    }

    private void i()
    {
        this;
        JVM INSTR monitorenter ;
        int k = d();
        if (k <= 0) goto _L2; else goto _L1
_L1:
        kc.a(5, b, (new StringBuilder("Session cannot be finalized, sessionContextCount:")).append(k).toString());
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj = e();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        kc.a(5, b, "Session cannot be finalized, current session not found");
          goto _L3
        obj;
        throw obj;
        kc.e(b, "Flurry session ended");
        lc lc1 = new lc();
        lc1.b = ((lb) (obj));
        lc1.c = lc.a.e;
        lc1.d = jb.a().d();
        lc1.b();
        jo.a().b(new _cls4(((lb) (obj))));
          goto _L3
    }

    public void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = context instanceof Activity;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (js.a().c())
        {
            kc.a(3, b, (new StringBuilder("bootstrap for context:")).append(context).toString());
            e(context);
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public void a(String s, Object obj)
    {
        if (s.equals("ContinueSessionMillis"))
        {
            g = ((Long)obj).longValue();
            kc.a(4, b, (new StringBuilder("onSettingUpdate, ContinueSessionMillis = ")).append(g).toString());
            return;
        } else
        {
            kc.a(6, b, "onSettingUpdate internal error!");
            return;
        }
    }

    public void b(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (!js.a().c()) goto _L2; else goto _L1
_L1:
        boolean flag = context instanceof Activity;
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        kc.a(3, b, (new StringBuilder("Manual onStartSession for context:")).append(context).toString());
        e(context);
        if (true) goto _L3; else goto _L4
_L4:
        context;
        throw context;
    }

    public long c()
    {
        return f;
    }

    public void c(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (!js.a().c()) goto _L2; else goto _L1
_L1:
        boolean flag = context instanceof Activity;
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        kc.a(3, b, (new StringBuilder("Manual onEndSession for context:")).append(context).toString());
        d(context);
        if (true) goto _L3; else goto _L4
_L4:
        context;
        throw context;
    }

    public int d()
    {
        this;
        JVM INSTR monitorenter ;
        int k = c.size();
        this;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        throw exception;
    }

    void d(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        lb lb1 = (lb)c.remove(context);
        if (lb1 != null) goto _L2; else goto _L1
_L1:
        if (!js.a().c()) goto _L4; else goto _L3
_L3:
        kc.a(3, b, (new StringBuilder("Session cannot be ended, session not found for context:")).append(context).toString());
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        kc.e(b, (new StringBuilder("Session cannot be ended, session not found for context:")).append(context).toString());
          goto _L5
        context;
        throw context;
_L2:
label0:
        {
            kc.e(b, (new StringBuilder("Flurry session paused for context:")).append(context).toString());
            lc lc1 = new lc();
            lc1.a = new WeakReference(context);
            lc1.b = lb1;
            lc1.d = jb.a().d();
            lc1.c = lc.a.d;
            lc1.b();
            if (d() != 0)
            {
                break label0;
            }
            d.a(g);
            f = System.currentTimeMillis();
        }
          goto _L5
        f = 0L;
          goto _L5
    }

    public lb e()
    {
        lb lb1;
        synchronized (e)
        {
            lb1 = h;
        }
        return lb1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        if (e() != null) goto _L2; else goto _L1
_L1:
        kc.a(2, b, "Session not found. No active session");
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void g()
    {
        this;
        JVM INSTR monitorenter ;
        lc lc1;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); lc1.b())
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            lc1 = new lc();
            lc1.a = new WeakReference(entry.getKey());
            lc1.b = (lb)entry.getValue();
            lc1.c = lc.a.d;
            lc1.d = jb.a().d();
        }

        break MISSING_BLOCK_LABEL_103;
        Exception exception;
        exception;
        throw exception;
        c.clear();
        jo.a().b(new _cls3());
        this;
        JVM INSTR monitorexit ;
    }


    private class _cls1
        implements jx
    {

        final ld a;

        public volatile void a(jw jw)
        {
            a((lf)jw);
        }

        public void a(lf lf1)
        {
            ld.a(a);
        }

        _cls1()
        {
            a = ld.this;
            super();
        }
    }


    private class _cls2
        implements jx
    {

        final ld a;

        public void a(jr jr1)
        {
            switch (_cls5.a[jr1.b.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                kc.a(3, ld.h(), (new StringBuilder("Automatic onStartSession for context:")).append(jr1.a).toString());
                ld.a(a, jr1.a);
                return;

            case 2: // '\002'
                kc.a(3, ld.h(), (new StringBuilder("Automatic onEndSession for context:")).append(jr1.a).toString());
                a.d(jr1.a);
                return;

            case 3: // '\003'
                kc.a(3, ld.h(), (new StringBuilder("Automatic onEndSession (destroyed) for context:")).append(jr1.a).toString());
                break;
            }
            a.d(jr1.a);
        }

        public volatile void a(jw jw)
        {
            a((jr)jw);
        }

        _cls2()
        {
            a = ld.this;
            super();
        }

        private class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[jr.a.values().length];
                try
                {
                    a[jr.a.e.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[jr.a.f.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[jr.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls4 extends lr
    {

        final lb a;
        final ld b;

        public void a()
        {
            ld.a(b, a);
        }

        _cls4(lb lb1)
        {
            b = ld.this;
            a = lb1;
            super();
        }
    }


    private class _cls3 extends lr
    {

        final ld a;

        public void a()
        {
            ld.a(a);
        }

        _cls3()
        {
            a = ld.this;
            super();
        }
    }

}
