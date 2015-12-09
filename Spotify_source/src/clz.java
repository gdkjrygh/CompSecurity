// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
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

public final class clz
    implements cmq
{

    final cmk a;
    final Lock b;
    final Context c;
    cok d;
    boolean e;
    boolean f;
    bsu g;
    boolean h;
    boolean i;
    private ConnectionResult j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private final Bundle o = new Bundle();
    private final Set p = new HashSet();
    private int q;
    private final bry r;
    private final Map s;
    private final bqq t;
    private ArrayList u;

    public clz(cmk cmk1, bry bry1, Map map, bqq bqq1, Lock lock, Context context)
    {
        l = 0;
        m = false;
        u = new ArrayList();
        a = cmk1;
        r = bry1;
        s = map;
        t = bqq1;
        b = lock;
        c = context;
    }

    private void a(boolean flag)
    {
        if (d != null)
        {
            if (d.k() && flag)
            {
                d.d();
            }
            d.c();
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
        ((cmk) (obj)).a.lock();
        ((cmk) (obj)).h();
        obj.r = new cly(((cmk) (obj)));
        ((cmk) (obj)).r.a();
        ((cmk) (obj)).b.signalAll();
        ((cmk) (obj)).a.unlock();
        cmr.a().execute(new Runnable() {

            private clz a;

            public final void run()
            {
                bqi.b(a.c);
            }

            
            {
                a = clz.this;
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
        bqs bqs1;
        for (obj = a.m.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((bqr)a.l.get(bqs1)).c())
        {
            bqs1 = (bqs)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_186;
        Exception exception;
        exception;
        ((cmk) (obj)).a.unlock();
        throw exception;
        Object obj2;
        bsm bsm1;
        boolean flag;
        if (m)
        {
            m = false;
            b();
            return;
        }
        Object obj1;
        Object obj3;
        bqw bqw1;
        int i1;
        if (o.isEmpty())
        {
            obj1 = null;
        } else
        {
            obj1 = o;
        }
        bsm1 = a.c;
        if (Looper.myLooper() == bsm1.h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag, "onConnectionSuccess must only be called on the Handler thread");
        obj2 = bsm1.i;
        obj2;
        JVM INSTR monitorenter ;
        if (!bsm1.g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag);
        bsm1.h.removeMessages(1);
        bsm1.g = true;
        if (bsm1.c.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        btl.a(flag);
        obj3 = new ArrayList(bsm1.b);
        i1 = bsm1.f.get();
        obj3 = ((ArrayList) (obj3)).iterator();
        do
        {
            if (!((Iterator) (obj3)).hasNext())
            {
                break;
            }
            bqw1 = (bqw)((Iterator) (obj3)).next();
            if (!bsm1.e || !bsm1.a.k() || bsm1.f.get() != i1)
            {
                break;
            }
            if (!bsm1.c.contains(bqw1))
            {
                bqw1.a(((Bundle) (obj1)));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_436;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        bsm1.c.clear();
        bsm1.g = false;
        obj2;
        JVM INSTR monitorexit ;
    }

    private void l()
    {
        for (Iterator iterator = u.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true)) { }
        u.clear();
    }

    public final clu a(clu clu)
    {
        a.f.add(clu);
        return clu;
    }

    public final void a()
    {
        a.c.e = true;
        a.m.clear();
        m = false;
        e = false;
        j = null;
        l = 0;
        q = 2;
        f = false;
        h = false;
        HashMap hashmap = new HashMap();
        bql bql1;
        bqr bqr1;
        int i1;
        for (Iterator iterator = s.keySet().iterator(); iterator.hasNext(); hashmap.put(bqr1, new cmd(this, bql1, i1)))
        {
            bql1 = (bql)iterator.next();
            bqr1 = (bqr)a.l.get(bql1.b());
            i1 = ((Integer)s.get(bql1)).intValue();
            bql1.a();
            if (!bqr1.l())
            {
                continue;
            }
            e = true;
            if (i1 < q)
            {
                q = i1;
            }
            if (i1 != 0)
            {
                p.add(bql1.b());
            }
        }

        if (e)
        {
            r.g = Integer.valueOf(System.identityHashCode(a));
            cmg cmg1 = new cmg(this, (byte)0);
            d = (cok)t.a(c, a.e, r, r.f, cmg1, cmg1);
        }
        n = a.l.size();
        u.add(cmr.a().submit(new cme(this, hashmap)));
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
                o.putAll(bundle);
            }
            if (e())
            {
                k();
                return;
            }
        }
    }

    public final void a(ConnectionResult connectionresult, bql bql1, int i1)
    {
        if (b(3))
        {
            b(connectionresult, bql1, i1);
            if (e())
            {
                k();
                return;
            }
        }
    }

    final boolean a(ConnectionResult connectionresult)
    {
        return q == 2 || q == 1 && !connectionresult.a();
    }

    public final clu b(clu clu)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void b()
    {
        for (Iterator iterator = a.f.iterator(); iterator.hasNext(); iterator.remove())
        {
            ((cmp)iterator.next()).f();
        }

        a.f();
        if (j == null && !a.f.isEmpty())
        {
            m = true;
            return;
        } else
        {
            l();
            a(true);
            a.m.clear();
            a.g();
            a.c.a();
            return;
        }
    }

    final void b(ConnectionResult connectionresult)
    {
        Object obj;
        bsm bsm1;
        bqx bqx1;
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
        a.m.clear();
        a.g();
        if (!bqi.a(c, connectionresult.c))
        {
            a.h();
        }
        if (m || a.g) goto _L2; else goto _L1
_L1:
        bsm1 = a.c;
        if (Looper.myLooper() == bsm1.h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag, "onConnectionFailure must only be called on the Handler thread");
        bsm1.h.removeMessages(1);
        obj = bsm1.i;
        obj;
        JVM INSTR monitorenter ;
        obj1 = new ArrayList(bsm1.d);
        i1 = bsm1.f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L7:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        bqx1 = (bqx)((Iterator) (obj1)).next();
        if (bsm1.e && bsm1.f.get() == i1) goto _L5; else goto _L2
_L2:
        m = false;
        a.c.a();
        return;
_L5:
        if (!bsm1.d.contains(bqx1)) goto _L7; else goto _L6
_L6:
        bqx1.a(connectionresult);
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

    final void b(ConnectionResult connectionresult, bql bql1, int i1)
    {
        boolean flag = true;
        if (i1 == 2) goto _L2; else goto _L1
_L1:
        bql1.a();
        if (i1 != 1) goto _L4; else goto _L3
_L3:
        if (connectionresult.a())
        {
            i1 = 1;
        } else
        if (bqi.a(null, connectionresult.c, null) != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        i1 = ((flag) ? 1 : 0);
        if (j == null) goto _L7; else goto _L6
_L6:
        if (0x7fffffff >= k) goto _L5; else goto _L8
_L8:
        i1 = ((flag) ? 1 : 0);
_L7:
        if (i1 != 0)
        {
            j = connectionresult;
            k = 0x7fffffff;
        }
_L2:
        a.m.put(bql1.b(), connectionresult);
        return;
_L5:
        i1 = 0;
        if (true) goto _L7; else goto _L9
_L9:
    }

    final boolean b(int i1)
    {
        if (l != i1)
        {
            Log.i("GoogleApiClientConnecting", a.i());
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder("GoogleApiClient connecting is in step ")).append(c(l)).append(" but received callback for step ").append(c(i1)).toString(), new Exception());
            b(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    public final void c()
    {
        m = false;
    }

    public final String d()
    {
        return "CONNECTING";
    }

    final boolean e()
    {
        n = n - 1;
        if (n > 0)
        {
            return false;
        }
        if (n < 0)
        {
            Log.i("GoogleApiClientConnecting", a.i());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new ConnectionResult(8, null));
            return false;
        }
        if (j != null)
        {
            b(j);
            return false;
        } else
        {
            return true;
        }
    }

    final void f()
    {
        if (n == 0)
        {
            if (e)
            {
                if (f)
                {
                    ArrayList arraylist = new ArrayList();
                    l = 1;
                    n = a.l.size();
                    Iterator iterator = a.l.keySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        bqs bqs1 = (bqs)iterator.next();
                        if (a.m.containsKey(bqs1))
                        {
                            if (e())
                            {
                                g();
                            }
                        } else
                        {
                            arraylist.add(a.l.get(bqs1));
                        }
                    } while (true);
                    if (!arraylist.isEmpty())
                    {
                        u.add(cmr.a().submit(new cmh(this, arraylist)));
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
        l = 2;
        a.n = j();
        u.add(cmr.a().submit(new cmc(this, (byte)0)));
    }

    final void h()
    {
        ArrayList arraylist = new ArrayList();
        l = 3;
        n = a.l.size();
        Iterator iterator = a.l.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bqs bqs1 = (bqs)iterator.next();
            if (a.m.containsKey(bqs1))
            {
                if (e())
                {
                    k();
                }
            } else
            {
                arraylist.add(a.l.get(bqs1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            u.add(cmr.a().submit(new cmf(this, arraylist)));
        }
    }

    final void i()
    {
        e = false;
        a.n = Collections.emptySet();
        Iterator iterator = p.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bqs bqs1 = (bqs)iterator.next();
            if (!a.m.containsKey(bqs1))
            {
                a.m.put(bqs1, new ConnectionResult(17, null));
            }
        } while (true);
    }

    final Set j()
    {
        HashSet hashset = new HashSet(r.a);
        Map map = r.c;
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bql bql1 = (bql)iterator.next();
            if (!a.m.containsKey(bql1.b()))
            {
                hashset.addAll(((brz)map.get(bql1)).a);
            }
        } while (true);
        return hashset;
    }
}
