// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.nineoldandroids.a:
//            c, a

private class b
    implements b
{

    final c a;
    private c b;

    public void a(a a1)
    {
    }

    public void b(a a1)
    {
        a1.b(this);
        com.nineoldandroids.a.c.a(a).remove(a1);
        (()com.nineoldandroids.a.c.b(b).get(a1)).f = true;
        if (a.b) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        a1 = com.nineoldandroids.a.c.c(b);
        j = a1.size();
        i = 0;
_L6:
        if (i >= j)
        {
            i = 1;
        } else
        {
label0:
            {
                if (((b)a1.get(i)).f)
                {
                    break label0;
                }
                i = 0;
            }
        }
        if (i == 0) goto _L2; else goto _L3
_L3:
        if (a.a == null) goto _L5; else goto _L4
_L4:
        a1 = (ArrayList)a.a.clone();
        j = a1.size();
        i = 0;
_L7:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_142;
        }
_L5:
        com.nineoldandroids.a.c.a(b, false);
_L2:
        return;
        i++;
          goto _L6
        ((b)a1.get(i)).b(b);
        i++;
          goto _L7
    }

    public void c(a a1)
    {
        if (a.b || com.nineoldandroids.a.c.a(a).size() != 0 || a.a == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = a.a.size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((a)a.a.get(i)).c(b);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void d(a a1)
    {
    }

    (c c1, c c2)
    {
        a = c1;
        super();
        b = c2;
    }
}
