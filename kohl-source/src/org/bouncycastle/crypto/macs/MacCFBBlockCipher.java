// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

class MacCFBBlockCipher
{

    private byte IV[];
    private int blockSize;
    private byte cfbOutV[];
    private byte cfbV[];
    private BlockCipher cipher;

    public MacCFBBlockCipher(BlockCipher blockcipher, int i)
    {
        cipher = null;
        cipher = blockcipher;
        blockSize = i / 8;
        IV = new byte[blockcipher.getBlockSize()];
        cfbV = new byte[blockcipher.getBlockSize()];
        cfbOutV = new byte[blockcipher.getBlockSize()];
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append("/CFB").append(blockSize * 8).toString();
    }

    public int getBlockSize()
    {
        return blockSize;
    }

    void getMacBlock(byte abyte0[])
    {
        cipher.processBlock(cfbV, 0, abyte0, 0);
    }

    public void init(CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.getIV();
            if (abyte0.length < IV.length)
            {
                System.arraycopy(abyte0, 0, IV, IV.length - abyte0.length, abyte0.length);
            } else
            {
                System.arraycopy(abyte0, 0, IV, 0, IV.length);
            }
            reset();
            cipher.init(true, cipherparameters.getParameters());
            return;
        } else
        {
            reset();
            cipher.init(true, cipherparameters);
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
        throws DataLengthException, IllegalStateException
    {
        if (blockSize + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        cipher.processBlock(cfbV, 0, cfbOutV, 0);
        for (int k = 0; k < blockSize; k++)
        {
            abyte1[j + k] = (byte)(cfbOutV[k] ^ abyte0[i + k]);
        }

        System.arraycopy(cfbV, blockSize, cfbV, 0, cfbV.length - blockSize);
        System.arraycopy(abyte1, j, cfbV, cfbV.length - blockSize, blockSize);
        return blockSize;
    }

    public void reset()
    {
        System.arraycopy(IV, 0, cfbV, 0, IV.length);
        cipher.reset();
    }
}
