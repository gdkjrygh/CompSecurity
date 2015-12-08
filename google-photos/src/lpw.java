// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class lpw
    implements lqa
{

    private lpu a;

    lpw(lpu lpu1)
    {
        a = lpu1;
        super();
    }

    public final void a(List list)
    {
        lpx lpx1;
        for (list = list.iterator(); list.hasNext(); lpu.a(a, lpu.a(lpx1.a, lpx1.b)))
        {
            lpx1 = (lpx)list.next();
        }

        lpu.a(a).countDown();
    }
}
