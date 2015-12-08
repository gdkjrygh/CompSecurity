// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import com.google.android.gms.ads.a;

// Referenced classes of package com.ijoysoft.a:
//            a

final class l extends a
{

    final com.ijoysoft.a.a a;
    private final Runnable b;

    l(com.ijoysoft.a.a a1, Runnable runnable)
    {
        a = a1;
        b = runnable;
        super();
    }

    public final void a()
    {
        super.a();
        b.run();
    }

    public final void b()
    {
        super.b();
        com.ijoysoft.a.a.b(a);
    }
}
