// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            c

final class a
    implements a
{

    final c a;

    public final void a(List list)
    {
        a a1;
        for (list = list.iterator(); list.hasNext(); c.a(a, c.a(a1.a, a1.b)))
        {
            a1 = (b)list.next();
        }

        c.a(a).countDown();
    }

    a(c c1)
    {
        a = c1;
        super();
    }
}
