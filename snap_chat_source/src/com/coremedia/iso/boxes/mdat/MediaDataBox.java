// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import cs;
import fv;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

public final class MediaDataBox
    implements Box
{

    private static Logger LOG = Logger.getLogger(com/coremedia/iso/boxes/mdat/MediaDataBox.getName());
    public static final String TYPE = "mdat";
    private fv dataSource;
    boolean largeBox;
    private long offset;
    Container parent;
    private long size;

    public MediaDataBox()
    {
        largeBox = false;
    }

    private static void transfer(fv fv1, long l, long l1, WritableByteChannel writablebytechannel)
    {
        long l2 = 0L;
        do
        {
            if (l2 >= l1)
            {
                return;
            }
            l2 = fv1.transferTo(l + l2, Math.min(0x3ff8000L, l1 - l2), writablebytechannel) + l2;
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

    public final void parse(fv fv1, ByteBuffer bytebuffer, long l, cs cs)
    {
        offset = fv1.position() - (long)bytebuffer.remaining();
        dataSource = fv1;
        size = (long)bytebuffer.remaining() + l;
        fv1.position(fv1.position() + l);
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
