// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;


// Referenced classes of package okio:
//            SegmentPool

final class Segment
{

    final byte data[];
    int limit;
    Segment next;
    boolean owner;
    int pos;
    Segment prev;
    boolean shared;

    Segment()
    {
        data = new byte[2048];
        owner = true;
        shared = false;
    }

    Segment(Segment segment)
    {
        this(segment.data, segment.pos, segment.limit);
        segment.shared = true;
    }

    Segment(byte abyte0[], int i, int j)
    {
        data = abyte0;
        pos = i;
        limit = j;
        owner = false;
        shared = true;
    }

    public void compact()
    {
        if (prev == this)
        {
            throw new IllegalStateException();
        }
        if (prev.owner)
        {
            int j = limit - pos;
            int k = prev.limit;
            int i;
            if (prev.shared)
            {
                i = 0;
            } else
            {
                i = prev.pos;
            }
            if (j <= (2048 - k) + i)
            {
                writeTo(prev, j);
                pop();
                SegmentPool.recycle(this);
                return;
            }
        }
    }

    public Segment pop()
    {
        Segment segment;
        if (next != this)
        {
            segment = next;
        } else
        {
            segment = null;
        }
        prev.next = next;
        next.prev = prev;
        next = null;
        prev = null;
        return segment;
    }

    public Segment push(Segment segment)
    {
        segment.prev = this;
        segment.next = next;
        next.prev = segment;
        next = segment;
        return segment;
    }

    public Segment split(int i)
    {
        if (i <= 0 || i > limit - pos)
        {
            throw new IllegalArgumentException();
        } else
        {
            Segment segment = new Segment(this);
            segment.limit = segment.pos + i;
            pos = pos + i;
            prev.push(segment);
            return segment;
        }
    }

    public void writeTo(Segment segment, int i)
    {
        if (!segment.owner)
        {
            throw new IllegalArgumentException();
        }
        if (segment.limit + i > 2048)
        {
            if (segment.shared)
            {
                throw new IllegalArgumentException();
            }
            if ((segment.limit + i) - segment.pos > 2048)
            {
                throw new IllegalArgumentException();
            }
            System.arraycopy(segment.data, segment.pos, segment.data, 0, segment.limit - segment.pos);
            segment.limit = segment.limit - segment.pos;
            segment.pos = 0;
        }
        System.arraycopy(data, pos, segment.data, segment.limit, i);
        segment.limit = segment.limit + i;
        pos = pos + i;
    }
}
