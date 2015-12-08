// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AACTrackImpl extends AbstractTrack
{
    class AdtsHeader
    {

        int bufferFullness;
        int channelconfig;
        int copyrightStart;
        int copyrightedStream;
        int frameLength;
        int home;
        int layer;
        int mpegVersion;
        int numAacFramesPerAdtsFrame;
        int original;
        int profile;
        int protectionAbsent;
        int sampleFrequencyIndex;
        int sampleRate;
        final AACTrackImpl this$0;

        int getSize()
        {
            byte byte0;
            if (protectionAbsent == 0)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            return byte0 + 7;
        }

        AdtsHeader()
        {
            this$0 = AACTrackImpl.this;
            super();
        }
    }


    static Map audioObjectTypes;
    public static Map samplingFrequencyIndexMap;
    long avgBitRate;
    int bufferSizeDB;
    private DataSource dataSource;
    long decTimes[];
    AdtsHeader firstHeader;
    private String lang;
    long maxBitRate;
    SampleDescriptionBox sampleDescriptionBox;
    private List samples;
    TrackMetaData trackMetaData;

    public AACTrackImpl(DataSource datasource)
    {
        this(datasource, "eng");
    }

    public AACTrackImpl(DataSource datasource, String s)
    {
        super(datasource.toString());
        trackMetaData = new TrackMetaData();
        lang = "eng";
        lang = s;
        dataSource = datasource;
        samples = new ArrayList();
        firstHeader = readSamples(datasource);
        double d = (double)firstHeader.sampleRate / 1024D;
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
                    bufferSizeDB = 1536;
                    sampleDescriptionBox = new SampleDescriptionBox();
                    datasource = new AudioSampleEntry("mp4a");
                    double d2;
                    Object obj1;
                    Object obj2;
                    AudioSpecificConfig audiospecificconfig;
                    int i;
                    long l1;
                    if (firstHeader.channelconfig == 7)
                    {
                        datasource.setChannelCount(8);
                    } else
                    {
                        datasource.setChannelCount(firstHeader.channelconfig);
                    }
                    datasource.setSampleRate(firstHeader.sampleRate);
                    datasource.setDataReferenceIndex(1);
                    datasource.setSampleSize(16);
                    obj = new ESDescriptorBox();
                    obj1 = new ESDescriptor();
                    ((ESDescriptor) (obj1)).setEsId(0);
                    obj2 = new SLConfigDescriptor();
                    ((SLConfigDescriptor) (obj2)).setPredefined(2);
                    ((ESDescriptor) (obj1)).setSlConfigDescriptor(((SLConfigDescriptor) (obj2)));
                    obj2 = new DecoderConfigDescriptor();
                    ((DecoderConfigDescriptor) (obj2)).setObjectTypeIndication(64);
                    ((DecoderConfigDescriptor) (obj2)).setStreamType(5);
                    ((DecoderConfigDescriptor) (obj2)).setBufferSizeDB(bufferSizeDB);
                    ((DecoderConfigDescriptor) (obj2)).setMaxBitRate(maxBitRate);
                    ((DecoderConfigDescriptor) (obj2)).setAvgBitRate(avgBitRate);
                    audiospecificconfig = new AudioSpecificConfig();
                    audiospecificconfig.setAudioObjectType(2);
                    audiospecificconfig.setSamplingFrequencyIndex(firstHeader.sampleFrequencyIndex);
                    audiospecificconfig.setChannelConfiguration(firstHeader.channelconfig);
                    ((DecoderConfigDescriptor) (obj2)).setAudioSpecificInfo(audiospecificconfig);
                    ((ESDescriptor) (obj1)).setDecoderConfigDescriptor(((DecoderConfigDescriptor) (obj2)));
                    obj2 = ((ESDescriptor) (obj1)).serialize();
                    ((ESDescriptorBox) (obj)).setEsDescriptor(((ESDescriptor) (obj1)));
                    ((ESDescriptorBox) (obj)).setData(((ByteBuffer) (obj2)));
                    datasource.addBox(((com.coremedia.iso.boxes.Box) (obj)));
                    sampleDescriptionBox.addBox(datasource);
                    trackMetaData.setCreationTime(new Date());
                    trackMetaData.setModificationTime(new Date());
                    trackMetaData.setLanguage(s);
                    trackMetaData.setVolume(1.0F);
                    trackMetaData.setTimescale(firstHeader.sampleRate);
                    decTimes = new long[samples.size()];
                    Arrays.fill(decTimes, 1024L);
                    return;
                }
                i = (int)((Sample)((Iterator) (obj)).next()).getSize();
                l1 = l + (long)i;
                datasource.add(Integer.valueOf(i));
                for (; (double)datasource.size() > d; datasource.pop())
                {
                    break label0;
                }

                l = l1;
                if (datasource.size() == (int)d)
                {
                    obj1 = datasource.iterator();
                    for (i = 0; ((Iterator) (obj1)).hasNext(); i = ((Integer)((Iterator) (obj1)).next()).intValue() + i)
                    {
                        break MISSING_BLOCK_LABEL_600;
                    }

                    d2 = (((double)i * 8D) / (double)datasource.size()) * d;
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

    private AdtsHeader readADTSHeader(DataSource datasource)
    {
        AdtsHeader adtsheader = new AdtsHeader();
        Object obj = ByteBuffer.allocate(7);
        do
        {
            if (((ByteBuffer) (obj)).position() >= 7)
            {
                obj = new BitReaderBuffer((ByteBuffer)((ByteBuffer) (obj)).rewind());
                if (((BitReaderBuffer) (obj)).readBits(12) != 4095)
                {
                    throw new IOException("Expected Start Word 0xfff");
                }
                break;
            }
            if (datasource.read(((ByteBuffer) (obj))) == -1)
            {
                return null;
            }
        } while (true);
        adtsheader.mpegVersion = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.layer = ((BitReaderBuffer) (obj)).readBits(2);
        adtsheader.protectionAbsent = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.profile = ((BitReaderBuffer) (obj)).readBits(2) + 1;
        adtsheader.sampleFrequencyIndex = ((BitReaderBuffer) (obj)).readBits(4);
        adtsheader.sampleRate = ((Integer)samplingFrequencyIndexMap.get(Integer.valueOf(adtsheader.sampleFrequencyIndex))).intValue();
        ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.channelconfig = ((BitReaderBuffer) (obj)).readBits(3);
        adtsheader.original = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.home = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.copyrightedStream = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.copyrightStart = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.frameLength = ((BitReaderBuffer) (obj)).readBits(13);
        adtsheader.bufferFullness = ((BitReaderBuffer) (obj)).readBits(11);
        adtsheader.numAacFramesPerAdtsFrame = ((BitReaderBuffer) (obj)).readBits(2) + 1;
        if (adtsheader.numAacFramesPerAdtsFrame != 1)
        {
            throw new IOException("This muxer can only work with 1 AAC frame per ADTS frame");
        }
        if (adtsheader.protectionAbsent == 0)
        {
            datasource.read(ByteBuffer.allocate(2));
        }
        return adtsheader;
    }

    private AdtsHeader readSamples(DataSource datasource)
    {
        AdtsHeader adtsheader = null;
        do
        {
            AdtsHeader adtsheader1 = readADTSHeader(datasource);
            if (adtsheader1 == null)
            {
                return adtsheader;
            }
            if (adtsheader == null)
            {
                adtsheader = adtsheader1;
            }
            final long currentPosition = datasource.position();
            final long frameSize = adtsheader1.frameLength - adtsheader1.getSize();
            samples.add(new _cls1());
            datasource.position((datasource.position() + (long)adtsheader1.frameLength) - (long)adtsheader1.getSize());
        } while (true);
    }

    public void close()
    {
        dataSource.close();
    }

    public List getCompositionTimeEntries()
    {
        return null;
    }

    public String getHandler()
    {
        return "soun";
    }

    public List getSampleDependencies()
    {
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return sampleDescriptionBox;
    }

    public long[] getSampleDurations()
    {
        return decTimes;
    }

    public List getSamples()
    {
        return samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return null;
    }

    public long[] getSyncSamples()
    {
        return null;
    }

    public TrackMetaData getTrackMetaData()
    {
        return trackMetaData;
    }

    public String toString()
    {
        return (new StringBuilder("AACTrackImpl{sampleRate=")).append(firstHeader.sampleRate).append(", channelconfig=").append(firstHeader.channelconfig).append('}').toString();
    }

    static 
    {
        HashMap hashmap = new HashMap();
        audioObjectTypes = hashmap;
        hashmap.put(Integer.valueOf(1), "AAC Main");
        audioObjectTypes.put(Integer.valueOf(2), "AAC LC (Low Complexity)");
        audioObjectTypes.put(Integer.valueOf(3), "AAC SSR (Scalable Sample Rate)");
        audioObjectTypes.put(Integer.valueOf(4), "AAC LTP (Long Term Prediction)");
        audioObjectTypes.put(Integer.valueOf(5), "SBR (Spectral Band Replication)");
        audioObjectTypes.put(Integer.valueOf(6), "AAC Scalable");
        audioObjectTypes.put(Integer.valueOf(7), "TwinVQ");
        audioObjectTypes.put(Integer.valueOf(8), "CELP (Code Excited Linear Prediction)");
        audioObjectTypes.put(Integer.valueOf(9), "HXVC (Harmonic Vector eXcitation Coding)");
        audioObjectTypes.put(Integer.valueOf(10), "Reserved");
        audioObjectTypes.put(Integer.valueOf(11), "Reserved");
        audioObjectTypes.put(Integer.valueOf(12), "TTSI (Text-To-Speech Interface)");
        audioObjectTypes.put(Integer.valueOf(13), "Main Synthesis");
        audioObjectTypes.put(Integer.valueOf(14), "Wavetable Synthesis");
        audioObjectTypes.put(Integer.valueOf(15), "General MIDI");
        audioObjectTypes.put(Integer.valueOf(16), "Algorithmic Synthesis and Audio Effects");
        audioObjectTypes.put(Integer.valueOf(17), "ER (Error Resilient) AAC LC");
        audioObjectTypes.put(Integer.valueOf(18), "Reserved");
        audioObjectTypes.put(Integer.valueOf(19), "ER AAC LTP");
        audioObjectTypes.put(Integer.valueOf(20), "ER AAC Scalable");
        audioObjectTypes.put(Integer.valueOf(21), "ER TwinVQ");
        audioObjectTypes.put(Integer.valueOf(22), "ER BSAC (Bit-Sliced Arithmetic Coding)");
        audioObjectTypes.put(Integer.valueOf(23), "ER AAC LD (Low Delay)");
        audioObjectTypes.put(Integer.valueOf(24), "ER CELP");
        audioObjectTypes.put(Integer.valueOf(25), "ER HVXC");
        audioObjectTypes.put(Integer.valueOf(26), "ER HILN (Harmonic and Individual Lines plus Noise)");
        audioObjectTypes.put(Integer.valueOf(27), "ER Parametric");
        audioObjectTypes.put(Integer.valueOf(28), "SSC (SinuSoidal Coding)");
        audioObjectTypes.put(Integer.valueOf(29), "PS (Parametric Stereo)");
        audioObjectTypes.put(Integer.valueOf(30), "MPEG Surround");
        audioObjectTypes.put(Integer.valueOf(31), "(Escape value)");
        audioObjectTypes.put(Integer.valueOf(32), "Layer-1");
        audioObjectTypes.put(Integer.valueOf(33), "Layer-2");
        audioObjectTypes.put(Integer.valueOf(34), "Layer-3");
        audioObjectTypes.put(Integer.valueOf(35), "DST (Direct Stream Transfer)");
        audioObjectTypes.put(Integer.valueOf(36), "ALS (Audio Lossless)");
        audioObjectTypes.put(Integer.valueOf(37), "SLS (Scalable LosslesS)");
        audioObjectTypes.put(Integer.valueOf(38), "SLS non-core");
        audioObjectTypes.put(Integer.valueOf(39), "ER AAC ELD (Enhanced Low Delay)");
        audioObjectTypes.put(Integer.valueOf(40), "SMR (Symbolic Music Representation) Simple");
        audioObjectTypes.put(Integer.valueOf(41), "SMR Main");
        audioObjectTypes.put(Integer.valueOf(42), "USAC (Unified Speech and Audio Coding) (no SBR)");
        audioObjectTypes.put(Integer.valueOf(43), "SAOC (Spatial Audio Object Coding)");
        audioObjectTypes.put(Integer.valueOf(44), "LD MPEG Surround");
        audioObjectTypes.put(Integer.valueOf(45), "USAC");
        hashmap = new HashMap();
        samplingFrequencyIndexMap = hashmap;
        hashmap.put(Integer.valueOf(0x17700), Integer.valueOf(0));
        samplingFrequencyIndexMap.put(Integer.valueOf(0x15888), Integer.valueOf(1));
        samplingFrequencyIndexMap.put(Integer.valueOf(64000), Integer.valueOf(2));
        samplingFrequencyIndexMap.put(Integer.valueOf(48000), Integer.valueOf(3));
        samplingFrequencyIndexMap.put(Integer.valueOf(44100), Integer.valueOf(4));
        samplingFrequencyIndexMap.put(Integer.valueOf(32000), Integer.valueOf(5));
        samplingFrequencyIndexMap.put(Integer.valueOf(24000), Integer.valueOf(6));
        samplingFrequencyIndexMap.put(Integer.valueOf(22050), Integer.valueOf(7));
        samplingFrequencyIndexMap.put(Integer.valueOf(16000), Integer.valueOf(8));
        samplingFrequencyIndexMap.put(Integer.valueOf(12000), Integer.valueOf(9));
        samplingFrequencyIndexMap.put(Integer.valueOf(11025), Integer.valueOf(10));
        samplingFrequencyIndexMap.put(Integer.valueOf(8000), Integer.valueOf(11));
        samplingFrequencyIndexMap.put(Integer.valueOf(0), Integer.valueOf(0x17700));
        samplingFrequencyIndexMap.put(Integer.valueOf(1), Integer.valueOf(0x15888));
        samplingFrequencyIndexMap.put(Integer.valueOf(2), Integer.valueOf(64000));
        samplingFrequencyIndexMap.put(Integer.valueOf(3), Integer.valueOf(48000));
        samplingFrequencyIndexMap.put(Integer.valueOf(4), Integer.valueOf(44100));
        samplingFrequencyIndexMap.put(Integer.valueOf(5), Integer.valueOf(32000));
        samplingFrequencyIndexMap.put(Integer.valueOf(6), Integer.valueOf(24000));
        samplingFrequencyIndexMap.put(Integer.valueOf(7), Integer.valueOf(22050));
        samplingFrequencyIndexMap.put(Integer.valueOf(8), Integer.valueOf(16000));
        samplingFrequencyIndexMap.put(Integer.valueOf(9), Integer.valueOf(12000));
        samplingFrequencyIndexMap.put(Integer.valueOf(10), Integer.valueOf(11025));
        samplingFrequencyIndexMap.put(Integer.valueOf(11), Integer.valueOf(8000));
    }


    private class _cls1
        implements Sample
    {

        final AACTrackImpl this$0;
        private final long val$currentPosition;
        private final long val$frameSize;

        public ByteBuffer asByteBuffer()
        {
            ByteBuffer bytebuffer;
            try
            {
                bytebuffer = dataSource.map(currentPosition, frameSize);
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return bytebuffer;
        }

        public long getSize()
        {
            return frameSize;
        }

        public void writeTo(WritableByteChannel writablebytechannel)
        {
            dataSource.transferTo(currentPosition, frameSize, writablebytechannel);
        }

        _cls1()
        {
            this$0 = AACTrackImpl.this;
            currentPosition = l;
            frameSize = l1;
            super();
        }
    }

}
