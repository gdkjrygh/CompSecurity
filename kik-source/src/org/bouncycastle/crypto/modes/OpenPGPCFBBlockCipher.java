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

    private byte a[];
    private byte b[];
    private byte c[];
    private BlockCipher d;
    private int e;
    private int f;
    private boolean g;

    public OpenPGPCFBBlockCipher(BlockCipher blockcipher)
    {
        d = blockcipher;
        f = blockcipher.getBlockSize();
        a = new byte[f];
        b = new byte[f];
        c = new byte[f];
    }

    private int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k;
        k = 2;
        if (f + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (f + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (e <= f) goto _L2; else goto _L1
_L1:
        byte byte0 = abyte0[i];
        b[f - 2] = byte0;
        abyte1[j] = encryptByte(byte0, f - 2);
        byte0 = abyte0[i + 1];
        b[f - 1] = byte0;
        abyte1[j + 1] = encryptByte(byte0, f - 1);
        d.processBlock(b, 0, c, 0);
        for (; k < f; k++)
        {
            byte byte1 = abyte0[i + k];
            b[k - 2] = byte1;
            abyte1[j + k] = encryptByte(byte1, k - 2);
        }

          goto _L3
_L2:
        if (e != 0) goto _L5; else goto _L4
_L4:
        d.processBlock(b, 0, c, 0);
        for (j = 0; j < f; j++)
        {
            b[j] = abyte0[i + j];
            abyte1[j] = encryptByte(abyte0[i + j], j);
        }

        e = e + f;
_L3:
        return f;
_L5:
        if (e == f)
        {
            d.processBlock(b, 0, c, 0);
            byte byte2 = abyte0[i];
            byte byte4 = abyte0[i + 1];
            abyte1[j] = encryptByte(byte2, 0);
            abyte1[j + 1] = encryptByte(byte4, 1);
            System.arraycopy(b, 2, b, 0, f - 2);
            b[f - 2] = byte2;
            b[f - 1] = byte4;
            d.processBlock(b, 0, c, 0);
            for (; k < f; k++)
            {
                byte byte3 = abyte0[i + k];
                b[k - 2] = byte3;
                abyte1[j + k] = encryptByte(byte3, k - 2);
            }

            e = e + f;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k;
        k = 2;
        if (f + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (f + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (e <= f) goto _L2; else goto _L1
_L1:
        byte abyte2[] = b;
        int l = f;
        byte byte0 = encryptByte(abyte0[i], f - 2);
        abyte1[j] = byte0;
        abyte2[l - 2] = byte0;
        abyte2 = b;
        l = f;
        byte0 = encryptByte(abyte0[i + 1], f - 1);
        abyte1[j + 1] = byte0;
        abyte2[l - 1] = byte0;
        d.processBlock(b, 0, c, 0);
        for (; k < f; k++)
        {
            byte abyte3[] = b;
            byte byte1 = encryptByte(abyte0[i + k], k - 2);
            abyte1[j + k] = byte1;
            abyte3[k - 2] = byte1;
        }

          goto _L3
_L2:
        if (e != 0) goto _L5; else goto _L4
_L4:
        d.processBlock(b, 0, c, 0);
        for (k = 0; k < f; k++)
        {
            byte abyte4[] = b;
            byte byte2 = encryptByte(abyte0[i + k], k);
            abyte1[j + k] = byte2;
            abyte4[k] = byte2;
        }

        e = e + f;
_L3:
        return f;
_L5:
        if (e == f)
        {
            d.processBlock(b, 0, c, 0);
            abyte1[j] = encryptByte(abyte0[i], 0);
            abyte1[j + 1] = encryptByte(abyte0[i + 1], 1);
            System.arraycopy(b, 2, b, 0, f - 2);
            System.arraycopy(abyte1, j, b, f - 2, 2);
            d.processBlock(b, 0, c, 0);
            for (; k < f; k++)
            {
                byte abyte5[] = b;
                byte byte3 = encryptByte(abyte0[i + k], k - 2);
                abyte1[j + k] = byte3;
                abyte5[k - 2] = byte3;
            }

            e = e + f;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    private byte encryptByte(byte byte0, int i)
    {
        return (byte)(c[i] ^ byte0);
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(d.getAlgorithmName()).append("/OpenPGPCFB").toString();
    }

    public int getBlockSize()
    {
        return d.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher()
    {
        return d;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        g = flag;
        reset();
        d.init(true, cipherparameters);
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (g)
        {
            return encryptBlock(abyte0, i, abyte1, j);
        } else
        {
            return decryptBlock(abyte0, i, abyte1, j);
        }
    }

    public void reset()
    {
        e = 0;
        System.arraycopy(a, 0, b, 0, b.length);
        d.reset();
    }
}
