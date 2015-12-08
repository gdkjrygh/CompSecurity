// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class CFBBlockCipher
    implements BlockCipher
{

    private byte a[];
    private byte b[];
    private byte c[];
    private int d;
    private BlockCipher e;
    private boolean f;

    public CFBBlockCipher(BlockCipher blockcipher, int i)
    {
        e = null;
        e = blockcipher;
        d = i / 8;
        a = new byte[blockcipher.getBlockSize()];
        b = new byte[blockcipher.getBlockSize()];
        c = new byte[blockcipher.getBlockSize()];
    }

    public int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = 0;
        if (d + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (d + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        e.processBlock(b, 0, c, 0);
        System.arraycopy(b, d, b, 0, b.length - d);
        System.arraycopy(abyte0, i, b, b.length - d, d);
        for (; k < d; k++)
        {
            abyte1[j + k] = (byte)(c[k] ^ abyte0[i + k]);
        }

        return d;
    }

    public int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (d + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (d + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        e.processBlock(b, 0, c, 0);
        for (int k = 0; k < d; k++)
        {
            abyte1[j + k] = (byte)(c[k] ^ abyte0[i + k]);
        }

        System.arraycopy(b, d, b, 0, b.length - d);
        System.arraycopy(abyte1, j, b, b.length - d, d);
        return d;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(e.getAlgorithmName()).append("/CFB").append(d * 8).toString();
    }

    public int getBlockSize()
    {
        return d;
    }

    public BlockCipher getUnderlyingCipher()
    {
        return e;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        f = flag;
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.getIV();
            if (abyte0.length < a.length)
            {
                System.arraycopy(abyte0, 0, a, a.length - abyte0.length, abyte0.length);
                for (int i = 0; i < a.length - abyte0.length; i++)
                {
                    a[i] = 0;
                }

            } else
            {
                System.arraycopy(abyte0, 0, a, 0, a.length);
            }
            reset();
            e.init(true, cipherparameters.getParameters());
            return;
        } else
        {
            reset();
            e.init(true, cipherparameters);
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (f)
        {
            return encryptBlock(abyte0, i, abyte1, j);
        } else
        {
            return decryptBlock(abyte0, i, abyte1, j);
        }
    }

    public void reset()
    {
        System.arraycopy(a, 0, b, 0, a.length);
        e.reset();
    }
}
