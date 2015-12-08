// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, n

private abstract class <init>
    implements Runnable
{

    final zzg b;

    protected abstract void a();

    public void run()
    {
        zzg.c(b).lock();
        boolean flag = Thread.interrupted();
        if (flag)
        {
            zzg.c(b).unlock();
            return;
        }
        a();
        zzg.c(b).unlock();
        return;
        Object obj;
        obj;
        zzg.d(b).a(((RuntimeException) (obj)));
        zzg.c(b).unlock();
        return;
        obj;
        zzg.c(b).unlock();
        throw obj;
    }

    private (zzg zzg1)
    {
        b = zzg1;
        super();
    }

    b(zzg zzg1, b b1)
    {
        this(zzg1);
    }
}
