// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.m4b.maps.dd.c;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.j.m;
import com.google.android.m4b.maps.j.q;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.j.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            i, h, e, b

public final class f
    implements i
{
    static final class a extends com.google.android.m4b.maps.v.c
    {

        private final WeakReference a;

        public final void a(com.google.android.m4b.maps.g.a a1, com.google.android.m4b.maps.v.a a2)
        {
            a2 = (f)a.get();
            if (a2 == null)
            {
                return;
            } else
            {
                ((f) (a2)).a.j.post(new Runnable(this, a2, a1) {

                    private f a;
                    private com.google.android.m4b.maps.g.a b;
                    private a c;

                    public final void run()
                    {
                        f f1;
                        Object obj;
                        f1 = a;
                        obj = b;
                        f1.b.lock();
                        boolean flag = f1.c(2);
                        if (!flag)
                        {
                            f1.b.unlock();
                            return;
                        }
                        if (!((com.google.android.m4b.maps.g.a) (obj)).b()) goto _L2; else goto _L1
_L1:
                        f1.g();
_L3:
                        f1.b.unlock();
                        return;
_L2:
                        if (!f1.a(((com.google.android.m4b.maps.g.a) (obj))))
                        {
                            break MISSING_BLOCK_LABEL_91;
                        }
                        f1.h();
                        f1.g();
                          goto _L3
                        obj;
                        f1.b.unlock();
                        throw obj;
                        f1.b(((com.google.android.m4b.maps.g.a) (obj)));
                          goto _L3
                    }

            
            {
                c = a1;
                a = f1;
                b = a2;
                super();
            }
                });
                return;
            }
        }

        a(f f1)
        {
            a = new WeakReference(f1);
        }
    }

    static final class b extends com.google.android.m4b.maps.j.u.a
    {

        private final WeakReference a;

        public final void a(y y)
        {
            f f1 = (f)a.get();
            if (f1 == null)
            {
                return;
            } else
            {
                f1.a.j.post(new Runnable(this, f1, y) {

                    private f a;
                    private y b;
                    private b c;

                    public final void run()
                    {
                        f f1;
                        y y1;
                        com.google.android.m4b.maps.g.a a1;
                        f1 = a;
                        y1 = b;
                        a1 = y1.c;
                        f1.b.lock();
                        boolean flag = f1.c(0);
                        if (!flag)
                        {
                            f1.b.unlock();
                            return;
                        }
                        if (!a1.b()) goto _L2; else goto _L1
_L1:
                        f1.g = com.google.android.m4b.maps.j.q.a.a(y1.b);
                        f1.f = true;
                        f1.h = y1.d;
                        f1.i = y1.e;
                        f1.e();
_L3:
                        f1.b.unlock();
                        return;
_L2:
                        if (!f1.a(a1))
                        {
                            break MISSING_BLOCK_LABEL_137;
                        }
                        f1.h();
                        if (f1.c == 0)
                        {
                            f1.g();
                        }
                          goto _L3
                        Exception exception;
                        exception;
                        f1.b.unlock();
                        throw exception;
                        f1.b(a1);
                          goto _L3
                    }

            
            {
                c = b1;
                a = f1;
                b = y1;
                super();
            }
                });
                return;
            }
        }

        b(f f1)
        {
            a = new WeakReference(f1);
        }
    }

    static final class c
        implements d.c
    {

        private final WeakReference a;
        private final com.google.android.m4b.maps.h.b b;
        private final int c;

        public final void a(com.google.android.m4b.maps.g.a a1)
        {
            f f1;
            boolean flag = false;
            f1 = (f)a.get();
            if (f1 == null)
            {
                return;
            }
            if (Looper.myLooper() == f1.a.e)
            {
                flag = true;
            }
            x.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            f1.b.lock();
            boolean flag1 = f1.c(0);
            if (!flag1)
            {
                f1.b.unlock();
                return;
            }
            if (!a1.b())
            {
                f1.b(a1, b, c);
            }
            if (f1.d())
            {
                if (!f1.e)
                {
                    break MISSING_BLOCK_LABEL_116;
                }
                f1.e();
            }
_L2:
            f1.b.unlock();
            return;
            f1.g();
            if (true) goto _L2; else goto _L1
_L1:
            a1;
            f1.b.unlock();
            throw a1;
        }

        public final void b(com.google.android.m4b.maps.g.a a1)
        {
            f f1;
            boolean flag = true;
            f1 = (f)a.get();
            if (f1 == null)
            {
                return;
            }
            if (Looper.myLooper() != f1.a.e)
            {
                flag = false;
            }
            x.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
            f1.b.lock();
            flag = f1.c(1);
            if (!flag)
            {
                f1.b.unlock();
                return;
            }
            if (!a1.b())
            {
                f1.b(a1, b, c);
            }
            if (f1.d())
            {
                f1.f();
            }
            f1.b.unlock();
            return;
            a1;
            f1.b.unlock();
            throw a1;
        }

        public c(f f1, com.google.android.m4b.maps.h.b b1, int i1)
        {
            a = new WeakReference(f1);
            b = b1;
            c = i1;
        }
    }

    final class d
        implements d.b, d.d
    {

        private f a;

        public final void a(int i1)
        {
        }

        public final void a(Bundle bundle)
        {
            a.d.a(new b(a));
        }

        public final void a(com.google.android.m4b.maps.g.a a1)
        {
            a.b.lock();
            if (!a.a(a1)) goto _L2; else goto _L1
_L1:
            a.h();
            a.g();
_L4:
            a.b.unlock();
            return;
_L2:
            a.b(a1);
            if (true) goto _L4; else goto _L3
_L3:
            a1;
            a.b.unlock();
            throw a1;
        }

        private d()
        {
            a = f.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    final h a;
    final Lock b;
    int c;
    com.google.android.m4b.maps.dd.c d;
    boolean e;
    boolean f;
    q g;
    boolean h;
    boolean i;
    private final Context j;
    private com.google.android.m4b.maps.g.a k;
    private int l;
    private int m;
    private boolean n;
    private final Bundle o = new Bundle();
    private final Set p = new HashSet();
    private int q;
    private final g r;
    private final Map s;
    private final b.b t;

    public f(h h1, g g1, Map map, b.b b1, Lock lock, Context context)
    {
        m = 0;
        n = false;
        a = h1;
        r = g1;
        s = map;
        t = b1;
        b = lock;
        j = context;
    }

    private void a(boolean flag)
    {
        if (d != null)
        {
            if (d.e())
            {
                if (flag)
                {
                    d.o_();
                }
                d.d();
            }
            g = null;
        }
    }

    private static String d(int i1)
    {
        switch (i1)
        {
        default:
            return "UNKNOWN";

        case 0: // '\0'
            return "STEP_GETTING_SERVICE_BINDINGS";

        case 1: // '\001'
            return "STEP_VALIDATING_ACCOUNT";

        case 2: // '\002'
            return "STEP_AUTHENTICATING";

        case 3: // '\003'
            return "STEP_GETTING_REMOTE_SERVICE";
        }
    }

    private void i()
    {
        Object obj;
        obj = a;
        ((h) (obj)).a.lock();
        ((h) (obj)).g();
        obj.r = new e(((h) (obj)));
        ((h) (obj)).r.a();
        ((h) (obj)).b.signalAll();
        ((h) (obj)).a.unlock();
        if (d != null)
        {
            if (h)
            {
                d.a(g, i);
            }
            a(false);
        }
        b.c c1;
        for (obj = a.m.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((b.a)a.l.get(c1)).d())
        {
            c1 = (b.c)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_167;
        Exception exception;
        exception;
        ((h) (obj)).a.unlock();
        throw exception;
        Object obj2;
        m m1;
        boolean flag;
        if (n)
        {
            n = false;
            a(-1);
            return;
        }
        Object obj1;
        Object obj3;
        d.b b1;
        int i1;
        if (o.isEmpty())
        {
            obj1 = null;
        } else
        {
            obj1 = o;
        }
        m1 = a.c;
        obj2 = m1.i;
        obj2;
        JVM INSTR monitorenter ;
        if (!m1.g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x.a(flag);
        m1.h.removeMessages(1);
        m1.g = true;
        if (m1.c.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x.a(flag);
        obj3 = new ArrayList(m1.b);
        i1 = m1.f.get();
        obj3 = ((ArrayList) (obj3)).iterator();
        do
        {
            if (!((Iterator) (obj3)).hasNext())
            {
                break;
            }
            b1 = (d.b)((Iterator) (obj3)).next();
            if (!m1.e || !m1.a.e() || m1.f.get() != i1)
            {
                break;
            }
            if (!m1.c.contains(b1))
            {
                b1.a(((Bundle) (obj1)));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_388;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        m1.c.clear();
        m1.g = false;
        obj2;
        JVM INSTR monitorexit ;
    }

    private Set j()
    {
        HashSet hashset = new HashSet(r.b);
        Map map = r.d;
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.m4b.maps.h.b b1 = (com.google.android.m4b.maps.h.b)iterator.next();
            if (!a.m.containsKey(b1.b()))
            {
                hashset.addAll(((com.google.android.m4b.maps.j.g.a)map.get(b1)).a);
            }
        } while (true);
        return hashset;
    }

    public final c.a a(c.a a1)
    {
        a.f.add(a1);
        return a1;
    }

    public final void a()
    {
        a.c.e = true;
        a.m.clear();
        n = false;
        e = false;
        k = null;
        m = 0;
        q = 2;
        f = false;
        h = false;
        int i1 = com.google.android.m4b.maps.g.g.a(j);
        if (i1 != 0)
        {
            com.google.android.m4b.maps.g.a a1 = new com.google.android.m4b.maps.g.a(i1, null);
            a.j.post(new Runnable(a1) {

                private com.google.android.m4b.maps.g.a a;
                private f b;

                public final void run()
                {
                    b.b.lock();
                    b.b(a);
                    b.b.unlock();
                    return;
                    Exception exception;
                    exception;
                    b.b.unlock();
                    throw exception;
                }

            
            {
                b = f.this;
                a = a1;
                super();
            }
            });
        } else
        {
            HashMap hashmap = new HashMap();
            com.google.android.m4b.maps.h.b b1;
            b.a a3;
            int j1;
            for (Iterator iterator = s.keySet().iterator(); iterator.hasNext(); hashmap.put(a3, new c(this, b1, j1)))
            {
                b1 = (com.google.android.m4b.maps.h.b)iterator.next();
                a3 = (b.a)a.l.get(b1.b());
                j1 = ((Integer)s.get(b1)).intValue();
                b1.a();
                if (!a3.f())
                {
                    continue;
                }
                e = true;
                if (j1 < q)
                {
                    q = j1;
                }
                if (j1 != 0)
                {
                    p.add(b1.b());
                }
            }

            if (e)
            {
                r.h = Integer.valueOf(System.identityHashCode(a));
                d d1 = new d((byte)0);
                d = (com.google.android.m4b.maps.dd.c)t.a(j, a.e, r, r.g, d1, d1);
                d.p_();
            }
            c = a.l.size();
            Iterator iterator1 = a.l.values().iterator();
            while (iterator1.hasNext()) 
            {
                b.a a2 = (b.a)iterator1.next();
                a2.a((d.c)hashmap.get(a2));
            }
        }
    }

    public final void a(int i1)
    {
        if (i1 == -1)
        {
            for (Iterator iterator = a.f.iterator(); iterator.hasNext(); iterator.remove())
            {
                ((h.e)iterator.next()).a();
            }

            a.f();
            if (k == null && !a.f.isEmpty())
            {
                n = true;
                return;
            }
            a.m.clear();
            k = null;
            a(true);
        }
        a.a(k);
    }

    public final void a(Bundle bundle)
    {
        if (c(3))
        {
            if (bundle != null)
            {
                o.putAll(bundle);
            }
            if (d())
            {
                i();
                return;
            }
        }
    }

    public final void a(com.google.android.m4b.maps.g.a a1, com.google.android.m4b.maps.h.b b1, int i1)
    {
        if (c(3))
        {
            b(a1, b1, i1);
            if (d())
            {
                i();
                return;
            }
        }
    }

    final boolean a(com.google.android.m4b.maps.g.a a1)
    {
        return q == 2 || q == 1 && !a1.a();
    }

    public final c.a b(c.a a1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void b()
    {
        n = false;
    }

    public final void b(int i1)
    {
        b(new com.google.android.m4b.maps.g.a(8, null));
    }

    final void b(com.google.android.m4b.maps.g.a a1)
    {
        boolean flag = false;
        n = false;
        a.n.clear();
        k = a1;
        if (!a1.a())
        {
            flag = true;
        }
        a(flag);
        a(3);
        if (a.g && com.google.android.m4b.maps.g.g.a(j, a1.c)) goto _L2; else goto _L1
_L1:
        m m1;
        a.g();
        m1 = a.c;
        m1.h.removeMessages(1);
        Object obj = m1.i;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int i1;
        obj1 = new ArrayList(m1.d);
        i1 = m1.f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L7:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        d.d d1 = (d.d)((Iterator) (obj1)).next();
        if (m1.e && m1.f.get() == i1) goto _L5; else goto _L2
_L2:
        a.c.a();
        return;
_L5:
        if (!m1.d.contains(d1)) goto _L7; else goto _L6
_L6:
        d1.a(a1);
          goto _L7
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
_L4:
        obj;
        JVM INSTR monitorexit ;
          goto _L2
    }

    final void b(com.google.android.m4b.maps.g.a a1, com.google.android.m4b.maps.h.b b1, int i1)
    {
        boolean flag = true;
        if (i1 == 2) goto _L2; else goto _L1
_L1:
        b1.a();
        if (i1 != 1) goto _L4; else goto _L3
_L3:
        if (a1.a())
        {
            i1 = 1;
        } else
        if (com.google.android.m4b.maps.g.g.b(a1.c) != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        i1 = ((flag) ? 1 : 0);
        if (k == null) goto _L7; else goto _L6
_L6:
        if (0x7fffffff >= l) goto _L5; else goto _L8
_L8:
        i1 = ((flag) ? 1 : 0);
_L7:
        if (i1 != 0)
        {
            k = a1;
            l = 0x7fffffff;
        }
_L2:
        a.m.put(b1.b(), a1);
        return;
_L5:
        i1 = 0;
        if (true) goto _L7; else goto _L9
_L9:
    }

    public final String c()
    {
        return "CONNECTING";
    }

    final boolean c(int i1)
    {
        if (m != i1)
        {
            String s1 = d(m);
            String s2 = d(i1);
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder(String.valueOf(s1).length() + 70 + String.valueOf(s2).length())).append("GoogleApiClient connecting is in step ").append(s1).append(" but received callback for step ").append(s2).toString());
            b(new com.google.android.m4b.maps.g.a(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    final boolean d()
    {
        c = c - 1;
        if (c > 0)
        {
            return false;
        }
        if (c < 0)
        {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
            b(new com.google.android.m4b.maps.g.a(8, null));
            return false;
        }
        if (k != null)
        {
            b(k);
            return false;
        } else
        {
            return true;
        }
    }

    final void e()
    {
        if (f && c == 0)
        {
            m = 1;
            c = a.l.size();
            Iterator iterator = a.l.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                b.c c1 = (b.c)iterator.next();
                if (a.m.containsKey(c1))
                {
                    if (d())
                    {
                        f();
                    }
                } else
                {
                    ((b.a)a.l.get(c1)).a(g);
                }
            } while (true);
        }
    }

    final void f()
    {
        m = 2;
        a.n = j();
        d.a(g, a.n, new a(this));
    }

    final void g()
    {
        Set set = a.n;
        if (set.isEmpty())
        {
            set = j();
        }
        m = 3;
        c = a.l.size();
        Iterator iterator = a.l.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b.c c1 = (b.c)iterator.next();
            if (a.m.containsKey(c1))
            {
                if (d())
                {
                    i();
                }
            } else
            {
                ((b.a)a.l.get(c1)).a(g, set);
            }
        } while (true);
    }

    final void h()
    {
        e = false;
        a.n.clear();
        Iterator iterator = p.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b.c c1 = (b.c)iterator.next();
            if (!a.m.containsKey(c1))
            {
                a.m.put(c1, new com.google.android.m4b.maps.g.a(17, null));
            }
        } while (true);
    }
}
