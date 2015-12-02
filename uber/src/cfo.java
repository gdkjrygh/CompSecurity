// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

final class cfo
{

    final cfq a = new cfq();
    final Context b;
    final ExecutorService c;
    final cfs d;
    final Map e = new LinkedHashMap();
    final Map f = new WeakHashMap();
    final Map g = new WeakHashMap();
    final Set h = new HashSet();
    final Handler i;
    final Handler j;
    final cfi k;
    final cgx l;
    final List m = new ArrayList(4);
    final cfr n = new cfr(this);
    final boolean o;
    boolean p;

    cfo(Context context, ExecutorService executorservice, Handler handler, cfs cfs, cfi cfi1, cgx cgx)
    {
        a.start();
        b = context;
        c = executorservice;
        i = new cfp(a.getLooper(), this);
        d = cfs;
        j = handler;
        k = cfi1;
        l = cgx;
        p = chf.d(b);
        o = chf.b(context, "android.permission.ACCESS_NETWORK_STATE");
        n.a();
    }

    private void a(cfe cfe1, boolean flag)
    {
        if (!h.contains(cfe1.l())) goto _L2; else goto _L1
_L1:
        g.put(cfe1.d(), cfe1);
        if (cfe1.j().l)
        {
            chf.a("Dispatcher", "paused", cfe1.b.a(), (new StringBuilder("because tag '")).append(cfe1.l()).append("' is paused").toString());
        }
_L4:
        return;
_L2:
        cfh cfh1 = (cfh)e.get(cfe1.e());
        if (cfh1 != null)
        {
            cfh1.a(cfe1);
            return;
        }
        if (!c.isShutdown())
        {
            break; /* Loop/switch isn't completed */
        }
        if (cfe1.j().l)
        {
            chf.a("Dispatcher", "ignored", cfe1.b.a(), "because shut down");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        cfh cfh2 = cfh.a(cfe1.j(), this, k, l, cfe1);
        cfh2.n = c.submit(cfh2);
        e.put(cfe1.e(), cfh2);
        if (flag)
        {
            f.remove(cfe1.d());
        }
        if (cfe1.j().l)
        {
            chf.a("Dispatcher", "enqueued", cfe1.b.a());
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static void a(List list)
    {
        while (list.isEmpty() || !((cfh)list.get(0)).j().l) 
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        cfh cfh1;
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(chf.a(cfh1)))
        {
            cfh1 = (cfh)list.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
        }

        chf.a("Dispatcher", "delivered", stringbuilder.toString());
    }

    private void b()
    {
        if (!f.isEmpty())
        {
            cfe cfe1;
            for (Iterator iterator = f.values().iterator(); iterator.hasNext(); a(cfe1, false))
            {
                cfe1 = (cfe)iterator.next();
                iterator.remove();
                if (cfe1.j().l)
                {
                    chf.a("Dispatcher", "replaying", cfe1.c().a());
                }
            }

        }
    }

    private void e(cfe cfe1)
    {
        Object obj = cfe1.d();
        if (obj != null)
        {
            cfe1.k = true;
            f.put(obj, cfe1);
        }
    }

    private void f(cfh cfh1)
    {
        cfe cfe1 = cfh1.i();
        if (cfe1 != null)
        {
            e(cfe1);
        }
        cfh1 = cfh1.k();
        if (cfh1 != null)
        {
            int j1 = cfh1.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                e((cfe)cfh1.get(i1));
            }

        }
    }

    private void g(cfh cfh1)
    {
        if (!cfh1.c())
        {
            m.add(cfh1);
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
        i.sendMessage(i.obtainMessage(9, networkinfo));
    }

    final void a(cfe cfe1)
    {
        i.sendMessage(i.obtainMessage(1, cfe1));
    }

    final void a(cfh cfh1)
    {
        i.sendMessage(i.obtainMessage(4, cfh1));
    }

    final void a(cfh cfh1, boolean flag)
    {
        if (cfh1.j().l)
        {
            String s1 = chf.a(cfh1);
            StringBuilder stringbuilder = new StringBuilder("for error");
            String s;
            if (flag)
            {
                s = " (will replay)";
            } else
            {
                s = "";
            }
            chf.a("Dispatcher", "batched", s1, stringbuilder.append(s).toString());
        }
        e.remove(cfh1.f());
        g(cfh1);
    }

    final void a(Object obj)
    {
        i.sendMessage(i.obtainMessage(11, obj));
    }

    final void a(boolean flag)
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

    final void b(NetworkInfo networkinfo)
    {
        if (c instanceof cgp)
        {
            ((cgp)c).a(networkinfo);
        }
        if (networkinfo != null && networkinfo.isConnected())
        {
            b();
        }
    }

    final void b(cfe cfe1)
    {
        i.sendMessage(i.obtainMessage(2, cfe1));
    }

    final void b(cfh cfh1)
    {
        i.sendMessageDelayed(i.obtainMessage(5, cfh1), 500L);
    }

    final void b(Object obj)
    {
        i.sendMessage(i.obtainMessage(12, obj));
    }

    final void b(boolean flag)
    {
        p = flag;
    }

    final void c(cfe cfe1)
    {
        a(cfe1, true);
    }

    final void c(cfh cfh1)
    {
        i.sendMessage(i.obtainMessage(6, cfh1));
    }

    final void c(Object obj)
    {
        if (h.add(obj))
        {
            Iterator iterator = e.values().iterator();
            while (iterator.hasNext()) 
            {
                cfh cfh1 = (cfh)iterator.next();
                boolean flag = cfh1.j().l;
                cfe cfe1 = cfh1.i();
                List list = cfh1.k();
                int i1;
                if (list != null && !list.isEmpty())
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (cfe1 != null || i1 != 0)
                {
                    if (cfe1 != null && cfe1.l().equals(obj))
                    {
                        cfh1.b(cfe1);
                        g.put(cfe1.d(), cfe1);
                        if (flag)
                        {
                            chf.a("Dispatcher", "paused", cfe1.b.a(), (new StringBuilder("because tag '")).append(obj).append("' was paused").toString());
                        }
                    }
                    if (i1 != 0)
                    {
                        for (i1 = list.size() - 1; i1 >= 0; i1--)
                        {
                            cfe cfe2 = (cfe)list.get(i1);
                            if (!cfe2.l().equals(obj))
                            {
                                continue;
                            }
                            cfh1.b(cfe2);
                            g.put(cfe2.d(), cfe2);
                            if (flag)
                            {
                                chf.a("Dispatcher", "paused", cfe2.b.a(), (new StringBuilder("because tag '")).append(obj).append("' was paused").toString());
                            }
                        }

                    }
                    if (cfh1.b())
                    {
                        iterator.remove();
                        if (flag)
                        {
                            chf.a("Dispatcher", "canceled", chf.a(cfh1), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    final void d(cfe cfe1)
    {
        String s = cfe1.e();
        cfh cfh1 = (cfh)e.get(s);
        if (cfh1 != null)
        {
            cfh1.b(cfe1);
            if (cfh1.b())
            {
                e.remove(s);
                if (cfe1.j().l)
                {
                    chf.a("Dispatcher", "canceled", cfe1.c().a());
                }
            }
        }
        if (h.contains(cfe1.l()))
        {
            g.remove(cfe1.d());
            if (cfe1.j().l)
            {
                chf.a("Dispatcher", "canceled", cfe1.c().a(), "because paused request got canceled");
            }
        }
        cfe1 = (cfe)f.remove(cfe1.d());
        if (cfe1 != null && cfe1.j().l)
        {
            chf.a("Dispatcher", "canceled", cfe1.c().a(), "from replaying");
        }
    }

    final void d(cfh cfh1)
    {
        boolean flag1 = true;
        if (!cfh1.c()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (c.isShutdown())
        {
            a(cfh1, false);
            return;
        }
        NetworkInfo networkinfo;
        boolean flag;
        boolean flag2;
        boolean flag3;
        if (o)
        {
            networkinfo = ((ConnectivityManager)chf.a(b, "connectivity")).getActiveNetworkInfo();
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
        flag2 = cfh1.a(networkinfo);
        flag3 = cfh1.d();
        if (flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!o || !flag3)
        {
            flag1 = false;
        }
        a(cfh1, flag1);
        if (flag1)
        {
            f(cfh1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!o || flag)
        {
            if (cfh1.j().l)
            {
                chf.a("Dispatcher", "retrying", chf.a(cfh1));
            }
            if (cfh1.l() instanceof cgf)
            {
                cfh1.i = cfh1.i | cgd.a.d;
            }
            cfh1.n = c.submit(cfh1);
            return;
        }
        a(cfh1, flag3);
        if (flag3)
        {
            f(cfh1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    final void d(Object obj)
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
                cfe cfe1 = (cfe)iterator.next();
                if (cfe1.l().equals(obj))
                {
                    ArrayList arraylist1 = arraylist;
                    if (arraylist == null)
                    {
                        arraylist1 = new ArrayList();
                    }
                    arraylist1.add(cfe1);
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

    final void e(cfh cfh1)
    {
        if (cgc.b(cfh1.g()))
        {
            k.a(cfh1.f(), cfh1.e());
        }
        e.remove(cfh1.f());
        g(cfh1);
        if (cfh1.j().l)
        {
            chf.a("Dispatcher", "batched", chf.a(cfh1), "for completion");
        }
    }
}
