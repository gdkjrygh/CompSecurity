// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            ky

final class kx
    implements ThreadFactory
{

    private static final AtomicInteger a = new AtomicInteger();

    private kx()
    {
    }

    kx(byte byte0)
    {
        this();
    }

    public final Thread newThread(Runnable runnable)
    {
        return new ky(runnable, (new StringBuilder("measurement-")).append(a.incrementAndGet()).toString());
    }

}
