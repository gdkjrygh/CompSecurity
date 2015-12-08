// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;
import org.b.b.a.a;
import org.b.b.b.b;

public abstract class AbstractTrackEncryptionBox extends AbstractFullBox
{

    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    int defaultAlgorithmId;
    int defaultIvSize;
    byte default_KID[];

    protected AbstractTrackEncryptionBox(String s)
    {
        super(s);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AbstractTrackEncryptionBox.java", com/googlecode/mp4parser/boxes/AbstractTrackEncryptionBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 24);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "int", "defaultAlgorithmId", "", "void"), 28);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 32);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "int", "defaultIvSize", "", "void"), 36);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "java.util.UUID"), 40);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "java.util.UUID", "uuid", "", "void"), 46);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "equals", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "java.lang.Object", "o", "", "boolean"), 76);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 90);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        defaultAlgorithmId = IsoTypeReader.readUInt24(bytebuffer);
        defaultIvSize = IsoTypeReader.readUInt8(bytebuffer);
        default_KID = new byte[16];
        bytebuffer.get(default_KID);
    }

    public boolean equals(Object obj)
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AbstractTrackEncryptionBox)obj;
            if (defaultAlgorithmId != ((AbstractTrackEncryptionBox) (obj)).defaultAlgorithmId)
            {
                return false;
            }
            if (defaultIvSize != ((AbstractTrackEncryptionBox) (obj)).defaultIvSize)
            {
                return false;
            }
            if (!Arrays.equals(default_KID, ((AbstractTrackEncryptionBox) (obj)).default_KID))
            {
                return false;
            }
        }
        return true;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt24(bytebuffer, defaultAlgorithmId);
        IsoTypeWriter.writeUInt8(bytebuffer, defaultIvSize);
        bytebuffer.put(default_KID);
    }

    protected long getContentSize()
    {
        return 24L;
    }

    public int getDefaultAlgorithmId()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultAlgorithmId;
    }

    public int getDefaultIvSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultIvSize;
    }

    public UUID getDefault_KID()
    {
        Object obj = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = ByteBuffer.wrap(default_KID);
        ((ByteBuffer) (obj)).order(ByteOrder.BIG_ENDIAN);
        return new UUID(((ByteBuffer) (obj)).getLong(), ((ByteBuffer) (obj)).getLong());
    }

    public int hashCode()
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        int j = defaultAlgorithmId;
        int k = defaultIvSize;
        int i;
        if (default_KID != null)
        {
            i = Arrays.hashCode(default_KID);
        } else
        {
            i = 0;
        }
        return i + (j * 31 + k) * 31;
    }

    public void setDefaultAlgorithmId(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        defaultAlgorithmId = i;
    }

    public void setDefaultIvSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        defaultIvSize = i;
    }

    public void setDefault_KID(UUID uuid)
    {
        Object obj = b.a(ajc$tjp_5, this, this, uuid);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = ByteBuffer.wrap(new byte[16]);
        ((ByteBuffer) (obj)).putLong(uuid.getMostSignificantBits());
        ((ByteBuffer) (obj)).putLong(uuid.getLeastSignificantBits());
        default_KID = ((ByteBuffer) (obj)).array();
    }

    static 
    {
        ajc$preClinit();
    }
}
