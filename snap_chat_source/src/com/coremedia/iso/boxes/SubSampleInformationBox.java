// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cv;
import cx;
import fF;
import ft;
import fx;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubSampleInformationBox extends ft
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
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private List entries;

    public SubSampleInformationBox()
    {
        super("subs");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("SubSampleInformationBox.java", com/coremedia/iso/boxes/SubSampleInformationBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 50);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 54);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 124);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        int i;
        long l1;
        parseVersionAndFlags(bytebuffer);
        l1 = cv.a(bytebuffer);
        i = 0;
_L2:
        if ((long)i >= l1)
        {
            return;
        }
        SubSampleEntry subsampleentry = new SubSampleEntry();
        subsampleentry.setSampleDelta(cv.a(bytebuffer));
        int k = cv.c(bytebuffer);
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
                l = cv.a(bytebuffer);
            } else
            {
                l = cv.c(bytebuffer);
            }
            subsampleentry1.setSubsampleSize(l);
            subsampleentry1.setSubsamplePriority(cv.d(bytebuffer));
            subsampleentry1.setDiscardable(cv.d(bytebuffer));
            subsampleentry1.setReserved(cv.a(bytebuffer));
            subsampleentry.getSubsampleEntries().add(subsampleentry1);
            j++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
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
            Object obj = (SubSampleEntry)iterator.next();
            cx.b(bytebuffer, ((SubSampleEntry) (obj)).getSampleDelta());
            cx.b(bytebuffer, ((SubSampleEntry) (obj)).getSubsampleCount());
            obj = ((SubSampleEntry) (obj)).getSubsampleEntries().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                SubSampleEntry.SubsampleEntry subsampleentry = (SubSampleEntry.SubsampleEntry)((Iterator) (obj)).next();
                if (getVersion() == 1)
                {
                    cx.b(bytebuffer, subsampleentry.getSubsampleSize());
                } else
                {
                    cx.b(bytebuffer, fF.a(subsampleentry.getSubsampleSize()));
                }
                cx.c(bytebuffer, subsampleentry.getSubsamplePriority());
                cx.c(bytebuffer, subsampleentry.getDiscardable());
                cx.b(bytebuffer, subsampleentry.getReserved());
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
        return (new StringBuilder("SubSampleInformationBox{entryCount=")).append(entries.size()).append(", entries=").append(entries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
