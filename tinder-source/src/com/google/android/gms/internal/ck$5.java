// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            ck

static final class a
    implements ThreadFactory
{

    final String a;
    private final AtomicInteger b = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder("AdWorker(")).append(a).append(") #").append(b.getAndIncrement()).toString());
    }

    eger(String s)
    {
        a = s;
        super();
    }
}
