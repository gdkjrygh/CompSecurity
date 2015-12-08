// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HevcDecoderConfigurationRecord
{
    public static class Array
    {

        public boolean array_completeness;
        public List nalUnits;
        public int nal_unit_type;
        public boolean reserved;

        public boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            Object obj1 = (Array)obj;
            if (array_completeness != ((Array) (obj1)).array_completeness)
            {
                return false;
            }
            if (nal_unit_type != ((Array) (obj1)).nal_unit_type)
            {
                return false;
            }
            if (reserved != ((Array) (obj1)).reserved)
            {
                return false;
            }
            obj = nalUnits.listIterator();
            obj1 = ((Array) (obj1)).nalUnits.listIterator();
            do
            {
                byte abyte0[];
                byte abyte1[];
                if (!((ListIterator) (obj)).hasNext() || !((ListIterator) (obj1)).hasNext())
                {
                    return !((ListIterator) (obj)).hasNext() && !((ListIterator) (obj1)).hasNext();
                }
                abyte0 = (byte[])((ListIterator) (obj)).next();
                abyte1 = (byte[])((ListIterator) (obj1)).next();
            } while (abyte0 != null ? Arrays.equals(abyte0, abyte1) : abyte1 == null);
            return false;
        }

        public int hashCode()
        {
            int j = 1;
            int k = 0;
            int i;
            int l;
            if (array_completeness)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (!reserved)
            {
                j = 0;
            }
            l = nal_unit_type;
            if (nalUnits != null)
            {
                k = nalUnits.hashCode();
            }
            return ((i * 31 + j) * 31 + l) * 31 + k;
        }

        public String toString()
        {
            return (new StringBuilder("Array{nal_unit_type=")).append(nal_unit_type).append(", reserved=").append(reserved).append(", array_completeness=").append(array_completeness).append(", num_nals=").append(nalUnits.size()).append('}').toString();
        }

        public Array()
        {
        }
    }


    List arrays;
    int avgFrameRate;
    int bitDepthChromaMinus8;
    int bitDepthLumaMinus8;
    int chromaFormat;
    int configurationVersion;
    int constantFrameRate;
    boolean frame_only_constraint_flag;
    long general_constraint_indicator_flags;
    int general_level_idc;
    long general_profile_compatibility_flags;
    int general_profile_idc;
    int general_profile_space;
    boolean general_tier_flag;
    boolean interlaced_source_flag;
    int lengthSizeMinusOne;
    int min_spatial_segmentation_idc;
    boolean non_packed_constraint_flag;
    int numTemporalLayers;
    int parallelismType;
    boolean progressive_source_flag;
    int reserved1;
    int reserved2;
    int reserved3;
    int reserved4;
    int reserved5;
    boolean temporalIdNested;

    public HevcDecoderConfigurationRecord()
    {
        reserved1 = 15;
        reserved2 = 63;
        reserved3 = 63;
        reserved4 = 31;
        reserved5 = 31;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (HevcDecoderConfigurationRecord)obj;
            if (avgFrameRate != ((HevcDecoderConfigurationRecord) (obj)).avgFrameRate)
            {
                return false;
            }
            if (bitDepthChromaMinus8 != ((HevcDecoderConfigurationRecord) (obj)).bitDepthChromaMinus8)
            {
                return false;
            }
            if (bitDepthLumaMinus8 != ((HevcDecoderConfigurationRecord) (obj)).bitDepthLumaMinus8)
            {
                return false;
            }
            if (chromaFormat != ((HevcDecoderConfigurationRecord) (obj)).chromaFormat)
            {
                return false;
            }
            if (configurationVersion != ((HevcDecoderConfigurationRecord) (obj)).configurationVersion)
            {
                return false;
            }
            if (constantFrameRate != ((HevcDecoderConfigurationRecord) (obj)).constantFrameRate)
            {
                return false;
            }
            if (general_constraint_indicator_flags != ((HevcDecoderConfigurationRecord) (obj)).general_constraint_indicator_flags)
            {
                return false;
            }
            if (general_level_idc != ((HevcDecoderConfigurationRecord) (obj)).general_level_idc)
            {
                return false;
            }
            if (general_profile_compatibility_flags != ((HevcDecoderConfigurationRecord) (obj)).general_profile_compatibility_flags)
            {
                return false;
            }
            if (general_profile_idc != ((HevcDecoderConfigurationRecord) (obj)).general_profile_idc)
            {
                return false;
            }
            if (general_profile_space != ((HevcDecoderConfigurationRecord) (obj)).general_profile_space)
            {
                return false;
            }
            if (general_tier_flag != ((HevcDecoderConfigurationRecord) (obj)).general_tier_flag)
            {
                return false;
            }
            if (lengthSizeMinusOne != ((HevcDecoderConfigurationRecord) (obj)).lengthSizeMinusOne)
            {
                return false;
            }
            if (min_spatial_segmentation_idc != ((HevcDecoderConfigurationRecord) (obj)).min_spatial_segmentation_idc)
            {
                return false;
            }
            if (numTemporalLayers != ((HevcDecoderConfigurationRecord) (obj)).numTemporalLayers)
            {
                return false;
            }
            if (parallelismType != ((HevcDecoderConfigurationRecord) (obj)).parallelismType)
            {
                return false;
            }
            if (reserved1 != ((HevcDecoderConfigurationRecord) (obj)).reserved1)
            {
                return false;
            }
            if (reserved2 != ((HevcDecoderConfigurationRecord) (obj)).reserved2)
            {
                return false;
            }
            if (reserved3 != ((HevcDecoderConfigurationRecord) (obj)).reserved3)
            {
                return false;
            }
            if (reserved4 != ((HevcDecoderConfigurationRecord) (obj)).reserved4)
            {
                return false;
            }
            if (reserved5 != ((HevcDecoderConfigurationRecord) (obj)).reserved5)
            {
                return false;
            }
            if (temporalIdNested != ((HevcDecoderConfigurationRecord) (obj)).temporalIdNested)
            {
                return false;
            }
            if (arrays == null ? ((HevcDecoderConfigurationRecord) (obj)).arrays != null : !arrays.equals(((HevcDecoderConfigurationRecord) (obj)).arrays))
            {
                return false;
            }
        }
        return true;
    }

    public List getArrays()
    {
        return arrays;
    }

    public int getAvgFrameRate()
    {
        return avgFrameRate;
    }

    public int getBitDepthChromaMinus8()
    {
        return bitDepthChromaMinus8;
    }

    public int getBitDepthLumaMinus8()
    {
        return bitDepthLumaMinus8;
    }

    public int getChromaFormat()
    {
        return chromaFormat;
    }

    public int getConfigurationVersion()
    {
        return configurationVersion;
    }

    public int getConstantFrameRate()
    {
        return constantFrameRate;
    }

    public long getGeneral_constraint_indicator_flags()
    {
        return general_constraint_indicator_flags;
    }

    public int getGeneral_level_idc()
    {
        return general_level_idc;
    }

    public long getGeneral_profile_compatibility_flags()
    {
        return general_profile_compatibility_flags;
    }

    public int getGeneral_profile_idc()
    {
        return general_profile_idc;
    }

    public int getGeneral_profile_space()
    {
        return general_profile_space;
    }

    public int getLengthSizeMinusOne()
    {
        return lengthSizeMinusOne;
    }

    public int getMin_spatial_segmentation_idc()
    {
        return min_spatial_segmentation_idc;
    }

    public int getNumTemporalLayers()
    {
        return numTemporalLayers;
    }

    public int getParallelismType()
    {
        return parallelismType;
    }

    public int getSize()
    {
        Iterator iterator;
        int j;
        iterator = arrays.iterator();
        j = 23;
_L2:
        if (!iterator.hasNext())
        {
            return j;
        }
        Object obj = (Array)iterator.next();
        int i = j + 3;
        obj = ((Array) (obj)).nalUnits.iterator();
        do
        {
            j = i;
            if (!((Iterator) (obj)).hasNext())
            {
                continue;
            }
            i = i + 2 + ((byte[])((Iterator) (obj)).next()).length;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int hashCode()
    {
        int j = 1;
        int k = 0;
        int l = configurationVersion;
        int i1 = general_profile_space;
        int i;
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
        if (general_tier_flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j1 = general_profile_idc;
        k1 = (int)(general_profile_compatibility_flags ^ general_profile_compatibility_flags >>> 32);
        l1 = (int)(general_constraint_indicator_flags ^ general_constraint_indicator_flags >>> 32);
        i2 = general_level_idc;
        j2 = reserved1;
        k2 = min_spatial_segmentation_idc;
        l2 = reserved2;
        i3 = parallelismType;
        j3 = reserved3;
        k3 = chromaFormat;
        l3 = reserved4;
        i4 = bitDepthLumaMinus8;
        j4 = reserved5;
        k4 = bitDepthChromaMinus8;
        l4 = avgFrameRate;
        i5 = constantFrameRate;
        j5 = numTemporalLayers;
        if (!temporalIdNested)
        {
            j = 0;
        }
        k5 = lengthSizeMinusOne;
        if (arrays != null)
        {
            k = arrays.hashCode();
        }
        return ((((((((((((((((((((i + (l * 31 + i1) * 31) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + i5) * 31 + j5) * 31 + j) * 31 + k5) * 31 + k;
    }

    public boolean isFrame_only_constraint_flag()
    {
        return frame_only_constraint_flag;
    }

    public boolean isGeneral_tier_flag()
    {
        return general_tier_flag;
    }

    public boolean isInterlaced_source_flag()
    {
        return interlaced_source_flag;
    }

    public boolean isNon_packed_constraint_flag()
    {
        return non_packed_constraint_flag;
    }

    public boolean isProgressive_source_flag()
    {
        return progressive_source_flag;
    }

    public boolean isTemporalIdNested()
    {
        return temporalIdNested;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        int i;
        configurationVersion = IsoTypeReader.readUInt8(bytebuffer);
        i = IsoTypeReader.readUInt8(bytebuffer);
        general_profile_space = (i & 0xc0) >> 6;
        int k;
        boolean flag;
        if ((i & 0x20) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        general_tier_flag = flag;
        general_profile_idc = i & 0x1f;
        general_profile_compatibility_flags = IsoTypeReader.readUInt32(bytebuffer);
        general_constraint_indicator_flags = IsoTypeReader.readUInt48(bytebuffer);
        if ((general_constraint_indicator_flags >> 44 & 8L) > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        frame_only_constraint_flag = flag;
        if ((general_constraint_indicator_flags >> 44 & 4L) > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        non_packed_constraint_flag = flag;
        if ((general_constraint_indicator_flags >> 44 & 2L) > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        interlaced_source_flag = flag;
        if ((general_constraint_indicator_flags >> 44 & 1L) > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        progressive_source_flag = flag;
        general_constraint_indicator_flags = general_constraint_indicator_flags & 0x7fffffffffffL;
        general_level_idc = IsoTypeReader.readUInt8(bytebuffer);
        i = IsoTypeReader.readUInt16(bytebuffer);
        reserved1 = (0xf000 & i) >> 12;
        min_spatial_segmentation_idc = i & 0xfff;
        i = IsoTypeReader.readUInt8(bytebuffer);
        reserved2 = (i & 0xfc) >> 2;
        parallelismType = i & 3;
        i = IsoTypeReader.readUInt8(bytebuffer);
        reserved3 = (i & 0xfc) >> 2;
        chromaFormat = i & 3;
        i = IsoTypeReader.readUInt8(bytebuffer);
        reserved4 = (i & 0xf8) >> 3;
        bitDepthLumaMinus8 = i & 7;
        i = IsoTypeReader.readUInt8(bytebuffer);
        reserved5 = (i & 0xf8) >> 3;
        bitDepthChromaMinus8 = i & 7;
        avgFrameRate = IsoTypeReader.readUInt16(bytebuffer);
        i = IsoTypeReader.readUInt8(bytebuffer);
        constantFrameRate = (i & 0xc0) >> 6;
        numTemporalLayers = (i & 0x38) >> 3;
        if ((i & 4) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        temporalIdNested = flag;
        lengthSizeMinusOne = i & 3;
        k = IsoTypeReader.readUInt8(bytebuffer);
        arrays = new ArrayList();
        i = 0;
_L1:
        Array array;
        int j;
        if (i >= k)
        {
            return;
        }
        array = new Array();
        j = IsoTypeReader.readUInt8(bytebuffer);
        int l;
        boolean flag1;
        if ((j & 0x80) > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        array.array_completeness = flag1;
        if ((j & 0x40) > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        array.reserved = flag1;
        array.nal_unit_type = j & 0x3f;
        l = IsoTypeReader.readUInt16(bytebuffer);
        array.nalUnits = new ArrayList();
        j = 0;
_L2:
label0:
        {
            if (j < l)
            {
                break label0;
            }
            arrays.add(array);
            i++;
        }
          goto _L1
        byte abyte0[] = new byte[IsoTypeReader.readUInt16(bytebuffer)];
        bytebuffer.get(abyte0);
        array.nalUnits.add(abyte0);
        j++;
          goto _L2
    }

    public void setArrays(List list)
    {
        arrays = list;
    }

    public void setAvgFrameRate(int i)
    {
        avgFrameRate = i;
    }

    public void setBitDepthChromaMinus8(int i)
    {
        bitDepthChromaMinus8 = i;
    }

    public void setBitDepthLumaMinus8(int i)
    {
        bitDepthLumaMinus8 = i;
    }

    public void setChromaFormat(int i)
    {
        chromaFormat = i;
    }

    public void setConfigurationVersion(int i)
    {
        configurationVersion = i;
    }

    public void setConstantFrameRate(int i)
    {
        constantFrameRate = i;
    }

    public void setFrame_only_constraint_flag(boolean flag)
    {
        frame_only_constraint_flag = flag;
    }

    public void setGeneral_constraint_indicator_flags(long l)
    {
        general_constraint_indicator_flags = l;
    }

    public void setGeneral_level_idc(int i)
    {
        general_level_idc = i;
    }

    public void setGeneral_profile_compatibility_flags(long l)
    {
        general_profile_compatibility_flags = l;
    }

    public void setGeneral_profile_idc(int i)
    {
        general_profile_idc = i;
    }

    public void setGeneral_profile_space(int i)
    {
        general_profile_space = i;
    }

    public void setGeneral_tier_flag(boolean flag)
    {
        general_tier_flag = flag;
    }

    public void setInterlaced_source_flag(boolean flag)
    {
        interlaced_source_flag = flag;
    }

    public void setLengthSizeMinusOne(int i)
    {
        lengthSizeMinusOne = i;
    }

    public void setMin_spatial_segmentation_idc(int i)
    {
        min_spatial_segmentation_idc = i;
    }

    public void setNon_packed_constraint_flag(boolean flag)
    {
        non_packed_constraint_flag = flag;
    }

    public void setNumTemporalLayers(int i)
    {
        numTemporalLayers = i;
    }

    public void setParallelismType(int i)
    {
        parallelismType = i;
    }

    public void setProgressive_source_flag(boolean flag)
    {
        progressive_source_flag = flag;
    }

    public void setTemporalIdNested(boolean flag)
    {
        temporalIdNested = flag;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=")).append(configurationVersion).append(", general_profile_space=").append(general_profile_space).append(", general_tier_flag=").append(general_tier_flag).append(", general_profile_idc=").append(general_profile_idc).append(", general_profile_compatibility_flags=").append(general_profile_compatibility_flags).append(", general_constraint_indicator_flags=").append(general_constraint_indicator_flags).append(", general_level_idc=").append(general_level_idc);
        String s;
        if (reserved1 != 15)
        {
            s = (new StringBuilder(", reserved1=")).append(reserved1).toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s).append(", min_spatial_segmentation_idc=").append(min_spatial_segmentation_idc);
        if (reserved2 != 63)
        {
            s = (new StringBuilder(", reserved2=")).append(reserved2).toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s).append(", parallelismType=").append(parallelismType);
        if (reserved3 != 63)
        {
            s = (new StringBuilder(", reserved3=")).append(reserved3).toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s).append(", chromaFormat=").append(chromaFormat);
        if (reserved4 != 31)
        {
            s = (new StringBuilder(", reserved4=")).append(reserved4).toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s).append(", bitDepthLumaMinus8=").append(bitDepthLumaMinus8);
        if (reserved5 != 31)
        {
            s = (new StringBuilder(", reserved5=")).append(reserved5).toString();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(", bitDepthChromaMinus8=").append(bitDepthChromaMinus8).append(", avgFrameRate=").append(avgFrameRate).append(", constantFrameRate=").append(constantFrameRate).append(", numTemporalLayers=").append(numTemporalLayers).append(", temporalIdNested=").append(temporalIdNested).append(", lengthSizeMinusOne=").append(lengthSizeMinusOne).append(", arrays=").append(arrays).append('}').toString();
    }

    public void write(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt8(bytebuffer, configurationVersion);
        int i = general_profile_space;
        Iterator iterator;
        char c;
        int j;
        long l;
        long l1;
        if (general_tier_flag)
        {
            c = ' ';
        } else
        {
            c = '\0';
        }
        IsoTypeWriter.writeUInt8(bytebuffer, c + (i << 6) + general_profile_idc);
        IsoTypeWriter.writeUInt32(bytebuffer, general_profile_compatibility_flags);
        l1 = general_constraint_indicator_flags;
        l = l1;
        if (frame_only_constraint_flag)
        {
            l = l1 | 0x800000000000L;
        }
        l1 = l;
        if (non_packed_constraint_flag)
        {
            l1 = l | 0x400000000000L;
        }
        l = l1;
        if (interlaced_source_flag)
        {
            l = l1 | 0x200000000000L;
        }
        l1 = l;
        if (progressive_source_flag)
        {
            l1 = l | 0x100000000000L;
        }
        IsoTypeWriter.writeUInt48(bytebuffer, l1);
        IsoTypeWriter.writeUInt8(bytebuffer, general_level_idc);
        IsoTypeWriter.writeUInt16(bytebuffer, (reserved1 << 12) + min_spatial_segmentation_idc);
        IsoTypeWriter.writeUInt8(bytebuffer, (reserved2 << 2) + parallelismType);
        IsoTypeWriter.writeUInt8(bytebuffer, (reserved3 << 2) + chromaFormat);
        IsoTypeWriter.writeUInt8(bytebuffer, (reserved4 << 3) + bitDepthLumaMinus8);
        IsoTypeWriter.writeUInt8(bytebuffer, (reserved5 << 3) + bitDepthChromaMinus8);
        IsoTypeWriter.writeUInt16(bytebuffer, avgFrameRate);
        i = constantFrameRate;
        j = numTemporalLayers;
        if (temporalIdNested)
        {
            c = '\004';
        } else
        {
            c = '\0';
        }
        IsoTypeWriter.writeUInt8(bytebuffer, c + ((j << 3) + (i << 6)) + lengthSizeMinusOne);
        IsoTypeWriter.writeUInt8(bytebuffer, arrays.size());
        iterator = arrays.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Object obj = (Array)iterator.next();
            byte byte0;
            if (((Array) (obj)).array_completeness)
            {
                c = '\200';
            } else
            {
                c = '\0';
            }
            if (((Array) (obj)).reserved)
            {
                byte0 = 64;
            } else
            {
                byte0 = 0;
            }
            IsoTypeWriter.writeUInt8(bytebuffer, c + byte0 + ((Array) (obj)).nal_unit_type);
            IsoTypeWriter.writeUInt16(bytebuffer, ((Array) (obj)).nalUnits.size());
            obj = ((Array) (obj)).nalUnits.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                byte abyte0[] = (byte[])((Iterator) (obj)).next();
                IsoTypeWriter.writeUInt16(bytebuffer, abyte0.length);
                bytebuffer.put(abyte0);
            }
        } while (true);
    }
}
