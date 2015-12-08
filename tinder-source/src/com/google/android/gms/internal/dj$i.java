// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            dj, dl

private abstract class <init>
    implements Runnable
{

    final dj b;

    protected abstract void a();

    public void run()
    {
        b.b.lock();
        boolean flag = Thread.interrupted();
        if (flag)
        {
            b.b.unlock();
            return;
        }
        a();
        b.b.unlock();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        dl dl1 = b.a;
        android.os.Message message = dl1.j.obtainMessage(4, runtimeexception);
        dl1.j.sendMessage(message);
        b.b.unlock();
        return;
        Exception exception;
        exception;
        b.b.unlock();
        throw exception;
    }

    private (dj dj1)
    {
        b = dj1;
        super();
    }

    b(dj dj1, byte byte0)
    {
        this(dj1);
    }
}
