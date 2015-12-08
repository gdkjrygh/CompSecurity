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
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.b.b.a.a;
import org.b.b.b.b;

public class SampleToChunkBox extends AbstractFullBox
{
    public static class Entry
    {

        long firstChunk;
        long sampleDescriptionIndex;
        long samplesPerChunk;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (firstChunk != ((Entry) (obj)).firstChunk)
                {
                    return false;
                }
                if (sampleDescriptionIndex != ((Entry) (obj)).sampleDescriptionIndex)
                {
                    return false;
                }
                if (samplesPerChunk != ((Entry) (obj)).samplesPerChunk)
                {
                    return false;
                }
            }
            return true;
        }

        public long getFirstChunk()
        {
            return firstChunk;
        }

        public long getSampleDescriptionIndex()
        {
            return sampleDescriptionIndex;
        }

        public long getSamplesPerChunk()
        {
            return samplesPerChunk;
        }

        public int hashCode()
        {
            return ((int)(firstChunk ^ firstChunk >>> 32) * 31 + (int)(samplesPerChunk ^ samplesPerChunk >>> 32)) * 31 + (int)(sampleDescriptionIndex ^ sampleDescriptionIndex >>> 32);
        }

        public void setFirstChunk(long l)
        {
            firstChunk = l;
        }

        public void setSampleDescriptionIndex(long l)
        {
            sampleDescriptionIndex = l;
        }

        public void setSamplesPerChunk(long l)
        {
            samplesPerChunk = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{firstChunk=")).append(firstChunk).append(", samplesPerChunk=").append(samplesPerChunk).append(", sampleDescriptionIndex=").append(sampleDescriptionIndex).append('}').toString();
        }

        public Entry(long l, long l1, long l2)
        {
            firstChunk = l;
            samplesPerChunk = l1;
            sampleDescriptionIndex = l2;
        }
    }


    public static final String TYPE = "stsc";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    List entries;

    public SampleToChunkBox()
    {
        super("stsc");
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SampleToChunkBox.java", com/coremedia/iso/boxes/SampleToChunkBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"), 51);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "", "[J"), 95);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        entries = new ArrayList(j);
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            entries.add(new Entry(IsoTypeReader.readUInt32(bytebuffer), IsoTypeReader.readUInt32(bytebuffer), IsoTypeReader.readUInt32(bytebuffer)));
            i++;
        } while (true);
    }

    public long[] blowup(int i)
    {
        Object obj = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        long al[] = new long[i];
        obj = new LinkedList(entries);
        Collections.reverse(((List) (obj)));
        Iterator iterator = ((List) (obj)).iterator();
        obj = (Entry)iterator.next();
        do
        {
            if (i <= 1)
            {
                al[0] = ((Entry) (obj)).getSamplesPerChunk();
                return al;
            }
            al[i - 1] = ((Entry) (obj)).getSamplesPerChunk();
            Entry entry = ((Entry) (obj));
            if ((long)i == ((Entry) (obj)).getFirstChunk())
            {
                entry = (Entry)iterator.next();
            }
            i--;
            obj = entry;
        } while (true);
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
            Entry entry = (Entry)iterator.next();
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getFirstChunk());
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getSamplesPerChunk());
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getSampleDescriptionIndex());
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(entries.size() * 12 + 8);
    }

    public List getEntries()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return entries;
    }

    public void setEntries(List list)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a1);
        entries = list;
    }

    public String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("SampleToChunkBox[entryCount=")).append(entries.size()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
