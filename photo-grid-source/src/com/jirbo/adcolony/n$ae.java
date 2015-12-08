// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            l

class ta.c
{

    ArrayList a;

    int a()
    {
        return a.size();
    }

     a(int i)
    {
        return ()a.get(i);
    }

    a a(String s)
    {
        for (int i = 0; i < a.size(); i++)
        {
            a a1 = ()a.get(i);
            if (a1.a.equals(s))
            {
                return a1;
            }
        }

        l.a.a("No such zone: ").b(s);
        return null;
    }

    boolean a(ta.c c)
    {
        a = new ArrayList();
        if (c != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= c.i())
                {
                    break label1;
                }
                ta.g g = new <init>();
                if (!g.a(c.b(i)))
                {
                    break label0;
                }
                a.add(g);
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    a b()
    {
        return (a)a.get(0);
    }

    ta.c()
    {
    }
}
