// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            BaseDescriptor, BitReaderBuffer, BitWriterBuffer

public class AudioSpecificConfig extends BaseDescriptor
{

    public static Map audioObjectTypeMap;
    public static Map samplingFrequencyIndexMap;
    int aacScalefactorDataResilienceFlag;
    int aacSectionDataResilienceFlag;
    int aacSpectralDataResilienceFlag;
    int audioObjectType;
    int channelConfiguration;
    byte configBytes[];
    int coreCoderDelay;
    int dependsOnCoreCoder;
    int directMapping;
    int epConfig;
    int erHvxcExtensionFlag;
    int extensionAudioObjectType;
    int extensionChannelConfiguration;
    int extensionFlag;
    int extensionFlag3;
    int extensionSamplingFrequency;
    int extensionSamplingFrequencyIndex;
    int fillBits;
    int frameLengthFlag;
    boolean gaSpecificConfig;
    int hilnContMode;
    int hilnEnhaLayer;
    int hilnEnhaQuantMode;
    int hilnFrameLength;
    int hilnMaxNumLine;
    int hilnQuantMode;
    int hilnSampleRateCode;
    int hvxcRateMode;
    int hvxcVarMode;
    int isBaseLayer;
    int layerNr;
    int layer_length;
    int numOfSubFrame;
    int paraExtensionFlag;
    int paraMode;
    boolean parametricSpecificConfig;
    int psPresentFlag;
    int sacPayloadEmbedding;
    int samplingFrequency;
    int samplingFrequencyIndex;
    int sbrPresentFlag;
    int syncExtensionType;
    int var_ScalableFlag;

    public AudioSpecificConfig()
    {
    }

    private int gaSpecificConfigSize()
    {
        return 0;
    }

    private int getAudioObjectType(BitReaderBuffer bitreaderbuffer)
    {
        int j = bitreaderbuffer.readBits(5);
        int i = j;
        if (j == 31)
        {
            i = bitreaderbuffer.readBits(6) + 32;
        }
        return i;
    }

    private void parseErHvxcConfig(int i, int j, int k, BitReaderBuffer bitreaderbuffer)
    {
        hvxcVarMode = bitreaderbuffer.readBits(1);
        hvxcRateMode = bitreaderbuffer.readBits(2);
        erHvxcExtensionFlag = bitreaderbuffer.readBits(1);
        if (erHvxcExtensionFlag == 1)
        {
            var_ScalableFlag = bitreaderbuffer.readBits(1);
        }
    }

