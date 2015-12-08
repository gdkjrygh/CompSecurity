// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzhk

static final class zzGj
    implements ThreadFactory
{

    private final AtomicInteger zzGi = new AtomicInteger(1);
    final String zzGj;

    public Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder()).append("AdWorker(").append(zzGj).append(") #").append(zzGi.getAndIncrement()).toString());
    }

    er(String s)
    {
        zzGj = s;
        super();
    }
}
