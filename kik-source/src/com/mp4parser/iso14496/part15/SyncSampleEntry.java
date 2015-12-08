// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.nio.ByteBuffer;

public class SyncSampleEntry extends GroupEntry
{

    public static final String TYPE = "sync";
    int nalUnitType;
    int reserved;

    public SyncSampleEntry()
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
            obj = (SyncSampleEntry)obj;
            if (nalUnitType != ((SyncSampleEntry) (obj)).nalUnitType)
            {
                return false;
            }
            if (reserved != ((SyncSampleEntry) (obj)).reserved)
            {
                return false;
            }
        }
        return true;
    }

    public ByteBuffer get()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(1);
        IsoTypeWriter.writeUInt8(bytebuffer, nalUnitType + (reserved << 6));
        return (ByteBuffer)bytebuffer.rewind();
    }

    public int getNalUnitType()
    {
        return nalUnitType;
    }

    public int getReserved()
    {
        return reserved;
    }

    public String getType()
    {
        return "sync";
    }

    public int hashCode()
    {
        return reserved * 31 + nalUnitType;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        int i = IsoTypeReader.readUInt8(bytebuffer);
        reserved = (i & 0xc0) >> 6;
        nalUnitType = i & 0x3f;
    }

    public void setNalUnitType(int i)
    {
        nalUnitType = i;
    }

    public void setReserved(int i)
    {
        reserved = i;
    }

    public String toString()
    {
        return (new StringBuilder("SyncSampleEntry{reserved=")).append(reserved).append(", nalUnitType=").append(nalUnitType).append('}').toString();
    }
}
