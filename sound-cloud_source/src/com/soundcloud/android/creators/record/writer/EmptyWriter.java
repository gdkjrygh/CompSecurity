// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.writer;

import com.soundcloud.android.creators.record.AudioConfig;
import com.soundcloud.android.creators.record.AudioReader;
import com.soundcloud.android.creators.record.AudioWriter;
import java.io.IOException;
import java.nio.ByteBuffer;

public class EmptyWriter
    implements AudioWriter
{

    private final AudioConfig config;

    public EmptyWriter(AudioConfig audioconfig)
    {
        config = audioconfig;
    }

    public void close()
        throws IOException
    {
    }

    public void finalizeStream()
        throws IOException
    {
    }

    public AudioReader getAudioReader()
        throws IOException
    {
        return AudioReader.EMPTY;
    }

    public AudioConfig getConfig()
    {
        return config;
    }

    public long getDuration()
    {
        return -1L;
    }

    public boolean isClosed()
    {
        return false;
    }

    public boolean setNewPosition(long l)
        throws IOException
    {
        return false;
    }

    public int write(ByteBuffer bytebuffer, int i)
        throws IOException
    {
        return -1;
    }
}
