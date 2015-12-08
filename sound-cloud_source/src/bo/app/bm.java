// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class bm extends ThreadPoolExecutor
{

    private static final TimeUnit a;

    public bm(ThreadFactory threadfactory)
    {
        super(1, 1, 0L, a, new LinkedBlockingQueue(), threadfactory);
    }

    static 
    {
        a = TimeUnit.MILLISECONDS;
    }
}
