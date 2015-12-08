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

public class MovieFragmentHeaderBox extends AbstractFullBox
{

    public static final String TYPE = "mfhd";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private long sequenceNumber;

    public MovieFragmentHeaderBox()
    {
        super("mfhd");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("MovieFragmentHeaderBox.java", com/coremedia/iso/boxes/fragment/MovieFragmentHeaderBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "long"), 59);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "long", "sequenceNumber", "", "void"), 63);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "java.lang.String"), 68);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        sequenceNumber = IsoTypeReader.readUInt32(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, sequenceNumber);
    }

    protected long getContentSize()
    {
        return 8L;
    }

    public long getSequenceNumber()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return sequenceNumber;
    }

    public void setSequenceNumber(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        sequenceNumber = l;
    }

    public String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("MovieFragmentHeaderBox{sequenceNumber=")).append(sequenceNumber).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
