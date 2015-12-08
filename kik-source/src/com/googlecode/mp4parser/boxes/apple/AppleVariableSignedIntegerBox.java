// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

// Referenced classes of package com.googlecode.mp4parser.boxes.apple:
//            AppleDataBox

public abstract class AppleVariableSignedIntegerBox extends AppleDataBox
{

    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    int intLength;
    long value;

    protected AppleVariableSignedIntegerBox(String s)
    {
        super(s, 15);
        intLength = 1;
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AppleVariableSignedIntegerBox.java", com/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "int"), 19);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "int", "intLength", "", "void"), 23);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "long"), 27);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "long", "value", "", "void"), 36);
    }

    protected int getDataLength()
    {
        return intLength;
    }

    public int getIntLength()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return intLength;
    }

    public long getValue()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (!isParsed())
        {
            parseDetails();
        }
        return value;
    }

    protected void parseData(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.remaining();
        value = IsoTypeReaderVariable.read(bytebuffer, i);
        intLength = i;
    }

    public void setIntLength(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        intLength = i;
    }

    public void setValue(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (l <= 127L && l > -128L)
        {
            intLength = 1;
        } else
        if (l <= 32767L && l > -32768L && intLength < 2)
        {
            intLength = 2;
        } else
        if (l <= 0x7fffffL && l > 0xffffffffff800000L && intLength < 3)
        {
            intLength = 3;
        } else
        {
            intLength = 4;
        }
        value = l;
    }

    protected byte[] writeData()
    {
        int i = getDataLength();
        ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[i]);
        IsoTypeWriterVariable.write(value, bytebuffer, i);
        return bytebuffer.array();
    }

    static 
    {
        ajc$preClinit();
    }
}
