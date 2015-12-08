// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import cs;
import cv;
import cx;
import fs;
import fv;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class MetaBox extends fs
{

    public static final String TYPE = "meta";
    private int flags;
    private int version;

    public MetaBox()
    {
        super("meta");
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(4);
        writeVersionAndFlags(bytebuffer);
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public int getFlags()
    {
        return flags;
    }

    public long getSize()
    {
        long l = getContainerSize();
        int i;
        if (largeBox || l + 4L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 4L);
    }

    public int getVersion()
    {
        return version;
    }

    public void parse(fv fv1, ByteBuffer bytebuffer, long l, cs cs)
    {
        bytebuffer = ByteBuffer.allocate(4);
        fv1.read(bytebuffer);
        parseVersionAndFlags((ByteBuffer)bytebuffer.rewind());
        initContainer(fv1, l - 4L, cs);
    }

    protected final long parseVersionAndFlags(ByteBuffer bytebuffer)
    {
        version = cv.d(bytebuffer);
        flags = cv.b(bytebuffer);
        return 4L;
    }

    public void setFlags(int i)
    {
        flags = i;
    }

    public void setVersion(int i)
    {
        version = i;
    }

    protected final void writeVersionAndFlags(ByteBuffer bytebuffer)
    {
        cx.c(bytebuffer, version);
        cx.a(bytebuffer, flags);
    }
}
