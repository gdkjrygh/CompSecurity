// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            InvalidCipherTextException, AsymmetricBlockCipher, DataLengthException, CipherParameters

public class BufferedAsymmetricBlockCipher
{

    protected byte buf[];
    protected int bufOff;
    private final AsymmetricBlockCipher cipher;

    public BufferedAsymmetricBlockCipher(AsymmetricBlockCipher asymmetricblockcipher)
    {
        cipher = asymmetricblockcipher;
    }

    public byte[] doFinal()
        throws InvalidCipherTextException
    {
        byte abyte0[] = cipher.processBlock(buf, 0, bufOff);
        reset();
        return abyte0;
    }

    public int getBufferPosition()
    {
        return bufOff;
    }

    public int getInputBlockSize()
    {
        return cipher.getInputBlockSize();
    }

    public int getOutputBlockSize()
    {
        return cipher.getOutputBlockSize();
    }

    public AsymmetricBlockCipher getUnderlyingCipher()
    {
        return cipher;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        reset();
        cipher.init(flag, cipherparameters);
        int j = cipher.getInputBlockSize();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        buf = new byte[i + j];
        bufOff = 0;
    }

    public void processByte(byte byte0)
    {
        if (bufOff >= buf.length)
        {
            throw new DataLengthException("attempt to process message too long for cipher");
        } else
        {
            byte abyte0[] = buf;
            int i = bufOff;
            bufOff = i + 1;
            abyte0[i] = byte0;
            return;
        }
    }

    public void processBytes(byte abyte0[], int i, int j)
    {
        if (j == 0)
        {
            return;
        }
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        if (bufOff + j > buf.length)
        {
            throw new DataLengthException("attempt to process message too long for cipher");
        } else
        {
            System.arraycopy(abyte0, i, buf, bufOff, j);
            bufOff = bufOff + j;
            return;
        }
    }

    public void reset()
    {
        if (buf != null)
        {
            for (int i = 0; i < buf.length; i++)
            {
                buf[i] = 0;
            }

        }
        bufOff = 0;
    }
}
