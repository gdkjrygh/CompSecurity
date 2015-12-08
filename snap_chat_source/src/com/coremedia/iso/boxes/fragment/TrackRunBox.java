// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import akL;
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

// Referenced classes of package com.coremedia.iso.boxes.fragment:
//            SampleFlags

public class TrackRunBox extends ft
{
    public static class Entry
    {

        private long sampleCompositionTimeOffset;
        private long sampleDuration;
        private SampleFlags sampleFlags;
        private long sampleSize;

        public long getSampleCompositionTimeOffset()
        {
            return sampleCompositionTimeOffset;
        }

        public long getSampleDuration()
        {
            return sampleDuration;
        }

        public SampleFlags getSampleFlags()
        {
            return sampleFlags;
        }

        public long getSampleSize()
        {
            return sampleSize;
        }

        public void setSampleCompositionTimeOffset(int i)
        {
            sampleCompositionTimeOffset = i;
        }

        public void setSampleDuration(long l)
        {
            sampleDuration = l;
        }

        public void setSampleFlags(SampleFlags sampleflags)
        {
            sampleFlags = sampleflags;
        }

        public void setSampleSize(long l)
        {
            sampleSize = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{duration=")).append(sampleDuration).append(", size=").append(sampleSize).append(", dlags=").append(sampleFlags).append(", compTimeOffset=").append(sampleCompositionTimeOffset).append('}').toString();
        }









        public Entry()
        {
        }

        public Entry(long l, long l1, SampleFlags sampleflags, int i)
        {
            sampleDuration = l;
            sampleSize = l1;
            sampleFlags = sampleflags;
            sampleCompositionTimeOffset = i;
        }
    }


    public static final String TYPE = "trun";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_10;
    private static final akp.a ajc$tjp_11;
    private static final akp.a ajc$tjp_12;
    private static final akp.a ajc$tjp_13;
    private static final akp.a ajc$tjp_14;
    private static final akp.a ajc$tjp_15;
    private static final akp.a ajc$tjp_16;
    private static final akp.a ajc$tjp_17;
    private static final akp.a ajc$tjp_18;
    private static final akp.a ajc$tjp_19;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
    private int dataOffset;
    private List entries;
    private SampleFlags firstSampleFlags;

