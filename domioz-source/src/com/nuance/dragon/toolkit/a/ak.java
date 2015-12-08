// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import java.util.Queue;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            ab, x, aj

final class ak
    implements ab
{

    final aj a;

    ak(aj aj1)
    {
        a = aj1;
        super();
    }

    public final void a(x x1)
    {
        x1.a(null);
        if (aj.c(a) == x1)
        {
            aj.d(a);
        } else
        {
            aj.a(a).remove(x1);
        }
        aj.b(a);
    }
}
