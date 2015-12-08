// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.os.Handler;

// Referenced classes of package com.fitbit.bluetooth:
//            f

static final class a
    implements Runnable
{

    final Handler a;

    public void run()
    {
        synchronized (f.b())
        {
            if (f.c() == a)
            {
                f.d();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Handler handler)
    {
        a = handler;
        super();
    }
}
