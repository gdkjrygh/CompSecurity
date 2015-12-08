// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

class aqY
    implements a
{

    final DataLayer aqY;

    public void h(List list)
    {
        a a;
        for (list = list.iterator(); list.hasNext(); DataLayer.a(aqY, aqY.c(a.KP, a.wF)))
        {
            a = (wF)list.next();
        }

        DataLayer.a(aqY).countDown();
    }

    a(DataLayer datalayer)
    {
        aqY = datalayer;
        super();
    }
}
