// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            dl, dm

static abstract class a
{

    private final dm a;

    protected abstract void a();

    public final void a(dl dl1)
    {
        dl.b(dl1).lock();
        dm dm;
        dm dm1;
        dm = dl.c(dl1);
        dm1 = a;
        if (dm != dm1)
        {
            dl.b(dl1).unlock();
            return;
        }
        a();
        dl.b(dl1).unlock();
        return;
        Exception exception;
        exception;
        dl.b(dl1).unlock();
        throw exception;
    }

    protected (dm dm)
    {
        a = dm;
    }
}
