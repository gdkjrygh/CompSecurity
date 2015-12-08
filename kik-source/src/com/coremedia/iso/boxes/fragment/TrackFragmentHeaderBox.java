// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

// Referenced classes of package com.coremedia.iso.boxes.fragment:
//            SampleFlags

public class TrackFragmentHeaderBox extends AbstractFullBox
{

    public static final String TYPE = "tfhd";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_12;
    private static final org.b.a.a.a ajc$tjp_13;
    private static final org.b.a.a.a ajc$tjp_14;
    private static final org.b.a.a.a ajc$tjp_15;
    private static final org.b.a.a.a ajc$tjp_16;
    private static final org.b.a.a.a ajc$tjp_17;
    private static final org.b.a.a.a ajc$tjp_18;
    private static final org.b.a.a.a ajc$tjp_19;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_20;
    private static final org.b.a.a.a ajc$tjp_21;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    private long baseDataOffset;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    public TrackFragmentHeaderBox()
    {
        super("tfhd");
        baseDataOffset = -1L;
        defaultSampleDuration = -1L;
        defaultSampleSize = -1L;
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("TrackFragmentHeaderBox.java", com/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 126);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 130);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 166);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 170);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "isDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 174);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "trackId", "", "void"), 178);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"), 182);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"), 191);
        ajc$tjp_16 = b1.a("method-execution", b1.a("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"), 200);
        ajc$tjp_17 = b1.a("method-execution", b1.a("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"), 205);
        ajc$tjp_18 = b1.a("method-execution", b1.a("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 210);
        ajc$tjp_19 = b1.a("method-execution", b1.a("1", "setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"), 215);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 134);
        ajc$tjp_20 = b1.a("method-execution", b1.a("1", "setDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "defaultBaseIsMoof", "", "void"), 220);
        ajc$tjp_21 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 226);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 138);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 142);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 146);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 150);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 154);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 158);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 162);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        trackId = IsoTypeReader.readUInt32(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            baseDataOffset = IsoTypeReader.readUInt64(bytebuffer);
        }
        if ((getFlags() & 2) == 2)
        {
            sampleDescriptionIndex = IsoTypeReader.readUInt32(bytebuffer);
        }
        if ((getFlags() & 8) == 8)
        {
            defaultSampleDuration = IsoTypeReader.readUInt32(bytebuffer);
        }
        if ((getFlags() & 0x10) == 16)
        {
            defaultSampleSize = IsoTypeReader.readUInt32(bytebuffer);
        }
        if ((getFlags() & 0x20) == 32)
        {
            defaultSampleFlags = new SampleFlags(bytebuffer);
        }
        if ((getFlags() & 0x10000) == 0x10000)
        {
            durationIsEmpty = true;
        }
        if ((getFlags() & 0x20000) == 0x20000)
        {
            defaultBaseIsMoof = true;
        }
    }

    public long getBaseDataOffset()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return baseDataOffset;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, trackId);
        if ((getFlags() & 1) == 1)
        {
            IsoTypeWriter.writeUInt64(bytebuffer, getBaseDataOffset());
        }
        if ((getFlags() & 2) == 2)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getSampleDescriptionIndex());
        }
        if ((getFlags() & 8) == 8)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getDefaultSampleDuration());
        }
        if ((getFlags() & 0x10) == 16)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getDefaultSampleSize());
        }
        if ((getFlags() & 0x20) == 32)
        {
            defaultSampleFlags.getContent(bytebuffer);
        }
    }

    protected long getContentSize()
    {
        long l1 = 8L;
        int i = getFlags();
        if ((i & 1) == 1)
        {
            l1 = 16L;
        }
        long l = l1;
        if ((i & 2) == 2)
        {
            l = l1 + 4L;
        }
        l1 = l;
        if ((i & 8) == 8)
        {
            l1 = l + 4L;
        }
        l = l1;
        if ((i & 0x10) == 16)
        {
            l = l1 + 4L;
        }
        l1 = l;
        if ((i & 0x20) == 32)
        {
            l1 = l + 4L;
        }
        return l1;
    }

    public long getDefaultSampleDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultSampleDuration;
    }

    public SampleFlags getDefaultSampleFlags()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultSampleFlags;
    }

    public long getDefaultSampleSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultSampleSize;
    }

    public long getSampleDescriptionIndex()
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return sampleDescriptionIndex;
    }

    public long getTrackId()
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return trackId;
    }

    public boolean hasBaseDataOffset()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (getFlags() & 0x20) != 0;
    }

    public boolean hasDefaultSampleSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (getFlags() & 0x10) != 0;
    }

    public boolean hasSampleDescriptionIndex()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (getFlags() & 2) != 0;
    }

    public boolean isDefaultBaseIsMoof()
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultBaseIsMoof;
    }

    public boolean isDurationIsEmpty()
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return durationIsEmpty;
    }

    public void setBaseDataOffset(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (l == -1L)
        {
            setFlags(getFlags() & 0x7ffffffe);
        } else
        {
            setFlags(getFlags() | 1);
        }
        baseDataOffset = l;
    }

    public void setDefaultBaseIsMoof(boolean flag)
    {
        org.b.a.a a1 = b.a(ajc$tjp_20, this, this, a.a(flag));
        RequiresParseDetailAspect.aspectOf().before(a1);
        setFlags(getFlags() | 0x20000);
        defaultBaseIsMoof = flag;
    }

    public void setDefaultSampleDuration(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_16, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        setFlags(getFlags() | 8);
        defaultSampleDuration = l;
    }

    public void setDefaultSampleFlags(SampleFlags sampleflags)
    {
        org.b.a.a a1 = b.a(ajc$tjp_18, this, this, sampleflags);
        RequiresParseDetailAspect.aspectOf().before(a1);
        setFlags(getFlags() | 0x20);
        defaultSampleFlags = sampleflags;
    }

    public void setDefaultSampleSize(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_17, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        setFlags(getFlags() | 0x10);
        defaultSampleSize = l;
    }

    public void setDurationIsEmpty(boolean flag)
    {
        org.b.a.a a1 = b.a(ajc$tjp_19, this, this, a.a(flag));
        RequiresParseDetailAspect.aspectOf().before(a1);
        setFlags(getFlags() | 0x10000);
        durationIsEmpty = flag;
    }

    public void setSampleDescriptionIndex(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_15, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (l == -1L)
        {
            setFlags(getFlags() & 0x7ffffffd);
        } else
        {
            setFlags(getFlags() | 2);
        }
        sampleDescriptionIndex = l;
    }

    public void setTrackId(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        trackId = l;
    }

    public String toString()
    {
        Object obj = b.a(ajc$tjp_21, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("TrackFragmentHeaderBox");
        ((StringBuilder) (obj)).append("{trackId=").append(trackId);
        ((StringBuilder) (obj)).append(", baseDataOffset=").append(baseDataOffset);
        ((StringBuilder) (obj)).append(", sampleDescriptionIndex=").append(sampleDescriptionIndex);
        ((StringBuilder) (obj)).append(", defaultSampleDuration=").append(defaultSampleDuration);
        ((StringBuilder) (obj)).append(", defaultSampleSize=").append(defaultSampleSize);
        ((StringBuilder) (obj)).append(", defaultSampleFlags=").append(defaultSampleFlags);
        ((StringBuilder) (obj)).append(", durationIsEmpty=").append(durationIsEmpty);
        ((StringBuilder) (obj)).append(", defaultBaseIsMoof=").append(defaultBaseIsMoof);
        ((StringBuilder) (obj)).append('}');
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
