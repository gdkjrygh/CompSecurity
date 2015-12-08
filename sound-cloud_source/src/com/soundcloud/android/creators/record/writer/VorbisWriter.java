// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.writer;

import com.soundcloud.android.creators.record.AudioConfig;
import com.soundcloud.android.creators.record.AudioReader;
import com.soundcloud.android.creators.record.AudioWriter;
import com.soundcloud.android.creators.record.jni.EncoderException;
import com.soundcloud.android.creators.record.jni.EncoderOptions;
import com.soundcloud.android.creators.record.jni.VorbisEncoder;
import com.soundcloud.android.creators.record.reader.VorbisReader;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class VorbisWriter
    implements AudioWriter
{

    private final AudioConfig config;
    private VorbisEncoder encoder;
    private final File file;

    public VorbisWriter(File file1, AudioConfig audioconfig)
    {
        file = file1;
        config = audioconfig;
    }

    private void initializeEncoder()
        throws EncoderException
    {
        if (encoder == null)
        {
            encoder = new VorbisEncoder(file, "w+", config.channels, config.sampleRate, EncoderOptions.DEFAULT.quality);
        }
    }

    public void close()
        throws IOException
    {
        if (encoder != null)
        {
            encoder.release();
            encoder = null;
        }
    }

    public void finalizeStream()
        throws IOException
    {
        initializeEncoder();
        encoder.pause();
    }

    public AudioReader getAudioReader()
        throws IOException
    {
        return new VorbisReader(file);
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
        return encoder == null || encoder.getState() == 1 || encoder.getState() == 2;
    }

    public boolean setNewPosition(long l)
        throws IOException
    {
        initializeEncoder();
        encoder.pause();
        return encoder.startNewStream((double)l / 1000D);
    }

    public int write(ByteBuffer bytebuffer, int i)
        throws IOException
    {
        initializeEncoder();
        i = encoder.write(bytebuffer, i);
        if (i < 0)
        {
            throw new EncoderException("Error writing", i);
        } else
        {
            return i;
        }
    }
}
