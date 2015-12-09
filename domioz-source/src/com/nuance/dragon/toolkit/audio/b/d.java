// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.b;

import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.audio.b:
//            c, a

final class d
    implements Runnable
{

    final List a;
    final boolean b;
    final c c;

    d(c c1, List list, boolean flag)
    {
        c = c1;
        a = list;
        b = flag;
        super();
    }

    public final void run()
    {
        com.nuance.dragon.toolkit.audio.b.a.b(c.b, c.a);
        if (a != null && !a.isEmpty())
        {
            c.b.a(a);
        }
        if (b)
        {
            c.b.d();
        }
    }
}
