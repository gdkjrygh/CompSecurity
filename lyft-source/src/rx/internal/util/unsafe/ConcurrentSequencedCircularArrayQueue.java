// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            ConcurrentCircularArrayQueue, UnsafeAccess

public abstract class ConcurrentSequencedCircularArrayQueue extends ConcurrentCircularArrayQueue
{

    private static final long ARRAY_BASE;
    private static final int ELEMENT_SHIFT;
    protected final long sequenceBuffer[];

    public ConcurrentSequencedCircularArrayQueue(int i)
    {
        super(i);
        i = (int)(mask + 1L);
        sequenceBuffer = new long[(i << SPARSE_SHIFT) + 64];
        for (long l = 0L; l < (long)i; l++)
        {
            soSequence(sequenceBuffer, calcSequenceOffset(l), l);
        }

    }

    protected final long calcSequenceOffset(long l)
    {
        return ARRAY_BASE + ((mask & l) << ELEMENT_SHIFT);
    }

    protected final long lvSequence(long al[], long l)
    {
        return UnsafeAccess.UNSAFE.getLongVolatile(al, l);
    }

    protected final void soSequence(long al[], long l, long l1)
    {
        UnsafeAccess.UNSAFE.putOrderedLong(al, l, l1);
    }

    static 
    {
        if (8 == UnsafeAccess.UNSAFE.arrayIndexScale([J))
        {
            ELEMENT_SHIFT = SPARSE_SHIFT + 3;
            ARRAY_BASE = UnsafeAccess.UNSAFE.arrayBaseOffset([J) + (32 << ELEMENT_SHIFT - SPARSE_SHIFT);
            return;
        } else
        {
            throw new IllegalStateException("Unexpected long[] element size");
        }
    }
}
