// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

class afg
    implements a
{

    final DataLayer afg;

    public void d(List list)
    {
        a a;
        for (list = list.iterator(); list.hasNext(); DataLayer.a(afg, afg.c(a.JL, a.afh)))
        {
            a = (afh)list.next();
        }

        DataLayer.a(afg).countDown();
    }

    a(DataLayer datalayer)
    {
        afg = datalayer;
        super();
    }
}
