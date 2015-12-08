// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import cs;
import cv;
import cx;
import fs;
import fv;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            FullBox

public class SampleDescriptionBox extends fs
    implements FullBox
{

    public static final String TYPE = "stsd";
    private int flags;
    private int version;

    public SampleDescriptionBox()
    {
        super("stsd");
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(8);
        cx.c(bytebuffer, version);
        cx.a(bytebuffer, flags);
        cx.b(bytebuffer, getBoxes().size());
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public int getFlags()
    {
        return flags;
    }

    public AbstractSampleEntry getSampleEntry()
    {
        Iterator iterator = getBoxes(com/coremedia/iso/boxes/sampleentry/AbstractSampleEntry).iterator();
        if (iterator.hasNext())
        {
            return (AbstractSampleEntry)iterator.next();
        } else
        {
            return null;
        }
    }

    public long getSize()
    {
        long l = getContainerSize();
        int i;
        if (largeBox || l + 8L + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 8L);
    }

    public int getVersion()
    {
        return version;
    }

    public void parse(fv fv1, ByteBuffer bytebuffer, long l, cs cs)
    {
        bytebuffer = ByteBuffer.allocate(8);
        fv1.read(bytebuffer);
        bytebuffer.rewind();
        version = cv.d(bytebuffer);
        flags = cv.b(bytebuffer);
        initContainer(fv1, l - 8L, cs);
    }

    public void setFlags(int i)
    {
        flags = i;
    }

    public void setVersion(int i)
    {
        version = i;
    }
}
