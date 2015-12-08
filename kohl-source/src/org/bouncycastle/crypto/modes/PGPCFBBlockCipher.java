// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class PGPCFBBlockCipher
    implements BlockCipher
{

    private byte FR[];
    private byte FRE[];
    private byte IV[];
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;
    private boolean inlineIv;
    private byte tmp[];

    public PGPCFBBlockCipher(BlockCipher blockcipher, boolean flag)
    {
        cipher = blockcipher;
        inlineIv = flag;
        blockSize = blockcipher.getBlockSize();
        IV = new byte[blockSize];
        FR = new byte[blockSize];
        FRE = new byte[blockSize];
        tmp = new byte[blockSize];
    }

    private int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
        throws DataLengthException, IllegalStateException
    {
        boolean flag = false;
        if (blockSize + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        cipher.processBlock(FR, 0, FRE, 0);
        int k = 0;
        int l;
        do
        {
            l = ((flag) ? 1 : 0);
            if (k >= blockSize)
            {
                break;
            }
            abyte1[j + k] = encryptByte(abyte0[i + k], k);
            k++;
        } while (true);
        for (; l < blockSize; l++)
        {
            FR[l] = abyte0[i + l];
        }

        return blockSize;
    }

    private int decryptBlockWithIV(byte abyte0[], int i, byte abyte1[], int j)
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
        if (count == 0)
        {
            for (j = 0; j < blockSize; j++)
            {
                FR[j] = abyte0[i + j];
            }

            cipher.processBlock(FR, 0, FRE, 0);
            count = count + blockSize;
            return 0;
        }
        if (count == blockSize)
        {
            System.arraycopy(abyte0, i, tmp, 0, blockSize);
            System.arraycopy(FR, 2, FR, 0, blockSize - 2);
            FR[blockSize - 2] = tmp[0];
            FR[blockSize - 1] = tmp[1];
            cipher.processBlock(FR, 0, FRE, 0);
            for (i = 0; i < blockSize - 2; i++)
            {
                abyte1[j + i] = encryptByte(tmp[i + 2], i);
            }

            System.arraycopy(tmp, 2, FR, 0, blockSize - 2);
            count = count + 2;
            return blockSize - 2;
        }
        if (count >= blockSize + 2)
        {
            System.arraycopy(abyte0, i, tmp, 0, blockSize);
            abyte1[j + 0] = encryptByte(tmp[0], blockSize - 2);
            abyte1[j + 1] = encryptByte(tmp[1], blockSize - 1);
            System.arraycopy(tmp, 0, FR, blockSize - 2, 2);
            cipher.processBlock(FR, 0, FRE, 0);
            for (i = 0; i < blockSize - 2; i++)
            {
                abyte1[j + i + 2] = encryptByte(tmp[i + 2], i);
            }

            System.arraycopy(tmp, 2, FR, 0, blockSize - 2);
        }
        return blockSize;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
        throws DataLengthException, IllegalStateException
    {
        boolean flag = false;
        if (blockSize + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        cipher.processBlock(FR, 0, FRE, 0);
        int k = 0;
        int l;
        do
        {
            l = ((flag) ? 1 : 0);
            if (k >= blockSize)
            {
                break;
            }
            abyte1[j + k] = encryptByte(abyte0[i + k], k);
            k++;
        } while (true);
        for (; l < blockSize; l++)
        {
            FR[l] = abyte1[j + l];
        }

        return blockSize;
    }

    private int encryptBlockWithIV(byte abyte0[], int i, byte abyte1[], int j)
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
        if (count == 0)
        {
            cipher.processBlock(FR, 0, FRE, 0);
            for (int k = 0; k < blockSize; k++)
            {
                abyte1[j + k] = encryptByte(IV[k], k);
            }

            System.arraycopy(abyte1, j, FR, 0, blockSize);
            cipher.processBlock(FR, 0, FRE, 0);
            abyte1[blockSize + j] = encryptByte(IV[blockSize - 2], 0);
            abyte1[blockSize + j + 1] = encryptByte(IV[blockSize - 1], 1);
            System.arraycopy(abyte1, j + 2, FR, 0, blockSize);
            cipher.processBlock(FR, 0, FRE, 0);
            for (int l = 0; l < blockSize; l++)
            {
                abyte1[blockSize + j + 2 + l] = encryptByte(abyte0[i + l], l);
            }

            System.arraycopy(abyte1, blockSize + j + 2, FR, 0, blockSize);
            count = count + (blockSize * 2 + 2);
            return blockSize * 2 + 2;
        }
        if (count >= blockSize + 2)
        {
            cipher.processBlock(FR, 0, FRE, 0);
            for (int i1 = 0; i1 < blockSize; i1++)
            {
                abyte1[j + i1] = encryptByte(abyte0[i + i1], i1);
            }

            System.arraycopy(abyte1, j, FR, 0, blockSize);
        }
        return blockSize;
    }

    private byte encryptByte(byte byte0, int i)
    {
        return (byte)(FRE[i] ^ byte0);
    }

    public String getAlgorithmName()
    {
        if (inlineIv)
        {
            return (new StringBuilder()).append(cipher.getAlgorithmName()).append("/PGPCFBwithIV").toString();
        } else
        {
            return (new StringBuilder()).append(cipher.getAlgorithmName()).append("/PGPCFB").toString();
        }
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
        if (inlineIv)
        {
            if (forEncryption)
            {
                return encryptBlockWithIV(abyte0, i, abyte1, j);
            } else
            {
                return decryptBlockWithIV(abyte0, i, abyte1, j);
            }
        }
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
        int i = 0;
        while (i != FR.length) 
        {
            if (inlineIv)
            {
                FR[i] = 0;
            } else
            {
                FR[i] = IV[i];
            }
            i++;
        }
        cipher.reset();
    }
}
