// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.m4b.maps.ak.c;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bw.e;
import com.google.android.m4b.maps.cg.cb;
import com.google.android.m4b.maps.cg.cf;
import com.google.android.m4b.maps.cg.cg;
import com.google.android.m4b.maps.cg.d;
import com.google.android.m4b.maps.df.ab;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public final class g
    implements d
{

    private static long b = -1L;
    private static final AtomicLong c = new AtomicLong(0L);
    final i a;
    private final long d;
    private ab e;
    private final Set f = new HashSet();
    private final com.google.android.m4b.maps.cg.e g = new com.google.android.m4b.maps.cg.e() {

        final g a;

        public final void a()
        {
            if (!a.d())
            {
                return;
            } else
            {
                com.google.android.m4b.maps.aq.g.c(a).post(new Runnable(this) {

                    private _cls1 a;

                    public final void run()
                    {
                        g g1 = a.a;
                        g1;
                        JVM INSTR monitorenter ;
                        if (g.a(a.a) != null)
                        {
                            g.a(a.a).a();
                        }
                        for (Iterator iterator = g.b(a.a).iterator(); iterator.hasNext(); ((com.google.android.m4b.maps.cg.e)iterator.next()).a()) { }
                        break MISSING_BLOCK_LABEL_95;
                        Object obj;
                        obj;
                        throw new RuntimeRemoteException(((RemoteException) (obj)));
                        obj;
                        g1;
                        JVM INSTR monitorexit ;
                        throw obj;
                        g1;
                        JVM INSTR monitorexit ;
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                return;
            }
        }

        public final void a(cg cg1)
        {
            if (!a.d())
            {
                return;
            } else
            {
                com.google.android.m4b.maps.aq.g.c(a).post(new Runnable(this, cg1) {

                    private cg a;
                    private _cls1 b;

                    public final void run()
                    {
                        g g1 = b.a;
                        g1;
                        JVM INSTR monitorenter ;
                        if (g.a(b.a) != null)
                        {
                            g.a(b.a).a(new cf(b.a, a, com.google.android.m4b.maps.aq.g.d(b.a)));
                        }
                        for (Iterator iterator = g.b(b.a).iterator(); iterator.hasNext(); ((com.google.android.m4b.maps.cg.e)iterator.next()).a(a)) { }
                        break MISSING_BLOCK_LABEL_127;
                        Object obj;
                        obj;
                        throw new RuntimeRemoteException(((RemoteException) (obj)));
                        obj;
                        g1;
                        JVM INSTR monitorexit ;
                        throw obj;
                        g1;
                        JVM INSTR monitorexit ;
                    }

            
            {
                b = _pcls1;
                a = cg1;
                super();
            }
                });
                return;
            }
        }

            
            {
                a = g.this;
                super();
            }
    };
    private final Handler h;
    private final cb i;

    private g(i k, Handler handler, cb cb1)
    {
        d = c.getAndIncrement();
        a = (i)j.a(k);
        h = (Handler)j.a(handler);
        i = (cb)j.a(cb1);
    }

    public static g a(i k, Handler handler, cb cb1)
    {
        k = new g(k, handler, cb1);
        handler = ((g) (k)).a;
        cb1 = ((g) (k)).g;
        ((i) (handler)).b.put(cb1, null);
        return k;
    }

    static ab a(g g1)
    {
        return g1.e;
    }

    static Set b(g g1)
    {
        return g1.f;
    }

    static Handler c(g g1)
    {
        return g1.h;
    }

    static cb d(g g1)
    {
        return g1.i;
    }

    public final int a(cg cg1)
    {
        if (d())
        {
            c c1 = a.a(cg1.a());
            if (c1 != null)
            {
                return cg1.b(c1);
            } else
            {
                return com.google.android.m4b.maps.az.i.b(cg1);
            }
        } else
        {
            return -1;
        }
    }

    public final c a(com.google.android.m4b.maps.ak.a.c c1)
    {
        if (d())
        {
            return a.a(c1);
        } else
        {
            return null;
        }
    }

    public final void a(c c1)
    {
        i k;
        if (!d())
        {
            break MISSING_BLOCK_LABEL_121;
        }
        k = a;
        Object obj1 = k.e;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        ArrayList arraylist;
        if (c1.equals(k.d))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = k.c;
        arraylist = new ArrayList(((e) (obj)).a.size());
        obj = ((e) (obj)).b;
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        arraylist.add(((com.google.android.m4b.maps.bw.e.c) (obj)).d);
        obj = ((com.google.android.m4b.maps.bw.e.c) (obj)).b;
          goto _L1
        if (!arraylist.contains(c1))
        {
            break MISSING_BLOCK_LABEL_96;
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        k.d = c1;
        obj1;
        JVM INSTR monitorexit ;
        k.a(c1.a, k);
        return;
        c1;
        obj1;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final void a(com.google.android.m4b.maps.cg.e e1)
    {
        f.add(e1);
    }

    public final void a(ab ab)
    {
        this;
        JVM INSTR monitorenter ;
        e = ab;
        this;
        JVM INSTR monitorexit ;
        return;
        ab;
        throw ab;
    }

    public final boolean a()
    {
        if (b == d || b == -1L)
        {
            b = d;
            return true;
        } else
        {
            return false;
        }
    }

    public final int b(cg cg1)
    {
        if (d())
        {
            return com.google.android.m4b.maps.az.i.b(cg1);
        } else
        {
            return -1;
        }
    }

    public final void b()
    {
        if (b == d)
        {
            b = -1L;
        }
    }

    public final void b(com.google.android.m4b.maps.cg.e e1)
    {
        f.remove(e1);
    }

    public final cg c()
    {
        if (d())
        {
            return a.b();
        } else
        {
            return null;
        }
    }

    public final boolean c(cg cg1)
    {
        if (d())
        {
            return com.google.android.m4b.maps.az.i.c(cg1);
        } else
        {
            return false;
        }
    }

    public final void d(cg cg1)
    {
        if (d())
        {
            i k = a;
            if (cg1 != null)
            {
                k.a(cg1.a(), i.g);
                k.d(cg1);
            }
        }
    }

    public final boolean d()
    {
        return d == b;
    }

}
