// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.UUIDConverter;
import java.nio.ByteBuffer;
import java.util.UUID;
import org.b.b.b.b;

// Referenced classes of package com.googlecode.mp4parser.boxes.piff:
//            ProtectionSpecificHeader

public class UuidBasedProtectionSystemSpecificHeaderBox extends AbstractFullBox
{

    public static byte USER_TYPE[] = {
        -48, -118, 79, 24, 16, -13, 74, -126, -74, -56, 
        50, -40, -85, -95, -125, -45
    };
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    ProtectionSpecificHeader protectionSpecificHeader;
    UUID systemId;

    public UuidBasedProtectionSystemSpecificHeaderBox()
    {
        super("uuid", USER_TYPE);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("UuidBasedProtectionSystemSpecificHeaderBox.java", com/googlecode/mp4parser/boxes/piff/UuidBasedProtectionSystemSpecificHeaderBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.util.UUID"), 67);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "java.util.UUID", "systemId", "", "void"), 71);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getSystemIdString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 75);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader"), 79);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getProtectionSpecificHeaderString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader", "protectionSpecificHeader", "", "void"), 87);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "toString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 92);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        byte abyte0[] = new byte[16];
        bytebuffer.get(abyte0);
        systemId = UUIDConverter.convert(abyte0);
        CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        protectionSpecificHeader = ProtectionSpecificHeader.createFor(systemId, bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt64(bytebuffer, systemId.getMostSignificantBits());
        IsoTypeWriter.writeUInt64(bytebuffer, systemId.getLeastSignificantBits());
        ByteBuffer bytebuffer1 = protectionSpecificHeader.getData();
        bytebuffer1.rewind();
        IsoTypeWriter.writeUInt32(bytebuffer, bytebuffer1.limit());
        bytebuffer.put(bytebuffer1);
    }

    protected long getContentSize()
    {
        return (long)(protectionSpecificHeader.getData().limit() + 24);
    }

    public ProtectionSpecificHeader getProtectionSpecificHeader()
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return protectionSpecificHeader;
    }

    public String getProtectionSpecificHeaderString()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return protectionSpecificHeader.toString();
    }

    public UUID getSystemId()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return systemId;
    }

    public String getSystemIdString()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return systemId.toString();
    }

    public byte[] getUserType()
    {
        return USER_TYPE;
    }

    public void setProtectionSpecificHeader(ProtectionSpecificHeader protectionspecificheader)
    {
        org.b.a.a a = b.a(ajc$tjp_5, this, this, protectionspecificheader);
        RequiresParseDetailAspect.aspectOf().before(a);
        protectionSpecificHeader = protectionspecificheader;
    }

    public void setSystemId(UUID uuid)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, uuid);
        RequiresParseDetailAspect.aspectOf().before(a);
        systemId = uuid;
    }

    public String toString()
    {
        Object obj = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("UuidBasedProtectionSystemSpecificHeaderBox");
        ((StringBuilder) (obj)).append("{systemId=").append(systemId.toString());
        ((StringBuilder) (obj)).append(", dataSize=").append(protectionSpecificHeader.getData().limit());
        ((StringBuilder) (obj)).append('}');
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
