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
import java.util.List;
import org.b.b.b.b;

public class CompositionTimeToSample extends AbstractFullBox
{
    public static class Entry
    {

        int count;
        int offset;

        public int getCount()
        {
            return count;
        }

        public int getOffset()
        {
            return offset;
        }

        public void setCount(int i)
        {
            count = i;
        }

        public void setOffset(int i)
        {
            offset = i;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{count=")).append(count).append(", offset=").append(offset).append('}').toString();
        }

        public Entry(int i, int j)
        {
            count = i;
            offset = j;
        }
    }


    static final boolean $assertionsDisabled;
    public static final String TYPE = "ctts";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    List entries;

    public CompositionTimeToSample()
    {
        super("ctts");
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("CompositionTimeToSample.java", com/coremedia/iso/boxes/CompositionTimeToSample);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "", "void"), 61);
    }

    public static int[] blowupCompositionTimes(List list)
    {
        int ai[];
        int i;
        Iterator iterator = list.iterator();
        long l = 0L;
        do
        {
            if (!iterator.hasNext())
            {
                if (!$assertionsDisabled && l > 0x7fffffffL)
                {
                    throw new AssertionError();
                }
                break;
            }
            l = (long)((Entry)iterator.next()).getCount() + l;
        } while (true);
        ai = new int[(int)l];
        list = list.iterator();
        i = 0;
_L2:
        if (!list.hasNext())
        {
            return ai;
        }
        Entry entry = (Entry)list.next();
        int k = 0;
        int j = i;
        do
        {
            i = j;
            if (k >= entry.getCount())
            {
                continue;
            }
            ai[j] = entry.getOffset();
            k++;
            j++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
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
            Entry entry = new Entry(CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer)), bytebuffer.getInt());
            entries.add(entry);
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
            Entry entry = (Entry)iterator.next();
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getCount());
            bytebuffer.putInt(entry.getOffset());
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(entries.size() * 8 + 8);
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

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/coremedia/iso/boxes/CompositionTimeToSample.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
