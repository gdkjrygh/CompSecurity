// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            FragmentedMp4Builder

class size_
    implements Box
{

    Container parent;
    long size_;
    final FragmentedMp4Builder this$0;
    private final long val$endSample;
    private final int val$i;
    private final long val$startSample;
    private final Track val$track;

    public void getBox(WritableByteChannel writablebytechannel)
    {
        Object obj = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), CastUtils.l2i(getSize()));
        ((ByteBuffer) (obj)).put(IsoFile.fourCCtoBytes(getType()));
        ((ByteBuffer) (obj)).rewind();
        writablebytechannel.write(((ByteBuffer) (obj)));
        obj = getSamples(val$startSample, val$endSample, val$track, val$i).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                return;
            }
            ((Sample)((Iterator) (obj)).next()).writeTo(writablebytechannel);
        } while (true);
    }

    public long getOffset()
    {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }

    public Container getParent()
    {
        return parent;
    }

    public long getSize()
    {
        if (size_ != -1L)
        {
            return size_;
        }
        Iterator iterator = getSamples(val$startSample, val$endSample, val$track, val$i).iterator();
        long l = 8L;
        do
        {
            if (!iterator.hasNext())
            {
                size_ = l;
                return l;
            }
            l = ((Sample)iterator.next()).getSize() + l;
        } while (true);
    }

    public String getType()
    {
        return "mdat";
    }

    public void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser)
    {
    }

    public void setParent(Container container)
    {
        parent = container;
    }

    ()
    {
        this$0 = final_fragmentedmp4builder;
        val$startSample = l;
        val$endSample = l1;
        val$track = track1;
        val$i = I.this;
        super();
        size_ = -1L;
    }
}
