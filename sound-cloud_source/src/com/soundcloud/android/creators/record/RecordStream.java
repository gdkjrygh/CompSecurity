// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.creators.record.filter.FadeFilter;
import com.soundcloud.android.creators.record.jni.NativeAmplitudeAnalyzer;
import com.soundcloud.android.creators.record.writer.EmptyWriter;
import com.soundcloud.android.creators.record.writer.MultiAudioWriter;
import com.soundcloud.android.creators.record.writer.VorbisWriter;
import com.soundcloud.android.creators.record.writer.WavWriter;
import com.soundcloud.android.utils.BufferUtils;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.soundcloud.android.creators.record:
//            AmplitudeData, SoundRecorder, AudioConfig, AmplitudeAnalyzer, 
//            AudioWriter, AudioReader

public class RecordStream
{

    private final AmplitudeAnalyzer amplitudeAnalyzer;
    private AmplitudeData amplitudeData;
    private final AudioConfig config;
    private float lastAmplitude;
    private final AmplitudeData preRecordAmplitudeData;
    private boolean wasFinalized;
    private AudioWriter writer;

    public RecordStream(AudioConfig audioconfig)
    {
        if (audioconfig == null)
        {
            throw new IllegalArgumentException("config is null");
        } else
        {
            config = audioconfig;
            amplitudeAnalyzer = new NativeAmplitudeAnalyzer(audioconfig);
            amplitudeData = new AmplitudeData();
            preRecordAmplitudeData = new AmplitudeData();
            writer = new EmptyWriter(audioconfig);
            return;
        }
    }

    public RecordStream(AudioConfig audioconfig, File file, File file1, File file2)
    {
        this(audioconfig);
        setWriters(file, file1);
        if (file2 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (file2.exists())
        {
            amplitudeData = AmplitudeData.fromFile(file2);
            return;
        }
        audioconfig = SoundRecorder.TAG;
        file = new StringBuilder("Amplitude file not found at ");
        if (file2 != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        audioconfig = "<null>";
_L1:
        try
        {
            file.append(audioconfig);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AudioConfig audioconfig)
        {
            audioconfig = SoundRecorder.TAG;
        }
        return;
        audioconfig = file2.getPath();
          goto _L1
    }

    private int getBufferSize(Resources resources)
    {
        int i = (int)((float)SoundRecorder.PIXELS_PER_SECOND * resources.getDisplayMetrics().density);
        return (int)config.validBytePosition(config.bytesPerSecond / i);
    }

    private void writeFadeOut(long l)
        throws IOException
    {
        double d = amplitudeAnalyzer.getLastValue();
        if (d != 0.0D)
        {
            int j = getBufferSize(SoundCloudApplication.instance.getResources());
            int k = (int)config.msToByte(l);
            ByteBuffer bytebuffer = BufferUtils.allocateAudioBuffer(k + 2);
            ByteBuffer bytebuffer1 = BufferUtils.allocateAudioBuffer(j);
            double d1 = d / (double)(k / 2);
            for (int i = 0; i < k; i += 2)
            {
                d -= d1;
                bytebuffer.putShort((short)(int)d);
                bytebuffer1.putShort((short)(int)d);
                if (i % j == 0)
                {
                    float f = amplitudeAnalyzer.frameAmplitude(bytebuffer1, j);
                    amplitudeData.add(f);
                    bytebuffer1.rewind();
                }
            }

            bytebuffer.putShort((short)0);
            write(bytebuffer, k);
        }
    }

    public void finalizeStream(File file)
        throws IOException
    {
        wasFinalized = true;
        writer.finalizeStream();
        if (file != null)
        {
            amplitudeData.store(file);
        }
    }

    public AmplitudeData getAmplitudeData()
    {
        return amplitudeData;
    }

    public AudioReader getAudioReader()
        throws IOException
    {
        return writer.getAudioReader();
    }

    public long getDuration()
    {
        return writer.getDuration();
    }

    public float getLastAmplitude()
    {
        return lastAmplitude;
    }

    public AmplitudeData getPreRecordAmplitudeData()
    {
        return preRecordAmplitudeData;
    }

    public void reset()
    {
        try
        {
            writer.close();
        }
        catch (IOException ioexception) { }
        writer = new EmptyWriter(config);
        amplitudeData.clear();
        preRecordAmplitudeData.clear();
        lastAmplitude = 0.0F;
    }

    public void setWriter(AudioWriter audiowriter)
    {
        writer = audiowriter;
    }

    public final void setWriters(File file, File file1)
    {
        if (file == null && file1 == null)
        {
            file = new EmptyWriter(config);
        } else
        if (file1 != null && file == null)
        {
            file = new VorbisWriter(file1, config);
        } else
        if (file1 == null)
        {
            file = new WavWriter(file, config);
        } else
        {
            file = new MultiAudioWriter(new AudioWriter[] {
                new VorbisWriter(file1, config), new WavWriter(file, config)
            });
        }
        setWriter(file);
    }

    public boolean truncate(long l, int i)
        throws IOException
    {
        amplitudeData.truncate((int)(((double)l / 1000D) * (double)i));
        return writer.setNewPosition(l);
    }

    public int write(ByteBuffer bytebuffer, int i)
        throws IOException
    {
        bytebuffer.limit(i);
        lastAmplitude = amplitudeAnalyzer.frameAmplitude(bytebuffer, i);
        if (writer instanceof EmptyWriter)
        {
            preRecordAmplitudeData.add(lastAmplitude);
            return -1;
        }
        amplitudeData.add(lastAmplitude);
        if (wasFinalized)
        {
            (new FadeFilter(1, i)).apply(bytebuffer, 0L, i);
            wasFinalized = false;
        }
        return writer.write(bytebuffer, i);
    }
}
