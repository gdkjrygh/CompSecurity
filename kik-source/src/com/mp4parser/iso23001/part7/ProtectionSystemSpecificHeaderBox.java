// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso23001.part7;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.UUIDConverter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.b.b.b.b;

public class ProtectionSystemSpecificHeaderBox extends AbstractFullBox
{

    static final boolean $assertionsDisabled;
    public static byte OMA2_SYSTEM_ID[] = UUIDConverter.convert(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
    public static byte PLAYREADY_SYSTEM_ID[] = UUIDConverter.convert(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));
    public static final String TYPE = "pssh";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    byte content[];
    List keyIds;
    byte systemId[];

    public ProtectionSystemSpecificHeaderBox()
    {
        super("pssh");
        keyIds = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("ProtectionSystemSpecificHeaderBox.java", com/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getKeyIds", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "java.util.List"), 43);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setKeyIds", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "java.util.List", "keyIds", "", "void"), 47);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getSystemId", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 54);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setSystemId", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "systemId", "", "void"), 58);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getContent", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 63);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setContent", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "content", "", "void"), 67);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        systemId = new byte[16];
        bytebuffer.get(systemId);
        if (getVersion() <= 0) goto _L2; else goto _L1
_L1:
        int i = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
_L5:
        if (i > 0) goto _L3; else goto _L2
_L2:
        long l = IsoTypeReader.readUInt32(bytebuffer);
        content = new byte[bytebuffer.remaining()];
        bytebuffer.get(content);
        byte abyte0[];
        if (!$assertionsDisabled && l != (long)content.length)
        {
            throw new AssertionError();
        } else
        {
            return;
        }
_L3:
        abyte0 = new byte[16];
        bytebuffer.get(abyte0);
        keyIds.add(UUIDConverter.convert(abyte0));
        i--;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (!$assertionsDisabled && systemId.length != 16)
        {
            throw new AssertionError();
        }
        bytebuffer.put(systemId, 0, 16);
        if (getVersion() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        IsoTypeWriter.writeUInt32(bytebuffer, keyIds.size());
        iterator = keyIds.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        IsoTypeWriter.writeUInt32(bytebuffer, content.length);
        bytebuffer.put(content);
        return;
_L3:
        bytebuffer.put(UUIDConverter.convert((UUID)iterator.next()));
        if (true) goto _L5; else goto _L4
_L4:
    }

    public byte[] getContent()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return content;
    }

    protected long getContentSize()
    {
        long l1 = content.length + 24;
        long l = l1;
        if (getVersion() > 0)
        {
            l = l1 + 4L + (long)(keyIds.size() * 16);
        }
        return l;
    }

    public List getKeyIds()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return keyIds;
    }

    public byte[] getSystemId()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return systemId;
    }

    public void setContent(byte abyte0[])
    {
        org.b.a.a a = b.a(ajc$tjp_5, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(a);
        content = abyte0;
    }

    public void setKeyIds(List list)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a);
        keyIds = list;
    }

    public void setSystemId(byte abyte0[])
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(a);
        if (!$assertionsDisabled && abyte0.length != 16)
        {
            throw new AssertionError();
        } else
        {
            systemId = abyte0;
            return;
        }
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
