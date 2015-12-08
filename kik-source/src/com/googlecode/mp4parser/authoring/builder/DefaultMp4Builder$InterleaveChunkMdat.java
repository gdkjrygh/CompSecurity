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
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            DefaultMp4Builder

private class <init>
    implements Box
{

    List chunkList;
    long contentSize;
    Container parent;
    final DefaultMp4Builder this$0;
    List tracks;

    private boolean isSmallBox(long l)
    {
        return 8L + l < 0x100000000L;
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        Object obj = ByteBuffer.allocate(16);
        long l = getSize();
        if (isSmallBox(l))
        {
            IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), l);
        } else
        {
            IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), 1L);
        }
        ((ByteBuffer) (obj)).put(IsoFile.fourCCtoBytes("mdat"));
        if (isSmallBox(l))
        {
            ((ByteBuffer) (obj)).put(new byte[8]);
        } else
        {
            IsoTypeWriter.writeUInt64(((ByteBuffer) (obj)), l);
        }
        ((ByteBuffer) (obj)).rewind();
        writablebytechannel.write(((ByteBuffer) (obj)));
        obj = chunkList.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                return;
            }
            Iterator iterator = ((List)((Iterator) (obj)).next()).iterator();
            while (iterator.hasNext()) 
            {
                ((Sample)iterator.next()).writeTo(writablebytechannel);
            }
        } while (true);
    }

    public long getDataOffset()
    {
        Object obj;
        long l;
        l = 16L;
        obj = this;
_L3:
        Iterator iterator;
        if (!(obj instanceof Box))
        {
            return l;
        }
        iterator = ((Box)obj).getParent().getBoxes().iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Box box;
        obj = ((Box)obj).getParent();
          goto _L3
_L2:
        if (obj == (box = (Box)iterator.next())) goto _L1; else goto _L4
_L4:
        l += box.getSize();
          goto _L5
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
        return 16L + contentSize;
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

    private (Movie movie, Map map, long l)
    {
        int i;
        this$0 = DefaultMp4Builder.this;
        super();
        chunkList = new ArrayList();
        contentSize = l;
        tracks = movie.getTracks();
        i = 0;
_L2:
        if (i >= ((int[])map.values().iterator().next()).length)
        {
            return;
        }
        movie = tracks.iterator();
_L3:
label0:
        {
            if (movie.hasNext())
            {
                break label0;
            }
            i++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        Object obj;
        int ai[];
        int j;
        obj = (Track)movie.next();
        ai = (int[])map.get(obj);
        l = 0L;
        j = 0;
_L4:
label1:
        {
            if (j < i)
            {
                break label1;
            }
            obj = ((List)track2Sample.get(obj)).subList(CastUtils.l2i(l), CastUtils.l2i(l + (long)ai[i]));
            chunkList.add(obj);
        }
          goto _L3
        l += ai[j];
        j++;
          goto _L4
    }

    chunkList(Movie movie, Map map, long l, chunkList chunklist)
    {
        this(movie, map, l);
    }
}
