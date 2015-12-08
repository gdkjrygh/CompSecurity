// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.android.utils.LimitInputStream;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Locale;

// Referenced classes of package com.soundcloud.android.creators.record:
//            AudioConfig

public class WavHeader
{
    public static class AudioData
    {

        public final long length;
        public final InputStream stream;

        AudioData(InputStream inputstream, long l)
        {
            stream = inputstream;
            length = l;
        }
    }


    public static final short FORMAT_ALAW = 6;
    public static final short FORMAT_PCM = 1;
    public static final short FORMAT_ULAW = 7;
    public static final int LENGTH = 44;
    private short bitsPerSample;
    private short format;
    private InputStream is;
    private int numBytes;
    private short numChannels;
    private int sampleRate;

    public WavHeader(InputStream inputstream)
        throws IOException
    {
        this(inputstream, false);
    }

    public WavHeader(InputStream inputstream, boolean flag)
        throws IOException
    {
label0:
        {
            super();
            if (flag)
            {
                if (!inputstream.markSupported())
                {
                    break label0;
                }
                inputstream.mark(76);
            }
            read(inputstream);
            if (flag)
            {
                inputstream.reset();
            }
            is = inputstream;
            return;
        }
        throw new IOException((new StringBuilder("asked to rewind but ")).append(inputstream.getClass()).append(" does not support it").toString());
    }

    public WavHeader(short word0, short word1, int i, short word2, int j)
    {
        format = word0;
        sampleRate = i;
        numChannels = word1;
        bitsPerSample = word2;
        numBytes = j;
    }

    public static boolean fixLength(RandomAccessFile randomaccessfile)
        throws IOException
    {
        long l;
        for (l = randomaccessfile.length(); l == 0L || l <= 44L;)
        {
            return false;
        }

        randomaccessfile.seek(4L);
        randomaccessfile.writeInt(Integer.reverseBytes((int)(l - 8L)));
        randomaccessfile.seek(40L);
        randomaccessfile.writeInt(Integer.reverseBytes((int)(l - 44L)));
        return true;
    }

    public static WavHeader fromFile(File file)
        throws IOException
    {
        file = new FileInputStream(file);
        WavHeader wavheader = new WavHeader(file);
        file.close();
        return wavheader;
    }

    private int read(InputStream inputstream)
        throws IOException
    {
        readId(inputstream, "RIFF");
        readInt(inputstream);
        readId(inputstream, "WAVE");
        readId(inputstream, "fmt ");
        if (16 != readInt(inputstream))
        {
            throw new IOException("fmt chunk length not 16");
        }
        format = readShort(inputstream);
        numChannels = readShort(inputstream);
        sampleRate = readInt(inputstream);
        int i = readInt(inputstream);
        short word0 = readShort(inputstream);
        bitsPerSample = readShort(inputstream);
        if (i != numChannels * sampleRate * getBytesPerSample())
        {
            throw new IOException("fmt.ByteRate field inconsistent");
        }
        if (word0 != numChannels * getBytesPerSample())
        {
            throw new IOException("fmt.BlockAlign field inconsistent");
        } else
        {
            readId(inputstream, "data");
            numBytes = readInt(inputstream);
            return 44;
        }
    }

