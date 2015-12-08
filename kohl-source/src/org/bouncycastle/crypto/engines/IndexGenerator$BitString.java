// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.engines:
//            IndexGenerator

public static class bytes
{

    byte bytes[];
    int lastByteBits;
    int numBytes;

    public void appendBits(byte byte0)
    {
        if (numBytes == bytes.length)
        {
            bytes = IndexGenerator.access$000(bytes, bytes.length * 2);
        }
        if (numBytes == 0)
        {
            numBytes = 1;
            bytes[0] = byte0;
            lastByteBits = 8;
            return;
        }
        if (lastByteBits == 8)
        {
            byte abyte0[] = bytes;
            int i = numBytes;
            numBytes = i + 1;
            abyte0[i] = byte0;
            return;
        } else
        {
            int j = lastByteBits;
            byte abyte1[] = bytes;
            int k = numBytes - 1;
            abyte1[k] = (byte)(abyte1[k] | (byte0 & 0xff) << lastByteBits);
            abyte1 = bytes;
            k = numBytes;
            numBytes = k + 1;
            abyte1[k] = (byte)((byte0 & 0xff) >> 8 - j);
            return;
        }
    }

    void appendBits(byte abyte0[])
    {
        for (int i = 0; i != abyte0.length; i++)
        {
            appendBits(abyte0[i]);
        }

    }

    public byte[] getBytes()
    {
        return Arrays.clone(bytes);
    }

    public int getLeadingAsInt(int i)
    {
        int j = ((numBytes - 1) * 8 + lastByteBits) - i;
        i = j / 8;
        j %= 8;
        int k = (bytes[i] & 0xff) >>> j;
        j = 8 - j;
        for (i++; i < numBytes; i++)
        {
            k |= (bytes[i] & 0xff) << j;
            j += 8;
        }

        return k;
    }

    public bytes getTrailing(int i)
    {
        bytes bytes1 = new <init>();
        bytes1.numBytes = (i + 7) / 8;
        bytes1.bytes = new byte[bytes1.numBytes];
        for (int j = 0; j < bytes1.numBytes; j++)
        {
            bytes1.bytes[j] = bytes[j];
        }

        bytes1.lastByteBits = i % 8;
        if (bytes1.lastByteBits == 0)
        {
            bytes1.lastByteBits = 8;
            return bytes1;
        } else
        {
            i = 32 - bytes1.lastByteBits;
            bytes1.bytes[bytes1.numBytes - 1] = (byte)((bytes1.bytes[bytes1.numBytes - 1] << i) >>> i);
            return bytes1;
        }
    }

    public ()
    {
        bytes = new byte[4];
    }
}
