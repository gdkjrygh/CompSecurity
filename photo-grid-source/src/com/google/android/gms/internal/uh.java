// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            tu, uj

abstract class uh
    implements Runnable
{

    final tu b;

    private uh(tu tu1)
    {
        b = tu1;
        super();
    }

    uh(tu tu1, byte byte0)
    {
        this(tu1);
    }

    protected abstract void a();

    public void run()
    {
        tu.b(b).lock();
        boolean flag = Thread.interrupted();
        if (flag)
        {
            tu.b(b).unlock();
            return;
        }
        a();
        tu.b(b).unlock();
        return;
        Object obj;
        obj;
        tu.c(b).a(((RuntimeException) (obj)));
        tu.b(b).unlock();
        return;
        obj;
        tu.b(b).unlock();
        throw obj;
    }
}
