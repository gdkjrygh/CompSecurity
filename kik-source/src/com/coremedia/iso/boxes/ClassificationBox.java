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
import org.b.b.a.a;
import org.b.b.b.b;

public class ClassificationBox extends AbstractFullBox
{

    public static final String TYPE = "clsf";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private String classificationEntity;
    private String classificationInfo;
    private int classificationTableIndex;
    private String language;

    public ClassificationBox()
    {
        super("clsf");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("ClassificationBox.java", com/coremedia/iso/boxes/ClassificationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getLanguage", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 48);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "int"), 52);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 56);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "setClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationEntity", "", "void"), 60);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "int", "classificationTableIndex", "", "void"), 64);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "setLanguage", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "language", "", "void"), 68);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationInfo", "", "void"), 72);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 101);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        byte abyte0[] = new byte[4];
        bytebuffer.get(abyte0);
        classificationEntity = IsoFile.bytesToFourCC(abyte0);
        classificationTableIndex = IsoTypeReader.readUInt16(bytebuffer);
        language = IsoTypeReader.readIso639(bytebuffer);
        classificationInfo = IsoTypeReader.readString(bytebuffer);
    }

    public String getClassificationEntity()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return classificationEntity;
    }

    public String getClassificationInfo()
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return classificationInfo;
    }

    public int getClassificationTableIndex()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return classificationTableIndex;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(IsoFile.fourCCtoBytes(classificationEntity));
        IsoTypeWriter.writeUInt16(bytebuffer, classificationTableIndex);
        IsoTypeWriter.writeIso639(bytebuffer, language);
        bytebuffer.put(Utf8.convert(classificationInfo));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.utf8StringLengthInBytes(classificationInfo) + 8 + 1);
    }

    public String getLanguage()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return language;
    }

    public void setClassificationEntity(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        classificationEntity = s;
    }

    public void setClassificationInfo(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        classificationInfo = s;
    }

    public void setClassificationTableIndex(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        classificationTableIndex = i;
    }

    public void setLanguage(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        language = s;
    }

    public String toString()
    {
        Object obj = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("ClassificationBox[language=").append(getLanguage());
        ((StringBuilder) (obj)).append("classificationEntity=").append(getClassificationEntity());
        ((StringBuilder) (obj)).append(";classificationTableIndex=").append(getClassificationTableIndex());
        ((StringBuilder) (obj)).append(";language=").append(getLanguage());
        ((StringBuilder) (obj)).append(";classificationInfo=").append(getClassificationInfo());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
