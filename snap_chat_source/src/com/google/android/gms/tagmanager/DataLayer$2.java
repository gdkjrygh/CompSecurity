// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

class zzayl
    implements c.zza
{

    final DataLayer zzayl;

    public void zzq(List list)
    {
        a a;
        for (list = list.iterator(); list.hasNext(); DataLayer.zza(zzayl, zzayl.zzc(a.zzqd, a.zzzt)))
        {
            a = (a)list.next();
        }

        DataLayer.zza(zzayl).countDown();
    }

    a(DataLayer datalayer)
    {
        zzayl = datalayer;
        super();
    }
}
