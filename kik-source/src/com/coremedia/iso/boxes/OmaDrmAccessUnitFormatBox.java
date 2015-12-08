// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public final class OmaDrmAccessUnitFormatBox extends AbstractFullBox
{

    public static final String TYPE = "odaf";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private byte allBits;
    private int initVectorLength;
    private int keyIndicatorLength;
    private boolean selectiveEncryption;

    public OmaDrmAccessUnitFormatBox()
    {
        super("odaf");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("OmaDrmAccessUnitFormatBox.java", com/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "isSelectiveEncryption", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "boolean"), 46);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 50);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 54);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "initVectorLength", "", "void"), 58);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "setKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "keyIndicatorLength", "", "void"), 62);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setAllBits", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "byte", "allBits", "", "void"), 66);
    }

    public final void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        allBits = (byte)IsoTypeReader.readUInt8(bytebuffer);
        boolean flag;
        if ((allBits & 0x80) == 128)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        selectiveEncryption = flag;
        keyIndicatorLength = IsoTypeReader.readUInt8(bytebuffer);
        initVectorLength = IsoTypeReader.readUInt8(bytebuffer);
    }

    protected final void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt8(bytebuffer, allBits);
        IsoTypeWriter.writeUInt8(bytebuffer, keyIndicatorLength);
        IsoTypeWriter.writeUInt8(bytebuffer, initVectorLength);
    }

    protected final long getContentSize()
    {
        return 7L;
    }

    public final int getInitVectorLength()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return initVectorLength;
    }

    public final int getKeyIndicatorLength()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return keyIndicatorLength;
    }

    public final boolean isSelectiveEncryption()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return selectiveEncryption;
    }

    public final void setAllBits(byte byte0)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, new Byte(byte0));
        RequiresParseDetailAspect.aspectOf().before(a1);
        allBits = byte0;
        boolean flag;
        if ((byte0 & 0x80) == 128)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        selectiveEncryption = flag;
    }

    public final void setInitVectorLength(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        initVectorLength = i;
    }

    public final void setKeyIndicatorLength(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        keyIndicatorLength = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