    private void parseGaSpecificConfig(int i, int j, int k, BitReaderBuffer bitreaderbuffer)
    {
        frameLengthFlag = bitreaderbuffer.readBits(1);
        dependsOnCoreCoder = bitreaderbuffer.readBits(1);
        if (dependsOnCoreCoder == 1)
        {
            coreCoderDelay = bitreaderbuffer.readBits(14);
        }
        extensionFlag = bitreaderbuffer.readBits(1);
        if (j == 0)
        {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        if (k == 6 || k == 20)
        {
            layerNr = bitreaderbuffer.readBits(3);
        }
        if (extensionFlag == 1)
        {
            if (k == 22)
            {
                numOfSubFrame = bitreaderbuffer.readBits(5);
                layer_length = bitreaderbuffer.readBits(11);
            }
            if (k == 17 || k == 19 || k == 20 || k == 23)
            {
                aacSectionDataResilienceFlag = bitreaderbuffer.readBits(1);
                aacScalefactorDataResilienceFlag = bitreaderbuffer.readBits(1);
                aacSpectralDataResilienceFlag = bitreaderbuffer.readBits(1);
            }
            extensionFlag3 = bitreaderbuffer.readBits(1);
        }
        gaSpecificConfig = true;
    }

    private void parseHilnConfig(int i, int j, int k, BitReaderBuffer bitreaderbuffer)
    {
        hilnQuantMode = bitreaderbuffer.readBits(1);
        hilnMaxNumLine = bitreaderbuffer.readBits(8);
        hilnSampleRateCode = bitreaderbuffer.readBits(4);
        hilnFrameLength = bitreaderbuffer.readBits(12);
        hilnContMode = bitreaderbuffer.readBits(2);
    }

    private void parseHilnEnexConfig(int i, int j, int k, BitReaderBuffer bitreaderbuffer)
    {
        hilnEnhaLayer = bitreaderbuffer.readBits(1);
        if (hilnEnhaLayer == 1)
        {
            hilnEnhaQuantMode = bitreaderbuffer.readBits(2);
        }
    }

    private void parseParaConfig(int i, int j, int k, BitReaderBuffer bitreaderbuffer)
    {
        paraMode = bitreaderbuffer.readBits(2);
        if (paraMode != 1)
        {
            parseErHvxcConfig(i, j, k, bitreaderbuffer);
        }
        if (paraMode != 0)
        {
            parseHilnConfig(i, j, k, bitreaderbuffer);
        }
        paraExtensionFlag = bitreaderbuffer.readBits(1);
        parametricSpecificConfig = true;
    }

    private void parseParametricSpecificConfig(int i, int j, int k, BitReaderBuffer bitreaderbuffer)
    {
        isBaseLayer = bitreaderbuffer.readBits(1);
        if (isBaseLayer == 1)
        {
            parseParaConfig(i, j, k, bitreaderbuffer);
            return;
        } else
        {
            parseHilnEnexConfig(i, j, k, bitreaderbuffer);
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AudioSpecificConfig)obj;
            if (aacScalefactorDataResilienceFlag != ((AudioSpecificConfig) (obj)).aacScalefactorDataResilienceFlag)
            {
                return false;
            }
            if (aacSectionDataResilienceFlag != ((AudioSpecificConfig) (obj)).aacSectionDataResilienceFlag)
            {
                return false;
            }
            if (aacSpectralDataResilienceFlag != ((AudioSpecificConfig) (obj)).aacSpectralDataResilienceFlag)
            {
                return false;
            }
            if (audioObjectType != ((AudioSpecificConfig) (obj)).audioObjectType)
            {
                return false;
            }
            if (channelConfiguration != ((AudioSpecificConfig) (obj)).channelConfiguration)
            {
                return false;
            }
            if (coreCoderDelay != ((AudioSpecificConfig) (obj)).coreCoderDelay)
            {
                return false;
            }
            if (dependsOnCoreCoder != ((AudioSpecificConfig) (obj)).dependsOnCoreCoder)
            {
                return false;
            }
            if (directMapping != ((AudioSpecificConfig) (obj)).directMapping)
            {
                return false;
            }
            if (epConfig != ((AudioSpecificConfig) (obj)).epConfig)
            {
                return false;
            }
            if (erHvxcExtensionFlag != ((AudioSpecificConfig) (obj)).erHvxcExtensionFlag)
            {
                return false;
            }
            if (extensionAudioObjectType != ((AudioSpecificConfig) (obj)).extensionAudioObjectType)
            {
                return false;
            }
            if (extensionChannelConfiguration != ((AudioSpecificConfig) (obj)).extensionChannelConfiguration)
            {
                return false;
            }
            if (extensionFlag != ((AudioSpecificConfig) (obj)).extensionFlag)
            {
                return false;
            }
            if (extensionFlag3 != ((AudioSpecificConfig) (obj)).extensionFlag3)
            {
                return false;
            }
            if (extensionSamplingFrequency != ((AudioSpecificConfig) (obj)).extensionSamplingFrequency)
            {
                return false;
            }
            if (extensionSamplingFrequencyIndex != ((AudioSpecificConfig) (obj)).extensionSamplingFrequencyIndex)
            {
                return false;
            }
            if (fillBits != ((AudioSpecificConfig) (obj)).fillBits)
            {
                return false;
            }
            if (frameLengthFlag != ((AudioSpecificConfig) (obj)).frameLengthFlag)
            {
                return false;
            }
            if (gaSpecificConfig != ((AudioSpecificConfig) (obj)).gaSpecificConfig)
            {
                return false;
            }
            if (hilnContMode != ((AudioSpecificConfig) (obj)).hilnContMode)
            {
                return false;
            }
            if (hilnEnhaLayer != ((AudioSpecificConfig) (obj)).hilnEnhaLayer)
            {
                return false;
            }
            if (hilnEnhaQuantMode != ((AudioSpecificConfig) (obj)).hilnEnhaQuantMode)
            {
                return false;
            }
            if (hilnFrameLength != ((AudioSpecificConfig) (obj)).hilnFrameLength)
            {
                return false;
            }
            if (hilnMaxNumLine != ((AudioSpecificConfig) (obj)).hilnMaxNumLine)
            {
                return false;
            }
            if (hilnQuantMode != ((AudioSpecificConfig) (obj)).hilnQuantMode)
            {
                return false;
            }
            if (hilnSampleRateCode != ((AudioSpecificConfig) (obj)).hilnSampleRateCode)
            {
                return false;
            }
            if (hvxcRateMode != ((AudioSpecificConfig) (obj)).hvxcRateMode)
            {
                return false;
            }
            if (hvxcVarMode != ((AudioSpecificConfig) (obj)).hvxcVarMode)
            {
                return false;
            }
            if (isBaseLayer != ((AudioSpecificConfig) (obj)).isBaseLayer)
            {
                return false;
            }
            if (layerNr != ((AudioSpecificConfig) (obj)).layerNr)
            {
                return false;
            }
            if (layer_length != ((AudioSpecificConfig) (obj)).layer_length)
            {
                return false;
            }
            if (numOfSubFrame != ((AudioSpecificConfig) (obj)).numOfSubFrame)
            {
                return false;
            }
            if (paraExtensionFlag != ((AudioSpecificConfig) (obj)).paraExtensionFlag)
            {
                return false;
            }
            if (paraMode != ((AudioSpecificConfig) (obj)).paraMode)
            {
                return false;
            }
            if (parametricSpecificConfig != ((AudioSpecificConfig) (obj)).parametricSpecificConfig)
            {
                return false;
            }
            if (psPresentFlag != ((AudioSpecificConfig) (obj)).psPresentFlag)
            {
                return false;
            }
            if (sacPayloadEmbedding != ((AudioSpecificConfig) (obj)).sacPayloadEmbedding)
            {
                return false;
            }
            if (samplingFrequency != ((AudioSpecificConfig) (obj)).samplingFrequency)
            {
                return false;
            }
            if (samplingFrequencyIndex != ((AudioSpecificConfig) (obj)).samplingFrequencyIndex)
            {
                return false;
            }
            if (sbrPresentFlag != ((AudioSpecificConfig) (obj)).sbrPresentFlag)
            {
                return false;
            }
            if (syncExtensionType != ((AudioSpecificConfig) (obj)).syncExtensionType)
            {
                return false;
            }
            if (var_ScalableFlag != ((AudioSpecificConfig) (obj)).var_ScalableFlag)
            {
                return false;
            }
            if (!Arrays.equals(configBytes, ((AudioSpecificConfig) (obj)).configBytes))
            {
                return false;
            }
        }
        return true;
    }

