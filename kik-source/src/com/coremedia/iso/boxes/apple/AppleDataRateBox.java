// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class AppleDataRateBox extends AbstractFullBox
{

    public static final String TYPE = "rmdr";
    private static final org.b.a.a.a ajc$tjp_0;
    private long dataRate;

    public AppleDataRateBox()
    {
        super("rmdr");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AppleDataRateBox.java", com/coremedia/iso/boxes/apple/AppleDataRateBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getDataRate", "com.coremedia.iso.boxes.apple.AppleDataRateBox", "", "", "", "long"), 53);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        dataRate = IsoTypeReader.readUInt32(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, dataRate);
    }

    protected long getContentSize()
    {
        return 8L;
    }

    public long getDataRate()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return dataRate;
    }

    static 
    {
        ajc$preClinit();
    }
}
