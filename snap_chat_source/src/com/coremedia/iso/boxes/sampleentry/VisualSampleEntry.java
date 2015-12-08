// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import cA;
import com.coremedia.iso.boxes.Container;
import cs;
import cv;
import cx;
import fF;
import fv;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            AbstractSampleEntry

public final class VisualSampleEntry extends AbstractSampleEntry
    implements Container
{

    static final boolean $assertionsDisabled;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "avc3";
    public static final String TYPE5 = "drmi";
    public static final String TYPE6 = "hvc1";
    public static final String TYPE7 = "hev1";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long predefined[];
    private double vertresolution;
    private int width;

    public VisualSampleEntry()
    {
        super("avc1");
        horizresolution = 72D;
        vertresolution = 72D;
        frameCount = 1;
        compressorname = "";
        depth = 24;
        predefined = new long[3];
    }

    public VisualSampleEntry(String s)
    {
        super(s);
        horizresolution = 72D;
        vertresolution = 72D;
        frameCount = 1;
        compressorname = "";
        depth = 24;
        predefined = new long[3];
    }

    public final void getBox(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(78);
        bytebuffer.position(6);
        cx.b(bytebuffer, dataReferenceIndex);
        cx.b(bytebuffer, 0);
        cx.b(bytebuffer, 0);
        cx.b(bytebuffer, predefined[0]);
        cx.b(bytebuffer, predefined[1]);
        cx.b(bytebuffer, predefined[2]);
        cx.b(bytebuffer, getWidth());
        cx.b(bytebuffer, getHeight());
        cx.a(bytebuffer, getHorizresolution());
        cx.a(bytebuffer, getVertresolution());
        cx.b(bytebuffer, 0L);
        cx.b(bytebuffer, getFrameCount());
        cx.c(bytebuffer, cA.b(getCompressorname()));
        bytebuffer.put(cA.a(getCompressorname()));
        int i = cA.b(getCompressorname());
        do
        {
            if (i >= 31)
            {
                cx.b(bytebuffer, getDepth());
                cx.b(bytebuffer, 65535);
                writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
                writeContainer(writablebytechannel);
                return;
            }
            i++;
            bytebuffer.put((byte)0);
        } while (true);
    }

    public final String getCompressorname()
    {
        return compressorname;
    }

    public final int getDepth()
    {
        return depth;
    }

    public final int getFrameCount()
    {
        return frameCount;
    }

    public final int getHeight()
    {
        return height;
    }

    public final double getHorizresolution()
    {
        return horizresolution;
    }

    public final long getSize()
    {
        long l = getContainerSize();
        int i;
        if (largeBox || l + 78L + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 78L);
    }

    public final double getVertresolution()
    {
        return vertresolution;
    }

    public final int getWidth()
    {
        return width;
    }

    public final void parse(fv fv1, ByteBuffer bytebuffer, long l, cs cs)
    {
        long l1 = fv1.position();
        bytebuffer = ByteBuffer.allocate(78);
        fv1.read(bytebuffer);
        bytebuffer.position(6);
        dataReferenceIndex = cv.c(bytebuffer);
        long l2 = cv.c(bytebuffer);
        if (!$assertionsDisabled && 0L != l2)
        {
            throw new AssertionError("reserved byte not 0");
        }
        l2 = cv.c(bytebuffer);
        if (!$assertionsDisabled && 0L != l2)
        {
            throw new AssertionError("reserved byte not 0");
        }
        predefined[0] = cv.a(bytebuffer);
        predefined[1] = cv.a(bytebuffer);
        predefined[2] = cv.a(bytebuffer);
        width = cv.c(bytebuffer);
        height = cv.c(bytebuffer);
        horizresolution = cv.g(bytebuffer);
        vertresolution = cv.g(bytebuffer);
        l2 = cv.a(bytebuffer);
        if (!$assertionsDisabled && 0L != l2)
        {
            throw new AssertionError("reserved byte not 0");
        }
        frameCount = cv.c(bytebuffer);
        int j = cv.d(bytebuffer);
        int i = j;
        if (j > 31)
        {
            System.out.println((new StringBuilder("invalid compressor name displayable data: ")).append(j).toString());
            i = 31;
        }
        byte abyte0[] = new byte[i];
        bytebuffer.get(abyte0);
        compressorname = cA.a(abyte0);
        if (i < 31)
        {
            bytebuffer.get(new byte[31 - i]);
        }
        depth = cv.c(bytebuffer);
        l2 = cv.c(bytebuffer);
        if (!$assertionsDisabled && 65535L != l2)
        {
            throw new AssertionError();
        } else
        {
            initContainer(new fv() {

                final VisualSampleEntry this$0;
                private final fv val$dataSource;
                private final long val$endPosition;

                public void close()
                {
                    dataSource.close();
                }

                public ByteBuffer map(long l3, long l4)
                {
                    return dataSource.map(l3, l4);
                }

                public long position()
                {
                    return dataSource.position();
                }

                public void position(long l3)
                {
                    dataSource.position(l3);
                }

                public int read(ByteBuffer bytebuffer1)
                {
                    if (endPosition == dataSource.position())
                    {
                        return -1;
                    }
                    if ((long)bytebuffer1.remaining() > endPosition - dataSource.position())
                    {
                        ByteBuffer bytebuffer2 = ByteBuffer.allocate(fF.a(endPosition - dataSource.position()));
                        dataSource.read(bytebuffer2);
                        bytebuffer1.put((ByteBuffer)bytebuffer2.rewind());
                        return bytebuffer2.capacity();
                    } else
                    {
                        return dataSource.read(bytebuffer1);
                    }
                }

                public long size()
                {
                    return endPosition;
                }

                public long transferTo(long l3, long l4, WritableByteChannel writablebytechannel)
                {
                    return dataSource.transferTo(l3, l4, writablebytechannel);
                }

            
            {
                this$0 = VisualSampleEntry.this;
                endPosition = l;
                dataSource = fv1;
                super();
            }
            }, l - 78L, cs);
            return;
        }
    }

    public final void setCompressorname(String s)
    {
        compressorname = s;
    }

    public final void setDepth(int i)
    {
        depth = i;
    }

    public final void setFrameCount(int i)
    {
        frameCount = i;
    }

    public final void setHeight(int i)
    {
        height = i;
    }

    public final void setHorizresolution(double d)
    {
        horizresolution = d;
    }

    public final void setType(String s)
    {
        type = s;
    }

    public final void setVertresolution(double d)
    {
        vertresolution = d;
    }

    public final void setWidth(int i)
    {
        width = i;
    }

    static 
    {
        boolean flag;
        if (!com/coremedia/iso/boxes/sampleentry/VisualSampleEntry.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
