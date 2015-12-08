// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.c;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.bumptech.glide.load.b.c:
//            c

public final class b
    implements ThreadFactory
{

    int a;

    public b()
    {
        a = 0;
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = new c(this, runnable, (new StringBuilder("fifo-pool-thread-")).append(a).toString());
        a = a + 1;
        return runnable;
    }
}
