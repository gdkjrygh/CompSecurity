// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            uj, uu

abstract class up
{

    private final uu a;

    protected up(uu uu)
    {
        a = uu;
    }

    protected abstract void a();

    public final void a(uj uj1)
    {
        uj.b(uj1).lock();
        uu uu;
        uu uu1;
        uu = uj.c(uj1);
        uu1 = a;
        if (uu != uu1)
        {
            uj.b(uj1).unlock();
            return;
        }
        a();
        uj.b(uj1).unlock();
        return;
        Exception exception;
        exception;
        uj.b(uj1).unlock();
        throw exception;
    }
}
