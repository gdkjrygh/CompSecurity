// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            AsymmetricBlockCipher, DataLengthException, CipherParameters

public class BufferedAsymmetricBlockCipher
{

    protected byte a[];
    protected int b;
    private final AsymmetricBlockCipher c;

    public BufferedAsymmetricBlockCipher(AsymmetricBlockCipher asymmetricblockcipher)
    {
        c = asymmetricblockcipher;
    }

    public byte[] doFinal()
    {
        byte abyte0[] = c.processBlock(a, 0, b);
        reset();
        return abyte0;
    }

    public int getBufferPosition()
    {
        return b;
    }

    public int getInputBlockSize()
    {
        return c.getInputBlockSize();
    }

    public int getOutputBlockSize()
    {
        return c.getOutputBlockSize();
    }

    public AsymmetricBlockCipher getUnderlyingCipher()
    {
        return c;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        reset();
        c.init(flag, cipherparameters);
        int j = c.getInputBlockSize();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a = new byte[i + j];
        b = 0;
    }

    public void processByte(byte byte0)
    {
        if (b >= a.length)
        {
            throw new DataLengthException("attempt to process message too long for cipher");
        } else
        {
            byte abyte0[] = a;
            int i = b;
            b = i + 1;
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
        if (b + j > a.length)
        {
            throw new DataLengthException("attempt to process message too long for cipher");
        } else
        {
            System.arraycopy(abyte0, i, a, b, j);
            b = b + j;
            return;
        }
    }

    public void reset()
    {
        if (a != null)
        {
            for (int i = 0; i < a.length; i++)
            {
                a[i] = 0;
            }

        }
        b = 0;
    }
}
