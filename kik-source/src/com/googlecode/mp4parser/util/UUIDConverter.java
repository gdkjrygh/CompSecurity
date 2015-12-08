// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

public class UUIDConverter
{

    public UUIDConverter()
    {
    }

    public static UUID convert(byte abyte0[])
    {
        abyte0 = ByteBuffer.wrap(abyte0);
        abyte0.order(ByteOrder.BIG_ENDIAN);
        return new UUID(abyte0.getLong(), abyte0.getLong());
    }

    public static byte[] convert(UUID uuid)
    {
        int i;
        byte byte0;
        long l;
        long l1;
        byte0 = 8;
        l = uuid.getMostSignificantBits();
        l1 = uuid.getLeastSignificantBits();
        uuid = new byte[16];
        i = 0;
_L3:
        if (i < 8) goto _L2; else goto _L1
_L1:
        i = byte0;
_L4:
        if (i >= 16)
        {
            return uuid;
        }
        break MISSING_BLOCK_LABEL_58;
_L2:
        uuid[i] = (byte)(int)(l >>> (7 - i) * 8);
        i++;
          goto _L3
        uuid[i] = (byte)(int)(l1 >>> (7 - i) * 8);
        i++;
          goto _L4
    }
}
