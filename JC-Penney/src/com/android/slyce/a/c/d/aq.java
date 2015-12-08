// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.b.n;
import com.android.slyce.a.c.av;
import com.android.slyce.a.c.s;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.android.slyce.a.c.d:
//            l, g, aj

class aq extends n
{

    final com.android.slyce.a.c.n a;
    final aj b;

    aq(aj aj, com.android.slyce.a.c.n n1)
    {
        b = aj;
        a = n1;
        super();
    }

    protected volatile void a(Object obj)
    {
        a((List)obj);
    }

    protected void a(List list)
    {
        av av1 = new av();
        l l1;
        for (list = list.iterator(); list.hasNext(); av1.b(l1.h.a(), l1.i.a()))
        {
            l1 = (l)list.next();
        }

        list = av1.d(l.a.a()).split(" ", 2);
        a.f.a(Integer.parseInt(list[0]));
        if (list.length == 2)
        {
            a.f.b(list[1]);
        }
        a.f.a(av1.d(l.g.a()));
        a.f.a(av1);
        b(av1);
    }
}
