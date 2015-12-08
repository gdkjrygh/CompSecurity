// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import rx.R;
import rx.f.i;
import rx.internal.util.unsafe.MpmcArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

// Referenced classes of package rx.internal.util:
//            d

public abstract class c
{

    Queue a;
    private final int b;
    private rx.R.a c;

    public c()
    {
        this((byte)0);
    }

    private c(byte byte0)
    {
        b = 0;
        if (UnsafeAccess.isUnsafeAvailable())
        {
            a = new MpmcArrayQueue(Math.max(b, 1024));
        } else
        {
            a = new ConcurrentLinkedQueue();
        }
        c = i.c().a();
        c.a(new d(this), 67L, 67L, TimeUnit.SECONDS);
    }

    public final Object a()
    {
        Object obj1 = a.poll();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = b();
        }
        return obj;
    }

    protected abstract Object b();
}
