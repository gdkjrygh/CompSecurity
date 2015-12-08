// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            h, e, b

final class d
    implements h
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public final void a(List list)
    {
        e e1;
        b b1;
        for (list = list.iterator(); list.hasNext(); b.a(b1, b.a(e1.a, e1.b)))
        {
            e1 = (e)list.next();
            b1 = a;
            b b2 = a;
        }

        b.a(a).countDown();
    }
}
