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

public class SchemeTypeBox extends AbstractFullBox
{

    static final boolean $assertionsDisabled;
    public static final String TYPE = "schm";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    String schemeType;
    String schemeUri;
    long schemeVersion;

    public SchemeTypeBox()
    {
        super("schm");
        schemeType = "    ";
        schemeUri = null;
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SchemeTypeBox.java", com/coremedia/iso/boxes/SchemeTypeBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "long"), 48);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"), 56);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "setSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "int", "schemeVersion", "", "void"), 61);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"), 65);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 93);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        schemeType = IsoTypeReader.read4cc(bytebuffer);
        schemeVersion = IsoTypeReader.readUInt32(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            schemeUri = IsoTypeReader.readString(bytebuffer);
        }
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(IsoFile.fourCCtoBytes(schemeType));
        IsoTypeWriter.writeUInt32(bytebuffer, schemeVersion);
        if ((getFlags() & 1) == 1)
        {
            bytebuffer.put(Utf8.convert(schemeUri));
        }
    }

    protected long getContentSize()
    {
        int i;
        if ((getFlags() & 1) == 1)
        {
            i = Utf8.utf8StringLengthInBytes(schemeUri) + 1;
        } else
        {
            i = 0;
        }
        return (long)(i + 12);
    }

    public String getSchemeType()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return schemeType;
    }

    public String getSchemeUri()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return schemeUri;
    }

    public long getSchemeVersion()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return schemeVersion;
    }

    public void setSchemeType(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (!$assertionsDisabled && (s == null || s.length() != 4))
        {
            throw new AssertionError("SchemeType may not be null or not 4 bytes long");
        } else
        {
            schemeType = s;
            return;
        }
    }

    public void setSchemeUri(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        schemeUri = s;
    }

    public void setSchemeVersion(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        schemeVersion = i;
    }

    public String toString()
    {
        Object obj = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("Schema Type Box[");
        ((StringBuilder) (obj)).append("schemeUri=").append(schemeUri).append("; ");
        ((StringBuilder) (obj)).append("schemeType=").append(schemeType).append("; ");
        ((StringBuilder) (obj)).append("schemeVersion=").append(schemeVersion).append("; ");
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/coremedia/iso/boxes/SchemeTypeBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
