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

public class TrackFragmentBaseMediaDecodeTimeBox extends AbstractFullBox
{

    public static final String TYPE = "tfdt";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private long baseMediaDecodeTime;

    public TrackFragmentBaseMediaDecodeTimeBox()
    {
        super("tfdt");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("TrackFragmentBaseMediaDecodeTimeBox.java", com/coremedia/iso/boxes/fragment/TrackFragmentBaseMediaDecodeTimeBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "long"), 65);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "long", "baseMediaDecodeTime", "", "void"), 69);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "java.lang.String"), 74);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            baseMediaDecodeTime = IsoTypeReader.readUInt64(bytebuffer);
            return;
        } else
        {
            baseMediaDecodeTime = IsoTypeReader.readUInt32(bytebuffer);
            return;
        }
    }

    public long getBaseMediaDecodeTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return baseMediaDecodeTime;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt64(bytebuffer, baseMediaDecodeTime);
            return;
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, baseMediaDecodeTime);
            return;
        }
    }

    protected long getContentSize()
    {
        int i;
        if (getVersion() == 0)
        {
            i = 8;
        } else
        {
            i = 12;
        }
        return (long)i;
    }

    public void setBaseMediaDecodeTime(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        baseMediaDecodeTime = l;
    }

    public String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=")).append(baseMediaDecodeTime).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
