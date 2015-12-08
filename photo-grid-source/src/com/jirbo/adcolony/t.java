// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.jirbo.adcolony:
//            ab, d, v, l, 
//            a, f, k

class t
{

    d a;
    ArrayList b;
    HashMap c;
    HashMap d;
    boolean e;
    boolean f;

    t(d d1)
    {
        b = new ArrayList();
        c = new HashMap();
        d = new HashMap();
        e = false;
        f = false;
        a = d1;
    }

    int a(int i)
    {
        return a(i, 86400D);
    }

    int a(int i, double d1)
    {
        this;
        JVM INSTR monitorenter ;
        double d2 = ab.c();
        int j = 0;
        int i1 = b.size() - 1;
_L3:
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        int j1;
        if (((a)b.get(i1)).d < d2 - d1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = ((a)b.get(i1)).b;
        if (i == j1)
        {
            j++;
        }
        i1--;
          goto _L3
_L2:
        this;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        throw exception;
    }

    int a(String s)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        String s1;
        int j;
        s1 = a.e.j;
        j = b.size() - 1;
        boolean flag = false;
_L6:
        if (j < 0) goto _L2; else goto _L1
_L1:
        if (b.get(j) == null || ((a)b.get(j)).c == null) goto _L2; else goto _L3
_L3:
        if (!((a)b.get(j)).c.equals(s1)) goto _L5; else goto _L4
_L4:
        flag = true;
        boolean flag1 = ((a)b.get(j)).a.equals(s);
        if (flag1)
        {
            i++;
            flag = true;
        }
_L7:
        j--;
          goto _L6
_L5:
        if (flag) goto _L2; else goto _L7
_L2:
        this;
        JVM INSTR monitorexit ;
        return i;
        s;
        throw s;
    }

    int a(String s, double d1)
    {
        this;
        JVM INSTR monitorenter ;
        double d2 = ab.c();
        int i = 0;
        int j = b.size() - 1;
_L3:
        if (j < 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (((a)b.get(j)).d < d2 - d1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = s.equals(((a)b.get(j)).a);
        if (flag)
        {
            i++;
        }
        j--;
          goto _L3
_L2:
        this;
        JVM INSTR monitorexit ;
        return i;
        s;
        throw s;
    }

    void a()
    {
        b();
        e = false;
    }

    void a(String s, int i)
    {
        l.a.b("Adding play event to play history");
        e = true;
        b.add(new a(a.e.j, ab.c(), s, i));
        s = (Integer)c.get(Integer.valueOf(i));
        l.a.a("Got play count of ").a(s).b(" for this ad");
        if (s == null)
        {
            c.put(Integer.valueOf(i), Integer.valueOf(1));
            return;
        } else
        {
            c.put(Integer.valueOf(i), Integer.valueOf(s.intValue() + 1));
            return;
        }
    }

    int b(int i)
    {
        return a(i, 604800D);
    }

    int b(String s)
    {
        return a(s, 86400D);
    }

    void b()
    {
        boolean flag = false;
        com.jirbo.adcolony.a.r = true;
        ADCData.g g;
        if (!f || ((a)b.get(b.size() - 1)).c != a.e.j)
        {
            if ((g = k.b(new f("play_history_info.txt"))) != null)
            {
                b.clear();
                d = new HashMap();
                Object obj = g.b("reward_credit");
                for (int i = 0; i < ((ADCData.g) (obj)).o(); i++)
                {
                    String s = ((ADCData.g) (obj)).a(i);
                    int k1 = ((ADCData.g) (obj)).g(s);
                    d.put(s, Integer.valueOf(k1));
                }

                obj = g.c("play_events");
                for (int j = 0; j < ((ADCData.c) (obj)).i(); j++)
                {
                    ADCData.g g1 = ((ADCData.c) (obj)).b(j);
                    double d1 = g1.f("timestamp");
                    String s1 = g1.e("zone_id");
                    int l1 = g1.g("ad_id");
                    if (d1 != 0.0D && s1 != null && l1 != 0)
                    {
                        b.add(new a(null, d1, s1, l1));
                    }
                }

                c = new HashMap();
                g = g.b("play_counts");
                for (int i1 = ((flag) ? 1 : 0); i1 < g.o(); i1++)
                {
                    int j1 = Integer.parseInt(g.a(i1));
                    int i2 = g.g(String.valueOf(j1));
                    c.put(Integer.valueOf(j1), Integer.valueOf(i2));
                }

                f = true;
                return;
            }
        }
    }

    void b(String s, int i)
    {
        d.put(s, Integer.valueOf(i));
        e = true;
    }

    int c(int i)
    {
        return a(i, 2628000D);
    }

    int c(String s)
    {
        s = (Integer)d.get(s);
        if (s == null)
        {
            return 0;
        } else
        {
            return s.intValue();
        }
    }

    void c()
    {
        ADCData.c c1 = new ADCData.c();
        ADCData.g g = new ADCData.g();
        ADCData.g g1 = new ADCData.g();
        double d1 = ab.c();
        int i = b.size() - 1;
        do
        {
            if (i < 0)
            {
                break;
            }
            a a1 = (a)b.get(i);
            if (a1.d < d1 - 2678400D)
            {
                break;
            }
            ADCData.g g2 = new ADCData.g();
            g2.b("zone_id", a1.a);
            g2.b("ad_id", a1.b);
            g2.b("timestamp", a1.d);
            c1.a(g2);
            i--;
        } while (true);
        g.a("play_events", c1);
        int j;
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); g1.b(String.valueOf(j), ((Integer)c.get(Integer.valueOf(j))).intValue()))
        {
            j = ((Integer)iterator.next()).intValue();
        }

        g.a("play_counts", g1);
        g1 = new ADCData.g();
        if (d.size() > 0)
        {
            String s;
            for (Iterator iterator1 = d.keySet().iterator(); iterator1.hasNext(); g1.b(s, ((Integer)d.get(s)).intValue()))
            {
                s = (String)iterator1.next();
            }

        }
        g.a("reward_credit", g1);
        l.a.a("Saving play history");
        k.a(new f("play_history_info.txt"), g);
    }

    int d(int i)
    {
        return a(i, 15768000D);
    }

    void d()
    {
        if (e)
        {
            e = false;
            c();
        }
    }

    private class a
    {

        String a;
        int b;
        String c;
        double d;

        a(String s, double d1, String s1, int i)
        {
            c = s;
            d = d1;
            a = s1;
            b = i;
        }
    }

}
