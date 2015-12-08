// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.writer;

import com.soundcloud.android.creators.record.AudioConfig;
import com.soundcloud.android.creators.record.AudioReader;
import com.soundcloud.android.creators.record.AudioWriter;
import java.io.IOException;
import java.nio.ByteBuffer;

public class MultiAudioWriter
    implements AudioWriter
{

    private AudioConfig config;
    private final AudioWriter writers[];

    public transient MultiAudioWriter(AudioWriter aaudiowriter[])
    {
        int i;
        int j;
        writers = aaudiowriter;
        j = aaudiowriter.length;
        i = 0;
_L2:
        AudioWriter audiowriter;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        audiowriter = aaudiowriter[i];
        if (config != null)
        {
            break; /* Loop/switch isn't completed */
        }
        config = audiowriter.getConfig();
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (config == audiowriter.getConfig()) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder("mismatch in configurations:")).append(config).append("/").append(audiowriter.getConfig()).toString());
    }

    public void close()
        throws IOException
    {
        AudioWriter aaudiowriter[] = writers;
        int j = aaudiowriter.length;
        for (int i = 0; i < j; i++)
        {
            aaudiowriter[i].close();
        }

    }

    public void finalizeStream()
        throws IOException
    {
        AudioWriter aaudiowriter[] = writers;
        int j = aaudiowriter.length;
        for (int i = 0; i < j; i++)
        {
            aaudiowriter[i].finalizeStream();
        }

    }

    public AudioReader getAudioReader()
        throws IOException
    {
        AudioWriter aaudiowriter[] = writers;
        int j = aaudiowriter.length;
        for (int i = 0; i < j; i++)
        {
            AudioReader audioreader = aaudiowriter[i].getAudioReader();
            if (audioreader != null)
            {
                return audioreader;
            }
        }

        return null;
    }

    public AudioConfig getConfig()
    {
        return config;
    }

    public long getDuration()
    {
        AudioWriter aaudiowriter[] = writers;
        int j = aaudiowriter.length;
        for (int i = 0; i < j; i++)
        {
            long l = aaudiowriter[i].getDuration();
            if (l != -1L)
            {
                return l;
            }
        }

        return -1L;
    }

    public boolean isClosed()
    {
        int i = 0;
        AudioWriter aaudiowriter[] = writers;
        int j = aaudiowriter.length;
        boolean flag = false;
        for (; i < j; i++)
        {
            flag = aaudiowriter[i].isClosed();
        }

        return flag;
    }

    public boolean setNewPosition(long l)
        throws IOException
    {
        AudioWriter aaudiowriter[] = writers;
        int j = aaudiowriter.length;
        for (int i = 0; i < j; i++)
        {
            if (!aaudiowriter[i].setNewPosition(l))
            {
                return false;
            }
        }

        return true;
    }

    public int write(ByteBuffer bytebuffer, int i)
        throws IOException
    {
        bytebuffer.mark();
        int ai[] = new int[writers.length];
        for (int j = 0; j < writers.length; j++)
        {
            ai[j] = writers[j].write(bytebuffer, i);
            bytebuffer.reset();
        }

        return ai[0];
    }
}
