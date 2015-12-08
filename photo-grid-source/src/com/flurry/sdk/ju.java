// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.zip.CRC32;

public class ju extends MessageDigest
{

    private CRC32 a;

    public ju()
    {
        super("CRC");
        a = new CRC32();
    }

    public byte[] a()
    {
        return engineDigest();
    }

    public int b()
    {
        return ByteBuffer.wrap(engineDigest()).getInt();
    }

    protected byte[] engineDigest()
    {
        long l = a.getValue();
        return (new byte[] {
            (byte)(int)((0xffffffffff000000L & l) >> 24), (byte)(int)((0xff0000L & l) >> 16), (byte)(int)((65280L & l) >> 8), (byte)(int)((l & 255L) >> 0)
        });
    }

    protected void engineReset()
    {
        a.reset();
    }

    protected void engineUpdate(byte byte0)
    {
        a.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
    }
}
