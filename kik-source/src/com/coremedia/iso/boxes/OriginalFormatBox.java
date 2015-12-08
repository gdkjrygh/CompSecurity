// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class OriginalFormatBox extends AbstractBox
{

    static final boolean $assertionsDisabled;
    public static final String TYPE = "frma";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private String dataFormat;

    public OriginalFormatBox()
    {
        super("frma");
        dataFormat = "    ";
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("OriginalFormatBox.java", com/coremedia/iso/boxes/OriginalFormatBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"), 47);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 67);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        dataFormat = IsoTypeReader.read4cc(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(IsoFile.fourCCtoBytes(dataFormat));
    }

    protected long getContentSize()
    {
        return 4L;
    }

    public String getDataFormat()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return dataFormat;
    }

    public void setDataFormat(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        if (!$assertionsDisabled && s.length() != 4)
        {
            throw new AssertionError();
        } else
        {
            dataFormat = s;
            return;
        }
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("OriginalFormatBox[dataFormat=")).append(getDataFormat()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/coremedia/iso/boxes/OriginalFormatBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
