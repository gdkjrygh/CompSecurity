// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.a.a.a.c.a.c.a;
import com.nuance.dragon.toolkit.d.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            ap, av, o, x, 
//            an, ao, ar, p, 
//            e

final class au extends ap
{

    private final List c;
    private final ArrayList d = new ArrayList();
    private final p e = new av(this);

    au(com.nuance.dragon.toolkit.a.e e1, x x1, List list)
    {
        super(e1, true, false, x1);
        c = list;
    }

    final void a()
    {
        Iterator iterator;
        super.a();
        iterator = c.iterator();
_L2:
        o o1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        o1 = (o)iterator.next();
        boolean flag = o1.a(a, e);
        if (!flag)
        {
            d.add(o1);
        }
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        com.nuance.dragon.toolkit.d.e.a(this, (new StringBuilder("Failed to stream param [")).append(o1.b).append("] command [").append(b.a()).append("]").toString(), exception);
        a(new an(b, 4, exception.getMessage(), o1.b, null, 0));
_L1:
    }

    final void a(a a1)
    {
        super.a(a1);
        a1 = new ao(b, a1);
        boolean flag = a1.e();
        (new StringBuilder("Result in streaming: ")).append(a1.toString()).append(" is final: ").append(flag);
        if (flag)
        {
            a(((ap) (new ar(a, b))));
        }
        b.a(a1, flag);
    }

    final void b()
    {
        o o1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); o1.a())
        {
            o1 = (o)iterator.next();
            (new StringBuilder("Streaming parameter: ")).append(o1.b).append(" is cancelled.");
        }

        c.clear();
        d.clear();
        super.b();
    }
}
