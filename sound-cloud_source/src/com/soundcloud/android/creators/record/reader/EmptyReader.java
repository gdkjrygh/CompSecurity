// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.reader;

import com.soundcloud.android.creators.record.AudioConfig;
import com.soundcloud.android.creators.record.AudioReader;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class EmptyReader extends AudioReader
{

    public EmptyReader()
    {
    }

    public void close()
        throws IOException
    {
    }

    public AudioConfig getConfig()
    {
        return AudioConfig.PCM16_44100_1;
    }

    public long getDuration()
    {
        return -1L;
    }

    public File getFile()
    {
        return new File("/dev/null");
    }

    public long getPosition()
    {
        return -1L;
    }

    public int read(ByteBuffer bytebuffer, int i)
        throws IOException
    {
        return -1;
    }

    public void reopen()
        throws IOException
    {
    }

    public void seek(long l)
        throws IOException
    {
    }
}
