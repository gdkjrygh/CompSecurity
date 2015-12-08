// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.reader;

import com.soundcloud.android.creators.record.AudioConfig;
import com.soundcloud.android.creators.record.AudioReader;
import com.soundcloud.android.creators.record.WavHeader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WavReader extends AudioReader
{

    public static final String EXTENSION = "wav";
    private final File backing;
    private RandomAccessFile file;
    private WavHeader header;

    public WavReader(File file1)
        throws IOException
    {
        backing = file1;
        doReopen();
    }

    private void doReopen()
        throws IOException
    {
        if (file != null)
        {
            file.close();
        }
        file = new RandomAccessFile(backing, "r");
        header = new WavHeader(new FileInputStream(backing));
    }

    public void close()
        throws IOException
    {
        file.close();
    }

    public AudioConfig getConfig()
    {
        return header.getAudioConfig();
    }

    public long getDuration()
    {
        return header.getDuration();
    }

    public File getFile()
    {
        return backing;
    }

    public long getPosition()
    {
        long l;
        try
        {
            l = getConfig().bytesToMs(file.getFilePointer() - 44L);
        }
        catch (IOException ioexception)
        {
            return -1L;
        }
        return l;
    }

    public int read(ByteBuffer bytebuffer, int i)
        throws IOException
    {
        return file.getChannel().read(bytebuffer);
    }

    public void reopen()
    {
        try
        {
            doReopen();
            return;
        }
        catch (IOException ioexception)
        {
            com/soundcloud/android/creators/record/reader/WavReader.getSimpleName();
        }
    }

    public void seek(long l)
        throws IOException
    {
        file.seek(header.offset(l));
    }
}
