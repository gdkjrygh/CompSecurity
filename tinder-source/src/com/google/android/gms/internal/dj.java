// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.u;
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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            dm, es, dl, di, 
//            dn

public final class dj
    implements dm
{
    private static final class a extends com.google.android.gms.signin.internal.b
    {

        private final WeakReference a;

        public final void a(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
        {
            authaccountresult = (dj)a.get();
            if (authaccountresult == null)
            {
                return;
            } else
            {
                ((dj) (authaccountresult)).a.a(new dl.b(this, authaccountresult, authaccountresult, connectionresult) {

                    final dj a;
                    final ConnectionResult b;
                    final a c;

                    public final void a()
                    {
                        dj dj1;
                        ConnectionResult connectionresult;
label0:
                        {
                            dj1 = a;
                            connectionresult = b;
                            if (dj1.b(2))
                            {
                                if (!connectionresult.b())
                                {
                                    break label0;
                                }
                                dj1.h();
                            }
                            return;
                        }
                        if (dj1.a(connectionresult))
                        {
                            dj1.i();
                            dj1.h();
                            return;
                        } else
                        {
                            dj1.b(connectionresult);
                            return;
                        }
                    }

            
            {
                c = a1;
                a = dj1;
                b = connectionresult;
                super(dm1);
            }
                });
                return;
            }
        }

        a(dj dj1)
        {
            a = new WeakReference(dj1);
        }
    }

    private static final class b extends com.google.android.gms.common.internal.s.a
    {

        private final WeakReference a;

        public final void a(ResolveAccountResponse resolveaccountresponse)
        {
            dj dj1 = (dj)a.get();
            if (dj1 == null)
            {
                return;
            } else
            {
                dj1.a.a(new dl.b(this, dj1, dj1, resolveaccountresponse) {

                    final dj a;
                    final ResolveAccountResponse b;
                    final b c;

                    public final void a()
                    {
                        dj dj1;
                        ConnectionResult connectionresult;
label0:
                        {
                            dj1 = a;
                            ResolveAccountResponse resolveaccountresponse = b;
                            if (dj1.b(0))
                            {
                                connectionresult = resolveaccountresponse.c;
                                if (!connectionresult.b())
                                {
                                    break label0;
                                }
                                dj1.g = com.google.android.gms.common.internal.o.a.a(resolveaccountresponse.b);
                                dj1.f = true;
                                dj1.h = resolveaccountresponse.d;
                                dj1.i = resolveaccountresponse.e;
                                dj1.f();
                            }
                            return;
                        }
                        if (dj1.a(connectionresult))
                        {
                            dj1.i();
                            dj1.f();
                            return;
                        } else
                        {
                            dj1.b(connectionresult);
                            return;
                        }
                    }

            
            {
                c = b1;
                a = dj1;
                b = resolveaccountresponse;
                super(dm1);
            }
                });
                return;
            }
        }

        b(dj dj1)
        {
            a = new WeakReference(dj1);
        }
    }

    private final class c extends i
    {

        final dj a;

        public final void a()
        {
            a.d.a(a.g, a.a.o, new a(a));
        }

        private c()
        {
            a = dj.this;
            super((byte)0);
        }

        c(byte byte0)
        {
            this();
        }
    }

    private static final class d
        implements com.google.android.gms.common.api.c.e
    {

        private final WeakReference a;
        private final com.google.android.gms.common.api.a b;
        private final int c;

        public final void a(ConnectionResult connectionresult)
        {
            dj dj1;
            boolean flag = false;
            dj1 = (dj)a.get();
            if (dj1 == null)
            {
                return;
            }
            if (Looper.myLooper() == dj1.a.e)
            {
                flag = true;
            }
            com.google.android.gms.common.internal.u.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            dj1.b.lock();
            boolean flag1 = dj1.b(0);
            if (!flag1)
            {
                dj1.b.unlock();
                return;
            }
            if (!connectionresult.b())
            {
                dj1.b(connectionresult, b, c);
            }
            if (dj1.e())
            {
                dj1.f();
            }
            dj1.b.unlock();
            return;
            connectionresult;
            dj1.b.unlock();
            throw connectionresult;
        }

        public final void b(ConnectionResult connectionresult)
        {
            dj dj1;
            boolean flag = true;
            dj1 = (dj)a.get();
            if (dj1 == null)
            {
                return;
            }
            if (Looper.myLooper() != dj1.a.e)
            {
                flag = false;
            }
            com.google.android.gms.common.internal.u.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
            dj1.b.lock();
            flag = dj1.b(1);
            if (!flag)
            {
                dj1.b.unlock();
                return;
            }
            if (!connectionresult.b())
            {
                dj1.b(connectionresult, b, c);
            }
            if (dj1.e())
            {
                dj1.g();
            }
            dj1.b.unlock();
            return;
            connectionresult;
            dj1.b.unlock();
            throw connectionresult;
        }

        public d(dj dj1, com.google.android.gms.common.api.a a1, int i1)
        {
            a = new WeakReference(dj1);
            b = a1;
            c = i1;
        }
    }

    private final class e extends i
    {

        final dj a;
        private final Map c;

        public final void a()
        {
            int i1 = com.google.android.gms.common.b.a(a.c);
            if (i1 != 0)
            {
                ConnectionResult connectionresult = new ConnectionResult(i1, null);
                a.a.a(new dl.b(this, a, connectionresult) {

                    final ConnectionResult a;
                    final e b;

                    public final void a()
                    {
                        b.a.b(a);
                    }

            
            {
                b = e1;
                a = connectionresult;
                super(dm1);
            }
                });
            } else
            {
                if (a.e)
                {
                    a.d.h();
                }
                Iterator iterator = c.keySet().iterator();
                while (iterator.hasNext()) 
                {
                    com.google.android.gms.common.api.a.b b1 = (com.google.android.gms.common.api.a.b)iterator.next();
                    b1.a((com.google.android.gms.common.api.c.e)c.get(b1));
                }
            }
        }

        public e(Map map)
        {
            a = dj.this;
            super((byte)0);
            c = map;
        }
    }

    private final class f extends i
    {

        final dj a;
        private final ArrayList c;

        public final void a()
        {
            Set set = a.a.o;
            if (set.isEmpty())
            {
                set = a.j();
            }
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.a.b)iterator.next()).a(a.g, set)) { }
        }

        public f(ArrayList arraylist)
        {
            a = dj.this;
            super((byte)0);
            c = arraylist;
        }
    }

    private final class g
        implements com.google.android.gms.common.api.c.b, com.google.android.gms.common.api.c.c
    {

        final dj a;

        public final void a(int i1)
        {
        }

        public final void a(Bundle bundle)
        {
            a.d.a(new b(a));
        }

        public final void a(ConnectionResult connectionresult)
        {
            a.b.lock();
            if (!a.a(connectionresult)) goto _L2; else goto _L1
_L1:
            a.i();
            a.h();
_L4:
            a.b.unlock();
            return;
_L2:
            a.b(connectionresult);
            if (true) goto _L4; else goto _L3
_L3:
            connectionresult;
            a.b.unlock();
            throw connectionresult;
        }

        private g()
        {
            a = dj.this;
            super();
        }

        g(byte byte0)
        {
            this();
        }
    }

    private final class h extends i
    {

        final dj a;
        private final ArrayList c;

        public final void a()
        {
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.a.b)iterator.next()).a(a.g)) { }
        }

        public h(ArrayList arraylist)
        {
            a = dj.this;
            super((byte)0);
            c = arraylist;
        }
    }

    private abstract class i
        implements Runnable
    {

        final dj b;

        protected abstract void a();

        public void run()
        {
            b.b.lock();
            boolean flag = Thread.interrupted();
            if (flag)
            {
                b.b.unlock();
                return;
            }
            a();
            b.b.unlock();
            return;
            RuntimeException runtimeexception;
            runtimeexception;
            dl dl1 = b.a;
            android.os.Message message = dl1.j.obtainMessage(4, runtimeexception);
            dl1.j.sendMessage(message);
            b.b.unlock();
            return;
            Exception exception;
            exception;
            b.b.unlock();
            throw exception;
        }

        private i()
        {
            b = dj.this;
            super();
        }

        i(byte byte0)
        {
            this();
        }
    }


    final dl a;
    final Lock b;
    final Context c;
    es d;
    boolean e;
    boolean f;
    o g;
    boolean h;
    boolean i;
    private final com.google.android.gms.common.b j;
    private ConnectionResult k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private final Bundle p = new Bundle();
    private final Set q = new HashSet();
    private int r;
    private final com.google.android.gms.common.internal.g s;
    private final Map t;
    private final com.google.android.gms.common.api.a.a u;
    private ArrayList v;

    public dj(dl dl1, com.google.android.gms.common.internal.g g1, Map map, com.google.android.gms.common.b b1, com.google.android.gms.common.api.a.a a1, Lock lock, Context context)
    {
        m = 0;
        n = false;
        v = new ArrayList();
        a = dl1;
        s = g1;
        t = map;
        j = b1;
        u = a1;
        b = lock;
        c = context;
    }

    private void a(boolean flag)
    {
        if (d != null)
        {
            if (d.b() && flag)
            {
                d.f_();
            }
            d.a();
            g = null;
        }
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

    private void k()
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = a;
        ((dl) (obj)).a.lock();
        ((dl) (obj)).g();
        obj.s = new di(((dl) (obj)));
        ((dl) (obj)).s.a();
        ((dl) (obj)).b.signalAll();
        ((dl) (obj)).a.unlock();
        com.google.android.gms.internal.dn.a().execute(new Runnable() {

            final dj a;

            public final void run()
            {
                com.google.android.gms.common.b.b(a.c);
            }

            
            {
                a = dj.this;
                super();
            }
        });
        if (d != null)
        {
            if (h)
            {
                d.a(g, i);
            }
            a(false);
        }
        com.google.android.gms.common.api.a.c c1;
        for (obj = a.n.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((com.google.android.gms.common.api.a.b)a.m.get(c1)).a())
        {
            c1 = (com.google.android.gms.common.api.a.c)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_186;
        Exception exception;
        exception;
        ((dl) (obj)).a.unlock();
        throw exception;
        Object obj2;
        k k1;
        boolean flag;
        if (n)
        {
            n = false;
            b();
            return;
        }
        Object obj1;
        Object obj3;
        com.google.android.gms.common.api.c.b b1;
        int i1;
        if (p.isEmpty())
        {
            obj1 = null;
        } else
        {
            obj1 = p;
        }
        k1 = a.c;
        if (Looper.myLooper() == k1.h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.u.a(flag, "onConnectionSuccess must only be called on the Handler thread");
        obj2 = k1.i;
        obj2;
        JVM INSTR monitorenter ;
        if (!k1.g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.u.a(flag);
        k1.h.removeMessages(1);
        k1.g = true;
        if (k1.c.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.u.a(flag);
        obj3 = new ArrayList(k1.b);
        i1 = k1.f.get();
        obj3 = ((ArrayList) (obj3)).iterator();
        do
        {
            if (!((Iterator) (obj3)).hasNext())
            {
                break;
            }
            b1 = (com.google.android.gms.common.api.c.b)((Iterator) (obj3)).next();
            if (!k1.e || !k1.a.b() || k1.f.get() != i1)
            {
                break;
            }
            if (!k1.c.contains(b1))
            {
                b1.a(((Bundle) (obj1)));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_436;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        k1.c.clear();
        k1.g = false;
        obj2;
        JVM INSTR monitorexit ;
    }

    private void l()
    {
        for (Iterator iterator = v.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true)) { }
        v.clear();
    }

    public final dg.a a(dg.a a1)
    {
        a.f.add(a1);
        return a1;
    }

    public final void a()
    {
        a.c.e = true;
        a.n.clear();
        n = false;
        e = false;
        k = null;
        m = 0;
        r = 2;
        f = false;
        h = false;
        HashMap hashmap = new HashMap();
        com.google.android.gms.common.api.a a1;
        com.google.android.gms.common.api.a.b b1;
        int i1;
        for (Iterator iterator = t.keySet().iterator(); iterator.hasNext(); hashmap.put(b1, new d(this, a1, i1)))
        {
            a1 = (com.google.android.gms.common.api.a)iterator.next();
            b1 = (com.google.android.gms.common.api.a.b)a.m.get(a1.b());
            i1 = ((Integer)t.get(a1)).intValue();
            a1.a();
            if (!b1.c())
            {
                continue;
            }
            e = true;
            if (i1 < r)
            {
                r = i1;
            }
            if (i1 != 0)
            {
                q.add(a1.b());
            }
        }

        if (e)
        {
            s.h = Integer.valueOf(System.identityHashCode(a));
            g g1 = new g((byte)0);
            d = (es)u.a(c, a.e, s, s.g, g1, g1);
        }
        o = a.m.size();
        v.add(com.google.android.gms.internal.dn.a().submit(new e(hashmap)));
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
                p.putAll(bundle);
            }
            if (e())
            {
                k();
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
                k();
                return;
            }
        }
    }

    final boolean a(ConnectionResult connectionresult)
    {
        return r == 2 || r == 1 && !connectionresult.a();
    }

    public final dg.a b(dg.a a1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void b()
    {
        for (Iterator iterator = a.f.iterator(); iterator.hasNext(); iterator.remove())
        {
            ((dl.f)iterator.next()).f();
        }

        a.f();
        if (k == null && !a.f.isEmpty())
        {
            n = true;
            return;
        } else
        {
            l();
            a(true);
            a.n.clear();
            a.a(null);
            a.c.a();
            return;
        }
    }

    final void b(ConnectionResult connectionresult)
    {
        Object obj;
        k k1;
        com.google.android.gms.common.api.c.c c1;
        boolean flag;
        l();
        Object obj1;
        int i1;
        if (!connectionresult.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        a.n.clear();
        a.a(connectionresult);
        if (!com.google.android.gms.common.b.a(c, connectionresult.c))
        {
            a.g();
        }
        if (n || a.g) goto _L2; else goto _L1
_L1:
        k1 = a.c;
        if (Looper.myLooper() == k1.h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.u.a(flag, "onConnectionFailure must only be called on the Handler thread");
        k1.h.removeMessages(1);
        obj = k1.i;
        obj;
        JVM INSTR monitorenter ;
        obj1 = new ArrayList(k1.d);
        i1 = k1.f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L7:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        c1 = (com.google.android.gms.common.api.c.c)((Iterator) (obj1)).next();
        if (k1.e && k1.f.get() == i1) goto _L5; else goto _L2
_L2:
        n = false;
        a.c.a();
        return;
_L5:
        if (!k1.d.contains(c1)) goto _L7; else goto _L6
_L6:
        c1.a(connectionresult);
          goto _L7
        connectionresult;
        obj;
        JVM INSTR monitorexit ;
        throw connectionresult;
_L4:
        obj;
        JVM INSTR monitorexit ;
          goto _L2
    }

    final void b(ConnectionResult connectionresult, com.google.android.gms.common.api.a a1, int i1)
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
        if (com.google.android.gms.common.b.a(null, connectionresult.c, null) != null)
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
            k = connectionresult;
            l = 0x7fffffff;
        }
_L2:
        a.n.put(a1.b(), connectionresult);
        return;
_L5:
        i1 = 0;
        if (true) goto _L7; else goto _L9
_L9:
    }

    final boolean b(int i1)
    {
        if (m != i1)
        {
            Log.i("GoogleApiClientConnecting", a.h());
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder("GoogleApiClient connecting is in step ")).append(c(m)).append(" but received callback for step ").append(c(i1)).toString(), new Exception());
            b(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    public final void c()
    {
        n = false;
    }

    public final String d()
    {
        return "CONNECTING";
    }

    final boolean e()
    {
        o = o - 1;
        if (o > 0)
        {
            return false;
        }
        if (o < 0)
        {
            Log.i("GoogleApiClientConnecting", a.h());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new ConnectionResult(8, null));
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

    final void f()
    {
        if (o == 0)
        {
            if (e)
            {
                if (f)
                {
                    ArrayList arraylist = new ArrayList();
                    m = 1;
                    o = a.m.size();
                    Iterator iterator = a.m.keySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        com.google.android.gms.common.api.a.c c1 = (com.google.android.gms.common.api.a.c)iterator.next();
                        if (a.n.containsKey(c1))
                        {
                            if (e())
                            {
                                g();
                            }
                        } else
                        {
                            arraylist.add(a.m.get(c1));
                        }
                    } while (true);
                    if (!arraylist.isEmpty())
                    {
                        v.add(com.google.android.gms.internal.dn.a().submit(new h(arraylist)));
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

    final void g()
    {
        m = 2;
        a.o = j();
        v.add(com.google.android.gms.internal.dn.a().submit(new c((byte)0)));
    }

    final void h()
    {
        ArrayList arraylist = new ArrayList();
        m = 3;
        o = a.m.size();
        Iterator iterator = a.m.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.a.c c1 = (com.google.android.gms.common.api.a.c)iterator.next();
            if (a.n.containsKey(c1))
            {
                if (e())
                {
                    k();
                }
            } else
            {
                arraylist.add(a.m.get(c1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            v.add(com.google.android.gms.internal.dn.a().submit(new f(arraylist)));
        }
    }

    final void i()
    {
        e = false;
        a.o = Collections.emptySet();
        Iterator iterator = q.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.a.c c1 = (com.google.android.gms.common.api.a.c)iterator.next();
            if (!a.n.containsKey(c1))
            {
                a.n.put(c1, new ConnectionResult(17, null));
            }
        } while (true);
    }

    final Set j()
    {
        HashSet hashset = new HashSet(s.b);
        Map map = s.d;
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.a a1 = (com.google.android.gms.common.api.a)iterator.next();
            if (!a.n.containsKey(a1.b()))
            {
                hashset.addAll(((com.google.android.gms.common.internal.g.a)map.get(a1)).a);
            }
        } while (true);
        return hashset;
    }
}
