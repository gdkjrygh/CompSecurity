// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.dragon.toolkit.d.b;

// Referenced classes of package com.nuance.b.b:
//            bc, bl

final class bg
    implements Runnable
{

    final boolean a;
    final bc b;

    bg(bc bc1, boolean flag)
    {
        b = bc1;
        a = flag;
        super();
    }

    public final void run()
    {
        bc.f(b);
        if (!bc.g(b))
        {
            bc.h(b);
            bc.i(b);
            bc.j(b).b();
        }
        if (a)
        {
            bc.c(b).c();
            return;
        } else
        {
            bc.c(b).d();
            return;
        }
    }
}
