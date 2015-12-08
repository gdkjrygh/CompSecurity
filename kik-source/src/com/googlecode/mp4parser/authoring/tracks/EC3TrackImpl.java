// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EC3TrackImpl extends AbstractTrack
{
    public static class BitStreamInfo extends com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry
    {

        public int bitrate;
        public int chanmap;
        public int frameSize;
        public int samplerate;
        public int strmtyp;
        public int substreamid;

        public String toString()
        {
            return (new StringBuilder("BitStreamInfo{frameSize=")).append(frameSize).append(", substreamid=").append(substreamid).append(", bitrate=").append(bitrate).append(", samplerate=").append(samplerate).append(", strmtyp=").append(strmtyp).append(", chanmap=").append(chanmap).append('}').toString();
        }

        public BitStreamInfo()
        {
        }
    }


    private static final long MAX_FRAMES_PER_MMAP = 20L;
    private List bitStreamInfos;
    private int bitrate;
    private final DataSource dataSource;
    private long decodingTimes[];
    private int frameSize;
    SampleDescriptionBox sampleDescriptionBox;
    private List samples;
    TrackMetaData trackMetaData;

    public EC3TrackImpl(DataSource datasource)
    {
        super(datasource.toString());
        trackMetaData = new TrackMetaData();
        bitStreamInfos = new LinkedList();
        dataSource = datasource;
        boolean flag = false;
        do
        {
label0:
            {
                if (flag)
                {
                    if (bitStreamInfos.size() == 0)
                    {
                        throw new IOException();
                    }
                    break label0;
                }
                BitStreamInfo bitstreaminfo = readVariables();
                if (bitstreaminfo == null)
                {
                    throw new IOException();
                }
                Iterator iterator = bitStreamInfos.iterator();
                do
                {
label1:
                    {
                        if (iterator.hasNext())
                        {
                            break label1;
                        }
                        if (!flag)
                        {
                            bitStreamInfos.add(bitstreaminfo);
                        }
                    }
                    if (true)
                    {
                        break;
                    }
                    BitStreamInfo bitstreaminfo1 = (BitStreamInfo)iterator.next();
                    if (bitstreaminfo.strmtyp != 1 && bitstreaminfo1.substreamid == bitstreaminfo.substreamid)
                    {
                        flag = true;
                    }
                } while (true);
            }
        } while (true);
        AudioSampleEntry audiosampleentry;
        EC3SpecificBox ec3specificbox;
        int ai[];
        int ai1[];
        Iterator iterator1;
        int i;
        i = ((BitStreamInfo)bitStreamInfos.get(0)).samplerate;
        sampleDescriptionBox = new SampleDescriptionBox();
        audiosampleentry = new AudioSampleEntry("ec-3");
        audiosampleentry.setChannelCount(2);
        audiosampleentry.setSampleRate(i);
        audiosampleentry.setDataReferenceIndex(1);
        audiosampleentry.setSampleSize(16);
        ec3specificbox = new EC3SpecificBox();
        ai = new int[bitStreamInfos.size()];
        ai1 = new int[bitStreamInfos.size()];
        iterator1 = bitStreamInfos.iterator();
_L3:
        if (iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        iterator1 = bitStreamInfos.iterator();
_L4:
        if (!iterator1.hasNext())
        {
            ec3specificbox.setDataRate(bitrate / 1000);
            audiosampleentry.addBox(ec3specificbox);
            sampleDescriptionBox.addBox(audiosampleentry);
            trackMetaData.setCreationTime(new Date());
            trackMetaData.setModificationTime(new Date());
            trackMetaData.setTimescale(i);
            trackMetaData.setVolume(1.0F);
            datasource.position(0L);
            samples = readSamples();
            decodingTimes = new long[samples.size()];
            Arrays.fill(decodingTimes, 1536L);
            return;
        }
        break MISSING_BLOCK_LABEL_488;
_L2:
        BitStreamInfo bitstreaminfo2 = (BitStreamInfo)iterator1.next();
        if (bitstreaminfo2.strmtyp == 1)
        {
            int j = bitstreaminfo2.substreamid;
            ai[j] = ai[j] + 1;
            j = bitstreaminfo2.substreamid;
            int l = bitstreaminfo2.chanmap;
            ai1[j] = bitstreaminfo2.chanmap >> 5 & 0xff | l >> 6 & 0x100;
        }
          goto _L3
        BitStreamInfo bitstreaminfo3 = (BitStreamInfo)iterator1.next();
        if (bitstreaminfo3.strmtyp != 1)
        {
            com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry entry = new com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry();
            entry.fscod = bitstreaminfo3.fscod;
            entry.bsid = bitstreaminfo3.bsid;
            entry.bsmod = bitstreaminfo3.bsmod;
            entry.acmod = bitstreaminfo3.acmod;
            entry.lfeon = bitstreaminfo3.lfeon;
            entry.reserved = 0;
            entry.num_dep_sub = ai[bitstreaminfo3.substreamid];
            entry.chan_loc = ai1[bitstreaminfo3.substreamid];
            entry.reserved2 = 0;
            ec3specificbox.addEntry(entry);
        }
        bitrate = bitrate + bitstreaminfo3.bitrate;
        int k = frameSize;
        frameSize = bitstreaminfo3.frameSize + k;
          goto _L4
    }

    private List readSamples()
    {
        int j = CastUtils.l2i((dataSource.size() - dataSource.position()) / (long)frameSize);
        ArrayList arraylist = new ArrayList(j);
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            arraylist.add(new _cls1());
            i++;
        } while (true);
    }

    private BitStreamInfo readVariables()
    {
        Object obj;
        BitStreamInfo bitstreaminfo;
        int i;
        int j;
        int i1;
        long l1;
        l1 = dataSource.position();
        obj = ByteBuffer.allocate(200);
        dataSource.read(((ByteBuffer) (obj)));
        ((ByteBuffer) (obj)).rewind();
        obj = new BitReaderBuffer(((ByteBuffer) (obj)));
        if (((BitReaderBuffer) (obj)).readBits(16) != 2935)
        {
            return null;
        }
        bitstreaminfo = new BitStreamInfo();
        bitstreaminfo.strmtyp = ((BitReaderBuffer) (obj)).readBits(2);
        bitstreaminfo.substreamid = ((BitReaderBuffer) (obj)).readBits(3);
        bitstreaminfo.frameSize = (((BitReaderBuffer) (obj)).readBits(11) + 1) * 2;
        bitstreaminfo.fscod = ((BitReaderBuffer) (obj)).readBits(2);
        int k;
        if (bitstreaminfo.fscod == 3)
        {
            j = ((BitReaderBuffer) (obj)).readBits(2);
            k = 3;
        } else
        {
            k = ((BitReaderBuffer) (obj)).readBits(2);
            j = -1;
        }
        i = 0;
        k;
        JVM INSTR tableswitch 0 3: default 160
    //                   0 598
    //                   1 603
    //                   2 608
    //                   3 613;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        bitstreaminfo.frameSize = bitstreaminfo.frameSize * (6 / i);
        bitstreaminfo.acmod = ((BitReaderBuffer) (obj)).readBits(3);
        bitstreaminfo.lfeon = ((BitReaderBuffer) (obj)).readBits(1);
        bitstreaminfo.bsid = ((BitReaderBuffer) (obj)).readBits(5);
        ((BitReaderBuffer) (obj)).readBits(5);
        if (1 == ((BitReaderBuffer) (obj)).readBits(1))
        {
            ((BitReaderBuffer) (obj)).readBits(8);
        }
        if (bitstreaminfo.acmod == 0)
        {
            ((BitReaderBuffer) (obj)).readBits(5);
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(8);
            }
        }
        if (1 == bitstreaminfo.strmtyp && 1 == ((BitReaderBuffer) (obj)).readBits(1))
        {
            bitstreaminfo.chanmap = ((BitReaderBuffer) (obj)).readBits(16);
        }
        if (1 != ((BitReaderBuffer) (obj)).readBits(1)) goto _L7; else goto _L6
_L6:
        if (bitstreaminfo.acmod > 2)
        {
            ((BitReaderBuffer) (obj)).readBits(2);
        }
        if (1 == (bitstreaminfo.acmod & 1) && bitstreaminfo.acmod > 2)
        {
            ((BitReaderBuffer) (obj)).readBits(3);
            ((BitReaderBuffer) (obj)).readBits(3);
        }
        if ((bitstreaminfo.acmod & 4) > 0)
        {
            ((BitReaderBuffer) (obj)).readBits(3);
            ((BitReaderBuffer) (obj)).readBits(3);
        }
        if (1 == bitstreaminfo.lfeon && 1 == ((BitReaderBuffer) (obj)).readBits(1))
        {
            ((BitReaderBuffer) (obj)).readBits(5);
        }
        if (bitstreaminfo.strmtyp != 0) goto _L7; else goto _L8
_L8:
        if (1 == ((BitReaderBuffer) (obj)).readBits(1))
        {
            ((BitReaderBuffer) (obj)).readBits(6);
        }
        if (bitstreaminfo.acmod == 0 && 1 == ((BitReaderBuffer) (obj)).readBits(1))
        {
            ((BitReaderBuffer) (obj)).readBits(6);
        }
        if (1 == ((BitReaderBuffer) (obj)).readBits(1))
        {
            ((BitReaderBuffer) (obj)).readBits(6);
        }
        i1 = ((BitReaderBuffer) (obj)).readBits(2);
        if (1 != i1) goto _L10; else goto _L9
_L9:
        ((BitReaderBuffer) (obj)).readBits(5);
_L18:
        if (bitstreaminfo.acmod < 2)
        {
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(14);
            }
            if (bitstreaminfo.acmod == 0 && 1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(14);
            }
            int j1;
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                if (k == 0)
                {
                    ((BitReaderBuffer) (obj)).readBits(5);
                } else
                {
                    int l = 0;
                    while (l < i) 
                    {
                        if (1 == ((BitReaderBuffer) (obj)).readBits(1))
                        {
                            ((BitReaderBuffer) (obj)).readBits(5);
                        }
                        l++;
                    }
                }
            }
        }
