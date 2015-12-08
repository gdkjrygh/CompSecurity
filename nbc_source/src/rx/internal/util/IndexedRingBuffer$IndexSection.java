// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package rx.internal.util:
//            IndexedRingBuffer

private static class <init>
{

    private final AtomicReference _next;
    private final AtomicIntegerArray unsafeArray;

    public int getAndSet(int i, int j)
    {
        return unsafeArray.getAndSet(i, j);
    }

    etAndSet getNext()
    {
        if (_next.get() != null)
        {
            return (_next)_next.get();
        }
        etAndSet etandset = new <init>();
        if (_next.compareAndSet(null, etandset))
        {
            return etandset;
        } else
        {
            return (areAndSet)_next.get();
        }
    }

    public void set(int i, int j)
    {
        unsafeArray.set(i, j);
    }

    private ()
    {
        unsafeArray = new AtomicIntegerArray(IndexedRingBuffer.SIZE);
        _next = new AtomicReference();
    }

    t>(t> t>)
    {
        this();
    }
}
