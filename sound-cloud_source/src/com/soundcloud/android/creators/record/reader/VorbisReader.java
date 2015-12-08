// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.reader;

import com.soundcloud.android.creators.record.AudioConfig;
import com.soundcloud.android.creators.record.AudioReader;
import com.soundcloud.android.creators.record.jni.DecoderException;
import com.soundcloud.android.creators.record.jni.VorbisDecoder;
import com.soundcloud.android.creators.record.jni.VorbisInfo;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class VorbisReader extends AudioReader
{

    public static final String EXTENSION = "ogg";
    private VorbisDecoder decoder;
    private VorbisInfo info;

    public VorbisReader(File file)
        throws IOException
    {
        decoder = new VorbisDecoder(file);
    }

    private VorbisInfo getInfo()
    {
        if (info == null)
        {
            info = decoder.getInfo();
            if (info == null)
            {
                info = new VorbisInfo();
            }
        }
        return info;
    }

    public void close()
        throws IOException
    {
        decoder.release();
    }

    public AudioConfig getConfig()
    {
        return AudioConfig.findMatching(getInfo().sampleRate, getInfo().channels);
    }

    public long getDuration()
    {
        return (long)(getInfo().duration * 1000D);
    }

    public File getFile()
    {
        return decoder.file;
    }

    public long getPosition()
    {
        return (long)(decoder.timeTell() * 1000D);
    }

    public int read(ByteBuffer bytebuffer, int i)
        throws IOException
    {
        i = decoder.decode(bytebuffer, i);
        if (i == 0)
        {
            return -1;
        }
        if (i > 0 && i <= bytebuffer.limit())
        {
            bytebuffer.position(i);
            return i;
        } else
        {
            throw new DecoderException("error decoding", i);
        }
    }

    public void reopen()
        throws DecoderException
    {
        File file = decoder.file;
        decoder.release();
        decoder = new VorbisDecoder(file);
        info = null;
    }

    public void seek(long l)
        throws IOException
    {
        int i = decoder.timeSeek((double)l / 1000D);
        if (i < 0)
        {
            throw new IOException((new StringBuilder("timeSeek(")).append(l).append(") returned ").append(i).toString());
        } else
        {
            return;
        }
    }
}
