// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.b;

import com.nuance.dragon.toolkit.d.b;

// Referenced classes of package com.nuance.dragon.toolkit.audio.b:
//            a, m, l

final class f
    implements Runnable
{

    final a a;

    f(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        a.h();
        if (com.nuance.dragon.toolkit.audio.b.a.d(a))
        {
            com.nuance.dragon.toolkit.audio.b.a.h(a);
            if (com.nuance.dragon.toolkit.audio.b.a.i(a) != null)
            {
                com.nuance.dragon.toolkit.audio.b.a.i(a).b();
                com.nuance.dragon.toolkit.audio.b.a.j(a);
            }
        }
        if (com.nuance.dragon.toolkit.audio.b.a.g(a) != null)
        {
            com.nuance.dragon.toolkit.audio.b.a.g(a).b();
            com.nuance.dragon.toolkit.audio.b.a.k(a);
        }
        if (com.nuance.dragon.toolkit.audio.b.a.b(a) != null)
        {
            l l1 = com.nuance.dragon.toolkit.audio.b.a.b(a);
            com.nuance.dragon.toolkit.audio.b.a.l(a);
            com.nuance.dragon.toolkit.audio.b.a.m(a);
            l1.e();
        }
    }
}
