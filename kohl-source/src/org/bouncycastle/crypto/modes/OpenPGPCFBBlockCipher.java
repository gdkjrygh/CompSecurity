// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;

public class OpenPGPCFBBlockCipher
    implements BlockCipher
{

    private byte FR[];
    private byte FRE[];
    private byte IV[];
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;

    public OpenPGPCFBBlockCipher(BlockCipher blockcipher)
    {
        cipher = blockcipher;
        blockSize = blockcipher.getBlockSize();
        IV = new byte[blockSize];
        FR = new byte[blockSize];
        FRE = new byte[blockSize];
    }

    private int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
        throws DataLengthException, IllegalStateException
    {
        int k;
        k = 2;
        if (blockSize + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (count <= blockSize) goto _L2; else goto _L1
_L1:
        byte byte0 = abyte0[i];
        FR[blockSize - 2] = byte0;
        abyte1[j] = encryptByte(byte0, blockSize - 2);
        byte0 = abyte0[i + 1];
        FR[blockSize - 1] = byte0;
        abyte1[j + 1] = encryptByte(byte0, blockSize - 1);
        cipher.processBlock(FR, 0, FRE, 0);
        for (; k < blockSize; k++)
        {
            byte byte1 = abyte0[i + k];
            FR[k - 2] = byte1;
            abyte1[j + k] = encryptByte(byte1, k - 2);
        }

          goto _L3
_L2:
        if (count != 0) goto _L5; else goto _L4
_L4:
        cipher.processBlock(FR, 0, FRE, 0);
        for (j = 0; j < blockSize; j++)
        {
            FR[j] = abyte0[i + j];
            abyte1[j] = encryptByte(abyte0[i + j], j);
        }

        count = count + blockSize;
_L3:
        return blockSize;
_L5:
        if (count == blockSize)
        {
            cipher.processBlock(FR, 0, FRE, 0);
            byte byte2 = abyte0[i];
            byte byte4 = abyte0[i + 1];
            abyte1[j] = encryptByte(byte2, 0);
            abyte1[j + 1] = encryptByte(byte4, 1);
            System.arraycopy(FR, 2, FR, 0, blockSize - 2);
            FR[blockSize - 2] = byte2;
            FR[blockSize - 1] = byte4;
            cipher.processBlock(FR, 0, FRE, 0);
            for (; k < blockSize; k++)
            {
                byte byte3 = abyte0[i + k];
                FR[k - 2] = byte3;
                abyte1[j + k] = encryptByte(byte3, k - 2);
            }

            count = count + blockSize;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
        throws DataLengthException, IllegalStateException
    {
        int k;
        k = 2;
        if (blockSize + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (count <= blockSize) goto _L2; else goto _L1
_L1:
        byte abyte2[] = FR;
        int l = blockSize;
        byte byte0 = encryptByte(abyte0[i], blockSize - 2);
        abyte1[j] = byte0;
        abyte2[l - 2] = byte0;
        abyte2 = FR;
        l = blockSize;
        byte0 = encryptByte(abyte0[i + 1], blockSize - 1);
        abyte1[j + 1] = byte0;
        abyte2[l - 1] = byte0;
        cipher.processBlock(FR, 0, FRE, 0);
        for (; k < blockSize; k++)
        {
            byte abyte3[] = FR;
            byte byte1 = encryptByte(abyte0[i + k], k - 2);
            abyte1[j + k] = byte1;
            abyte3[k - 2] = byte1;
        }

          goto _L3
_L2:
        if (count != 0) goto _L5; else goto _L4
_L4:
        cipher.processBlock(FR, 0, FRE, 0);
        for (k = 0; k < blockSize; k++)
        {
            byte abyte4[] = FR;
            byte byte2 = encryptByte(abyte0[i + k], k);
            abyte1[j + k] = byte2;
            abyte4[k] = byte2;
        }

        count = count + blockSize;
_L3:
        return blockSize;
_L5:
        if (count == blockSize)
        {
            cipher.processBlock(FR, 0, FRE, 0);
            abyte1[j] = encryptByte(abyte0[i], 0);
            abyte1[j + 1] = encryptByte(abyte0[i + 1], 1);
            System.arraycopy(FR, 2, FR, 0, blockSize - 2);
            System.arraycopy(abyte1, j, FR, blockSize - 2, 2);
            cipher.processBlock(FR, 0, FRE, 0);
            for (; k < blockSize; k++)
            {
                byte abyte5[] = FR;
                byte byte3 = encryptByte(abyte0[i + k], k - 2);
                abyte1[j + k] = byte3;
                abyte5[k - 2] = byte3;
            }

            count = count + blockSize;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    private byte encryptByte(byte byte0, int i)
    {
        return (byte)(FRE[i] ^ byte0);
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append("/OpenPGPCFB").toString();
    }

    public int getBlockSize()
    {
        return cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        forEncryption = flag;
        reset();
        cipher.init(true, cipherparameters);
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
        throws DataLengthException, IllegalStateException
    {
        if (forEncryption)
        {
            return encryptBlock(abyte0, i, abyte1, j);
        } else
        {
            return decryptBlock(abyte0, i, abyte1, j);
        }
    }

    public void reset()
    {
        count = 0;
        System.arraycopy(IV, 0, FR, 0, FR.length);
        cipher.reset();
    }
}
