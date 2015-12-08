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
import com.google.android.gms.common.internal.z;
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
//            o, a, n, p

public class zzg
    implements o
{
    private static class a extends com.google.android.gms.signin.internal.b
    {

        private final WeakReference a;

        public void a(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
        {
            authaccountresult = (zzg)a.get();
            if (authaccountresult == null)
            {
                return;
            } else
            {
                com.google.android.gms.common.api.zzg.d(authaccountresult).a(new n.b(this, authaccountresult, authaccountresult, connectionresult) {

                    final zzg a;
                    final ConnectionResult b;
                    final a c;

                    public void a()
                    {
                        zzg.c(a, b);
                    }

            
            {
                c = a1;
                a = zzg1;
                b = connectionresult;
                super(o1);
            }
                });
                return;
            }
        }

        a(zzg zzg1)
        {
            a = new WeakReference(zzg1);
        }
    }

    private static class b extends com.google.android.gms.common.internal.v.a
    {

        private final WeakReference a;

        public void a(ResolveAccountResponse resolveaccountresponse)
        {
            zzg zzg1 = (zzg)a.get();
            if (zzg1 == null)
            {
                return;
            } else
            {
                com.google.android.gms.common.api.zzg.d(zzg1).a(new n.b(this, zzg1, zzg1, resolveaccountresponse) {

                    final zzg a;
                    final ResolveAccountResponse b;
                    final b c;

                    public void a()
                    {
                        zzg.a(a, b);
                    }

            
            {
                c = b1;
                a = zzg1;
                b = resolveaccountresponse;
                super(o1);
            }
                });
                return;
            }
        }

        b(zzg zzg1)
        {
            a = new WeakReference(zzg1);
        }
    }

    private static class c
        implements c.e
    {

        private final WeakReference a;
        private final com.google.android.gms.common.api.a b;
        private final int c;

        public void a(ConnectionResult connectionresult)
        {
            zzg zzg1;
            boolean flag = false;
            zzg1 = (zzg)a.get();
            if (zzg1 == null)
            {
                return;
            }
            if (Looper.myLooper() == com.google.android.gms.common.api.zzg.d(zzg1).a())
            {
                flag = true;
            }
            z.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zzg.c(zzg1).lock();
            boolean flag1 = zzg.a(zzg1, 0);
            if (!flag1)
            {
                zzg.c(zzg1).unlock();
                return;
            }
            if (!connectionresult.b())
            {
                zzg.a(zzg1, connectionresult, b, c);
            }
            if (zzg.k(zzg1))
            {
                zzg.l(zzg1);
            }
            zzg.c(zzg1).unlock();
            return;
            connectionresult;
            zzg.c(zzg1).unlock();
            throw connectionresult;
        }

        public void b(ConnectionResult connectionresult)
        {
            zzg zzg1;
            boolean flag = true;
            zzg1 = (zzg)a.get();
            if (zzg1 == null)
            {
                return;
            }
            if (Looper.myLooper() != com.google.android.gms.common.api.zzg.d(zzg1).a())
            {
                flag = false;
            }
            z.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
            zzg.c(zzg1).lock();
            flag = zzg.a(zzg1, 1);
            if (!flag)
            {
                zzg.c(zzg1).unlock();
                return;
            }
            if (!connectionresult.b())
            {
                zzg.a(zzg1, connectionresult, b, c);
            }
            if (zzg.k(zzg1))
            {
                zzg.m(zzg1);
            }
            zzg.c(zzg1).unlock();
            return;
            connectionresult;
            zzg.c(zzg1).unlock();
            throw connectionresult;
        }

        public c(zzg zzg1, com.google.android.gms.common.api.a a1, int i1)
        {
            a = new WeakReference(zzg1);
            b = a1;
            c = i1;
        }
    }

    private class d
        implements c.b, c.c
    {

        final zzg a;

        public void onConnected(Bundle bundle)
        {
            zzg.f(a).a(new b(a));
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzg.c(a).lock();
            if (!com.google.android.gms.common.api.zzg.b(a, connectionresult)) goto _L2; else goto _L1
_L1:
            com.google.android.gms.common.api.zzg.i(a);
            zzg.j(a);
_L4:
            zzg.c(a).unlock();
            return;
_L2:
            zzg.a(a, connectionresult);
            if (true) goto _L4; else goto _L3
_L3:
            connectionresult;
            zzg.c(a).unlock();
            throw connectionresult;
        }

        public void onConnectionSuspended(int i1)
        {
        }

        private d()
        {
            a = zzg.this;
            super();
        }

    }

    private class zzc extends zzi
    {

        final zzg a;

        public void a()
        {
            zzg.f(a).a(zzg.g(a), com.google.android.gms.common.api.zzg.d(a).f, new a(a));
        }

        private zzc()
        {
            a = zzg.this;
            super();
        }

    }

    private class zze extends zzi
    {

        final zzg a;
        private final Map c;

        public void a()
        {
            int i1 = com.google.android.gms.common.api.zzg.b(a).a(zzg.a(a));
            if (i1 != 0)
            {
                ConnectionResult connectionresult = new ConnectionResult(i1, null);
                com.google.android.gms.common.api.zzg.d(a).a(new n.b(this, a, connectionresult) {

                    final ConnectionResult a;
                    final zze b;

                    public void a()
                    {
                        zzg.a(b.a, a);
                    }

            
            {
                b = zze1;
                a = connectionresult;
                super(o1);
            }
                });
            } else
            {
                if (zzg.e(a))
                {
                    zzg.f(a).b();
                }
                Iterator iterator = c.keySet().iterator();
                while (iterator.hasNext()) 
                {
                    a.c c1 = (a.c)iterator.next();
                    c1.zza((c.e)c.get(c1));
                }
            }
        }

        public zze(Map map)
        {
            a = zzg.this;
            super();
            c = map;
        }
    }

    private class zzf extends zzi
    {

        final zzg a;
        private final ArrayList c;

        public void a()
        {
            Set set = com.google.android.gms.common.api.zzg.d(a).f;
            if (set.isEmpty())
            {
                set = zzg.h(a);
            }
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((a.c)iterator.next()).zza(zzg.g(a), set)) { }
        }

        public zzf(ArrayList arraylist)
        {
            a = zzg.this;
            super();
            c = arraylist;
        }
    }

    private class zzh extends zzi
    {

        final zzg a;
        private final ArrayList c;

        public void a()
        {
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((a.c)iterator.next()).zza(zzg.g(a))) { }
        }

        public zzh(ArrayList arraylist)
        {
            a = zzg.this;
            super();
            c = arraylist;
        }
    }

    private abstract class zzi
        implements Runnable
    {

        final zzg b;

        protected abstract void a();

        public void run()
        {
            zzg.c(b).lock();
            boolean flag = Thread.interrupted();
            if (flag)
            {
                zzg.c(b).unlock();
                return;
            }
            a();
            zzg.c(b).unlock();
            return;
            Object obj;
            obj;
            com.google.android.gms.common.api.zzg.d(b).a(((RuntimeException) (obj)));
            zzg.c(b).unlock();
            return;
            obj;
            zzg.c(b).unlock();
            throw obj;
        }

        private zzi()
        {
            b = zzg.this;
            super();
        }

    }


    private final com.google.android.gms.common.api.n a;
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
    private final i s;
    private final Map t;
    private final a.b u;
    private ArrayList v;

    public zzg(com.google.android.gms.common.api.n n1, i i1, Map map, com.google.android.gms.common.b b1, a.b b2, Lock lock, Context context)
    {
        g = 0;
        h = false;
        v = new ArrayList();
        a = n1;
        s = i1;
        t = map;
        d = b1;
        u = b2;
        b = lock;
        c = context;
    }

    static Context a(zzg zzg1)
    {
        return zzg1.c;
    }

    private void a(ConnectionResult connectionresult)
    {
        if (!b(2))
        {
            return;
        }
        if (connectionresult.b())
        {
            i();
            return;
        }
        if (c(connectionresult))
        {
            k();
            i();
            return;
        } else
        {
            d(connectionresult);
            return;
        }
    }

    static void a(zzg zzg1, ConnectionResult connectionresult)
    {
        zzg1.d(connectionresult);
    }

    static void a(zzg zzg1, ConnectionResult connectionresult, com.google.android.gms.common.api.a a1, int i1)
    {
        zzg1.b(connectionresult, a1, i1);
    }

    static void a(zzg zzg1, ResolveAccountResponse resolveaccountresponse)
    {
        zzg1.a(resolveaccountresponse);
    }

    private void a(ResolveAccountResponse resolveaccountresponse)
    {
        if (!b(0))
        {
            return;
        }
        ConnectionResult connectionresult = resolveaccountresponse.b();
        if (connectionresult.b())
        {
            p = resolveaccountresponse.a();
            o = true;
            q = resolveaccountresponse.c();
            r = resolveaccountresponse.d();
            f();
            return;
        }
        if (c(connectionresult))
        {
            k();
            f();
            return;
        } else
        {
            d(connectionresult);
            return;
        }
    }

    private void a(boolean flag)
    {
        if (l != null)
        {
            if (l.isConnected() && flag)
            {
                l.a();
            }
            l.disconnect();
            p = null;
        }
    }

    private boolean a(int i1, int j1, ConnectionResult connectionresult)
    {
        while (j1 == 1 && !b(connectionresult) || e != null && i1 >= f) 
        {
            return false;
        }
        return true;
    }

    static boolean a(zzg zzg1, int i1)
    {
        return zzg1.b(i1);
    }

    static com.google.android.gms.common.b b(zzg zzg1)
    {
        return zzg1.d;
    }

    private void b(ConnectionResult connectionresult, com.google.android.gms.common.api.a a1, int i1)
    {
        if (i1 != 2)
        {
            int j1 = a1.a().a();
            if (a(j1, i1, connectionresult))
            {
                e = connectionresult;
                f = j1;
            }
        }
        a.e.put(a1.c(), connectionresult);
    }

    private boolean b(int i1)
    {
        if (g != i1)
        {
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder()).append("GoogleApiClient connecting is in step ").append(c(g)).append(" but received callback for step ").append(c(i1)).toString());
            d(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    private boolean b(ConnectionResult connectionresult)
    {
        while (connectionresult.a() || d.a(connectionresult.c()) != null) 
        {
            return true;
        }
        return false;
    }

    static boolean b(zzg zzg1, ConnectionResult connectionresult)
    {
        return zzg1.c(connectionresult);
    }

    private String c(int i1)
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

    static Lock c(zzg zzg1)
    {
        return zzg1.b;
    }

    static void c(zzg zzg1, ConnectionResult connectionresult)
    {
        zzg1.a(connectionresult);
    }

    private boolean c(ConnectionResult connectionresult)
    {
        return m == 2 || m == 1 && !connectionresult.a();
    }

    static com.google.android.gms.common.api.n d(zzg zzg1)
    {
        return zzg1.a;
    }

    private void d(ConnectionResult connectionresult)
    {
        boolean flag = false;
        h = false;
        l();
        if (!connectionresult.a())
        {
            flag = true;
        }
        a(flag);
        a.e.clear();
        a.a(connectionresult);
        if (!a.j() || !d.a(c, connectionresult.c()))
        {
            a.l();
            a.a.a(connectionresult);
        }
        a.a.a();
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
            d(new ConnectionResult(8, null));
            return false;
        }
        if (e != null)
        {
            d(e);
            return false;
        } else
        {
            return true;
        }
    }

    static boolean e(zzg zzg1)
    {
        return zzg1.n;
    }

    static com.google.android.gms.signin.d f(zzg zzg1)
    {
        return zzg1.l;
    }

    private void f()
    {
        if (i == 0)
        {
            if (n)
            {
                if (o)
                {
                    g();
                    return;
                }
            } else
            {
                i();
                return;
            }
        }
    }

    static r g(zzg zzg1)
    {
        return zzg1.p;
    }

    private void g()
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
            a.d d1 = (a.d)iterator.next();
            if (a.e.containsKey(d1))
            {
                if (e())
                {
                    h();
                }
            } else
            {
                arraylist.add(a.d.get(d1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            v.add(com.google.android.gms.common.api.p.a().submit(new zzh(arraylist)));
        }
    }

    static Set h(zzg zzg1)
    {
        return zzg1.m();
    }

    private void h()
    {
        g = 2;
        a.f = m();
        v.add(com.google.android.gms.common.api.p.a().submit(new zzc()));
    }

    private void i()
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
            a.d d1 = (a.d)iterator.next();
            if (a.e.containsKey(d1))
            {
                if (e())
                {
                    j();
                }
            } else
            {
                arraylist.add(a.d.get(d1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            v.add(com.google.android.gms.common.api.p.a().submit(new zzf(arraylist)));
        }
    }

    static void i(zzg zzg1)
    {
        zzg1.k();
    }

    private void j()
    {
        a.i();
        com.google.android.gms.common.api.p.a().execute(new Runnable() {

            final zzg a;

            public void run()
            {
                com.google.android.gms.common.api.zzg.b(a).b(zzg.a(a));
            }

            
            {
                a = zzg.this;
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
        a.d d1;
        for (Iterator iterator = a.e.keySet().iterator(); iterator.hasNext(); ((a.c)a.d.get(d1)).disconnect())
        {
            d1 = (a.d)iterator.next();
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

    static void j(zzg zzg1)
    {
        zzg1.i();
    }

    private void k()
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
            a.d d1 = (a.d)iterator.next();
            if (!a.e.containsKey(d1))
            {
                a.e.put(d1, new ConnectionResult(17, null));
            }
        } while (true);
    }

    static boolean k(zzg zzg1)
    {
        return zzg1.e();
    }

    private void l()
    {
        for (Iterator iterator = v.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true)) { }
        v.clear();
    }

    static void l(zzg zzg1)
    {
        zzg1.f();
    }

    private Set m()
    {
        HashSet hashset = new HashSet(s.c());
        Map map = s.e();
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

    static void m(zzg zzg1)
    {
        zzg1.h();
    }

    public k.a a(k.a a1)
    {
        a.b.add(a1);
        return a1;
    }

    public void a()
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
        Iterator iterator = t.keySet().iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            com.google.android.gms.common.api.a a1 = (com.google.android.gms.common.api.a)iterator.next();
            a.c c1 = (a.c)a.d.get(a1.c());
            int i1 = ((Integer)t.get(a1)).intValue();
            boolean flag1;
            if (a1.a().a() == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (c1.zzlm())
            {
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
            hashmap.put(c1, new c(this, a1, i1));
            flag = flag1 | flag;
        }
        if (flag)
        {
            n = false;
        }
        if (n)
        {
            s.a(Integer.valueOf(a.m()));
            d d1 = new d();
            l = (com.google.android.gms.signin.d)u.a(c, a.a(), s, s.h(), d1, d1);
        }
        i = a.d.size();
        v.add(com.google.android.gms.common.api.p.a().submit(new zze(hashmap)));
    }

    public void a(int i1)
    {
        d(new ConnectionResult(8, null));
    }

    public void a(Bundle bundle)
    {
        if (b(3))
        {
            if (bundle != null)
            {
                j.putAll(bundle);
            }
            if (e())
            {
                j();
                return;
            }
        }
    }

    public void a(ConnectionResult connectionresult, com.google.android.gms.common.api.a a1, int i1)
    {
        if (b(3))
        {
            b(connectionresult, a1, i1);
            if (e())
            {
                j();
                return;
            }
        }
    }

    public void b()
    {
        Iterator iterator = a.b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            n.e e1 = (n.e)iterator.next();
            if (e1.f() != 1)
            {
                e1.b();
                iterator.remove();
            }
        } while (true);
        a.f();
        if (e == null && !a.b.isEmpty())
        {
            h = true;
            return;
        } else
        {
            l();
            a(true);
            a.e.clear();
            a.a(null);
            a.a.a();
            return;
        }
    }

    public void c()
    {
        h = false;
    }

    public String d()
    {
        return "CONNECTING";
    }
}