_L7:
        if (1 == ((BitReaderBuffer) (obj)).readBits(1))
        {
            bitstreaminfo.bsmod = ((BitReaderBuffer) (obj)).readBits(3);
        }
        bitstreaminfo.fscod;
        JVM INSTR tableswitch 0 3: default 576
    //                   0 923
    //                   1 933
    //                   2 943
    //                   3 953;
           goto _L11 _L12 _L13 _L14 _L15
_L11:
        if (bitstreaminfo.samplerate == 0)
        {
            return null;
        } else
        {
            bitstreaminfo.bitrate = (int)(((double)bitstreaminfo.samplerate / 1536D) * (double)bitstreaminfo.frameSize * 8D);
            dataSource.position((long)bitstreaminfo.frameSize + l1);
            return bitstreaminfo;
        }
_L2:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 3;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 6;
        continue; /* Loop/switch isn't completed */
_L10:
        if (2 != i1) goto _L17; else goto _L16
_L16:
        ((BitReaderBuffer) (obj)).readBits(12);
          goto _L18
_L17:
        if (3 != i1) goto _L18; else goto _L19
_L19:
        j1 = ((BitReaderBuffer) (obj)).readBits(5);
        if (1 == ((BitReaderBuffer) (obj)).readBits(1))
        {
            ((BitReaderBuffer) (obj)).readBits(5);
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(4);
            }
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(4);
            }
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(4);
            }
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(4);
            }
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(4);
            }
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(4);
            }
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(4);
            }
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                if (1 == ((BitReaderBuffer) (obj)).readBits(1))
                {
                    ((BitReaderBuffer) (obj)).readBits(4);
                }
                if (1 == ((BitReaderBuffer) (obj)).readBits(1))
                {
                    ((BitReaderBuffer) (obj)).readBits(4);
                }
            }
        }
        if (1 == ((BitReaderBuffer) (obj)).readBits(1))
        {
            ((BitReaderBuffer) (obj)).readBits(5);
            if (1 == ((BitReaderBuffer) (obj)).readBits(1))
            {
                ((BitReaderBuffer) (obj)).readBits(7);
                if (1 == ((BitReaderBuffer) (obj)).readBits(1))
                {
                    ((BitReaderBuffer) (obj)).readBits(8);
                }
            }
        }
        i1 = 0;
