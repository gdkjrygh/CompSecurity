// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.b.b.b.b;

public class SubSampleInformationBox extends AbstractFullBox
{
    public static class SubSampleEntry
    {

        private long sampleDelta;
        private List subsampleEntries;

        public long getSampleDelta()
        {
            return sampleDelta;
        }

        public int getSubsampleCount()
        {
            return subsampleEntries.size();
        }

        public List getSubsampleEntries()
        {
            return subsampleEntries;
        }

        public void setSampleDelta(long l)
        {
            sampleDelta = l;
        }

        public String toString()
        {
            return (new StringBuilder("SampleEntry{sampleDelta=")).append(sampleDelta).append(", subsampleCount=").append(subsampleEntries.size()).append(", subsampleEntries=").append(subsampleEntries).append('}').toString();
        }

        public SubSampleEntry()
        {
            subsampleEntries = new ArrayList();
        }
    }

    public static class SubSampleEntry.SubsampleEntry
    {

        private int discardable;
        private long reserved;
        private int subsamplePriority;
        private long subsampleSize;

        public int getDiscardable()
        {
            return discardable;
        }

        public long getReserved()
        {
            return reserved;
        }

        public int getSubsamplePriority()
        {
            return subsamplePriority;
        }

        public long getSubsampleSize()
        {
            return subsampleSize;
        }

        public void setDiscardable(int i)
        {
            discardable = i;
        }

        public void setReserved(long l)
        {
            reserved = l;
        }

        public void setSubsamplePriority(int i)
        {
            subsamplePriority = i;
        }

        public void setSubsampleSize(long l)
        {
            subsampleSize = l;
        }

        public String toString()
        {
            return (new StringBuilder("SubsampleEntry{subsampleSize=")).append(subsampleSize).append(", subsamplePriority=").append(subsamplePriority).append(", discardable=").append(discardable).append(", reserved=").append(reserved).append('}').toString();
        }

        public SubSampleEntry.SubsampleEntry()
        {
        }
    }


    public static final String TYPE = "subs";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private List entries;

    public SubSampleInformationBox()
    {
        super("subs");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SubSampleInformationBox.java", com/coremedia/iso/boxes/SubSampleInformationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 50);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 54);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 124);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        int i;
        long l1;
        parseVersionAndFlags(bytebuffer);
        l1 = IsoTypeReader.readUInt32(bytebuffer);
        i = 0;
_L2:
        if ((long)i >= l1)
        {
            return;
        }
        SubSampleEntry subsampleentry = new SubSampleEntry();
        subsampleentry.setSampleDelta(IsoTypeReader.readUInt32(bytebuffer));
        int k = IsoTypeReader.readUInt16(bytebuffer);
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    break label0;
                }
                entries.add(subsampleentry);
                i++;
            }
            if (true)
            {
                continue;
            }
            SubSampleEntry.SubsampleEntry subsampleentry1 = new SubSampleEntry.SubsampleEntry();
            long l;
            if (getVersion() == 1)
            {
                l = IsoTypeReader.readUInt32(bytebuffer);
            } else
            {
                l = IsoTypeReader.readUInt16(bytebuffer);
            }
            subsampleentry1.setSubsampleSize(l);
            subsampleentry1.setSubsamplePriority(IsoTypeReader.readUInt8(bytebuffer));
            subsampleentry1.setDiscardable(IsoTypeReader.readUInt8(bytebuffer));
            subsampleentry1.setReserved(IsoTypeReader.readUInt32(bytebuffer));
            subsampleentry.getSubsampleEntries().add(subsampleentry1);
            j++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Object obj = (SubSampleEntry)iterator.next();
            IsoTypeWriter.writeUInt32(bytebuffer, ((SubSampleEntry) (obj)).getSampleDelta());
            IsoTypeWriter.writeUInt16(bytebuffer, ((SubSampleEntry) (obj)).getSubsampleCount());
            obj = ((SubSampleEntry) (obj)).getSubsampleEntries().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                SubSampleEntry.SubsampleEntry subsampleentry = (SubSampleEntry.SubsampleEntry)((Iterator) (obj)).next();
                if (getVersion() == 1)
                {
                    IsoTypeWriter.writeUInt32(bytebuffer, subsampleentry.getSubsampleSize());
                } else
                {
                    IsoTypeWriter.writeUInt16(bytebuffer, CastUtils.l2i(subsampleentry.getSubsampleSize()));
                }
                IsoTypeWriter.writeUInt8(bytebuffer, subsampleentry.getSubsamplePriority());
                IsoTypeWriter.writeUInt8(bytebuffer, subsampleentry.getDiscardable());
                IsoTypeWriter.writeUInt32(bytebuffer, subsampleentry.getReserved());
            }
        } while (true);
    }

    protected long getContentSize()
    {
        Iterator iterator;
        long l1;
        iterator = entries.iterator();
        l1 = 8L;
_L2:
        if (!iterator.hasNext())
        {
            return l1;
        }
        SubSampleEntry subsampleentry = (SubSampleEntry)iterator.next();
        long l = l1 + 4L + 2L;
        int i = 0;
        do
        {
            l1 = l;
            if (i >= subsampleentry.getSubsampleEntries().size())
            {
                continue;
            }
            if (getVersion() == 1)
            {
                l += 4L;
            } else
            {
                l += 2L;
            }
            l = l + 2L + 4L;
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public List getEntries()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return entries;
    }

    public void setEntries(List list)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a);
        entries = list;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("SubSampleInformationBox{entryCount=")).append(entries.size()).append(", entries=").append(entries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
