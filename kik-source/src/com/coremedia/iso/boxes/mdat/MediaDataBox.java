// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

public final class MediaDataBox
    implements Box
{

    private static Logger LOG = Logger.getLogger(com/coremedia/iso/boxes/mdat/MediaDataBox.getName());
    public static final String TYPE = "mdat";
    private DataSource dataSource;
    boolean largeBox;
    private long offset;
    Container parent;
    private long size;

    public MediaDataBox()
    {
        largeBox = false;
    }

    private static void transfer(DataSource datasource, long l, long l1, WritableByteChannel writablebytechannel)
    {
        long l2 = 0L;
        do
        {
            if (l2 >= l1)
            {
                return;
            }
            l2 = datasource.transferTo(l + l2, Math.min(0x3ff8000L, l1 - l2), writablebytechannel) + l2;
        } while (true);
    }

    public final void getBox(WritableByteChannel writablebytechannel)
    {
        transfer(dataSource, offset, size, writablebytechannel);
    }

    public final long getOffset()
    {
        return offset;
    }

    public final Container getParent()
    {
        return parent;
    }

    public final long getSize()
    {
        return size;
    }

    public final String getType()
    {
        return "mdat";
    }

    public final void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser)
    {
        offset = datasource.position() - (long)bytebuffer.remaining();
        dataSource = datasource;
        size = (long)bytebuffer.remaining() + l;
        datasource.position(datasource.position() + l);
    }

    public final void setParent(Container container)
    {
        parent = container;
    }

    public final String toString()
    {
        return (new StringBuilder("MediaDataBox{size=")).append(size).append('}').toString();
    }

}
