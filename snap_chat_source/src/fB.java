// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fB extends AbstractList
{

    private Container a;
    private TrackBox b;
    private ByteBuffer c[][];
    private int d[];
    private long e[];
    private long f[];
    private long g[][];
    private SampleSizeBox h;
    private int i;

    public fB(long l, Container container)
    {
        b = null;
        c = null;
        i = 0;
        a = container;
        container = ((MovieBox)container.getBoxes(com/coremedia/iso/boxes/MovieBox).get(0)).getBoxes(com/coremedia/iso/boxes/TrackBox).iterator();
        do
        {
            if (!container.hasNext())
            {
                if (b == null)
                {
                    throw new RuntimeException((new StringBuilder("This MP4 does not contain track ")).append(l).toString());
                }
                break;
            }
            TrackBox trackbox = (TrackBox)container.next();
            if (trackbox.getTrackHeaderBox().getTrackId() == l)
            {
                b = trackbox;
            }
        } while (true);
        e = b.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
        f = new long[e.length];
        c = new ByteBuffer[e.length][];
        g = new long[e.length][];
        h = b.getSampleTableBox().getSampleSizeBox();
        container = b.getSampleTableBox().getSampleToChunkBox().getEntries();
        container = (com.coremedia.iso.boxes.SampleToChunkBox.Entry[])container.toArray(new com.coremedia.iso.boxes.SampleToChunkBox.Entry[container.size()]);
        com.coremedia.iso.boxes.SampleToChunkBox.Entry entry = container[0];
        l = entry.getFirstChunk();
        int j = fF.a(entry.getSamplesPerChunk());
        int k3 = size();
        int i1 = 0;
        int l2 = 0;
        int k = 1;
        int j1 = 1;
        do
        {
            l2++;
            int j2;
            if ((long)l2 == l)
            {
                if (container.length > k)
                {
                    i1 = k + 1;
                    com.coremedia.iso.boxes.SampleToChunkBox.Entry entry1 = container[k];
                    k = fF.a(entry1.getSamplesPerChunk());
                    l = entry1.getFirstChunk();
                } else
                {
                    l1 = -1;
                    l = 0x7fffffffffffffffL;
                    i1 = k;
                    k = l1;
                }
            } else
            {
                int k2 = k;
                k = j;
                j = i1;
                i1 = k2;
            }
            g[l2 - 1] = new long[j];
            j1 += j;
            if (j1 > k3)
            {
                d = new int[l2 + 1];
                com.coremedia.iso.boxes.SampleToChunkBox.Entry entry2 = container[0];
                int l1 = 0;
                i1 = 0;
                l = entry2.getFirstChunk();
                j = fF.a(entry2.getSamplesPerChunk());
                int k1 = 1;
                k = 1;
                do
                {
                    int ai[] = d;
                    int j3 = l1 + 1;
                    ai[l1] = k1;
                    int i3;
                    if ((long)j3 == l)
                    {
                        if (container.length > k)
                        {
                            l1 = k + 1;
                            com.coremedia.iso.boxes.SampleToChunkBox.Entry entry3 = container[k];
                            k = fF.a(entry3.getSamplesPerChunk());
                            l = entry3.getFirstChunk();
                            i1 = j;
                            j = l1;
                        } else
                        {
                            l = 0x7fffffffffffffffL;
                            l1 = k;
                            k = -1;
                            i1 = j;
                            j = l1;
                        }
                    } else
                    {
                        int i2 = k;
                        k = j;
                        j = i2;
                    }
                    k1 += i1;
                    if (k1 > k3)
                    {
                        d[j3] = 0x7fffffff;
                        i1 = 0;
                        l = 0L;
                        j = 1;
                        do
                        {
                            if ((long)j > h.getSampleCount())
                            {
                                return;
                            }
                            k = i1;
                            if (j == d[i1])
                            {
                                k = i1 + 1;
                                l = 0L;
                            }
                            container = f;
                            i1 = k - 1;
                            container[i1] = container[i1] + h.getSampleSizeAtIndex(j - 1);
                            g[k - 1][j - d[k - 1]] = l;
                            l += h.getSampleSizeAtIndex(j - 1);
                            j++;
                            i1 = k;
                        } while (true);
                    }
                    i3 = j;
                    l1 = j3;
                    j = k;
                    k = i3;
                } while (true);
            }
            j2 = i1;
            i1 = j;
            j = k;
            k = j2;
        } while (true);
    }

    private int a(int j)
    {
        this;
        JVM INSTR monitorenter ;
        j++;
        if (j < d[i] || j >= d[i + 1]) goto _L2; else goto _L1
_L1:
        j = i;
_L3:
        this;
        JVM INSTR monitorexit ;
        return j;
_L2:
        if (j >= d[i])
        {
            break MISSING_BLOCK_LABEL_102;
        }
        i = 0;
_L4:
        if (d[i + 1] <= j)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        j = i;
          goto _L3
        i = i + 1;
          goto _L4
        Exception exception;
        exception;
        throw exception;
        i = i + 1;
_L5:
        if (d[i + 1] <= j)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        j = i;
          goto _L3
        i = i + 1;
          goto _L5
    }

    private fA b(int j)
    {
        Object obj;
        ByteBuffer abytebuffer[];
        long al[];
        int l;
        int i1;
        long l3;
        long l4;
        if ((long)j >= h.getSampleCount())
        {
            throw new IndexOutOfBoundsException();
        }
        l = a(j);
        i1 = d[l] - 1;
        l4 = e[fF.a(l)];
        al = g[fF.a(l)];
        l3 = al[j - i1];
        abytebuffer = c[fF.a(l)];
        obj = abytebuffer;
        if (abytebuffer != null) goto _L2; else goto _L1
_L1:
        int k;
        long l1;
        obj = new ArrayList();
        l1 = 0L;
        k = 0;
_L7:
        if (k < al.length) goto _L4; else goto _L3
_L3:
        ((List) (obj)).add(a.getByteBuffer(l4 + l1, -l1 + al[al.length - 1] + h.getSampleSizeAtIndex((i1 + al.length) - 1)));
        obj = (ByteBuffer[])((List) (obj)).toArray(new ByteBuffer[((List) (obj)).size()]);
        c[fF.a(l)] = ((ByteBuffer []) (obj));
_L2:
        l = obj.length;
        k = 0;
        l1 = l3;
_L9:
        if (k < l) goto _L6; else goto _L5
_L5:
        return new fA(h.getSampleSizeAtIndex(j)) {

            private final long a;

            public final String toString()
            {
                return (new StringBuilder("DefaultMp4Sample(size:")).append(a).append(")").toString();
            }

            
            {
                a = l;
                super();
            }
        };
_L4:
        ByteBuffer bytebuffer;
label0:
        {
            long l2 = l1;
            try
            {
                if ((al[k] + h.getSampleSizeAtIndex(k + i1)) - l1 <= 0x10000000L)
                {
                    break label0;
                }
                ((List) (obj)).add(a.getByteBuffer(l4 + l1, al[k] - l1));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IndexOutOfBoundsException(((IOException) (obj)).getMessage());
            }
            l2 = al[k];
        }
        k++;
        l1 = l2;
          goto _L7
_L6:
        if (l1 < (long)(bytebuffer = obj[k]).limit()) goto _L5; else goto _L8
_L8:
        l1 -= bytebuffer.limit();
        k++;
          goto _L9
    }

    public final Object get(int j)
    {
        return b(j);
    }

    public final int size()
    {
        return fF.a(b.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }
}
