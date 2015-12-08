// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.utils.c;
import com.comscore.utils.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p.aq.b;

// Referenced classes of package com.comscore.streaming:
//            c, f, e, b, 
//            d, k, h, i, 
//            j, l, m

public class a
{

    protected b a;
    private HashMap b;
    private String c;
    private long d;
    private long e;
    private f f;
    private int g;
    private e h;
    private Runnable i;
    private boolean j;
    private Runnable k;
    private m l;
    private Runnable m;
    private long n;
    private int o;
    private long p;
    private boolean q;
    private f r;
    private String s;
    private String t;
    private HashMap u;
    private List v;
    private List w;
    private int x;
    private int y;

    private long a(long l1)
    {
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            HashMap hashmap = (HashMap)iterator.next();
            Long long1 = (Long)hashmap.get("playingtime");
            if (long1 == null || l1 < long1.longValue())
            {
                return ((Long)hashmap.get("interval")).longValue();
            }
        }

        return 0L;
    }

    private f a(com.comscore.streaming.c c1)
    {
        if (c1 == c.a)
        {
            return com.comscore.streaming.f.b;
        }
        if (c1 == com.comscore.streaming.c.b)
        {
            return com.comscore.streaming.f.c;
        }
        if (c1 == c.d)
        {
            return f.d;
        }
        if (c1 == com.comscore.streaming.c.c)
        {
            return f.a;
        } else
        {
            return null;
        }
    }

    private HashMap a(com.comscore.streaming.c c1, HashMap hashmap)
    {
        if (!a.aq())
        {
            new HashMap();
        }
        com.comscore.utils.c.a(this, (new StringBuilder()).append("createMeasurementLabels(").append(c1).append(")").toString());
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_ts"))
        {
            hashmap1.put("ns_ts", String.valueOf(System.currentTimeMillis()));
        }
        if (c1 != null && !hashmap1.containsKey("ns_st_ev"))
        {
            hashmap1.put("ns_st_ev", c1.toString());
        }
        hashmap1.putAll(d());
        b(c1, hashmap1);
        h.a(c1, hashmap1);
        h.b().a(c1, hashmap1);
        if (!hashmap1.containsKey("ns_st_mp"))
        {
            hashmap1.put("ns_st_mp", s);
        }
        if (!hashmap1.containsKey("ns_st_mv"))
        {
            hashmap1.put("ns_st_mv", t);
        }
        if (!hashmap1.containsKey("ns_st_ub"))
        {
            hashmap1.put("ns_st_ub", "0");
        }
        if (!hashmap1.containsKey("ns_st_br"))
        {
            hashmap1.put("ns_st_br", "0");
        }
        if (!hashmap1.containsKey("ns_st_pn"))
        {
            hashmap1.put("ns_st_pn", "1");
        }
        if (!hashmap1.containsKey("ns_st_tp"))
        {
            hashmap1.put("ns_st_tp", "1");
        }
        if (!hashmap1.containsKey("ns_st_it"))
        {
            hashmap1.put("ns_st_it", "c");
        }
        hashmap1.put("ns_st_sv", "4.1502.26");
        return hashmap1;
    }

    static void a(a a1)
    {
        a1.o();
    }

    static void a(a a1, f f1, HashMap hashmap)
    {
        a1.a(f1, hashmap);
    }

    private void a(f f1, HashMap hashmap)
    {
        long l1 = 0L;
        if (a.aq())
        {
            com.comscore.utils.c.a(this, (new StringBuilder()).append("transitionTo(").append(f1).append(", ").append(hashmap).append(")").toString());
            q();
            if (c(f1))
            {
                f f2 = c();
                long l2 = d;
                long l3 = f(hashmap);
                if (l2 >= 0L)
                {
                    l1 = l3 - l2;
                }
                b(c(), hashmap);
                c(f1, hashmap);
                d(f1);
                for (Iterator iterator = v.iterator(); iterator.hasNext(); ((d)iterator.next()).a(f2, f1, hashmap, l1)) { }
                c(hashmap);
                h.a(hashmap, f1);
                h.b().a(hashmap, f1);
                f1 = a(f1.b(), hashmap);
                f1.putAll(hashmap);
                if (b(f))
                {
                    a(((HashMap) (f1)));
                    r = f;
                    g = g + 1;
                    return;
                }
            }
        }
    }

    private void a(f f1, HashMap hashmap, long l1)
    {
        if (!a.aq())
        {
            return;
        } else
        {
            com.comscore.utils.c.a(this, (new StringBuilder()).append("transitionTo(").append(f1).append(", ").append(hashmap).append(", ").append(l1).append(")").toString());
            q();
            l = new k(this, f1, hashmap);
            a.s().a(l, l1);
            return;
        }
    }

    private boolean a(f f1)
    {
        while (!a.aq() || f1 != com.comscore.streaming.f.b && f1 != com.comscore.streaming.f.c) 
        {
            return false;
        }
        return true;
    }

    private HashMap b(com.comscore.streaming.c c1, HashMap hashmap)
    {
        if (a.aq()) goto _L2; else goto _L1
_L1:
        HashMap hashmap1 = new HashMap();
_L4:
        return hashmap1;
_L2:
label0:
        {
label1:
            {
                long l1;
                long l2;
                long l3;
                if (hashmap == null)
                {
                    hashmap = new HashMap();
                }
                hashmap.put("ns_st_ec", String.valueOf(g));
                if (hashmap.containsKey("ns_st_po"))
                {
                    break label0;
                }
                l2 = e;
                l3 = f(hashmap);
                if (c1 != c.a && c1 != c.e && c1 != c.f)
                {
                    l1 = l2;
                    if (c1 != null)
                    {
                        break label1;
                    }
                    l1 = l2;
                    if (f != com.comscore.streaming.f.b)
                    {
                        break label1;
                    }
                }
                l1 = l2 + (l3 - h.b().f());
            }
            hashmap.put("ns_st_po", String.valueOf(l1));
        }
        hashmap1 = hashmap;
        if (c1 == c.f)
        {
            hashmap.put("ns_st_hc", String.valueOf(o));
            hashmap.put("ns_st_pe", "1");
            return hashmap;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(f f1, HashMap hashmap)
    {
        if (a.aq())
        {
            com.comscore.utils.c.a(this, (new StringBuilder()).append("onExit(").append(f1).append(", ").append(hashmap).append(")").toString());
            long l1 = f(hashmap);
            if (f1 == com.comscore.streaming.f.b)
            {
                h.a(l1);
                j();
                m();
                return;
            }
            if (f1 == f.d)
            {
                h.b(l1);
                p();
                return;
            }
            if (f1 == f.a)
            {
                g().a(g().a().keySet());
                return;
            }
        }
    }

    private void b(HashMap hashmap)
    {
        while (!a.aq() || f(hashmap) >= 0L) 
        {
            return;
        }
        hashmap.put("ns_ts", String.valueOf(System.currentTimeMillis()));
    }

    private boolean b(f f1)
    {
        while (f1 == com.comscore.streaming.f.c && (r == f.a || r == null) || f1 == f.d || r == f1) 
        {
            return false;
        }
        return true;
    }

    private void c(f f1, HashMap hashmap)
    {
        if (a.aq()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        com.comscore.utils.c.a(this, (new StringBuilder()).append("onEnter(").append(f1).append(", ").append(hashmap).append(")").toString());
        l1 = f(hashmap);
        e = e(hashmap);
        if (f1 != com.comscore.streaming.f.b)
        {
            break; /* Loop/switch isn't completed */
        }
        i();
        l();
        h.b().c(l1);
        if (b(f1))
        {
            h.b().c();
            if (h.c() < 1)
            {
                h.a(1);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (f1 != com.comscore.streaming.f.c)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b(f1))
        {
            h.f();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (f1 != f.d)
        {
            continue; /* Loop/switch isn't completed */
        }
        h.b().d(l1);
        if (!j) goto _L1; else goto _L5
_L5:
        h();
        return;
        if (f1 != f.a) goto _L1; else goto _L6
_L6:
        k();
        return;
    }

    private void c(HashMap hashmap)
    {
        if (a.aq())
        {
            String s1 = (String)hashmap.get("ns_st_mp");
            if (s1 != null)
            {
                s = s1;
                hashmap.remove("ns_st_mp");
            }
            s1 = (String)hashmap.get("ns_st_mv");
            if (s1 != null)
            {
                t = s1;
                hashmap.remove("ns_st_mv");
            }
            s1 = (String)hashmap.get("ns_st_ec");
            if (s1 != null)
            {
                try
                {
                    g = Integer.parseInt(s1);
                    hashmap.remove("ns_st_ec");
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (HashMap hashmap)
                {
                    return;
                }
            }
        }
    }

    private boolean c(f f1)
    {
        return f1 != null && c() != f1;
    }

    private void d(f f1)
    {
        if (!a.aq())
        {
            return;
        } else
        {
            f = f1;
            d = System.currentTimeMillis();
            return;
        }
    }

    private void d(HashMap hashmap)
    {
        if (!a.aq())
        {
            return;
        } else
        {
            u = g(null);
            u.putAll(hashmap);
            return;
        }
    }

    private long e(HashMap hashmap)
    {
        if (hashmap.containsKey("ns_st_po"))
        {
            long l1;
            try
            {
                l1 = Long.valueOf((String)hashmap.get("ns_st_po")).longValue();
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap)
            {
                return -1L;
            }
            return l1;
        } else
        {
            return -1L;
        }
    }

    private long f(HashMap hashmap)
    {
        if (hashmap.containsKey("ns_ts"))
        {
            long l1;
            try
            {
                l1 = Long.valueOf((String)hashmap.get("ns_ts")).longValue();
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap)
            {
                return -1L;
            }
            return l1;
        } else
        {
            return -1L;
        }
    }

    private HashMap g(HashMap hashmap)
    {
        return a(f.b(), hashmap);
    }

    private void h()
    {
        if (a.aq())
        {
            p();
            if (e() && b(com.comscore.streaming.f.c))
            {
                i = new h(this);
                a.s().a(i, y);
                return;
            }
        }
    }

    private void i()
    {
        if (a.aq())
        {
            n();
            if (w != null)
            {
                long l1;
                if (n >= 0L)
                {
                    l1 = n;
                    com.comscore.utils.c.a(this, (new StringBuilder()).append("Resuming heart beat timer. Next event in ").append(l1).append(" ms").toString());
                } else
                {
                    l1 = a(h.b().e());
                    com.comscore.utils.c.a(this, (new StringBuilder()).append("Starting heart beat timer. Next event in ").append(l1).append(" ms").toString());
                }
                if (l1 > 0L)
                {
                    p = System.currentTimeMillis() + l1;
                    m = new i(this);
                    a.s().a(m, l1);
                    return;
                }
            }
        }
    }

    private void j()
    {
        if (!a.aq())
        {
            return;
        } else
        {
            com.comscore.utils.c.a(this, "Pausing heartbeat timer.");
            n();
            n = p - System.currentTimeMillis();
            p = -1L;
            return;
        }
    }

    private void k()
    {
        if (!a.aq())
        {
            return;
        } else
        {
            com.comscore.utils.c.a(this, "Resetting heartbeat timer.");
            n = -1L;
            p = -1L;
            o = 0;
            return;
        }
    }

    private void l()
    {
        if (!a.aq())
        {
            return;
        } else
        {
            com.comscore.utils.c.a(this, "Starting keep alive timer");
            m();
            k = new j(this);
            a.s().a(k, x, true, x);
            return;
        }
    }

    private void m()
    {
        if (a.aq())
        {
            com.comscore.utils.c.a(this, "stopKeepAliveTask()");
            if (k != null)
            {
                a.s().b(k);
                k = null;
                return;
            }
        }
    }

    private void n()
    {
        if (a.aq())
        {
            com.comscore.utils.c.a(this, "releaseHeartBeatTask()");
            if (m != null)
            {
                a.s().b(m);
                m = null;
                return;
            }
        }
    }

    private void o()
    {
        if (a.aq())
        {
            com.comscore.utils.c.a(this, "Firing paused on buffering event");
            if (r == com.comscore.streaming.f.b)
            {
                h.g();
                h.f();
                a(a(com.comscore.streaming.c.b, ((HashMap) (null))));
                g = g + 1;
                r = com.comscore.streaming.f.c;
                return;
            }
        }
    }

    private void p()
    {
        if (a.aq())
        {
            com.comscore.utils.c.a(this, "stopPausedOnBufferingTask()");
            if (i != null)
            {
                a.s().b(i);
                i = null;
                return;
            }
        }
    }

    private void q()
    {
        if (a.aq())
        {
            com.comscore.utils.c.a(this, "stopDelayedTransitionTask()");
            if (l != null)
            {
                a.s().b(l);
                l = null;
                return;
            }
        }
    }

    private boolean r()
    {
        android.content.Context context = a.P();
        String s1 = a.W();
        String s2 = a.S();
        return context == null || s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0;
    }

    protected void a()
    {
        if (!a.aq())
        {
            return;
        } else
        {
            com.comscore.utils.c.a(this, "Firing heart beat");
            o = o + 1;
            a(a(c.f, ((HashMap) (null))));
            n = -1L;
            i();
            return;
        }
    }

    public void a(com.comscore.streaming.c c1, HashMap hashmap, long l1)
    {
        if (!a.aq())
        {
            return;
        }
        com.comscore.utils.c.a(this, (new StringBuilder()).append("notify(").append(c1).append(", ").append(hashmap).append(")").toString());
        f f1 = a(c1);
        hashmap = com.comscore.utils.p.a(hashmap);
        b(hashmap);
        if (!hashmap.containsKey("ns_st_po"))
        {
            hashmap.put("ns_st_po", String.valueOf(l1));
        }
        if (c1 == c.a || c1 == com.comscore.streaming.c.b || c1 == c.d || c1 == com.comscore.streaming.c.c)
        {
            if (f() && a(f) && a(f1) && (f != com.comscore.streaming.f.b || f1 != com.comscore.streaming.f.c || l != null))
            {
                a(f1, hashmap, 500L);
                return;
            } else
            {
                a(f1, hashmap);
                return;
            }
        } else
        {
            c1 = a(c1, hashmap);
            c1.putAll(hashmap);
            a(((HashMap) (c1)), false);
            g = g + 1;
            return;
        }
    }

    public void a(String s1, String s2)
    {
        if (!a.aq())
        {
            return;
        }
        if (s2 == null)
        {
            b.remove(s1);
            return;
        } else
        {
            b.put(s1, s2);
            return;
        }
    }

    protected void a(HashMap hashmap)
    {
        a(hashmap, true);
    }

    protected void a(HashMap hashmap, boolean flag)
    {
        if (a.aq())
        {
            com.comscore.utils.c.a(this, (new StringBuilder()).append("dispatch(").append(hashmap).append(", ").append(flag).append(")").toString());
            if (flag)
            {
                d(hashmap);
            }
            if (!r())
            {
                String s1 = c;
                a.s().a(new l(this, hashmap, s1), true);
                return;
            }
        }
    }

    protected void b()
    {
        if (!a.aq())
        {
            return;
        } else
        {
            com.comscore.utils.c.a(this, "Firing keep alive");
            a(a(c.e, ((HashMap) (null))));
            g = g + 1;
            return;
        }
    }

    public f c()
    {
        return f;
    }

    public HashMap d()
    {
        return b;
    }

    public boolean e()
    {
        return j;
    }

    public boolean f()
    {
        return q;
    }

    public com.comscore.streaming.b g()
    {
        return h.b();
    }
}
