// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.a:
//            b, c, a

class a extends b
{

    boolean a;
    final c b;
    private final ArrayList c;

    public void b(a a1)
    {
        if (a) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = c.size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        a1 = (c)c.get(i);
        ((c) (a1)).a.a();
        com.nineoldandroids.a.c.a(b).add(((b) (a1)).a);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void c(a a1)
    {
        a = true;
    }

    (c c1, ArrayList arraylist)
    {
        b = c1;
        c = arraylist;
        super();
        a = false;
    }
}
