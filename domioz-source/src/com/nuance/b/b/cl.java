// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.c;
import com.nuance.b.b.a.e;

// Referenced classes of package com.nuance.b.b:
//            ci

final class cl
    implements Runnable
{

    final e a;
    final c b;
    final ci c;

    cl(ci ci, e e1, c c1)
    {
        c = ci;
        a = e1;
        b = c1;
        super();
    }

    public final void run()
    {
        a.onConnectError(b);
    }
}
