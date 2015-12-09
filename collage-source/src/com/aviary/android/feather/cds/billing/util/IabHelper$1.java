// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.billing.util;

import com.aviary.android.feather.common.utils.i;

// Referenced classes of package com.aviary.android.feather.cds.billing.util:
//            d

class a
    implements Runnable
{

    final d a;

    public void run()
    {
        synchronized (d.a(a))
        {
            if (a.h != null)
            {
                String as[] = i.b(a.h);
                a.m = as[2];
            }
            a.c("releasing mSignatureLock");
            d.a(a).notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (d d1)
    {
        a = d1;
        super();
    }
}
