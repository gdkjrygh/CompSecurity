// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.b.b.a.a;
import org.b.b.b.b;

public class EC3SpecificBox extends AbstractBox
{
    public static class Entry
    {

        public int acmod;
        public int bsid;
        public int bsmod;
        public int chan_loc;
        public int fscod;
        public int lfeon;
        public int num_dep_sub;
        public int reserved;
        public int reserved2;

        public String toString()
        {
            return (new StringBuilder("Entry{fscod=")).append(fscod).append(", bsid=").append(bsid).append(", bsmod=").append(bsmod).append(", acmod=").append(acmod).append(", lfeon=").append(lfeon).append(", reserved=").append(reserved).append(", num_dep_sub=").append(num_dep_sub).append(", chan_loc=").append(chan_loc).append(", reserved2=").append(reserved2).append('}').toString();
        }

        public Entry()
        {
        }
    }


    public static final String TYPE = "dec3";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    int dataRate;
    List entries;
    int numIndSub;

    public EC3SpecificBox()
    {
        super("dec3");
        entries = new LinkedList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("EC3SpecificBox.java", com/googlecode/mp4parser/boxes/EC3SpecificBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getContentSize", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "long"), 25);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getContent", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 65);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "java.util.List"), 86);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.util.List", "entries", "", "void"), 90);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "addEntry", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry", "entry", "", "void"), 94);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"), 98);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "setDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "dataRate", "", "void"), 102);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "getNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"), 106);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "setNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "numIndSub", "", "void"), 110);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        bytebuffer = new BitReaderBuffer(bytebuffer);
        dataRate = bytebuffer.readBits(13);
        numIndSub = bytebuffer.readBits(3) + 1;
        int i = 0;
        do
        {
            if (i >= numIndSub)
            {
                return;
            }
            Entry entry = new Entry();
            entry.fscod = bytebuffer.readBits(2);
            entry.bsid = bytebuffer.readBits(5);
            entry.bsmod = bytebuffer.readBits(5);
            entry.acmod = bytebuffer.readBits(3);
            entry.lfeon = bytebuffer.readBits(1);
            entry.reserved = bytebuffer.readBits(3);
            entry.num_dep_sub = bytebuffer.readBits(4);
            if (entry.num_dep_sub > 0)
            {
                entry.chan_loc = bytebuffer.readBits(9);
            } else
            {
                entry.reserved2 = bytebuffer.readBits(1);
            }
            entries.add(entry);
            i++;
        } while (true);
    }

    public void addEntry(Entry entry)
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this, entry);
        RequiresParseDetailAspect.aspectOf().before(a1);
        entries.add(entry);
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        Object obj = b.a(ajc$tjp_1, this, this, bytebuffer);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        bytebuffer = new BitWriterBuffer(bytebuffer);
        bytebuffer.writeBits(dataRate, 13);
        bytebuffer.writeBits(entries.size() - 1, 3);
        obj = entries.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                return;
            }
            Entry entry = (Entry)((Iterator) (obj)).next();
            bytebuffer.writeBits(entry.fscod, 2);
            bytebuffer.writeBits(entry.bsid, 5);
            bytebuffer.writeBits(entry.bsmod, 5);
            bytebuffer.writeBits(entry.acmod, 3);
            bytebuffer.writeBits(entry.lfeon, 1);
            bytebuffer.writeBits(entry.reserved, 3);
            bytebuffer.writeBits(entry.num_dep_sub, 4);
            if (entry.num_dep_sub > 0)
            {
                bytebuffer.writeBits(entry.chan_loc, 9);
            } else
            {
                bytebuffer.writeBits(entry.reserved2, 1);
            }
        } while (true);
    }

    public long getContentSize()
    {
        Object obj = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = entries.iterator();
        long l = 2L;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                return l;
            }
            if (((Entry)((Iterator) (obj)).next()).num_dep_sub > 0)
            {
                l = 4L + l;
            } else
            {
                l = 3L + l;
            }
        } while (true);
    }

    public int getDataRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return dataRate;
    }

    public List getEntries()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return entries;
    }

    public int getNumIndSub()
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return numIndSub;
    }

    public void setDataRate(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        dataRate = i;
    }

    public void setEntries(List list)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a1);
        entries = list;
    }

    public void setNumIndSub(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        numIndSub = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
