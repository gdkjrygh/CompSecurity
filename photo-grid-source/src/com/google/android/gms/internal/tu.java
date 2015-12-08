// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.as;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.x;
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

// Referenced classes of package com.google.android.gms.internal:
//            uu, xi, uj, uv, 
//            ug, ua, ue, tv, 
//            ub, uf, uc, ut, 
//            to

public final class tu
    implements uu
{

    private final uj a;
    private final Lock b;
    private final Context c;
    private final b d;
    private ConnectionResult e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private final Bundle j = new Bundle();
    private final Set k = new HashSet();
    private xi l;
    private int m;
    private boolean n;
    private boolean o;
    private as p;
    private boolean q;
    private boolean r;
    private final w s;
    private final Map t;
    private final com.google.android.gms.common.api.b u;
    private ArrayList v;

    public tu(uj uj1, w w1, Map map, b b1, com.google.android.gms.common.api.b b2, Lock lock, Context context)
    {
        g = 0;
        h = false;
        v = new ArrayList();
        a = uj1;
        s = w1;
        t = map;
        d = b1;
        u = b2;
        b = lock;
        c = context;
    }

    static Context a(tu tu1)
    {
        return tu1.c;
    }

    static void a(tu tu1, ConnectionResult connectionresult)
    {
        tu1.b(connectionresult);
    }

    static void a(tu tu1, ConnectionResult connectionresult, a a1, int i1)
    {
        tu1.b(connectionresult, a1, i1);
    }

    static void a(tu tu1, ResolveAccountResponse resolveaccountresponse)
    {
        ConnectionResult connectionresult;
label0:
        {
            if (tu1.b(0))
            {
                connectionresult = resolveaccountresponse.b();
                if (!connectionresult.b())
                {
                    break label0;
                }
                tu1.p = resolveaccountresponse.a();
                tu1.o = true;
                tu1.q = resolveaccountresponse.c();
                tu1.r = resolveaccountresponse.d();
                tu1.f();
            }
            return;
        }
        if (tu1.a(connectionresult))
        {
            tu1.j();
            tu1.f();
            return;
        } else
        {
            tu1.b(connectionresult);
            return;
        }
    }

    private void a(boolean flag)
    {
        if (l != null)
        {
            if (l.isConnected() && flag)
            {
                l.f_();
            }
            l.disconnect();
            p = null;
        }
    }

    private boolean a(ConnectionResult connectionresult)
    {
        return m == 2 || m == 1 && !connectionresult.a();
    }

    static boolean a(tu tu1, int i1)
    {
        return tu1.b(i1);
    }

    static Lock b(tu tu1)
    {
        return tu1.b;
    }

    private void b(ConnectionResult connectionresult)
    {
        k();
        boolean flag;
        if (!connectionresult.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        a.e.clear();
        a.a(connectionresult);
        if (!com.google.android.gms.common.b.a(c, connectionresult.c()))
        {
            a.j();
        }
        if (!h && !a.h())
        {
            a.a.a(connectionresult);
        }
        h = false;
        a.a.a();
    }

    private void b(ConnectionResult connectionresult, a a1, int i1)
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
        if (com.google.android.gms.common.b.b(connectionresult.c()) != null)
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
            Log.i("GoogleApiClientConnecting", a.k());
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder("GoogleApiClient connecting is in step ")).append(c(g)).append(" but received callback for step ").append(c(i1)).toString(), new Exception());
            b(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    static boolean b(tu tu1, ConnectionResult connectionresult)
    {
        return tu1.a(connectionresult);
    }

    static uj c(tu tu1)
    {
        return tu1.a;
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

    static void c(tu tu1, ConnectionResult connectionresult)
    {
label0:
        {
            if (tu1.b(2))
            {
                if (!connectionresult.b())
                {
                    break label0;
                }
                tu1.h();
            }
            return;
        }
        if (tu1.a(connectionresult))
        {
            tu1.j();
            tu1.h();
            return;
        } else
        {
            tu1.b(connectionresult);
            return;
        }
    }

    static boolean d(tu tu1)
    {
        return tu1.n;
    }

    static xi e(tu tu1)
    {
        return tu1.l;
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
            Log.i("GoogleApiClientConnecting", a.k());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
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

    static as f(tu tu1)
    {
        return tu1.p;
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
                        d d1 = (d)iterator.next();
                        if (a.e.containsKey(d1))
                        {
                            if (e())
                            {
                                g();
                            }
                        } else
                        {
                            arraylist.add(a.d.get(d1));
                        }
                    } while (true);
                    if (!arraylist.isEmpty())
                    {
                        v.add(com.google.android.gms.internal.uv.a().submit(new ug(this, arraylist)));
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

    static Set g(tu tu1)
    {
        return tu1.l();
    }

    private void g()
    {
        g = 2;
        a.f = l();
        v.add(com.google.android.gms.internal.uv.a().submit(new ua(this, (byte)0)));
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
            d d1 = (d)iterator.next();
            if (a.e.containsKey(d1))
            {
                if (e())
                {
                    i();
                }
            } else
            {
                arraylist.add(a.d.get(d1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            v.add(com.google.android.gms.internal.uv.a().submit(new ue(this, arraylist)));
        }
    }

    static void h(tu tu1)
    {
        tu1.j();
    }

    private void i()
    {
        a.f();
        com.google.android.gms.internal.uv.a().execute(new tv(this));
        if (l != null)
        {
            if (q)
            {
                l.a(p, r);
            }
            a(false);
        }
        d d1;
        for (Iterator iterator = a.e.keySet().iterator(); iterator.hasNext(); ((c)a.d.get(d1)).disconnect())
        {
            d1 = (d)iterator.next();
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

    static void i(tu tu1)
    {
        tu1.h();
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
            d d1 = (d)iterator.next();
            if (!a.e.containsKey(d1))
            {
                a.e.put(d1, new ConnectionResult(17, null));
            }
        } while (true);
    }

    static boolean j(tu tu1)
    {
        return tu1.e();
    }

    private void k()
    {
        for (Iterator iterator = v.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true)) { }
        v.clear();
    }

    static void k(tu tu1)
    {
        tu1.f();
    }

    private Set l()
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
            a a1 = (a)iterator.next();
            if (!a.e.containsKey(a1.c()))
            {
                hashset.addAll(((x)map.get(a1)).a);
            }
        } while (true);
        return hashset;
    }

    static void l(tu tu1)
    {
        tu1.g();
    }

    public final to a(to to)
    {
        a.b.add(to);
        return to;
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
        a a1;
        c c1;
        int i1;
        for (Iterator iterator = t.keySet().iterator(); iterator.hasNext(); hashmap.put(c1, new ub(this, a1, i1)))
        {
            a1 = (a)iterator.next();
            c1 = (c)a.d.get(a1.c());
            i1 = ((Integer)t.get(a1)).intValue();
            a1.a();
            if (!c1.zzlN())
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
            uf uf1 = new uf(this, (byte)0);
            l = (xi)u.a(c, a.a(), s, s.h(), uf1, uf1);
        }
        i = a.d.size();
        v.add(com.google.android.gms.internal.uv.a().submit(new uc(this, hashmap)));
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

    public final void a(ConnectionResult connectionresult, a a1, int i1)
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

    public final void b()
    {
        for (Iterator iterator = a.b.iterator(); iterator.hasNext(); iterator.remove())
        {
            ((ut)iterator.next()).f();
        }

        a.d();
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
