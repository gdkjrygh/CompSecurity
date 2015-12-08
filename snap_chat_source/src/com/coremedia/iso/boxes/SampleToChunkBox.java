// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cv;
import cx;
import fF;
import ft;
import fx;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SampleToChunkBox extends ft
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
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    List entries;

    public SampleToChunkBox()
    {
        super("stsc");
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("SampleToChunkBox.java", com/coremedia/iso/boxes/SampleToChunkBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"), 51);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "", "[J"), 95);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = fF.a(cv.a(bytebuffer));
        entries = new ArrayList(j);
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            entries.add(new Entry(cv.a(bytebuffer), cv.a(bytebuffer), cv.a(bytebuffer)));
            i++;
        } while (true);
    }

    public long[] blowup(int i)
    {
        Object obj = akN.a(ajc$tjp_3, this, akL.a(i));
        fx.a();
        fx.a(((akp) (obj)));
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
        cx.b(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Entry entry = (Entry)iterator.next();
            cx.b(bytebuffer, entry.getFirstChunk());
            cx.b(bytebuffer, entry.getSamplesPerChunk());
            cx.b(bytebuffer, entry.getSampleDescriptionIndex());
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(entries.size() * 12 + 8);
    }

    public List getEntries()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return entries;
    }

    public void setEntries(List list)
    {
        akp akp = akN.a(ajc$tjp_1, this, list);
        fx.a();
        fx.a(akp);
        entries = list;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("SampleToChunkBox[entryCount=")).append(entries.size()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
