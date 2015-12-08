// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package rx.internal.util:
//            IndexedRingBuffer

class <init>
{

    private final AtomicReference _next;
    private final AtomicIntegerArray unsafeArray;

    public int getAndSet(int i, int j)
    {
        return unsafeArray.getAndSet(i, j);
    }

    etAndSet getNext()
    {
        etAndSet etandset;
        if (_next.get() != null)
        {
            etandset = (_next)_next.get();
        } else
        {
            etAndSet etandset1 = new <init>();
            etandset = etandset1;
            if (!_next.compareAndSet(null, etandset1))
            {
                return (areAndSet)_next.get();
            }
        }
        return etandset;
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
