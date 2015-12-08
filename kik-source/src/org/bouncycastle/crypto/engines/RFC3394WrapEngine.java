// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

public class RFC3394WrapEngine
    implements Wrapper
{

    private BlockCipher a;
    private KeyParameter b;
    private boolean c;
    private byte d[] = {
        -90, -90, -90, -90, -90, -90, -90, -90
    };

    public RFC3394WrapEngine(BlockCipher blockcipher)
    {
        a = blockcipher;
    }

    public String getAlgorithmName()
    {
        return a.getAlgorithmName();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        c = flag;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = ((ParametersWithRandom)cipherparameters).getParameters();
        }
        if (cipherparameters instanceof KeyParameter)
        {
            b = (KeyParameter)cipherparameters;
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            d = ((ParametersWithIV)cipherparameters).getIV();
            b = (KeyParameter)((ParametersWithIV)cipherparameters).getParameters();
            if (d.length != 8)
            {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    public byte[] unwrap(byte abyte0[], int i, int j)
    {
        if (c)
        {
            throw new IllegalStateException("not set for unwrapping");
        }
        i = j / 8;
        if (i * 8 != j)
        {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        byte abyte1[] = new byte[j - d.length];
        byte abyte2[] = new byte[d.length];
        byte abyte3[] = new byte[d.length + 8];
        System.arraycopy(abyte0, 0, abyte2, 0, d.length);
        System.arraycopy(abyte0, d.length, abyte1, 0, j - d.length);
        a.init(false, b);
        int i1 = i - 1;
        for (i = 5; i >= 0; i--)
        {
            for (j = i1; j > 0; j--)
            {
                System.arraycopy(abyte2, 0, abyte3, 0, d.length);
                System.arraycopy(abyte1, (j - 1) * 8, abyte3, d.length, 8);
                int l = i1 * i + j;
                for (int k = 1; l != 0; k++)
                {
                    byte byte0 = (byte)l;
                    int j1 = d.length - k;
                    abyte3[j1] = (byte)(byte0 ^ abyte3[j1]);
                    l >>>= 8;
                }

                a.processBlock(abyte3, 0, abyte3, 0);
                System.arraycopy(abyte3, 0, abyte2, 0, 8);
                System.arraycopy(abyte3, 8, abyte1, (j - 1) * 8, 8);
            }

        }

        if (!Arrays.b(abyte2, d))
        {
            throw new InvalidCipherTextException("checksum failed");
        } else
        {
            return abyte1;
        }
    }

    public byte[] wrap(byte abyte0[], int i, int j)
    {
        if (!c)
        {
            throw new IllegalStateException("not set for wrapping");
        }
        int i1 = j / 8;
        if (i1 * 8 != j)
        {
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        byte abyte1[] = new byte[d.length + j];
        byte abyte2[] = new byte[d.length + 8];
        System.arraycopy(d, 0, abyte1, 0, d.length);
        System.arraycopy(abyte0, 0, abyte1, d.length, j);
        a.init(true, b);
        for (i = 0; i != 6; i++)
        {
            for (j = 1; j <= i1; j++)
            {
                System.arraycopy(abyte1, 0, abyte2, 0, d.length);
                System.arraycopy(abyte1, j * 8, abyte2, d.length, 8);
                a.processBlock(abyte2, 0, abyte2, 0);
                int l = i1 * i + j;
                for (int k = 1; l != 0; k++)
                {
                    byte byte0 = (byte)l;
                    int j1 = d.length - k;
                    abyte2[j1] = (byte)(byte0 ^ abyte2[j1]);
                    l >>>= 8;
                }

                System.arraycopy(abyte2, 0, abyte1, 0, 8);
                System.arraycopy(abyte2, 8, abyte1, j * 8, 8);
            }

        }

        return abyte1;
    }
}
