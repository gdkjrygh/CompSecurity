// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DefaultMp4SampleList extends AbstractList
{

    private static final long MAX_MAP_SIZE = 0x10000000L;
    ByteBuffer cache[][];
    int chunkNumsStartSampleNum[];
    long chunkOffsets[];
    long chunkSizes[];
    int lastChunk;
    long sampleOffsetsWithinChunks[][];
    SampleSizeBox ssb;
    Container topLevel;
    TrackBox trackBox;

    public DefaultMp4SampleList(long l, Container container)
    {
        trackBox = null;
        cache = null;
        lastChunk = 0;
        topLevel = container;
        container = ((MovieBox)container.getBoxes(com/coremedia/iso/boxes/MovieBox).get(0)).getBoxes(com/coremedia/iso/boxes/TrackBox).iterator();
        do
        {
            if (!container.hasNext())
            {
                if (trackBox == null)
                {
                    throw new RuntimeException((new StringBuilder("This MP4 does not contain track ")).append(l).toString());
                }
                break;
            }
            TrackBox trackbox = (TrackBox)container.next();
            if (trackbox.getTrackHeaderBox().getTrackId() == l)
            {
                trackBox = trackbox;
            }
        } while (true);
        chunkOffsets = trackBox.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
        chunkSizes = new long[chunkOffsets.length];
        cache = new ByteBuffer[chunkOffsets.length][];
        sampleOffsetsWithinChunks = new long[chunkOffsets.length][];
        ssb = trackBox.getSampleTableBox().getSampleSizeBox();
        container = trackBox.getSampleTableBox().getSampleToChunkBox().getEntries();
        container = (com.coremedia.iso.boxes.SampleToChunkBox.Entry[])container.toArray(new com.coremedia.iso.boxes.SampleToChunkBox.Entry[container.size()]);
        com.coremedia.iso.boxes.SampleToChunkBox.Entry entry = container[0];
        l = entry.getFirstChunk();
        int i = CastUtils.l2i(entry.getSamplesPerChunk());
        int j3 = size();
        int k = 0;
        int k2 = 0;
        int j = 1;
        int i1 = 1;
        do
        {
            k2++;
            int i2;
            if ((long)k2 == l)
            {
                if (container.length > j)
                {
                    k = j + 1;
                    com.coremedia.iso.boxes.SampleToChunkBox.Entry entry1 = container[j];
                    j = CastUtils.l2i(entry1.getSamplesPerChunk());
                    l = entry1.getFirstChunk();
                } else
                {
                    k1 = -1;
                    l = 0x7fffffffffffffffL;
                    k = j;
                    j = k1;
                }
            } else
            {
                int j2 = j;
                j = i;
                i = k;
                k = j2;
            }
            sampleOffsetsWithinChunks[k2 - 1] = new long[i];
            i1 += i;
            if (i1 > j3)
            {
                chunkNumsStartSampleNum = new int[k2 + 1];
                com.coremedia.iso.boxes.SampleToChunkBox.Entry entry2 = container[0];
                int k1 = 0;
                k = 0;
                l = entry2.getFirstChunk();
                i = CastUtils.l2i(entry2.getSamplesPerChunk());
                int j1 = 1;
                j = 1;
                do
                {
                    int ai[] = chunkNumsStartSampleNum;
                    int i3 = k1 + 1;
                    ai[k1] = j1;
                    int l2;
                    if ((long)i3 == l)
                    {
                        if (container.length > j)
                        {
                            k1 = j + 1;
                            com.coremedia.iso.boxes.SampleToChunkBox.Entry entry3 = container[j];
                            j = CastUtils.l2i(entry3.getSamplesPerChunk());
                            l = entry3.getFirstChunk();
                            k = i;
                            i = k1;
                        } else
                        {
                            l = 0x7fffffffffffffffL;
                            k1 = j;
                            j = -1;
                            k = i;
                            i = k1;
                        }
                    } else
                    {
                        int l1 = j;
                        j = i;
                        i = l1;
                    }
                    j1 += k;
                    if (j1 > j3)
                    {
                        chunkNumsStartSampleNum[i3] = 0x7fffffff;
                        k = 0;
                        l = 0L;
                        i = 1;
                        do
                        {
                            if ((long)i > ssb.getSampleCount())
                            {
                                return;
                            }
                            j = k;
                            if (i == chunkNumsStartSampleNum[k])
                            {
                                j = k + 1;
                                l = 0L;
                            }
                            container = chunkSizes;
                            k = j - 1;
                            container[k] = container[k] + ssb.getSampleSizeAtIndex(i - 1);
                            sampleOffsetsWithinChunks[j - 1][i - chunkNumsStartSampleNum[j - 1]] = l;
                            l += ssb.getSampleSizeAtIndex(i - 1);
                            i++;
                            k = j;
                        } while (true);
                    }
                    l2 = i;
                    k1 = i3;
                    i = j;
                    j = l2;
                } while (true);
            }
            i2 = k;
            k = i;
            i = j;
            j = i2;
        } while (true);
    }

    public Sample get(int i)
    {
        Object obj;
        ByteBuffer abytebuffer[];
        long al[];
        int k;
        int l;
        long l3;
        long l4;
        if ((long)i >= ssb.getSampleCount())
        {
            throw new IndexOutOfBoundsException();
        }
        k = getChunkForSample(i);
        l = chunkNumsStartSampleNum[k] - 1;
        l4 = chunkOffsets[CastUtils.l2i(k)];
        al = sampleOffsetsWithinChunks[CastUtils.l2i(k)];
        l3 = al[i - l];
        abytebuffer = cache[CastUtils.l2i(k)];
        obj = abytebuffer;
        if (abytebuffer != null) goto _L2; else goto _L1
_L1:
        int j;
        long l1;
        obj = new ArrayList();
        l1 = 0L;
        j = 0;
_L7:
        if (j < al.length) goto _L4; else goto _L3
_L3:
        ((List) (obj)).add(topLevel.getByteBuffer(l4 + l1, -l1 + al[al.length - 1] + ssb.getSampleSizeAtIndex((l + al.length) - 1)));
        obj = (ByteBuffer[])((List) (obj)).toArray(new ByteBuffer[((List) (obj)).size()]);
        cache[CastUtils.l2i(k)] = ((ByteBuffer []) (obj));
_L2:
        k = obj.length;
        j = 0;
        l1 = l3;
_L10:
        if (j < k) goto _L6; else goto _L5
_L5:
        ByteBuffer bytebuffer = null;
_L9:
        return new _cls1();
_L4:
label0:
        {
            long l2 = l1;
            try
            {
                if ((al[j] + ssb.getSampleSizeAtIndex(j + l)) - l1 <= 0x10000000L)
                {
                    break label0;
                }
                ((List) (obj)).add(topLevel.getByteBuffer(l4 + l1, al[j] - l1));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IndexOutOfBoundsException(((IOException) (obj)).getMessage());
            }
            l2 = al[j];
        }
        j++;
        l1 = l2;
          goto _L7
_L6:
        ByteBuffer bytebuffer1;
        bytebuffer1 = obj[j];
        bytebuffer = bytebuffer1;
        if (l1 < (long)bytebuffer1.limit()) goto _L9; else goto _L8
_L8:
        l1 -= bytebuffer1.limit();
        j++;
          goto _L10
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    int getChunkForSample(int i)
    {
        this;
        JVM INSTR monitorenter ;
        i++;
        if (i < chunkNumsStartSampleNum[lastChunk] || i >= chunkNumsStartSampleNum[lastChunk + 1]) goto _L2; else goto _L1
_L1:
        i = lastChunk;
_L3:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        if (i >= chunkNumsStartSampleNum[lastChunk])
        {
            break MISSING_BLOCK_LABEL_102;
        }
        lastChunk = 0;
_L4:
        if (chunkNumsStartSampleNum[lastChunk + 1] <= i)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        i = lastChunk;
          goto _L3
        lastChunk = lastChunk + 1;
          goto _L4
        Exception exception;
        exception;
        throw exception;
        lastChunk = lastChunk + 1;
_L5:
        if (chunkNumsStartSampleNum[lastChunk + 1] <= i)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        i = lastChunk;
          goto _L3
        lastChunk = lastChunk + 1;
          goto _L5
    }

    public int size()
    {
        return CastUtils.l2i(trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }

    private class _cls1
        implements Sample
    {

        final DefaultMp4SampleList this$0;
        private final ByteBuffer val$finalCorrectPartOfChunk;
        private final long val$finalOffsetWithInChunk;
        private final long val$sampleSize;

        public ByteBuffer asByteBuffer()
        {
            return (ByteBuffer)((ByteBuffer)finalCorrectPartOfChunk.position(CastUtils.l2i(finalOffsetWithInChunk))).slice().limit(CastUtils.l2i(sampleSize));
        }

        public long getSize()
        {
            return sampleSize;
        }

        public String toString()
        {
            return (new StringBuilder("DefaultMp4Sample(size:")).append(sampleSize).append(")").toString();
        }

        public void writeTo(WritableByteChannel writablebytechannel)
        {
            writablebytechannel.write(asByteBuffer());
        }

        _cls1()
        {
            this$0 = DefaultMp4SampleList.this;
            sampleSize = l;
            finalCorrectPartOfChunk = bytebuffer;
            finalOffsetWithInChunk = l1;
            super();
        }
    }

}
