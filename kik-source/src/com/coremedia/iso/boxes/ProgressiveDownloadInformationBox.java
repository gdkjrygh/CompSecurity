// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.b.b.b.b;

public class ProgressiveDownloadInformationBox extends AbstractFullBox
{
    public static class Entry
    {

        long initialDelay;
        long rate;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (initialDelay != ((Entry) (obj)).initialDelay)
                {
                    return false;
                }
                if (rate != ((Entry) (obj)).rate)
                {
                    return false;
                }
            }
            return true;
        }

        public long getInitialDelay()
        {
            return initialDelay;
        }

        public long getRate()
        {
            return rate;
        }

        public int hashCode()
        {
            return (int)(rate ^ rate >>> 32) * 31 + (int)(initialDelay ^ initialDelay >>> 32);
        }

        public void setInitialDelay(long l)
        {
            initialDelay = l;
        }

        public void setRate(long l)
        {
            rate = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{rate=")).append(rate).append(", initialDelay=").append(initialDelay).append('}').toString();
        }

        public Entry(long l, long l1)
        {
            rate = l;
            initialDelay = l1;
        }
    }


    public static final String TYPE = "pdin";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    List entries;

    public ProgressiveDownloadInformationBox()
    {
        super("pdin");
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("ProgressiveDownloadInformationBox.java", com/coremedia/iso/boxes/ProgressiveDownloadInformationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.util.List"), 38);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "java.util.List", "entries", "", "void"), 42);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.lang.String"), 112);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        entries = new LinkedList();
        do
        {
            if (bytebuffer.remaining() < 8)
            {
                return;
            }
            Entry entry = new Entry(IsoTypeReader.readUInt32(bytebuffer), IsoTypeReader.readUInt32(bytebuffer));
            entries.add(entry);
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Entry entry = (Entry)iterator.next();
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getRate());
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getInitialDelay());
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(entries.size() * 8 + 4);
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
        return (new StringBuilder("ProgressiveDownloadInfoBox{entries=")).append(entries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