    public TrackRunBox()
    {
        super("trun");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("TrackRunBox.java", com/coremedia/iso/boxes/fragment/TrackRunBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "int", "dataOffset", "", "void"), 120);
        ajc$tjp_10 = akn.a("method-execution", akn.a("1", "setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 271);
        ajc$tjp_11 = akn.a("method-execution", akn.a("1", "setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 279);
        ajc$tjp_12 = akn.a("method-execution", akn.a("1", "setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 287);
        ajc$tjp_13 = akn.a("method-execution", akn.a("1", "setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 296);
        ajc$tjp_14 = akn.a("method-execution", akn.a("1", "setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 304);
        ajc$tjp_15 = akn.a("method-execution", akn.a("1", "getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "int"), 313);
        ajc$tjp_16 = akn.a("method-execution", akn.a("1", "getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 317);
        ajc$tjp_17 = akn.a("method-execution", akn.a("1", "setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", "void"), 321);
        ajc$tjp_18 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"), 331);
        ajc$tjp_19 = akn.a("method-execution", akn.a("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", "entries", "", "void"), 346);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"), 129);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "long"), 242);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 246);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 250);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 255);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 259);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 263);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 267);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        long l = cv.a(bytebuffer);
        int i;
        if ((getFlags() & 1) == 1)
        {
            dataOffset = fF.a(cv.a(bytebuffer));
        } else
        {
            dataOffset = -1;
        }
        if ((getFlags() & 4) == 4)
        {
            firstSampleFlags = new SampleFlags(bytebuffer);
        }
        i = 0;
        do
        {
            if ((long)i >= l)
            {
                return;
            }
            Entry entry = new Entry();
            if ((getFlags() & 0x100) == 256)
            {
                entry.sampleDuration = cv.a(bytebuffer);
            }
            if ((getFlags() & 0x200) == 512)
            {
                entry.sampleSize = cv.a(bytebuffer);
            }
            if ((getFlags() & 0x400) == 1024)
            {
                entry.sampleFlags = new SampleFlags(bytebuffer);
            }
            if ((getFlags() & 0x800) == 2048)
            {
                if (getVersion() == 0)
                {
                    entry.sampleCompositionTimeOffset = cv.a(bytebuffer);
                } else
                {
                    entry.sampleCompositionTimeOffset = (long)bytebuffer.getInt();
                }
            }
            entries.add(entry);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, entries.size());
        int i = getFlags();
        if ((i & 1) == 1)
        {
            cx.b(bytebuffer, dataOffset);
        }
        if ((i & 4) == 4)
        {
            firstSampleFlags.getContent(bytebuffer);
        }
        Iterator iterator = entries.iterator();
        do
        {
            Entry entry;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                entry = (Entry)iterator.next();
                if ((i & 0x100) == 256)
                {
                    cx.b(bytebuffer, entry.sampleDuration);
                }
                if ((i & 0x200) == 512)
                {
                    cx.b(bytebuffer, entry.sampleSize);
                }
                if ((i & 0x400) == 1024)
                {
                    entry.sampleFlags.getContent(bytebuffer);
                }
            } while ((i & 0x800) != 2048);
            if (getVersion() == 0)
            {
                cx.b(bytebuffer, entry.sampleCompositionTimeOffset);
            } else
            {
                bytebuffer.putInt((int)entry.sampleCompositionTimeOffset);
            }
        } while (true);
    }

    protected long getContentSize()
    {
        long l = 8L;
        int i = getFlags();
        if ((i & 1) == 1)
        {
            l = 12L;
        }
        long l1;
        long l2;
        if ((i & 4) == 4)
        {
            l2 = l + 4L;
        } else
        {
            l2 = l;
        }
        l1 = 0L;
        if ((i & 0x100) == 256)
        {
            l1 = 4L;
        }
        l = l1;
        if ((i & 0x200) == 512)
        {
            l = l1 + 4L;
        }
        l1 = l;
        if ((i & 0x400) == 1024)
        {
            l1 = l + 4L;
        }
        l = l1;
        if ((i & 0x800) == 2048)
        {
            l = l1 + 4L;
        }
        return l * (long)entries.size() + l2;
    }

    public int getDataOffset()
    {
        akp akp = akN.a(ajc$tjp_15, this);
        fx.a();
        fx.a(akp);
        return dataOffset;
    }

    public List getEntries()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return entries;
    }

    public SampleFlags getFirstSampleFlags()
    {
        akp akp = akN.a(ajc$tjp_16, this);
        fx.a();
        fx.a(akp);
        return firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        if (isSampleCompositionTimeOffsetPresent())
        {
            long al[] = new long[entries.size()];
            int i = 0;
            do
            {
                if (i >= al.length)
                {
                    return al;
                }
                al[i] = ((Entry)entries.get(i)).getSampleCompositionTimeOffset();
                i++;
            } while (true);
        } else
        {
            return null;
        }
    }

    public long getSampleCount()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        return (long)entries.size();
    }

    public boolean isDataOffsetPresent()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent()
    {
        akp akp = akN.a(ajc$tjp_5, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent()
    {
        akp akp = akN.a(ajc$tjp_9, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 0x800) == 2048;
    }

    public boolean isSampleDurationPresent()
    {
        akp akp = akN.a(ajc$tjp_7, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 0x100) == 256;
    }

    public boolean isSampleFlagsPresent()
    {
        akp akp = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 0x400) == 1024;
    }

    public boolean isSampleSizePresent()
    {
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 0x200) == 512;
    }

    public void setDataOffset(int i)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(i));
        fx.a();
        fx.a(akp);
        if (i == -1)
        {
            setFlags(getFlags() & 0xfffffe);
        } else
        {
            setFlags(getFlags() | 1);
        }
        dataOffset = i;
    }

    public void setDataOffsetPresent(boolean flag)
    {
        akp akp = akN.a(ajc$tjp_10, this, akL.a(flag));
        fx.a();
        fx.a(akp);
        if (flag)
        {
            setFlags(getFlags() | 1);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffffe);
            return;
        }
    }

    public void setEntries(List list)
    {
        akp akp = akN.a(ajc$tjp_19, this, list);
        fx.a();
        fx.a(akp);
        entries = list;
    }

    public void setFirstSampleFlags(SampleFlags sampleflags)
    {
        akp akp = akN.a(ajc$tjp_17, this, sampleflags);
        fx.a();
        fx.a(akp);
        if (sampleflags == null)
        {
            setFlags(getFlags() & 0xfffffb);
        } else
        {
            setFlags(getFlags() | 4);
        }
        firstSampleFlags = sampleflags;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean flag)
    {
        akp akp = akN.a(ajc$tjp_14, this, akL.a(flag));
        fx.a();
        fx.a(akp);
        if (flag)
        {
            setFlags(getFlags() | 0x800);
            return;
        } else
        {
            setFlags(getFlags() & 0xfff7ff);
            return;
        }
    }

    public void setSampleDurationPresent(boolean flag)
    {
        akp akp = akN.a(ajc$tjp_12, this, akL.a(flag));
        fx.a();
        fx.a(akp);
        if (flag)
        {
            setFlags(getFlags() | 0x100);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffeff);
            return;
        }
    }

    public void setSampleFlagsPresent(boolean flag)
    {
        akp akp = akN.a(ajc$tjp_13, this, akL.a(flag));
        fx.a();
        fx.a(akp);
        if (flag)
        {
            setFlags(getFlags() | 0x400);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffbff);
            return;
        }
    }

    public void setSampleSizePresent(boolean flag)
    {
        akp akp = akN.a(ajc$tjp_11, this, akL.a(flag));
        fx.a();
        fx.a(akp);
        if (flag)
        {
            setFlags(getFlags() | 0x200);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffdff);
            return;
        }
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_18, this);
        fx.a();
        fx.a(((akp) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("TrackRunBox");
        ((StringBuilder) (obj)).append("{sampleCount=").append(entries.size());
        ((StringBuilder) (obj)).append(", dataOffset=").append(dataOffset);
        ((StringBuilder) (obj)).append(", dataOffsetPresent=").append(isDataOffsetPresent());
        ((StringBuilder) (obj)).append(", sampleSizePresent=").append(isSampleSizePresent());
        ((StringBuilder) (obj)).append(", sampleDurationPresent=").append(isSampleDurationPresent());
        ((StringBuilder) (obj)).append(", sampleFlagsPresentPresent=").append(isSampleFlagsPresent());
        ((StringBuilder) (obj)).append(", sampleCompositionTimeOffsetPresent=").append(isSampleCompositionTimeOffsetPresent());
        ((StringBuilder) (obj)).append(", firstSampleFlags=").append(firstSampleFlags);
        ((StringBuilder) (obj)).append('}');
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
