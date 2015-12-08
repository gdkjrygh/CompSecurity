// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.signin.d;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            p, o, a, q

public final class m
    implements p
{
    private static final class a extends com.google.android.gms.signin.internal.b
    {

        private final WeakReference a;

        public final void a(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
        {
            authaccountresult = (m)a.get();
            if (authaccountresult == null)
            {
                return;
            } else
            {
                m.c(authaccountresult).a(new o.b(this, authaccountresult, authaccountresult, connectionresult) {

                    final m a;
                    final ConnectionResult b;
                    final a c;

                    public final void a()
                    {
                        m.c(a, b);
                    }

            
            {
                c = a1;
                a = m1;
                b = connectionresult;
                super(p1);
            }
                });
                return;
            }
        }

        a(m m1)
        {
            a = new WeakReference(m1);
        }
    }

    private static final class b extends com.google.android.gms.common.internal.v.a
    {

        private final WeakReference a;

        public final void a(ResolveAccountResponse resolveaccountresponse)
        {
            m m1 = (m)a.get();
            if (m1 == null)
            {
                return;
            } else
            {
                m.c(m1).a(new o.b(this, m1, m1, resolveaccountresponse) {

                    final m a;
                    final ResolveAccountResponse b;
                    final b c;

                    public final void a()
                    {
                        m.a(a, b);
                    }

            
            {
                c = b1;
                a = m1;
                b = resolveaccountresponse;
                super(p1);
            }
                });
                return;
            }
        }

        b(m m1)
        {
            a = new WeakReference(m1);
        }
    }

    private final class c extends i
    {

        final m a;

        public final void a()
        {
            m.e(a).a(m.f(a), m.c(a).f, new a(a));
        }

        private c()
        {
            a = m.this;
            super((byte)0);
        }

        c(byte byte0)
        {
            this();
        }
    }

    private static final class d
        implements c.e
    {

        private final WeakReference a;
        private final com.google.android.gms.common.api.a b;
        private final int c;

        public final void a(ConnectionResult connectionresult)
        {
            m m1;
            boolean flag = false;
            m1 = (m)a.get();
            if (m1 == null)
            {
                return;
            }
            if (Looper.myLooper() == m.c(m1).a())
            {
                flag = true;
            }
            y.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            com.google.android.gms.common.api.m.b(m1).lock();
            boolean flag1 = m.a(m1, 0);
            if (!flag1)
            {
                com.google.android.gms.common.api.m.b(m1).unlock();
                return;
            }
            if (!connectionresult.b())
            {
                m.a(m1, connectionresult, b, c);
            }
            if (m.j(m1))
            {
                m.k(m1);
            }
            com.google.android.gms.common.api.m.b(m1).unlock();
            return;
            connectionresult;
            com.google.android.gms.common.api.m.b(m1).unlock();
            throw connectionresult;
        }

        public final void b(ConnectionResult connectionresult)
        {
            m m1;
            boolean flag = true;
            m1 = (m)a.get();
            if (m1 == null)
            {
                return;
            }
            if (Looper.myLooper() != m.c(m1).a())
            {
                flag = false;
            }
            y.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
            com.google.android.gms.common.api.m.b(m1).lock();
            flag = m.a(m1, 1);
            if (!flag)
            {
                com.google.android.gms.common.api.m.b(m1).unlock();
                return;
            }
            if (!connectionresult.b())
            {
                m.a(m1, connectionresult, b, c);
            }
            if (m.j(m1))
            {
                m.l(m1);
            }
            com.google.android.gms.common.api.m.b(m1).unlock();
            return;
            connectionresult;
            com.google.android.gms.common.api.m.b(m1).unlock();
            throw connectionresult;
        }

        public d(m m1, com.google.android.gms.common.api.a a1, int i1)
        {
            a = new WeakReference(m1);
            b = a1;
            c = i1;
        }
    }

    private final class e extends i
    {

        final m a;
        private final Map c;

        public final void a()
        {
            int i1 = com.google.android.gms.common.b.a(m.a(a));
            if (i1 != 0)
            {
                ConnectionResult connectionresult = new ConnectionResult(i1, null);
                m.c(a).a(new o.b(this, a, connectionresult) {

                    final ConnectionResult a;
                    final e b;

                    public final void a()
                    {
                        m.a(b.a, a);
                    }

            
            {
                b = e1;
                a = connectionresult;
                super(p1);
            }
                });
            } else
            {
                if (com.google.android.gms.common.api.m.d(a))
                {
                    m.e(a).p();
                }
                Iterator iterator = c.keySet().iterator();
                while (iterator.hasNext()) 
                {
                    a.b b1 = (a.b)iterator.next();
                    b1.a((c.e)c.get(b1));
                }
            }
        }

        public e(Map map)
        {
            a = m.this;
            super((byte)0);
            c = map;
        }
    }

    private final class f extends i
    {

        final m a;
        private final ArrayList c;

        public final void a()
        {
            Set set = m.c(a).f;
            if (set.isEmpty())
            {
                set = m.g(a);
            }
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((a.b)iterator.next()).a(m.f(a), set)) { }
        }

        public f(ArrayList arraylist)
        {
            a = m.this;
            super((byte)0);
            c = arraylist;
        }
    }

    private final class g
        implements c.b, c.c
    {

        final m a;

        public final void onConnected(Bundle bundle)
        {
            m.e(a).a(new b(a));
        }

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            com.google.android.gms.common.api.m.b(a).lock();
            if (!com.google.android.gms.common.api.m.b(a, connectionresult)) goto _L2; else goto _L1
_L1:
            m.h(a);
            com.google.android.gms.common.api.m.i(a);
_L4:
            com.google.android.gms.common.api.m.b(a).unlock();
            return;
_L2:
            m.a(a, connectionresult);
            if (true) goto _L4; else goto _L3
_L3:
            connectionresult;
            com.google.android.gms.common.api.m.b(a).unlock();
            throw connectionresult;
        }

        public final void onConnectionSuspended(int i1)
        {
        }

        private g()
        {
            a = m.this;
            super();
        }

        g(byte byte0)
        {
            this();
        }
    }

    private final class h extends i
    {

        final m a;
        private final ArrayList c;

        public final void a()
        {
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((a.b)iterator.next()).a(m.f(a))) { }
        }

        public h(ArrayList arraylist)
        {
            a = m.this;
            super((byte)0);
            c = arraylist;
        }
    }

    private abstract class i
        implements Runnable
    {

        final m b;

        protected abstract void a();

        public void run()
        {
            com.google.android.gms.common.api.m.b(b).lock();
            boolean flag = Thread.interrupted();
            if (flag)
            {
                com.google.android.gms.common.api.m.b(b).unlock();
                return;
            }
            a();
            com.google.android.gms.common.api.m.b(b).unlock();
            return;
            Object obj;
            obj;
            m.c(b).a(((RuntimeException) (obj)));
            com.google.android.gms.common.api.m.b(b).unlock();
            return;
            obj;
            com.google.android.gms.common.api.m.b(b).unlock();
            throw obj;
        }

        private i()
        {
            b = m.this;
            super();
        }

        i(byte byte0)
        {
            this();
        }
    }


    private final o a;
    private final Lock b;
    private final Context c;
    private final com.google.android.gms.common.b d;
    private ConnectionResult e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private final Bundle j = new Bundle();
    private final Set k = new HashSet();
    private com.google.android.gms.signin.d l;
    private int m;
    private boolean n;
    private boolean o;
    private r p;
    private boolean q;
    private boolean r;
    private final com.google.android.gms.common.internal.i s;
    private final Map t;
    private final a.a u;
    private ArrayList v;

    public m(o o1, com.google.android.gms.common.internal.i i1, Map map, com.google.android.gms.common.b b1, a.a a1, Lock lock, Context context)
    {
        g = 0;
        h = false;
        v = new ArrayList();
        a = o1;
        s = i1;
        t = map;
        d = b1;
        u = a1;
        b = lock;
        c = context;
    }

    static Context a(m m1)
    {
        return m1.c;
    }

    static void a(m m1, ConnectionResult connectionresult)
    {
        m1.b(connectionresult);
    }

    static void a(m m1, ConnectionResult connectionresult, com.google.android.gms.common.api.a a1, int i1)
    {
        m1.b(connectionresult, a1, i1);
    }

    static void a(m m1, ResolveAccountResponse resolveaccountresponse)
    {
        ConnectionResult connectionresult;
label0:
        {
            if (m1.b(0))
            {
                connectionresult = resolveaccountresponse.b();
                if (!connectionresult.b())
                {
                    break label0;
                }
                m1.p = resolveaccountresponse.a();
                m1.o = true;
                m1.q = resolveaccountresponse.c();
                m1.r = resolveaccountresponse.d();
                m1.f();
            }
            return;
        }
        if (m1.a(connectionresult))
        {
            m1.j();
            m1.f();
            return;
        } else
        {
            m1.b(connectionresult);
            return;
        }
    }

    private void a(boolean flag)
    {
        if (l != null)
        {
            if (l.e() && flag)
            {
                l.c();
            }
            l.d();
            p = null;
        }
    }

    private boolean a(ConnectionResult connectionresult)
    {
        return m == 2 || m == 1 && !connectionresult.a();
    }

    static boolean a(m m1, int i1)
    {
        return m1.b(i1);
    }

    static Lock b(m m1)
    {
        return m1.b;
    }

    private void b(ConnectionResult connectionresult)
    {
        boolean flag = false;
        h = false;
        k();
        if (!connectionresult.a())
        {
            flag = true;
        }
        a(flag);
        a.e.clear();
        a.a(connectionresult);
        if (!a.i() || !com.google.android.gms.common.b.a(c, connectionresult.c()))
        {
            a.k();
            a.a.a(connectionresult);
        }
        a.a.a();
    }

    private void b(ConnectionResult connectionresult, com.google.android.gms.common.api.a a1, int i1)
    {
        boolean flag = true;
        if (i1 == 2) goto _L2; else goto _L1
_L1:
        a1.a();
        if (i1 != 1) goto _L4; else goto _L3
_L3:
        if (connectionresult.a())
        {
            i1 = 1;
        } else
        if (com.google.android.gms.common.b.a(connectionresult.c()) != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        i1 = ((flag) ? 1 : 0);
        if (e == null) goto _L7; else goto _L6
_L6:
        if (0x7fffffff >= f) goto _L5; else goto _L8
_L8:
        i1 = ((flag) ? 1 : 0);
_L7:
        if (i1 != 0)
        {
            e = connectionresult;
            f = 0x7fffffff;
        }
_L2:
        a.e.put(a1.c(), connectionresult);
        return;
_L5:
        i1 = 0;
        if (true) goto _L7; else goto _L9
_L9:
    }

    private boolean b(int i1)
    {
        if (g != i1)
        {
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder("GoogleApiClient connecting is in step ")).append(c(g)).append(" but received callback for step ").append(c(i1)).toString());
            b(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    static boolean b(m m1, ConnectionResult connectionresult)
    {
        return m1.a(connectionresult);
    }

    static o c(m m1)
    {
        return m1.a;
    }

    private static String c(int i1)
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

    static void c(m m1, ConnectionResult connectionresult)
    {
label0:
        {
            if (m1.b(2))
            {
                if (!connectionresult.b())
                {
                    break label0;
                }
                m1.h();
            }
            return;
        }
        if (m1.a(connectionresult))
        {
            m1.j();
            m1.h();
            return;
        } else
        {
            m1.b(connectionresult);
            return;
        }
    }

    static boolean d(m m1)
    {
        return m1.n;
    }

    static com.google.android.gms.signin.d e(m m1)
    {
        return m1.l;
    }

    private boolean e()
    {
        i = i - 1;
        if (i > 0)
        {
            return false;
        }
        if (i < 0)
        {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
            b(new ConnectionResult(8, null));
            return false;
        }
        if (e != null)
        {
            b(e);
            return false;
        } else
        {
            return true;
        }
    }

    static r f(m m1)
    {
        return m1.p;
    }

    private void f()
    {
        if (i == 0)
        {
            if (n)
            {
                if (o)
                {
                    ArrayList arraylist = new ArrayList();
                    g = 1;
                    i = a.d.size();
                    Iterator iterator = a.d.keySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        a.c c1 = (a.c)iterator.next();
                        if (a.e.containsKey(c1))
                        {
                            if (e())
                            {
                                g();
                            }
                        } else
                        {
                            arraylist.add(a.d.get(c1));
                        }
                    } while (true);
                    if (!arraylist.isEmpty())
                    {
                        v.add(com.google.android.gms.common.api.q.a().submit(new h(arraylist)));
                        return;
                    }
                }
            } else
            {
                h();
                return;
            }
        }
    }

    static Set g(m m1)
    {
        return m1.l();
    }

    private void g()
    {
        g = 2;
        a.f = l();
        v.add(com.google.android.gms.common.api.q.a().submit(new c((byte)0)));
    }

    private void h()
    {
        ArrayList arraylist = new ArrayList();
        g = 3;
        i = a.d.size();
        Iterator iterator = a.d.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a.c c1 = (a.c)iterator.next();
            if (a.e.containsKey(c1))
            {
                if (e())
                {
                    i();
                }
            } else
            {
                arraylist.add(a.d.get(c1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            v.add(com.google.android.gms.common.api.q.a().submit(new f(arraylist)));
        }
    }

    static void h(m m1)
    {
        m1.j();
    }

    private void i()
    {
        a.h();
        com.google.android.gms.common.api.q.a().execute(new Runnable() {

            final m a;

            public final void run()
            {
                com.google.android.gms.common.b.b(m.a(a));
            }

            
            {
                a = m.this;
                super();
            }
        });
        if (l != null)
        {
            if (q)
            {
                l.a(p, r);
            }
            a(false);
        }
        a.c c1;
        for (Iterator iterator = a.e.keySet().iterator(); iterator.hasNext(); ((a.b)a.d.get(c1)).d())
        {
            c1 = (a.c)iterator.next();
        }

        if (h)
        {
            h = false;
            b();
            return;
        }
        Bundle bundle;
        if (j.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = j;
        }
        a.a.a(bundle);
    }

    static void i(m m1)
    {
        m1.h();
    }

    private void j()
    {
        n = false;
        a.f = Collections.emptySet();
        Iterator iterator = k.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a.c c1 = (a.c)iterator.next();
            if (!a.e.containsKey(c1))
            {
                a.e.put(c1, new ConnectionResult(17, null));
            }
        } while (true);
    }

    static boolean j(m m1)
    {
        return m1.e();
    }

    private void k()
    {
        for (Iterator iterator = v.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true)) { }
        v.clear();
    }

    static void k(m m1)
    {
        m1.f();
    }

    private Set l()
    {
        HashSet hashset = new HashSet(s.d());
        Map map = s.f();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.a a1 = (com.google.android.gms.common.api.a)iterator.next();
            if (!a.e.containsKey(a1.c()))
            {
                hashset.addAll(((com.google.android.gms.common.internal.i.a)map.get(a1)).a);
            }
        } while (true);
        return hashset;
    }

    static void l(m m1)
    {
        m1.g();
    }

    public final k.a a(k.a a1)
    {
        a.b.add(a1);
        return a1;
    }

    public final void a()
    {
        a.a.b();
        a.e.clear();
        h = false;
        n = false;
        e = null;
        g = 0;
        m = 2;
        o = false;
        q = false;
        HashMap hashmap = new HashMap();
        com.google.android.gms.common.api.a a1;
        a.b b1;
        int i1;
        for (Iterator iterator = t.keySet().iterator(); iterator.hasNext(); hashmap.put(b1, new d(this, a1, i1)))
        {
            a1 = (com.google.android.gms.common.api.a)iterator.next();
            b1 = (a.b)a.d.get(a1.c());
            i1 = ((Integer)t.get(a1)).intValue();
            a1.a();
            if (!b1.f())
            {
                continue;
            }
            n = true;
            if (i1 < m)
            {
                m = i1;
            }
            if (i1 != 0)
            {
                k.add(a1.c());
            }
        }

        if (n)
        {
            s.a(Integer.valueOf(System.identityHashCode(a)));
            g g1 = new g((byte)0);
            l = (com.google.android.gms.signin.d)u.a(c, a.a(), s, s.i(), g1, g1);
        }
        i = a.d.size();
        v.add(com.google.android.gms.common.api.q.a().submit(new e(hashmap)));
    }

    public final void a(int i1)
    {
        b(new ConnectionResult(8, null));
    }

    public final void a(Bundle bundle)
    {
        if (b(3))
        {
            if (bundle != null)
            {
                j.putAll(bundle);
            }
            if (e())
            {
                i();
                return;
            }
        }
    }

    public final void a(ConnectionResult connectionresult, com.google.android.gms.common.api.a a1, int i1)
    {
        if (b(3))
        {
            b(connectionresult, a1, i1);
            if (e())
            {
                i();
                return;
            }
        }
    }

    public final k.a b(k.a a1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void b()
    {
        for (Iterator iterator = a.b.iterator(); iterator.hasNext(); iterator.remove())
        {
            ((o.e)iterator.next()).a();
        }

        a.f();
        if (e == null && !a.b.isEmpty())
        {
            h = true;
            return;
        } else
        {
            k();
            a(true);
            a.e.clear();
            a.a(null);
            a.a.a();
            return;
        }
    }

    public final void c()
    {
        h = false;
    }

    public final String d()
    {
        return "CONNECTING";
    }
}
