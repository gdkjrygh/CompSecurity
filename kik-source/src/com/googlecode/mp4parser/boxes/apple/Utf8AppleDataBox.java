// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.b.b.b.b;

// Referenced classes of package com.googlecode.mp4parser.boxes.apple:
//            AppleDataBox

public abstract class Utf8AppleDataBox extends AppleDataBox
{

    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    String value;

    protected Utf8AppleDataBox(String s)
    {
        super(s, 1);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("Utf8AppleDataBox.java", com/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "", "", "", "java.lang.String"), 21);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "java.lang.String", "value", "", "void"), 30);
    }

    protected int getDataLength()
    {
        return value.getBytes(Charset.forName("UTF-8")).length;
    }

    public String getValue()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        if (!isParsed())
        {
            parseDetails();
        }
        return value;
    }

    protected void parseData(ByteBuffer bytebuffer)
    {
        value = IsoTypeReader.readString(bytebuffer, bytebuffer.remaining());
    }

    public void setValue(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        value = s;
    }

    public byte[] writeData()
    {
        return Utf8.convert(value);
    }

    static 
    {
        ajc$preClinit();
    }
}
