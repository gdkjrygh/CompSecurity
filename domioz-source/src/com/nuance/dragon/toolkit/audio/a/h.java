// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.l;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            g

final class h
    implements Runnable
{

    final l a;
    final g b;

    h(g g1, l l1)
    {
        b = g1;
        a = l1;
        super();
    }

    public final void run()
    {
        if (a == g.a(b))
        {
            if (com.nuance.dragon.toolkit.audio.a.g.b(b))
            {
                g.c(b);
                a.a();
            }
            boolean flag;
            if (b.b() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                a.a(b);
            }
            if (g.d(b))
            {
                a.b(b);
                return;
            }
        }
    }
}
