// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;


// Referenced classes of package okio:
//            Segment

final class SegmentPool
{

    static final long MAX_SIZE = 0x10000L;
    static long byteCount;
    static Segment next;

    private SegmentPool()
    {
    }

    static void recycle(Segment segment)
    {
        if (segment.next != null || segment.prev != null)
        {
            throw new IllegalArgumentException();
        }
        if (segment.shared)
        {
            return;
        }
        okio/SegmentPool;
        JVM INSTR monitorenter ;
        if (byteCount + 2048L <= 0x10000L)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        okio/SegmentPool;
        JVM INSTR monitorexit ;
        return;
        segment;
        okio/SegmentPool;
        JVM INSTR monitorexit ;
        throw segment;
        byteCount += 2048L;
        segment.next = next;
        segment.limit = 0;
        segment.pos = 0;
        next = segment;
        okio/SegmentPool;
        JVM INSTR monitorexit ;
    }

    static Segment take()
    {
        okio/SegmentPool;
        JVM INSTR monitorenter ;
        Segment segment;
        if (next == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        segment = next;
        next = segment.next;
        segment.next = null;
        byteCount -= 2048L;
        okio/SegmentPool;
        JVM INSTR monitorexit ;
        return segment;
        okio/SegmentPool;
        JVM INSTR monitorexit ;
        return new Segment();
        Exception exception;
        exception;
        okio/SegmentPool;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
