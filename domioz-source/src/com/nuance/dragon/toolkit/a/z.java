// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.d.b;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            y, x, aa

final class z
    implements Runnable
{

    final y a;

    z(y y1)
    {
        a = y1;
        super();
    }

    public final void run()
    {
        (new StringBuilder("cadence result at: ")).append(System.currentTimeMillis());
        x.c(a.a).a(a.a, x.a(a.a), com.nuance.dragon.toolkit.a.x.b(a.a));
        if (com.nuance.dragon.toolkit.a.x.b(a.a))
        {
            x.d(a.a).b();
            x.e(a.a);
        }
    }
}
