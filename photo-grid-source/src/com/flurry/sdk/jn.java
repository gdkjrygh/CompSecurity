// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            jy, kc, lc, ld, 
//            jo, jx, lb

public class jn
{

    private static final String a = com/flurry/sdk/jn.getSimpleName();
    private final jx b = new _cls1();
    private WeakReference c;
    private volatile long d;
    private volatile long e;
    private volatile long f;
    private volatile long g;
    private volatile long h;
    private String i;
    private String j;
    private Map k;

    public jn()
    {
        d = 0L;
        e = 0L;
        f = -1L;
        g = 0L;
        h = 0L;
        jy.a().a("com.flurry.android.sdk.FlurrySessionEvent", b);
        k = new _cls2();
    }

    static WeakReference a(jn jn1)
    {
        return jn1.c;
    }

    static jx b(jn jn1)
    {
        return jn1.b;
    }

    private void b(lb lb, Context context)
    {
        if (lb == null || context == null)
        {
            kc.a(3, a, "Flurry session id cannot be created.");
            return;
        } else
        {
            kc.a(3, a, (new StringBuilder("Flurry session id started:")).append(d).toString());
            lc lc1 = new lc();
            lc1.a = new WeakReference(context);
            lc1.b = lb;
            lc1.c = lc.a.b;
            lc1.b();
            return;
        }
    }

    public void a()
    {
    }

    public void a(Context context)
    {
        long l = ld.a().c();
        if (l > 0L)
        {
            long l1 = g;
            g = (System.currentTimeMillis() - l) + l1;
        }
    }

    public void a(lb lb, Context context)
    {
        c = new WeakReference(lb);
        d = System.currentTimeMillis();
        e = SystemClock.elapsedRealtime();
        b(lb, context);
        jo.a().b(new _cls3());
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        i = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        k.put(s, s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public String b()
    {
        return Long.toString(d);
    }

    public void b(Context context)
    {
        f = SystemClock.elapsedRealtime() - e;
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        j = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public long c()
    {
        return d;
    }

    public long d()
    {
        return e;
    }

    public long e()
    {
        return f;
    }

    public long f()
    {
        return g;
    }

    public long g()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        l = SystemClock.elapsedRealtime() - e;
        if (l <= h)
        {
            break MISSING_BLOCK_LABEL_34;
        }
_L1:
        h = l;
        l = h;
        this;
        JVM INSTR monitorexit ;
        return l;
        l = h + 1L;
        h = l;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public String h()
    {
        this;
        JVM INSTR monitorenter ;
        String s = i;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String i()
    {
        this;
        JVM INSTR monitorenter ;
        String s = j;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public Map j()
    {
        this;
        JVM INSTR monitorenter ;
        Map map = k;
        this;
        JVM INSTR monitorexit ;
        return map;
        Exception exception;
        exception;
        throw exception;
    }


    private class _cls1
        implements jx
    {

        final jn a;

        public volatile void a(jw jw)
        {
            a((lc)jw);
        }

        public void a(lc lc1)
        {
            if (jn.a(a) != null && lc1.b != jn.a(a).get())
            {
                return;
            }
            switch (_cls4.a[lc1.c.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                a.a(lc1.b, (Context)lc1.a.get());
                return;

            case 2: // '\002'
                a.a((Context)lc1.a.get());
                return;

            case 3: // '\003'
                a.b((Context)lc1.a.get());
                return;

            case 4: // '\004'
                jy.a().b("com.flurry.android.sdk.FlurrySessionEvent", jn.b(a));
                break;
            }
            a.a();
        }

        _cls1()
        {
            a = jn.this;
            super();
        }

        private class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[lc.a.values().length];
                try
                {
                    a[lc.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[lc.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[lc.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[lc.a.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls2 extends LinkedHashMap
    {

        final jn a;

        protected boolean removeEldestEntry(java.util.Map.Entry entry)
        {
            return size() > 10;
        }

        _cls2()
        {
            a = jn.this;
            super();
        }
    }


    private class _cls3 extends lr
    {

        final jn a;

        public void a()
        {
            jg.a().c();
        }

        _cls3()
        {
            a = jn.this;
            super();
        }
    }

}
