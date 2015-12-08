// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

class Xx
    implements a
{

    final DataLayer Xx;

    public void a(List list)
    {
        a a1;
        for (list = list.iterator(); list.hasNext(); DataLayer.a(Xx, Xx.c(a1.Xy, a1.Xz)))
        {
            a1 = (Xz)list.next();
        }

        DataLayer.a(Xx).countDown();
    }

    a(DataLayer datalayer)
    {
        Xx = datalayer;
        super();
    }
}