    public int getAudioObjectType()
    {
        return audioObjectType;
    }

    public int getChannelConfiguration()
    {
        return channelConfiguration;
    }

    public byte[] getConfigBytes()
    {
        return configBytes;
    }

    public int getExtensionAudioObjectType()
    {
        return extensionAudioObjectType;
    }

    public int getPsPresentFlag()
    {
        return psPresentFlag;
    }

    public int getSamplingFrequency()
    {
        if (samplingFrequencyIndex == 15)
        {
            return samplingFrequency;
        } else
        {
            return ((Integer)samplingFrequencyIndexMap.get(Integer.valueOf(samplingFrequencyIndex))).intValue();
        }
    }

    public int getSbrPresentFlag()
    {
        return sbrPresentFlag;
    }

    public int hashCode()
    {
        int k = 1;
        int i;
        int j;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        int i7;
        int j7;
        int k7;
        int l7;
        int i8;
        int j8;
        int k8;
        int l8;
        int i9;
        int j9;
        int k9;
        int l9;
        int i10;
        int j10;
        int k10;
        if (configBytes != null)
        {
            i = Arrays.hashCode(configBytes);
        } else
        {
            i = 0;
        }
        l = audioObjectType;
        i1 = samplingFrequencyIndex;
        j1 = samplingFrequency;
        k1 = channelConfiguration;
        l1 = extensionAudioObjectType;
        i2 = sbrPresentFlag;
        j2 = psPresentFlag;
        k2 = extensionSamplingFrequencyIndex;
        l2 = extensionSamplingFrequency;
        i3 = extensionChannelConfiguration;
        j3 = sacPayloadEmbedding;
        k3 = fillBits;
        l3 = epConfig;
        i4 = directMapping;
        j4 = syncExtensionType;
        k4 = frameLengthFlag;
        l4 = dependsOnCoreCoder;
        i5 = coreCoderDelay;
        j5 = extensionFlag;
        k5 = layerNr;
        l5 = numOfSubFrame;
        i6 = layer_length;
        j6 = aacSectionDataResilienceFlag;
        k6 = aacScalefactorDataResilienceFlag;
        l6 = aacSpectralDataResilienceFlag;
        i7 = extensionFlag3;
        if (gaSpecificConfig)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        j7 = isBaseLayer;
        k7 = paraMode;
        l7 = paraExtensionFlag;
        i8 = hvxcVarMode;
        j8 = hvxcRateMode;
        k8 = erHvxcExtensionFlag;
        l8 = var_ScalableFlag;
        i9 = hilnQuantMode;
        j9 = hilnMaxNumLine;
        k9 = hilnSampleRateCode;
        l9 = hilnFrameLength;
        i10 = hilnContMode;
        j10 = hilnEnhaLayer;
        k10 = hilnEnhaQuantMode;
        if (!parametricSpecificConfig)
        {
            k = 0;
        }
        return (((((((((((((((j + ((((((((((((((((((((((((((i * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + i5) * 31 + j5) * 31 + k5) * 31 + l5) * 31 + i6) * 31 + j6) * 31 + k6) * 31 + l6) * 31 + i7) * 31) * 31 + j7) * 31 + k7) * 31 + l7) * 31 + i8) * 31 + j8) * 31 + k8) * 31 + l8) * 31 + i9) * 31 + j9) * 31 + k9) * 31 + l9) * 31 + i10) * 31 + j10) * 31 + k10) * 31 + k;
    }

    public void parseDetail(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1 = bytebuffer.slice();
        bytebuffer1.limit(sizeOfInstance);
        bytebuffer.position(bytebuffer.position() + sizeOfInstance);
        configBytes = new byte[sizeOfInstance];
        bytebuffer1.get(configBytes);
        bytebuffer1.rewind();
        bytebuffer = new BitReaderBuffer(bytebuffer1);
        audioObjectType = getAudioObjectType(bytebuffer);
        samplingFrequencyIndex = bytebuffer.readBits(4);
        if (samplingFrequencyIndex == 15)
        {
            samplingFrequency = bytebuffer.readBits(24);
        }
        channelConfiguration = bytebuffer.readBits(4);
        if (audioObjectType == 5 || audioObjectType == 29)
        {
            extensionAudioObjectType = 5;
            sbrPresentFlag = 1;
            if (audioObjectType == 29)
            {
                psPresentFlag = 1;
            }
            extensionSamplingFrequencyIndex = bytebuffer.readBits(4);
            if (extensionSamplingFrequencyIndex == 15)
            {
                extensionSamplingFrequency = bytebuffer.readBits(24);
            }
            audioObjectType = getAudioObjectType(bytebuffer);
            if (audioObjectType == 22)
            {
                extensionChannelConfiguration = bytebuffer.readBits(4);
            }
        } else
        {
            extensionAudioObjectType = 0;
        }
        audioObjectType;
        JVM INSTR tableswitch 1 41: default 384
    //                   1 705
    //                   2 705
    //                   3 705
    //                   4 705
    //                   5 384
    //                   6 705
    //                   7 705
    //                   8 725
    //                   9 736
    //                   10 384
    //                   11 384
    //                   12 747
    //                   13 758
    //                   14 758
    //                   15 758
    //                   16 758
    //                   17 705
    //                   18 384
    //                   19 705
    //                   20 705
    //                   21 705
    //                   22 705
    //                   23 705
    //                   24 769
    //                   25 780
    //                   26 791
    //                   27 791
    //                   28 811
    //                   29 384
    //                   30 822
    //                   31 384
    //                   32 842
    //                   33 842
    //                   34 842
    //                   35 853
    //                   36 864
    //                   37 884
    //                   38 884
    //                   39 895
    //                   40 906
    //                   41 906;
           goto _L1 _L2 _L2 _L2 _L2 _L1 _L2 _L2 _L3 _L4 _L1 _L1 _L5 _L6 _L6 _L6 _L6 _L2 _L1 _L2 _L2 _L2 _L2 _L2 _L7 _L8 _L9 _L9 _L10 _L1 _L11 _L1 _L12 _L12 _L12 _L13 _L14 _L15 _L15 _L16 _L17 _L17
_L1:
        audioObjectType;
        JVM INSTR tableswitch 17 39: default 496
    //                   17 917
    //                   18 496
    //                   19 917
    //                   20 917
    //                   21 917
    //                   22 917
    //                   23 917
    //                   24 917
    //                   25 917
    //                   26 917
    //                   27 917
    //                   28 496
    //                   29 496
    //                   30 496
    //                   31 496
    //                   32 496
    //                   33 496
    //                   34 496
    //                   35 496
    //                   36 496
    //                   37 496
    //                   38 496
    //                   39 917;
           goto _L18 _L19 _L18 _L19 _L19 _L19 _L19 _L19 _L19 _L19 _L19 _L19 _L18 _L18 _L18 _L18 _L18 _L18 _L18 _L18 _L18 _L18 _L18 _L19
_L18:
        if (extensionAudioObjectType != 5 && bytebuffer.remainingBits() >= 16)
        {
            syncExtensionType = bytebuffer.readBits(11);
            if (syncExtensionType == 695)
            {
                extensionAudioObjectType = getAudioObjectType(bytebuffer);
                if (extensionAudioObjectType == 5)
                {
                    sbrPresentFlag = bytebuffer.readBits(1);
                    if (sbrPresentFlag == 1)
                    {
                        extensionSamplingFrequencyIndex = bytebuffer.readBits(4);
                        if (extensionSamplingFrequencyIndex == 15)
                        {
                            extensionSamplingFrequency = bytebuffer.readBits(24);
                        }
                        if (bytebuffer.remainingBits() >= 12)
                        {
                            syncExtensionType = bytebuffer.readBits(11);
                            if (syncExtensionType == 1352)
                            {
                                psPresentFlag = bytebuffer.readBits(1);
                            }
                        }
                    }
                }
                if (extensionAudioObjectType == 22)
                {
                    sbrPresentFlag = bytebuffer.readBits(1);
                    if (sbrPresentFlag == 1)
                    {
                        extensionSamplingFrequencyIndex = bytebuffer.readBits(4);
                        if (extensionSamplingFrequencyIndex == 15)
                        {
                            extensionSamplingFrequency = bytebuffer.readBits(24);
                        }
                    }
                    extensionChannelConfiguration = bytebuffer.readBits(4);
                }
            }
        }
        return;
_L2:
        parseGaSpecificConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, bytebuffer);
        continue; /* Loop/switch isn't completed */
_L3:
        throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
_L4:
        throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
_L5:
        throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
_L6:
        throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
_L7:
        throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
_L8:
        throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
_L9:
        parseParametricSpecificConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, bytebuffer);
        continue; /* Loop/switch isn't completed */
_L10:
        throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
_L11:
        sacPayloadEmbedding = bytebuffer.readBits(1);
        throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
_L12:
        throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
_L13:
        throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
_L14:
        fillBits = bytebuffer.readBits(5);
        throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
_L15:
        throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
_L16:
        throw new UnsupportedOperationException("can't parse ELDSpecificConfig yet");
_L17:
        throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
_L19:
        epConfig = bytebuffer.readBits(2);
        if (epConfig == 2 || epConfig == 3)
        {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (epConfig != 3) goto _L18; else goto _L20
_L20:
        directMapping = bytebuffer.readBits(1);
        if (directMapping != 0) goto _L18; else goto _L21
_L21:
        throw new RuntimeException("not implemented");
        if (true) goto _L1; else goto _L22
_L22:
    }

    public ByteBuffer serialize()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(serializedSize());
        IsoTypeWriter.writeUInt8(bytebuffer, 5);
        IsoTypeWriter.writeUInt8(bytebuffer, serializedSize() - 2);
        BitWriterBuffer bitwriterbuffer = new BitWriterBuffer(bytebuffer);
        bitwriterbuffer.writeBits(audioObjectType, 5);
        bitwriterbuffer.writeBits(samplingFrequencyIndex, 4);
        if (samplingFrequencyIndex == 15)
        {
            throw new UnsupportedOperationException("can't serialize that yet");
        } else
        {
            bitwriterbuffer.writeBits(channelConfiguration, 4);
            return bytebuffer;
        }
    }

    public int serializedSize()
    {
        if (audioObjectType == 2)
        {
            return gaSpecificConfigSize() + 4;
        } else
        {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
    }

    public void setAudioObjectType(int i)
    {
        audioObjectType = i;
    }

    public void setChannelConfiguration(int i)
    {
        channelConfiguration = i;
    }

    public void setSamplingFrequency(int i)
    {
        samplingFrequency = i;
    }

    public void setSamplingFrequencyIndex(int i)
    {
        samplingFrequencyIndex = i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("AudioSpecificConfig");
        stringbuilder.append("{configBytes=").append(Hex.encodeHex(configBytes));
        stringbuilder.append(", audioObjectType=").append(audioObjectType).append(" (").append((String)audioObjectTypeMap.get(Integer.valueOf(audioObjectType))).append(")");
        stringbuilder.append(", samplingFrequencyIndex=").append(samplingFrequencyIndex).append(" (").append(samplingFrequencyIndexMap.get(Integer.valueOf(samplingFrequencyIndex))).append(")");
        stringbuilder.append(", samplingFrequency=").append(samplingFrequency);
        stringbuilder.append(", channelConfiguration=").append(channelConfiguration);
        if (extensionAudioObjectType > 0)
        {
            stringbuilder.append(", extensionAudioObjectType=").append(extensionAudioObjectType).append(" (").append((String)audioObjectTypeMap.get(Integer.valueOf(extensionAudioObjectType))).append(")");
            stringbuilder.append(", sbrPresentFlag=").append(sbrPresentFlag);
            stringbuilder.append(", psPresentFlag=").append(psPresentFlag);
            stringbuilder.append(", extensionSamplingFrequencyIndex=").append(extensionSamplingFrequencyIndex).append(" (").append(samplingFrequencyIndexMap.get(Integer.valueOf(extensionSamplingFrequencyIndex))).append(")");
            stringbuilder.append(", extensionSamplingFrequency=").append(extensionSamplingFrequency);
            stringbuilder.append(", extensionChannelConfiguration=").append(extensionChannelConfiguration);
        }
        stringbuilder.append(", syncExtensionType=").append(syncExtensionType);
        if (gaSpecificConfig)
        {
            stringbuilder.append(", frameLengthFlag=").append(frameLengthFlag);
            stringbuilder.append(", dependsOnCoreCoder=").append(dependsOnCoreCoder);
            stringbuilder.append(", coreCoderDelay=").append(coreCoderDelay);
            stringbuilder.append(", extensionFlag=").append(extensionFlag);
            stringbuilder.append(", layerNr=").append(layerNr);
            stringbuilder.append(", numOfSubFrame=").append(numOfSubFrame);
            stringbuilder.append(", layer_length=").append(layer_length);
            stringbuilder.append(", aacSectionDataResilienceFlag=").append(aacSectionDataResilienceFlag);
            stringbuilder.append(", aacScalefactorDataResilienceFlag=").append(aacScalefactorDataResilienceFlag);
            stringbuilder.append(", aacSpectralDataResilienceFlag=").append(aacSpectralDataResilienceFlag);
            stringbuilder.append(", extensionFlag3=").append(extensionFlag3);
        }
        if (parametricSpecificConfig)
        {
            stringbuilder.append(", isBaseLayer=").append(isBaseLayer);
            stringbuilder.append(", paraMode=").append(paraMode);
            stringbuilder.append(", paraExtensionFlag=").append(paraExtensionFlag);
            stringbuilder.append(", hvxcVarMode=").append(hvxcVarMode);
            stringbuilder.append(", hvxcRateMode=").append(hvxcRateMode);
            stringbuilder.append(", erHvxcExtensionFlag=").append(erHvxcExtensionFlag);
            stringbuilder.append(", var_ScalableFlag=").append(var_ScalableFlag);
            stringbuilder.append(", hilnQuantMode=").append(hilnQuantMode);
            stringbuilder.append(", hilnMaxNumLine=").append(hilnMaxNumLine);
            stringbuilder.append(", hilnSampleRateCode=").append(hilnSampleRateCode);
            stringbuilder.append(", hilnFrameLength=").append(hilnFrameLength);
            stringbuilder.append(", hilnContMode=").append(hilnContMode);
            stringbuilder.append(", hilnEnhaLayer=").append(hilnEnhaLayer);
            stringbuilder.append(", hilnEnhaQuantMode=").append(hilnEnhaQuantMode);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    static 
    {
        samplingFrequencyIndexMap = new HashMap();
        audioObjectTypeMap = new HashMap();
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
        audioObjectTypeMap.put(Integer.valueOf(1), "AAC main");
        audioObjectTypeMap.put(Integer.valueOf(2), "AAC LC");
        audioObjectTypeMap.put(Integer.valueOf(3), "AAC SSR");
        audioObjectTypeMap.put(Integer.valueOf(4), "AAC LTP");
        audioObjectTypeMap.put(Integer.valueOf(5), "SBR");
        audioObjectTypeMap.put(Integer.valueOf(6), "AAC Scalable");
        audioObjectTypeMap.put(Integer.valueOf(7), "TwinVQ");
        audioObjectTypeMap.put(Integer.valueOf(8), "CELP");
        audioObjectTypeMap.put(Integer.valueOf(9), "HVXC");
        audioObjectTypeMap.put(Integer.valueOf(10), "(reserved)");
        audioObjectTypeMap.put(Integer.valueOf(11), "(reserved)");
        audioObjectTypeMap.put(Integer.valueOf(12), "TTSI");
        audioObjectTypeMap.put(Integer.valueOf(13), "Main synthetic");
        audioObjectTypeMap.put(Integer.valueOf(14), "Wavetable synthesis");
        audioObjectTypeMap.put(Integer.valueOf(15), "General MIDI");
        audioObjectTypeMap.put(Integer.valueOf(16), "Algorithmic Synthesis and Audio FX");
        audioObjectTypeMap.put(Integer.valueOf(17), "ER AAC LC");
        audioObjectTypeMap.put(Integer.valueOf(18), "(reserved)");
        audioObjectTypeMap.put(Integer.valueOf(19), "ER AAC LTP");
        audioObjectTypeMap.put(Integer.valueOf(20), "ER AAC Scalable");
        audioObjectTypeMap.put(Integer.valueOf(21), "ER TwinVQ");
        audioObjectTypeMap.put(Integer.valueOf(22), "ER BSAC");
        audioObjectTypeMap.put(Integer.valueOf(23), "ER AAC LD");
        audioObjectTypeMap.put(Integer.valueOf(24), "ER CELP");
        audioObjectTypeMap.put(Integer.valueOf(25), "ER HVXC");
        audioObjectTypeMap.put(Integer.valueOf(26), "ER HILN");
        audioObjectTypeMap.put(Integer.valueOf(27), "ER Parametric");
        audioObjectTypeMap.put(Integer.valueOf(28), "SSC");
        audioObjectTypeMap.put(Integer.valueOf(29), "PS");
        audioObjectTypeMap.put(Integer.valueOf(30), "MPEG Surround");
        audioObjectTypeMap.put(Integer.valueOf(31), "(escape)");
        audioObjectTypeMap.put(Integer.valueOf(32), "Layer-1");
        audioObjectTypeMap.put(Integer.valueOf(33), "Layer-2");
        audioObjectTypeMap.put(Integer.valueOf(34), "Layer-3");
        audioObjectTypeMap.put(Integer.valueOf(35), "DST");
        audioObjectTypeMap.put(Integer.valueOf(36), "ALS");
        audioObjectTypeMap.put(Integer.valueOf(37), "SLS");
        audioObjectTypeMap.put(Integer.valueOf(38), "SLS non-core");
        audioObjectTypeMap.put(Integer.valueOf(39), "ER AAC ELD");
        audioObjectTypeMap.put(Integer.valueOf(40), "SMR Simple");
        audioObjectTypeMap.put(Integer.valueOf(41), "SMR Main");
    }
}
