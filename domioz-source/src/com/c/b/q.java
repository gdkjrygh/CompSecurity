// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.c.b:
//            t, bj, r, u, 
//            a, d, aj, au, 
//            aw, az, ah, af, 
//            ae, k, v, bc

final class q
{

    final t a = new t();
    final Context b;
    final ExecutorService c;
    final v d;
    final Map e = new LinkedHashMap();
    final Map f = new WeakHashMap();
    final Map g = new WeakHashMap();
    final Set h = new HashSet();
    final Handler i;
    final Handler j;
    final k k;
    final bc l;
    final List m = new ArrayList(4);
    final u n = new u(this);
    final boolean o;
    boolean p;

    q(Context context, ExecutorService executorservice, Handler handler, v v, k k1, bc bc)
    {
        a.start();
        bj.a(a.getLooper());
        b = context;
        c = executorservice;
        i = new r(a.getLooper(), this);
        d = v;
        j = handler;
        k = k1;
        l = bc;
        p = bj.d(b);
        o = bj.b(context, "android.permission.ACCESS_NETWORK_STATE");
        n.a();
    }

    private void a(a a1)
    {
        Object obj = a1.c();
        if (obj != null)
        {
            a1.k = true;
            f.put(obj, a1);
        }
    }

    private static void a(List list)
    {
        while (list.isEmpty() || !((d)list.get(0)).b.l) 
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        d d1;
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(bj.a(d1)))
        {
            d1 = (d)list.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
        }

        bj.a("Dispatcher", "delivered", stringbuilder.toString());
    }

    private void e(d d1)
    {
        a a1 = d1.k;
        if (a1 != null)
        {
            a(a1);
        }
        d1 = d1.l;
        if (d1 != null)
        {
            int j1 = d1.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                a((a)d1.get(i1));
            }

        }
    }

    private void f(d d1)
    {
        if (!d1.b())
        {
            m.add(d1);
            if (!i.hasMessages(7))
            {
                i.sendEmptyMessageDelayed(7, 200L);
                return;
            }
        }
    }

    final void a()
    {
        ArrayList arraylist = new ArrayList(m);
        m.clear();
        j.sendMessage(j.obtainMessage(8, arraylist));
        a(((List) (arraylist)));
    }

    final void a(NetworkInfo networkinfo)
    {
        if (c instanceof au)
        {
            ((au)c).a(networkinfo);
        }
        if (networkinfo != null && networkinfo.isConnected() && !f.isEmpty())
        {
            a a1;
            for (networkinfo = f.values().iterator(); networkinfo.hasNext(); a(a1, false))
            {
                a1 = (a)networkinfo.next();
                networkinfo.remove();
                if (a1.a.l)
                {
                    bj.a("Dispatcher", "replaying", a1.b.a());
                }
            }

        }
    }

    final void a(a a1, boolean flag)
    {
        if (!h.contains(a1.j)) goto _L2; else goto _L1
_L1:
        g.put(a1.c(), a1);
        if (a1.a.l)
        {
            bj.a("Dispatcher", "paused", a1.b.a(), (new StringBuilder("because tag '")).append(a1.j).append("' is paused").toString());
        }
_L4:
        return;
_L2:
        d d1 = (d)e.get(a1.i);
        if (d1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = d1.b.l;
        aw aw1 = a1.b;
        if (d1.k == null)
        {
            d1.k = a1;
            if (flag)
            {
                if (d1.l == null || d1.l.isEmpty())
                {
                    bj.a("Hunter", "joined", aw1.a(), "to empty hunter");
                    return;
                } else
                {
                    bj.a("Hunter", "joined", aw1.a(), bj.a(d1, "to "));
                    return;
                }
            }
        } else
        {
            if (d1.l == null)
            {
                d1.l = new ArrayList(3);
            }
            d1.l.add(a1);
            if (flag)
            {
                bj.a("Hunter", "joined", aw1.a(), bj.a(d1, "to "));
            }
            int i1 = a1.b.r;
            if (i1 - 1 > d1.s - 1)
            {
                d1.s = i1;
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!c.isShutdown())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a1.a.l)
        {
            bj.a("Dispatcher", "ignored", a1.b.a(), "because shut down");
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        d d2 = com.c.b.d.a(a1.a, this, k, l, a1);
        d2.n = c.submit(d2);
        e.put(a1.i, d2);
        if (flag)
        {
            f.remove(a1.c());
        }
        if (a1.a.l)
        {
            bj.a("Dispatcher", "enqueued", a1.b.a());
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    final void a(d d1)
    {
        i.sendMessageDelayed(i.obtainMessage(5, d1), 500L);
    }

    final void a(d d1, boolean flag)
    {
        if (d1.b.l)
        {
            String s1 = bj.a(d1);
            StringBuilder stringbuilder = new StringBuilder("for error");
            String s;
            if (flag)
            {
                s = " (will replay)";
            } else
            {
                s = "";
            }
            bj.a("Dispatcher", "batched", s1, stringbuilder.append(s).toString());
        }
        e.remove(d1.f);
        f(d1);
    }

    final void a(Object obj)
    {
        if (h.remove(obj))
        {
            ArrayList arraylist = null;
            Iterator iterator = g.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                a a1 = (a)iterator.next();
                if (a1.j.equals(obj))
                {
                    ArrayList arraylist1 = arraylist;
                    if (arraylist == null)
                    {
                        arraylist1 = new ArrayList();
                    }
                    arraylist1.add(a1);
                    iterator.remove();
                    arraylist = arraylist1;
                }
            } while (true);
            if (arraylist != null)
            {
                j.sendMessage(j.obtainMessage(13, arraylist));
                return;
            }
        }
    }

    final void b(d d1)
    {
        i.sendMessage(i.obtainMessage(6, d1));
    }

    final void c(d d1)
    {
        boolean flag3 = true;
        if (!d1.b()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (c.isShutdown())
        {
            a(d1, false);
            return;
        }
        NetworkInfo networkinfo;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag4;
        if (o)
        {
            networkinfo = ((ConnectivityManager)bj.a(b, "connectivity")).getActiveNetworkInfo();
        } else
        {
            networkinfo = null;
        }
        if (networkinfo != null && networkinfo.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d1.r > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            flag2 = false;
        } else
        {
            d1.r = d1.r - 1;
            flag2 = d1.j.a(networkinfo);
        }
        flag4 = d1.j.b();
        if (flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (o && flag4)
        {
            flag2 = flag3;
        } else
        {
            flag2 = false;
        }
        a(d1, flag2);
        if (flag2)
        {
            e(d1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!o || flag)
        {
            if (d1.b.l)
            {
                bj.a("Dispatcher", "retrying", bj.a(d1));
            }
            if (d1.p instanceof ah)
            {
                d1.i = d1.i | af.a.d;
            }
            d1.n = c.submit(d1);
            return;
        }
        a(d1, flag4);
        if (flag4)
        {
            e(d1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    final void d(d d1)
    {
        if (ae.b(d1.h))
        {
            k.a(d1.f, d1.m);
        }
        e.remove(d1.f);
        f(d1);
        if (d1.b.l)
        {
            bj.a("Dispatcher", "batched", bj.a(d1), "for completion");
        }
    }
}
