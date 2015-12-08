// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.a.ao;
import com.nuance.dragon.toolkit.a.x;

// Referenced classes of package com.nuance.b.b:
//            gp, gh

final class fy extends gp
{

    private gh a;

    fy(long l, gh gh1)
    {
        super(l, "endSession", "TransactionListenerEndSession");
        a = gh1;
    }

    final void a()
    {
    }

    final void a(ao ao1)
    {
    }

    public final void a(x x, an an)
    {
        super.a(x, an);
        a.c();
    }

    public final void a(x x, ao ao1, boolean flag)
    {
        super.a(x, ao1, flag);
        if (ao1.e())
        {
            a.c();
        }
    }

    final void b()
    {
    }
}
