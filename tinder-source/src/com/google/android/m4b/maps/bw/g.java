// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;

import android.content.Context;
import android.util.Log;
import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.al.b;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.c;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.v;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.t;
import com.google.android.m4b.maps.cg.bt;
import com.google.android.m4b.maps.cq.n;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class g
{
    final class a
        implements v
    {

        private final m a;
        private final Runnable b;
        private g c;

        private void a()
        {
            if (com.google.android.m4b.maps.bw.g.a(c) == null)
            {
                a.b(this);
                if (b != null)
                {
                    b.run();
                }
                synchronized (c)
                {
                    com.google.android.m4b.maps.bw.g.b(c);
                    c.notifyAll();
                }
                return;
            } else
            {
                return;
            }
            exception;
            g1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void a(int i, String s)
        {
            if (i != 3)
            {
                a();
            }
        }

        public final void a(com.google.android.m4b.maps.ay.t t1)
        {
            if (t1 instanceof c)
            {
                a.b(this);
            }
        }

        public final void b(com.google.android.m4b.maps.ay.t t1)
        {
            if (t1.g() == 75)
            {
                a();
            }
        }

        public a(m m1, Runnable runnable)
        {
            c = g.this;
            super();
            a = m1;
            b = runnable;
        }
    }

    public static interface b
    {

        public abstract void a();
    }

    final class c extends com.google.android.m4b.maps.ay.n
    {

        private final Context a;
        private final Long b;
        private final String c;
        private g d;

        public final void a(DataOutput dataoutput)
        {
            com.google.android.m4b.maps.ac.a a2 = new com.google.android.m4b.maps.ac.a(n.d);
            a2.a(1, 1L);
            com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(n.a);
            a1.a(1, a2);
            a2 = new com.google.android.m4b.maps.ac.a(n.d);
            a2.a(1, 5L);
            if (b != null)
            {
                a2.a(2, b.longValue());
            }
            a1.a(1, a2);
            g.d(d).a(a, a1);
            dataoutput.writeInt(a1.a(false));
            a1.a((OutputStream)dataoutput, false);
        }

        public final boolean a(DataInput datainput)
        {
            com.google.android.m4b.maps.ac.a a1;
            int i;
            int j;
            a1 = com.google.android.m4b.maps.ac.c.a(n.c, datainput);
            j = a1.j(1);
            i = 0;
_L2:
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_145;
            }
            datainput = a1.c(1, i);
            if (datainput.d(1) != 5 || !datainput.i(2) || !datainput.i(7))
            {
                break MISSING_BLOCK_LABEL_160;
            }
            com/google/android/m4b/maps/bw/g;
            JVM INSTR monitorenter ;
            com.google.android.m4b.maps.al.b.a(a, datainput, c);
            com/google/android/m4b/maps/bw/g;
            JVM INSTR monitorexit ;
            com.google.android.m4b.maps.ac.a a2 = datainput.f(7);
            if (ab.a(com.google.android.m4b.maps.bw.g.c(), 3))
            {
                String s = com.google.android.m4b.maps.bw.g.c();
                long l = datainput.e(2);
                Log.d(s, (new StringBuilder(58)).append("Updating tile zoom progression. Hash: ").append(l).toString());
            }
            com.google.android.m4b.maps.bw.g.a(d, t.a(a2));
            com.google.android.m4b.maps.bw.g.c(d);
            return true;
            datainput;
            com/google/android/m4b/maps/bw/g;
            JVM INSTR monitorexit ;
            throw datainput;
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public final boolean d()
        {
            return true;
        }

        public final int g()
        {
            return 75;
        }

        private c(Context context, Long long1, String s)
        {
            d = g.this;
            super();
            a = context;
            b = long1;
            c = s;
        }

        c(Context context, Long long1, String s, byte byte0)
        {
            this(context, long1, s);
        }
    }


    private static final String b = com/google/android/m4b/maps/bw/g.getSimpleName();
    public final Set a = new HashSet();
    private volatile t c;
    private volatile boolean d;
    private final e e;

    public g(Context context, m m1, Runnable runnable, e e1, bt bt1)
    {
        e = e1;
        (new Thread("ZoomTableManager", context, m1, runnable, bt1) {

            private Context a;
            private m b;
            private Runnable c;
            private bt d;
            private g e;

            public final void run()
            {
                com.google.android.m4b.maps.bw.g.a(e, a, b, c, "ZoomTables.data", d);
            }

            
            {
                e = g.this;
                a = context;
                b = m1;
                c = runnable;
                d = bt1;
                super(s);
            }
        }).start();
    }

    static t a(g g1)
    {
        return g1.c;
    }

    static t a(g g1, t t1)
    {
        g1.c = t1;
        return t1;
    }

    private void a(Context context, bt bt1, m m1, Runnable runnable, Long long1, String s)
    {
        if (bt1.a(true))
        {
            if (ab.a(b, 3))
            {
                Log.d(b, "Connection OK, sending zoom table request to DRD.");
            }
            m1.a(new a(m1, runnable));
            m1.c(new c(context, long1, s, (byte)0));
            return;
        }
        if (ab.a(b, 3))
        {
            Log.d(b, "Waiting for active connection to request zoom tables.");
        }
        bt1.a(new com.google.android.m4b.maps.cg.bt.b(context, bt1, m1, runnable, long1, s) {

            private Context a;
            private bt b;
            private m c;
            private Runnable d;
            private Long e;
            private String f;
            private g g;

            public final void a()
            {
                com.google.android.m4b.maps.bw.g.a(g, a, b, c, d, e, f);
            }

            
            {
                g = g.this;
                a = context;
                b = bt1;
                c = m1;
                d = runnable;
                e = long1;
                f = s;
                super();
            }
        });
    }

    static void a(g g1, Context context, m m1, Runnable runnable, String s, bt bt1)
    {
        Long long1;
        long1 = null;
        com.google.android.m4b.maps.ay.c.e();
        com/google/android/m4b/maps/bw/g;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ac.a a1 = com.google.android.m4b.maps.al.b.a(context, s, n.d);
        com/google/android/m4b/maps/bw/g;
        JVM INSTR monitorexit ;
        if (a1 != null && a1.i(7))
        {
            g1.c = t.a(a1.f(7));
            if (a1.i(2))
            {
                long1 = Long.valueOf(a1.e(2));
            }
            if (ab.a(b, 3))
            {
                Log.d(b, "Zoom tables loaded from cache.");
            }
            g1.d();
        } else
        {
            long1 = null;
        }
        if (g1.c != null || m1 == null) goto _L2; else goto _L1
_L1:
        if (!m1.e())
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (ab.a(b, 3))
        {
            Log.d(b, "Network error mode, cannot fetch zoom tables.");
        }
        if (runnable != null)
        {
            runnable.run();
        }
        g1;
        JVM INSTR monitorenter ;
        g1.d = true;
        g1.notifyAll();
        g1;
        JVM INSTR monitorexit ;
_L2:
        return;
        g1;
        com/google/android/m4b/maps/bw/g;
        JVM INSTR monitorexit ;
        throw g1;
        context;
        g1;
        JVM INSTR monitorexit ;
        throw context;
        if (ab.a(b, 3))
        {
            Log.d(b, "Zoom tables not found in cache. Requesting from server.");
        }
        g1.a(context, bt1, m1, runnable, long1, s);
        return;
    }

    static void a(g g1, Context context, bt bt1, m m1, Runnable runnable, Long long1, String s)
    {
        g1.a(context, bt1, m1, runnable, long1, s);
    }

    static boolean b(g g1)
    {
        g1.d = true;
        return true;
    }

    static String c()
    {
        return b;
    }

    static void c(g g1)
    {
        g1.d();
    }

    static e d(g g1)
    {
        return g1.e;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        notifyAll();
        obj = bo.a(a);
        a.clear();
        this;
        JVM INSTR monitorexit ;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((b)((Iterator) (obj)).next()).a()) { }
        break MISSING_BLOCK_LABEL_63;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final t a()
    {
        this;
        JVM INSTR monitorenter ;
_L4:
        if (c != null) goto _L2; else goto _L1
_L1:
        boolean flag = d;
        if (flag) goto _L2; else goto _L3
_L3:
        t t1;
        Exception exception;
        try
        {
            wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally
        {
            this;
        }
        if (true) goto _L4; else goto _L2
_L2:
        t1 = c;
        this;
        JVM INSTR monitorexit ;
        return t1;
        throw exception;
    }

    public final boolean b()
    {
        return c != null;
    }

}
