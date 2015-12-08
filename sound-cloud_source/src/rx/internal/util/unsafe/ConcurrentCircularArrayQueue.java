// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import java.util.Iterator;
import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            ConcurrentCircularArrayQueueL0Pad, UnsafeAccess, Pow2

public abstract class ConcurrentCircularArrayQueue extends ConcurrentCircularArrayQueueL0Pad
{

    protected static final int BUFFER_PAD = 32;
    private static final long REF_ARRAY_BASE;
    private static final int REF_ELEMENT_SHIFT;
    protected static final int SPARSE_SHIFT;
    protected final Object buffer[];
    protected final long mask;

    public ConcurrentCircularArrayQueue(int i)
    {
        i = Pow2.roundToPowerOfTwo(i);
        mask = i - 1;
        buffer = (Object[])new Object[(i << SPARSE_SHIFT) + 64];
    }

    protected final long calcElementOffset(long l)
    {
        return calcElementOffset(l, mask);
    }

    protected final long calcElementOffset(long l, long l1)
    {
        return REF_ARRAY_BASE + ((l & l1) << REF_ELEMENT_SHIFT);
    }

    public void clear()
    {
        while (poll() != null || !isEmpty()) ;
    }

    public Iterator iterator()
    {
        throw new UnsupportedOperationException();
    }

    protected final Object lpElement(long l)
    {
        return lpElement(buffer, l);
    }

    protected final Object lpElement(Object aobj[], long l)
    {
        return UnsafeAccess.UNSAFE.getObject(((Object) (aobj)), l);
    }

    protected final Object lvElement(long l)
    {
        return lvElement(buffer, l);
    }

    protected final Object lvElement(Object aobj[], long l)
    {
        return UnsafeAccess.UNSAFE.getObjectVolatile(((Object) (aobj)), l);
    }

    protected final void soElement(long l, Object obj)
    {
        soElement(buffer, l, obj);
    }

    protected final void soElement(Object aobj[], long l, Object obj)
    {
        UnsafeAccess.UNSAFE.putOrderedObject(((Object) (aobj)), l, obj);
    }

    protected final void spElement(long l, Object obj)
    {
        spElement(buffer, l, obj);
    }

    protected final void spElement(Object aobj[], long l, Object obj)
    {
        UnsafeAccess.UNSAFE.putObject(((Object) (aobj)), l, obj);
    }

    static 
    {
        SPARSE_SHIFT = Integer.getInteger("sparse.shift", 0).intValue();
        int i = UnsafeAccess.UNSAFE.arrayIndexScale([Ljava/lang/Object;);
        if (4 == i)
        {
            REF_ELEMENT_SHIFT = SPARSE_SHIFT + 2;
        } else
        if (8 == i)
        {
            REF_ELEMENT_SHIFT = SPARSE_SHIFT + 3;
        } else
        {
            throw new IllegalStateException("Unknown pointer size");
        }
        REF_ARRAY_BASE = UnsafeAccess.UNSAFE.arrayBaseOffset([Ljava/lang/Object;) + (32 << REF_ELEMENT_SHIFT - SPARSE_SHIFT);
    }
}
