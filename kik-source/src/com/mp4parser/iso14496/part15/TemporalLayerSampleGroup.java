// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.nio.ByteBuffer;

public class TemporalLayerSampleGroup extends GroupEntry
{

    public static final String TYPE = "tscl";
    int temporalLayerId;
    int tlAvgBitRate;
    int tlAvgFrameRate;
    int tlConstantFrameRate;
    int tlMaxBitRate;
    long tlconstraint_indicator_flags;
    int tllevel_idc;
    long tlprofile_compatibility_flags;
    int tlprofile_idc;
    int tlprofile_space;
    boolean tltier_flag;

    public TemporalLayerSampleGroup()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TemporalLayerSampleGroup)obj;
            if (temporalLayerId != ((TemporalLayerSampleGroup) (obj)).temporalLayerId)
            {
                return false;
            }
            if (tlAvgBitRate != ((TemporalLayerSampleGroup) (obj)).tlAvgBitRate)
            {
                return false;
            }
            if (tlAvgFrameRate != ((TemporalLayerSampleGroup) (obj)).tlAvgFrameRate)
            {
                return false;
            }
            if (tlConstantFrameRate != ((TemporalLayerSampleGroup) (obj)).tlConstantFrameRate)
            {
                return false;
            }
            if (tlMaxBitRate != ((TemporalLayerSampleGroup) (obj)).tlMaxBitRate)
            {
                return false;
            }
            if (tlconstraint_indicator_flags != ((TemporalLayerSampleGroup) (obj)).tlconstraint_indicator_flags)
            {
                return false;
            }
            if (tllevel_idc != ((TemporalLayerSampleGroup) (obj)).tllevel_idc)
            {
                return false;
            }
            if (tlprofile_compatibility_flags != ((TemporalLayerSampleGroup) (obj)).tlprofile_compatibility_flags)
            {
                return false;
            }
            if (tlprofile_idc != ((TemporalLayerSampleGroup) (obj)).tlprofile_idc)
            {
                return false;
            }
            if (tlprofile_space != ((TemporalLayerSampleGroup) (obj)).tlprofile_space)
            {
                return false;
            }
            if (tltier_flag != ((TemporalLayerSampleGroup) (obj)).tltier_flag)
            {
                return false;
            }
        }
        return true;
    }

    public ByteBuffer get()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(20);
        IsoTypeWriter.writeUInt8(bytebuffer, temporalLayerId);
        int i = tlprofile_space;
        byte byte0;
        if (tltier_flag)
        {
            byte0 = 32;
        } else
        {
            byte0 = 0;
        }
        IsoTypeWriter.writeUInt8(bytebuffer, byte0 + (i << 6) + tlprofile_idc);
        IsoTypeWriter.writeUInt32(bytebuffer, tlprofile_compatibility_flags);
        IsoTypeWriter.writeUInt48(bytebuffer, tlconstraint_indicator_flags);
        IsoTypeWriter.writeUInt8(bytebuffer, tllevel_idc);
        IsoTypeWriter.writeUInt16(bytebuffer, tlMaxBitRate);
        IsoTypeWriter.writeUInt16(bytebuffer, tlAvgBitRate);
        IsoTypeWriter.writeUInt8(bytebuffer, tlConstantFrameRate);
        IsoTypeWriter.writeUInt16(bytebuffer, tlAvgFrameRate);
        return (ByteBuffer)bytebuffer.rewind();
    }

    public int getTemporalLayerId()
    {
        return temporalLayerId;
    }

    public int getTlAvgBitRate()
    {
        return tlAvgBitRate;
    }

    public int getTlAvgFrameRate()
    {
        return tlAvgFrameRate;
    }

    public int getTlConstantFrameRate()
    {
        return tlConstantFrameRate;
    }

    public int getTlMaxBitRate()
    {
        return tlMaxBitRate;
    }

    public long getTlconstraint_indicator_flags()
    {
        return tlconstraint_indicator_flags;
    }

    public int getTllevel_idc()
    {
        return tllevel_idc;
    }

    public long getTlprofile_compatibility_flags()
    {
        return tlprofile_compatibility_flags;
    }

    public int getTlprofile_idc()
    {
        return tlprofile_idc;
    }

    public int getTlprofile_space()
    {
        return tlprofile_space;
    }

    public String getType()
    {
        return "tscl";
    }

    public int hashCode()
    {
        int j = temporalLayerId;
        int k = tlprofile_space;
        int i;
        if (tltier_flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return ((((((((i + (j * 31 + k) * 31) * 31 + tlprofile_idc) * 31 + (int)(tlprofile_compatibility_flags ^ tlprofile_compatibility_flags >>> 32)) * 31 + (int)(tlconstraint_indicator_flags ^ tlconstraint_indicator_flags >>> 32)) * 31 + tllevel_idc) * 31 + tlMaxBitRate) * 31 + tlAvgBitRate) * 31 + tlConstantFrameRate) * 31 + tlAvgFrameRate;
    }

    public boolean isTltier_flag()
    {
        return tltier_flag;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        temporalLayerId = IsoTypeReader.readUInt8(bytebuffer);
        int i = IsoTypeReader.readUInt8(bytebuffer);
        tlprofile_space = (i & 0xc0) >> 6;
        boolean flag;
        if ((i & 0x20) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        tltier_flag = flag;
        tlprofile_idc = i & 0x1f;
        tlprofile_compatibility_flags = IsoTypeReader.readUInt32(bytebuffer);
        tlconstraint_indicator_flags = IsoTypeReader.readUInt48(bytebuffer);
        tllevel_idc = IsoTypeReader.readUInt8(bytebuffer);
        tlMaxBitRate = IsoTypeReader.readUInt16(bytebuffer);
        tlAvgBitRate = IsoTypeReader.readUInt16(bytebuffer);
        tlConstantFrameRate = IsoTypeReader.readUInt8(bytebuffer);
        tlAvgFrameRate = IsoTypeReader.readUInt16(bytebuffer);
    }

    public void setTemporalLayerId(int i)
    {
        temporalLayerId = i;
    }

    public void setTlAvgBitRate(int i)
    {
        tlAvgBitRate = i;
    }

    public void setTlAvgFrameRate(int i)
    {
        tlAvgFrameRate = i;
    }

    public void setTlConstantFrameRate(int i)
    {
        tlConstantFrameRate = i;
    }

    public void setTlMaxBitRate(int i)
    {
        tlMaxBitRate = i;
    }

    public void setTlconstraint_indicator_flags(long l)
    {
        tlconstraint_indicator_flags = l;
    }

    public void setTllevel_idc(int i)
    {
        tllevel_idc = i;
    }

    public void setTlprofile_compatibility_flags(long l)
    {
        tlprofile_compatibility_flags = l;
    }

    public void setTlprofile_idc(int i)
    {
        tlprofile_idc = i;
    }

    public void setTlprofile_space(int i)
    {
        tlprofile_space = i;
    }

    public void setTltier_flag(boolean flag)
    {
        tltier_flag = flag;
    }

    public int size()
    {
        return 20;
    }

    public String toString()
    {
        return (new StringBuilder("TemporalLayerSampleGroup{temporalLayerId=")).append(temporalLayerId).append(", tlprofile_space=").append(tlprofile_space).append(", tltier_flag=").append(tltier_flag).append(", tlprofile_idc=").append(tlprofile_idc).append(", tlprofile_compatibility_flags=").append(tlprofile_compatibility_flags).append(", tlconstraint_indicator_flags=").append(tlconstraint_indicator_flags).append(", tllevel_idc=").append(tllevel_idc).append(", tlMaxBitRate=").append(tlMaxBitRate).append(", tlAvgBitRate=").append(tlAvgBitRate).append(", tlConstantFrameRate=").append(tlConstantFrameRate).append(", tlAvgFrameRate=").append(tlAvgFrameRate).append('}').toString();
    }
}
