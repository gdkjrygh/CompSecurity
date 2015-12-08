// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.b.b.b.b;

public class SampleToGroupBox extends AbstractFullBox
{
    public static class Entry
    {

        private int groupDescriptionIndex;
        private long sampleCount;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (groupDescriptionIndex != ((Entry) (obj)).groupDescriptionIndex)
                {
                    return false;
                }
                if (sampleCount != ((Entry) (obj)).sampleCount)
                {
                    return false;
                }
            }
            return true;
        }

        public int getGroupDescriptionIndex()
        {
            return groupDescriptionIndex;
        }

        public long getSampleCount()
        {
            return sampleCount;
        }

        public int hashCode()
        {
            return (int)(sampleCount ^ sampleCount >>> 32) * 31 + groupDescriptionIndex;
        }

        public void setGroupDescriptionIndex(int i)
        {
            groupDescriptionIndex = i;
        }

        public void setSampleCount(long l)
        {
            sampleCount = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{sampleCount=")).append(sampleCount).append(", groupDescriptionIndex=").append(groupDescriptionIndex).append('}').toString();
        }

        public Entry(long l, int i)
        {
            sampleCount = l;
            groupDescriptionIndex = i;
        }
    }


    public static final String TYPE = "sbgp";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    List entries;
    private String groupingType;
    private String groupingTypeParameter;

    public SampleToGroupBox()
    {
        super("sbgp");
        entries = new LinkedList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SampleToGroupBox.java", com/googlecode/mp4parser/boxes/mp4/samplegrouping/SampleToGroupBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 150);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", "", "void"), 154);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 158);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", "", "void"), 162);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.util.List"), 166);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.util.List", "entries", "", "void"), 170);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        groupingType = IsoTypeReader.read4cc(bytebuffer);
        if (getVersion() == 1)
        {
            groupingTypeParameter = IsoTypeReader.read4cc(bytebuffer);
        }
        long l = IsoTypeReader.readUInt32(bytebuffer);
        do
        {
            if (l <= 0L)
            {
                return;
            }
            entries.add(new Entry(CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer)), CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer))));
            l--;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(groupingType.getBytes());
        if (getVersion() == 1)
        {
            bytebuffer.put(groupingTypeParameter.getBytes());
        }
        IsoTypeWriter.writeUInt32(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Entry entry = (Entry)iterator.next();
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getSampleCount());
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getGroupDescriptionIndex());
        } while (true);
    }

    protected long getContentSize()
    {
        int i;
        if (getVersion() == 1)
        {
            i = entries.size() * 8 + 16;
        } else
        {
            i = entries.size() * 8 + 12;
        }
        return (long)i;
    }

    public List getEntries()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return entries;
    }

    public String getGroupingType()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return groupingType;
    }

    public String getGroupingTypeParameter()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return groupingTypeParameter;
    }

    public void setEntries(List list)
    {
        org.b.a.a a = b.a(ajc$tjp_5, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a);
        entries = list;
    }

    public void setGroupingType(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        groupingType = s;
    }

    public void setGroupingTypeParameter(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        groupingTypeParameter = s;
    }

    static 
    {
        ajc$preClinit();
    }
}
