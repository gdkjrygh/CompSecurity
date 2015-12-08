// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.d:
//            ai, ae

class ah
    implements ThreadFactory
{

    private static final AtomicInteger a = new AtomicInteger();

    private ah()
    {
    }

    ah(ae ae)
    {
        this();
    }

    public Thread newThread(Runnable runnable)
    {
        return new ai(runnable, (new StringBuilder()).append("measurement-").append(a.incrementAndGet()).toString());
    }

}
