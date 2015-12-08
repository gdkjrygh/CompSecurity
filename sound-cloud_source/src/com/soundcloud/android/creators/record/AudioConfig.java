// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.media.AudioRecord;
import android.media.AudioTrack;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.creators.record:
//            ScAudioTrack, RemainingTimeCalculator, WavHeader

public final class AudioConfig extends Enum
{

    private static final AudioConfig $VALUES[];
    public static final AudioConfig DEFAULT;
    public static final AudioConfig PCM16_16000_1;
    public static final AudioConfig PCM16_22050_1;
    public static final AudioConfig PCM16_44100_1;
    public static final AudioConfig PCM16_44100_2;
    public static final AudioConfig PCM16_8000_1;
    public static final AudioConfig PCM8_8000_1;
    private static AudioConfig detected;
    public final int bitsPerSample;
    public final int bytesPerSecond;
    public final int channels;
    public final int sampleRate;
    public final int sampleSize;
    public final int source = 0;

    private AudioConfig(String s, int i, int j, int k, int l)
    {
        super(s, i);
        if (j != 8 && j != 16)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid bitsPerSample:")).append(j).toString());
        }
        if (l <= 0 || l > 2)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid channels:")).append(l).toString());
        } else
        {
            bitsPerSample = j;
            sampleRate = k;
            channels = l;
            sampleSize = (j / 8) * l;
            bytesPerSecond = sampleSize * k;
            return;
        }
    }

    private AudioRecord createAudioRecord(int i)
    {
        return new AudioRecord(0, sampleRate, getChannelConfig(true), getFormat(), i);
    }

    public static AudioConfig detect()
    {
        com/soundcloud/android/creators/record/AudioConfig;
        JVM INSTR monitorenter ;
        AudioConfig audioconfig;
        if (detected == null)
        {
            Iterator iterator = EnumSet.of(PCM16_44100_1, PCM16_22050_1, PCM16_16000_1, PCM16_8000_1).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                AudioConfig audioconfig1 = (AudioConfig)iterator.next();
                if (!audioconfig1.isValid())
                {
                    continue;
                }
                detected = audioconfig1;
                break;
            } while (true);
            if (detected == null)
            {
                detected = DEFAULT;
            }
        }
        audioconfig = detected;
        com/soundcloud/android/creators/record/AudioConfig;
        JVM INSTR monitorexit ;
        return audioconfig;
        Exception exception;
        exception;
        throw exception;
    }

    public static AudioConfig findMatching(int i, int j)
    {
        AudioConfig aaudioconfig[] = values();
        int l = aaudioconfig.length;
        for (int k = 0; k < l; k++)
        {
            AudioConfig audioconfig = aaudioconfig[k];
            if (audioconfig.sampleRate == i && j == audioconfig.channels)
            {
                return audioconfig;
            }
        }

        return null;
    }

    public static long msToByte(long l, int i, int j)
    {
        return (long)((double)l * ((double)i / 1000D) * (double)j);
    }

    public static AudioConfig valueOf(String s)
    {
        return (AudioConfig)Enum.valueOf(com/soundcloud/android/creators/record/AudioConfig, s);
    }

    public static AudioConfig[] values()
    {
        return (AudioConfig[])$VALUES.clone();
    }

    public final long bytesToMs(long l)
    {
        return (1000L * l) / (long)bytesPerSecond;
    }

    public final AudioRecord createAudioRecord()
    {
        AudioRecord audiorecord;
        int i;
        audiorecord = null;
        i = 0;
_L2:
        int j;
        if (i >= 6)
        {
            break; /* Loop/switch isn't completed */
        }
        j = (new int[] {
            64, 32, 16, 8, 4, 1
        })[i];
        AudioRecord audiorecord1 = createAudioRecord(j * getRecordMinBufferSize());
        audiorecord = audiorecord1;
        if (audiorecord1.getState() == 1)
        {
            return audiorecord1;
        }
        audiorecord = audiorecord1;
        com/soundcloud/android/creators/record/AudioConfig.getSimpleName();
        audiorecord = audiorecord1;
        (new StringBuilder("audiorecord ")).append(audiorecord1).append(" in state ").append(audiorecord1.getState());
        audiorecord = audiorecord1;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        com/soundcloud/android/creators/record/AudioConfig.getSimpleName();
          goto _L3
_L1:
        if (audiorecord == null)
        {
            throw new RuntimeException("Could not create AudioRecord");
        } else
        {
            return audiorecord;
        }
    }

    public final ScAudioTrack createAudioTrack(int i)
    {
        return new ScAudioTrack(this, i);
    }

    public final RemainingTimeCalculator createCalculator()
    {
        return new RemainingTimeCalculator(bytesPerSecond);
    }

    public final WavHeader createHeader()
    {
        return new WavHeader((short)1, (short)channels, sampleRate, (short)bitsPerSample, 0);
    }

    public final int getChannelConfig(boolean flag)
    {
        switch (channels)
        {
        default:
            return 1;

        case 1: // '\001'
            return !flag ? 4 : 16;

        case 2: // '\002'
            return 12;
        }
    }

    public final int getFormat()
    {
        return bitsPerSample != 16 ? 3 : 2;
    }

    public final int getPlaybackMinBufferSize()
    {
        return AudioTrack.getMinBufferSize(sampleRate, getChannelConfig(false), getFormat());
    }

    public final int getRecordMinBufferSize()
    {
        return AudioRecord.getMinBufferSize(sampleRate, getChannelConfig(true), getFormat());
    }

    public final boolean isValid()
    {
        boolean flag1 = true;
        int i;
        boolean flag;
        try
        {
            i = getPlaybackMinBufferSize();
        }
        catch (Exception exception)
        {
            return false;
        }
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return false;
        }
        try
        {
            flag = getRecordMinBufferSize();
        }
        catch (Exception exception1)
        {
            return false;
        }
        if (flag <= 0)
        {
            flag1 = false;
        }
        return flag1;
    }

    public final long msToByte(long l)
    {
        return msToByte(l, sampleRate, sampleSize);
    }

    public final long validBytePosition(long l)
    {
        return l - l % (long)((bitsPerSample / 8) * channels);
    }

    static 
    {
        PCM16_44100_2 = new AudioConfig("PCM16_44100_2", 0, 16, 44100, 2);
        PCM16_44100_1 = new AudioConfig("PCM16_44100_1", 1, 16, 44100, 1);
        PCM16_16000_1 = new AudioConfig("PCM16_16000_1", 2, 16, 16000, 1);
        PCM16_22050_1 = new AudioConfig("PCM16_22050_1", 3, 16, 22050, 1);
        PCM16_8000_1 = new AudioConfig("PCM16_8000_1", 4, 16, 8000, 1);
        PCM8_8000_1 = new AudioConfig("PCM8_8000_1", 5, 8, 8000, 1);
        $VALUES = (new AudioConfig[] {
            PCM16_44100_2, PCM16_44100_1, PCM16_16000_1, PCM16_22050_1, PCM16_8000_1, PCM8_8000_1
        });
        DEFAULT = PCM16_44100_1;
    }
}
