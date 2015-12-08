// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.threegpp26244;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.b.b.a.a;
import org.b.b.b.b;

public class SegmentIndexBox extends AbstractFullBox
{
    public static class Entry
    {

        byte referenceType;
        int referencedSize;
        int sapDeltaTime;
        byte sapType;
        byte startsWithSap;
        long subsegmentDuration;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (referenceType != ((Entry) (obj)).referenceType)
                {
                    return false;
                }
                if (referencedSize != ((Entry) (obj)).referencedSize)
                {
                    return false;
                }
                if (sapDeltaTime != ((Entry) (obj)).sapDeltaTime)
                {
                    return false;
                }
                if (sapType != ((Entry) (obj)).sapType)
                {
                    return false;
                }
                if (startsWithSap != ((Entry) (obj)).startsWithSap)
                {
                    return false;
                }
                if (subsegmentDuration != ((Entry) (obj)).subsegmentDuration)
                {
                    return false;
                }
            }
            return true;
        }

        public byte getReferenceType()
        {
            return referenceType;
        }

        public int getReferencedSize()
        {
            return referencedSize;
        }

        public int getSapDeltaTime()
        {
            return sapDeltaTime;
        }

        public byte getSapType()
        {
            return sapType;
        }

        public byte getStartsWithSap()
        {
            return startsWithSap;
        }

        public long getSubsegmentDuration()
        {
            return subsegmentDuration;
        }

        public int hashCode()
        {
            return ((((referenceType * 31 + referencedSize) * 31 + (int)(subsegmentDuration ^ subsegmentDuration >>> 32)) * 31 + startsWithSap) * 31 + sapType) * 31 + sapDeltaTime;
        }

        public void setReferenceType(byte byte0)
        {
            referenceType = byte0;
        }

        public void setReferencedSize(int i)
        {
            referencedSize = i;
        }

        public void setSapDeltaTime(int i)
        {
            sapDeltaTime = i;
        }

        public void setSapType(byte byte0)
        {
            sapType = byte0;
        }

        public void setStartsWithSap(byte byte0)
        {
            startsWithSap = byte0;
        }

        public void setSubsegmentDuration(long l)
        {
            subsegmentDuration = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{referenceType=")).append(referenceType).append(", referencedSize=").append(referencedSize).append(", subsegmentDuration=").append(subsegmentDuration).append(", startsWithSap=").append(startsWithSap).append(", sapType=").append(sapType).append(", sapDeltaTime=").append(sapDeltaTime).append('}').toString();
        }

        public Entry()
        {
        }

        public Entry(int i, int j, long l, boolean flag, int k, int i1)
        {
            referenceType = (byte)i;
            referencedSize = j;
            subsegmentDuration = l;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            startsWithSap = (byte)i;
            sapType = (byte)k;
            sapDeltaTime = i1;
        }
    }


    public static final String TYPE = "sidx";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_12;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    long earliestPresentationTime;
    List entries;
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    public SegmentIndexBox()
    {
        super("sidx");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SegmentIndexBox.java", com/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.util.List"), 128);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "java.util.List", "entries", "", "void"), 132);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "int"), 168);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "int", "reserved", "", "void"), 172);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "toString", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.lang.String"), 298);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 136);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "referenceId", "", "void"), 140);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 144);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "timeScale", "", "void"), 148);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 152);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "earliestPresentationTime", "", "void"), 156);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 160);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "firstOffset", "", "void"), 164);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        referenceId = IsoTypeReader.readUInt32(bytebuffer);
        timeScale = IsoTypeReader.readUInt32(bytebuffer);
        int i;
        int j;
        if (getVersion() == 0)
        {
            earliestPresentationTime = IsoTypeReader.readUInt32(bytebuffer);
            firstOffset = IsoTypeReader.readUInt32(bytebuffer);
        } else
        {
            earliestPresentationTime = IsoTypeReader.readUInt64(bytebuffer);
            firstOffset = IsoTypeReader.readUInt64(bytebuffer);
        }
        reserved = IsoTypeReader.readUInt16(bytebuffer);
        j = IsoTypeReader.readUInt16(bytebuffer);
        i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            BitReaderBuffer bitreaderbuffer = new BitReaderBuffer(bytebuffer);
            Entry entry = new Entry();
            entry.setReferenceType((byte)bitreaderbuffer.readBits(1));
            entry.setReferencedSize(bitreaderbuffer.readBits(31));
            entry.setSubsegmentDuration(IsoTypeReader.readUInt32(bytebuffer));
            bitreaderbuffer = new BitReaderBuffer(bytebuffer);
            entry.setStartsWithSap((byte)bitreaderbuffer.readBits(1));
            entry.setSapType((byte)bitreaderbuffer.readBits(3));
            entry.setSapDeltaTime(bitreaderbuffer.readBits(28));
            entries.add(entry);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, referenceId);
        IsoTypeWriter.writeUInt32(bytebuffer, timeScale);
        Iterator iterator;
        if (getVersion() == 0)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, earliestPresentationTime);
            IsoTypeWriter.writeUInt32(bytebuffer, firstOffset);
        } else
        {
            IsoTypeWriter.writeUInt64(bytebuffer, earliestPresentationTime);
            IsoTypeWriter.writeUInt64(bytebuffer, firstOffset);
        }
        IsoTypeWriter.writeUInt16(bytebuffer, reserved);
        IsoTypeWriter.writeUInt16(bytebuffer, entries.size());
        iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Entry entry = (Entry)iterator.next();
            BitWriterBuffer bitwriterbuffer = new BitWriterBuffer(bytebuffer);
            bitwriterbuffer.writeBits(entry.getReferenceType(), 1);
            bitwriterbuffer.writeBits(entry.getReferencedSize(), 31);
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getSubsegmentDuration());
            bitwriterbuffer = new BitWriterBuffer(bytebuffer);
            bitwriterbuffer.writeBits(entry.getStartsWithSap(), 1);
            bitwriterbuffer.writeBits(entry.getSapType(), 3);
            bitwriterbuffer.writeBits(entry.getSapDeltaTime(), 28);
        } while (true);
    }

    protected long getContentSize()
    {
        int i;
        if (getVersion() == 0)
        {
            i = 8;
        } else
        {
            i = 16;
        }
        return (long)i + 12L + 2L + 2L + (long)(entries.size() * 12);
    }

    public long getEarliestPresentationTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return earliestPresentationTime;
    }

    public List getEntries()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return entries;
    }

    public long getFirstOffset()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return firstOffset;
    }

    public long getReferenceId()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return referenceId;
    }

    public int getReserved()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved;
    }

    public long getTimeScale()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return timeScale;
    }

    public void setEarliestPresentationTime(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        earliestPresentationTime = l;
    }

    public void setEntries(List list)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a1);
        entries = list;
    }

    public void setFirstOffset(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        firstOffset = l;
    }

    public void setReferenceId(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        referenceId = l;
    }

    public void setReserved(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved = i;
    }

    public void setTimeScale(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        timeScale = l;
    }

    public String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("SegmentIndexBox{entries=")).append(entries).append(", referenceId=").append(referenceId).append(", timeScale=").append(timeScale).append(", earliestPresentationTime=").append(earliestPresentationTime).append(", firstOffset=").append(firstOffset).append(", reserved=").append(reserved).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
