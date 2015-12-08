// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ao extends ThreadPoolExecutor
{

    private static final String a;
    private static final TimeUnit b;

    public ao(ThreadFactory threadfactory)
    {
        super(1, 1, 0L, b, new LinkedBlockingQueue(), threadfactory);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/ao.getName()
        });
        b = TimeUnit.MILLISECONDS;
    }
}
