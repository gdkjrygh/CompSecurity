// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.io;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bc, u, ak

final class a
    implements a
{

    final bc a;

    public final void a(u u1)
    {
        bc.a(a, u1.a());
    }

    public final void b(u u1)
    {
        bc.a(a, u1.a());
        (new StringBuilder("Permanent failure dispatching hitId: ")).append(u1.a());
        ak.b();
    }

    public final void c(u u1)
    {
        long l = u1.b();
        if (l == 0L)
        {
            bc.a(a, u1.a(), bc.a(a).a());
        } else
        if (l + 0xdbba00L < bc.a(a).a())
        {
            bc.a(a, u1.a());
            (new StringBuilder("Giving up on failed hitId: ")).append(u1.a());
            ak.b();
            return;
        }
    }

    (bc bc1)
    {
        a = bc1;
        super();
    }
}
