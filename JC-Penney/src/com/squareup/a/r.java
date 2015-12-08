// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

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

// Referenced classes of package com.squareup.a:
//            u, bm, s, v, 
//            d, ak, a, ax, 
//            av, ai, ag, af, 
//            k, w, be

class r
{

    final u a = new u();
    final Context b;
    final ExecutorService c;
    final w d;
    final Map e = new LinkedHashMap();
    final Map f = new WeakHashMap();
    final Map g = new WeakHashMap();
    final Set h = new HashSet();
    final Handler i;
    final Handler j;
    final k k;
    final be l;
    final List m = new ArrayList(4);
    final v n = new v(this);
    final boolean o;
    boolean p;

    r(Context context, ExecutorService executorservice, Handler handler, w w, k k1, be be)
    {
        a.start();
        bm.a(a.getLooper());
        b = context;
        c = executorservice;
        i = new s(a.getLooper(), this);
        d = w;
        j = handler;
        k = k1;
        l = be;
        p = bm.d(b);
        o = bm.b(context, "android.permission.ACCESS_NETWORK_STATE");
        n.a();
    }

    private void a(List list)
    {
        while (list == null || list.isEmpty() || !((d)list.get(0)).j().l) 
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        d d1;
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(bm.a(d1)))
        {
            d1 = (d)list.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
        }

