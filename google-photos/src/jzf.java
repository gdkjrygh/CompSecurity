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

public final class jzf
    implements kae
{

    final jzu a;
    final Lock b;
    final Context c;
    lpe d;
    boolean e;
    boolean f;
    kay g;
    boolean h;
    boolean i;
    private final jxz j;
    private ConnectionResult k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private final Bundle p = new Bundle();
    private final Set q = new HashSet();
    private int r;
    private final kax s;
    private final Map t;
    private final jyi u;
    private ArrayList v;

    public jzf(jzu jzu1, kax kax1, Map map, jxz jxz1, jyi jyi1, Lock lock, Context context)
    {
        m = 0;
        n = false;
        v = new ArrayList();
        a = jzu1;
        s = kax1;
        t = map;
        j = jxz1;
        u = jyi1;
        b = lock;
        c = context;
    }

    private void a(boolean flag)
    {
        if (d != null)
        {
            if (d.j() && flag)
            {
                d.f();
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
        ((jzu) (obj)).a.lock();
        ((jzu) (obj)).h();
        obj.s = new jzd(((jzu) (obj)));
        ((jzu) (obj)).s.a();
        ((jzu) (obj)).b.signalAll();
        ((jzu) (obj)).a.unlock();
        kaf.a().execute(new jzg(this));
        if (d != null)
        {
            if (h)
            {
                d.a(g, i);
            }
            a(false);
        }
        jym jym1;
        for (obj = a.n.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((jyl)a.m.get(jym1)).a())
        {
            jym1 = (jym)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_186;
        Exception exception;
        exception;
        ((jzu) (obj)).a.unlock();
        throw exception;
        Object obj2;
        kby kby1;
        boolean flag;
        if (n)
        {
            n = false;
            b();
            return;
        }
        Object obj1;
        Object obj3;
        jyq jyq1;
        int i1;
        if (p.isEmpty())
        {
            obj1 = null;
        } else
        {
            obj1 = p;
        }
        kby1 = a.c;
        if (Looper.myLooper() == kby1.h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "onConnectionSuccess must only be called on the Handler thread");
        obj2 = kby1.i;
        obj2;
        JVM INSTR monitorenter ;
        if (!kby1.g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag);
        kby1.h.removeMessages(1);
        kby1.g = true;
        if (kby1.c.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b.a(flag);
        obj3 = new ArrayList(kby1.b);
        i1 = kby1.f.get();
        obj3 = ((ArrayList) (obj3)).iterator();
        do
        {
            if (!((Iterator) (obj3)).hasNext())
            {
                break;
            }
            jyq1 = (jyq)((Iterator) (obj3)).next();
            if (!kby1.e || !kby1.a.j() || kby1.f.get() != i1)
            {
                break;
            }
            if (!kby1.c.contains(jyq1))
            {
                jyq1.a(((Bundle) (obj1)));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_436;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        kby1.c.clear();
        kby1.g = false;
        obj2;
        JVM INSTR monitorexit ;
    }

    private void l()
    {
        for (Iterator iterator = v.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true)) { }
        v.clear();
    }

    public final jzb a(jzb jzb)
    {
        a.f.add(jzb);
        return jzb;
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
        jyh jyh1;
        jyl jyl1;
        int i1;
        for (Iterator iterator = t.keySet().iterator(); iterator.hasNext(); hashmap.put(jyl1, new jzm(this, jyh1, i1)))
        {
            jyh1 = (jyh)iterator.next();
            jyl1 = (jyl)a.m.get(jyh1.b());
            i1 = ((Integer)t.get(jyh1)).intValue();
            jyh1.a();
            if (!jyl1.k())
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
                q.add(jyh1.b());
            }
        }

        if (e)
        {
            s.h = Integer.valueOf(System.identityHashCode(a));
            jzq jzq1 = new jzq(this);
            d = (lpe)u.a(c, a.e, s, s.g, jzq1, jzq1);
        }
        o = a.m.size();
        v.add(kaf.a().submit(new jzn(this, hashmap)));
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

    public final void a(ConnectionResult connectionresult, jyh jyh1, int i1)
    {
        if (b(3))
        {
            b(connectionresult, jyh1, i1);
            if (e())
            {
                k();
                return;
            }
        }
    }

    boolean a(ConnectionResult connectionresult)
    {
        return r == 2 || r == 1 && !connectionresult.a();
    }

    public final jzb b(jzb jzb)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void b()
    {
        Iterator iterator = a.f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kad kad1 = (kad)iterator.next();
            if (kad1.f() != 1)
            {
                kad1.b();
                iterator.remove();
            }
        } while (true);
        a.g();
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

    void b(ConnectionResult connectionresult)
    {
        Object obj;
        kby kby1;
        jys jys1;
        boolean flag1 = false;
        n = false;
        l();
        Object obj1;
        int i1;
        boolean flag;
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
        if (a.g && jxz.a(c, connectionresult.c)) goto _L2; else goto _L1
_L1:
        a.h();
        kby1 = a.c;
        flag = flag1;
        if (Looper.myLooper() == kby1.h.getLooper())
        {
            flag = true;
        }
        b.a(flag, "onConnectionFailure must only be called on the Handler thread");
        kby1.h.removeMessages(1);
        obj = kby1.i;
        obj;
        JVM INSTR monitorenter ;
        obj1 = new ArrayList(kby1.d);
        i1 = kby1.f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L7:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        jys1 = (jys)((Iterator) (obj1)).next();
        if (kby1.e && kby1.f.get() == i1) goto _L5; else goto _L2
_L2:
        a.c.a();
        return;
_L5:
        if (!kby1.d.contains(jys1)) goto _L7; else goto _L6
_L6:
        jys1.a(connectionresult);
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

    void b(ConnectionResult connectionresult, jyh jyh1, int i1)
    {
        boolean flag = true;
        if (i1 == 2) goto _L2; else goto _L1
_L1:
        jyh1.a();
        if (i1 != 1) goto _L4; else goto _L3
_L3:
        if (connectionresult.a())
        {
            i1 = 1;
        } else
        if (jxz.a(connectionresult.c) != null)
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
        a.n.put(jyh1.b(), connectionresult);
        return;
_L5:
        i1 = 0;
        if (true) goto _L7; else goto _L9
_L9:
    }

    boolean b(int i1)
    {
        if (m != i1)
        {
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder("GoogleApiClient connecting is in step ")).append(c(m)).append(" but received callback for step ").append(c(i1)).toString());
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

    boolean e()
    {
        o = o - 1;
        if (o > 0)
        {
            return false;
        }
        if (o < 0)
        {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
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

    void f()
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
                        jym jym1 = (jym)iterator.next();
                        if (a.n.containsKey(jym1))
                        {
                            if (e())
                            {
                                g();
                            }
                        } else
                        {
                            arraylist.add(a.m.get(jym1));
                        }
                    } while (true);
                    if (!arraylist.isEmpty())
                    {
                        v.add(kaf.a().submit(new jzr(this, arraylist)));
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

    void g()
    {
        m = 2;
        a.o = j();
        v.add(kaf.a().submit(new jzl(this)));
    }

    void h()
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
            jym jym1 = (jym)iterator.next();
            if (a.n.containsKey(jym1))
            {
                if (e())
                {
                    k();
                }
            } else
            {
                arraylist.add(a.m.get(jym1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            v.add(kaf.a().submit(new jzp(this, arraylist)));
        }
    }

    void i()
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
            jym jym1 = (jym)iterator.next();
            if (!a.n.containsKey(jym1))
            {
                a.n.put(jym1, new ConnectionResult(17, null));
            }
        } while (true);
    }

    Set j()
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
            jyh jyh1 = (jyh)iterator.next();
            if (!a.n.containsKey(jyh1.b()))
            {
                map.get(jyh1);
                hashset.addAll(null);
            }
        } while (true);
        return hashset;
    }
}
