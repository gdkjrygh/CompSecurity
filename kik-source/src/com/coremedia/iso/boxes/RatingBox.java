// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class RatingBox extends AbstractFullBox
{

    public static final String TYPE = "rtng";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private String language;
    private String ratingCriteria;
    private String ratingEntity;
    private String ratingInfo;

    public RatingBox()
    {
        super("rtng");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("RatingBox.java", com/coremedia/iso/boxes/RatingBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "setRatingEntity", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingEntity", "", "void"), 46);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingCriteria", "", "void"), 50);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "setLanguage", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "language", "", "void"), 54);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setRatingInfo", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingInfo", "", "void"), 58);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getLanguage", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getRatingEntity", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 73);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "getRatingInfo", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 87);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 115);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        ratingEntity = IsoTypeReader.read4cc(bytebuffer);
        ratingCriteria = IsoTypeReader.read4cc(bytebuffer);
        language = IsoTypeReader.readIso639(bytebuffer);
        ratingInfo = IsoTypeReader.readString(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(IsoFile.fourCCtoBytes(ratingEntity));
        bytebuffer.put(IsoFile.fourCCtoBytes(ratingCriteria));
        IsoTypeWriter.writeIso639(bytebuffer, language);
        bytebuffer.put(Utf8.convert(ratingInfo));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.utf8StringLengthInBytes(ratingInfo) + 15);
    }

    public String getLanguage()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return language;
    }

    public String getRatingCriteria()
    {
        org.b.a.a a = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return ratingCriteria;
    }

    public String getRatingEntity()
    {
        org.b.a.a a = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return ratingEntity;
    }

    public String getRatingInfo()
    {
        org.b.a.a a = b.a(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return ratingInfo;
    }

    public void setLanguage(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        language = s;
    }

    public void setRatingCriteria(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        ratingCriteria = s;
    }

    public void setRatingEntity(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        ratingEntity = s;
    }

    public void setRatingInfo(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        ratingInfo = s;
    }

    public String toString()
    {
        Object obj = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("RatingBox[language=").append(getLanguage());
        ((StringBuilder) (obj)).append("ratingEntity=").append(getRatingEntity());
        ((StringBuilder) (obj)).append(";ratingCriteria=").append(getRatingCriteria());
        ((StringBuilder) (obj)).append(";language=").append(getLanguage());
        ((StringBuilder) (obj)).append(";ratingInfo=").append(getRatingInfo());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
