// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.a:
//            c, a

private static class c
    implements c
{

    private c a;
    private e b;
    private int c;

    private void e(a a1)
    {
        if (!a.b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j = b.c.size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                a1 = null;
            } else
            {
label0:
                {
                    c c1 = (c)b.c.get(i);
                    if (c1.b != c || c1.a.a != a1)
                    {
                        break label0;
                    }
                    a1.b(this);
                    a1 = c1;
                }
            }
            b.c.remove(a1);
            if (b.c.size() == 0)
            {
                b.a.a();
                com.nineoldandroids.a.c.a(a).add(b.a);
                return;
            }
            if (true)
            {
                continue;
            }
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(a a1)
    {
        if (c == 0)
        {
            e(a1);
        }
    }

    public void b(a a1)
    {
        if (c == 1)
        {
            e(a1);
        }
    }

    public void c(a a1)
    {
    }

    public void d(a a1)
    {
    }

    public (c c1,  , int i)
    {
        a = c1;
        b = ;
        c = i;
    }
}
