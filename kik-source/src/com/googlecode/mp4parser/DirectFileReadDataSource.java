// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import com.googlecode.mp4parser.util.CastUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser:
//            DataSource

public class DirectFileReadDataSource
    implements DataSource
{

    private static final int TRANSFER_SIZE = 8192;
    private String filename;
    private RandomAccessFile raf;

    public DirectFileReadDataSource(File file)
    {
        raf = new RandomAccessFile(file, "r");
        filename = file.getName();
    }

    public void close()
    {
        raf.close();
    }

    public ByteBuffer map(long l, long l1)
    {
        raf.seek(l);
        byte abyte0[] = new byte[CastUtils.l2i(l1)];
        raf.readFully(abyte0);
        return ByteBuffer.wrap(abyte0);
    }

    public long position()
    {
        return raf.getFilePointer();
    }

    public void position(long l)
    {
        raf.seek(l);
    }

    public int read(ByteBuffer bytebuffer)
    {
        byte abyte0[];
        int i;
        int j;
        int i1;
        i1 = bytebuffer.remaining();
        abyte0 = new byte[8192];
        j = 0;
        i = 0;
_L5:
        if (i < i1) goto _L2; else goto _L1
_L1:
        int k = i;
        if (j < 0)
        {
            k = i;
            if (i == 0)
            {
                k = -1;
            }
        }
        return k;
_L2:
        int l;
        j = Math.min(i1 - i, 8192);
        l = raf.read(abyte0, 0, j);
        j = l;
        if (l < 0) goto _L1; else goto _L3
_L3:
        i += l;
        bytebuffer.put(abyte0, 0, l);
        j = l;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int readAllInOnce(ByteBuffer bytebuffer)
    {
        byte abyte0[] = new byte[bytebuffer.remaining()];
        int i = raf.read(abyte0);
        bytebuffer.put(abyte0, 0, i);
        return i;
    }

    public long size()
    {
        return raf.length();
    }

    public String toString()
    {
        return filename;
    }

    public long transferTo(long l, long l1, WritableByteChannel writablebytechannel)
    {
        return (long)writablebytechannel.write(map(l, l1));
    }
}
