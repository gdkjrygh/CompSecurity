// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

class zzaLn
    implements c.zza
{

    final DataLayer zzaLn;

    public void zzo(List list)
    {
        a a;
        for (list = list.iterator(); list.hasNext(); DataLayer.zza(zzaLn, zzaLn.zzj(a.zztw, a.zzGK)))
        {
            a = (a)list.next();
        }

        DataLayer.zza(zzaLn).countDown();
    }

    a(DataLayer datalayer)
    {
        zzaLn = datalayer;
        super();
    }
}
