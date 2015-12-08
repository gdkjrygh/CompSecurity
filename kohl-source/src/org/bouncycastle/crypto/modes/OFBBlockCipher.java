// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class OFBBlockCipher
    implements BlockCipher
{

    private byte IV[];
    private final int blockSize;
    private final BlockCipher cipher;
    private byte ofbOutV[];
    private byte ofbV[];

    public OFBBlockCipher(BlockCipher blockcipher, int i)
    {
        cipher = blockcipher;
        blockSize = i / 8;
        IV = new byte[blockcipher.getBlockSize()];
        ofbV = new byte[blockcipher.getBlockSize()];
        ofbOutV = new byte[blockcipher.getBlockSize()];
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append("/OFB").append(blockSize * 8).toString();
    }

    public int getBlockSize()
    {
        return blockSize;
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.getIV();
            if (abyte0.length < IV.length)
            {
                System.arraycopy(abyte0, 0, IV, IV.length - abyte0.length, abyte0.length);
                for (int i = 0; i < IV.length - abyte0.length; i++)
                {
                    IV[i] = 0;
                }

            } else
            {
                System.arraycopy(abyte0, 0, IV, 0, IV.length);
            }
            reset();
            if (cipherparameters.getParameters() != null)
            {
                cipher.init(true, cipherparameters.getParameters());
            }
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
        cipher.processBlock(ofbV, 0, ofbOutV, 0);
        for (int k = 0; k < blockSize; k++)
        {
            abyte1[j + k] = (byte)(ofbOutV[k] ^ abyte0[i + k]);
        }

        System.arraycopy(ofbV, blockSize, ofbV, 0, ofbV.length - blockSize);
        System.arraycopy(ofbOutV, 0, ofbV, ofbV.length - blockSize, blockSize);
        return blockSize;
    }

    public void reset()
    {
        System.arraycopy(IV, 0, ofbV, 0, IV.length);
        cipher.reset();
    }
}
