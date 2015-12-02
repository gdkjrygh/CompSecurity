// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.f;

import android.content.Context;
import android.os.StatFs;
import com.google.common.base.Stopwatch;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.facebook.common.f:
//            g

public class f
{

    private final StatFs a;
    private final String b;
    private final StatFs c;
    private final String d;
    private final Stopwatch e = new Stopwatch();
    private final Lock f = new ReentrantLock();

    public f(Context context)
    {
        b = context.getCacheDir().getAbsolutePath();
        a = new StatFs(b);
        if (context.getExternalCacheDir() != null)
        {
            d = context.getExternalCacheDir().getAbsolutePath();
            c = new StatFs(d);
        } else
        {
            d = null;
            c = null;
        }
        e.reset().start();
    }

    private void a()
    {
        if (!f.tryLock())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (e.elapsedMillis() > 0x927c0L)
        {
            b();
        }
        f.unlock();
        return;
        Exception exception;
        exception;
        f.unlock();
        throw exception;
    }

    private void b()
    {
        a.restat(b);
        if (d != null)
        {
            c.restat(d);
        }
        e.reset().start();
    }

    public long a(g g1)
    {
        a();
        if (g1 == g.INTERNAL)
        {
            g1 = a;
        } else
        {
            g1 = c;
        }
        if (g1 != null)
        {
            return (long)g1.getBlockSize() * (long)g1.getAvailableBlocks();
        } else
        {
            return 0L;
        }
    }

    public boolean a(g g1, long l)
    {
        long l1 = a(g1);
        return l1 <= 0L || l1 < l;
    }
}
