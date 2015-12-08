// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class LyricsUriBox extends AbstractFullBox
{

    public static final String TYPE = "lrcu";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private String lyricsUri;

    public LyricsUriBox()
    {
        super("lrcu");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("LyricsUriBox.java", com/coremedia/iso/boxes/vodafone/LyricsUriBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getLyricsUri", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "", "", "", "java.lang.String"), 39);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setLyricsUri", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "java.lang.String", "lyricsUri", "", "void"), 43);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "", "", "", "java.lang.String"), 64);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        lyricsUri = IsoTypeReader.readString(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(Utf8.convert(lyricsUri));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.utf8StringLengthInBytes(lyricsUri) + 5);
    }

    public String getLyricsUri()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return lyricsUri;
    }

    public void setLyricsUri(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        lyricsUri = s;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("LyricsUriBox[lyricsUri=")).append(getLyricsUri()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
