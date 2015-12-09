// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.util.concurrent.Semaphore;

// Referenced classes of package com.android.slyce.a:
//            r

class u
    implements Runnable
{

    final Runnable a;
    final Semaphore b;
    final r c;

    u(r r, Runnable runnable, Semaphore semaphore)
    {
        c = r;
        a = runnable;
        b = semaphore;
        super();
    }

    public void run()
    {
        a.run();
        b.release();
    }
}
