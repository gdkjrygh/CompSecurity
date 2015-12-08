// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            a, d, t, l, 
//            ah, ag, b

class ta.g
{

    String a;
    int b;
    int c;
    int d;
    boolean e;
    boolean f;
    ArrayList g;
     h;
     i;
     j;
    ag k;

    int a(int i1, int j1)
    {
        int k1;
        if (j1 <= 0)
        {
            k1 = 0;
        } else
        {
            k1 = j1;
            if (i1 != -1)
            {
                k1 = j1;
                if (i1 < j1)
                {
                    return i1;
                }
            }
        }
        return k1;
    }

    int a(ta.g g1)
    {
        int i1 = -1;
        this;
        JVM INSTR monitorenter ;
        int j1;
        int k1;
        k1 = a.l.h.b(a);
        j1 = g1..;
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        if (a.ab == 0L || (System.currentTimeMillis() - a.ab) / 1000L < (long)j1) goto _L2; else goto _L3
_L3:
        c();
        a.ac = 7;
        i1 = l.c.c("The volatile expiration for this ad has been hit.");
_L5:
        this;
        JVM INSTR monitorexit ;
        return i1;
_L2:
        j1 = g1..;
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        i1 = a(-1, j1 - a.l.h.a(g1., (System.currentTimeMillis() - a.ab) / 1000L));
        if (i1 != 0 || j1 == 0)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        c();
        a.ac = 7;
        i1 = l.c.c("Ad is not ready to be played due to the volatile play cap.");
        continue; /* Loop/switch isn't completed */
        int l1 = c;
        j1 = i1;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        j1 = a(i1, l1 - k1);
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        a.ac = 5;
        i1 = l.c.c((new StringBuilder("Ad is not ready to be played due to the daily play cap for zone ")).append(a).toString());
        continue; /* Loop/switch isn't completed */
        l1 = d;
        i1 = j1;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        i1 = a(j1, l1 - a.l.h.a(a));
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        a.ac = 3;
        i1 = l.c.c((new StringBuilder("Ad is not ready to be played due to the session play cap for zone ")).append(a).toString());
        continue; /* Loop/switch isn't completed */
        j1 = i1;
        if (!j.a)
        {
            break MISSING_BLOCK_LABEL_425;
        }
        l1 = j.b.;
        j1 = i1;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        j1 = a(i1, l1 - k1);
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        a.ac = 4;
        i1 = l.c.c("Ad is not ready to be played due to the V4VC daily play cap.");
        continue; /* Loop/switch isn't completed */
        k1 = j.b.;
        l1 = j.b.;
        i1 = j1;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        i1 = a(j1, l1 - a.l.h.a(a, k1));
        j1 = i1;
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_425;
        }
        a.ac = 4;
        i1 = l.c.c("Ad is not ready to be played due to the V4VC custom play cap.");
        continue; /* Loop/switch isn't completed */
        k1 = g1.;
        l1 = g1..;
        i1 = j1;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_467;
        }
        i1 = a(j1, l1 - a.l.h.a(k1));
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        a.ac = 7;
        c();
        i1 = l.c.c("Ad is not ready to be played due to the daily play cap.");
        continue; /* Loop/switch isn't completed */
        l1 = g1..;
        j1 = i1;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_528;
        }
        j1 = a(i1, l1 - a.l.h.b(k1));
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        a.ac = 7;
        c();
        i1 = l.c.c("Ad is not ready to be played due to the weekly play cap.");
        continue; /* Loop/switch isn't completed */
        l1 = g1..;
        i1 = j1;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_589;
        }
        i1 = a(j1, l1 - a.l.h.c(k1));
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_614;
        }
        a.ac = 7;
        c();
        i1 = l.c.c("Ad is not ready to be played due to the monthly play cap.");
        continue; /* Loop/switch isn't completed */
        l1 = g1..;
        j1 = i1;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_650;
        }
        j1 = a(i1, l1 - a.l.h.d(k1));
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_675;
        }
        a.ac = 7;
        c();
        i1 = l.c.c("Ad is not ready to be played due to the half-year play cap.");
        continue; /* Loop/switch isn't completed */
        int i2;
        l1 = g1..;
        i2 = g1..;
        i1 = j1;
        if (i2 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = a(j1, i2 - a.l.h.a(k1, l1));
        if (true) goto _L5; else goto _L4
_L4:
        g1;
        throw g1;
    }

    boolean a()
    {
        return a(false, true);
    }

    boolean a(ta.g g1)
    {
        if (g1 != null)
        {
            a = g1.e("uuid");
            e = g1.h("enabled");
            f = g1.h("active");
            if (!e || !f)
            {
                return true;
            }
            b = g1.g("play_interval");
            c = g1.g("daily_play_cap");
            d = g1.g("session_play_cap");
            g = new ArrayList();
            ArrayList arraylist = g1.d("play_order");
            g = arraylist;
            if (arraylist != null)
            {
                h = new <init>();
                if (h.a(g1.b("tracking")))
                {
                    i = new init>();
                    if (i.(g1.c("ads")))
                    {
                        j = new <init>();
                        if (j.a(g1.b("v4vc")))
                        {
                            k = a.l.g.a(a);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    boolean a(boolean flag)
    {
        if (!flag)
        {
            com.jirbo.adcolony.a.h();
        }
        break MISSING_BLOCK_LABEL_7;
_L2:
        int i1;
        int j1;
        do
        {
            return false;
        } while (!e || !f || i.() == 0 || g.size() == 0);
        j1 = g.size();
        i1 = 0;
_L5:
        a a1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        a1 = i();
        if (a1 == null) goto _L2; else goto _L1
_L1:
        if (!a1.()) goto _L4; else goto _L3
_L3:
        if (a1 != null && a(a1) != 0)
        {
            return true;
        }
          goto _L2
_L4:
        k();
        i1++;
          goto _L5
        a1 = null;
          goto _L3
    }

    boolean a(boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        if (flag1) goto _L2; else goto _L1
_L1:
        flag = a(flag);
_L7:
        return flag;
_L2:
        int i1;
        int j1;
        if (!e || !f)
        {
            a.ac = 1;
            return l.c.b((new StringBuilder("Ad is not ready to be played, as zone ")).append(a).append(" is disabled or inactive.").toString());
        }
        if (i.() == 0 || g.size() == 0)
        {
            a.ac = 5;
            return l.c.b((new StringBuilder("Ad is not ready to be played, as AdColony currently has no videos available to be played in zone ")).append(a).append(".").toString());
        }
        j1 = g.size();
        i1 = 0;
_L5:
        k k1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        k1 = i();
        if (k1 == null)
        {
            return l.c.b("Ad is not ready to be played due to an unknown error.");
        }
        if (!k1.()) goto _L4; else goto _L3
_L4:
        k();
        i1++;
          goto _L5
_L3:
        if (k1 == null)
        {
            a.ac = 6;
            return l.c.b("Ad is not ready to be played as required assets are still downloading or otherwise missing.");
        }
        flag = flag2;
        if (a(k1) == 0)
        {
            return false;
        }
        if (true) goto _L7; else goto _L6
_L6:
        k1 = null;
          goto _L3
        if (true) goto _L7; else goto _L8
_L8:
    }

    boolean b()
    {
        if (b > 1)
        {
            a.l.g.b = true;
            ag ag1 = k;
            int i1 = ag1.b;
            ag1.b = i1 + 1;
            if (i1 != 0)
            {
                if (k.b >= b)
                {
                    k.b = 0;
                }
                return true;
            }
        }
        return false;
    }

    boolean b(boolean flag)
    {
        boolean flag1 = true;
        if (!flag)
        {
            flag = f();
        } else
        {
            if (!e || !f)
            {
                a.ac = 1;
                return l.c.b((new StringBuilder("Ad is not ready, as zone ")).append(a).append(" is disabled or inactive.").toString());
            }
            if (i.() == 0)
            {
                a.ac = 5;
                return l.c.b((new StringBuilder("Ad is not ready, as there are currently no ads to play in zone ")).append(a).append(".").toString());
            }
            flag = flag1;
            if (i.()..)
            {
                a.ac = 14;
                return l.c.b((new StringBuilder("Ad is not ready, as zone ")).append(a).append(" is V4VC enabled and must be played using an AdColonyV4VCAd object.").toString());
            }
        }
        return flag;
    }

    void c()
    {
        a.l.b.e();
    }

    boolean c(boolean flag)
    {
        boolean flag1 = true;
        if (!flag)
        {
            flag = h();
        } else
        {
            if (!e || !f)
            {
                a.ac = 1;
                return l.c.b((new StringBuilder("Ad is not ready, as zone ")).append(a).append(" is disabled or inactive.").toString());
            }
            if (i.() == 0)
            {
                a.ac = 5;
                return l.c.b((new StringBuilder("Ad is not ready, as there are currently no ads to play in zone ")).append(a).append(".").toString());
            }
            flag = flag1;
            if (!i.()..)
            {
                a.ac = 15;
                return l.c.b((new StringBuilder("Ad is not ready, as zone ")).append(a).append(" is not V4VC enabled and must be played using an AdColonyVideoAd object.").toString());
            }
        }
        return flag;
    }

    int d()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = a(i());
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    boolean e()
    {
        return b(true);
    }

    boolean f()
    {
        while (!e || !f || i.() == 0 || i.()..) 
        {
            return false;
        }
        return true;
    }

    boolean g()
    {
        return c(true);
    }

    boolean h()
    {
        while (!e || !f || i.() == 0 || !i.()..) 
        {
            return false;
        }
        return true;
    }

     i()
    {
        if (g.size() > 0)
        {
            return i.((String)g.get(k.c % g.size()));
        } else
        {
            return null;
        }
    }

     j()
    {
        if (g.size() > 0)
        {
            return i.(k.c % g.size());
        } else
        {
            return null;
        }
    }

    void k()
    {
        if (g.size() > 0)
        {
            k.c = (k.c + 1) % g.size();
        }
    }

    void l()
    {
        if (e && f)
        {
            int i1 = 0;
            while (i1 < i.()) 
            {
                i.(i1).();
                i1++;
            }
        }
    }

    ta.g()
    {
    }
}
