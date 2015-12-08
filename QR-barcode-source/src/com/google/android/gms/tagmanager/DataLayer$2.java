// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

class aoO
    implements a
{

    final DataLayer aoO;

    public void g(List list)
    {
        a a;
        for (list = list.iterator(); list.hasNext(); DataLayer.a(aoO, aoO.c(a.JO, a.wq)))
        {
            a = (wq)list.next();
        }

        DataLayer.a(aoO).countDown();
    }

    a(DataLayer datalayer)
    {
        aoO = datalayer;
        super();
    }
}
