// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            StreamCipher, BlockCipher, DataLengthException, CipherParameters

public class StreamBlockCipher
    implements StreamCipher
{

    private BlockCipher cipher;
    private byte oneByte[];

    public StreamBlockCipher(BlockCipher blockcipher)
    {
        oneByte = new byte[1];
        if (blockcipher.getBlockSize() != 1)
        {
            throw new IllegalArgumentException("block cipher block size != 1.");
        } else
        {
            cipher = blockcipher;
            return;
        }
    }

    public String getAlgorithmName()
    {
        return cipher.getAlgorithmName();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        cipher.init(flag, cipherparameters);
    }

    public void processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws DataLengthException
    {
        if (k + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too small in processBytes()");
        }
        for (int l = 0; l != j; l++)
        {
            cipher.processBlock(abyte0, i + l, abyte1, k + l);
        }

    }

    public void reset()
    {
        cipher.reset();
    }

    public byte returnByte(byte byte0)
    {
        oneByte[0] = byte0;
        cipher.processBlock(oneByte, 0, oneByte, 0);
        return oneByte[0];
    }
}