    private static void readId(InputStream inputstream, String s)
        throws IOException
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != inputstream.read())
            {
                throw new IOException((new StringBuilder()).append(s).append(" tag not present").toString());
            }
        }

    }

    private static int readInt(InputStream inputstream)
        throws IOException
    {
        return inputstream.read() | inputstream.read() << 8 | inputstream.read() << 16 | inputstream.read() << 24;
    }

    private static short readShort(InputStream inputstream)
        throws IOException
    {
        return (short)(inputstream.read() | inputstream.read() << 8);
    }

    public static void writeHeader(File file, int i)
        throws IOException
    {
        WavHeader wavheader = new WavHeader((short)1, (short)1, 44100, (short)16, i);
        file = new FileOutputStream(file);
        wavheader.write(file);
        file.close();
    }

    private static void writeId(OutputStream outputstream, String s)
        throws IOException
    {
        for (int i = 0; i < s.length(); i++)
        {
            outputstream.write(s.charAt(i));
        }

    }

    private static void writeInt(OutputStream outputstream, int i)
        throws IOException
    {
        outputstream.write(i >> 0);
        outputstream.write(i >> 8);
        outputstream.write(i >> 16);
        outputstream.write(i >> 24);
    }

    private static void writeShort(OutputStream outputstream, short word0)
        throws IOException
    {
        outputstream.write(word0 >> 0);
        outputstream.write(word0 >> 8);
    }

    public AudioConfig getAudioConfig()
    {
        if (format == 1 && bitsPerSample == 16)
        {
            return AudioConfig.findMatching(sampleRate, numChannels);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown audioformat: ")).append(toString()).toString());
        }
    }

    public AudioData getAudioData(long l, long l1)
        throws IOException
    {
        Object obj = is;
        long l3 = numBytes;
        AudioConfig audioconfig = getAudioConfig();
        long l2 = l3;
        if (l > 0L)
        {
            l = Math.min(numBytes, audioconfig.validBytePosition(audioconfig.msToByte(l)));
            IOUtils.skipFully(is, l);
            l2 = l3 - l;
        }
        l = l2;
        if (l1 > 0L)
        {
            l = Math.min(numBytes, audioconfig.validBytePosition(audioconfig.msToByte(l1)));
            obj = new LimitInputStream(is, l - ((long)numBytes - l2));
            l = l2 - ((long)numBytes - l);
        }
        return new AudioData(((InputStream) (obj)), l);
    }

    public final short getBitsPerSample()
    {
        return bitsPerSample;
    }

    public final int getBytesPerSample()
    {
        return getBitsPerSample() / 8;
    }

    public final long getDuration()
    {
        return getAudioConfig().bytesToMs(numBytes);
    }

    public short getFormat()
    {
        return format;
    }

    public final int getNumBytes()
    {
        return numBytes;
    }

    public short getNumChannels()
    {
        return numChannels;
    }

    public int getSampleRate()
    {
        return sampleRate;
    }

    public long offset(long l)
    {
        if (l < 0L)
        {
            return 44L;
        } else
        {
            l = Math.min(numBytes, getAudioConfig().msToByte(l));
            return 44L + getAudioConfig().validBytePosition(l);
        }
    }

    public WavHeader setBitsPerSample(short word0)
    {
        bitsPerSample = word0;
        return this;
    }

    public WavHeader setFormat(short word0)
    {
        format = word0;
        return this;
    }

    public WavHeader setNumBytes(int i)
    {
        numBytes = i;
        return this;
    }

    public WavHeader setNumChannels(short word0)
    {
        numChannels = word0;
        return this;
    }

    public WavHeader setSampleRate(int i)
    {
        sampleRate = i;
        return this;
    }

    public String toString()
    {
        return String.format(Locale.ENGLISH, "WaveHeader format=%d numChannels=%d sampleRate=%d bitsPerSample=%d numBytes=%d", new Object[] {
            Short.valueOf(format), Short.valueOf(numChannels), Integer.valueOf(sampleRate), Short.valueOf(bitsPerSample), Integer.valueOf(numBytes)
        });
    }

    public int write(DataOutput dataoutput)
        throws IOException
    {
        dataoutput.writeBytes("RIFF");
        dataoutput.writeInt(numBytes + 36);
        dataoutput.writeBytes("WAVE");
        dataoutput.writeBytes("fmt ");
        dataoutput.writeInt(Integer.reverseBytes(16));
        dataoutput.writeShort(Short.reverseBytes((short)1));
        dataoutput.writeShort(Short.reverseBytes(numChannels));
        dataoutput.writeInt(Integer.reverseBytes(sampleRate));
        dataoutput.writeInt(Integer.reverseBytes(numChannels * sampleRate * getBytesPerSample()));
        dataoutput.writeShort(Short.reverseBytes((short)(numChannels * getBytesPerSample())));
        dataoutput.writeShort(Short.reverseBytes(bitsPerSample));
        dataoutput.writeBytes("data");
        dataoutput.writeInt(numBytes);
        return 44;
    }

    public int write(OutputStream outputstream)
        throws IOException
    {
        writeId(outputstream, "RIFF");
        writeInt(outputstream, numBytes + 36);
        writeId(outputstream, "WAVE");
        writeId(outputstream, "fmt ");
        writeInt(outputstream, 16);
        writeShort(outputstream, format);
        writeShort(outputstream, numChannels);
        writeInt(outputstream, sampleRate);
        writeInt(outputstream, numChannels * sampleRate * getBytesPerSample());
        writeShort(outputstream, (short)(numChannels * getBytesPerSample()));
        writeShort(outputstream, bitsPerSample);
        writeId(outputstream, "data");
        writeInt(outputstream, numBytes);
        return 44;
    }
}
