// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            m, o

private abstract class <init>
    implements Runnable
{

    final m b;

    protected abstract void a();

    public void run()
    {
        m.b(b).lock();
        boolean flag = Thread.interrupted();
        if (flag)
        {
            m.b(b).unlock();
            return;
        }
        a();
        m.b(b).unlock();
        return;
        Object obj;
        obj;
        m.c(b).a(((RuntimeException) (obj)));
        m.b(b).unlock();
        return;
        obj;
        m.b(b).unlock();
        throw obj;
    }

    private (m m1)
    {
        b = m1;
        super();
    }

    b(m m1, byte byte0)
    {
        this(m1);
    }
}
