// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.flurry.sdk:
//            hd, hg, hh, gd, 
//            fz, ft, hb, fp, 
//            fy, he, fx, fs, 
//            hq

public class hc
    implements hh.a
{

    private static hc a;
    private static final String b = com/flurry/sdk/hc.getSimpleName();
    private final Map c = new WeakHashMap();
    private final hd d = new hd();
    private final Object e = new Object();
    private long f;
    private long g;
    private hb h;
    private fy i;
    private fy j;

    private hc()
    {
        i = new fy() {

            final hc a;

            public void a(he he1)
            {
                a.h();
            }

            public void notify(fx fx)
            {
                a((he)fx);
            }

            
            {
                a = hc.this;
                super();
            }
        };
        j = new fy() {

            final hc a;

            public void a(fs fs1)
            {
                static class _cls4
                {

                    static final int a[];

                    static 
                    {
                        a = new int[fs.a.values().length];
                        try
                        {
                            a[fs.a.e.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[fs.a.f.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[fs.a.b.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls4.a[fs1.b.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    gd.a(3, hc.i(), (new StringBuilder()).append("Automatic onStartSession for context:").append(fs1.a).toString());
                    a.d(fs1.a);
                    return;

                case 2: // '\002'
                    gd.a(3, hc.i(), (new StringBuilder()).append("Automatic onEndSession for context:").append(fs1.a).toString());
                    a.e(fs1.a);
                    return;

                case 3: // '\003'
                    gd.a(3, hc.i(), (new StringBuilder()).append("Automatic onEndSession (destroyed) for context:").append(fs1.a).toString());
                    break;
                }
                a.e(fs1.a);
            }

            public void notify(fx fx)
            {
                a((fs)fx);
            }

            
            {
                a = hc.this;
                super();
            }
        };
        hg hg1 = hg.a();
        f = 0L;
        g = ((Long)hg1.a("ContinueSessionMillis")).longValue();
        hg1.a("ContinueSessionMillis", this);
        gd.a(4, b, (new StringBuilder()).append("initSettings, ContinueSessionMillis = ").append(g).toString());
        fz.a().a("com.flurry.android.sdk.ActivityLifecycleEvent", j);
        fz.a().a("com.flurry.android.sdk.FlurrySessionTimerEvent", i);
    }

    public static hc a()
    {
        com/flurry/sdk/hc;
        JVM INSTR monitorenter ;
        hc hc1;
        if (a == null)
        {
            a = new hc();
        }
        hc1 = a;
        com/flurry/sdk/hc;
        JVM INSTR monitorexit ;
        return hc1;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(hb hb1)
    {
        synchronized (e)
        {
            h = hb1;
        }
        return;
        hb1;
        obj;
        JVM INSTR monitorexit ;
        throw hb1;
    }

    static void a(hc hc1, hb hb1)
    {
        hc1.b(hb1);
    }

    public static void b()
    {
        com/flurry/sdk/hc;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            fz.a().a(a.i);
            fz.a().a(a.j);
            hg.a().b("ContinueSessionMillis", a);
        }
        a = null;
        com/flurry/sdk/hc;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(hb hb1)
    {
        synchronized (e)
        {
            if (h == hb1)
            {
                h = null;
            }
        }
        return;
        hb1;
        obj;
        JVM INSTR monitorexit ;
        throw hb1;
    }

    static String i()
    {
        return b;
    }

    public void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = context instanceof Application;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (ft.a().c() && (context instanceof Activity))
        {
            gd.a(3, b, (new StringBuilder()).append("bootstrap for context:").append(context).toString());
            d(context);
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
            gd.a(4, b, (new StringBuilder()).append("onSettingUpdate, ContinueSessionMillis = ").append(g).toString());
            return;
        } else
        {
            gd.a(6, b, "onSettingUpdate internal error!");
            return;
        }
    }

    public void b(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = context instanceof Application;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!ft.a().c() || !(context instanceof Activity))
        {
            gd.a(3, b, (new StringBuilder()).append("Manual onStartSession for context:").append(context).toString());
            d(context);
        }
        if (true) goto _L1; else goto _L3
_L3:
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
        boolean flag = context instanceof Application;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!ft.a().c() || !(context instanceof Activity))
        {
            gd.a(3, b, (new StringBuilder()).append("Manual onEndSession for context:").append(context).toString());
            e(context);
        }
        if (true) goto _L1; else goto _L3
_L3:
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
        if ((hb)c.get(context) == null) goto _L2; else goto _L1
_L1:
        if (!ft.a().c()) goto _L4; else goto _L3
_L3:
        gd.a(3, b, (new StringBuilder()).append("Session already started with context:").append(context).toString());
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        gd.e(b, (new StringBuilder()).append("Session already started with context:").append(context).toString());
          goto _L5
        context;
        throw context;
_L2:
        hb hb2;
        d.a();
        hb2 = e();
        hb hb1;
        hb1 = hb2;
        if (hb2 != null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        hb1 = new hb();
        gd.e(b, (new StringBuilder()).append("Flurry session created for context:").append(context).toString());
        hb1.a(context);
        c.put(context, hb1);
        a(hb1);
        gd.e(b, (new StringBuilder()).append("Flurry session started for context:").append(context).toString());
        hb1.b(context);
        f = 0L;
          goto _L5
    }

    public hb e()
    {
        hb hb1;
        synchronized (e)
        {
            hb1 = h;
        }
        return hb1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void e(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        hb hb1 = (hb)c.remove(context);
        if (hb1 != null) goto _L2; else goto _L1
_L1:
        if (!ft.a().c()) goto _L4; else goto _L3
_L3:
        gd.a(3, b, (new StringBuilder()).append("Session cannot be ended, session not found for context:").append(context).toString());
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        gd.e(b, (new StringBuilder()).append("Session cannot be ended, session not found for context:").append(context).toString());
          goto _L5
        context;
        throw context;
_L2:
label0:
        {
            gd.e(b, (new StringBuilder()).append("Flurry session ended for context:").append(context).toString());
            hb1.c(context);
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

    public boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        if (e() != null) goto _L2; else goto _L1
_L1:
        gd.a(2, b, "Session not found. No active session");
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
        java.util.Map.Entry entry;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); ((hb)entry.getValue()).c((Context)entry.getKey()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_65;
        Exception exception;
        exception;
        throw exception;
        c.clear();
        h();
        this;
        JVM INSTR monitorexit ;
    }

    void h()
    {
        this;
        JVM INSTR monitorenter ;
        int k = d();
        if (k <= 0) goto _L2; else goto _L1
_L1:
        gd.a(5, b, (new StringBuilder()).append("Session cannot be finalized, sessionContextCount:").append(k).toString());
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj = e();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        gd.a(5, b, "Session cannot be finalized, current session not found");
          goto _L3
        obj;
        throw obj;
        gd.e(b, "Flurry session finalized");
        ((hb) (obj)).a();
        fp.a().b(new hq(((hb) (obj))) {

            final hb a;
            final hc b;

            public void safeRun()
            {
                hc.a(b, a);
            }

            
            {
                b = hc.this;
                a = hb1;
                super();
            }
        });
          goto _L3
    }

}
