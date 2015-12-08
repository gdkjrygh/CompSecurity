// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.os.Handler;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            x, z

final class y
    implements Runnable
{

    final x a;

    y(x x1)
    {
        a = x1;
        super();
    }

    public final void run()
    {
        x.f(a).post(new z(this));
        if (x.g(a) > 0 && !x.b(a))
        {
            x.h(a).postDelayed(this, x.g(a));
        }
    }
}
