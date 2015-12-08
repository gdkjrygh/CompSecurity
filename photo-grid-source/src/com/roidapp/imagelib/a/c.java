// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import java.util.concurrent.Semaphore;

// Referenced classes of package com.roidapp.imagelib.a:
//            a

final class c
    implements Runnable
{

    final Semaphore a;
    final a b;

    c(a a1, Semaphore semaphore)
    {
        b = a1;
        a = semaphore;
        super();
    }

    public final void run()
    {
        a.release();
    }
}