_L20:
label0:
        {
            if (i1 < j1 + 2)
            {
                break label0;
            }
            ((BitReaderBuffer) (obj)).byteSync();
        }
          goto _L18
        ((BitReaderBuffer) (obj)).readBits(8);
        i1++;
          goto _L20
_L12:
        bitstreaminfo.samplerate = 48000;
          goto _L11
_L13:
        bitstreaminfo.samplerate = 44100;
          goto _L11
_L14:
        bitstreaminfo.samplerate = 32000;
          goto _L11
_L15:
        switch (j)
        {
        case 0: // '\0'
            bitstreaminfo.samplerate = 24000;
            break;

        case 1: // '\001'
            bitstreaminfo.samplerate = 22050;
            break;

        case 2: // '\002'
            bitstreaminfo.samplerate = 16000;
            break;

        case 3: // '\003'
            bitstreaminfo.samplerate = 0;
            break;
        }
        if (true) goto _L11; else goto _L21
_L21:
        if (true) goto _L1; else goto _L22
_L22:
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
        return decodingTimes;
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
        return (new StringBuilder("EC3TrackImpl{bitrate=")).append(bitrate).append(", bitStreamInfos=").append(bitStreamInfos).append('}').toString();
    }



    private class _cls1
        implements Sample
    {

        final EC3TrackImpl this$0;
        private final int val$start;

        public ByteBuffer asByteBuffer()
        {
            ByteBuffer bytebuffer;
            try
            {
                bytebuffer = dataSource.map(start, frameSize);
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return bytebuffer;
        }

        public long getSize()
        {
            return (long)frameSize;
        }

        public void writeTo(WritableByteChannel writablebytechannel)
        {
            dataSource.transferTo(start, frameSize, writablebytechannel);
        }

        _cls1()
        {
            this$0 = EC3TrackImpl.this;
            start = i;
            super();
        }
    }

}
