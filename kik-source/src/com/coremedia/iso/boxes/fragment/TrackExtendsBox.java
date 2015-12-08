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

public class TrackExtendsBox extends AbstractFullBox
{

    public static final String TYPE = "trex";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;

    public TrackExtendsBox()
    {
        super("trex");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("TrackExtendsBox.java", com/coremedia/iso/boxes/fragment/TrackExtendsBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 72);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 76);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 112);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 80);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 84);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 88);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getDefaultSampleFlagsStr", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "java.lang.String"), 92);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "trackId", "", "void"), 96);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDescriptionIndex", "", "void"), 100);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDuration", "", "void"), 104);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleSize", "", "void"), 108);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        trackId = IsoTypeReader.readUInt32(bytebuffer);
        defaultSampleDescriptionIndex = IsoTypeReader.readUInt32(bytebuffer);
        defaultSampleDuration = IsoTypeReader.readUInt32(bytebuffer);
        defaultSampleSize = IsoTypeReader.readUInt32(bytebuffer);
        defaultSampleFlags = new SampleFlags(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, trackId);
        IsoTypeWriter.writeUInt32(bytebuffer, defaultSampleDescriptionIndex);
        IsoTypeWriter.writeUInt32(bytebuffer, defaultSampleDuration);
        IsoTypeWriter.writeUInt32(bytebuffer, defaultSampleSize);
        defaultSampleFlags.getContent(bytebuffer);
    }

    protected long getContentSize()
    {
        return 24L;
    }

    public long getDefaultSampleDescriptionIndex()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultSampleDescriptionIndex;
    }

    public long getDefaultSampleDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultSampleDuration;
    }

    public SampleFlags getDefaultSampleFlags()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultSampleFlags;
    }

    public String getDefaultSampleFlagsStr()
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultSampleFlags.toString();
    }

    public long getDefaultSampleSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultSampleSize;
    }

    public long getTrackId()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return trackId;
    }

    public void setDefaultSampleDescriptionIndex(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        defaultSampleDescriptionIndex = l;
    }

    public void setDefaultSampleDuration(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        defaultSampleDuration = l;
    }

    public void setDefaultSampleFlags(SampleFlags sampleflags)
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this, sampleflags);
        RequiresParseDetailAspect.aspectOf().before(a1);
        defaultSampleFlags = sampleflags;
    }

    public void setDefaultSampleSize(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        defaultSampleSize = l;
    }

    public void setTrackId(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        trackId = l;
    }

    static 
    {
        ajc$preClinit();
    }
}
