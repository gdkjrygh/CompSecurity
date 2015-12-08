// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.writer;

import com.soundcloud.android.creators.record.AudioConfig;
import com.soundcloud.android.creators.record.AudioReader;
import com.soundcloud.android.creators.record.AudioWriter;
import com.soundcloud.android.creators.record.WavHeader;
import com.soundcloud.android.creators.record.reader.WavReader;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WavWriter
    implements AudioWriter
{

    private static final String TAG = com/soundcloud/android/creators/record/writer/WavWriter.getSimpleName();
    public final AudioConfig config;
    public final File file;
    private RandomAccessFile writer;

    public WavWriter(File file1, AudioConfig audioconfig)
    {
        file = file1;
        config = audioconfig;
    }

    private RandomAccessFile initializeWriter()
        throws IOException
    {
        RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
        if (!file.exists() || randomaccessfile.length() == 0L)
        {
            (new StringBuilder("creating new WAV file (")).append(file.getAbsolutePath()).append(")");
            randomaccessfile.setLength(0L);
            config.createHeader().write(randomaccessfile);
            return randomaccessfile;
        } else
        {
            long l = randomaccessfile.length();
            (new StringBuilder("appending to existing WAV file (")).append(file.getAbsolutePath()).append(") at ").append(l);
            randomaccessfile.seek(l);
            return randomaccessfile;
        }
    }

    public void close()
        throws IOException
    {
        if (!isClosed())
        {
            finalizeStream();
        }
    }

    public void finalizeStream()
        throws IOException
    {
        if (writer != null)
        {
            long l = writer.length();
            (new StringBuilder("finalising recording file (length=")).append(l).append(")");
            WavHeader.fixLength(writer);
            writer.close();
            writer = null;
        }
    }

    public AudioReader getAudioReader()
        throws IOException
    {
        return new WavReader(file);
    }

    public AudioConfig getConfig()
    {
        return config;
    }

    public long getDuration()
    {
        return config.bytesToMs(file.length() - 44L);
    }

    public boolean isClosed()
    {
        return writer == null;
    }

    public boolean setNewPosition(long l)
        throws IOException
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (l >= 0L)
        {
            l = config.msToByte(l) + 44L;
            if (writer == null)
            {
                writer = initializeWriter();
            }
            flag = flag1;
            if (l < writer.length())
            {
                writer.setLength(l);
                WavHeader.fixLength(writer);
                writer.seek(l);
                flag = true;
            }
        }
        return flag;
    }

    public int write(ByteBuffer bytebuffer, int i)
        throws IOException
    {
        if (writer == null)
        {
            writer = initializeWriter();
        }
        return writer.getChannel().write(bytebuffer);
    }

}
