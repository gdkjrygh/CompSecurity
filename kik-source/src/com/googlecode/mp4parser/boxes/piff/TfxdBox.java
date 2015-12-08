// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class TfxdBox extends AbstractFullBox
{

    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    public long fragmentAbsoluteDuration;
    public long fragmentAbsoluteTime;

    public TfxdBox()
    {
        super("uuid");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("TfxdBox.java", com/googlecode/mp4parser/boxes/piff/TfxdBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getFragmentAbsoluteTime", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", "long"), 79);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getFragmentAbsoluteDuration", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", "long"), 83);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            fragmentAbsoluteTime = IsoTypeReader.readUInt64(bytebuffer);
            fragmentAbsoluteDuration = IsoTypeReader.readUInt64(bytebuffer);
            return;
        } else
        {
            fragmentAbsoluteTime = IsoTypeReader.readUInt32(bytebuffer);
            fragmentAbsoluteDuration = IsoTypeReader.readUInt32(bytebuffer);
            return;
        }
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt64(bytebuffer, fragmentAbsoluteTime);
            IsoTypeWriter.writeUInt64(bytebuffer, fragmentAbsoluteDuration);
            return;
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, fragmentAbsoluteTime);
            IsoTypeWriter.writeUInt32(bytebuffer, fragmentAbsoluteDuration);
            return;
        }
    }

    protected long getContentSize()
    {
        int i;
        if (getVersion() == 1)
        {
            i = 20;
        } else
        {
            i = 12;
        }
        return (long)i;
    }

    public long getFragmentAbsoluteDuration()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return fragmentAbsoluteDuration;
    }

    public long getFragmentAbsoluteTime()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return fragmentAbsoluteTime;
    }

    public byte[] getUserType()
    {
        return (new byte[] {
            109, 29, -101, 5, 66, -43, 68, -26, -128, -30, 
            20, 29, -81, -9, 87, -78
        });
    }

    static 
    {
        ajc$preClinit();
    }
}
