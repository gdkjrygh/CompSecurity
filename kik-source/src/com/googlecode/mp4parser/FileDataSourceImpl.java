// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser:
//            DataSource

public class FileDataSourceImpl
    implements DataSource
{

    FileChannel fc;
    String filename;

    public FileDataSourceImpl(File file)
    {
        fc = (new FileInputStream(file)).getChannel();
        filename = file.getName();
    }

    public FileDataSourceImpl(String s)
    {
        s = new File(s);
        fc = (new FileInputStream(s)).getChannel();
        filename = s.getName();
    }

    public FileDataSourceImpl(FileChannel filechannel)
    {
        fc = filechannel;
        filename = "unknown";
    }

    public FileDataSourceImpl(FileChannel filechannel, String s)
    {
        fc = filechannel;
        filename = s;
    }

    public void close()
    {
        fc.close();
    }

    public ByteBuffer map(long l, long l1)
    {
        return fc.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, l, l1);
    }

    public long position()
    {
        return fc.position();
    }

    public void position(long l)
    {
        fc.position(l);
    }

    public int read(ByteBuffer bytebuffer)
    {
        return fc.read(bytebuffer);
    }

    public long size()
    {
        return fc.size();
    }

    public String toString()
    {
        return filename;
    }

    public long transferTo(long l, long l1, WritableByteChannel writablebytechannel)
    {
        return fc.transferTo(l, l1, writablebytechannel);
    }
}
