// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class BackpressureUtils
{

    private BackpressureUtils()
    {
        throw new IllegalStateException("No instances!");
    }

    public static long getAndAddRequest(AtomicLong atomiclong, long l)
    {
        long l1;
        long l3;
        do
        {
            l3 = atomiclong.get();
            long l2 = l3 + l;
            l1 = l2;
            if (l2 < 0L)
            {
                l1 = 0x7fffffffffffffffL;
            }
        } while (!atomiclong.compareAndSet(l3, l1));
        return l3;
    }

    public static long getAndAddRequest(AtomicLongFieldUpdater atomiclongfieldupdater, Object obj, long l)
    {
        long l1;
        long l3;
        do
        {
            l3 = atomiclongfieldupdater.get(obj);
            long l2 = l3 + l;
            l1 = l2;
            if (l2 < 0L)
            {
                l1 = 0x7fffffffffffffffL;
            }
        } while (!atomiclongfieldupdater.compareAndSet(obj, l3, l1));
        return l3;
    }
}
