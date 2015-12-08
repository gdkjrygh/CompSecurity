// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.d.e;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            ap, e, x, ab

final class ar extends ap
{

    ar(com.nuance.dragon.toolkit.a.e e1, x x1)
    {
        super(e1, false, true, x1);
    }

    final void a()
    {
        super.a();
        if (a != null)
        {
            a.a();
        }
        ab ab1 = b.j();
        if (ab1 != null)
        {
            ab1.a(b);
        }
    }

    final void c()
    {
        e.c(this, "cancel() method called in finished state");
    }
}
