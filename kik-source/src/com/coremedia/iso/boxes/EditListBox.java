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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.b.b.b.b;

public class EditListBox extends AbstractFullBox
{
    public static class Entry
    {

        EditListBox editListBox;
        private double mediaRate;
        private long mediaTime;
        private long segmentDuration;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (mediaTime != ((Entry) (obj)).mediaTime)
                {
                    return false;
                }
                if (segmentDuration != ((Entry) (obj)).segmentDuration)
                {
                    return false;
                }
            }
            return true;
        }

        public void getContent(ByteBuffer bytebuffer)
        {
            if (editListBox.getVersion() == 1)
            {
                IsoTypeWriter.writeUInt64(bytebuffer, segmentDuration);
                bytebuffer.putLong(mediaTime);
            } else
            {
                IsoTypeWriter.writeUInt32(bytebuffer, CastUtils.l2i(segmentDuration));
                bytebuffer.putInt(CastUtils.l2i(mediaTime));
            }
            IsoTypeWriter.writeFixedPoint1616(bytebuffer, mediaRate);
        }

        public double getMediaRate()
        {
            return mediaRate;
        }

        public long getMediaTime()
        {
            return mediaTime;
        }

        public long getSegmentDuration()
        {
            return segmentDuration;
        }

        public int hashCode()
        {
            return (int)(segmentDuration ^ segmentDuration >>> 32) * 31 + (int)(mediaTime ^ mediaTime >>> 32);
        }

        public void setMediaRate(double d)
        {
            mediaRate = d;
        }

        public void setMediaTime(long l)
        {
            mediaTime = l;
        }

        public void setSegmentDuration(long l)
        {
            segmentDuration = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{segmentDuration=")).append(segmentDuration).append(", mediaTime=").append(mediaTime).append(", mediaRate=").append(mediaRate).append('}').toString();
        }

        public Entry(EditListBox editlistbox, long l, long l1, double d)
        {
            segmentDuration = l;
            mediaTime = l1;
            mediaRate = d;
            editListBox = editlistbox;
        }

        public Entry(EditListBox editlistbox, ByteBuffer bytebuffer)
        {
            if (editlistbox.getVersion() == 1)
            {
                segmentDuration = IsoTypeReader.readUInt64(bytebuffer);
                mediaTime = bytebuffer.getLong();
                mediaRate = IsoTypeReader.readFixedPoint1616(bytebuffer);
            } else
            {
                segmentDuration = IsoTypeReader.readUInt32(bytebuffer);
                mediaTime = bytebuffer.getInt();
                mediaRate = IsoTypeReader.readFixedPoint1616(bytebuffer);
            }
            editListBox = editlistbox;
        }
    }


    public static final String TYPE = "elst";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private List entries;

    public EditListBox()
    {
        super("elst");
        entries = new LinkedList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("EditListBox.java", com/coremedia/iso/boxes/EditListBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", "entries", "", "void"), 72);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"), 108);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        entries = new LinkedList();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            entries.add(new Entry(this, bytebuffer));
            i++;
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
            ((Entry)iterator.next()).getContent(bytebuffer);
        } while (true);
    }

    protected long getContentSize()
    {
        if (getVersion() == 1)
        {
            return (long)(entries.size() * 20) + 8L;
        } else
        {
            return (long)(entries.size() * 12) + 8L;
        }
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
        return (new StringBuilder("EditListBox{entries=")).append(entries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
