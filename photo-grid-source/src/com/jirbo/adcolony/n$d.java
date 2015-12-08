// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;

class it>
{

    ArrayList a;

    int a()
    {
        return a.size();
    }

    e a(int i)
    {
        return (e)a.get(i);
    }

     a(String s)
    {
        for (int i = 0; i < a.size(); i++)
        {
              = (e)a.get(i);
            if (.a.equals(s))
            {
                return ;
            }
        }

        return null;
    }

    void a( )
    {
        a.add();
    }

    boolean a(ata.c c)
    {
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
                ata.g g = new <init>();
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

     b()
    {
        return ()a.get(0);
    }

     b(int i)
    {
_L7:
        if (i >= a.size()) goto _L2; else goto _L1
_L1:
          = (e)a.get(i);
        if (!.w.a) goto _L4; else goto _L3
_L3:
        return ;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= a.size())
                {
                    break label1;
                }
                 1 = (e)a.get(i);
                 = 1;
                if (1.w.a)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    ata.c()
    {
        a = new ArrayList();
    }
}
