// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.a.a:
//            b, a, d, j

class f
    implements b
{

    final d a;
    private d b;

    f(d d1, d d2)
    {
        a = d1;
        super();
        b = d2;
    }

    public void a(a a1)
    {
    }

    public void b(a a1)
    {
        a1.b(this);
        com.a.a.d.a(a).remove(a1);
        ((j)com.a.a.d.b(b).get(a1)).f = true;
        if (a.b) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        a1 = com.a.a.d.c(b);
        k = a1.size();
        i = 0;
_L5:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        if (((j)a1.get(i)).f) goto _L4; else goto _L3
_L3:
        i = 0;
_L6:
        if (i != 0)
        {
            if (a.a != null)
            {
                a1 = (ArrayList)a.a.clone();
                int l = a1.size();
                for (i = 0; i < l; i++)
                {
                    ((b)a1.get(i)).b(b);
                }

            }
            com.a.a.d.a(b, false);
        }
          goto _L2
_L4:
        i++;
          goto _L5
_L2:
        return;
        i = 1;
          goto _L6
    }

    public void c(a a1)
    {
        if (!a.b && com.a.a.d.a(a).size() == 0 && a.a != null)
        {
            int k = a.a.size();
            for (int i = 0; i < k; i++)
            {
                ((b)a.a.get(i)).c(b);
            }

        }
    }

    public void d(a a1)
    {
    }
}
