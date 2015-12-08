// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.UUIDConverter;
import java.nio.ByteBuffer;
import java.util.UUID;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            GroupEntry

public class CencSampleEncryptionInformationGroupEntry extends GroupEntry
{

    public static final String TYPE = "seig";
    private boolean isEncrypted;
    private byte ivSize;
    private UUID kid;

    public CencSampleEncryptionInformationGroupEntry()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CencSampleEncryptionInformationGroupEntry)obj;
            if (isEncrypted != ((CencSampleEncryptionInformationGroupEntry) (obj)).isEncrypted)
            {
                return false;
            }
            if (ivSize != ((CencSampleEncryptionInformationGroupEntry) (obj)).ivSize)
            {
                return false;
            }
            if (kid == null ? ((CencSampleEncryptionInformationGroupEntry) (obj)).kid != null : !kid.equals(((CencSampleEncryptionInformationGroupEntry) (obj)).kid))
            {
                return false;
            }
        }
        return true;
    }

    public ByteBuffer get()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(20);
        int i;
        if (isEncrypted)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        IsoTypeWriter.writeUInt24(bytebuffer, i);
        if (isEncrypted)
        {
            IsoTypeWriter.writeUInt8(bytebuffer, ivSize);
            bytebuffer.put(UUIDConverter.convert(kid));
        } else
        {
            bytebuffer.put(new byte[17]);
        }
        bytebuffer.rewind();
        return bytebuffer;
    }

    public byte getIvSize()
    {
        return ivSize;
    }

    public UUID getKid()
    {
        return kid;
    }

    public String getType()
    {
        return "seig";
    }

    public int hashCode()
    {
        byte byte0;
        int i;
        byte byte1;
        if (isEncrypted)
        {
            byte0 = 7;
        } else
        {
            byte0 = 19;
        }
        byte1 = ivSize;
        if (kid != null)
        {
            i = kid.hashCode();
        } else
        {
            i = 0;
        }
        return i + (byte0 * 31 + byte1) * 31;
    }

    public boolean isEncrypted()
    {
        return isEncrypted;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        boolean flag = true;
        byte abyte0[];
        if (IsoTypeReader.readUInt24(bytebuffer) != 1)
        {
            flag = false;
        }
        isEncrypted = flag;
        ivSize = (byte)IsoTypeReader.readUInt8(bytebuffer);
        abyte0 = new byte[16];
        bytebuffer.get(abyte0);
        kid = UUIDConverter.convert(abyte0);
    }

    public void setEncrypted(boolean flag)
    {
        isEncrypted = flag;
    }

    public void setIvSize(int i)
    {
        ivSize = (byte)i;
    }

    public void setKid(UUID uuid)
    {
        kid = uuid;
    }

    public String toString()
    {
        return (new StringBuilder("CencSampleEncryptionInformationGroupEntry{isEncrypted=")).append(isEncrypted).append(", ivSize=").append(ivSize).append(", kid=").append(kid).append('}').toString();
    }
}
