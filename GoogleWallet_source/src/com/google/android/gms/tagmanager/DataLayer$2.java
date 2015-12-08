// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

final class aNn
    implements a
{

    final DataLayer aNn;

    public final void k(List list)
    {
        a a;
        DataLayer datalayer;
        for (list = list.iterator(); list.hasNext(); DataLayer.a(datalayer, DataLayer.e(a.TN, a.wE)))
        {
            a = (wE)list.next();
            datalayer = aNn;
            DataLayer datalayer1 = aNn;
        }

        DataLayer.a(aNn).countDown();
    }

    a(DataLayer datalayer)
    {
        aNn = datalayer;
        super();
    }
}
