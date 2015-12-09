// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a.a;

import com.nuance.dragon.toolkit.a.aa;
import com.nuance.dragon.toolkit.a.ai;
import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.a.ao;
import com.nuance.dragon.toolkit.a.x;
import com.nuance.dragon.toolkit.audio.a.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.a.a:
//            b, e, g, d, 
//            a, f

final class c
    implements aa
{

    final e a;
    final f b;
    final d c;
    final b d;

    c(b b1, e e1, f f, d d1)
    {
        d = b1;
        a = e1;
        b = f;
        c = d1;
        super();
    }

    public final void a(x x1)
    {
        if (a == com.nuance.dragon.toolkit.a.a.b.a(d))
        {
            e.a(a);
            ai ai1;
            for (x1 = (new ArrayList(0)).iterator(); x1.hasNext(); e.b(a).a(ai1))
            {
                ai1 = (ai)x1.next();
            }

            if (e.c(a))
            {
                e.b(a).e();
                return;
            }
        }
    }

    public final void a(x x1, an an1)
    {
        if (a == com.nuance.dragon.toolkit.a.a.b.a(d))
        {
            com.nuance.dragon.toolkit.a.a.b.b(d);
        }
        com.nuance.dragon.toolkit.a.a.b.c(d).i();
        com.nuance.dragon.toolkit.a.a.b.a(d, an1.a());
        c.a(new g(an1));
    }

    public final void a(x x1, ao ao1, boolean flag)
    {
        if (a != com.nuance.dragon.toolkit.a.a.b.a(d))
        {
            return;
        }
        if (flag)
        {
            com.nuance.dragon.toolkit.a.a.b.b(d);
            com.nuance.dragon.toolkit.a.a.b.c(d).i();
        }
        com.nuance.dragon.toolkit.a.a.b.a(d, ao1.a());
        c.a(new a(ao1));
    }
}
