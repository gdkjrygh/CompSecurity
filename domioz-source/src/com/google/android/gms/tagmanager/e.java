// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            i, f, c

final class e
    implements i
{

    final c a;

    e(c c1)
    {
        a = c1;
        super();
    }

    public final void a(List list)
    {
        f f1;
        for (list = list.iterator(); list.hasNext(); c.a(a, c.a(f1.a, f1.b)))
        {
            f1 = (f)list.next();
        }

        c.a(a).countDown();
    }
}
