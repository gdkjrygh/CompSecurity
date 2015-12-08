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
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AC3TrackImpl extends AbstractTrack
{

    static int bitRateAndFrameSizeTable[][][][];
    private final DataSource dataSource;
    private long duration[];
    private SampleDescriptionBox sampleDescriptionBox;
    private List samples;
    private TrackMetaData trackMetaData;

    public AC3TrackImpl(DataSource datasource)
    {
        this(datasource, "eng");
    }

    public AC3TrackImpl(DataSource datasource, String s)
    {
        super(datasource.toString());
        trackMetaData = new TrackMetaData();
        dataSource = datasource;
        trackMetaData.setLanguage(s);
        samples = readSamples();
        sampleDescriptionBox = new SampleDescriptionBox();
        datasource = createAudioSampleEntry();
        sampleDescriptionBox.addBox(datasource);
        trackMetaData.setCreationTime(new Date());
        trackMetaData.setModificationTime(new Date());
        trackMetaData.setLanguage(s);
        trackMetaData.setTimescale(datasource.getSampleRate());
        trackMetaData.setVolume(1.0F);
    }

    private AudioSampleEntry createAudioSampleEntry()
    {
        Object obj;
        int k;
        obj = new BitReaderBuffer(((Sample)samples.get(0)).asByteBuffer());
        if (((BitReaderBuffer) (obj)).readBits(16) != 2935)
        {
            throw new RuntimeException("Stream doesn't seem to be AC3");
        }
        ((BitReaderBuffer) (obj)).readBits(16);
        k = ((BitReaderBuffer) (obj)).readBits(2);
        k;
        JVM INSTR tableswitch 0 2: default 92
    //                   0 102
    //                   1 151
    //                   2 157;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new RuntimeException("Unsupported Sample Rate");
_L2:
        int i = 48000;
_L6:
        int l;
        int i1;
        int j1;
        int k1;
        l = ((BitReaderBuffer) (obj)).readBits(6);
        i1 = ((BitReaderBuffer) (obj)).readBits(5);
        j1 = ((BitReaderBuffer) (obj)).readBits(3);
        k1 = ((BitReaderBuffer) (obj)).readBits(3);
        if (i1 == 16)
        {
            throw new RuntimeException("You cannot read E-AC-3 track with AC3TrackImpl.class - user EC3TrackImpl.class");
        }
        break; /* Loop/switch isn't completed */
_L3:
        i = 44100;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 32000;
        if (true) goto _L6; else goto _L5
_L5:
        int j;
        if (i1 == 9)
        {
            j = i / 2;
        } else
        {
            j = i;
            if (i1 != 8)
            {
                j = i;
                if (i1 != 6)
                {
                    throw new RuntimeException("Unsupported bsid");
                }
            }
        }
        if (k1 != 1 && (k1 & 1) == 1)
        {
            ((BitReaderBuffer) (obj)).readBits(2);
        }
        if ((k1 & 4) != 0)
        {
            ((BitReaderBuffer) (obj)).readBits(2);
        }
        if (k1 == 2)
        {
            ((BitReaderBuffer) (obj)).readBits(2);
        }
        switch (k1)
        {
        default:
            throw new RuntimeException("Unsupported acmod");

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            i = ((BitReaderBuffer) (obj)).readBits(1);
            break;
        }
        obj = new AudioSampleEntry("ac-3");
        ((AudioSampleEntry) (obj)).setChannelCount(2);
        ((AudioSampleEntry) (obj)).setSampleRate(j);
        ((AudioSampleEntry) (obj)).setDataReferenceIndex(1);
        ((AudioSampleEntry) (obj)).setSampleSize(16);
        AC3SpecificBox ac3specificbox = new AC3SpecificBox();
        ac3specificbox.setAcmod(k1);
        ac3specificbox.setBitRateCode(l >> 1);
        ac3specificbox.setBsid(i1);
        ac3specificbox.setBsmod(j1);
        ac3specificbox.setFscod(k);
        ac3specificbox.setLfeon(i);
        ac3specificbox.setReserved(0);
        ((AudioSampleEntry) (obj)).addBox(ac3specificbox);
        return ((AudioSampleEntry) (obj));
    }

    private int getFrameSize(int i, int j)
    {
        int k = i >>> 1;
        i &= 1;
        if (k > 18 || i > 1 || j > 2)
        {
            throw new RuntimeException("Cannot determine framesize of current sample");
        } else
        {
            return bitRateAndFrameSizeTable[k][i][j][1] * 2;
        }
    }

    private List readSamples()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(5);
        ArrayList arraylist = new ArrayList();
        do
        {
            if (-1 == dataSource.read(bytebuffer))
            {
                duration = new long[arraylist.size()];
                Arrays.fill(duration, 1536L);
                return arraylist;
            }
            int i = getFrameSize(bytebuffer.get(4) & 0x3f, bytebuffer.get(4) >> 6);
            arraylist.add(new _cls1SampleImpl(dataSource.position() - 5L, i, dataSource));
            dataSource.position((dataSource.position() - 5L) + (long)i);
            bytebuffer.rewind();
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
        this;
        JVM INSTR monitorenter ;
        long al[] = duration;
        this;
        JVM INSTR monitorexit ;
        return al;
        Exception exception;
        exception;
        throw exception;
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

    static 
    {
        int ai[][][][] = (int[][][][])Array.newInstance(Integer.TYPE, new int[] {
            19, 2, 3, 2
        });
        bitRateAndFrameSizeTable = ai;
        ai[0][0][0][0] = 32;
        bitRateAndFrameSizeTable[0][1][0][0] = 32;
        bitRateAndFrameSizeTable[0][0][0][1] = 64;
        bitRateAndFrameSizeTable[0][1][0][1] = 64;
        bitRateAndFrameSizeTable[1][0][0][0] = 40;
        bitRateAndFrameSizeTable[1][1][0][0] = 40;
        bitRateAndFrameSizeTable[1][0][0][1] = 80;
        bitRateAndFrameSizeTable[1][1][0][1] = 80;
        bitRateAndFrameSizeTable[2][0][0][0] = 48;
        bitRateAndFrameSizeTable[2][1][0][0] = 48;
        bitRateAndFrameSizeTable[2][0][0][1] = 96;
        bitRateAndFrameSizeTable[2][1][0][1] = 96;
        bitRateAndFrameSizeTable[3][0][0][0] = 56;
        bitRateAndFrameSizeTable[3][1][0][0] = 56;
        bitRateAndFrameSizeTable[3][0][0][1] = 112;
        bitRateAndFrameSizeTable[3][1][0][1] = 112;
        bitRateAndFrameSizeTable[4][0][0][0] = 64;
        bitRateAndFrameSizeTable[4][1][0][0] = 64;
        bitRateAndFrameSizeTable[4][0][0][1] = 128;
        bitRateAndFrameSizeTable[4][1][0][1] = 128;
        bitRateAndFrameSizeTable[5][0][0][0] = 80;
        bitRateAndFrameSizeTable[5][1][0][0] = 80;
        bitRateAndFrameSizeTable[5][0][0][1] = 160;
        bitRateAndFrameSizeTable[5][1][0][1] = 160;
        bitRateAndFrameSizeTable[6][0][0][0] = 96;
        bitRateAndFrameSizeTable[6][1][0][0] = 96;
        bitRateAndFrameSizeTable[6][0][0][1] = 192;
        bitRateAndFrameSizeTable[6][1][0][1] = 192;
        bitRateAndFrameSizeTable[7][0][0][0] = 112;
        bitRateAndFrameSizeTable[7][1][0][0] = 112;
        bitRateAndFrameSizeTable[7][0][0][1] = 224;
        bitRateAndFrameSizeTable[7][1][0][1] = 224;
        bitRateAndFrameSizeTable[8][0][0][0] = 128;
        bitRateAndFrameSizeTable[8][1][0][0] = 128;
        bitRateAndFrameSizeTable[8][0][0][1] = 256;
        bitRateAndFrameSizeTable[8][1][0][1] = 256;
        bitRateAndFrameSizeTable[9][0][0][0] = 160;
        bitRateAndFrameSizeTable[9][1][0][0] = 160;
        bitRateAndFrameSizeTable[9][0][0][1] = 320;
        bitRateAndFrameSizeTable[9][1][0][1] = 320;
        bitRateAndFrameSizeTable[10][0][0][0] = 192;
        bitRateAndFrameSizeTable[10][1][0][0] = 192;
        bitRateAndFrameSizeTable[10][0][0][1] = 384;
        bitRateAndFrameSizeTable[10][1][0][1] = 384;
        bitRateAndFrameSizeTable[11][0][0][0] = 224;
        bitRateAndFrameSizeTable[11][1][0][0] = 224;
        bitRateAndFrameSizeTable[11][0][0][1] = 448;
        bitRateAndFrameSizeTable[11][1][0][1] = 448;
        bitRateAndFrameSizeTable[12][0][0][0] = 256;
        bitRateAndFrameSizeTable[12][1][0][0] = 256;
        bitRateAndFrameSizeTable[12][0][0][1] = 512;
        bitRateAndFrameSizeTable[12][1][0][1] = 512;
        bitRateAndFrameSizeTable[13][0][0][0] = 320;
        bitRateAndFrameSizeTable[13][1][0][0] = 320;
        bitRateAndFrameSizeTable[13][0][0][1] = 640;
        bitRateAndFrameSizeTable[13][1][0][1] = 640;
        bitRateAndFrameSizeTable[14][0][0][0] = 384;
        bitRateAndFrameSizeTable[14][1][0][0] = 384;
        bitRateAndFrameSizeTable[14][0][0][1] = 768;
        bitRateAndFrameSizeTable[14][1][0][1] = 768;
        bitRateAndFrameSizeTable[15][0][0][0] = 448;
        bitRateAndFrameSizeTable[15][1][0][0] = 448;
        bitRateAndFrameSizeTable[15][0][0][1] = 896;
        bitRateAndFrameSizeTable[15][1][0][1] = 896;
        bitRateAndFrameSizeTable[16][0][0][0] = 512;
        bitRateAndFrameSizeTable[16][1][0][0] = 512;
        bitRateAndFrameSizeTable[16][0][0][1] = 1024;
        bitRateAndFrameSizeTable[16][1][0][1] = 1024;
        bitRateAndFrameSizeTable[17][0][0][0] = 576;
        bitRateAndFrameSizeTable[17][1][0][0] = 576;
        bitRateAndFrameSizeTable[17][0][0][1] = 1152;
        bitRateAndFrameSizeTable[17][1][0][1] = 1152;
        bitRateAndFrameSizeTable[18][0][0][0] = 640;
        bitRateAndFrameSizeTable[18][1][0][0] = 640;
        bitRateAndFrameSizeTable[18][0][0][1] = 1280;
        bitRateAndFrameSizeTable[18][1][0][1] = 1280;
        bitRateAndFrameSizeTable[0][0][1][0] = 32;
        bitRateAndFrameSizeTable[0][1][1][0] = 32;
        bitRateAndFrameSizeTable[0][0][1][1] = 69;
        bitRateAndFrameSizeTable[0][1][1][1] = 70;
        bitRateAndFrameSizeTable[1][0][1][0] = 40;
        bitRateAndFrameSizeTable[1][1][1][0] = 40;
        bitRateAndFrameSizeTable[1][0][1][1] = 87;
        bitRateAndFrameSizeTable[1][1][1][1] = 88;
        bitRateAndFrameSizeTable[2][0][1][0] = 48;
        bitRateAndFrameSizeTable[2][1][1][0] = 48;
        bitRateAndFrameSizeTable[2][0][1][1] = 104;
        bitRateAndFrameSizeTable[2][1][1][1] = 105;
        bitRateAndFrameSizeTable[3][0][1][0] = 56;
        bitRateAndFrameSizeTable[3][1][1][0] = 56;
        bitRateAndFrameSizeTable[3][0][1][1] = 121;
        bitRateAndFrameSizeTable[3][1][1][1] = 122;
        bitRateAndFrameSizeTable[4][0][1][0] = 64;
        bitRateAndFrameSizeTable[4][1][1][0] = 64;
        bitRateAndFrameSizeTable[4][0][1][1] = 139;
        bitRateAndFrameSizeTable[4][1][1][1] = 140;
        bitRateAndFrameSizeTable[5][0][1][0] = 80;
        bitRateAndFrameSizeTable[5][1][1][0] = 80;
        bitRateAndFrameSizeTable[5][0][1][1] = 174;
        bitRateAndFrameSizeTable[5][1][1][1] = 175;
        bitRateAndFrameSizeTable[6][0][1][0] = 96;
        bitRateAndFrameSizeTable[6][1][1][0] = 96;
        bitRateAndFrameSizeTable[6][0][1][1] = 208;
        bitRateAndFrameSizeTable[6][1][1][1] = 209;
        bitRateAndFrameSizeTable[7][0][1][0] = 112;
        bitRateAndFrameSizeTable[7][1][1][0] = 112;
        bitRateAndFrameSizeTable[7][0][1][1] = 243;
        bitRateAndFrameSizeTable[7][1][1][1] = 244;
        bitRateAndFrameSizeTable[8][0][1][0] = 128;
        bitRateAndFrameSizeTable[8][1][1][0] = 128;
        bitRateAndFrameSizeTable[8][0][1][1] = 278;
        bitRateAndFrameSizeTable[8][1][1][1] = 279;
        bitRateAndFrameSizeTable[9][0][1][0] = 160;
        bitRateAndFrameSizeTable[9][1][1][0] = 160;
        bitRateAndFrameSizeTable[9][0][1][1] = 348;
        bitRateAndFrameSizeTable[9][1][1][1] = 349;
        bitRateAndFrameSizeTable[10][0][1][0] = 192;
        bitRateAndFrameSizeTable[10][1][1][0] = 192;
        bitRateAndFrameSizeTable[10][0][1][1] = 417;
        bitRateAndFrameSizeTable[10][1][1][1] = 418;
        bitRateAndFrameSizeTable[11][0][1][0] = 224;
        bitRateAndFrameSizeTable[11][1][1][0] = 224;
        bitRateAndFrameSizeTable[11][0][1][1] = 487;
        bitRateAndFrameSizeTable[11][1][1][1] = 488;
        bitRateAndFrameSizeTable[12][0][1][0] = 256;
        bitRateAndFrameSizeTable[12][1][1][0] = 256;
        bitRateAndFrameSizeTable[12][0][1][1] = 557;
        bitRateAndFrameSizeTable[12][1][1][1] = 558;
        bitRateAndFrameSizeTable[13][0][1][0] = 320;
        bitRateAndFrameSizeTable[13][1][1][0] = 320;
        bitRateAndFrameSizeTable[13][0][1][1] = 696;
        bitRateAndFrameSizeTable[13][1][1][1] = 697;
        bitRateAndFrameSizeTable[14][0][1][0] = 384;
        bitRateAndFrameSizeTable[14][1][1][0] = 384;
        bitRateAndFrameSizeTable[14][0][1][1] = 835;
        bitRateAndFrameSizeTable[14][1][1][1] = 836;
        bitRateAndFrameSizeTable[15][0][1][0] = 448;
        bitRateAndFrameSizeTable[15][1][1][0] = 448;
        bitRateAndFrameSizeTable[15][0][1][1] = 975;
        bitRateAndFrameSizeTable[15][1][1][1] = 975;
        bitRateAndFrameSizeTable[16][0][1][0] = 512;
        bitRateAndFrameSizeTable[16][1][1][0] = 512;
        bitRateAndFrameSizeTable[16][0][1][1] = 1114;
        bitRateAndFrameSizeTable[16][1][1][1] = 1115;
        bitRateAndFrameSizeTable[17][0][1][0] = 576;
        bitRateAndFrameSizeTable[17][1][1][0] = 576;
        bitRateAndFrameSizeTable[17][0][1][1] = 1253;
        bitRateAndFrameSizeTable[17][1][1][1] = 1254;
        bitRateAndFrameSizeTable[18][0][1][0] = 640;
        bitRateAndFrameSizeTable[18][1][1][0] = 640;
        bitRateAndFrameSizeTable[18][0][1][1] = 1393;
        bitRateAndFrameSizeTable[18][1][1][1] = 1394;
        bitRateAndFrameSizeTable[0][0][2][0] = 32;
        bitRateAndFrameSizeTable[0][1][2][0] = 32;
        bitRateAndFrameSizeTable[0][0][2][1] = 96;
        bitRateAndFrameSizeTable[0][1][2][1] = 96;
        bitRateAndFrameSizeTable[1][0][2][0] = 40;
        bitRateAndFrameSizeTable[1][1][2][0] = 40;
        bitRateAndFrameSizeTable[1][0][2][1] = 120;
        bitRateAndFrameSizeTable[1][1][2][1] = 120;
        bitRateAndFrameSizeTable[2][0][2][0] = 48;
        bitRateAndFrameSizeTable[2][1][2][0] = 48;
        bitRateAndFrameSizeTable[2][0][2][1] = 144;
        bitRateAndFrameSizeTable[2][1][2][1] = 144;
        bitRateAndFrameSizeTable[3][0][2][0] = 56;
        bitRateAndFrameSizeTable[3][1][2][0] = 56;
        bitRateAndFrameSizeTable[3][0][2][1] = 168;
        bitRateAndFrameSizeTable[3][1][2][1] = 168;
        bitRateAndFrameSizeTable[4][0][2][0] = 64;
        bitRateAndFrameSizeTable[4][1][2][0] = 64;
        bitRateAndFrameSizeTable[4][0][2][1] = 192;
        bitRateAndFrameSizeTable[4][1][2][1] = 192;
        bitRateAndFrameSizeTable[5][0][2][0] = 80;
        bitRateAndFrameSizeTable[5][1][2][0] = 80;
        bitRateAndFrameSizeTable[5][0][2][1] = 240;
        bitRateAndFrameSizeTable[5][1][2][1] = 240;
        bitRateAndFrameSizeTable[6][0][2][0] = 96;
        bitRateAndFrameSizeTable[6][1][2][0] = 96;
        bitRateAndFrameSizeTable[6][0][2][1] = 288;
        bitRateAndFrameSizeTable[6][1][2][1] = 288;
        bitRateAndFrameSizeTable[7][0][2][0] = 112;
        bitRateAndFrameSizeTable[7][1][2][0] = 112;
        bitRateAndFrameSizeTable[7][0][2][1] = 336;
        bitRateAndFrameSizeTable[7][1][2][1] = 336;
        bitRateAndFrameSizeTable[8][0][2][0] = 128;
        bitRateAndFrameSizeTable[8][1][2][0] = 128;
        bitRateAndFrameSizeTable[8][0][2][1] = 384;
        bitRateAndFrameSizeTable[8][1][2][1] = 384;
        bitRateAndFrameSizeTable[9][0][2][0] = 160;
        bitRateAndFrameSizeTable[9][1][2][0] = 160;
        bitRateAndFrameSizeTable[9][0][2][1] = 480;
        bitRateAndFrameSizeTable[9][1][2][1] = 480;
        bitRateAndFrameSizeTable[10][0][2][0] = 192;
        bitRateAndFrameSizeTable[10][1][2][0] = 192;
        bitRateAndFrameSizeTable[10][0][2][1] = 576;
        bitRateAndFrameSizeTable[10][1][2][1] = 576;
        bitRateAndFrameSizeTable[11][0][2][0] = 224;
        bitRateAndFrameSizeTable[11][1][2][0] = 224;
        bitRateAndFrameSizeTable[11][0][2][1] = 672;
        bitRateAndFrameSizeTable[11][1][2][1] = 672;
        bitRateAndFrameSizeTable[12][0][2][0] = 256;
        bitRateAndFrameSizeTable[12][1][2][0] = 256;
        bitRateAndFrameSizeTable[12][0][2][1] = 768;
        bitRateAndFrameSizeTable[12][1][2][1] = 768;
        bitRateAndFrameSizeTable[13][0][2][0] = 320;
        bitRateAndFrameSizeTable[13][1][2][0] = 320;
        bitRateAndFrameSizeTable[13][0][2][1] = 960;
        bitRateAndFrameSizeTable[13][1][2][1] = 960;
        bitRateAndFrameSizeTable[14][0][2][0] = 384;
        bitRateAndFrameSizeTable[14][1][2][0] = 384;
        bitRateAndFrameSizeTable[14][0][2][1] = 1152;
        bitRateAndFrameSizeTable[14][1][2][1] = 1152;
        bitRateAndFrameSizeTable[15][0][2][0] = 448;
        bitRateAndFrameSizeTable[15][1][2][0] = 448;
        bitRateAndFrameSizeTable[15][0][2][1] = 1344;
        bitRateAndFrameSizeTable[15][1][2][1] = 1344;
        bitRateAndFrameSizeTable[16][0][2][0] = 512;
        bitRateAndFrameSizeTable[16][1][2][0] = 512;
        bitRateAndFrameSizeTable[16][0][2][1] = 1536;
        bitRateAndFrameSizeTable[16][1][2][1] = 1536;
        bitRateAndFrameSizeTable[17][0][2][0] = 576;
        bitRateAndFrameSizeTable[17][1][2][0] = 576;
        bitRateAndFrameSizeTable[17][0][2][1] = 1728;
        bitRateAndFrameSizeTable[17][1][2][1] = 1728;
        bitRateAndFrameSizeTable[18][0][2][0] = 640;
        bitRateAndFrameSizeTable[18][1][2][0] = 640;
        bitRateAndFrameSizeTable[18][0][2][1] = 1920;
        bitRateAndFrameSizeTable[18][1][2][1] = 1920;
    }

    private class _cls1SampleImpl
        implements Sample
    {

        private final DataSource dataSource;
        private final long size;
        private final long start;
        final AC3TrackImpl this$0;

        public ByteBuffer asByteBuffer()
        {
            ByteBuffer bytebuffer;
            try
            {
                bytebuffer = dataSource.map(start, size);
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return bytebuffer;
        }

        public long getSize()
        {
            return size;
        }

        public void writeTo(WritableByteChannel writablebytechannel)
        {
            dataSource.transferTo(start, size, writablebytechannel);
        }

        public _cls1SampleImpl(long l, long l1, DataSource datasource)
        {
            this$0 = AC3TrackImpl.this;
            super();
            start = l;
            size = l1;
            dataSource = datasource;
        }
    }

}
