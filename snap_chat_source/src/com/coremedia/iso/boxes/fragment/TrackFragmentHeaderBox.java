// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import akL;
import akN;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes.fragment:
//            SampleFlags

public class TrackFragmentHeaderBox extends ft
{

    public static final String TYPE = "tfhd";
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
    private static final akp.a ajc$tjp_20;
    private static final akp.a ajc$tjp_21;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
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
        akN akn = new akN("TrackFragmentHeaderBox.java", com/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 126);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 130);
        ajc$tjp_10 = akn.a("method-execution", akn.a("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 166);
        ajc$tjp_11 = akn.a("method-execution", akn.a("1", "isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 170);
        ajc$tjp_12 = akn.a("method-execution", akn.a("1", "isDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 174);
        ajc$tjp_13 = akn.a("method-execution", akn.a("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "trackId", "", "void"), 178);
        ajc$tjp_14 = akn.a("method-execution", akn.a("1", "setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"), 182);
        ajc$tjp_15 = akn.a("method-execution", akn.a("1", "setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"), 191);
        ajc$tjp_16 = akn.a("method-execution", akn.a("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"), 200);
        ajc$tjp_17 = akn.a("method-execution", akn.a("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"), 205);
        ajc$tjp_18 = akn.a("method-execution", akn.a("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 210);
        ajc$tjp_19 = akn.a("method-execution", akn.a("1", "setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"), 215);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 134);
        ajc$tjp_20 = akn.a("method-execution", akn.a("1", "setDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "defaultBaseIsMoof", "", "void"), 220);
        ajc$tjp_21 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 226);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 138);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 142);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 146);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 150);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 154);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 158);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 162);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        trackId = cv.a(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            baseDataOffset = cv.f(bytebuffer);
        }
        if ((getFlags() & 2) == 2)
        {
            sampleDescriptionIndex = cv.a(bytebuffer);
        }
        if ((getFlags() & 8) == 8)
        {
            defaultSampleDuration = cv.a(bytebuffer);
        }
        if ((getFlags() & 0x10) == 16)
        {
            defaultSampleSize = cv.a(bytebuffer);
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
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return baseDataOffset;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, trackId);
        if ((getFlags() & 1) == 1)
        {
            cx.a(bytebuffer, getBaseDataOffset());
        }
        if ((getFlags() & 2) == 2)
        {
            cx.b(bytebuffer, getSampleDescriptionIndex());
        }
        if ((getFlags() & 8) == 8)
        {
            cx.b(bytebuffer, getDefaultSampleDuration());
        }
        if ((getFlags() & 0x10) == 16)
        {
            cx.b(bytebuffer, getDefaultSampleSize());
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
        akp akp = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(akp);
        return defaultSampleDuration;
    }

    public SampleFlags getDefaultSampleFlags()
    {
        akp akp = akN.a(ajc$tjp_10, this);
        fx.a();
        fx.a(akp);
        return defaultSampleFlags;
    }

    public long getDefaultSampleSize()
    {
        akp akp = akN.a(ajc$tjp_9, this);
        fx.a();
        fx.a(akp);
        return defaultSampleSize;
    }

    public long getSampleDescriptionIndex()
    {
        akp akp = akN.a(ajc$tjp_7, this);
        fx.a();
        fx.a(akp);
        return sampleDescriptionIndex;
    }

    public long getTrackId()
    {
        akp akp = akN.a(ajc$tjp_5, this);
        fx.a();
        fx.a(akp);
        return trackId;
    }

    public boolean hasBaseDataOffset()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 0x20) != 0;
    }

    public boolean hasDefaultSampleSize()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 0x10) != 0;
    }

    public boolean hasSampleDescriptionIndex()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 2) != 0;
    }

    public boolean isDefaultBaseIsMoof()
    {
        akp akp = akN.a(ajc$tjp_12, this);
        fx.a();
        fx.a(akp);
        return defaultBaseIsMoof;
    }

    public boolean isDurationIsEmpty()
    {
        akp akp = akN.a(ajc$tjp_11, this);
        fx.a();
        fx.a(akp);
        return durationIsEmpty;
    }

    public void setBaseDataOffset(long l)
    {
        akp akp = akN.a(ajc$tjp_14, this, akL.a(l));
        fx.a();
        fx.a(akp);
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
        akp akp = akN.a(ajc$tjp_20, this, akL.a(flag));
        fx.a();
        fx.a(akp);
        setFlags(getFlags() | 0x20000);
        defaultBaseIsMoof = flag;
    }

    public void setDefaultSampleDuration(long l)
    {
        akp akp = akN.a(ajc$tjp_16, this, akL.a(l));
        fx.a();
        fx.a(akp);
        setFlags(getFlags() | 8);
        defaultSampleDuration = l;
    }

    public void setDefaultSampleFlags(SampleFlags sampleflags)
    {
        akp akp = akN.a(ajc$tjp_18, this, sampleflags);
        fx.a();
        fx.a(akp);
        setFlags(getFlags() | 0x20);
        defaultSampleFlags = sampleflags;
    }

    public void setDefaultSampleSize(long l)
    {
        akp akp = akN.a(ajc$tjp_17, this, akL.a(l));
        fx.a();
        fx.a(akp);
        setFlags(getFlags() | 0x10);
        defaultSampleSize = l;
    }

    public void setDurationIsEmpty(boolean flag)
    {
        akp akp = akN.a(ajc$tjp_19, this, akL.a(flag));
        fx.a();
        fx.a(akp);
        setFlags(getFlags() | 0x10000);
        durationIsEmpty = flag;
    }

    public void setSampleDescriptionIndex(long l)
    {
        akp akp = akN.a(ajc$tjp_15, this, akL.a(l));
        fx.a();
        fx.a(akp);
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
        akp akp = akN.a(ajc$tjp_13, this, akL.a(l));
        fx.a();
        fx.a(akp);
        trackId = l;
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_21, this);
        fx.a();
        fx.a(((akp) (obj)));
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