        bm.a("Dispatcher", "delivered", stringbuilder.toString());
    }

    private void b()
    {
        if (!f.isEmpty())
        {
            a a1;
            for (Iterator iterator = f.values().iterator(); iterator.hasNext(); a(a1, false))
            {
                a1 = (a)iterator.next();
                iterator.remove();
                if (a1.j().l)
                {
                    bm.a("Dispatcher", "replaying", a1.c().a());
                }
            }

        }
    }

    private void e(a a1)
    {
        Object obj = a1.d();
        if (obj != null)
        {
            a1.k = true;
            f.put(obj, a1);
        }
    }

    private void f(d d1)
    {
        a a1 = d1.i();
        if (a1 != null)
        {
            e(a1);
        }
        d1 = d1.k();
        if (d1 != null)
        {
            int j1 = d1.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                e((a)d1.get(i1));
            }

        }
    }

    private void g(d d1)
    {
        if (!d1.c())
        {
            m.add(d1);
            if (!i.hasMessages(7))
            {
                i.sendEmptyMessageDelayed(7, 200L);
                return;
            }
        }
    }

    void a()
    {
        ArrayList arraylist = new ArrayList(m);
        m.clear();
        j.sendMessage(j.obtainMessage(8, arraylist));
        a(((List) (arraylist)));
    }

    void a(NetworkInfo networkinfo)
    {
        i.sendMessage(i.obtainMessage(9, networkinfo));
    }

    void a(a a1)
    {
        i.sendMessage(i.obtainMessage(1, a1));
    }

    void a(a a1, boolean flag)
    {
        if (!h.contains(a1.l())) goto _L2; else goto _L1
_L1:
        g.put(a1.d(), a1);
        if (a1.j().l)
        {
            bm.a("Dispatcher", "paused", a1.b.a(), (new StringBuilder()).append("because tag '").append(a1.l()).append("' is paused").toString());
        }
_L4:
        return;
_L2:
        d d1 = (d)e.get(a1.e());
        if (d1 != null)
        {
            d1.a(a1);
            return;
        }
        if (!c.isShutdown())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a1.j().l)
        {
            bm.a("Dispatcher", "ignored", a1.b.a(), "because shut down");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        d d2 = com.squareup.a.d.a(a1.j(), this, k, l, a1);
        d2.n = c.submit(d2);
        e.put(a1.e(), d2);
        if (flag)
        {
            f.remove(a1.d());
        }
        if (a1.j().l)
        {
            bm.a("Dispatcher", "enqueued", a1.b.a());
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    void a(d d1)
    {
        i.sendMessage(i.obtainMessage(4, d1));
    }

    void a(d d1, boolean flag)
    {
        if (d1.j().l)
        {
            String s2 = bm.a(d1);
            StringBuilder stringbuilder = (new StringBuilder()).append("for error");
            String s1;
            if (flag)
            {
                s1 = " (will replay)";
            } else
            {
                s1 = "";
            }
            bm.a("Dispatcher", "batched", s2, stringbuilder.append(s1).toString());
        }
        e.remove(d1.f());
        g(d1);
    }

    void a(Object obj)
    {
        if (h.add(obj))
        {
            Iterator iterator = e.values().iterator();
            while (iterator.hasNext()) 
            {
                d d1 = (d)iterator.next();
                boolean flag = d1.j().l;
                a a1 = d1.i();
                List list = d1.k();
                int i1;
                if (list != null && !list.isEmpty())
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (a1 != null || i1 != 0)
                {
                    if (a1 != null && a1.l().equals(obj))
                    {
                        d1.b(a1);
                        g.put(a1.d(), a1);
                        if (flag)
                        {
                            bm.a("Dispatcher", "paused", a1.b.a(), (new StringBuilder()).append("because tag '").append(obj).append("' was paused").toString());
                        }
                    }
                    if (i1 != 0)
                    {
                        i1 = list.size() - 1;
                        while (i1 >= 0) 
                        {
                            a a2 = (a)list.get(i1);
                            if (a2.l().equals(obj))
                            {
                                d1.b(a2);
                                g.put(a2.d(), a2);
                                if (flag)
                                {
                                    bm.a("Dispatcher", "paused", a2.b.a(), (new StringBuilder()).append("because tag '").append(obj).append("' was paused").toString());
                                }
                            }
                            i1--;
                        }
                    }
                    if (d1.b())
                    {
                        iterator.remove();
                        if (flag)
                        {
                            bm.a("Dispatcher", "canceled", bm.a(d1), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void a(boolean flag)
    {
        Handler handler = i;
        Handler handler1 = i;
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        handler.sendMessage(handler1.obtainMessage(10, i1, 0));
    }

    void b(NetworkInfo networkinfo)
    {
        if (c instanceof av)
        {
            ((av)c).a(networkinfo);
        }
        if (networkinfo != null && networkinfo.isConnected())
        {
            b();
        }
    }

    void b(a a1)
    {
        i.sendMessage(i.obtainMessage(2, a1));
    }

    void b(d d1)
    {
        i.sendMessageDelayed(i.obtainMessage(5, d1), 500L);
    }

    void b(Object obj)
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
                if (a1.l().equals(obj))
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

    void b(boolean flag)
    {
        p = flag;
    }

    void c(a a1)
    {
        a(a1, true);
    }

    void c(d d1)
    {
        i.sendMessage(i.obtainMessage(6, d1));
    }

    void d(a a1)
    {
        String s1 = a1.e();
        d d1 = (d)e.get(s1);
        if (d1 != null)
        {
            d1.b(a1);
            if (d1.b())
            {
                e.remove(s1);
                if (a1.j().l)
                {
                    bm.a("Dispatcher", "canceled", a1.c().a());
                }
            }
        }
        if (h.contains(a1.l()))
        {
            g.remove(a1.d());
            if (a1.j().l)
            {
                bm.a("Dispatcher", "canceled", a1.c().a(), "because paused request got canceled");
            }
        }
        a1 = (a)f.remove(a1.d());
        if (a1 != null && a1.j().l)
        {
            bm.a("Dispatcher", "canceled", a1.c().a(), "from replaying");
        }
    }

    void d(d d1)
    {
        boolean flag1 = true;
        if (!d1.c()) goto _L2; else goto _L1
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
        boolean flag2;
        boolean flag3;
        if (o)
        {
            networkinfo = ((ConnectivityManager)bm.a(b, "connectivity")).getActiveNetworkInfo();
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
        flag2 = d1.a(p, networkinfo);
        flag3 = d1.d();
        if (flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!o || !flag3)
        {
            flag1 = false;
        }
        a(d1, flag1);
        if (flag1)
        {
            f(d1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!o || flag)
        {
            if (d1.j().l)
            {
                bm.a("Dispatcher", "retrying", bm.a(d1));
            }
            if (d1.l() instanceof ai)
            {
                d1.i = d1.i | ag.a.d;
            }
            d1.n = c.submit(d1);
            return;
        }
        a(d1, flag3);
        if (flag3)
        {
            f(d1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void e(d d1)
    {
        if (af.b(d1.g()))
        {
            k.a(d1.f(), d1.e());
        }
        e.remove(d1.f());
        g(d1);
        if (d1.j().l)
        {
            bm.a("Dispatcher", "batched", bm.a(d1), "for completion");
        }
    }
}
