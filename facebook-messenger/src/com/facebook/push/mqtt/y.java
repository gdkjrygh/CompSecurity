// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import java.util.concurrent.Semaphore;

// Referenced classes of package com.facebook.push.mqtt:
//            v

class y
    implements Runnable
{

    final Runnable a;
    final Semaphore b;
    final v c;

    y(v v, Runnable runnable, Semaphore semaphore)
    {
        c = v;
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
