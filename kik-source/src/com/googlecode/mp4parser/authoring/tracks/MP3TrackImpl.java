// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MP3TrackImpl extends AbstractTrack
{
    class MP3Header
    {

        int bitRate;
        int bitRateIndex;
        int channelCount;
        int channelMode;
        int layer;
        int mpegVersion;
        int padding;
        int protectionAbsent;
        int sampleFrequencyIndex;
        int sampleRate;
        final MP3TrackImpl this$0;

        int getFrameLength()
        {
            return (bitRate * 144) / sampleRate + padding;
        }

        MP3Header()
        {
            this$0 = MP3TrackImpl.this;
            super();
        }
    }


    private static final int BIT_RATE[];
    private static final int ES_OBJECT_TYPE_INDICATION = 107;
    private static final int ES_STREAM_TYPE = 5;
    private static final int MPEG_L3 = 1;
    private static final int MPEG_V1 = 3;
    private static final int SAMPLES_PER_FRAME = 1152;
    private static final int SAMPLE_RATE[];
    long avgBitRate;
    private final DataSource dataSource;
    private long durations[];
    MP3Header firstHeader;
    long maxBitRate;
    SampleDescriptionBox sampleDescriptionBox;
    private List samples;
    TrackMetaData trackMetaData;

    public MP3TrackImpl(DataSource datasource)
    {
        this(datasource, "eng");
    }

    public MP3TrackImpl(DataSource datasource, String s)
    {
        super(datasource.toString());
        trackMetaData = new TrackMetaData();
        dataSource = datasource;
        samples = new LinkedList();
        firstHeader = readSamples(datasource);
        double d = (double)firstHeader.sampleRate / 1152D;
        double d1 = (double)samples.size() / d;
        datasource = new LinkedList();
        Object obj = samples.iterator();
        long l = 0L;
        do
        {
label0:
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    avgBitRate = (int)((double)(8L * l) / d1);
                    sampleDescriptionBox = new SampleDescriptionBox();
                    datasource = new AudioSampleEntry("mp4a");
                    datasource.setChannelCount(firstHeader.channelCount);
                    datasource.setSampleRate(firstHeader.sampleRate);
                    datasource.setDataReferenceIndex(1);
                    datasource.setSampleSize(16);
                    obj = new ESDescriptorBox();
                    ESDescriptor esdescriptor = new ESDescriptor();
                    esdescriptor.setEsId(0);
                    Object obj1 = new SLConfigDescriptor();
                    ((SLConfigDescriptor) (obj1)).setPredefined(2);
                    esdescriptor.setSlConfigDescriptor(((SLConfigDescriptor) (obj1)));
                    obj1 = new DecoderConfigDescriptor();
                    ((DecoderConfigDescriptor) (obj1)).setObjectTypeIndication(107);
                    ((DecoderConfigDescriptor) (obj1)).setStreamType(5);
                    ((DecoderConfigDescriptor) (obj1)).setMaxBitRate(maxBitRate);
                    ((DecoderConfigDescriptor) (obj1)).setAvgBitRate(avgBitRate);
                    esdescriptor.setDecoderConfigDescriptor(((DecoderConfigDescriptor) (obj1)));
                    ((ESDescriptorBox) (obj)).setData(esdescriptor.serialize());
                    datasource.addBox(((com.coremedia.iso.boxes.Box) (obj)));
                    sampleDescriptionBox.addBox(datasource);
                    trackMetaData.setCreationTime(new Date());
                    trackMetaData.setModificationTime(new Date());
                    trackMetaData.setLanguage(s);
                    trackMetaData.setVolume(1.0F);
                    trackMetaData.setTimescale(firstHeader.sampleRate);
                    durations = new long[samples.size()];
                    Arrays.fill(durations, 1152L);
                    return;
                }
                int i = (int)((Sample)((Iterator) (obj)).next()).getSize();
                long l1 = l + (long)i;
                datasource.add(Integer.valueOf(i));
                double d2;
                for (; (double)datasource.size() > d; datasource.pop())
                {
                    break label0;
                }

                l = l1;
                if (datasource.size() == (int)d)
                {
                    Iterator iterator = datasource.iterator();
                    for (int j = 0; iterator.hasNext(); j = ((Integer)iterator.next()).intValue() + j)
                    {
                        break MISSING_BLOCK_LABEL_509;
                    }

                    d2 = (((double)j * 8D) / (double)datasource.size()) * d;
                    l = l1;
                    if (d2 > (double)maxBitRate)
                    {
                        maxBitRate = (int)d2;
                        l = l1;
                    }
                }
            }
        } while (true);
    }

    private MP3Header readMP3Header(DataSource datasource)
    {
        MP3Header mp3header = new MP3Header();
        ByteBuffer bytebuffer = ByteBuffer.allocate(4);
        do
        {
            if (bytebuffer.position() >= 4)
            {
                datasource = new BitReaderBuffer((ByteBuffer)bytebuffer.rewind());
                if (datasource.readBits(11) != 2047)
                {
                    throw new IOException("Expected Start Word 0x7ff");
                }
                break;
            }
            if (datasource.read(bytebuffer) == -1)
            {
                return null;
            }
        } while (true);
        mp3header.mpegVersion = datasource.readBits(2);
        if (mp3header.mpegVersion != 3)
        {
            throw new IOException("Expected MPEG Version 1 (ISO/IEC 11172-3)");
        }
        mp3header.layer = datasource.readBits(2);
        if (mp3header.layer != 1)
        {
            throw new IOException("Expected Layer III");
        }
        mp3header.protectionAbsent = datasource.readBits(1);
        mp3header.bitRateIndex = datasource.readBits(4);
        mp3header.bitRate = BIT_RATE[mp3header.bitRateIndex];
        if (mp3header.bitRate == 0)
        {
            throw new IOException("Unexpected (free/bad) bit rate");
        }
        mp3header.sampleFrequencyIndex = datasource.readBits(2);
        mp3header.sampleRate = SAMPLE_RATE[mp3header.sampleFrequencyIndex];
        if (mp3header.sampleRate == 0)
        {
            throw new IOException("Unexpected (reserved) sample rate frequency");
        }
        mp3header.padding = datasource.readBits(1);
        datasource.readBits(1);
        mp3header.channelMode = datasource.readBits(2);
        int i;
        if (mp3header.channelMode == 3)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        mp3header.channelCount = i;
        return mp3header;
    }

    private MP3Header readSamples(DataSource datasource)
    {
        Object obj1 = null;
        do
        {
            long l = datasource.position();
            MP3Header mp3header = readMP3Header(datasource);
            if (mp3header != null)
            {
                Object obj = obj1;
                if (obj1 == null)
                {
                    obj = mp3header;
                }
                datasource.position(l);
                obj1 = ByteBuffer.allocate(mp3header.getFrameLength());
                datasource.read(((ByteBuffer) (obj1)));
                ((ByteBuffer) (obj1)).rewind();
                samples.add(new SampleImpl(((ByteBuffer) (obj1))));
                obj1 = obj;
            } else
            {
                return ((MP3Header) (obj1));
            }
        } while (true);
    }

    public void close()
    {
        dataSource.close();
    }

    public String getHandler()
    {
        return "soun";
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return sampleDescriptionBox;
    }

    public long[] getSampleDurations()
    {
        return durations;
    }

    public List getSamples()
    {
        return samples;
    }

    public TrackMetaData getTrackMetaData()
    {
        return trackMetaData;
    }

    public String toString()
    {
        return "MP3TrackImpl";
    }

    static 
    {
        int ai[] = new int[4];
        ai[0] = 44100;
        ai[1] = 48000;
        ai[2] = 32000;
        SAMPLE_RATE = ai;
        ai = new int[16];
        ai[1] = 32000;
        ai[2] = 40000;
        ai[3] = 48000;
        ai[4] = 56000;
        ai[5] = 64000;
        ai[6] = 0x13880;
        ai[7] = 0x17700;
        ai[8] = 0x1b580;
        ai[9] = 0x1f400;
        ai[10] = 0x27100;
        ai[11] = 0x2ee00;
        ai[12] = 0x36b00;
        ai[13] = 0x3e800;
        ai[14] = 0x4e200;
        BIT_RATE = ai;
    }
}
