// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            ag, f, k, d, 
//            c, l

class ah
{

    d a;
    boolean b;
    ArrayList c;

    ah(d d1)
    {
        b = false;
        c = new ArrayList();
        a = d1;
    }

    ag a(int i)
    {
        return (ag)c.get(i);
    }

    ag a(String s)
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            ag ag1 = (ag)c.get(i);
            if (ag1.a.equals(s))
            {
                return ag1;
            }
        }

        b = true;
        s = new ag(s);
        c.add(s);
        return s;
    }

    void a()
    {
        boolean flag = false;
        ADCData.c c1 = k.c(new f("zone_state.txt"));
        if (c1 != null)
        {
            c.clear();
            for (int i = 0; i < c1.i(); i++)
            {
                ADCData.g g = c1.b(i);
                ag ag1 = new ag();
                if (ag1.a(g))
                {
                    c.add(ag1);
                }
            }

        }
        String as[] = a.a.k;
        int i1 = as.length;
        for (int j = ((flag) ? 1 : 0); j < i1; j++)
        {
            a(as[j]);
        }

    }

    void b()
    {
        int i = 0;
        l.a.b("Saving zone state...");
        b = false;
        ADCData.c c1 = new ADCData.c();
        String as[] = a.a.k;
        for (int j = as.length; i < j; i++)
        {
            c1.a(a(as[i]).a());
        }

        k.a(new f("zone_state.txt"), c1);
        l.a.b("Saved zone state");
    }

    int c()
    {
        return c.size();
    }

    void d()
    {
        if (b)
        {
            b();
        }
    }
}
