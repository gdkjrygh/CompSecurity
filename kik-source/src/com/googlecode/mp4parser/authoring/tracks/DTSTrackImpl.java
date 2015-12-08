// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.DTSSpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DTSTrackImpl extends AbstractTrack
{

    int bcCoreBitRate;
    int bcCoreChannelMask;
    int bcCoreMaxSampleRate;
    int bitrate;
    int channelCount;
    int channelMask;
    int codecDelayAtMaxFs;
    int coreBitRate;
    int coreChannelMask;
    int coreFramePayloadInBytes;
    int coreMaxSampleRate;
    boolean coreSubStreamPresent;
    private int dataOffset;
    private DataSource dataSource;
    DTSSpecificBox ddts;
    int extAvgBitrate;
    int extFramePayloadInBytes;
    int extPeakBitrate;
    int extSmoothBuffSize;
    boolean extensionSubStreamPresent;
    int frameSize;
    boolean isVBR;
    private String lang;
    int lbrCodingPresent;
    int lsbTrimPercent;
    int maxSampleRate;
    int numExtSubStreams;
    int numFramesTotal;
    int numSamplesOrigAudioAtMaxFs;
    SampleDescriptionBox sampleDescriptionBox;
    private long sampleDurations[];
    int sampleSize;
    int samplerate;
    private List samples;
    int samplesPerFrame;
    int samplesPerFrameAtMaxFs;
    TrackMetaData trackMetaData;
    String type;

    public DTSTrackImpl(DataSource datasource)
    {
        super(datasource.toString());
        trackMetaData = new TrackMetaData();
        frameSize = 0;
        dataOffset = 0;
        ddts = new DTSSpecificBox();
        isVBR = false;
        coreSubStreamPresent = false;
        extensionSubStreamPresent = false;
        numExtSubStreams = 0;
        coreMaxSampleRate = 0;
        coreBitRate = 0;
        coreChannelMask = 0;
        coreFramePayloadInBytes = 0;
        extAvgBitrate = 0;
        extPeakBitrate = 0;
        extSmoothBuffSize = 0;
        extFramePayloadInBytes = 0;
        maxSampleRate = 0;
        lbrCodingPresent = 0;
        numFramesTotal = 0;
        samplesPerFrameAtMaxFs = 0;
        numSamplesOrigAudioAtMaxFs = 0;
        channelMask = 0;
        codecDelayAtMaxFs = 0;
        bcCoreMaxSampleRate = 0;
        bcCoreBitRate = 0;
        bcCoreChannelMask = 0;
        lsbTrimPercent = 0;
        type = "none";
        lang = "eng";
        dataSource = datasource;
        parse();
    }

    public DTSTrackImpl(DataSource datasource, String s)
    {
        super(datasource.toString());
        trackMetaData = new TrackMetaData();
        frameSize = 0;
        dataOffset = 0;
        ddts = new DTSSpecificBox();
        isVBR = false;
        coreSubStreamPresent = false;
        extensionSubStreamPresent = false;
        numExtSubStreams = 0;
        coreMaxSampleRate = 0;
        coreBitRate = 0;
        coreChannelMask = 0;
        coreFramePayloadInBytes = 0;
        extAvgBitrate = 0;
        extPeakBitrate = 0;
        extSmoothBuffSize = 0;
        extFramePayloadInBytes = 0;
        maxSampleRate = 0;
        lbrCodingPresent = 0;
        numFramesTotal = 0;
        samplesPerFrameAtMaxFs = 0;
        numSamplesOrigAudioAtMaxFs = 0;
        channelMask = 0;
        codecDelayAtMaxFs = 0;
        bcCoreMaxSampleRate = 0;
        bcCoreBitRate = 0;
        bcCoreChannelMask = 0;
        lsbTrimPercent = 0;
        type = "none";
        lang = "eng";
        lang = s;
        dataSource = datasource;
        parse();
    }

    private void parse()
    {
        if (!readVariables())
        {
            throw new IOException();
        } else
        {
            sampleDescriptionBox = new SampleDescriptionBox();
            AudioSampleEntry audiosampleentry = new AudioSampleEntry(type);
            audiosampleentry.setChannelCount(channelCount);
            audiosampleentry.setSampleRate(samplerate);
            audiosampleentry.setDataReferenceIndex(1);
            audiosampleentry.setSampleSize(16);
            audiosampleentry.addBox(ddts);
            sampleDescriptionBox.addBox(audiosampleentry);
            trackMetaData.setCreationTime(new Date());
            trackMetaData.setModificationTime(new Date());
            trackMetaData.setLanguage(lang);
            trackMetaData.setTimescale(samplerate);
            samples = readSamples();
            return;
        }
    }

    private boolean parseAuprhdr(int i, ByteBuffer bytebuffer)
    {
        bytebuffer.get();
        short word0 = bytebuffer.getShort();
        maxSampleRate = bytebuffer.get() << 16 | bytebuffer.getShort() & 0xffff;
        numFramesTotal = bytebuffer.getInt();
        samplesPerFrameAtMaxFs = bytebuffer.getShort();
        numSamplesOrigAudioAtMaxFs = bytebuffer.get() << 32 | bytebuffer.getInt() & 0xffff;
        channelMask = bytebuffer.getShort();
        codecDelayAtMaxFs = bytebuffer.getShort();
        int k = 21;
        if ((word0 & 3) == 3)
        {
            bcCoreMaxSampleRate = bytebuffer.get() << 16 | bytebuffer.getShort() & 0xffff;
            bcCoreBitRate = bytebuffer.getShort();
            bcCoreChannelMask = bytebuffer.getShort();
            k = 28;
        }
        int j = k;
        if ((word0 & 4) > 0)
        {
            lsbTrimPercent = bytebuffer.get();
            j = k + 1;
        }
        k = j;
        if ((word0 & 8) > 0)
        {
            lbrCodingPresent = 1;
            k = j;
        }
        do
        {
            if (k >= i)
            {
                return true;
            }
            bytebuffer.get();
            k++;
        } while (true);
    }

    private boolean parseCoressmd(int i, ByteBuffer bytebuffer)
    {
        coreMaxSampleRate = bytebuffer.get() << 16 | bytebuffer.getShort() & 0xffff;
        coreBitRate = bytebuffer.getShort();
        coreChannelMask = bytebuffer.getShort();
        coreFramePayloadInBytes = bytebuffer.getInt();
        int j = 11;
        do
        {
            if (j >= i)
            {
                return true;
            }
            bytebuffer.get();
            j++;
        } while (true);
    }

    private boolean parseDtshdhdr(int i, ByteBuffer bytebuffer)
    {
        bytebuffer.getInt();
        bytebuffer.get();
        bytebuffer.getInt();
        bytebuffer.get();
        int j = bytebuffer.getShort();
        bytebuffer.get();
        numExtSubStreams = bytebuffer.get();
        if ((j & 1) == 1)
        {
            isVBR = true;
        }
        if ((j & 8) == 8)
        {
            coreSubStreamPresent = true;
        }
        if ((j & 0x10) == 16)
        {
            extensionSubStreamPresent = true;
            numExtSubStreams = numExtSubStreams + 1;
        } else
        {
            numExtSubStreams = 0;
        }
        j = 14;
        do
        {
            if (j >= i)
            {
                return true;
            }
            bytebuffer.get();
            j++;
        } while (true);
    }

    private boolean parseExtssmd(int i, ByteBuffer bytebuffer)
    {
        extAvgBitrate = bytebuffer.get() << 16 | bytebuffer.getShort() & 0xffff;
        int j;
        if (isVBR)
        {
            extPeakBitrate = bytebuffer.get() << 16 | bytebuffer.getShort() & 0xffff;
            extSmoothBuffSize = bytebuffer.getShort();
            j = 8;
        } else
        {
            extFramePayloadInBytes = bytebuffer.getInt();
            j = 7;
        }
        do
        {
            if (j >= i)
            {
                return true;
            }
            bytebuffer.get();
            j++;
        } while (true);
    }

    private List readSamples()
    {
        ArrayList arraylist = new ArrayList(CastUtils.l2i(dataSource.size() / (long)frameSize));
        final int currentPosition = dataOffset;
        do
        {
            if ((long)(frameSize + currentPosition) >= dataSource.size())
            {
                sampleDurations = new long[arraylist.size()];
                Arrays.fill(sampleDurations, (long)(samplesPerFrame * samplerate) / trackMetaData.getTimescale());
                return arraylist;
            }
            arraylist.add(new _cls1());
            currentPosition += frameSize;
        } while (true);
    }

    private boolean readVariables()
    {
        ByteBuffer bytebuffer;
        int j;
        int k;
        bytebuffer = dataSource.map(0L, 25000L);
        j = bytebuffer.getInt();
        k = bytebuffer.getInt();
        if (j != 0x44545348) goto _L2; else goto _L1
_L1:
        int i = k;
        if (k == 0x44484452) goto _L3; else goto _L2
_L2:
        return false;
_L15:
        k = (int)bytebuffer.getLong();
        if (j != 0x44545348 || i != 0x44484452) goto _L5; else goto _L4
_L4:
        if (!parseDtshdhdr(k, bytebuffer))
        {
            return false;
        }
          goto _L6
_L5:
        if (j != 0x434f5245 || i != 0x53534d44) goto _L8; else goto _L7
_L7:
        if (!parseCoressmd(k, bytebuffer))
        {
            return false;
        }
          goto _L6
_L8:
        if (j != 0x41555052 || i != 0x2d484452) goto _L10; else goto _L9
_L9:
        if (!parseAuprhdr(k, bytebuffer))
        {
            return false;
        }
          goto _L6
_L10:
        if (j != 0x45585453 || i != 0x535f4d44) goto _L12; else goto _L11
_L11:
        if (!parseExtssmd(k, bytebuffer))
        {
            return false;
        }
          goto _L6
_L12:
        i = 0;
_L24:
        if (i < k) goto _L13; else goto _L6
_L6:
        j = bytebuffer.getInt();
        i = bytebuffer.getInt();
_L3:
        if ((j != 0x5354524d || i != 0x44415441) && bytebuffer.remaining() > 100) goto _L15; else goto _L14
_L14:
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int l2;
        int i3;
        int j3;
        bytebuffer.getLong();
        dataOffset = bytebuffer.position();
        i2 = -1;
        i1 = 0;
        j = 0;
        k = 0;
        k1 = 0;
        l = 0;
        l1 = 0;
        j1 = 0;
        i = 0;
        i3 = 0;
        l2 = 0;
        j3 = -1;
        j2 = -1;
_L76:
        if (i == 0) goto _L17; else goto _L16
_L16:
        samplesPerFrame;
        JVM INSTR lookupswitch 4: default 308
    //                   512: 1864
    //                   1024: 1870
    //                   2048: 1876
    //                   4096: 1882;
           goto _L18 _L19 _L20 _L21 _L22
_L18:
        i1 = -1;
_L80:
        if (i1 == -1)
        {
            return false;
        }
          goto _L23
_L13:
        bytebuffer.get();
        i++;
          goto _L24
_L17:
        int k3;
        int i5;
        i5 = bytebuffer.position();
        k3 = bytebuffer.getInt();
        if (k3 != 0x7ffe8001) goto _L26; else goto _L25
_L25:
        if (j2 == 1) goto _L28; else goto _L27
_L27:
        BitReaderBuffer bitreaderbuffer;
        int j4;
        j2 = 1;
        bitreaderbuffer = new BitReaderBuffer(bytebuffer);
        i2 = bitreaderbuffer.readBits(1);
        l2 = bitreaderbuffer.readBits(5);
        k3 = bitreaderbuffer.readBits(1);
        if (i2 != 1 || l2 != 31 || k3 != 0)
        {
            return false;
        }
        samplesPerFrame = (bitreaderbuffer.readBits(7) + 1) * 32;
        j4 = bitreaderbuffer.readBits(14);
        frameSize = frameSize + (j4 + 1);
        i2 = bitreaderbuffer.readBits(6);
        bitreaderbuffer.readBits(4);
        JVM INSTR tableswitch 1 13: default 524
    //                   1 526
    //                   2 658
    //                   3 668
    //                   4 524
    //                   5 524
    //                   6 678
    //                   7 688
    //                   8 698
    //                   9 524
    //                   10 524
    //                   11 708
    //                   12 718
    //                   13 728;
           goto _L29 _L30 _L31 _L32 _L29 _L29 _L33 _L34 _L35 _L29 _L29 _L36 _L37 _L38
_L29:
        return false;
_L30:
        samplerate = 8000;
_L66:
        bitreaderbuffer.readBits(5);
        JVM INSTR tableswitch 0 25: default 656
    //                   0 738
    //                   1 754
    //                   2 763
    //                   3 772
    //                   4 781
    //                   5 790
    //                   6 800
    //                   7 810
    //                   8 820
    //                   9 830
    //                   10 840
    //                   11 850
    //                   12 860
    //                   13 870
    //                   14 880
    //                   15 890
    //                   16 900
    //                   17 910
    //                   18 920
    //                   19 930
    //                   20 940
    //                   21 950
    //                   22 960
    //                   23 970
    //                   24 980
    //                   25 990;
           goto _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65
_L39:
        return false;
_L31:
        samplerate = 16000;
          goto _L66
_L32:
        samplerate = 32000;
          goto _L66
_L33:
        samplerate = 11025;
          goto _L66
_L34:
        samplerate = 22050;
          goto _L66
_L35:
        samplerate = 44100;
          goto _L66
_L36:
        samplerate = 12000;
          goto _L66
_L37:
        samplerate = 24000;
          goto _L66
_L38:
        samplerate = 48000;
          goto _L66
_L40:
        bitrate = 32;
_L68:
        if (bitreaderbuffer.readBits(1) != 0)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L41:
        bitrate = 56;
        continue; /* Loop/switch isn't completed */
_L42:
        bitrate = 64;
        continue; /* Loop/switch isn't completed */
_L43:
        bitrate = 96;
        continue; /* Loop/switch isn't completed */
_L44:
        bitrate = 112;
        continue; /* Loop/switch isn't completed */
_L45:
        bitrate = 128;
        continue; /* Loop/switch isn't completed */
_L46:
        bitrate = 192;
        continue; /* Loop/switch isn't completed */
_L47:
        bitrate = 224;
        continue; /* Loop/switch isn't completed */
_L48:
        bitrate = 256;
        continue; /* Loop/switch isn't completed */
_L49:
        bitrate = 320;
        continue; /* Loop/switch isn't completed */
_L50:
        bitrate = 384;
        continue; /* Loop/switch isn't completed */
_L51:
        bitrate = 448;
        continue; /* Loop/switch isn't completed */
_L52:
        bitrate = 512;
        continue; /* Loop/switch isn't completed */
_L53:
        bitrate = 576;
        continue; /* Loop/switch isn't completed */
_L54:
        bitrate = 640;
        continue; /* Loop/switch isn't completed */
_L55:
        bitrate = 768;
        continue; /* Loop/switch isn't completed */
_L56:
        bitrate = 960;
        continue; /* Loop/switch isn't completed */
_L57:
        bitrate = 1024;
        continue; /* Loop/switch isn't completed */
_L58:
        bitrate = 1152;
        continue; /* Loop/switch isn't completed */
_L59:
        bitrate = 1280;
        continue; /* Loop/switch isn't completed */
_L60:
        bitrate = 1344;
        continue; /* Loop/switch isn't completed */
_L61:
        bitrate = 1408;
        continue; /* Loop/switch isn't completed */
_L62:
        bitrate = 1411;
        continue; /* Loop/switch isn't completed */
_L63:
        bitrate = 1472;
        continue; /* Loop/switch isn't completed */
_L64:
        bitrate = 1536;
        continue; /* Loop/switch isn't completed */
_L65:
        bitrate = -1;
        if (true) goto _L68; else goto _L67
_L67:
        bitreaderbuffer.readBits(1);
        bitreaderbuffer.readBits(1);
        bitreaderbuffer.readBits(1);
        bitreaderbuffer.readBits(1);
        l2 = bitreaderbuffer.readBits(3);
        i3 = bitreaderbuffer.readBits(1);
        bitreaderbuffer.readBits(1);
        bitreaderbuffer.readBits(2);
        bitreaderbuffer.readBits(1);
        if (k3 == 1)
        {
            bitreaderbuffer.readBits(16);
        }
        bitreaderbuffer.readBits(1);
        k3 = bitreaderbuffer.readBits(4);
        bitreaderbuffer.readBits(2);
        bitreaderbuffer.readBits(3);
        JVM INSTR tableswitch 0 6: default 1132
    //                   0 1134
    //                   1 1134
    //                   2 1197
    //                   3 1197
    //                   4 1132
    //                   5 1206
    //                   6 1206;
           goto _L69 _L70 _L70 _L71 _L71 _L69 _L72 _L72
_L69:
        return false;
_L70:
        sampleSize = 16;
_L77:
        bitreaderbuffer.readBits(1);
        bitreaderbuffer.readBits(1);
        k3;
        JVM INSTR tableswitch 6 7: default 1176
    //                   6 1215
    //                   7 1224;
           goto _L73 _L74 _L75
_L73:
        bitreaderbuffer.readBits(4);
_L78:
        bytebuffer.position(i5 + j4 + 1);
          goto _L76
_L71:
        sampleSize = 20;
          goto _L77
_L72:
        sampleSize = 24;
          goto _L77
_L74:
        bitreaderbuffer.readBits(4);
          goto _L78
_L75:
        bitreaderbuffer.readBits(4);
          goto _L78
_L26:
        if (k3 != 0x64582025) goto _L28; else goto _L79
_L79:
        j3 = j2;
        if (j2 == -1)
        {
            j3 = 0;
            samplesPerFrame = samplesPerFrameAtMaxFs;
        }
        boolean flag2 = true;
        BitReaderBuffer bitreaderbuffer1 = new BitReaderBuffer(bytebuffer);
        bitreaderbuffer1.readBits(8);
        bitreaderbuffer1.readBits(2);
        int k4 = bitreaderbuffer1.readBits(1);
        int l3 = 12;
        j2 = 20;
        if (k4 == 0)
        {
            l3 = 8;
            j2 = 16;
        }
        l3 = bitreaderbuffer1.readBits(l3);
        int j5 = bitreaderbuffer1.readBits(j2) + 1;
        bytebuffer.position(i5 + (l3 + 1));
        j2 = bytebuffer.getInt();
        if (j2 == 0x5a5a5a5a)
        {
            if (i1 == 1)
            {
                i = 1;
            }
            l3 = i;
            j2 = j1;
            i = l;
            i1 = k;
            j1 = 1;
            k = l1;
            l = k1;
            k1 = j1;
            j1 = j;
            l1 = l3;
            j = j2;
        } else
        if (j2 == 0x47004a03)
        {
            if (j == 1)
            {
                i = 1;
            }
            l3 = 1;
            j = j1;
            j1 = k;
            j2 = i1;
            k = l1;
            l1 = i;
            i = l;
            l = k1;
            i1 = j1;
            j1 = l3;
            k1 = j2;
        } else
        if (j2 == 0x1d95f262)
        {
            if (k == 1)
            {
                i = 1;
            }
            k = l1;
            j2 = i1;
            i1 = k1;
            k1 = j;
            j = j1;
            j1 = 1;
            l1 = i;
            i = l;
            l = i1;
            i1 = j1;
            j1 = k1;
            k1 = j2;
        } else
        if (j2 == 0x655e315e)
        {
            if (k1 == 1)
            {
                i = 1;
            }
            k1 = j;
            l3 = 1;
            j = j1;
            j1 = k;
            j2 = i1;
            k = l1;
            l1 = i;
            i = l;
            l = l3;
            i1 = j1;
            j1 = k1;
            k1 = j2;
        } else
        if (j2 == 0xa801921)
        {
            if (l == 1)
            {
                i = 1;
            }
            j2 = k;
            l = k1;
            k1 = i1;
            l3 = j;
            i1 = 1;
            j = j1;
            k = l1;
            l1 = i;
            i = i1;
            i1 = j2;
            j1 = l3;
        } else
        if (j2 == 0x41a29547)
        {
            if (l1 == 1)
            {
                i = 1;
            }
            boolean flag = true;
            l1 = j1;
            j1 = j;
            l3 = k;
            j2 = i1;
            j = l1;
            k = ((flag) ? 1 : 0);
            l1 = i;
            i = l;
            l = k1;
            i1 = l3;
            k1 = j2;
        } else
        if (j2 == 0x2b09261)
        {
            if (j1 == 1)
            {
                i = 1;
            }
            boolean flag1 = true;
            j1 = k;
            j2 = j;
            l3 = i1;
            j = ((flag1) ? 1 : 0);
            k = l1;
            l1 = i;
            i = l;
            l = k1;
            i1 = j1;
            j1 = j2;
            k1 = l3;
        } else
        {
            int l4 = j1;
            j1 = k;
            int k2 = j;
            int i4 = i1;
            j = l4;
            k = l1;
            l1 = i;
            i = l;
            l = k1;
            i1 = j1;
            j1 = k2;
            k1 = i4;
        }
        if (l1 == 0)
        {
            frameSize = frameSize + j5;
        }
        bytebuffer.position(i5 + j5);
        l3 = j1;
        k4 = k1;
        k1 = l;
        l = i;
        j2 = j3;
        i = l1;
        j1 = j;
        l1 = k;
        k = i1;
        j = l3;
        i1 = k4;
        j3 = ((flag2) ? 1 : 0);
          goto _L76
_L28:
        i = 1;
          goto _L76
_L19:
        i1 = 0;
          goto _L80
_L20:
        i1 = 1;
          goto _L80
_L21:
        i1 = 2;
          goto _L80
_L22:
        i1 = 3;
          goto _L80
_L23:
        i2;
        JVM INSTR tableswitch 0 9: default 1944
    //                   0 2212
    //                   1 1944
    //                   2 2212
    //                   3 1944
    //                   4 2212
    //                   5 2212
    //                   6 2212
    //                   7 2212
    //                   8 2212
    //                   9 2212;
           goto _L81 _L82 _L81 _L82 _L81 _L82 _L82 _L82 _L82 _L82 _L82
_L81:
        i2 = 31;
_L82:
        l3 = 0;
        if (j2 != 0) goto _L84; else goto _L83
_L83:
        if (l1 != 1) goto _L86; else goto _L85
_L85:
        if (j1 == 0)
        {
            i = 17;
            type = "dtsl";
        } else
        {
            i = 21;
            type = "dtsh";
        }
_L96:
        samplerate = maxSampleRate;
        sampleSize = 24;
_L94:
        ddts.setDTSSamplingFrequency(maxSampleRate);
        if (isVBR)
        {
            ddts.setMaxBitRate((coreBitRate + extPeakBitrate) * 1000);
        } else
        {
            ddts.setMaxBitRate((coreBitRate + extAvgBitrate) * 1000);
        }
        ddts.setAvgBitRate((coreBitRate + extAvgBitrate) * 1000);
        ddts.setPcmSampleDepth(sampleSize);
        ddts.setFrameDuration(i1);
        ddts.setStreamConstruction(i);
        if ((coreChannelMask & 8) > 0 || (coreChannelMask & 0x1000) > 0)
        {
            ddts.setCoreLFEPresent(1);
        } else
        {
            ddts.setCoreLFEPresent(0);
        }
        ddts.setCoreLayout(i2);
        ddts.setCoreSize(coreFramePayloadInBytes);
        ddts.setStereoDownmix(0);
        ddts.setRepresentationType(4);
        ddts.setChannelLayout(channelMask);
        if (coreMaxSampleRate > 0 && extAvgBitrate > 0)
        {
            ddts.setMultiAssetFlag(1);
        } else
        {
            ddts.setMultiAssetFlag(0);
        }
        ddts.setLBRDurationMod(lbrCodingPresent);
        ddts.setReservedBoxPresent(0);
        channelCount = 0;
        i = 0;
        break; /* Loop/switch isn't completed */
_L86:
        if (l == 1)
        {
            i = 18;
            type = "dtse";
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 1)
        {
            type = "dtsh";
            if (j == 0 && l1 == 0)
            {
                i = 19;
                continue; /* Loop/switch isn't completed */
            }
            if (j == 1 && l1 == 0)
            {
                i = 20;
                continue; /* Loop/switch isn't completed */
            }
            if (j == 0 && l1 == 1)
            {
                i = 21;
                continue; /* Loop/switch isn't completed */
            }
        }
        i = 0;
        continue; /* Loop/switch isn't completed */
_L84:
        if (j3 <= 0)
        {
            if (i3 > 0)
            {
                switch (l2)
                {
                default:
                    i = 0;
                    type = "dtsh";
                    break;

                case 0: // '\0'
                    i = 2;
                    type = "dtsc";
                    break;

                case 2: // '\002'
                    i = 4;
                    type = "dtsc";
                    break;

                case 6: // '\006'
                    i = 3;
                    type = "dtsh";
                    break;
                }
            } else
            {
                i = 1;
                type = "dtsc";
            }
        } else
        {
            type = "dtsh";
            if (i3 == 0)
            {
                if (j1 == 0 && j == 1 && k == 0 && k1 == 0 && l1 == 0 && l == 0)
                {
                    i = 5;
                } else
                if (j1 == 0 && j == 0 && k == 0 && k1 == 1 && l1 == 0 && l == 0)
                {
                    i = 6;
                } else
                if (j1 == 0 && j == 1 && k == 0 && k1 == 1 && l1 == 0 && l == 0)
                {
                    i = 9;
                } else
                if (j1 == 0 && j == 0 && k == 1 && k1 == 0 && l1 == 0 && l == 0)
                {
                    i = 10;
                } else
                if (j1 == 0 && j == 1 && k == 1 && k1 == 0 && l1 == 0 && l == 0)
                {
                    i = 13;
                } else
                {
                    i = l3;
                    if (j1 == 0)
                    {
                        i = l3;
                        if (j == 0)
                        {
                            i = l3;
                            if (k == 0)
                            {
                                i = l3;
                                if (k1 == 0)
                                {
                                    i = l3;
                                    if (l1 == 1)
                                    {
                                        i = l3;
                                        if (l == 0)
                                        {
                                            i = 14;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else
            if (l2 == 0 && j1 == 0 && j == 0 && k == 0 && k1 == 1 && l1 == 0 && l == 0)
            {
                i = 7;
            } else
            if (l2 == 6 && j1 == 0 && j == 0 && k == 0 && k1 == 1 && l1 == 0 && l == 0)
            {
                i = 8;
            } else
            if (l2 == 0 && j1 == 0 && j == 0 && k == 1 && k1 == 0 && l1 == 0 && l == 0)
            {
                i = 11;
            } else
            if (l2 == 6 && j1 == 0 && j == 0 && k == 1 && k1 == 0 && l1 == 0 && l == 0)
            {
                i = 12;
            } else
            if (l2 == 0 && j1 == 0 && j == 0 && k == 0 && k1 == 0 && l1 == 1 && l == 0)
            {
                i = 15;
            } else
            {
                i = l3;
                if (l2 == 2)
                {
                    i = l3;
                    if (j1 == 0)
                    {
                        i = l3;
                        if (j == 0)
                        {
                            i = l3;
                            if (k == 0)
                            {
                                i = l3;
                                if (k1 == 0)
                                {
                                    i = l3;
                                    if (l1 == 1)
                                    {
                                        i = l3;
                                        if (l == 0)
                                        {
                                            i = 16;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L92:
        if (i >= 16)
        {
            return true;
        }
        if ((channelMask >> i & 1) == 1)
        {
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 5: // '\005'
            case 6: // '\006'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 13: // '\r'
            default:
                channelCount = channelCount + 2;
                break;

            case 0: // '\0'
            case 3: // '\003'
            case 4: // '\004'
            case 7: // '\007'
            case 8: // '\b'
            case 12: // '\f'
            case 14: // '\016'
                break; /* Loop/switch isn't completed */
            }
        }
_L90:
        i++;
        if (true) goto _L88; else goto _L87
_L88:
        break; /* Loop/switch isn't completed */
_L87:
        channelCount = channelCount + 1;
        if (true) goto _L90; else goto _L89
_L89:
        if (true) goto _L92; else goto _L91
_L91:
        if (true) goto _L94; else goto _L93
_L93:
        if (true) goto _L96; else goto _L95
_L95:
          goto _L24
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
        return sampleDurations;
    }

    public List getSamples()
    {
        return samples;
    }

    public long[] getSyncSamples()
    {
        return null;
    }

    public TrackMetaData getTrackMetaData()
    {
        return trackMetaData;
    }


    private class _cls1
        implements Sample
    {

        final DTSTrackImpl this$0;
        private final int val$currentPosition;

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
            return (long)frameSize;
        }

        public void writeTo(WritableByteChannel writablebytechannel)
        {
            dataSource.transferTo(currentPosition, frameSize, writablebytechannel);
        }

        _cls1()
        {
            this$0 = DTSTrackImpl.this;
            currentPosition = i;
            super();
        }
    }

}
