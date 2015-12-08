// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.c:
//            k

final class j
    implements ThreadFactory
{

    private static final AtomicInteger a = new AtomicInteger();

    private j()
    {
    }

    j(byte byte0)
    {
        this();
    }

    public final Thread newThread(Runnable runnable)
    {
        return new k(runnable, (new StringBuilder("measurement-")).append(a.incrementAndGet()).toString());
    }

}
